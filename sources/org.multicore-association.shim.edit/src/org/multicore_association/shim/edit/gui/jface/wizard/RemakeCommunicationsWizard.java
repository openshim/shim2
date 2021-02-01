/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.IPageChangeProvider;
import org.eclipse.jface.dialogs.IPageChangedListener;
import org.eclipse.jface.dialogs.PageChangedEvent;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.wizard.IWizardContainer;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.gui.jface.ShimEditorPart;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesStore;
import org.multicore_association.shim.model.shim.AbstractCommunication;
import org.multicore_association.shim.model.shim.CommunicationSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.Connection;
import org.multicore_association.shim.model.shim.ConnectionSet;
import org.multicore_association.shim.model.shim.EventCommunication;
import org.multicore_association.shim.model.shim.FIFOCommunication;
import org.multicore_association.shim.model.shim.InterruptCommunication;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.SharedMemoryCommunication;
import org.multicore_association.shim.model.shim.SharedRegisterCommunication;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * A wizard to generate CommunicationSet again.
 */
public class RemakeCommunicationsWizard extends Wizard {

	private static final Logger log = ShimLoggerUtil
			.getLogger(RemakeCommunicationsWizard.class);

	private CommunicationSetWizardPage communicationSetWz = null;

	private ShimEditorPart part;
	private Shim shim;

	private ShimWrappedPreferences preferences;

	public ComponentSet rootComponent = null;

	private Object previousSelectedPage;

	private int x = CommonConstants.WIZARD_DEFAULT_X;
	private int y = CommonConstants.WIZARD_DEFAULT_Y;

	/**
	 * Constructs a new instance of RemakeCommunicationsWizard.
	 */
	public RemakeCommunicationsWizard(ShimEditorPart part) {
		setWindowTitle("Re-Make CommunicationSet Wizard");

		this.part = part;
		this.shim = part.getInput();

		preferences = ShimWrappedPreferences.getNewCopyInstance();

		log.info(getWindowTitle() + " open");
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {
		communicationSetWz = new CommunicationSetWizardPage(shim, preferences, true);
		addPage(communicationSetWz);
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#createPageControls(org.eclipse.swt.widgets.Composite)
	 */
	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);
		getShell().setBounds(x, y, CommonConstants.WIZARD_WIDTH,
				CommonConstants.WIZARD_HEIGHT);
	}

