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
import org.eclipse.emf.edit.command.PasteFromClipboardCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * Paste items.
 */
public class PasteHandler extends AbstractEditHandler {

	@Inject
	public PasteHandler() {
	}

	public Optional<Command> createCommand(EditingDomain domain, Collection<?> selection) {
		if (selection.size() == 1) {
			return Optional.of(PasteFromClipboardCommand.create(domain, selection.iterator().next(), null));
		}

		return Optional.empty();
	}
}
