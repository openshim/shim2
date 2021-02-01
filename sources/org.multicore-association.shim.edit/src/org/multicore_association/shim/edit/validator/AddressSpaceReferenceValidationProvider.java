/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.validator;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.view.spi.validation.ValidationProvider;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SubSpace;

/**
 * A delegate for handling validation for "name" attribute.
 */
public class AddressSpaceReferenceValidationProvider implements ValidationProvider {

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

		EReference addressSpaceReference = null;
		EReference subSpaceReference = null;

		for (EReference reference : eClass.getEAllReferences()) {
			if (reference.isMany() || reference.isContainment()) {
				continue;
			}

			EClass referenceType = reference.getEReferenceType();

			if (ShimPackage.eINSTANCE.getAddressSpace().isSuperTypeOf(referenceType)) {
				addressSpaceReference = reference;
			} else if (ShimPackage.eINSTANCE.getSubSpace().isSuperTypeOf(referenceType)) {
				subSpaceReference = reference;
			}

			if (addressSpaceReference != null && subSpaceReference != null) {
				return validateSubSpace(object, addressSpaceReference, subSpaceReference);
			}
		}

		return Collections.emptyList();
	}

	public List<Diagnostic> validateSubSpace(EObject object,
			EReference addressSpaceReference, EReference subSpaceReference) {

		AddressSpace addressSpace = (AddressSpace) object.eGet(addressSpaceReference);
		SubSpace subSpaceObject = (SubSpace) object.eGet(subSpaceReference);

		if (addressSpace == null) {
			if (subSpaceObject != null) {
				object.eSet(subSpaceReference, null);
			}
			return Collections.emptyList();
		}

		if (subSpaceObject == null) {
			return Collections.emptyList();
		}

		List<EObject> subSpaces = ShimUtils.getObjectsList(addressSpace, subSpaceReference.getEReferenceType());

		if (subSpaces.isEmpty()) {
			object.eSet(subSpaceReference, null);
		} else if (!subSpaces.contains(subSpaceObject)) {
			object.eSet(subSpaceReference, subSpaces.get(0));
		}

		return Collections.emptyList();
	}
}
