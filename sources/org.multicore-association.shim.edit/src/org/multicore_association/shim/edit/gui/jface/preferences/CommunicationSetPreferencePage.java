/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.multicore_association.shim.edit.gui.common.LabelConstants;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.model.shim.OperationType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * Preference page that allows configuration of the CommunicationSet.
 */
public class CommunicationSetPreferencePage extends AbstractECPPreferencePage<CommunicationSetPreferences> {

	private Button btnCheckALL;

	/**
	 * Constructs a new instance of CommunicationSetPreferencePage.
	 */
	public CommunicationSetPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getCommunicationSetPreferences());

		setTitle("Communication Set");

		parameter.setCheckInterruptCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_INTERRUPT));

		parameter.setCheckEventCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_EVENT));

		parameter.setCheckFIFOCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_FIFO));
		parameter.setFifoDataSize(store
				.getInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE));
		parameter.setFifoDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE_UNIT)));
		parameter.setQueueSize(store
				.getInt(ShimPreferencesKey.CS_FIFO_QUEUE_SIZE));

		parameter.setCheckSharedMemoryCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_SMC));
		parameter.setSharedMemoryDataSize(store
				.getInteger(ShimPreferencesKey.CS_SMC_DATA_SIZE));
		parameter.setSharedMemoryDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_SMC_DATA_SIZE_UNIT)));
		parameter.setOperationType(OperationType.get(store
				.getInt(ShimPreferencesKey.CS_SMC_OPERATION)));

		parameter.setCheckSharedRegisterCommunication(store
				.getBoolean(ShimPreferencesKey.CS_CHECK_SRC));
		parameter.setSharedRegisterDataSize(store
				.getInt(ShimPreferencesKey.CS_SRC_DATA_SIZE));
		parameter.setSharedRegisterDataSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CS_SRC_DATA_SIZE_UNIT)));
		parameter.setNRegister(store
				.getInt(ShimPreferencesKey.CS_SRC_NUMBER_REGISTER));

		parameter.setDontConnect(store
				.getBoolean(ShimPreferencesKey.CS_DONT_CONNECT));
	}

	/**
	 * Create contents of this preference page.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	@Override
	public Control createContents(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);

		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).applyTo(container);

		btnCheckALL = new Button(container, SWT.CHECK);
		btnCheckALL.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false,
				false, 1, 1));
		btnCheckALL.setText(LabelConstants.SELECT_DESELECT_ALL);
		btnCheckALL.setSelection(true);

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

				parameter.setCheckInterruptCommunication(check);
				parameter.setCheckFIFOCommunication(check);
				parameter.setCheckEventCommunication(check);
				parameter.setCheckSharedMemoryCommunication(check);
				parameter.setCheckSharedRegisterCommunication(check);
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

		super.createContents(container);

		updateCheckAllButtonStatus();

		return container;
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setCommunicationSetPreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadCommunicationSetPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		// set default value to bean
		parameter.setCheckInterruptCommunication(store
				.getDefaultBoolean(ShimPreferencesKey.CS_CHECK_INTERRUPT));

		parameter.setCheckEventCommunication(store
				.getDefaultBoolean(ShimPreferencesKey.CS_CHECK_EVENT));

		parameter.setCheckFIFOCommunication(store
				.getDefaultBoolean(ShimPreferencesKey.CS_CHECK_FIFO));
		parameter.setFifoDataSize(store
				.getDefaultInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE));
		parameter.setFifoDataSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CS_FIFO_DATA_SIZE_UNIT)));
		parameter.setQueueSize(store
				.getDefaultInt(ShimPreferencesKey.CS_FIFO_QUEUE_SIZE));

		parameter.setCheckSharedMemoryCommunication(store
				.getDefaultBoolean(ShimPreferencesKey.CS_CHECK_SMC));
		parameter.setSharedMemoryDataSize(store
				.getDefaultInt(ShimPreferencesKey.CS_SMC_DATA_SIZE));
		parameter.setSharedMemoryDataSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CS_SMC_DATA_SIZE_UNIT)));
		parameter.setOperationType(OperationType.get(store
				.getDefaultInt(ShimPreferencesKey.CS_SMC_OPERATION)));

		parameter.setCheckSharedRegisterCommunication(store
				.getDefaultBoolean(ShimPreferencesKey.CS_CHECK_SRC));
		parameter.setSharedRegisterDataSize(store
				.getDefaultInt(ShimPreferencesKey.CS_SRC_DATA_SIZE));
		parameter.setSharedRegisterDataSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CS_SRC_DATA_SIZE_UNIT)));
		parameter.setNRegister(store
				.getDefaultInt(ShimPreferencesKey.CS_SRC_NUMBER_REGISTER));

		parameter.setDontConnect(store
				.getDefaultBoolean(ShimPreferencesKey.CS_DONT_CONNECT));

		// set to default PreferencedStore
		store.setToDefault(ShimPreferencesKey.CS_CHECK_INTERRUPT);

		store.setToDefault(ShimPreferencesKey.CS_CHECK_EVENT);

		store.setToDefault(ShimPreferencesKey.CS_CHECK_FIFO);
		store.setToDefault(ShimPreferencesKey.CS_FIFO_DATA_SIZE);
		store.setToDefault(ShimPreferencesKey.CS_FIFO_DATA_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CS_FIFO_QUEUE_SIZE);

		store.setToDefault(ShimPreferencesKey.CS_CHECK_SMC);
		store.setToDefault(ShimPreferencesKey.CS_SMC_DATA_SIZE);
		store.setToDefault(ShimPreferencesKey.CS_SMC_DATA_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CS_SMC_OPERATION);

		store.setToDefault(ShimPreferencesKey.CS_CHECK_SRC);
		store.setToDefault(ShimPreferencesKey.CS_SRC_DATA_SIZE);
		store.setToDefault(ShimPreferencesKey.CS_SRC_DATA_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CS_SRC_NUMBER_REGISTER);

		store.setToDefault(ShimPreferencesKey.CS_DONT_CONNECT);

		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadCommunicationSetPreferences();

		super.performDefaults();
	}

	/**
	 * Changes the checkAllButton to be grayed or selected.
	 */
	private void updateCheckAllButtonStatus() {
		boolean isCheckInterruptCommunication = parameter.isCheckInterruptCommunication();
		boolean sameAll = true;
		sameAll &= isCheckInterruptCommunication == parameter.isCheckFIFOCommunication();
		sameAll &= isCheckInterruptCommunication == parameter.isCheckEventCommunication();
		sameAll &= isCheckInterruptCommunication == parameter.isCheckSharedMemoryCommunication();
		sameAll &= isCheckInterruptCommunication == parameter.isCheckSharedRegisterCommunication();

		if (sameAll) {
			btnCheckALL.setGrayed(false);
			btnCheckALL.setSelection(isCheckInterruptCommunication);
		} else {
			btnCheckALL.setSelection(true);
			btnCheckALL.setGrayed(true);
		}
	}
}
