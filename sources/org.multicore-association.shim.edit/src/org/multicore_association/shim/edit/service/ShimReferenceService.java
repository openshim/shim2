/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.service;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.internal.edit.ECPControlHelper;
import org.eclipse.emf.ecp.spi.common.ui.SelectModelElementWizardFactory;
import org.eclipse.emf.ecp.ui.view.swt.DefaultReferenceService;
import org.eclipse.emf.ecp.ui.view.swt.reference.EObjectSelectionStrategy;
import org.eclipse.emf.ecp.ui.view.swt.reference.ReferenceStrategy;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.ShimPackage;

public class ShimReferenceService extends DefaultReferenceService {

	private EObjectSelectionStrategy eobjectSelectionStrategy = new ShimEObjectSelectionStrategy();
	private ReferenceStrategy referenceStrategy = ReferenceStrategy.DEFAULT;

	@Override
	public void addExistingModelElements(EObject eObject, EReference eReference) {
		final Iterator<EObject> allElements = ItemPropertyDescriptor
				.getReachableObjectsOfType(eObject, eReference.getEType()).iterator();

		Set<EObject> elements = new LinkedHashSet<EObject>();
		while (allElements.hasNext()) {
			elements.add(allElements.next());
		}

		elements = new LinkedHashSet<EObject>(
				eobjectSelectionStrategy.collectExistingObjects(eObject, eReference, elements));
		ECPControlHelper.removeExistingReferences(eObject, eReference, elements);

		final Set<EObject> addedElements = SelectModelElementWizardFactory.openModelElementSelectionDialog(elements,
				eReference.isMany());

		// Don't invoke the Bazaar machinery to find a strategy just to add no elements
		if (!addedElements.isEmpty()) {
			referenceStrategy.addElementsToReference(eObject, eReference, addedElements);
		}
	}

	public static class ShimEObjectSelectionStrategy implements EObjectSelectionStrategy {

		@Override
		public Collection<EObject> collectExistingObjects(EObject owner, EReference reference,
				Collection<EObject> existingObjects) {

			EClass eClass = owner.eClass();
			EClass referenceType = reference.getEReferenceType();

			if (EcoreUtil.equals(referenceType, ShimPackage.eINSTANCE.getAccessType())) {

				return ShimUtils.findClosestObjectByClass(owner, ShimPackage.eINSTANCE.getAccessor())
						.map(x -> Optional.ofNullable(((Accessor) x).getMasterComponentRef()))
						.map(x -> filterByAncestor(x, existingObjects))
						.orElse(existingObjects);
			}

			if (EcoreUtil.equals(referenceType, ShimPackage.eINSTANCE.getSubSpace())) {

				return ShimUtils.findChildReferenceByClass(owner, ShimPackage.eINSTANCE.getAddressSpace())
						.map(x -> Optional.ofNullable((EObject) owner.eGet(x)))
						.map(x -> filterByAncestor(x, existingObjects))
						.orElse(existingObjects);
			}

			if (referenceType.isSuperTypeOf(eClass)) {
				return existingObjects.stream()
						.filter(x -> x != owner)
						.collect(Collectors.toSet());
			}

			return existingObjects;
		}

		private Collection<EObject> filterByAncestor(Optional<? extends EObject> optAncestor,
				Collection<EObject> existingObjects) {

			return optAncestor
					.map(ancestor -> existingObjects.stream()
							.filter(x -> EcoreUtil.isAncestor(ancestor, x))
							.collect(Collectors.toSet()))
					.orElse(Collections.emptySet());
		}
	}
}
