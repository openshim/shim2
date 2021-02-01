/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.util.EcoreUtil;
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
import org.multicore_association.shim.edit.model.ShimComponentTree;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesStore;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * A wizard to generate AddressSpaceSet again.
 */
public class RemakeAddressSpaceWizard extends Wizard {

	private static final Logger log = ShimLoggerUtil
			.getLogger(RemakeAddressSpaceWizard.class);

	private AddressSpaceParameterWizardPage createAddressSpace = null;
	private AddressSpaceEditorWizardPage editAsTreeWz = null;

	public ComponentSet rootComponent = null;

	private Object previousSelectedPage;

	private int x = CommonConstants.WIZARD_DEFAULT_X;
	private int y = CommonConstants.WIZARD_DEFAULT_Y;

	private ShimWrappedPreferences preferences;

	private ShimEditorPart part;
	private Shim shim;

	/**
	 * Constructs a new instance of RemakeAddressSpaceWizard.
	 */
	public RemakeAddressSpaceWizard(ShimEditorPart part) {
		setWindowTitle("Re-Make AddressSpaceSet Wizard");

		// current sc is changed.
		preferences = ShimWrappedPreferences.getNewCopyInstance();

		this.part = part;
		this.shim = part.getInput();

		log.info(getWindowTitle() + " open");
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#addPages()
	 */
	@Override
	public void addPages() {

		createAddressSpace = new AddressSpaceParameterWizardPage(shim, preferences);
		addPage(createAddressSpace);

		editAsTreeWz = new AddressSpaceEditorWizardPage();
		editAsTreeWz.setRequiredToCreateData(true);
		addPage(editAsTreeWz);
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
					remakeShimXml(sys, preferences, monitor);
				}

			});
		} catch (InvocationTargetException | InterruptedException e) {
			log.log(Level.SEVERE, "Re-Make AddressSpace Error.", e);
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
			ShimWrappedPreferences preferences, IProgressMonitor monitor) {
		monitor.beginTask("Re-Makes AddressSpaces.", 1);

		// delete old object and references
		AddressSpaceSet oldObject = sys.getAddressSpaceSet();
		if (oldObject != null) {
			EcoreUtil.delete(oldObject, true);
		}

		AddressSpaceSet newObject = (AddressSpaceSet) DefaultDataStore.getDefaultSet(
				ShimPackage.eINSTANCE.getAddressSpaceSet());

		sys.setAddressSpaceSet(newObject);

		if (editAsTreeWz.isRequiredToCreateData()) {
			editAsTreeWz.createAddressSpaceSet(shim.getSystemConfiguration());
		}
		monitor.worked(1);

		remakeMasterSlaveBindingSet(sys, createAddressSpace.getData(), monitor);

		part.setInput(shim);
		part.changeInputPanel(sys.getAddressSpaceSet());
	}

	/**
	 * Re-Makes MasterSlaveBindingSet by according to inputed parameters.
	 * 
	 * @param sys
	 *            the current SystemConfiguration
	 * @param data
	 *            the current data
	 * @param monitor
	 *            the progress monitor
	 * @return the new Communications
	 */
	private void remakeMasterSlaveBindingSet(SystemConfiguration sys,
			AddressSpaceParameterWizardPageData data, IProgressMonitor monitor) {

		AddressSpacePreferences addressSpacePreferences = data.getAddressSpacePreferences();
		boolean dontConnect = addressSpacePreferences.isDontConnect();

		// Sets a MasterSlaveBinding to every SubSpace.
		List<AddressSpace> asList = sys.getAddressSpaceSet().getAddressSpace();
		int taskNum = 0;
		for (AddressSpace as : asList) {
			List<SubSpace> sslist = as.getSubSpace();
			taskNum += sslist.size();
		}

		if (taskNum > 0) {
			monitor.beginTask("Creates the MasterSlaveBindingSet.", taskNum);

			ShimComponentTree scTree = new ShimComponentTree(sys);

			// set MasterSlaveBinding to every SubSpace
			List<MasterComponent> mcList = ShimModelManager
					.makeMasterComponentList(sys.getComponentSet());
			List<SlaveComponent> slcList = ShimModelManager
					.makeSlaveComponentList(sys.getComponentSet());
			if (mcList.isEmpty() || slcList.isEmpty()) {
				monitor.worked(taskNum);
				return;
			}

			for (AddressSpace as : asList) {
				List<SubSpace> ssList = as.getSubSpace();
				for (SubSpace ss : ssList) {
					ShimModelManager.setMasterSlaveBindingToSubSpace(scTree,
							mcList, slcList, ss, dontConnect);
					monitor.worked(1);
				}
			}
		}
	}

	/**
	 * @see org.eclipse.jface.wizard.Wizard#dispose()
	 */
	@Override
	public void dispose() {
		createAddressSpace = null;
		editAsTreeWz = null;
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

					if (createAddressSpace.equals(selectedPage)) {
						createAddressSpace.update();
						if (editAsTreeWz.equals(getPreviousSelectedPage())) {
							// go from editAddressSpace to createAddressSpace
							editAsTreeWz.setRequiredToCreateData(true);
						}

					} else if (createAddressSpace
							.equals(getPreviousSelectedPage())
							&& editAsTreeWz.equals(selectedPage)) {
						// go from createAddressSpace to editAddressSpace
						editAsTreeWz.createAddressSpaceSet(shim.getSystemConfiguration());
						editAsTreeWz.setRequiredToCreateData(false);

					}

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
