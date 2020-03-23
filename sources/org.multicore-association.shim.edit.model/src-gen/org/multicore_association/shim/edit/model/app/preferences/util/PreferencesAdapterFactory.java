/**
 */
package org.multicore_association.shim.edit.model.app.preferences.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.multicore_association.shim.edit.model.app.preferences.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage
 * @generated
 */
public class PreferencesAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PreferencesPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferencesAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PreferencesPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreferencesSwitch<Adapter> modelSwitch = new PreferencesSwitch<Adapter>() {
		@Override
		public Adapter caseAbstractPreferences(AbstractPreferences object) {
			return createAbstractPreferencesAdapter();
		}

		@Override
		public Adapter caseAbstractComponentPreferences(AbstractComponentPreferences object) {
			return createAbstractComponentPreferencesAdapter();
		}

		@Override
		public Adapter caseAbstractPerformancePreferences(AbstractPerformancePreferences object) {
			return createAbstractPerformancePreferencesAdapter();
		}

		@Override
		public Adapter caseAccessTypePreferences(AccessTypePreferences object) {
			return createAccessTypePreferencesAdapter();
		}

		@Override
		public Adapter caseAddressSpacePreferences(AddressSpacePreferences object) {
			return createAddressSpacePreferencesAdapter();
		}

		@Override
		public Adapter caseCacheDataPreferences(CacheDataPreferences object) {
			return createCacheDataPreferencesAdapter();
		}

		@Override
		public Adapter caseCacheDataUnitPreferences(CacheDataUnitPreferences object) {
			return createCacheDataUnitPreferencesAdapter();
		}

		@Override
		public Adapter caseCommunicationSetPreferences(CommunicationSetPreferences object) {
			return createCommunicationSetPreferencesAdapter();
		}

		@Override
		public Adapter caseComponentSetPreferences(ComponentSetPreferences object) {
			return createComponentSetPreferencesAdapter();
		}

		@Override
		public Adapter caseComponentsPreferences(ComponentsPreferences object) {
			return createComponentsPreferencesAdapter();
		}

		@Override
		public Adapter caseLatencyPreferences(LatencyPreferences object) {
			return createLatencyPreferencesAdapter();
		}

		@Override
		public Adapter caseMasterComponentPreferences(MasterComponentPreferences object) {
			return createMasterComponentPreferencesAdapter();
		}

		@Override
		public Adapter casePitchPreferences(PitchPreferences object) {
			return createPitchPreferencesAdapter();
		}

		@Override
		public Adapter caseSavePolicyPreferences(SavePolicyPreferences object) {
			return createSavePolicyPreferencesAdapter();
		}

		@Override
		public Adapter caseShimPreferences(ShimPreferences object) {
			return createShimPreferencesAdapter();
		}

		@Override
		public Adapter caseSlaveComponentPreferences(SlaveComponentPreferences object) {
			return createSlaveComponentPreferencesAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences <em>Abstract Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPreferences
	 * @generated
	 */
	public Adapter createAbstractPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences <em>Abstract Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractComponentPreferences
	 * @generated
	 */
	public Adapter createAbstractComponentPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences <em>Abstract Performance Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AbstractPerformancePreferences
	 * @generated
	 */
	public Adapter createAbstractPerformancePreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences <em>Access Type Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences
	 * @generated
	 */
	public Adapter createAccessTypePreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences <em>Address Space Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences
	 * @generated
	 */
	public Adapter createAddressSpacePreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences <em>Cache Data Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences
	 * @generated
	 */
	public Adapter createCacheDataPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences <em>Cache Data Unit Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CacheDataUnitPreferences
	 * @generated
	 */
	public Adapter createCacheDataUnitPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences <em>Communication Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences
	 * @generated
	 */
	public Adapter createCommunicationSetPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences <em>Component Set Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences
	 * @generated
	 */
	public Adapter createComponentSetPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences <em>Components Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences
	 * @generated
	 */
	public Adapter createComponentsPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences <em>Latency Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences
	 * @generated
	 */
	public Adapter createLatencyPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences <em>Master Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences
	 * @generated
	 */
	public Adapter createMasterComponentPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.PitchPreferences <em>Pitch Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.PitchPreferences
	 * @generated
	 */
	public Adapter createPitchPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences <em>Save Policy Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences
	 * @generated
	 */
	public Adapter createSavePolicyPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.ShimPreferences <em>Shim Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.ShimPreferences
	 * @generated
	 */
	public Adapter createShimPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences <em>Slave Component Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences
	 * @generated
	 */
	public Adapter createSlaveComponentPreferencesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PreferencesAdapterFactory
