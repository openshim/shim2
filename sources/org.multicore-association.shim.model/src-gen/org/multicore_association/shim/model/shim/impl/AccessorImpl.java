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
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessorImpl#getMasterComponentRef <em>Master Component Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AccessorImpl#getPerformanceSet <em>Performance Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessorImpl extends MinimalEObjectImpl.Container implements Accessor {
	/**
	 * The cached value of the '{@link #getMasterComponentRef() <em>Master Component Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterComponentRef()
	 * @generated
	 * @ordered
	 */
	protected MasterComponent masterComponentRef;

	/**
	 * The cached value of the '{@link #getPerformanceSet() <em>Performance Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformanceSet()
	 * @generated
	 * @ordered
	 */
	protected EList<PerformanceSet> performanceSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ACCESSOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponent getMasterComponentRef() {
		if (masterComponentRef != null && masterComponentRef.eIsProxy()) {
			InternalEObject oldMasterComponentRef = (InternalEObject) masterComponentRef;
			masterComponentRef = (MasterComponent) eResolveProxy(oldMasterComponentRef);
			if (masterComponentRef != oldMasterComponentRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.ACCESSOR__MASTER_COMPONENT_REF, oldMasterComponentRef, masterComponentRef));
			}
		}
		return masterComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MasterComponent basicGetMasterComponentRef() {
		return masterComponentRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterComponentRef(MasterComponent newMasterComponentRef) {
		MasterComponent oldMasterComponentRef = masterComponentRef;
		masterComponentRef = newMasterComponentRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ACCESSOR__MASTER_COMPONENT_REF,
					oldMasterComponentRef, masterComponentRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PerformanceSet> getPerformanceSet() {
		if (performanceSet == null) {
			performanceSet = new EObjectContainmentEList<PerformanceSet>(PerformanceSet.class, this,
					ShimPackage.ACCESSOR__PERFORMANCE_SET);
		}
		return performanceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.ACCESSOR__PERFORMANCE_SET:
			return ((InternalEList<?>) getPerformanceSet()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.ACCESSOR__MASTER_COMPONENT_REF:
			if (resolve)
				return getMasterComponentRef();
			return basicGetMasterComponentRef();
		case ShimPackage.ACCESSOR__PERFORMANCE_SET:
			return getPerformanceSet();
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
		case ShimPackage.ACCESSOR__MASTER_COMPONENT_REF:
			setMasterComponentRef((MasterComponent) newValue);
			return;
		case ShimPackage.ACCESSOR__PERFORMANCE_SET:
			getPerformanceSet().clear();
			getPerformanceSet().addAll((Collection<? extends PerformanceSet>) newValue);
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
		case ShimPackage.ACCESSOR__MASTER_COMPONENT_REF:
			setMasterComponentRef((MasterComponent) null);
			return;
		case ShimPackage.ACCESSOR__PERFORMANCE_SET:
			getPerformanceSet().clear();
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
		case ShimPackage.ACCESSOR__MASTER_COMPONENT_REF:
			return masterComponentRef != null;
		case ShimPackage.ACCESSOR__PERFORMANCE_SET:
			return performanceSet != null && !performanceSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessorImpl
