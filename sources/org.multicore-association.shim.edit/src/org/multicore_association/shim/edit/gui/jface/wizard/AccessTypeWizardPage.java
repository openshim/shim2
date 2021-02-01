/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import org.multicore_association.shim.edit.model.ShimWrappedPreferences;
import org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData;
import org.multicore_association.shim.edit.model.app.AppFactory;
import org.multicore_association.shim.model.shim.Shim;

/**
 * Wizard page that allows configuration of the AccessType.
 */
public class AccessTypeWizardPage extends AbstractECPWizardPage<AccessTypeWizardPageData> {

	/**
	 * Constructs a new instance of AccessTypeWizardPage.
	 */
	public AccessTypeWizardPage(Shim shim, ShimWrappedPreferences settings) {
		super("wizardPage", shim, AppFactory.eINSTANCE.createAccessTypeWizardPageData());

		setTitle("Setting Information of Base AccessType");
		setDescription("Base AccessType Information for Generate the combination.");

		data.setAccessTypePreferences(settings.getAccessTypePreferences());
	}

	/**
	 * @see org.eclipse.swt.events.SelectionListener#widgetSelected(org.eclipse.swt.events.SelectionEvent)
	 */
//	@Override
//	public void widgetSelected(SelectionEvent event) {
//		boolean selected = btnCheckButtonR.getSelection()
//				|| btnCheckButtonW.getSelection()
//				|| btnCheckButtonRW.getSelection()
//				|| btnCheckButtonRWX.getSelection()
//				|| btnCheckButtonRX.getSelection()
//				|| btnCheckButtonX.getSelection();
//
//		String msg = selected ? null : "Choose any one in RWType.";
//		setErrorMessage(msg);
//		setPageComplete(selected);
//	}

}
