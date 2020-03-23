/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.shim;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.model.ShimModelManager;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.Shim;

/**
 * Renames components with auto-numbering.
 */
public class RenumberComponentSetHandler {

	@Inject
	public RenumberComponentSetHandler() {
	}

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {
		return PartUtils.findShimEditorPart(part).isPresent();
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		PartUtils.findShimEditorPart(part).ifPresent(x -> {
			Shim shim = x.getInput();
			renumberComponentSetWithConfirm(shim, shell);
		});
	}

	public static void renumberComponentSetWithConfirm(Shim shim, Shell shell) {
		MessageBox dialog = new MessageBox(shell, SWT.OK | SWT.CANCEL);
		dialog.setText("Caution");
		dialog.setMessage(
				"OK to re-number Components nodes? \nThis will serialize all the node-numbers added to the name of nodes from the root to the leaves.");

		int result = dialog.open();
		if (result == SWT.OK) {
			renumberComponentSet(shim);
		}
	}

	public static void renumberComponentSet(Shim shim) {
		ShimModelManager.reNummberComponentName(shim);
	}
}
