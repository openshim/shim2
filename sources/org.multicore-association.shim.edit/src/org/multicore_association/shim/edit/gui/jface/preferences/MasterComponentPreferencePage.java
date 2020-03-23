/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.model.shim.EndianType;
import org.multicore_association.shim.model.shim.MasterType;

/**
 * Preference page that allows configuration of the MasterComponent.
 */
public class MasterComponentPreferencePage extends AbstractECPPreferencePage<MasterComponentPreferences> {

	/**
	 * Constructs a new instance of MasterComponentPreferencePage.
	 */
	public MasterComponentPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getMasterComponentPreferences());

		setTitle("MasterComponent");

		parameter.setBaseName(store
				.getString(ShimPreferencesKey.CP_MASTER_NAME));
		parameter.setType(MasterType.get(store.getInt(ShimPreferencesKey.CP_MASTER_TYPE)));
		parameter.setEndian(EndianType.get(store.getInt(ShimPreferencesKey.CP_MASTER_ENDIAN)));
		parameter.setArch(store.getString(ShimPreferencesKey.CP_MASTER_ARCH));
		parameter.setArchOpt(store
				.getString(ShimPreferencesKey.CP_MASTER_ARCH_OPT));
		parameter.setNChannel(store
				.getInteger(ShimPreferencesKey.CP_MASTER_NUMBER_CHANNEL));
		parameter.setNThread(store
				.getInteger(ShimPreferencesKey.CP_MASTER_NUMBER_THREAD));
		parameter.setCheckClockForMaster(store
				.getBoolean(ShimPreferencesKey.CP_MASTER_CHECK_CLOCKFREQUENCY));
		parameter.setClock(store.getFloat(ShimPreferencesKey.CP_MASTER_CLOCK));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setMasterComponentPreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadMasterComponentPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setBaseName(store
				.getDefaultString(ShimPreferencesKey.CP_MASTER_NAME));
		parameter.setType(MasterType.get(store
				.getDefaultInt(ShimPreferencesKey.CP_MASTER_TYPE)));
		parameter.setEndian(EndianType.get(store
				.getDefaultInt(ShimPreferencesKey.CP_MASTER_ENDIAN)));
		parameter.setArch(store
				.getDefaultString(ShimPreferencesKey.CP_MASTER_ARCH));
		parameter.setArchOpt(store
				.getDefaultString(ShimPreferencesKey.CP_MASTER_ARCH_OPT));
		parameter.setNChannel(store
				.getDefaultInt(ShimPreferencesKey.CP_MASTER_NUMBER_CHANNEL));
		parameter.setNThread(store
				.getDefaultInt(ShimPreferencesKey.CP_MASTER_NUMBER_THREAD));
		parameter
				.setCheckClockForMaster(store
						.getDefaultBoolean(ShimPreferencesKey.CP_MASTER_CHECK_CLOCKFREQUENCY));
		parameter.setClock(store
				.getDefaultFloat(ShimPreferencesKey.CP_MASTER_CLOCK));

		store.setToDefault(ShimPreferencesKey.CP_MASTER_NAME);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_TYPE);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_ENDIAN);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_ARCH);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_ARCH_OPT);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_NUMBER_CHANNEL);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_NUMBER_THREAD);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_CHECK_CLOCKFREQUENCY);
		store.setToDefault(ShimPreferencesKey.CP_MASTER_CLOCK);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadMasterComponentPreferences();

		super.performDefaults();
	}
}
