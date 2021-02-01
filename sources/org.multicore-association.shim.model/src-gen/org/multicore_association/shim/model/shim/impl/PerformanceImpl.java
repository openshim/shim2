/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceImpl#getPitch <em>Pitch</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceImpl#getLatency <em>Latency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceImpl#getAccessTypeRef <em>Access Type Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceImpl extends MinimalEObjectImpl.Container implements Performance {
	/**
	 * The cached value of the '{@link #getPitch() <em>Pitch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitch()
	 * @generated
	 * @ordered
	 */
	protected Pitch pitch;

	/**
	 * The cached value of the '{@link #getLatency() <em>Latency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatency()
	 * @generated
	 * @ordered
	 */
	protected Latency latency;

	/**
	 * The cached value of the '{@link #getAccessTypeRef() <em>Access Type Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTypeRef()
	 * @generated
	 * @ordered
	 */
	protected AccessType accessTypeRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType getAccessTypeRef() {
		if (accessTypeRef != null && accessTypeRef.eIsProxy()) {
			InternalEObject oldAccessTypeRef = (InternalEObject) accessTypeRef;
			accessTypeRef = (AccessType) eResolveProxy(oldAccessTypeRef);
			if (accessTypeRef != oldAccessTypeRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShimPackage.PERFORMANCE__ACCESS_TYPE_REF,
							oldAccessTypeRef, accessTypeRef));
			}
		}
		return accessTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessType basicGetAccessTypeRef() {
		return accessTypeRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessTypeRef(AccessType newAccessTypeRef) {
		AccessType oldAccessTypeRef = accessTypeRef;
		accessTypeRef = newAccessTypeRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.PERFORMANCE__ACCESS_TYPE_REF,
					oldAccessTypeRef, accessTypeRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pitch getPitch() {
		return pitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPitch(Pitch newPitch, NotificationChain msgs) {
		Pitch oldPitch = pitch;
		pitch = newPitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.PERFORMANCE__PITCH, oldPitch, newPitch);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPitch(Pitch newPitch) {
		if (newPitch != pitch) {
			NotificationChain msgs = null;
			if (pitch != null)
				msgs = ((InternalEObject) pitch).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.PERFORMANCE__PITCH, null, msgs);
			if (newPitch != null)
				msgs = ((InternalEObject) newPitch).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.PERFORMANCE__PITCH, null, msgs);
			msgs = basicSetPitch(newPitch, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.PERFORMANCE__PITCH, newPitch, newPitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Latency getLatency() {
		return latency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatency(Latency newLatency, NotificationChain msgs) {
		Latency oldLatency = latency;
		latency = newLatency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.PERFORMANCE__LATENCY, oldLatency, newLatency);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatency(Latency newLatency) {
		if (newLatency != latency) {
			NotificationChain msgs = null;
			if (latency != null)
				msgs = ((InternalEObject) latency).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.PERFORMANCE__LATENCY, null, msgs);
			if (newLatency != null)
				msgs = ((InternalEObject) newLatency).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.PERFORMANCE__LATENCY, null, msgs);
			msgs = basicSetLatency(newLatency, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.PERFORMANCE__LATENCY, newLatency,
					newLatency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.PERFORMANCE__PITCH:
			return basicSetPitch(null, msgs);
		case ShimPackage.PERFORMANCE__LATENCY:
			return basicSetLatency(null, msgs);
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
		case ShimPackage.PERFORMANCE__PITCH:
			return getPitch();
		case ShimPackage.PERFORMANCE__LATENCY:
			return getLatency();
		case ShimPackage.PERFORMANCE__ACCESS_TYPE_REF:
			if (resolve)
				return getAccessTypeRef();
			return basicGetAccessTypeRef();
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
		case ShimPackage.PERFORMANCE__PITCH:
			setPitch((Pitch) newValue);
			return;
		case ShimPackage.PERFORMANCE__LATENCY:
			setLatency((Latency) newValue);
			return;
		case ShimPackage.PERFORMANCE__ACCESS_TYPE_REF:
			setAccessTypeRef((AccessType) newValue);
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
		case ShimPackage.PERFORMANCE__PITCH:
			setPitch((Pitch) null);
			return;
		case ShimPackage.PERFORMANCE__LATENCY:
			setLatency((Latency) null);
			return;
		case ShimPackage.PERFORMANCE__ACCESS_TYPE_REF:
			setAccessTypeRef((AccessType) null);
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
		case ShimPackage.PERFORMANCE__PITCH:
			return pitch != null;
		case ShimPackage.PERFORMANCE__LATENCY:
			return latency != null;
		case ShimPackage.PERFORMANCE__ACCESS_TYPE_REF:
			return accessTypeRef != null;
		}
		return super.eIsSet(featureID);
	}

} //PerformanceImpl
