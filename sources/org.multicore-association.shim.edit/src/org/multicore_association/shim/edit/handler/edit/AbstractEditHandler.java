/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.edit;

import java.util.Collection;
import java.util.Optional;

import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.multicore_association.shim.edit.part.PartUtils;

/**
 * Utility methods for edit handlers.
 */
public abstract class AbstractEditHandler {

	public abstract Optional<Command> createCommand(EditingDomain domain, Collection<?> selection);

	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {

		IStructuredSelection selection = getActiveTreeViewerSelection(part);

		return createCommand(part, selection)
				.map(Command::canExecute)
				.orElse(false);
	}

	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {

		IStructuredSelection selection = getActiveTreeViewerSelection(part);

		createCommand(part, selection)
		.filter(Command::canExecute)
		.ifPresent(Command::execute);
	}

	static Optional<EditingDomain> getEditingDomain(MPart part) {
		return PartUtils.findShimEditorPart(part)
			.flatMap(x -> x.getEditingDomain());
	}

	static IStructuredSelection getActiveTreeViewerSelection(MPart part) {
		return PartUtils.findShimEditorPart(part)
				.map(x -> x.getTreeViewerSelection(true))
				.filter(x -> x != null)
				.orElse(StructuredSelection.EMPTY);
	}

	public Optional<Command> createCommand(MPart part, IStructuredSelection selection) {
		if (selection == null || selection.isEmpty()) {
			return Optional.empty();
		}

		return getEditingDomain(part)
				.flatMap(x -> createCommand(x, selection.toList()));
	}
}
