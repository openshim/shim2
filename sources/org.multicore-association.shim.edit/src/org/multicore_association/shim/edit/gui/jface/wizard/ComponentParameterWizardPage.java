/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData;
import org.multicore_association.shim.model.shim.Shim;

/**
 * Wizard page that allows configuration of the Components parameter.
 */
public class ComponentParameterWizardPage extends AbstractECPWizardPage<ComponentParameterWizardPageData> {

	/**
	 * Constructs a new instance of ComponentParameterWizardPage.
	 */
	public ComponentParameterWizardPage(Shim shim, ShimWrappedPreferences settings) {
		super("wizardPage", shim, AppFactory.eINSTANCE.createComponentParameterWizardPageData());
		
		setTitle("Setting ComponentSet Infomation");
		setDescription("You should input some basic infomation for new SHIM data for Creating initial component set structure.");

		data.setComponentsPreferences(settings.getComponentsPreferences());
		data.setMasterComponentPreferences(settings.getMasterComponentPreferences());
		data.setSlaveComponentPreferences(settings.getSlaveComponentPreferences());
		data.setComponentSetPreferences(settings.getComponentSetPreferences());
	}

	/**
	 * Creates contents of this page.
	 * 
	 * @param parent
	 *            the parent composite
	 */
//	@Override
//	public void createControl(Composite parent) {
//
//		new Label(compositeComponentSet, SWT.NONE);
//
//		lblDescription = new Label(compositeComponentSet, SWT.NONE);
//		lblDescription
//				.setText("The instance of omponentSet name is\r\n     <BaseName>_L1_L2_..._LN   ('LN' is the number of level)");
//	}
}
