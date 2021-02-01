package org.multicore_association.shim.edit.gui.view.renderer;

import org.eclipse.emf.ecp.view.spi.categorization.model.VCategory;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;

public class NewCategorySWTRendererService implements EMFFormsDIRendererService<VCategory> {
	
	private static final double CONSTANT_PRIORITY = 3;

	@Override
	public double isApplicable(VElement vElement, ViewModelContext viewModelContext) {
		if (!VCategory.class.isInstance(vElement)) {
			return NOT_APPLICABLE;
		}
		return CONSTANT_PRIORITY;
	}
	
	@Override
	public Class<? extends AbstractSWTRenderer<VCategory>> getRendererClass() {
		return NewCategorySWTRenderer.class;
	}

}
