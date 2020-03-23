/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.shim;

import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.jface.databinding.swt.DisplayRealm;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.gui.jface.ShimContentMasterDetailControl;
import org.multicore_association.shim.edit.gui.jface.ShimEditorPart;
import org.multicore_association.shim.edit.gui.jface.wizard.RemakeAddressSpaceWizard;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.ShimPackage;

public class RemakeAddressSpaceSetHandler {

	static final Logger log = ShimLoggerUtil.getLogger(RemakeAddressSpaceSetHandler.class);

	@Inject
	public RemakeAddressSpaceSetHandler() {
	}

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {
		return PartUtils.findShimEditorPart(part).isPresent();
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		PartUtils.findShimEditorPart(part).ifPresent(x -> {
			remakeAddressSpaces(x, shell);
		});
	}

	public static void remakeAddressSpaces(ShimEditorPart part, Shell shell) {

		ShimContentMasterDetailControl control = part.findShimContentControl(
				ShimPackage.eINSTANCE.getSystemConfiguration_AddressSpaceSet());

		RemakeAddressSpaceWizard remakeAddressSpaceWizard = new RemakeAddressSpaceWizard(part);
		Rectangle bounds = shell.getBounds();
		remakeAddressSpaceWizard.setLayout(bounds.x, bounds.y);

		Realm.runWithDefault(
				DisplayRealm.getRealm(shell.getDisplay()),
				() -> {
					Window shimWizardDialog = new WizardDialog(shell, remakeAddressSpaceWizard);
					shimWizardDialog.open();
				});
	}
}
