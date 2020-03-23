/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the ComponentSet.
 */
public class ComponentSetPreferencePage extends AbstractECPPreferencePage<ComponentSetPreferences> {

	/**
	 * Constructs a new instance of ComponentSetPreferencePage.
	 */
	public ComponentSetPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getComponentSetPreferences());

		setTitle("ComponentSet");

		parameter.setBaseName(store.getString(ShimPreferencesKey.CP_COMPONENTSET_NAME));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setString(ShimPreferencesKey.CP_COMPONENTSET_NAME, parameter.getBaseName());
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadComponentSetPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setBaseName(store.getDefaultString(ShimPreferencesKey.CP_COMPONENTSET_NAME));

		store.setToDefault(ShimPreferencesKey.CP_COMPONENTSET_NAME);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadComponentSetPreferences();

		super.performDefaults();
	}
}
