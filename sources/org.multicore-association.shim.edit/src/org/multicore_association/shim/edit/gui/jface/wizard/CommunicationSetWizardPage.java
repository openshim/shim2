/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.multicore_association.shim.edit.gui.common.LabelConstants;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.edit.model.app.AppPackage;
import org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SubSpace;

/**
 * Wizard page that allows configuration of the CommunicationSet.
 */
public class CommunicationSetWizardPage extends AbstractECPWizardPage<CommunicationSetWizardPageData> {

	private Adapter adapter;

	private boolean asCreated = false;

	private Button btnCheckALL;

	/**
	 * Constructs a new instance of CommunicationSetWizardPage.
	 */
	public CommunicationSetWizardPage(Shim shim, ShimWrappedPreferences settings) {
		this(shim, settings, false);
	}

	/**
	 * Constructs a new instance of Shim_WizardPage_CommunicationSet.
	 */
	public CommunicationSetWizardPage(Shim shim, ShimWrappedPreferences settings, boolean asCreated) {
		super("wizardPage", shim, AppFactory.eINSTANCE.createCommunicationSetWizardPageData());

		setTitle("Setting Communication Set");
		setDescription("Choose Communication Set");

		this.asCreated = asCreated;

		CommunicationSetPreferences communicationSetPreferences = settings.getCommunicationSetPreferences();
		data.setCommunicationSetPreferences(communicationSetPreferences);

		adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				Object feature = msg.getFeature();
				if (!(feature instanceof EObject)) {
					return;
				}
				if (EcoreUtil.equals((EObject) feature, AppPackage.eINSTANCE.getCommunicationSetWizardPageData_AddressSpace())) {
					data.setSubSpace(getFirstSubSpace());
				} else if (feature instanceof EAttribute) {
					EAttribute attribute = (EAttribute) feature;
					if (EcoreUtil.equals(attribute.getEType(), EcorePackage.eINSTANCE.getEBoolean())) {
						updateCheckAllButtonStatus();
					}
				}
			}
		};
		data.eAdapters().add(adapter);
		communicationSetPreferences.eAdapters().add(adapter);
	}

	@Override
	public void dispose() {
		if (adapter != null) {
			data.eAdapters().remove(adapter);
			data.getCommunicationSetPreferences().eAdapters().remove(adapter);
			adapter = null;
		}
		adapter = null;
		super.dispose();
	}

	public AddressSpace getFirstAddressSpace() {
		List<EObject> objectList = ShimUtils.getObjectsList(data.getShim(), ShimPackage.eINSTANCE.getAddressSpace());
		if (objectList.isEmpty()) {
			return null;
		}
		return (AddressSpace) objectList.get(0);
	}

	public SubSpace getFirstSubSpace() {
		List<EObject> objectList = ShimUtils.getObjectsList(data.getAddressSpace(), ShimPackage.eINSTANCE.getSubSpace());
		if (objectList.isEmpty()) {
			return null;
		}
		return (SubSpace) objectList.get(0);
	}

	public AddressSpace getAddressSpace() {
		return data.getAddressSpace();
	}

	public SubSpace getSubSpace() {
		return data.getSubSpace();
	}

	public void updateCombo() {
		data.setAddressSpace(getFirstAddressSpace());
	}

	/**
	 * Create contents of this preference page.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NULL);
		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(composite);

		btnCheckALL = new Button(composite, SWT.CHECK);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.END, SWT.BEGINNING).applyTo(btnCheckALL);
		btnCheckALL.setSelection(true);
		btnCheckALL.setText(LabelConstants.SELECT_DESELECT_ALL);

		btnCheckALL.addSelectionListener(new SelectionListener() {

			/**
			 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetDefaultSelected(SelectionEvent event) {
				// NOOP
			}

			/**
			 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				Button selectedButton = ((Button) event.widget);
				selectedButton.setGrayed(false);
				boolean check = selectedButton.getSelection();

				CommunicationSetPreferences communicationSetPreferences = data.getCommunicationSetPreferences();
				communicationSetPreferences.setCheckInterruptCommunication(check);
				communicationSetPreferences.setCheckFIFOCommunication(check);
				communicationSetPreferences.setCheckEventCommunication(check);
				communicationSetPreferences.setCheckSharedMemoryCommunication(check);
				communicationSetPreferences.setCheckSharedRegisterCommunication(check);
			}

		});
		SelectionListener grayedCheckAllListner = new SelectionListener() {

			/**
			 * @see org.eclipse.swt.events.SelectionListener#widgetDefaultSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetDefaultSelected(SelectionEvent event) {
				// NOOP
			}

			/**
			 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 */
			@Override
			public void widgetSelected(SelectionEvent event) {
				updateCheckAllButtonStatus();
			}
		};

		super.createControl(composite);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(container);

		setControl(composite);
	}

	/**
	 * Changes the checkAllButton to be grayed or selected.
	 */
	private void updateCheckAllButtonStatus() {
		CommunicationSetPreferences communicationSetPreferences = data.getCommunicationSetPreferences();

		boolean isCheckInterruptCommunication = communicationSetPreferences.isCheckInterruptCommunication();
		boolean sameAll = true;
		sameAll &= isCheckInterruptCommunication == communicationSetPreferences.isCheckFIFOCommunication();
		sameAll &= isCheckInterruptCommunication == communicationSetPreferences.isCheckEventCommunication();
		sameAll &= isCheckInterruptCommunication == communicationSetPreferences.isCheckSharedMemoryCommunication();
		sameAll &= isCheckInterruptCommunication == communicationSetPreferences.isCheckSharedRegisterCommunication();

		if (sameAll) {
			btnCheckALL.setGrayed(false);
			btnCheckALL.setSelection(isCheckInterruptCommunication);
		} else {
			btnCheckALL.setSelection(true);
			btnCheckALL.setGrayed(true);
		}
	}
}
