/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Type Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessTypeSetImpl#getAccessType <em>Access Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessTypeSetImpl extends MinimalEObjectImpl.Container implements AccessTypeSet {
	/**
	 * The cached value of the '{@link #getAccessType() <em>Access Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessType()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessType> accessType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessTypeSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ACCESS_TYPE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessType> getAccessType() {
		if (accessType == null) {
			accessType = new EObjectContainmentEList<AccessType>(AccessType.class, this,
					ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE);
		}
		return accessType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE:
			return ((InternalEList<?>) getAccessType()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE:
			return getAccessType();
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
		case ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE:
			getAccessType().clear();
			getAccessType().addAll((Collection<? extends AccessType>) newValue);
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
		case ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE:
			getAccessType().clear();
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
		case ShimPackage.ACCESS_TYPE_SET__ACCESS_TYPE:
			return accessType != null && !accessType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessTypeSetImpl
