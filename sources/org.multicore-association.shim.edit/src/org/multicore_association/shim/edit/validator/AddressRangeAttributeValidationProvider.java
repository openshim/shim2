/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.validator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.view.spi.validation.ValidationProvider;
import org.multicore_association.shim.edit.Activator;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * A delegate for handling validation for "name" attribute.
 */
public class AddressRangeAttributeValidationProvider implements ValidationProvider {

	private static final int ERROR_CODE = 102;

	private static final String ERROR_MESSAGE_INVALID_START = "Start value must be smaller than end value.";
	private static final String ERROR_MESSAGE_INVALID_END = "End value must be larger than start value.";

	/**
	 * Check the uniqueness.
	 * 
	 * @param object
	 * @return Diagnostic list. If there is no error, this method return a empty list.
	 */
	@Override
	public List<Diagnostic> validate(EObject object) {
		EClass eClass = object.eClass();
		if (!(eClass.getEPackage() instanceof ShimPackage)) {
			return Collections.emptyList();
		}

		EStructuralFeature startFeature = eClass.getEStructuralFeature("start");
		EStructuralFeature endFeature = eClass.getEStructuralFeature("end");

		if (startFeature == null || endFeature == null) {
			return Collections.emptyList();
		}

		EClassifier startType = startFeature.getEType();
		if (!EcoreUtil.equals(startType, ShimPackage.eINSTANCE.getAddressValueType())
				&& !EcoreUtil.equals(startType, ShimPackage.eINSTANCE.getAddressValueObjectType())) {
			return Collections.emptyList();
		}

		EClassifier endType = endFeature.getEType();
		if (!EcoreUtil.equals(endType, ShimPackage.eINSTANCE.getAddressValueType())
				&& !EcoreUtil.equals(endType, ShimPackage.eINSTANCE.getAddressValueObjectType())) {
			return Collections.emptyList();
		}

		return validateAddressRange(object, startFeature, endFeature);
	}

	public List<Diagnostic> validateAddressRange(EObject object,
			EStructuralFeature startFeature, EStructuralFeature endFeature) {

		Object start = object.eGet(startFeature);
		Object end = object.eGet(endFeature);

		if (!(start instanceof Number) || !(end instanceof Number)) {
			return Collections.emptyList();
		}

		if (((Number) start).longValue() < ((Number) end).longValue()) {
			return Collections.emptyList();
		}

		return Arrays.asList(
				(Diagnostic) new BasicDiagnostic(
						Diagnostic.ERROR,
						Activator.bundle.getSymbolicName(),
						ERROR_CODE,
						ERROR_MESSAGE_INVALID_START,
						new Object[] { object, startFeature }),
				(Diagnostic) new BasicDiagnostic(
						Diagnostic.ERROR,
						Activator.bundle.getSymbolicName(),
						ERROR_CODE,
						ERROR_MESSAGE_INVALID_END,
						new Object[] { object, endFeature })
				);
	}
}
