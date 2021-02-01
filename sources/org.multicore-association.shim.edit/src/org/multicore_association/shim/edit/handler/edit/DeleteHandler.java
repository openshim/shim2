/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.handler.edit;

import java.util.Collection;
import java.util.Optional;

import javax.inject.Inject;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Delete selected items.
 */
public class DeleteHandler extends AbstractEditHandler {

	@Inject
	public DeleteHandler() {
	}

	public Optional<Command> createCommand(EditingDomain domain, Collection<?> selection) {
		return Optional.of(DeleteCommand.create(domain, selection));
	}
}
