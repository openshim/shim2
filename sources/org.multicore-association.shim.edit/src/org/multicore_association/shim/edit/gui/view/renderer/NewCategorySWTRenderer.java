package org.multicore_association.shim.edit.gui.view.renderer;

import javax.inject.Inject;

import org.eclipse.emf.ecp.view.spi.categorization.model.VCategory;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.ContainerSWTRenderer;
import org.eclipse.emf.ecp.view.spi.renderer.NoPropertyDescriptorFoundExeption;
import org.eclipse.emf.ecp.view.spi.renderer.NoRendererFoundException;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.swt.core.EMFFormsRendererFactory;
import org.eclipse.emfforms.spi.swt.core.layout.SWTGridCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public class NewCategorySWTRenderer extends ContainerSWTRenderer<VCategory> {
	
	@Inject
	public NewCategorySWTRenderer(VCategory vElement, ViewModelContext viewContext, ReportService reportService,
		    EMFFormsRendererFactory factory) {
		super(vElement, viewContext, reportService, factory);
	}
	
	@Override
	protected Composite getComposite(Composite parent) {
		Composite category = new Composite(parent, SWT.SMOOTH);
		return category;
	}
	
	@Override
	protected Control renderControl(SWTGridCell gridCell, Composite parent) 
			throws NoRendererFoundException, NoPropertyDescriptorFoundExeption {
		
		parent.setBackground(parent.getDisplay().getSystemColor(SWT.COLOR_BLUE));
		
		final Composite category = new Composite(parent, SWT.NONE);
		super.renderControl(gridCell, category);
		
		return category;
	}

}
