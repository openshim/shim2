/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.jface.preferences;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContextFactory;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.emf.ecp.view.spi.provider.ViewProviderHelper;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.jface.preference.PreferencePage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.multicore_association.shim.edit.gui.jface.ErrorMessagePool;
import org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.preferences.ShimPreferencesStore;
import org.multicore_association.shim.edit.service.ShimServiceUtils;

/**
 * ECP based preference page.
 */
public abstract class AbstractECPPreferencePage<T extends AbstractPreferences> extends PreferencePage {

	protected ShimPreferencesStore store;
	protected T parameter;
	private ErrorMessagePool pool;

	protected ECPSWTView view;
	private Composite container;

	public AbstractECPPreferencePage(EClass eClass) {
		store = ShimPreferencesStore.getInstance();

		@SuppressWarnings("unchecked")
		T object = (T) PreferencesFactory.eINSTANCE.create(eClass);
		parameter = object;

		pool = new ErrorMessagePool(this);
	}

	/**
	 * Creates contents of this page.
	 * 
	 * @param parent
	 *            the parent composite
	 */
	@Override
	public Control createContents(Composite parent) {
		Color systemColor = Display.getCurrent().getSystemColor(
				SWT.COLOR_WIDGET_BACKGROUND);

		container = new Composite(parent, SWT.NONE);
		container.setBackground(systemColor);
		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(false).applyTo(container);

		render();

		return container;
	}

	protected void render() {
		if (view != null) {
			view.dispose();
			view = null;
		}

		try {
			VView vView = ViewProviderHelper.getView(parameter, null);
			ViewModelContext context = ViewModelContextFactory.INSTANCE
				.createViewModelContext(vView, parameter, ShimServiceUtils.getViewModelServiceProvider());

			view = ECPSWTViewRenderer.INSTANCE.render(container, context);
		} catch (ECPRendererException e) {
			e.printStackTrace();
		}
	}
}
