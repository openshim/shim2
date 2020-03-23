/**
 */
package org.multicore_association.shim.model.shim.util;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ShimXMLProcessor extends XMLProcessor {

	/**
	 * Public constructor to instantiate the helper.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ShimXMLProcessor() {
		super((EPackage.Registry.INSTANCE));
		ShimPackage.eINSTANCE.eClass();
	}

	/**
	 * Register for "*" and "xml" file extensions the ShimResourceFactoryImpl factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Map<String, Resource.Factory> getRegistrations() {
		if (registrations == null) {
			super.getRegistrations();
			registrations.put(XML_EXTENSION, new ShimResourceFactoryImpl());
			registrations.put(STAR_EXTENSION, new ShimResourceFactoryImpl());
		}
		return registrations;
	}

} //ShimXMLProcessor
