/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.MasterSlaveBinding;
import org.multicore_association.shim10.model.shim10.MasterSlaveBindingSet;
import org.multicore_association.shim10.model.shim10.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Slave Binding Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.MasterSlaveBindingSetImpl#getMasterSlaveBinding <em>Master Slave Binding</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterSlaveBindingSetImpl extends MinimalEObjectImpl.Container implements MasterSlaveBindingSet {
	/**
	 * The cached value of the '{@link #getMasterSlaveBinding() <em>Master Slave Binding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterSlaveBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterSlaveBinding> masterSlaveBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterSlaveBindingSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.MASTER_SLAVE_BINDING_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterSlaveBinding> getMasterSlaveBinding() {
		if (masterSlaveBinding == null) {
			masterSlaveBinding = new EObjectContainmentEList<MasterSlaveBinding>(MasterSlaveBinding.class, this, ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING);
		}
		return masterSlaveBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING:
				return ((InternalEList<?>)getMasterSlaveBinding()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING:
				return getMasterSlaveBinding();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING:
				getMasterSlaveBinding().clear();
				getMasterSlaveBinding().addAll((Collection<? extends MasterSlaveBinding>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING:
				getMasterSlaveBinding().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ShimPackage.MASTER_SLAVE_BINDING_SET__MASTER_SLAVE_BINDING:
				return masterSlaveBinding != null && !masterSlaveBinding.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MasterSlaveBindingSetImpl
