/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.gui.jface.AboutShimEditorDialog;

/**
 * Create a new SHIM Data.
 */
public class AboutHandler {

	@Inject
	public AboutHandler() {
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		openAboutDialog(shell);
	}

	public static void openAboutDialog(Shell shell) {
		AboutShimEditorDialog dialog = new AboutShimEditorDialog(
				shell);
		dialog.open();
	}
}
