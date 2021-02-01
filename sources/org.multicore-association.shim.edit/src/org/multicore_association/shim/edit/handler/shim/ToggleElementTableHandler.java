/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.shim;

import java.util.Optional;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.model.application.ui.menu.MItem;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.gui.jface.ShimEditorPart;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.part.PartUtils;

public class ToggleElementTableHandler {

	static final Logger log = ShimLoggerUtil.getLogger(ToggleElementTableHandler.class);

	@Inject
	public ToggleElementTableHandler() {
	}

	@CanExecute
	public boolean canExecute(MItem item,
			@Named(IServiceConstants.ACTIVE_PART) MPart part) {

		Optional<ShimEditorPart> optional = PartUtils.findShimEditorPart(part);

		item.setSelected(
				optional
				.map(x -> x.isElementTableActive())
				.orElse(false)
		);

		return optional.isPresent();
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {

		PartUtils.findShimEditorPart(part).ifPresent(x -> {
			performElementTable(x, shell);
		});
	}

	public static void performElementTable(ShimEditorPart part, Shell shell) {
		part.performElementTableAction();
	}
}
