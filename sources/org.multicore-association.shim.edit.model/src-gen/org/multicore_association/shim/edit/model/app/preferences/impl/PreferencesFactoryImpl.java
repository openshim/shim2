/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.multicore_association.shim.edit.model.app.preferences.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreferencesFactoryImpl extends EFactoryImpl implements PreferencesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PreferencesFactory init() {
		try {
			PreferencesFactory thePreferencesFactory = (PreferencesFactory) EPackage.Registry.INSTANCE
					.getEFactory(PreferencesPackage.eNS_URI);
			if (thePreferencesFactory != null) {
				return thePreferencesFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PreferencesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferencesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case PreferencesPackage.ACCESS_TYPE_PREFERENCES:
			return createAccessTypePreferences();
		case PreferencesPackage.ADDRESS_SPACE_PREFERENCES:
			return createAddressSpacePreferences();
		case PreferencesPackage.CACHE_DATA_PREFERENCES:
			return createCacheDataPreferences();
		case PreferencesPackage.CACHE_DATA_UNIT_PREFERENCES:
			return createCacheDataUnitPreferences();
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES:
			return createCommunicationSetPreferences();
		case PreferencesPackage.COMPONENT_SET_PREFERENCES:
			return createComponentSetPreferences();
		case PreferencesPackage.COMPONENTS_PREFERENCES:
			return createComponentsPreferences();
		case PreferencesPackage.LATENCY_PREFERENCES:
			return createLatencyPreferences();
		case PreferencesPackage.MASTER_COMPONENT_PREFERENCES:
			return createMasterComponentPreferences();
		case PreferencesPackage.PITCH_PREFERENCES:
			return createPitchPreferences();
		case PreferencesPackage.SAVE_POLICY_PREFERENCES:
			return createSavePolicyPreferences();
		case PreferencesPackage.SHIM_PREFERENCES:
			return createShimPreferences();
		case PreferencesPackage.SLAVE_COMPONENT_PREFERENCES:
			return createSlaveComponentPreferences();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case PreferencesPackage.CACHE_TYPE_SELECT:
			return createCacheTypeSelectFromString(eDataType, initialValue);
		case PreferencesPackage.SAVE_POLICY_TYPE:
			return createSavePolicyTypeFromString(eDataType, initialValue);
		case PreferencesPackage.CACHE_TYPE_SELECT_OBJECT:
			return createCacheTypeSelectObjectFromString(eDataType, initialValue);
		case PreferencesPackage.SAVE_POLICY_TYPE_OBJECT:
			return createSavePolicyTypeObjectFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case PreferencesPackage.CACHE_TYPE_SELECT:
			return convertCacheTypeSelectToString(eDataType, instanceValue);
		case PreferencesPackage.SAVE_POLICY_TYPE:
			return convertSavePolicyTypeToString(eDataType, instanceValue);
		case PreferencesPackage.CACHE_TYPE_SELECT_OBJECT:
			return convertCacheTypeSelectObjectToString(eDataType, instanceValue);
		case PreferencesPackage.SAVE_POLICY_TYPE_OBJECT:
			return convertSavePolicyTypeObjectToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessTypePreferences createAccessTypePreferences() {
		AccessTypePreferencesImpl accessTypePreferences = new AccessTypePreferencesImpl();
		return accessTypePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressSpacePreferences createAddressSpacePreferences() {
		AddressSpacePreferencesImpl addressSpacePreferences = new AddressSpacePreferencesImpl();
		return addressSpacePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataPreferences createCacheDataPreferences() {
		CacheDataPreferencesImpl cacheDataPreferences = new CacheDataPreferencesImpl();
		return cacheDataPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataUnitPreferences createCacheDataUnitPreferences() {
		CacheDataUnitPreferencesImpl cacheDataUnitPreferences = new CacheDataUnitPreferencesImpl();
		return cacheDataUnitPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationSetPreferences createCommunicationSetPreferences() {
		CommunicationSetPreferencesImpl communicationSetPreferences = new CommunicationSetPreferencesImpl();
		return communicationSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSetPreferences createComponentSetPreferences() {
		ComponentSetPreferencesImpl componentSetPreferences = new ComponentSetPreferencesImpl();
		return componentSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsPreferences createComponentsPreferences() {
		ComponentsPreferencesImpl componentsPreferences = new ComponentsPreferencesImpl();
		return componentsPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatencyPreferences createLatencyPreferences() {
		LatencyPreferencesImpl latencyPreferences = new LatencyPreferencesImpl();
		return latencyPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MasterComponentPreferences createMasterComponentPreferences() {
		MasterComponentPreferencesImpl masterComponentPreferences = new MasterComponentPreferencesImpl();
		return masterComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PitchPreferences createPitchPreferences() {
		PitchPreferencesImpl pitchPreferences = new PitchPreferencesImpl();
		return pitchPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SavePolicyPreferences createSavePolicyPreferences() {
		SavePolicyPreferencesImpl savePolicyPreferences = new SavePolicyPreferencesImpl();
		return savePolicyPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShimPreferences createShimPreferences() {
		ShimPreferencesImpl shimPreferences = new ShimPreferencesImpl();
		return shimPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlaveComponentPreferences createSlaveComponentPreferences() {
		SlaveComponentPreferencesImpl slaveComponentPreferences = new SlaveComponentPreferencesImpl();
		return slaveComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheTypeSelect createCacheTypeSelectFromString(EDataType eDataType, String initialValue) {
		CacheTypeSelect result = CacheTypeSelect.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeSelectToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SavePolicyType createSavePolicyTypeFromString(EDataType eDataType, String initialValue) {
		SavePolicyType result = SavePolicyType.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSavePolicyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CacheTypeSelect createCacheTypeSelectObjectFromString(EDataType eDataType, String initialValue) {
		return createCacheTypeSelectFromString(PreferencesPackage.Literals.CACHE_TYPE_SELECT, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCacheTypeSelectObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCacheTypeSelectToString(PreferencesPackage.Literals.CACHE_TYPE_SELECT, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SavePolicyType createSavePolicyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSavePolicyTypeFromString(PreferencesPackage.Literals.SAVE_POLICY_TYPE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSavePolicyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSavePolicyTypeToString(PreferencesPackage.Literals.SAVE_POLICY_TYPE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreferencesPackage getPreferencesPackage() {
		return (PreferencesPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PreferencesPackage getPackage() {
		return PreferencesPackage.eINSTANCE;
	}

} //PreferencesFactoryImpl
