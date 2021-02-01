/**
 */
package org.multicore_association.shim.edit.model.app.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.multicore_association.shim.edit.model.app.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.AppPackage
 * @generated
 */
public class AppAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static AppPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = AppPackage.eINSTANCE;
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
	protected AppSwitch<Adapter> modelSwitch = new AppSwitch<Adapter>() {
		@Override
		public Adapter caseAbstractWizardPageData(AbstractWizardPageData object) {
			return createAbstractWizardPageDataAdapter();
		}

		@Override
		public Adapter caseAccessTypeWizardPageData(AccessTypeWizardPageData object) {
			return createAccessTypeWizardPageDataAdapter();
		}

		@Override
		public Adapter caseAddressSpaceParameterWizardPageData(AddressSpaceParameterWizardPageData object) {
			return createAddressSpaceParameterWizardPageDataAdapter();
		}

		@Override
		public Adapter caseCacheWizardPageData(CacheWizardPageData object) {
			return createCacheWizardPageDataAdapter();
		}

		@Override
		public Adapter caseCommunicationSetWizardPageData(CommunicationSetWizardPageData object) {
			return createCommunicationSetWizardPageDataAdapter();
		}

		@Override
		public Adapter caseComponentParameterWizardPageData(ComponentParameterWizardPageData object) {
			return createComponentParameterWizardPageDataAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData <em>Abstract Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.AbstractWizardPageData
	 * @generated
	 */
	public Adapter createAbstractWizardPageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData <em>Access Type Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.AccessTypeWizardPageData
	 * @generated
	 */
	public Adapter createAccessTypeWizardPageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData <em>Address Space Parameter Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.AddressSpaceParameterWizardPageData
	 * @generated
	 */
	public Adapter createAddressSpaceParameterWizardPageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.CacheWizardPageData <em>Cache Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.CacheWizardPageData
	 * @generated
	 */
	public Adapter createCacheWizardPageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData <em>Communication Set Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData
	 * @generated
	 */
	public Adapter createCommunicationSetWizardPageDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData <em>Component Parameter Wizard Page Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.multicore_association.shim.edit.model.app.ComponentParameterWizardPageData
	 * @generated
	 */
	public Adapter createComponentParameterWizardPageDataAdapter() {
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

} //AppAdapterFactory
