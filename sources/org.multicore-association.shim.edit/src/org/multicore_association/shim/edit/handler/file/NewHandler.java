/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.file;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.e4.ui.workbench.modeling.EPartService.PartState;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.part.PartUtils;

/**
 * Create a new SHIM Data.
 */
public class NewHandler {

	@Inject
	private EPartService partService;

	@Inject
	private EModelService modelService;

	@Inject
	public NewHandler() {
	}

	@CanExecute
	public boolean canExecute(MWindow window) {
		return PartUtils.findPartStackMain(window, modelService).isPresent();
	}

	@Execute
	public void execute(MWindow window,
			@Named(IServiceConstants.ACTIVE_CONTEXTS) Object context, 
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		if (!PartUtils.findPartStackMain(window, modelService).isPresent()) {
			return;
		}

		FileHandlerUtils.createNewShim(shell)
		.ifPresent(shim -> {
			MPart part = PartUtils.createShimEditorPart(shim, partService);
			partService.showPart(part, PartState.ACTIVATE);
		});
	}
}
