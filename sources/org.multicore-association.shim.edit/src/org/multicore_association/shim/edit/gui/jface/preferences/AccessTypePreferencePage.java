/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the AccessType.
 */
public class AccessTypePreferencePage extends AbstractECPPreferencePage<AccessTypePreferences> {

	/**
	 * Constructs a new instance of AccessTypePreferencePage.
	 */
	public AccessTypePreferencePage() {
		super(PreferencesPackage.eINSTANCE.getAccessTypePreferences());

		setTitle("Access Type");

		parameter = PreferencesFactory.eINSTANCE.createAccessTypePreferences();
		parameter.setBaseName(store.getString(ShimPreferencesKey.AT_NAME));
		parameter.setCheckR(store.getBoolean(ShimPreferencesKey.AT_CHECK_R));
		parameter.setCheckW(store.getBoolean(ShimPreferencesKey.AT_CHECK_W));
		parameter.setCheckRW(store.getBoolean(ShimPreferencesKey.AT_CHECK_RW));
		parameter.setCheckRWX(store.getBoolean(ShimPreferencesKey.AT_CHECK_RWX));
		parameter.setCheckRX(store.getBoolean(ShimPreferencesKey.AT_CHECK_RX));
		parameter.setCheckX(store.getBoolean(ShimPreferencesKey.AT_CHECK_X));
		parameter.setAccessByteSize(store
				.getString(ShimPreferencesKey.AT_ACCESS_BYTE_SIZE));
		parameter
				.setNBurst(store.getInteger(ShimPreferencesKey.AT_NUMBER_BURST));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {

		store.setAccessTypePreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadAccessTypePreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter
				.setBaseName(store.getDefaultString(ShimPreferencesKey.AT_NAME));
		parameter.setCheckR(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_R));
		parameter.setCheckW(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_W));
		parameter.setCheckRW(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_RW));
		parameter.setCheckRWX(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_RWX));
		parameter.setCheckRX(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_RX));
		parameter.setCheckX(store
				.getDefaultBoolean(ShimPreferencesKey.AT_CHECK_X));
		parameter.setAccessByteSize(store
				.getDefaultString(ShimPreferencesKey.AT_ACCESS_BYTE_SIZE));
		parameter.setNBurst(store
				.getDefaultInt(ShimPreferencesKey.AT_NUMBER_BURST));

		store.setToDefault(ShimPreferencesKey.AT_NAME);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_R);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_W);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_RW);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_RWX);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_RX);
		store.setToDefault(ShimPreferencesKey.AT_CHECK_X);
		store.setToDefault(ShimPreferencesKey.AT_ACCESS_BYTE_SIZE);
		store.setToDefault(ShimPreferencesKey.AT_NUMBER_BURST);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadAccessTypePreferences();

		super.performDefaults();
	}
}
