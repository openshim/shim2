package org.multicore_association.shim.edit.handler.file;

import java.util.logging.Logger;

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
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.part.PartUtils;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim10.model.shim10.DocumentRoot;

public class Open10Handler {
	
	static final Logger log = ShimLoggerUtil.getLogger(OpenHandler.class);
	
	@Inject
	private EPartService partService;
	
	@Inject
	private EModelService modelService;

	@Inject
	public Open10Handler() {
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

		FileHandlerUtils.open10(shell)
		.ifPresent(result -> {
			String path = result.getKey();
			Shim shim = result.getValue();
			
			MPart part = PartUtils.createShimEditorPart(shim, path, partService);
			partService.showPart(part, PartState.ACTIVATE);
		});
	}

}
