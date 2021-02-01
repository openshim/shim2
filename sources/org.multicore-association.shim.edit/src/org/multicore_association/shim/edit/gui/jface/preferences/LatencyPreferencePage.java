/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the Latency.
 */
public class LatencyPreferencePage extends AbstractECPPreferencePage<LatencyPreferences> {

	/**
	 * Constructs a new instance of LatencyPreferencePage.
	 */
	public LatencyPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getLatencyPreferences());

		setTitle("Latency");

		parameter.setBest(store
				.getFloatWrapper(ShimPreferencesKey.P_LATENCY_BEST));
		parameter.setTypical(store
				.getFloat(ShimPreferencesKey.P_LATENCY_TYPICAL));
		parameter.setWorst(store
				.getFloatWrapper(ShimPreferencesKey.P_LATENCY_WORST));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setLatencyPreferences(parameter);
		store.save();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setBest(store
				.getDefaultFloat(ShimPreferencesKey.P_LATENCY_BEST));
		parameter.setTypical(store
				.getDefaultFloat(ShimPreferencesKey.P_LATENCY_TYPICAL));
		parameter.setWorst(store
				.getDefaultFloat(ShimPreferencesKey.P_LATENCY_WORST));

		store.setToDefault(ShimPreferencesKey.P_LATENCY_BEST);
		store.setToDefault(ShimPreferencesKey.P_LATENCY_TYPICAL);
		store.setToDefault(ShimPreferencesKey.P_LATENCY_WORST);

		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadLatencyPreferences();

		super.performDefaults();
	}
}
