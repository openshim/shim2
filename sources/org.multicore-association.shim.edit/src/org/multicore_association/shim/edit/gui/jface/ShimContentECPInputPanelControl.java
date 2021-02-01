/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.multicore_association.shim.edit.service.ShimServiceUtils;

public class ShimContentECPInputPanelControl extends ShimContentControl {

	private ECPSWTView view;

	private StackLayout stack;

	public ShimContentECPInputPanelControl(Composite parent, int style) {
		super(parent, SWT.NONE);

		stack = new StackLayout();
		this.setLayout(stack);
	}

	@Override
	public void dispose() {
		if (view != null) {
			view.dispose();
			view = null;
		}

		super.dispose();
	}

	/**
	 * @param object
	 *            the input object
	 */
	@Override
	public void setInput(EObject object) {
		if (view != null) {
			view.dispose();
			view = null;
		}

		Composite container = this;

		try {
			VView vView = ViewProviderHelper.getView(object, null);
			ViewModelContext context = ViewModelContextFactory.INSTANCE
				.createViewModelContext(vView, object, ShimServiceUtils.getViewModelServiceProvider());

			view = ECPSWTViewRenderer.INSTANCE.render(container, context);
			stack.topControl = view.getSWTControl();
		} catch (final ECPRendererException e) {
			e.printStackTrace();
		}

		container.layout(true, true);
	}

	@Override
	public void refresh() {
		// noop
	}

	@Override
	public boolean findAndSelect(Object selectedItem) {
		return false;
	}
}
