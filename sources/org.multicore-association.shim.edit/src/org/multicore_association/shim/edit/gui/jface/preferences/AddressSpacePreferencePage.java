/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the AddressSpace.
 */
public class AddressSpacePreferencePage extends AbstractECPPreferencePage<AddressSpacePreferences> {

	/**
	 * Constructs a new instance of AddressSpacePreferencePage.
	 */
	public AddressSpacePreferencePage() {
		super(PreferencesPackage.eINSTANCE.getAddressSpacePreferences());

		setTitle("AddressSpace");

		parameter = PreferencesFactory.eINSTANCE.createAddressSpacePreferences();
		parameter.setNumberSubSpace(store
				.getInt(ShimPreferencesKey.AS_NUMBER_SUBSPACE));
		parameter.setSizeSubSpace(store
				.getInt(ShimPreferencesKey.AS_SIZE_SUBSPACE));
		parameter.setAddressSpaceName(store
				.getString(ShimPreferencesKey.AS_NAME));
		parameter.setSubSpaceName(store
				.getString(ShimPreferencesKey.AS_SUBSPACE_NAME));
		parameter.setDontConnect(store
				.getBoolean(ShimPreferencesKey.AS_CHECK_DONT_CONNECT));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setAddressSpacePreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadAddressSpacePreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setNumberSubSpace(store
				.getDefaultInt(ShimPreferencesKey.AS_NUMBER_SUBSPACE));
		parameter.setSizeSubSpace(store
				.getDefaultInt(ShimPreferencesKey.AS_SIZE_SUBSPACE));
		parameter.setAddressSpaceName(store
				.getDefaultString(ShimPreferencesKey.AS_NAME));
		parameter.setSubSpaceName(store
				.getDefaultString(ShimPreferencesKey.AS_SUBSPACE_NAME));
		parameter.setDontConnect(store
				.getDefaultBoolean(ShimPreferencesKey.AS_CHECK_DONT_CONNECT));

		store.setToDefault(ShimPreferencesKey.AS_NUMBER_SUBSPACE);
		store.setToDefault(ShimPreferencesKey.AS_SIZE_SUBSPACE);
		store.setToDefault(ShimPreferencesKey.AS_NAME);
		store.setToDefault(ShimPreferencesKey.AS_SUBSPACE_NAME);
		store.setToDefault(ShimPreferencesKey.AS_CHECK_DONT_CONNECT);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadAddressSpacePreferences();

		super.performDefaults();
	}
}
