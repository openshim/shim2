/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.multicore_association.shim.edit.model.app.AppPackage;

import org.multicore_association.shim.edit.model.app.impl.AppPackageImpl;

import org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences;
import org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences;
import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheTypeSelect;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PitchPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesFactory;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyType;
import org.multicore_association.shim.edit.model.app.preferences.ShimPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;

import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PreferencesPackageImpl extends EPackageImpl implements PreferencesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractComponentPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractPerformancePreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessTypePreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressSpacePreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheDataPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cacheDataUnitPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationSetPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentSetPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass componentsPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass latencyPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass masterComponentPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pitchPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass savePolicyPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shimPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slaveComponentPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cacheTypeSelectEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum savePolicyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cacheTypeSelectObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType savePolicyTypeObjectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PreferencesPackageImpl() {
		super(eNS_URI, PreferencesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link PreferencesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PreferencesPackage init() {
		if (isInited)
			return (PreferencesPackage) EPackage.Registry.INSTANCE.getEPackage(PreferencesPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPreferencesPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PreferencesPackageImpl thePreferencesPackage = registeredPreferencesPackage instanceof PreferencesPackageImpl
				? (PreferencesPackageImpl) registeredPreferencesPackage
				: new PreferencesPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		ShimPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);
		AppPackageImpl theAppPackage = (AppPackageImpl) (registeredPackage instanceof AppPackageImpl ? registeredPackage
				: AppPackage.eINSTANCE);

		// Create package meta-data objects
		thePreferencesPackage.createPackageContents();
		theAppPackage.createPackageContents();

		// Initialize created meta-data
		thePreferencesPackage.initializePackageContents();
		theAppPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePreferencesPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PreferencesPackage.eNS_URI, thePreferencesPackage);
		return thePreferencesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPreferences() {
		return abstractPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractComponentPreferences() {
		return abstractComponentPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractComponentPreferences_BaseName() {
		return (EAttribute) abstractComponentPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstractPerformancePreferences() {
		return abstractPerformancePreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPerformancePreferences_Best() {
		return (EAttribute) abstractPerformancePreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPerformancePreferences_Typical() {
		return (EAttribute) abstractPerformancePreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstractPerformancePreferences_Worst() {
		return (EAttribute) abstractPerformancePreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAccessTypePreferences() {
		return accessTypePreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckR() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckW() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckRW() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckRWX() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckRX() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_CheckX() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_AccessByteSize() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAccessTypePreferences_NBurst() {
		return (EAttribute) accessTypePreferencesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddressSpacePreferences() {
		return addressSpacePreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpacePreferences_NumberSubSpace() {
		return (EAttribute) addressSpacePreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpacePreferences_SizeSubSpace() {
		return (EAttribute) addressSpacePreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpacePreferences_AddressSpaceName() {
		return (EAttribute) addressSpacePreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpacePreferences_SubSpaceName() {
		return (EAttribute) addressSpacePreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddressSpacePreferences_DontConnect() {
		return (EAttribute) addressSpacePreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheDataPreferences() {
		return cacheDataPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataPreferences_CacheType() {
		return (EAttribute) cacheDataPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheDataPreferences_Data() {
		return (EReference) cacheDataPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCacheDataPreferences_Instruction() {
		return (EReference) cacheDataPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCacheDataUnitPreferences() {
		return cacheDataUnitPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_CacheCoherenecy() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_Size() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_SizeUnit() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_NWay() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_LineSize() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCacheDataUnitPreferences_LockDownType() {
		return (EAttribute) cacheDataUnitPreferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationSetPreferences() {
		return communicationSetPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_CheckInterruptCommunication() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_CheckEventCommunication() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_CheckFIFOCommunication() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_FifoDataSize() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_FifoDataSizeUnit() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_QueueSize() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_CheckSharedMemoryCommunication() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_SharedMemoryDataSize() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_SharedMemoryDataSizeUnit() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_OperationType() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_CheckSharedRegisterCommunication() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_SharedRegisterDataSize() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_SharedRegisterDataSizeUnit() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_NRegister() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationSetPreferences_DontConnect() {
		return (EAttribute) communicationSetPreferencesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentSetPreferences() {
		return componentSetPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComponentsPreferences() {
		return componentsPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsPreferences_SystemName() {
		return (EAttribute) componentsPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsPreferences_NumberMaster() {
		return (EAttribute) componentsPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsPreferences_NumberSlave() {
		return (EAttribute) componentsPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsPreferences_NumberComponent() {
		return (EAttribute) componentsPreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getComponentsPreferences_Clock() {
		return (EAttribute) componentsPreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLatencyPreferences() {
		return latencyPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMasterComponentPreferences() {
		return masterComponentPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_Type() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_Endian() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_Arch() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_ArchOpt() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_NChannel() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_NThread() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_CheckClockForMaster() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMasterComponentPreferences_Clock() {
		return (EAttribute) masterComponentPreferencesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPitchPreferences() {
		return pitchPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSavePolicyPreferences() {
		return savePolicyPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSavePolicyPreferences_SavePolicy() {
		return (EAttribute) savePolicyPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShimPreferences() {
		return shimPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_ComponentsPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_MasterComponentPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_SlaveComponentPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_ComponentSetPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_AddressSpacePreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_CommunicationSetPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_CacheDataPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_AccessTypePreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_LatencyPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_PitchPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShimPreferences_SavePolicyPreferences() {
		return (EReference) shimPreferencesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSlaveComponentPreferences() {
		return slaveComponentPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlaveComponentPreferences_Size() {
		return (EAttribute) slaveComponentPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlaveComponentPreferences_SizeUnit() {
		return (EAttribute) slaveComponentPreferencesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSlaveComponentPreferences_RwType() {
		return (EAttribute) slaveComponentPreferencesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCacheTypeSelect() {
		return cacheTypeSelectEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSavePolicyType() {
		return savePolicyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getCacheTypeSelectObject() {
		return cacheTypeSelectObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSavePolicyTypeObject() {
		return savePolicyTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PreferencesFactory getPreferencesFactory() {
		return (PreferencesFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		abstractPreferencesEClass = createEClass(ABSTRACT_PREFERENCES);

		abstractComponentPreferencesEClass = createEClass(ABSTRACT_COMPONENT_PREFERENCES);
		createEAttribute(abstractComponentPreferencesEClass, ABSTRACT_COMPONENT_PREFERENCES__BASE_NAME);

		abstractPerformancePreferencesEClass = createEClass(ABSTRACT_PERFORMANCE_PREFERENCES);
		createEAttribute(abstractPerformancePreferencesEClass, ABSTRACT_PERFORMANCE_PREFERENCES__BEST);
		createEAttribute(abstractPerformancePreferencesEClass, ABSTRACT_PERFORMANCE_PREFERENCES__TYPICAL);
		createEAttribute(abstractPerformancePreferencesEClass, ABSTRACT_PERFORMANCE_PREFERENCES__WORST);

		accessTypePreferencesEClass = createEClass(ACCESS_TYPE_PREFERENCES);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_R);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_W);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_RW);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_RWX);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_RX);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__CHECK_X);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__ACCESS_BYTE_SIZE);
		createEAttribute(accessTypePreferencesEClass, ACCESS_TYPE_PREFERENCES__NBURST);

		addressSpacePreferencesEClass = createEClass(ADDRESS_SPACE_PREFERENCES);
		createEAttribute(addressSpacePreferencesEClass, ADDRESS_SPACE_PREFERENCES__NUMBER_SUB_SPACE);
		createEAttribute(addressSpacePreferencesEClass, ADDRESS_SPACE_PREFERENCES__SIZE_SUB_SPACE);
		createEAttribute(addressSpacePreferencesEClass, ADDRESS_SPACE_PREFERENCES__ADDRESS_SPACE_NAME);
		createEAttribute(addressSpacePreferencesEClass, ADDRESS_SPACE_PREFERENCES__SUB_SPACE_NAME);
		createEAttribute(addressSpacePreferencesEClass, ADDRESS_SPACE_PREFERENCES__DONT_CONNECT);

		cacheDataPreferencesEClass = createEClass(CACHE_DATA_PREFERENCES);
		createEAttribute(cacheDataPreferencesEClass, CACHE_DATA_PREFERENCES__CACHE_TYPE);
		createEReference(cacheDataPreferencesEClass, CACHE_DATA_PREFERENCES__DATA);
		createEReference(cacheDataPreferencesEClass, CACHE_DATA_PREFERENCES__INSTRUCTION);

		cacheDataUnitPreferencesEClass = createEClass(CACHE_DATA_UNIT_PREFERENCES);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__CACHE_COHERENECY);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__SIZE);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__SIZE_UNIT);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__NWAY);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__LINE_SIZE);
		createEAttribute(cacheDataUnitPreferencesEClass, CACHE_DATA_UNIT_PREFERENCES__LOCK_DOWN_TYPE);

		communicationSetPreferencesEClass = createEClass(COMMUNICATION_SET_PREFERENCES);
		createEAttribute(communicationSetPreferencesEClass,
				COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE);
		createEAttribute(communicationSetPreferencesEClass,
				COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE);
		createEAttribute(communicationSetPreferencesEClass,
				COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE);
		createEAttribute(communicationSetPreferencesEClass,
				COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE);
		createEAttribute(communicationSetPreferencesEClass,
				COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__NREGISTER);
		createEAttribute(communicationSetPreferencesEClass, COMMUNICATION_SET_PREFERENCES__DONT_CONNECT);

		componentSetPreferencesEClass = createEClass(COMPONENT_SET_PREFERENCES);

		componentsPreferencesEClass = createEClass(COMPONENTS_PREFERENCES);
		createEAttribute(componentsPreferencesEClass, COMPONENTS_PREFERENCES__SYSTEM_NAME);
		createEAttribute(componentsPreferencesEClass, COMPONENTS_PREFERENCES__NUMBER_MASTER);
		createEAttribute(componentsPreferencesEClass, COMPONENTS_PREFERENCES__NUMBER_SLAVE);
		createEAttribute(componentsPreferencesEClass, COMPONENTS_PREFERENCES__NUMBER_COMPONENT);
		createEAttribute(componentsPreferencesEClass, COMPONENTS_PREFERENCES__CLOCK);

		latencyPreferencesEClass = createEClass(LATENCY_PREFERENCES);

		masterComponentPreferencesEClass = createEClass(MASTER_COMPONENT_PREFERENCES);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__TYPE);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__ENDIAN);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__ARCH);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__ARCH_OPT);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__NCHANNEL);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__NTHREAD);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__CHECK_CLOCK_FOR_MASTER);
		createEAttribute(masterComponentPreferencesEClass, MASTER_COMPONENT_PREFERENCES__CLOCK);

		pitchPreferencesEClass = createEClass(PITCH_PREFERENCES);

		savePolicyPreferencesEClass = createEClass(SAVE_POLICY_PREFERENCES);
		createEAttribute(savePolicyPreferencesEClass, SAVE_POLICY_PREFERENCES__SAVE_POLICY);

		shimPreferencesEClass = createEClass(SHIM_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__COMPONENTS_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__CACHE_DATA_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__LATENCY_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__PITCH_PREFERENCES);
		createEReference(shimPreferencesEClass, SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES);

		slaveComponentPreferencesEClass = createEClass(SLAVE_COMPONENT_PREFERENCES);
		createEAttribute(slaveComponentPreferencesEClass, SLAVE_COMPONENT_PREFERENCES__SIZE);
		createEAttribute(slaveComponentPreferencesEClass, SLAVE_COMPONENT_PREFERENCES__SIZE_UNIT);
		createEAttribute(slaveComponentPreferencesEClass, SLAVE_COMPONENT_PREFERENCES__RW_TYPE);

		// Create enums
		cacheTypeSelectEEnum = createEEnum(CACHE_TYPE_SELECT);
		savePolicyTypeEEnum = createEEnum(SAVE_POLICY_TYPE);

		// Create data types
		cacheTypeSelectObjectEDataType = createEDataType(CACHE_TYPE_SELECT_OBJECT);
		savePolicyTypeObjectEDataType = createEDataType(SAVE_POLICY_TYPE_OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ShimPackage theShimPackage = (ShimPackage) EPackage.Registry.INSTANCE.getEPackage(ShimPackage.eNS_URI);
		AppPackage theAppPackage = (AppPackage) EPackage.Registry.INSTANCE.getEPackage(AppPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstractComponentPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		abstractPerformancePreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		accessTypePreferencesEClass.getESuperTypes().add(this.getAbstractComponentPreferences());
		addressSpacePreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		cacheDataPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		cacheDataUnitPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		communicationSetPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		componentSetPreferencesEClass.getESuperTypes().add(this.getAbstractComponentPreferences());
		componentsPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		latencyPreferencesEClass.getESuperTypes().add(this.getAbstractPerformancePreferences());
		masterComponentPreferencesEClass.getESuperTypes().add(this.getAbstractComponentPreferences());
		pitchPreferencesEClass.getESuperTypes().add(this.getAbstractPerformancePreferences());
		savePolicyPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		shimPreferencesEClass.getESuperTypes().add(this.getAbstractPreferences());
		slaveComponentPreferencesEClass.getESuperTypes().add(this.getAbstractComponentPreferences());

		// Initialize classes, features, and operations; add parameters
		initEClass(abstractPreferencesEClass, AbstractPreferences.class, "AbstractPreferences", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractComponentPreferencesEClass, AbstractComponentPreferences.class,
				"AbstractComponentPreferences", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractComponentPreferences_BaseName(), ecorePackage.getEString(), "baseName", null, 1, 1,
				AbstractComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractPerformancePreferencesEClass, AbstractPerformancePreferences.class,
				"AbstractPerformancePreferences", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractPerformancePreferences_Best(), theShimPackage.getUnsignedFloatObjectType(), "best",
				null, 0, 1, AbstractPerformancePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformancePreferences_Typical(), theShimPackage.getUnsignedFloatType(), "typical",
				null, 1, 1, AbstractPerformancePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractPerformancePreferences_Worst(), theShimPackage.getUnsignedFloatObjectType(), "worst",
				null, 0, 1, AbstractPerformancePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(accessTypePreferencesEClass, AccessTypePreferences.class, "AccessTypePreferences", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessTypePreferences_CheckR(), ecorePackage.getEBoolean(), "checkR", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_CheckW(), ecorePackage.getEBoolean(), "checkW", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_CheckRW(), ecorePackage.getEBoolean(), "checkRW", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_CheckRWX(), ecorePackage.getEBoolean(), "checkRWX", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_CheckRX(), ecorePackage.getEBoolean(), "checkRX", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_CheckX(), ecorePackage.getEBoolean(), "checkX", null, 1, 1,
				AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_AccessByteSize(), theAppPackage.getByteSizeListType(), "accessByteSize",
				null, 1, 1, AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessTypePreferences_NBurst(), theShimPackage.getUnsignedIntObjectType(), "nBurst", null, 0,
				1, AccessTypePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressSpacePreferencesEClass, AddressSpacePreferences.class, "AddressSpacePreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressSpacePreferences_NumberSubSpace(), theShimPackage.getUnsignedIntType(),
				"numberSubSpace", null, 1, 1, AddressSpacePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpacePreferences_SizeSubSpace(), theShimPackage.getUnsignedIntType(), "sizeSubSpace",
				null, 1, 1, AddressSpacePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpacePreferences_AddressSpaceName(), ecorePackage.getEString(), "addressSpaceName",
				null, 1, 1, AddressSpacePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpacePreferences_SubSpaceName(), ecorePackage.getEString(), "subSpaceName", null, 1, 1,
				AddressSpacePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressSpacePreferences_DontConnect(), ecorePackage.getEBoolean(), "dontConnect", null, 1, 1,
				AddressSpacePreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheDataPreferencesEClass, CacheDataPreferences.class, "CacheDataPreferences", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCacheDataPreferences_CacheType(), this.getCacheTypeSelect(), "cacheType", null, 1, 1,
				CacheDataPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheDataPreferences_Data(), this.getCacheDataUnitPreferences(), null, "data", null, 1, 1,
				CacheDataPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCacheDataPreferences_Instruction(), this.getCacheDataUnitPreferences(), null, "instruction",
				null, 1, 1, CacheDataPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cacheDataUnitPreferencesEClass, CacheDataUnitPreferences.class, "CacheDataUnitPreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCacheDataUnitPreferences_CacheCoherenecy(), theShimPackage.getCacheCoherencyType(),
				"cacheCoherenecy", null, 1, 1, CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDataUnitPreferences_Size(), theShimPackage.getUnsignedIntType(), "size", null, 1, 1,
				CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDataUnitPreferences_SizeUnit(), theShimPackage.getSizeUnitType(), "sizeUnit", null, 1, 1,
				CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDataUnitPreferences_NWay(), theShimPackage.getUnsignedIntObjectType(), "nWay", null, 0,
				1, CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDataUnitPreferences_LineSize(), theShimPackage.getUnsignedIntObjectType(), "lineSize",
				null, 0, 1, CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCacheDataUnitPreferences_LockDownType(), theShimPackage.getLockDownType(), "lockDownType",
				null, 0, 1, CacheDataUnitPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationSetPreferencesEClass, CommunicationSetPreferences.class, "CommunicationSetPreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationSetPreferences_CheckInterruptCommunication(), ecorePackage.getEBoolean(),
				"checkInterruptCommunication", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_CheckEventCommunication(), ecorePackage.getEBoolean(),
				"checkEventCommunication", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_CheckFIFOCommunication(), ecorePackage.getEBoolean(),
				"checkFIFOCommunication", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_FifoDataSize(), theShimPackage.getUnsignedIntType(),
				"fifoDataSize", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_FifoDataSizeUnit(), theShimPackage.getSizeUnitType(),
				"fifoDataSizeUnit", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_QueueSize(), theShimPackage.getUnsignedIntType(), "queueSize",
				null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_CheckSharedMemoryCommunication(), ecorePackage.getEBoolean(),
				"checkSharedMemoryCommunication", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_SharedMemoryDataSize(), theShimPackage.getUnsignedIntObjectType(),
				"sharedMemoryDataSize", null, 0, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_SharedMemoryDataSizeUnit(), theShimPackage.getSizeUnitType(),
				"sharedMemoryDataSizeUnit", null, 0, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_OperationType(), theShimPackage.getOperationType(),
				"operationType", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_CheckSharedRegisterCommunication(), ecorePackage.getEBoolean(),
				"checkSharedRegisterCommunication", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_SharedRegisterDataSize(), theShimPackage.getUnsignedIntType(),
				"sharedRegisterDataSize", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_SharedRegisterDataSizeUnit(), theShimPackage.getSizeUnitType(),
				"sharedRegisterDataSizeUnit", null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_NRegister(), theShimPackage.getUnsignedIntType(), "nRegister",
				null, 1, 1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationSetPreferences_DontConnect(), ecorePackage.getEBoolean(), "dontConnect", null, 1,
				1, CommunicationSetPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(componentSetPreferencesEClass, ComponentSetPreferences.class, "ComponentSetPreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(componentsPreferencesEClass, ComponentsPreferences.class, "ComponentsPreferences", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getComponentsPreferences_SystemName(), ecorePackage.getEString(), "systemName", null, 1, 1,
				ComponentsPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentsPreferences_NumberMaster(), theShimPackage.getUnsignedIntType(), "numberMaster",
				null, 1, 1, ComponentsPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentsPreferences_NumberSlave(), theShimPackage.getUnsignedIntType(), "numberSlave", null,
				1, 1, ComponentsPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentsPreferences_NumberComponent(), theShimPackage.getUnsignedIntType(),
				"numberComponent", null, 1, 1, ComponentsPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getComponentsPreferences_Clock(), theShimPackage.getUnsignedFloatType(), "clock", null, 1, 1,
				ComponentsPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(latencyPreferencesEClass, LatencyPreferences.class, "LatencyPreferences", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(masterComponentPreferencesEClass, MasterComponentPreferences.class, "MasterComponentPreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMasterComponentPreferences_Type(), theShimPackage.getMasterType(), "type", null, 1, 1,
				MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_Endian(), theShimPackage.getEndianType(), "endian", null, 1, 1,
				MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_Arch(), ecorePackage.getEString(), "arch", null, 1, 1,
				MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_ArchOpt(), ecorePackage.getEString(), "archOpt", null, 0, 1,
				MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_NChannel(), theShimPackage.getUnsignedIntObjectType(), "nChannel",
				null, 0, 1, MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_NThread(), theShimPackage.getUnsignedIntObjectType(), "nThread",
				null, 0, 1, MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_CheckClockForMaster(), ecorePackage.getEBoolean(),
				"checkClockForMaster", null, 1, 1, MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMasterComponentPreferences_Clock(), theShimPackage.getUnsignedFloatObjectType(), "clock",
				null, 1, 1, MasterComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pitchPreferencesEClass, PitchPreferences.class, "PitchPreferences", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(savePolicyPreferencesEClass, SavePolicyPreferences.class, "SavePolicyPreferences", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSavePolicyPreferences_SavePolicy(), this.getSavePolicyType(), "savePolicy", null, 1, 1,
				SavePolicyPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shimPreferencesEClass, ShimPreferences.class, "ShimPreferences", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getShimPreferences_ComponentsPreferences(), this.getComponentsPreferences(), null,
				"componentsPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_MasterComponentPreferences(), this.getMasterComponentPreferences(), null,
				"masterComponentPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_SlaveComponentPreferences(), this.getSlaveComponentPreferences(), null,
				"slaveComponentPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_ComponentSetPreferences(), this.getComponentSetPreferences(), null,
				"componentSetPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_AddressSpacePreferences(), this.getAddressSpacePreferences(), null,
				"addressSpacePreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_CommunicationSetPreferences(), this.getCommunicationSetPreferences(), null,
				"communicationSetPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_CacheDataPreferences(), this.getCacheDataPreferences(), null,
				"cacheDataPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_AccessTypePreferences(), this.getAccessTypePreferences(), null,
				"accessTypePreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_LatencyPreferences(), this.getLatencyPreferences(), null,
				"latencyPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_PitchPreferences(), this.getPitchPreferences(), null, "pitchPreferences",
				null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getShimPreferences_SavePolicyPreferences(), this.getSavePolicyPreferences(), null,
				"savePolicyPreferences", null, 1, 1, ShimPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slaveComponentPreferencesEClass, SlaveComponentPreferences.class, "SlaveComponentPreferences",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSlaveComponentPreferences_Size(), theShimPackage.getUnsignedIntType(), "size", null, 1, 1,
				SlaveComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponentPreferences_SizeUnit(), theShimPackage.getSizeUnitType(), "sizeUnit", null, 1,
				1, SlaveComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSlaveComponentPreferences_RwType(), theShimPackage.getRWType(), "rwType", null, 1, 1,
				SlaveComponentPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cacheTypeSelectEEnum, CacheTypeSelect.class, "CacheTypeSelect");
		addEEnumLiteral(cacheTypeSelectEEnum, CacheTypeSelect.NONE);
		addEEnumLiteral(cacheTypeSelectEEnum, CacheTypeSelect.UNIFIED);
		addEEnumLiteral(cacheTypeSelectEEnum, CacheTypeSelect.DATA);
		addEEnumLiteral(cacheTypeSelectEEnum, CacheTypeSelect.INSTRUCTION);
		addEEnumLiteral(cacheTypeSelectEEnum, CacheTypeSelect.DATA_AND_INSTRUCTION);

		initEEnum(savePolicyTypeEEnum, SavePolicyType.class, "SavePolicyType");
		addEEnumLiteral(savePolicyTypeEEnum, SavePolicyType.ALWAYS);
		addEEnumLiteral(savePolicyTypeEEnum, SavePolicyType.ON_REQUEST);
		addEEnumLiteral(savePolicyTypeEEnum, SavePolicyType.NEVER);

		// Initialize data types
		initEDataType(cacheTypeSelectObjectEDataType, CacheTypeSelect.class, "CacheTypeSelectObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);
		initEDataType(savePolicyTypeObjectEDataType, SavePolicyType.class, "SavePolicyTypeObject", IS_SERIALIZABLE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation(abstractPreferencesEClass, source,
				new String[] { "name", "AbstractPreferences", "kind", "elementOnly" });
		addAnnotation(abstractComponentPreferencesEClass, source,
				new String[] { "name", "AbstractComponentPreferences", "kind", "elementOnly" });
		addAnnotation(getAbstractComponentPreferences_BaseName(), source,
				new String[] { "kind", "attribute", "name", "baseName", "namespace", "##targetNamespace" });
		addAnnotation(abstractPerformancePreferencesEClass, source,
				new String[] { "name", "AbstractPerformancePreferences", "kind", "elementOnly" });
		addAnnotation(getAbstractPerformancePreferences_Best(), source,
				new String[] { "kind", "attribute", "name", "best", "namespace", "##targetNamespace" });
		addAnnotation(getAbstractPerformancePreferences_Typical(), source,
				new String[] { "kind", "attribute", "name", "typical", "namespace", "##targetNamespace" });
		addAnnotation(getAbstractPerformancePreferences_Worst(), source,
				new String[] { "kind", "attribute", "name", "worst", "namespace", "##targetNamespace" });
		addAnnotation(accessTypePreferencesEClass, source,
				new String[] { "name", "AccessTypePreferences", "kind", "elementOnly" });
		addAnnotation(getAccessTypePreferences_CheckR(), source,
				new String[] { "kind", "attribute", "name", "checkR", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_CheckW(), source,
				new String[] { "kind", "attribute", "name", "checkW", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_CheckRW(), source,
				new String[] { "kind", "attribute", "name", "checkRW", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_CheckRWX(), source,
				new String[] { "kind", "attribute", "name", "checkRWX", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_CheckRX(), source,
				new String[] { "kind", "attribute", "name", "checkRX", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_CheckX(), source,
				new String[] { "kind", "attribute", "name", "checkX", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_AccessByteSize(), source,
				new String[] { "kind", "attribute", "name", "accessByteSize", "namespace", "##targetNamespace" });
		addAnnotation(getAccessTypePreferences_NBurst(), source,
				new String[] { "kind", "attribute", "name", "nBurst", "namespace", "##targetNamespace" });
		addAnnotation(addressSpacePreferencesEClass, source,
				new String[] { "name", "AddressSpacePreferences", "kind", "elementOnly" });
		addAnnotation(getAddressSpacePreferences_NumberSubSpace(), source,
				new String[] { "kind", "attribute", "name", "numberSubSpace", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpacePreferences_SizeSubSpace(), source,
				new String[] { "kind", "attribute", "name", "sizeSubSpace", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpacePreferences_AddressSpaceName(), source,
				new String[] { "kind", "attribute", "name", "addressSpaceName", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpacePreferences_SubSpaceName(), source,
				new String[] { "kind", "attribute", "name", "subSpaceName", "namespace", "##targetNamespace" });
		addAnnotation(getAddressSpacePreferences_DontConnect(), source,
				new String[] { "kind", "attribute", "name", "dontConnect", "namespace", "##targetNamespace" });
		addAnnotation(cacheDataPreferencesEClass, source,
				new String[] { "name", "CacheDataPreferences", "kind", "elementOnly" });
		addAnnotation(getCacheDataPreferences_CacheType(), source,
				new String[] { "kind", "attribute", "name", "cacheType", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataPreferences_Data(), source,
				new String[] { "kind", "element", "name", "Data", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataPreferences_Instruction(), source,
				new String[] { "kind", "element", "name", "Instruction", "namespace", "##targetNamespace" });
		addAnnotation(cacheTypeSelectEEnum, source, new String[] { "name", "CacheTypeSelect" });
		addAnnotation(cacheTypeSelectObjectEDataType, source,
				new String[] { "name", "CacheTypeSelect:Object", "baseType", "CacheTypeSelect" });
		addAnnotation(cacheDataUnitPreferencesEClass, source,
				new String[] { "name", "CacheDataUnitPreferences", "kind", "elementOnly" });
		addAnnotation(getCacheDataUnitPreferences_CacheCoherenecy(), source,
				new String[] { "kind", "attribute", "name", "cacheCoherenecy", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataUnitPreferences_Size(), source,
				new String[] { "kind", "attribute", "name", "size", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataUnitPreferences_SizeUnit(), source,
				new String[] { "kind", "attribute", "name", "sizeUnit", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataUnitPreferences_NWay(), source,
				new String[] { "kind", "attribute", "name", "nWay", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataUnitPreferences_LineSize(), source,
				new String[] { "kind", "attribute", "name", "lineSize", "namespace", "##targetNamespace" });
		addAnnotation(getCacheDataUnitPreferences_LockDownType(), source,
				new String[] { "kind", "attribute", "name", "lockDownType", "namespace", "##targetNamespace" });
		addAnnotation(communicationSetPreferencesEClass, source,
				new String[] { "name", "CommunicationSetPreferences", "kind", "elementOnly" });
		addAnnotation(getCommunicationSetPreferences_CheckInterruptCommunication(), source, new String[] { "kind",
				"attribute", "name", "checkInterruptCommunication", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_CheckEventCommunication(), source, new String[] { "kind",
				"attribute", "name", "checkEventCommunication", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_CheckFIFOCommunication(), source, new String[] { "kind",
				"attribute", "name", "checkFIFOCommunication", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_FifoDataSize(), source,
				new String[] { "kind", "attribute", "name", "fifoDataSize", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_FifoDataSizeUnit(), source,
				new String[] { "kind", "attribute", "name", "fifoDataSizeUnit", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_QueueSize(), source,
				new String[] { "kind", "attribute", "name", "queueSize", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_CheckSharedMemoryCommunication(), source, new String[] { "kind",
				"attribute", "name", "checkSharedMemoryCommunication", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_SharedMemoryDataSize(), source,
				new String[] { "kind", "attribute", "name", "sharedMemoryDataSize", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_SharedMemoryDataSizeUnit(), source, new String[] { "kind",
				"attribute", "name", "sharedMemoryDataSizeUnit", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_OperationType(), source,
				new String[] { "kind", "attribute", "name", "operationType", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_CheckSharedRegisterCommunication(), source, new String[] { "kind",
				"attribute", "name", "checkSharedRegisterCommunication", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_SharedRegisterDataSize(), source, new String[] { "kind",
				"attribute", "name", "sharedRegisterDataSize", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_SharedRegisterDataSizeUnit(), source, new String[] { "kind",
				"attribute", "name", "sharedRegisterDataSizeUnit", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_NRegister(), source,
				new String[] { "kind", "attribute", "name", "nRegister", "namespace", "##targetNamespace" });
		addAnnotation(getCommunicationSetPreferences_DontConnect(), source,
				new String[] { "kind", "attribute", "name", "dontConnect", "namespace", "##targetNamespace" });
		addAnnotation(componentSetPreferencesEClass, source,
				new String[] { "name", "ComponentSetPreferences", "kind", "elementOnly" });
		addAnnotation(componentsPreferencesEClass, source,
				new String[] { "name", "ComponentsPreferences", "kind", "elementOnly" });
		addAnnotation(getComponentsPreferences_SystemName(), source,
				new String[] { "kind", "attribute", "name", "systemName", "namespace", "##targetNamespace" });
		addAnnotation(getComponentsPreferences_NumberMaster(), source,
				new String[] { "kind", "attribute", "name", "numberMaster", "namespace", "##targetNamespace" });
		addAnnotation(getComponentsPreferences_NumberSlave(), source,
				new String[] { "kind", "attribute", "name", "numberSlave", "namespace", "##targetNamespace" });
		addAnnotation(getComponentsPreferences_NumberComponent(), source,
				new String[] { "kind", "attribute", "name", "numberComponent", "namespace", "##targetNamespace" });
		addAnnotation(getComponentsPreferences_Clock(), source,
				new String[] { "kind", "attribute", "name", "clock", "namespace", "##targetNamespace" });
		addAnnotation(latencyPreferencesEClass, source,
				new String[] { "name", "LatencyPreferences", "kind", "elementOnly" });
		addAnnotation(masterComponentPreferencesEClass, source,
				new String[] { "name", "MasterComponentPreferences", "kind", "elementOnly" });
		addAnnotation(getMasterComponentPreferences_Type(), source,
				new String[] { "kind", "attribute", "name", "type", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_Endian(), source,
				new String[] { "kind", "attribute", "name", "endian", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_Arch(), source,
				new String[] { "kind", "attribute", "name", "arch", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_ArchOpt(), source,
				new String[] { "kind", "attribute", "name", "archOpt", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_NChannel(), source,
				new String[] { "kind", "attribute", "name", "nChannel", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_NThread(), source,
				new String[] { "kind", "attribute", "name", "nThread", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_CheckClockForMaster(), source,
				new String[] { "kind", "attribute", "name", "checkClockForMaster", "namespace", "##targetNamespace" });
		addAnnotation(getMasterComponentPreferences_Clock(), source,
				new String[] { "kind", "attribute", "name", "clock", "namespace", "##targetNamespace" });
		addAnnotation(pitchPreferencesEClass, source,
				new String[] { "name", "PitchPreferences", "kind", "elementOnly" });
		addAnnotation(savePolicyPreferencesEClass, source,
				new String[] { "name", "SavePolicyPreferences", "kind", "elementOnly" });
		addAnnotation(getSavePolicyPreferences_SavePolicy(), source,
				new String[] { "kind", "attribute", "name", "savePolicy", "namespace", "##targetNamespace" });
		addAnnotation(savePolicyTypeEEnum, source, new String[] { "name", "SavePolicyType" });
		addAnnotation(savePolicyTypeObjectEDataType, source,
				new String[] { "name", "SavePolicyType:Object", "baseType", "SavePolicyType" });
		addAnnotation(shimPreferencesEClass, source, new String[] { "name", "ShimPreferences", "kind", "elementOnly" });
		addAnnotation(getShimPreferences_ComponentsPreferences(), source,
				new String[] { "kind", "element", "name", "ComponentsPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_MasterComponentPreferences(), source, new String[] { "kind", "element", "name",
				"MasterComponentPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_SlaveComponentPreferences(), source, new String[] { "kind", "element", "name",
				"SlaveComponentPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_ComponentSetPreferences(), source, new String[] { "kind", "element", "name",
				"ComponentSetPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_AddressSpacePreferences(), source, new String[] { "kind", "element", "name",
				"AddressSpacePreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_CommunicationSetPreferences(), source, new String[] { "kind", "element",
				"name", "CommunicationSetPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_CacheDataPreferences(), source,
				new String[] { "kind", "element", "name", "CacheDataPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_AccessTypePreferences(), source,
				new String[] { "kind", "element", "name", "AccessTypePreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_LatencyPreferences(), source,
				new String[] { "kind", "element", "name", "LatencyPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_PitchPreferences(), source,
				new String[] { "kind", "element", "name", "PitchPreferences", "namespace", "##targetNamespace" });
		addAnnotation(getShimPreferences_SavePolicyPreferences(), source,
				new String[] { "kind", "element", "name", "SavePolicyPreferences", "namespace", "##targetNamespace" });
		addAnnotation(slaveComponentPreferencesEClass, source,
				new String[] { "name", "SlaveComponentPreferences", "kind", "elementOnly" });
		addAnnotation(getSlaveComponentPreferences_Size(), source,
				new String[] { "kind", "attribute", "name", "size", "namespace", "##targetNamespace" });
		addAnnotation(getSlaveComponentPreferences_SizeUnit(), source,
				new String[] { "kind", "attribute", "name", "sizeUnit", "namespace", "##targetNamespace" });
		addAnnotation(getSlaveComponentPreferences_RwType(), source,
				new String[] { "kind", "attribute", "name", "rwType", "namespace", "##targetNamespace" });
	}

} //PreferencesPackageImpl
