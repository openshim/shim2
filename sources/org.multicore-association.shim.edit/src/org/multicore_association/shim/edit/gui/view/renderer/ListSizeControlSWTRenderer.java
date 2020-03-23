/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.view.renderer;

import java.util.List;

import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFUpdateValueStrategy;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.SimpleControlSWTControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.swt.reporting.RenderingFailedReport;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.emfforms.spi.core.services.label.NoLabelFoundException;
import org.eclipse.emfforms.spi.swt.core.SWTDataElementIdHelper;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ListSizeControlSWTRenderer extends SimpleControlSWTControlSWTRenderer {

	private EMFDataBindingContext viewModelDBC;

	@Inject
	public ListSizeControlSWTRenderer(VControl vElement, ViewModelContext viewContext, ReportService reportService,
			EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
			VTViewTemplateProvider vtViewTemplateProvider) {
	    super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider);

		this.viewModelDBC = new EMFDataBindingContext();
	}

	@Override
	protected void dispose() {
		super.dispose();

		if (viewModelDBC != null) {
			viewModelDBC.dispose();
			viewModelDBC = null;
		}
	}

	@Override
	protected Binding[] createBindings(Control control) throws DatabindingFailedException {
		Control controlToObserve = Composite.class.cast(control).getChildren()[0];
		IObservableValue<String> value = WidgetProperties.text().observe(controlToObserve);

		ModelToTargetUpdateStrategy modelToTarget = new ModelToTargetUpdateStrategy();

		@SuppressWarnings("unchecked")
		Binding binding = getDataBindingContext().bindValue(value, getModelValue(), null, modelToTarget);

		return new Binding[] { binding };
	}

	@Override
	protected Control createSWTControl(Composite parent) throws DatabindingFailedException {
		Composite composite = new Composite(parent, SWT.NONE);
		GridLayoutFactory.fillDefaults().numColumns(1).equalWidth(true).applyTo(composite);

		Text text = new Text(composite, SWT.BORDER);
		SWTDataElementIdHelper.setElementIdDataForVControl(text, getVElement(), getViewModelContext());

		text.setEnabled(false);

		GridDataFactory.fillDefaults().align(SWT.FILL, SWT.CENTER).grab(true, true).span(1, 1).applyTo(text);

		return composite;
	}

	@Override
	protected String getUnsetText() {
		return "";
	}

	@Override
	protected EMFFormsLabelProvider getEMFFormsLabelProvider() {
		return super.getEMFFormsLabelProvider();
	}

	@Override
	protected Control createLabel(final Composite parent) {
		VDomainModelReference domainModelReference = getVElement().getDomainModelReference();

		EMFFormsLabelProvider labelProvider = getEMFFormsLabelProvider();

		Label label = new Label(parent, getLabelStyleBits());
		label.setData(CUSTOM_VARIANT, "org_eclipse_emf_ecp_control_label"); //$NON-NLS-1$
		SWTDataElementIdHelper.setElementIdDataWithSubId(label, getVElement(), "control_label", //$NON-NLS-1$
				getViewModelContext());
		label.setBackground(parent.getBackground());

		EObject rootObject = getViewModelContext().getDomainModel();
		try {
			IObservableValue<String> textObservable = WidgetProperties.text().observe(label);
			@SuppressWarnings("unchecked")
			IObservableValue<String> displayNameObservable = labelProvider.getDisplayName(domainModelReference,
					rootObject);

			viewModelDBC.bindValue(textObservable, displayNameObservable, null, new UpdateValueStrategy<String, String>() {
				@Override
				public String convert(String value) {
					String result = super.convert(value);

					return "Number of " + result;
				}
			});
			IObservableValue<?> tooltipObservable = WidgetProperties.tooltipText().observe(label);
			IObservableValue<?> descriptionObservable = labelProvider.getDescription(domainModelReference,
				rootObject);
			viewModelDBC.bindValue(tooltipObservable, descriptionObservable);
		} catch (final NoLabelFoundException e) {
			// FIXME Expectations?
			getReportService().report(new RenderingFailedReport(e));
		}
		return label;
	}

	private class ModelToTargetUpdateStrategy extends EMFUpdateValueStrategy {
		@Override
		public Object convert(Object value) {
			if (value instanceof List) {
				return Integer.toString(((List<?>) value).size());
			}
			return "";
		}		
	}
}
