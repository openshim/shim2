/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.view.renderer;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.eclipse.core.databinding.Binding;
import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.internal.swt.controls.NumericalHelper;
import org.eclipse.emf.ecp.edit.spi.swt.util.ECPDialogExecutor;
import org.eclipse.emf.ecp.view.internal.core.swt.MessageKeys;
import org.eclipse.emf.ecp.view.internal.core.swt.renderer.NumberControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.core.swt.AbstractControlSWTRendererUtil;
import org.eclipse.emf.ecp.view.spi.core.swt.renderer.TextControlSWTRenderer;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VDomainModelReference;
import org.eclipse.emf.ecp.view.spi.swt.reporting.RenderingFailedReport;
import org.eclipse.emf.ecp.view.template.model.VTViewTemplateProvider;
import org.eclipse.emf.ecp.view.template.style.mandatory.model.VTMandatoryStyleProperty;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emfforms.spi.common.report.AbstractReport;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.core.services.editsupport.EMFFormsEditSupport;
import org.eclipse.emfforms.spi.core.services.label.EMFFormsLabelProvider;
import org.eclipse.emfforms.spi.core.services.label.NoLabelFoundException;
import org.eclipse.emfforms.spi.localization.EMFFormsLocalizationService;
import org.eclipse.emfforms.spi.swt.core.SWTDataElementIdHelper;
import org.eclipse.jface.databinding.swt.typed.WidgetProperties;
import org.eclipse.jface.dialogs.IDialogLabelKeys;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;

@SuppressWarnings("restriction")
public class AddressValueTypeControlSWTRenderer extends TextControlSWTRenderer  {

	private static final Logger log = ShimLoggerUtil
			.getLogger(AddressValueTypeControlSWTRenderer.class);

	protected EMFFormsLocalizationService localizationService;
	private VTViewTemplateProvider vtViewTemplateProvider;

	private EMFDataBindingContext viewModelDBC;

	@Inject
	public AddressValueTypeControlSWTRenderer(VControl vElement, ViewModelContext viewContext, ReportService reportService,
			EMFFormsDatabinding emfFormsDatabinding, EMFFormsLabelProvider emfFormsLabelProvider,
			VTViewTemplateProvider vtViewTemplateProvider, EMFFormsEditSupport emfFormsEditSupport,
			EMFFormsLocalizationService localizationService) {
	    super(vElement, viewContext, reportService, emfFormsDatabinding, emfFormsLabelProvider, vtViewTemplateProvider,
				emfFormsEditSupport);

	    this.vtViewTemplateProvider = vtViewTemplateProvider;
		this.localizationService = localizationService;

		viewModelDBC = new EMFDataBindingContext();
	}

	@Override
	protected void dispose() {
		viewModelDBC.dispose();

		super.dispose();
	}

