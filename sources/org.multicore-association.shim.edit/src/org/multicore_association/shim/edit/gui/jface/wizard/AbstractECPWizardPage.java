/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.wizard;

import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.model.app.AbstractWizardPageData;
import org.multicore_association.shim.edit.service.ShimServiceUtils;
import org.multicore_association.shim.model.shim.Shim;

/**
 * ECP based wizard page.
 */
public abstract class AbstractECPWizardPage<T extends AbstractWizardPageData> extends WizardPage {

	protected Composite container;

	protected ECPSWTView view;

	protected T data;

	/**
	 * Constructs a new instance of ShimWizardPageBase.
	 * 
	 * @param pageName
	 */
	protected AbstractECPWizardPage(String pageName, Shim shim, T data) {
		super(pageName);
		ShimUtils.createResource(data);
		this.data = data;

		this.data.setShim(shim);
	}

	/**
	 * Create contents of the wizard.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	@Override
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		setControl(container);

		GridLayoutFactory.fillDefaults().numColumns(1).spacing(0, 0).applyTo(container);

		render();
	}

	protected void render() {
		if (view != null) {
			view.dispose();
			view = null;
		}

		T input = getData();

		try {
			VView vView = ViewProviderHelper.getView(input, null);
			ViewModelContext context = ViewModelContextFactory.INSTANCE
				.createViewModelContext(vView, input, ShimServiceUtils.getViewModelServiceProvider());

			view = ECPSWTViewRenderer.INSTANCE.render(container, context);
			container.layout();
		} catch (ECPRendererException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public T getData() {
		return data;
	}
}
