/**
 */
package org.multicore_association.shim.edit.model.app.preferences.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.multicore_association.shim.edit.model.app.preferences.*;

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
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage
 * @generated
 */
public class PreferencesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PreferencesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferencesSwitch() {
		if (modelPackage == null) {
			modelPackage = PreferencesPackage.eINSTANCE;
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
		case PreferencesPackage.ABSTRACT_PREFERENCES: {
			AbstractPreferences abstractPreferences = (AbstractPreferences) theEObject;
			T result = caseAbstractPreferences(abstractPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.ABSTRACT_COMPONENT_PREFERENCES: {
			AbstractComponentPreferences abstractComponentPreferences = (AbstractComponentPreferences) theEObject;
			T result = caseAbstractComponentPreferences(abstractComponentPreferences);
			if (result == null)
				result = caseAbstractPreferences(abstractComponentPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.ABSTRACT_PERFORMANCE_PREFERENCES: {
			AbstractPerformancePreferences abstractPerformancePreferences = (AbstractPerformancePreferences) theEObject;
			T result = caseAbstractPerformancePreferences(abstractPerformancePreferences);
			if (result == null)
				result = caseAbstractPreferences(abstractPerformancePreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES: {
			AccessTypePreferences accessTypePreferences = (AccessTypePreferences) theEObject;
			T result = caseAccessTypePreferences(accessTypePreferences);
			if (result == null)
				result = caseAbstractComponentPreferences(accessTypePreferences);
			if (result == null)
				result = caseAbstractPreferences(accessTypePreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES: {
			AddressSpacePreferences addressSpacePreferences = (AddressSpacePreferences) theEObject;
			T result = caseAddressSpacePreferences(addressSpacePreferences);
			if (result == null)
				result = caseAbstractPreferences(addressSpacePreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.CACHE_DATA_PREFERENCES: {
			CacheDataPreferences cacheDataPreferences = (CacheDataPreferences) theEObject;
			T result = caseCacheDataPreferences(cacheDataPreferences);
			if (result == null)
				result = caseAbstractPreferences(cacheDataPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES: {
			CacheDataUnitPreferences cacheDataUnitPreferences = (CacheDataUnitPreferences) theEObject;
			T result = caseCacheDataUnitPreferences(cacheDataUnitPreferences);
			if (result == null)
				result = caseAbstractPreferences(cacheDataUnitPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES: {
			CommunicationSetPreferences communicationSetPreferences = (CommunicationSetPreferences) theEObject;
			T result = caseCommunicationSetPreferences(communicationSetPreferences);
			if (result == null)
				result = caseAbstractPreferences(communicationSetPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.COMPONENT_SET_PREFERENCES: {
			ComponentSetPreferences componentSetPreferences = (ComponentSetPreferences) theEObject;
			T result = caseComponentSetPreferences(componentSetPreferences);
			if (result == null)
				result = caseAbstractComponentPreferences(componentSetPreferences);
			if (result == null)
				result = caseAbstractPreferences(componentSetPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.COMPONENTS_PREFERENCES: {
			ComponentsPreferences componentsPreferences = (ComponentsPreferences) theEObject;
			T result = caseComponentsPreferences(componentsPreferences);
			if (result == null)
				result = caseAbstractPreferences(componentsPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.LATENCY_PREFERENCES: {
			LatencyPreferences latencyPreferences = (LatencyPreferences) theEObject;
			T result = caseLatencyPreferences(latencyPreferences);
			if (result == null)
				result = caseAbstractPerformancePreferences(latencyPreferences);
			if (result == null)
				result = caseAbstractPreferences(latencyPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES: {
			MasterComponentPreferences masterComponentPreferences = (MasterComponentPreferences) theEObject;
			T result = caseMasterComponentPreferences(masterComponentPreferences);
			if (result == null)
				result = caseAbstractComponentPreferences(masterComponentPreferences);
			if (result == null)
				result = caseAbstractPreferences(masterComponentPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.PITCH_PREFERENCES: {
			PitchPreferences pitchPreferences = (PitchPreferences) theEObject;
			T result = casePitchPreferences(pitchPreferences);
			if (result == null)
				result = caseAbstractPerformancePreferences(pitchPreferences);
			if (result == null)
				result = caseAbstractPreferences(pitchPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.SAVE_POLICY_PREFERENCES: {
			SavePolicyPreferences savePolicyPreferences = (SavePolicyPreferences) theEObject;
			T result = caseSavePolicyPreferences(savePolicyPreferences);
			if (result == null)
				result = caseAbstractPreferences(savePolicyPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.SHIM_PREFERENCES: {
			ShimPreferences shimPreferences = (ShimPreferences) theEObject;
			T result = caseShimPreferences(shimPreferences);
			if (result == null)
				result = caseAbstractPreferences(shimPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PreferencesPackage.SLAVE_COMPONENT_PREFERENCES: {
			SlaveComponentPreferences slaveComponentPreferences = (SlaveComponentPreferences) theEObject;
			T result = caseSlaveComponentPreferences(slaveComponentPreferences);
			if (result == null)
				result = caseAbstractComponentPreferences(slaveComponentPreferences);
			if (result == null)
				result = caseAbstractPreferences(slaveComponentPreferences);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPreferences(AbstractPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Component Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Component Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractComponentPreferences(AbstractComponentPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Performance Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Performance Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractPerformancePreferences(AbstractPerformancePreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Access Type Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Access Type Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAccessTypePreferences(AccessTypePreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Space Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Space Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressSpacePreferences(AddressSpacePreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Data Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Data Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheDataPreferences(CacheDataPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache Data Unit Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache Data Unit Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCacheDataUnitPreferences(CacheDataUnitPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Communication Set Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Communication Set Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommunicationSetPreferences(CommunicationSetPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Component Set Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Component Set Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentSetPreferences(ComponentSetPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Components Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Components Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseComponentsPreferences(ComponentsPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Latency Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Latency Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLatencyPreferences(LatencyPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Master Component Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Master Component Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMasterComponentPreferences(MasterComponentPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pitch Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pitch Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePitchPreferences(PitchPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Save Policy Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Save Policy Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSavePolicyPreferences(SavePolicyPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shim Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shim Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShimPreferences(ShimPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Slave Component Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Slave Component Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSlaveComponentPreferences(SlaveComponentPreferences object) {
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

} //PreferencesSwitch
