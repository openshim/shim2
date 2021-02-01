/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.AddressSpace;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SubSpace;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Space</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl#getSubSpace <em>Sub Space</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.AddressSpaceImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressSpaceImpl extends MinimalEObjectImpl.Container implements AddressSpace {
	/**
	 * The cached value of the '{@link #getSubSpace() <em>Sub Space</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubSpace()
	 * @generated
	 * @ordered
	 */
	protected EList<SubSpace> subSpace;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressSpaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ADDRESS_SPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubSpace> getSubSpace() {
		if (subSpace == null) {
			subSpace = new EObjectContainmentEList<SubSpace>(SubSpace.class, this, ShimPackage.ADDRESS_SPACE__SUB_SPACE);
		}
		return subSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ADDRESS_SPACE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ADDRESS_SPACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.ADDRESS_SPACE__SUB_SPACE:
				return ((InternalEList<?>)getSubSpace()).basicRemove(otherEnd, msgs);
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
			case ShimPackage.ADDRESS_SPACE__SUB_SPACE:
				return getSubSpace();
			case ShimPackage.ADDRESS_SPACE__ID:
				return getId();
			case ShimPackage.ADDRESS_SPACE__NAME:
				return getName();
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
			case ShimPackage.ADDRESS_SPACE__SUB_SPACE:
				getSubSpace().clear();
				getSubSpace().addAll((Collection<? extends SubSpace>)newValue);
				return;
			case ShimPackage.ADDRESS_SPACE__ID:
				setId((String)newValue);
				return;
			case ShimPackage.ADDRESS_SPACE__NAME:
				setName((String)newValue);
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
			case ShimPackage.ADDRESS_SPACE__SUB_SPACE:
				getSubSpace().clear();
				return;
			case ShimPackage.ADDRESS_SPACE__ID:
				setId(ID_EDEFAULT);
				return;
			case ShimPackage.ADDRESS_SPACE__NAME:
				setName(NAME_EDEFAULT);
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
			case ShimPackage.ADDRESS_SPACE__SUB_SPACE:
				return subSpace != null && !subSpace.isEmpty();
			case ShimPackage.ADDRESS_SPACE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ShimPackage.ADDRESS_SPACE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AddressSpaceImpl
