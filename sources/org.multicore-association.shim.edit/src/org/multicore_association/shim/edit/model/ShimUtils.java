/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * Utility methods for Shim model.
 */
public class ShimUtils {

	public static String getName(EObject object) {
		if (object == null) {
			return null;
		}
		return getNameAttribute(object.eClass())
				.filter(x -> object.eIsSet(x))
				.map(x -> EcoreUtil.convertToString(x.getEAttributeType(), object.eGet(x)))
				.orElse(null);
	}

	public static Optional<EAttribute> getNameAttribute(EObject object) {
		if (object instanceof EClass) {
			EStructuralFeature feature = ((EClass) object)
					.getEStructuralFeature(CommonConstants.FIELD_NAME);

			if (!(feature instanceof EAttribute)) {
				return Optional.empty();
			}
			EAttribute attribute = (EAttribute) feature;

			if (!attribute.getEType().getInstanceClass().equals(String.class)) {
				return Optional.empty();
			}

			return Optional.of( attribute);

		} else if (object != null) {
			return getNameAttribute(object.eClass());
		}

		return Optional.empty();
	}

	public static Stream<EReference> getAllChildReferences(EObject object) {
		if (object instanceof EClass) {
			return ((EClass) object)
					.getEAllReferences()
					.stream()
					.filter(x -> x.getEReferenceType().getEPackage() instanceof ShimPackage)
					;
		} else if (object != null) {
			return getAllChildReferences(object.eClass());
		}
		return Stream.empty();
	}

	public static Optional<EReference> findChildReferenceByClass(EObject object, EClass referenceClass) {
		if (object instanceof EClass) {
			return getAllChildReferences((EClass) object)
					.filter(x -> EcoreUtil.equals(x.getEReferenceType(), referenceClass))
					.findAny()
					;
		} else if (object != null) {
			return findChildReferenceByClass(object.eClass(), referenceClass);
		}
		return Optional.empty();
	}

	public static Optional<EObject> findClosestObjectByClass(EObject object, EClass ancestorClass) {
		for (EObject parent = object; parent != null; parent = parent.eContainer()) {
			if (EcoreUtil.equals(parent.eClass(), ancestorClass)) {
				return Optional.of(parent);
			}
		}

		return Optional.empty();
	}

	public static void addOrSet(EObject object, EReference reference, EObject value) {
		if (reference.isMany()) {
			@SuppressWarnings("unchecked")
			List<EObject> list = (List<EObject>) object.eGet(reference);

			if (value == null) {
				list.clear();
			} else {
				list.add(value);
			}
		} else {
			if (value == null) {
				object.eUnset(reference);
			} else {
				object.eSet(reference, value);
			}
		}
	}

	/**
	 * Returns the object list.
	 * 
	 * @param ancestor
	 *            the instance of the ancestor element
	 * @param eClass
	 *            the criterion class
	 * @return the object list
	 */
	public static List<EObject> getObjectsList(EObject ancestor,
			EClass eClass) {
		if (ancestor == null) {
			return Collections.emptyList();
		}

		List<EObject> objectsList = ItemPropertyDescriptor
				.getReachableObjectsOfType(ancestor, eClass)
				.stream()
				.filter(x -> EcoreUtil.isAncestor(ancestor, x))
				.collect(Collectors.toList());

		return objectsList;
	}

	/**
	 * Returns the ancestor shim object.
	 * 
	 * @param object
	 *            the model object
	 * @return the ancestor shim object
	 */
	public static Shim getShim(EObject object) {

		if (object instanceof Shim) {
			return (Shim) object;
		}

		int i = 0;
		for (EObject parent = object.eContainer(); parent != null; parent = object.eContainer()) {
			if (parent == object) {
				throw new IllegalStateException("There is a cycle in the containment hierarchy of " + object);
			}

			if (parent instanceof Shim) {
				return (Shim) parent;
			}

			if (++i > 1000) {
				return getShim(parent);
			}
		}

		return null;
	}

	/**
	 * Creates a new model in generation management.
	 * 
	 * @return the new model
	 */
	public static Shim createShim() {

		Shim shim = (Shim) DefaultDataStore.getDefaultSet(ShimPackage.eINSTANCE.getShim());

		createResource(shim);

		return shim;
	}

	public static void createResource(EObject object) {
		EObject rootObject = EcoreUtil.getRootContainer(object);
		ResourceSet rs = new ResourceSetImpl();

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(new AdapterFactory[] {
			new ReflectiveItemProviderAdapterFactory(),
			new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE) });

		AdapterFactoryEditingDomain domain = new AdapterFactoryEditingDomain(
			adapterFactory, new BasicCommandStack(), rs);
		rs.eAdapters().add(new AdapterFactoryEditingDomain.EditingDomainProvider(domain));

		Resource resource = rs.createResource(URI.createURI("VIRTAUAL_URI"));
		if (resource != null) {
			resource.getContents().add(rootObject);
		}
	}
}
