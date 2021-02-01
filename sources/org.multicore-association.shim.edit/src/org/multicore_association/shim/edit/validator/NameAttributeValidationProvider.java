/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.validator;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.view.spi.validation.ValidationProvider;
import org.multicore_association.shim.edit.Activator;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * A delegate for handling validation for "name" attribute.
 */
public class NameAttributeValidationProvider implements ValidationProvider {

	private static final int ERROR_CODE = 101;

	private static final String ERROR_MESSAGE_INVALID_NAME = "The Name (%s) already exists in same parent.";

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

		Collection<EObject> siblings = collectSiblings(object);

		return ShimUtils.getNameAttribute(object).flatMap(attribute -> {
			Object v = object.eGet(attribute);
			if (v instanceof String) {
				return Optional.of(validate(object, attribute, (String) v, siblings));
			}
			return Optional.empty();
		})
		.orElse(Collections.emptyList());
	}

	public static List<Diagnostic> validate(EObject object,
			EAttribute attribute, String newValue, Collection<EObject> siblings) {

		boolean isDuplicated = siblings.stream()
				.filter(x -> !EcoreUtil.equals(object, x))
				.map(x -> x.eGet(attribute))
				.anyMatch(x -> newValue.equals(x));

		if (!isDuplicated) {
			return Collections.emptyList();
		}

		String message = String.format(
				ERROR_MESSAGE_INVALID_NAME,
				EcoreUtil.convertToString(attribute.getEAttributeType(), newValue));

		Object[] data = new Object[] { object, attribute };

		return Collections.singletonList(
				(Diagnostic) new BasicDiagnostic(
						Diagnostic.WARNING,
						Activator.bundle.getSymbolicName(),
						ERROR_CODE,
						message,
						data)
				);
	}

	private Collection<EObject> collectSiblings(EObject object) {
		EObject container = object.eContainer();
		EStructuralFeature feature = object.eContainingFeature();

		if (container != null && feature != null) {
			Object o = container.eGet(feature);
			if (o instanceof List) {
				@SuppressWarnings("unchecked")
				List<EObject> list = (List<EObject>) o;
				return list;
			} else if (o instanceof EObject) {
				List<EObject> list = Collections.singletonList((EObject) o);
				return list;
			}
		}

		return Collections.emptyList();
	}
}
