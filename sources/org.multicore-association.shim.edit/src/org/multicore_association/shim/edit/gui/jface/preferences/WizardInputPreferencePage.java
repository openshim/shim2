/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesStore;

/**
 * Preference page that allows configuration of saving preferences after Wizard.
 */
public class WizardInputPreferencePage extends AbstractECPPreferencePage<SavePolicyPreferences> {

	/**
	 * Constructs a new instance of WizardInputPreferencePage.
	 */
	public WizardInputPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getSavePolicyPreferences());

		setTitle("Others");

		store = ShimPreferencesStore.getInstance();

		if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_ALWAYS)) {
			parameter.setSavePolicy(SavePolicyType.ALWAYS);
		} else if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_ON_REQUEST)) {
			parameter.setSavePolicy(SavePolicyType.ON_REQUEST);
		} else if (store.getBoolean(ShimPreferencesKey.WIZ_CHECK_NEVER)) {
			parameter.setSavePolicy(SavePolicyType.NEVER);
		} else {
			parameter.setSavePolicy(SavePolicyType.ON_REQUEST);
		}
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setSavePreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadSavePolicyPreferences();
		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		if (store.getDefaultBoolean(ShimPreferencesKey.WIZ_CHECK_ALWAYS)) {
			parameter.setSavePolicy(SavePolicyType.ALWAYS);
		} else if (store.getDefaultBoolean(ShimPreferencesKey.WIZ_CHECK_ON_REQUEST)) {
			parameter.setSavePolicy(SavePolicyType.ON_REQUEST);
		} else if (store.getDefaultBoolean(ShimPreferencesKey.WIZ_CHECK_NEVER)) {
			parameter.setSavePolicy(SavePolicyType.NEVER);
		} else {
			parameter.setSavePolicy(SavePolicyType.ON_REQUEST);
		}
		
		store.setToDefault(ShimPreferencesKey.WIZ_CHECK_ALWAYS);
		store.setToDefault(ShimPreferencesKey.WIZ_CHECK_ON_REQUEST);
		store.setToDefault(ShimPreferencesKey.WIZ_CHECK_NEVER);
		
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadSavePolicyPreferences();

		super.performDefaults();
	}
}
