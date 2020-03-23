/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.model.shim.RWType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * Preference page that allows configuration of the SlaveComponent.
 */
public class SlaveComponentPreferencePage extends AbstractECPPreferencePage<SlaveComponentPreferences> {

	/**
	 * Constructs a new instance of SlaveComponentPreferencePage.
	 */
	public SlaveComponentPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getSlaveComponentPreferences());

		setTitle("SlaveComponent");

		parameter
				.setBaseName(store.getString(ShimPreferencesKey.CP_SLAVE_NAME));
		parameter.setSize(store.getInt(ShimPreferencesKey.CP_SLAVE_SIZE));
		parameter.setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CP_SLAVE_SIZE_UNIT)));
		parameter.setRwType(RWType.get(
				store.getInt(ShimPreferencesKey.CP_SLAVE_RWTYPE)));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setSlaveComponentPreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadSlaveComponentPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setBaseName(store
				.getDefaultString(ShimPreferencesKey.CP_SLAVE_NAME));
		parameter
				.setSize(store.getDefaultInt(ShimPreferencesKey.CP_SLAVE_SIZE));
		parameter.setSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CP_SLAVE_SIZE_UNIT)));
		parameter.setRwType(RWType.get(store
				.getDefaultInt(ShimPreferencesKey.CP_SLAVE_RWTYPE)));

		store.setToDefault(ShimPreferencesKey.CP_SLAVE_NAME);
		store.setToDefault(ShimPreferencesKey.CP_SLAVE_SIZE);
		store.setToDefault(ShimPreferencesKey.CP_SLAVE_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CP_SLAVE_RWTYPE);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadSlaveComponentPreferences();

		super.performDefaults();
	}
}
