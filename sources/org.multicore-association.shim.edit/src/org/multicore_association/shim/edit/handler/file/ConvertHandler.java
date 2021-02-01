package org.multicore_association.shim.edit.handler.file;

import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.swt.widgets.Shell;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.Shim;

public class ConvertHandler {
	
	@Inject
	public ConvertHandler() {
	}
	
	@CanExecute
	public boolean canExecute(@Named(IServiceConstants.ACTIVE_PART) MPart part) {
		return PartUtils.findShimEditorPart(part).isPresent();
	}
	
	@Execute
	public void execute(@Named(IServiceConstants.ACTIVE_PART) MPart part,
			@Named(IServiceConstants.ACTIVE_SHELL) Shell shell) {
		
		PartUtils.findShimEditorPart(part)
		.ifPresent(x -> {
			Shim shim = x.getInput();
									
			FileHandlerUtils.convertShim(shell, shim);
		});
	}

}
