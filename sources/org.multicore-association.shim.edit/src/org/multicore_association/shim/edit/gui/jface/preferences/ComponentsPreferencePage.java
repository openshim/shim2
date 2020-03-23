/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the Components.
 */
public class ComponentsPreferencePage extends AbstractECPPreferencePage<ComponentsPreferences> {

	/**
	 * Constructs a new instance of ComponentsPreferencePage.
	 */
	public ComponentsPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getComponentsPreferences());

		setTitle("ComponentSet General");

		parameter.setSystemName(store.getString(ShimPreferencesKey.CP_SYSTEM_NAME));
		parameter.setNumberMaster(store.getInt(ShimPreferencesKey.CP_NUMBER_MASTER));
		parameter.setNumberSlave(store.getInt(ShimPreferencesKey.CP_NUMBER_SLAVE));
		parameter.setNumberComponent(store.getInt(ShimPreferencesKey.CP_NUMBER_COMPONENT));
		parameter.setClock(store.getFloat(ShimPreferencesKey.CP_CLOCK));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setComponentsPreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadComponentsPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setSystemName(store.getDefaultString(ShimPreferencesKey.CP_SYSTEM_NAME));
		parameter.setNumberMaster(store.getDefaultInt(ShimPreferencesKey.CP_NUMBER_MASTER));
		parameter.setNumberSlave(store.getDefaultInt(ShimPreferencesKey.CP_NUMBER_SLAVE));
		parameter.setNumberComponent(store.getDefaultInt(ShimPreferencesKey.CP_NUMBER_COMPONENT));
		parameter.setClock(store.getDefaultFloat(ShimPreferencesKey.CP_CLOCK));

		store.setToDefault(ShimPreferencesKey.CP_SYSTEM_NAME);
		store.setToDefault(ShimPreferencesKey.CP_NUMBER_MASTER);
		store.setToDefault(ShimPreferencesKey.CP_NUMBER_SLAVE);
		store.setToDefault(ShimPreferencesKey.CP_NUMBER_COMPONENT);
		store.setToDefault(ShimPreferencesKey.CP_CLOCK);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadComponentsPreferences();

		super.performDefaults();
	}
}
