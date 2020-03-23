/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.view.renderer;

import org.eclipse.core.databinding.property.value.IValueProperty;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.model.VControl;
import org.eclipse.emf.ecp.view.spi.model.VElement;
import org.eclipse.emfforms.spi.common.report.ReportService;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedException;
import org.eclipse.emfforms.spi.core.services.databinding.DatabindingFailedReport;
import org.eclipse.emfforms.spi.core.services.databinding.EMFFormsDatabinding;
import org.eclipse.emfforms.spi.swt.core.AbstractSWTRenderer;
import org.eclipse.emfforms.spi.swt.core.di.EMFFormsDIRendererService;
import org.multicore_association.shim.model.shim.ShimPackage;

public class AddressValueTypeControlSWTRendererService implements EMFFormsDIRendererService<VControl> {

	private static final double CONSTANT_PRIORITY = 3;

	private EMFFormsDatabinding databindingService;
	private ReportService reportService;

	protected void setEMFFormsDatabinding(EMFFormsDatabinding databindingService) {
		this.databindingService = databindingService;
	}

	protected void setReportService(ReportService reportService) {
		this.reportService = reportService;
	}

	@Override
	public double isApplicable(VElement vElement, ViewModelContext viewModelContext) {
		if (!(vElement instanceof VControl)) {
			return NOT_APPLICABLE;
		}
		VControl control = (VControl) vElement;

		IValueProperty<?, ?> valueProperty;
		try {
			valueProperty = databindingService.getValueProperty(control.getDomainModelReference(),
					viewModelContext.getDomainModel());
		} catch (final DatabindingFailedException ex) {
			reportService.report(new DatabindingFailedReport(ex));
			return NOT_APPLICABLE;
		}

		Object valueType = valueProperty.getValueType();

		if (!(valueType instanceof EStructuralFeature)) {
			return NOT_APPLICABLE;
		}
		EStructuralFeature feature = (EStructuralFeature) valueType;

		if (feature .isMany()) {
			return NOT_APPLICABLE;
		}

		EClassifier eType = feature.getEType();

		if (EcoreUtil.equals(eType, ShimPackage.eINSTANCE.getAddressValueType())
				|| EcoreUtil.equals(eType, ShimPackage.eINSTANCE.getAddressValueObjectType())) {
			return CONSTANT_PRIORITY;
		}

		return NOT_APPLICABLE;
	}

	@Override
	public Class<? extends AbstractSWTRenderer<VControl>> getRendererClass() {
		return AddressValueTypeControlSWTRenderer.class;
	}
}
