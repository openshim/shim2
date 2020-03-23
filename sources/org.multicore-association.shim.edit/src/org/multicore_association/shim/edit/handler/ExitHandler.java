/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.workbench.IWorkbench;

/**
 * Create a new SHIM Data.
 */
public class ExitHandler {

	@Inject
	public ExitHandler() {
	}

	@Execute
	public void execute(IWorkbench workbench) {
		workbench.close();
	}
}
