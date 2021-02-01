/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.file;

import java.io.File;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.apache.commons.lang3.BooleanUtils;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.Shim;

/**
 * Create a new SHIM Data.
 */
public class SaveHandler {

	static final Logger log = ShimLoggerUtil
			.getLogger(SaveHandler.class);

	@Inject
	public SaveHandler() {
	}

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {
		return PartUtils.findShimEditorPart(part).isPresent();
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part, 
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell,
			@org.eclipse.e4.core.di.annotations.Optional @Named(FileHandlerUtils.COMMAND_PARAMETER_SAVE_AS_ID) String saveAsValue) {

		PartUtils.findShimEditorPart(part)
		.ifPresent(x -> {
			Shim shim = x.getInput();
			String defaultPathName = x.getDefaultPathName();

			boolean saveAs = BooleanUtils.toBoolean(saveAsValue);

			FileHandlerUtils.saveShim(shell, shim, defaultPathName, saveAs)
			.ifPresent(path -> {

				x.setDefaultPathName(path);

				File file = new File(path);
				part.setLabel(file.getName());
				part.setTooltip(path);
			});
		});
	}
}
