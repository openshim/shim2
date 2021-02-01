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
import org.multicore_association.shim10.model.shim10.AddressSpace;
import org.multicore_association.shim10.model.shim10.AddressSpaceSet;
import org.multicore_association.shim10.model.shim10.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceSetImpl#getAddressSpace <em>Address Space</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressSpaceSetImpl extends MinimalEObjectImpl.Container implements AddressSpaceSet {
	/**
	 * The cached value of the '{@link #getAddressSpace() <em>Address Space</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<AddressSpace> addressSpace;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSpaceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ADDRESS_SPACE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressSpace> getAddressSpace() {
		if (addressSpace == null) {
			addressSpace = new EObjectContainmentEList<AddressSpace>(AddressSpace.class, this, ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE);
		}
		return addressSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE:
				return ((InternalEList<?>)getAddressSpace()).basicRemove(otherEnd, msgs);
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
			case ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE:
				return getAddressSpace();
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
			case ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE:
				getAddressSpace().clear();
				getAddressSpace().addAll((Collection<? extends AddressSpace>)newValue);
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
			case ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE:
				getAddressSpace().clear();
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
			case ShimPackage.ADDRESS_SPACE_SET__ADDRESS_SPACE:
				return addressSpace != null && !addressSpace.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AddressSpaceSetImpl
