/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesKey;
import org.multicore_association.shim.model.shim.CacheCoherencyType;
import org.multicore_association.shim.model.shim.LockDownType;
import org.multicore_association.shim.model.shim.SizeUnitType;

/**
 * Preference page that allows configuration of the Cache.
 */
public class CachePreferencePage extends AbstractECPPreferencePage<CacheDataPreferences> {

	private Adapter adapter;

	/**
	 * Constructs a new instance of CachePreferencePage.
	 */
	public CachePreferencePage() {
		super(PreferencesPackage.eINSTANCE.getCacheDataPreferences());

		setTitle("Cache Data");

		parameter.setData(PreferencesFactory.eINSTANCE.createCacheDataUnitPreferences());
		parameter.setInstruction(PreferencesFactory.eINSTANCE.createCacheDataUnitPreferences());

		parameter.setCacheType(CacheTypeSelect.get(store
				.getInt(ShimPreferencesKey.CD_CACHE_TYPE)));
		parameter.getData().setCacheCoherenecy(CacheCoherencyType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_COHERENCY)));
		parameter.getData().setSize(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE));
		parameter.getData().setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE_UNIT)));
		parameter.getData().setNWay(store
				.getInteger(ShimPreferencesKey.CD_DATA_NUMBER_WAY));
		parameter.getData().setLineSize(store
				.getInteger(ShimPreferencesKey.CD_DATA_LINE_SIZE));
		parameter.getData().setLockDownType(LockDownType.get(store
				.getInt(ShimPreferencesKey.CD_DATA_LOCK_DOWN_TYPE)));

		parameter.getInstruction().setCacheCoherenecy(CacheCoherencyType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_COHERENCY)));
		parameter.getInstruction().setSize(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE));
		parameter.getInstruction().setSizeUnit(SizeUnitType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE_UNIT)));
		parameter.getInstruction().setNWay(store
				.getInteger(ShimPreferencesKey.CD_INSTRUCTION_NUMBER_WAY));
		parameter.getInstruction().setLineSize(store
				.getInteger(ShimPreferencesKey.CD_INSTRUCTION_LINE_SIZE));
		parameter.getInstruction().setLockDownType(LockDownType.get(store
				.getInt(ShimPreferencesKey.CD_INSTRUCTION_LOCK_DOWN_TYPE)));

		adapter = new AdapterImpl() {
			@Override
			public void notifyChanged(Notification msg) {
				Object feature = msg.getFeature();
				if (!(feature instanceof EObject)) {
					return;
				}
				if (EcoreUtil.equals((EObject) feature, PreferencesPackage.eINSTANCE.getCacheDataPreferences_CacheType())) {
					render();
				}
			}
		};
		parameter.eAdapters().add(adapter);
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performApply()
	 */
	@Override
	protected void performApply() {
		store.setCacheDataPreferences(parameter);
		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadCacheDataPreferences();

		super.performApply();
	}

	/**
	 * @see org.eclipse.jface.preference.PreferencePage#performDefaults()
	 */
	@Override
	protected void performDefaults() {
		parameter.setCacheType(CacheTypeSelect.get(store
				.getDefaultInt(ShimPreferencesKey.CD_CACHE_TYPE)));

		parameter.getData().setCacheCoherenecy(CacheCoherencyType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_CACHE_COHERENCY)));
		parameter.getData().setSize(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE));
		parameter.getData().setSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_CACHE_SIZE_UNIT)));
		parameter.getData().setNWay(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_NUMBER_WAY));
		parameter.getData().setLineSize(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_LINE_SIZE));
		parameter.getData().setLockDownType(LockDownType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_DATA_LOCK_DOWN_TYPE)));

		parameter.getInstruction().setCacheCoherenecy(CacheCoherencyType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_COHERENCY)));
		parameter.getInstruction().setSize(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE));
		parameter.getInstruction().setSizeUnit(SizeUnitType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE_UNIT)));
		parameter.getInstruction().setNWay(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_NUMBER_WAY));
		parameter.getInstruction().setLineSize(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_LINE_SIZE));
		parameter.getInstruction().setLockDownType(LockDownType.get(store
				.getDefaultInt(ShimPreferencesKey.CD_INSTRUCTION_LOCK_DOWN_TYPE)));

		store.setToDefault(ShimPreferencesKey.CD_CACHE_TYPE);

		store.setToDefault(ShimPreferencesKey.CD_DATA_CACHE_COHERENCY);
		store.setToDefault(ShimPreferencesKey.CD_DATA_CACHE_SIZE);
		store.setToDefault(ShimPreferencesKey.CD_DATA_CACHE_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CD_DATA_NUMBER_WAY);
		store.setToDefault(ShimPreferencesKey.CD_DATA_LINE_SIZE);
		store.setToDefault(ShimPreferencesKey.CD_DATA_LOCK_DOWN_TYPE);

		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_CACHE_COHERENCY);
		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE);
		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_CACHE_SIZE_UNIT);
		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_NUMBER_WAY);
		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_LINE_SIZE);
		store.setToDefault(ShimPreferencesKey.CD_INSTRUCTION_LOCK_DOWN_TYPE);

		store.save();

		ShimWrappedPreferences.getCurrentInstance().loadCacheDataPreferences();

		super.performDefaults();
	}
}
