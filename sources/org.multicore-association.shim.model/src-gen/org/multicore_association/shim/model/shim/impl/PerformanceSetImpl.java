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

import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Performance Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceSetImpl#getCacheRef <em>Cache Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PerformanceSetImpl#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformanceSetImpl extends MinimalEObjectImpl.Container implements PerformanceSet {
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
	 * The cached value of the '{@link #getCacheRef() <em>Cache Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheRef()
	 * @generated
	 * @ordered
	 */
	protected Cache cacheRef;

	/**
	 * This is true if the Cache Ref reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cacheRefESet;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected EList<Performance> performance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformanceSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.PERFORMANCE_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.PERFORMANCE_SET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache getCacheRef() {
		if (cacheRef != null && cacheRef.eIsProxy()) {
			InternalEObject oldCacheRef = (InternalEObject) cacheRef;
			cacheRef = (Cache) eResolveProxy(oldCacheRef);
			if (cacheRef != oldCacheRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ShimPackage.PERFORMANCE_SET__CACHE_REF,
							oldCacheRef, cacheRef));
			}
		}
		return cacheRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cache basicGetCacheRef() {
		return cacheRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCacheRef(Cache newCacheRef) {
		Cache oldCacheRef = cacheRef;
		cacheRef = newCacheRef;
		boolean oldCacheRefESet = cacheRefESet;
		cacheRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.PERFORMANCE_SET__CACHE_REF, oldCacheRef,
					cacheRef, !oldCacheRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCacheRef() {
		Cache oldCacheRef = cacheRef;
		boolean oldCacheRefESet = cacheRefESet;
		cacheRef = null;
		cacheRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.PERFORMANCE_SET__CACHE_REF, oldCacheRef,
					null, oldCacheRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCacheRef() {
		return cacheRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performance> getPerformance() {
		if (performance == null) {
			performance = new EObjectContainmentEList<Performance>(Performance.class, this,
					ShimPackage.PERFORMANCE_SET__PERFORMANCE);
		}
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.PERFORMANCE_SET__PERFORMANCE:
			return ((InternalEList<?>) getPerformance()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.PERFORMANCE_SET__ID:
			return getId();
		case ShimPackage.PERFORMANCE_SET__CACHE_REF:
			if (resolve)
				return getCacheRef();
			return basicGetCacheRef();
		case ShimPackage.PERFORMANCE_SET__PERFORMANCE:
			return getPerformance();
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
		case ShimPackage.PERFORMANCE_SET__ID:
			setId((String) newValue);
			return;
		case ShimPackage.PERFORMANCE_SET__CACHE_REF:
			setCacheRef((Cache) newValue);
			return;
		case ShimPackage.PERFORMANCE_SET__PERFORMANCE:
			getPerformance().clear();
			getPerformance().addAll((Collection<? extends Performance>) newValue);
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
		case ShimPackage.PERFORMANCE_SET__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.PERFORMANCE_SET__CACHE_REF:
			unsetCacheRef();
			return;
		case ShimPackage.PERFORMANCE_SET__PERFORMANCE:
			getPerformance().clear();
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
		case ShimPackage.PERFORMANCE_SET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.PERFORMANCE_SET__CACHE_REF:
			return isSetCacheRef();
		case ShimPackage.PERFORMANCE_SET__PERFORMANCE:
			return performance != null && !performance.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //PerformanceSetImpl
