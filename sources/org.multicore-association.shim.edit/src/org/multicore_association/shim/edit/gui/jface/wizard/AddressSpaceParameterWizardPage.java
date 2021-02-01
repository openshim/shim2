/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * Wizard page that allows configuration of the AddressSpace parameter.
 */
public class AddressSpaceParameterWizardPage extends AbstractECPWizardPage<AddressSpaceParameterWizardPageData> {

	private static final Logger log = ShimLoggerUtil
			.getLogger(AddressSpaceParameterWizardPage.class);

	/**
	 * Constructs a new instance of AddressSpaceParameterWizardPage.
	 */
	public AddressSpaceParameterWizardPage(Shim shim, ShimWrappedPreferences settings) {
		super("wizardPage", shim, AppFactory.eINSTANCE.createAddressSpaceParameterWizardPageData());

		setTitle("Setting AddressSpace Information");
		setDescription("Input some number of Element for the creation AddressSpace and SubSpace.");

		data.setAddressSpacePreferences(settings.getAddressSpacePreferences());
	}

	/**
	 * Updates controls on this page.
	 */
	public void update() {
		log.finest("In ShimWizardPage_TreeEdit::getNextPage()----------------");

		SystemConfiguration sys = data.getShim().getSystemConfiguration();

		int numberOfComponentSet = 1 + ShimModelManager.countComponentSet(sys
				.getComponentSet().getComponentSet());
		data.setNumberOfAddressSpace(numberOfComponentSet);
		log.finest("count = " + numberOfComponentSet);

		List<EObject> slaveList = ShimUtils.getObjectsList(sys.getComponentSet(), ShimPackage.eINSTANCE.getSlaveComponent());
		if (slaveList.isEmpty()) {
			data.setTargetSlaveComponent(null);
		} else {
			data.setTargetSlaveComponent((SlaveComponent) slaveList.get(0));
		}
	}
}
