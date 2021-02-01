/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.edit.model.app.CacheWizardPageData;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.model.shim.Shim;

/**
 * Wizard page that allows configuration of the Cache.
 */
public class CacheWizardPage extends AbstractECPWizardPage<CacheWizardPageData> {

	private CacheDataPreferences cacheDataPreferences;
	private Adapter adapter;

	/**
	 * Constructs a new instance of CacheWizardPage.
	 */
	public CacheWizardPage(Shim shim, ShimWrappedPreferences settings) {
		super("wizardPage", shim, AppFactory.eINSTANCE.createCacheWizardPageData());

		setTitle("Cache Information");
		setDescription("This is Basic Information for Cache Data.");

		cacheDataPreferences = settings.getCacheDataPreferences();

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
		cacheDataPreferences.eAdapters().add(adapter);

		data.setCacheDataPreferences(cacheDataPreferences);
	}

	@Override
	public void dispose() {
		if (adapter != null) {
			cacheDataPreferences.eAdapters().remove(adapter);
			adapter = null;
		}
		adapter = null;
		super.dispose();
	}
}