	/**
	 * Sets the receiver's location to the rectangular area specified by the
	 * arguments.
	 * 
	 * @param x
	 *            the x coordinate of the rectangle
	 * @param y
	 *            the y coordinate of the rectangle
	 */
	public void setLayout(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performFinish()
	 */
	@Override
	public boolean performFinish() {

		final SystemConfiguration sys = shim.getSystemConfiguration();
		final ShimWrappedPreferences preferences = ShimWrappedPreferences
				.getCurrentInstance();
		log.info(ShimWrappedPreferences.createDumpStr(preferences, true));

		try {
			ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(
					getShell());
			progressDialog.run(false, false, new IRunnableWithProgress() {
				/**
				 * @see org.eclipse.jface.operation.IRunnableWithProgress#run(org.eclipse.core.runtime.IProgressMonitor)
				 */
				@Override
				public void run(IProgressMonitor monitor)
						throws InvocationTargetException, InterruptedException {
					remakeShimXml(sys, communicationSetWz.getData(), monitor);
				}

			});
		} catch (InvocationTargetException | InterruptedException e) {
			log.log(Level.SEVERE, "Create New SHIM XML Error.", e);
		}

		// Saves preferences.
		SavePolicyPreferences wizParameter = preferences
				.getSavePolicyPreferences();
		boolean requestToSave = false;
		if (wizParameter.getSavePolicy() == SavePolicyType.ON_REQUEST) {
			MessageBox request = new MessageBox(Display.getCurrent()
					.getActiveShell(), SWT.OK | SWT.CANCEL);
			request.setMessage("Save preferences you input in the wizard.");
			int result = request.open();
			requestToSave = (result == SWT.OK);
		}
		if (requestToSave || wizParameter.getSavePolicy() == SavePolicyType.ALWAYS) {
			ShimPreferencesStore store = ShimPreferencesStore.getInstance();
			store.setAccessTypePreferences(preferences
					.getAccessTypePreferences());
			store.setAddressSpacePreferences(preferences
					.getAddressSpacePreferences());
			store.setCacheDataPreferences(preferences.getCacheDataPreferences());
			store.setCommunicationSetPreferences(preferences
					.getCommunicationSetPreferences());

			store.setComponentsPreferences(preferences
					.getComponentsPreferences());
			store.setMasterComponentPreferences(preferences
					.getMasterComponentPreferences());
			store.setSlaveComponentPreferences(preferences
					.getSlaveComponentPreferences());
			store.setComponentSetPreferences(preferences
					.getComponentSetPreferences());

			store.save();
		}

		return true;
	}

	private void remakeShimXml(SystemConfiguration sys,
			CommunicationSetWizardPageData data, IProgressMonitor monitor) {

		// ----------------------------------------------------------------
		// CommunicationSet
		CommunicationSet communicationSet = remakeCommunicationSet(sys,
				data, monitor);
		remakeConnectionPerformances(sys, communicationSet, monitor);

		part.setInput(shim);
		part.changeInputPanel(sys.getCommunicationSet());
	}

	/**
	 * Re-Makes CommunicationSets by according to inputed parameters.
	 * 
	 * @param sys
	 *            the current SystemConfiguration
	 * @param preferences
	 *            the current ShimPreferences
	 * @param monitor
	 *            the progress monitor
	 * @return the new Communications
	 */
	private CommunicationSet remakeCommunicationSet(SystemConfiguration sys,
			CommunicationSetWizardPageData data, IProgressMonitor monitor) {

		CommunicationSetPreferences communicationSetPreferences = data.getCommunicationSetPreferences();

		int taskNum = 1;
		if (communicationSetPreferences.isCheckEventCommunication()) {
			taskNum++;
		}
		if (communicationSetPreferences.isCheckFIFOCommunication()) {
			taskNum++;
		}
		if (communicationSetPreferences.isCheckInterruptCommunication()) {
			taskNum++;
		}
		if (communicationSetPreferences.isCheckSharedMemoryCommunication()) {
			taskNum++;
		}
		if (communicationSetPreferences.isCheckSharedRegisterCommunication()) {
			taskNum++;
		}
		monitor.beginTask("Re-Makes the base Communications.", taskNum);

		CommunicationSet communicationSet = sys.getCommunicationSet();

		log.finest("#####CommunicationSet(5th) Completed!!");

		boolean dontConnectCon = communicationSetPreferences.isDontConnect();

		List<MasterComponent> mlist = ShimModelManager
				.makeMasterComponentList(sys);
		int masterComponentCount = mlist.size();

		communicationSet = ShimFactory.eINSTANCE.createCommunicationSet();
		sys.setCommunicationSet(communicationSet);

		if (communicationSetPreferences.isCheckEventCommunication()) {
			log.finest("Event Communication- no attribute ------------------");
			EventCommunication eventCom = ShimFactory.eINSTANCE.createEventCommunication();
			eventCom.setName("Event_00");

			if (masterComponentCount > 1) {
				// ---------Common Procedure --------
				ConnectionSet conset = ShimModelManager
						.createDefaultConnectionList(shim, dontConnectCon);
				eventCom.setConnectionSet(conset);
			}

			communicationSet.getEventCommunication().clear();
			communicationSet.getEventCommunication().add(eventCom);

			monitor.worked(1);
		}
		if (communicationSetPreferences.isCheckFIFOCommunication()) {
			log.finest("FIFO Communication  2 attribute ------------------------");
			FIFOCommunication fifoCom = ShimFactory.eINSTANCE.createFIFOCommunication();
			fifoCom.setName("fifo_00");
			fifoCom.setDataSize(communicationSetPreferences.getFifoDataSize());
			fifoCom.setDataSizeUnit(communicationSetPreferences.getFifoDataSizeUnit());

			fifoCom.setQueueSize(communicationSetPreferences.getQueueSize());

			if (masterComponentCount > 1) {
				// ---------Common Procedure --------
				ConnectionSet conset = ShimModelManager
						.createDefaultConnectionList(shim, dontConnectCon);
				fifoCom.setConnectionSet(conset);
			}

			communicationSet.getFIFOCommunication().clear();
			communicationSet.getFIFOCommunication().add(fifoCom);

			monitor.worked(1);
		}

		if (communicationSetPreferences.isCheckInterruptCommunication()) {
			log.finest("Interrupt Communication  1 attribute ----------------------------");

			log.finest(">btn_Interrupt Selected");
			InterruptCommunication intrCom = ShimFactory.eINSTANCE.createInterruptCommunication();

			intrCom.setName("Interrupt_00");

			if (masterComponentCount > 1) {
				// ---------Common Procedure --------
				ConnectionSet conset = ShimModelManager
						.createDefaultConnectionList(shim, dontConnectCon);
				intrCom.setConnectionSet(conset);
			}

			communicationSet.getInterruptCommunication().clear();
			communicationSet.getInterruptCommunication().add(intrCom);

			monitor.worked(1);
		}

		if (communicationSetPreferences.isCheckSharedMemoryCommunication()) {
			log.finest("Shared Memory  Communication 3 attribute ---------------------------------");
			SharedMemoryCommunication shmemCom = ShimFactory.eINSTANCE.createSharedMemoryCommunication();
			shmemCom.setName("shmem_00");

			shmemCom.setDataSize(communicationSetPreferences.getSharedMemoryDataSize());
			shmemCom.setDataSizeUnit(communicationSetPreferences.getSharedMemoryDataSizeUnit());

			shmemCom.setAddressSpaceRef(communicationSetWz.getAddressSpace());
			shmemCom.setSubSpaceRef(communicationSetWz.getSubSpace());

			if (masterComponentCount > 1) {
				// ---------Common Procedure --------
				ConnectionSet conset = ShimModelManager
						.createDefaultConnectionList(shim, dontConnectCon);
				shmemCom.setConnectionSet(conset);
			}

			shmemCom.setOperationType(communicationSetPreferences.getOperationType());

			communicationSet.getSharedMemoryCommunication().clear();
			communicationSet.getSharedMemoryCommunication().add(shmemCom);

			monitor.worked(1);
		}

		if (communicationSetPreferences.isCheckSharedRegisterCommunication()) {
			log.finest("SharedRegister Communication 3 attribute------------------------------------");

			SharedRegisterCommunication sregCom = ShimFactory.eINSTANCE.createSharedRegisterCommunication();
			sregCom.setName("sreg_00");

			sregCom.setDataSize(communicationSetPreferences.getSharedRegisterDataSize());
			sregCom.setDataSizeUnit(communicationSetPreferences.getSharedRegisterDataSizeUnit());
			sregCom.setNRegister(communicationSetPreferences.getNRegister());

			if (masterComponentCount > 1) {
				// ---------Common Procedure --------
				ConnectionSet conset = ShimModelManager
						.createDefaultConnectionList(shim, dontConnectCon);
				sregCom.setConnectionSet(conset);
			}

			communicationSet.getSharedRegisterCommunication().clear();
			communicationSet.getSharedRegisterCommunication().add(sregCom);

			monitor.worked(1);
		}

		return communicationSet;
	}

	/**
	 * Re-Make the Connection's Performance by according to inputed parameters.
	 * 
	 * @param sys
	 *            the current SystemConfiguration
	 * @param communicationSet
	 *            the base CommunicationSet
	 * @param monitor
	 *            the progress monitor
	 */
	private void remakeConnectionPerformances(SystemConfiguration sys,
			CommunicationSet com_set, IProgressMonitor monitor) {
		CommunicationSet comset = sys.getCommunicationSet();
		if (comset != null) {
			List<AbstractCommunication> list = new ArrayList<AbstractCommunication>();

			list.addAll(com_set.getEventCommunication());
			list.addAll(com_set.getSharedMemoryCommunication());
			list.addAll(com_set.getFIFOCommunication());
			list.addAll(com_set.getInterruptCommunication());
			list.addAll(com_set.getSharedRegisterCommunication());

			int taskNum = 0;
			for (AbstractCommunication acom : list) {
				ConnectionSet conset = acom.getConnectionSet();
				if (conset != null) {
					taskNum += conset.getConnection().size();
				}
			}

			if (taskNum > 0) {
				monitor.beginTask("Creates the Connection's Performances.",
						taskNum);

				// add performance
				for (AbstractCommunication acom : list) {
					ConnectionSet conset = acom.getConnectionSet();
					List<Connection> conlist = conset.getConnection();
					for (Connection con : conlist) {
						List<Performance> pflist = con.getPerformance();
						pflist.clear();
						Performance pf = ShimFactory.eINSTANCE.createPerformance();
						Latency latency = (Latency) DefaultDataStore
								.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());
						pf.setLatency(latency);

						Pitch pitch = (Pitch) DefaultDataStore
								.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());
						pf.setPitch(pitch);
						pflist.add(pf);

						monitor.worked(1);
					}
				}
			}
		}
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#dispose()
	 */
	@Override
	public void dispose() {
		communicationSetWz = null;
		super.dispose();
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#performCancel()
	 */
	@Override
	public boolean performCancel() {
		log.info(getWindowTitle() + " is canceled.");
		ShimWrappedPreferences.restoreOldInstance();
		return super.performCancel();
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#setContainer(org.eclipse.jface.wizard.IWizardContainer)
	 */
	@Override
	public void setContainer(IWizardContainer wizardContainer) {
		if (wizardContainer instanceof IPageChangeProvider) {
			final IPageChangeProvider pcp = (IPageChangeProvider) wizardContainer;
			pcp.addPageChangedListener(new IPageChangedListener() {
				@Override
				public void pageChanged(final PageChangedEvent event) {
					Object selectedPage = event.getSelectedPage();
					setPreviousSelectedPage(selectedPage);
				}
			});
		}
		super.setContainer(wizardContainer);
	}

	/**
	 * Sets the previous wizard page.
	 * 
	 * @param previousSelectedPage
	 *            the previous wizard page
	 */
	public void setPreviousSelectedPage(Object previousSelectedPage) {
		this.previousSelectedPage = previousSelectedPage;
	}

	/**
	 * Returns the previous wizard page.
	 * 
	 * @param previousSelectedPage
	 *            the previous wizard page
	 */
	public Object getPreviousSelectedPage() {
		return previousSelectedPage;
	}
}
