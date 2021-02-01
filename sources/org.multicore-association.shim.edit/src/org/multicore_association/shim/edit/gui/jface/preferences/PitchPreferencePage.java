/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PitchPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;

/**
 * Preference page that allows configuration of the Pitch.
 */
public class PitchPreferencePage extends AbstractECPPreferencePage<PitchPreferences> {

	/**
	 * Constructs a new instance of PitchPreferencePage.
	 */
	public PitchPreferencePage() {
		super(PreferencesPackage.eINSTANCE.getPitchPreferences());

		setTitle("Pitch");

		parameter
				.setBest(store.getFloatWrapper(ShimPreferencesKey.P_PITCH_BEST));
		parameter.setTypical(store.getFloat(ShimPreferencesKey.P_PITCH_TYPICAL));
		parameter.setWorst(store
				.getFloatWrapper(ShimPreferencesKey.P_PITCH_WORST));
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setPitchPreferences(parameter);
		store.save();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter
				.setBest(store.getDefaultFloat(ShimPreferencesKey.P_PITCH_BEST));
		parameter.setTypical(store
				.getDefaultFloat(ShimPreferencesKey.P_PITCH_TYPICAL));
		parameter.setWorst(store
				.getDefaultFloat(ShimPreferencesKey.P_PITCH_WORST));

		store.setToDefault(ShimPreferencesKey.P_PITCH_BEST);
		store.setToDefault(ShimPreferencesKey.P_PITCH_TYPICAL);
		store.setToDefault(ShimPreferencesKey.P_PITCH_WORST);

		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadPitchPreferences();

		super.performDefaults();
	}
}
