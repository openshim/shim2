/**
 */
package org.multicore_association.shim.edit.model.app.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.multicore_association.shim.edit.model.app.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.AppPackage
 * @generated
 */
public class AppSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppSwitch() {
		if (modelPackage == null) {
			modelPackage = AppPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA: {
			AbstractWizardPageData abstractWizardPageData = (AbstractWizardPageData) theEObject;
			T result = caseAbstractWizardPageData(abstractWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA: {
			AccessTypeWizardPageData accessTypeWizardPageData = (AccessTypeWizardPageData) theEObject;
			T result = caseAccessTypeWizardPageData(accessTypeWizardPageData);
			if (result == null)
				result = caseAbstractWizardPageData(accessTypeWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA: {
			AddressSpaceParameterWizardPageData addressSpaceParameterWizardPageData = (AddressSpaceParameterWizardPageData) theEObject;
			T result = caseAddressSpaceParameterWizardPageData(addressSpaceParameterWizardPageData);
			if (result == null)
				result = caseAbstractWizardPageData(addressSpaceParameterWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AppPackage.CACHE_WIZARD_PAGE_DATA: {
			CacheWizardPageData cacheWizardPageData = (CacheWizardPageData) theEObject;
			T result = caseCacheWizardPageData(cacheWizardPageData);
			if (result == null)
				result = caseAbstractWizardPageData(cacheWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA: {
			CommunicationSetWizardPageData communicationSetWizardPageData = (CommunicationSetWizardPageData) theEObject;
			T result = caseCommunicationSetWizardPageData(communicationSetWizardPageData);
			if (result == null)
				result = caseAbstractWizardPageData(communicationSetWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA: {
			ComponentParameterWizardPageData componentParameterWizardPageData = (ComponentParameterWizardPageData) theEObject;
			T result = caseComponentParameterWizardPageData(componentParameterWizardPageData);
			if (result == null)
				result = caseAbstractWizardPageData(componentParameterWizardPageData);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractWizardPageData(AbstractWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Type Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Type Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessTypeWizardPageData(AccessTypeWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Parameter Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Parameter Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpaceParameterWizardPageData(AddressSpaceParameterWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheWizardPageData(CacheWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Set Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Set Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationSetWizardPageData(CommunicationSetWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Parameter Wizard Page Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Parameter Wizard Page Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentParameterWizardPageData(ComponentParameterWizardPageData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //AppSwitch
