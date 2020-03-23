/**
 */
package org.multicore_association.shim.model.shim.impl;

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

import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Master Slave Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl#getAccessor <em>Accessor</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MasterSlaveBindingImpl#getSlaveComponentRef <em>Slave Component Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MasterSlaveBindingImpl extends MinimalEObjectImpl.Container implements MasterSlaveBinding {
	/**
	 * The cached value of the '{@link #getAccessor() <em>Accessor</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessor()
	 * @generated
	 * @ordered
	 */
	protected EList<Accessor> accessor;

	/**
	 * The cached value of the '{@link #getSlaveComponentRef() <em>Slave Component Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveComponentRef()
	 * @generated
	 * @ordered
	 */
	protected SlaveComponent slaveComponentRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MasterSlaveBindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.MASTER_SLAVE_BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Accessor> getAccessor() {
		if (accessor == null) {
			accessor = new EObjectContainmentEList<Accessor>(Accessor.class, this,
					ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR);
		}
		return accessor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponent getSlaveComponentRef() {
		if (slaveComponentRef != null && slaveComponentRef.eIsProxy()) {
			InternalEObject oldSlaveComponentRef = (InternalEObject) slaveComponentRef;
			slaveComponentRef = (SlaveComponent) eResolveProxy(oldSlaveComponentRef);
			if (slaveComponentRef != oldSlaveComponentRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF, oldSlaveComponentRef,
							slaveComponentRef));
			}
		}
		return slaveComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SlaveComponent basicGetSlaveComponentRef() {
		return slaveComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSlaveComponentRef(SlaveComponent newSlaveComponentRef) {
		SlaveComponent oldSlaveComponentRef = slaveComponentRef;
		slaveComponentRef = newSlaveComponentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF,
					oldSlaveComponentRef, slaveComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR:
			return ((InternalEList<?>) getAccessor()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR:
			return getAccessor();
		case ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF:
			if (resolve)
				return getSlaveComponentRef();
			return basicGetSlaveComponentRef();
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
		case ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR:
			getAccessor().clear();
			getAccessor().addAll((Collection<? extends Accessor>) newValue);
			return;
		case ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF:
			setSlaveComponentRef((SlaveComponent) newValue);
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
		case ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR:
			getAccessor().clear();
			return;
		case ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF:
			setSlaveComponentRef((SlaveComponent) null);
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
		case ShimPackage.MASTER_SLAVE_BINDING__ACCESSOR:
			return accessor != null && !accessor.isEmpty();
		case ShimPackage.MASTER_SLAVE_BINDING__SLAVE_COMPONENT_REF:
			return slaveComponentRef != null;
		}
		return super.eIsSet(featureID);
	}

} //MasterSlaveBindingImpl