	@Override
	protected Object convert(Text text, EDataType attributeType, String value) throws DatabindingFailedException {
		final EStructuralFeature eStructuralFeature = (EStructuralFeature) getModelValue().getValueType();
		final HexNumericalTargetToModelUpdateStrategy converter = new HexNumericalTargetToModelUpdateStrategy(
			eStructuralFeature, getModelValue(), getDataBindingContext(), text);
		return converter.convert(value);
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Binding[] createBindings(final Control control) throws DatabindingFailedException {
		final EStructuralFeature structuralFeature = (EStructuralFeature) getModelValue().getValueType();

		final UpdateValueStrategy targetToModelStrategy = withPreSetValidation(new HexNumericalTargetToModelUpdateStrategy(
			structuralFeature, getModelValue(), getDataBindingContext(),
			(Text) Composite.class.cast(control).getChildren()[0]));
		final HexNumericalModelToTargetUpdateStrategy modelToTargetStrategy = new HexNumericalModelToTargetUpdateStrategy(
			false);
		final Binding binding = bindValue(control, getModelValue(), getDataBindingContext(),
			targetToModelStrategy, modelToTargetStrategy);
		final Binding tooltipBinding = createTooltipBinding(control, getModelValue(), getDataBindingContext(),
			targetToModelStrategy,
			new HexNumericalModelToTargetUpdateStrategy(true));

		return new Binding[] { binding, tooltipBinding };
	}

	private Class<?> getInstanceClass(EStructuralFeature feature) {
		return feature.getEType().getInstanceClass();
	}

	@Override
	protected String getTextFromTextField(Text text, EDataType attributeType) {
		if (!Object.class.isAssignableFrom(attributeType.getInstanceClass())) {
			/* primitive types */
			return super.getTextFromTextField(text, attributeType);
		}
		if (text.getText() != null && text.getText().isEmpty()) {
			/* string is empty, but since we are a non primitive type, return null instead */
			return null;
		}
		return super.getTextFromTextField(text, attributeType);
	}

	@Override
	protected Control createLabel(final Composite parent) {
		Label label = null;

		VDomainModelReference domainModelReference = getVElement().getDomainModelReference();
		@SuppressWarnings("rawtypes")
		IValueProperty valueProperty;
		try {
			valueProperty = getEMFFormsDatabinding().getValueProperty(domainModelReference,
				getViewModelContext().getDomainModel());
		} catch (final DatabindingFailedException ex) {
			getReportService().report(new RenderingFailedReport(ex));
			return label;
		} catch (final IllegalArgumentException ex) {
			getReportService().report(new AbstractReport(ex));
			return label;
		}

		EMFFormsLabelProvider labelProvider = getEMFFormsLabelProvider();
		label = new Label(parent, getLabelStyleBits());
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
				/**
				 * {@inheritDoc}
				 *
				 * @see org.eclipse.core.databinding.UpdateValueStrategy#convert(java.lang.Object)
				 */
				@Override
				public String convert(String value) {
					String extra = ""; //$NON-NLS-1$
					final VTMandatoryStyleProperty mandatoryStyle = getMandatoryStyle();
					final EStructuralFeature structuralFeature = (EStructuralFeature) valueProperty.getValueType();
					if (mandatoryStyle.isHighliteMandatoryFields() && structuralFeature.getLowerBound() > 0) {
						extra = mandatoryStyle.getMandatoryMarker();
					}
					final String result = super.convert(value);
					return result + " (hexadecimal)" + extra;
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

	private VTMandatoryStyleProperty getMandatoryStyle() {
		return AbstractControlSWTRendererUtil
			.getMandatoryStyle(vtViewTemplateProvider, getVElement(), getViewModelContext());
	}

	private class HexNumericalModelToTargetUpdateStrategy extends ModelToTargetUpdateStrategy {

		HexNumericalModelToTargetUpdateStrategy(boolean tooltip) {
			super(tooltip);
		}

		@Override
		public Object convertValue(Object value) {
			if (value == null) {
				return "";
			}
			return String.format(CommonConstants.FORMAT_HEX, value);
		}
	}

	private class HexNumericalTargetToModelUpdateStrategy extends TargetToModelUpdateStrategy {

		private final Text text;
		@SuppressWarnings("rawtypes")
		private final IObservableValue modelValue;
		private final EStructuralFeature eStructuralFeature;
		private final DataBindingContext dataBindingContext;

		HexNumericalTargetToModelUpdateStrategy(EStructuralFeature eStructuralFeature,
			@SuppressWarnings("rawtypes") IObservableValue modelValue, DataBindingContext dataBindingContext, Text text) {
			super(eStructuralFeature.isUnsettable());
			this.eStructuralFeature = eStructuralFeature;
			this.modelValue = modelValue;
			this.dataBindingContext = dataBindingContext;
			this.text = text;
		}

		@Override
		protected Object convertValue(final Object value) {
			Number number = null;
			if (value == null) {
				number = NumericalHelper.getDefaultValue(getInstanceClass(eStructuralFeature));
			} else {
				try {
					number = Long.parseLong((String) value, 16);
				} catch (final NumberFormatException e) {
					log.log(Level.WARNING, "Failed to convert value.", e);
					return getOldValue(value, null);
				}
			}

			return NumericalHelper.numberToInstanceClass(number, getInstanceClass(eStructuralFeature));
		}

		@Override
		protected IStatus doSet(@SuppressWarnings("rawtypes") IObservableValue observableValue, Object value) {
			@SuppressWarnings("unchecked")
			final IStatus status = super.doSet(observableValue, value);
			dataBindingContext.updateTargets();
			return status;
		}

		private Object getOldValue(final Object value, String errorMessage) {
			if (eStructuralFeature.getDefaultValue() == null && (value == null || value.equals(""))) { //$NON-NLS-1$
				return null;
			}
			final Object result = modelValue.getValue();

			if (errorMessage == null) {
				errorMessage = localizationService.getString(NumberControlSWTRenderer.class, MessageKeys.NumericalControl_InvalidNumberWillBeUnset);
			}

			final MessageDialog messageDialog = new MessageDialog(text.getShell(),
				localizationService.getString(NumberControlSWTRenderer.class, MessageKeys.NumericalControl_InvalidNumber), null,
				errorMessage,
				MessageDialog.ERROR,
				new String[] { JFaceResources.getString(IDialogLabelKeys.OK_LABEL_KEY) }, 0);

			new ECPDialogExecutor(messageDialog) {
				@Override
				public void handleResult(int codeResult) {

				}
			}.execute();

			dataBindingContext.updateTargets();
			if (eStructuralFeature.isUnsettable() && result == null) {
				// showUnsetLabel();
				return SetCommand.UNSET_VALUE;
			}
			return result;
		}
	}

	@Override
	protected String getUnsetText() {
		return localizationService.getString(NumberControlSWTRenderer.class, MessageKeys.NumericalControl_NoNumberClickToSetNumber);
	}
}
