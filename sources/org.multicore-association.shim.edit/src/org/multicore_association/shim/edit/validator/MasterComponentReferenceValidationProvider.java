/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.validator;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.view.spi.validation.ValidationProvider;
import org.multicore_association.shim.edit.Activator;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * A delegate for handling validation for "name" attribute.
 */
public class MasterComponentReferenceValidationProvider implements ValidationProvider {

	private static final int ERROR_CODE = 103;

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

		return ShimUtils.findChildReferenceByClass(object, ShimPackage.eINSTANCE.getMasterComponent())
				.filter(x -> !x.isContainment())
				.map(x -> validateByAccessType(object, x))
				.orElse(Collections.emptyList());
	}

	public List<Diagnostic> validateByAccessType(EObject object,
			EReference masterComponentReference) {

		MasterComponent masterComponent = (MasterComponent) object.eGet(masterComponentReference);

		Set<AccessType> validAccessTypes = Optional.ofNullable(masterComponent)
				.map(x -> x.getAccessTypeSet())
				.map(x -> (Set<AccessType>) new HashSet<AccessType>(x.getAccessType()))
				.orElse(Collections.emptySet());

		List<EObject> performances = ShimUtils.getObjectsList(object, ShimPackage.eINSTANCE.getPerformance());

		Set<Performance> invalidPerformances = performances.stream()
				.map(x -> (Performance) x)
				.filter(x -> {
					AccessType accessType = x.getAccessTypeRef();
					if (accessType == null) {
						return false;
					}
					return !validAccessTypes.contains(accessType);
				})
//				.peek(x -> x.setAccessTypeRef(null))
				.collect(Collectors.toSet());

		if (invalidPerformances.isEmpty()) {
			return Collections.emptyList();
		}

//		MessageDialog.openWarning(control.getShell(),
//				"Warning", CommonConstants.MESSAGE_INVALID_IDREF);

		return Collections.singletonList(
				new BasicDiagnostic(
						Diagnostic.ERROR,
						Activator.bundle.getSymbolicName(),
						ERROR_CODE,
						CommonConstants.MESSAGE_INVALID_IDREF,
						new Object[] { object, masterComponentReference }
						)
				);
	}
}
