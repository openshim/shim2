/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.MemoryConsistencyModel;
import org.multicore_association.shim.model.shim.OrderingType;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Memory Consistency Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl#getRawOrdering <em>Raw Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl#getWarOrdering <em>War Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl#getWawOrdering <em>Waw Ordering</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.MemoryConsistencyModelImpl#getRarOrdering <em>Rar Ordering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryConsistencyModelImpl extends MinimalEObjectImpl.Container implements MemoryConsistencyModel {
	/**
	 * The default value of the '{@link #getRawOrdering() <em>Raw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final OrderingType RAW_ORDERING_EDEFAULT = OrderingType.ORDERED;

	/**
	 * The cached value of the '{@link #getRawOrdering() <em>Raw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRawOrdering()
	 * @generated
	 * @ordered
	 */
	protected OrderingType rawOrdering = RAW_ORDERING_EDEFAULT;

	/**
	 * This is true if the Raw Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rawOrderingESet;

	/**
	 * The default value of the '{@link #getWarOrdering() <em>War Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final OrderingType WAR_ORDERING_EDEFAULT = OrderingType.ORDERED;

	/**
	 * The cached value of the '{@link #getWarOrdering() <em>War Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWarOrdering()
	 * @generated
	 * @ordered
	 */
	protected OrderingType warOrdering = WAR_ORDERING_EDEFAULT;

	/**
	 * This is true if the War Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warOrderingESet;

	/**
	 * The default value of the '{@link #getWawOrdering() <em>Waw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWawOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final OrderingType WAW_ORDERING_EDEFAULT = OrderingType.ORDERED;

	/**
	 * The cached value of the '{@link #getWawOrdering() <em>Waw Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWawOrdering()
	 * @generated
	 * @ordered
	 */
	protected OrderingType wawOrdering = WAW_ORDERING_EDEFAULT;

	/**
	 * This is true if the Waw Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean wawOrderingESet;

	/**
	 * The default value of the '{@link #getRarOrdering() <em>Rar Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarOrdering()
	 * @generated
	 * @ordered
	 */
	protected static final OrderingType RAR_ORDERING_EDEFAULT = OrderingType.ORDERED;

	/**
	 * The cached value of the '{@link #getRarOrdering() <em>Rar Ordering</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarOrdering()
	 * @generated
	 * @ordered
	 */
	protected OrderingType rarOrdering = RAR_ORDERING_EDEFAULT;

	/**
	 * This is true if the Rar Ordering attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rarOrderingESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemoryConsistencyModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.MEMORY_CONSISTENCY_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType getRawOrdering() {
		return rawOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRawOrdering(OrderingType newRawOrdering) {
		OrderingType oldRawOrdering = rawOrdering;
		rawOrdering = newRawOrdering == null ? RAW_ORDERING_EDEFAULT : newRawOrdering;
		boolean oldRawOrderingESet = rawOrderingESet;
		rawOrderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING,
					oldRawOrdering, rawOrdering, !oldRawOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRawOrdering() {
		OrderingType oldRawOrdering = rawOrdering;
		boolean oldRawOrderingESet = rawOrderingESet;
		rawOrdering = RAW_ORDERING_EDEFAULT;
		rawOrderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING,
					oldRawOrdering, RAW_ORDERING_EDEFAULT, oldRawOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRawOrdering() {
		return rawOrderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType getWarOrdering() {
		return warOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarOrdering(OrderingType newWarOrdering) {
		OrderingType oldWarOrdering = warOrdering;
		warOrdering = newWarOrdering == null ? WAR_ORDERING_EDEFAULT : newWarOrdering;
		boolean oldWarOrderingESet = warOrderingESet;
		warOrderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING,
					oldWarOrdering, warOrdering, !oldWarOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarOrdering() {
		OrderingType oldWarOrdering = warOrdering;
		boolean oldWarOrderingESet = warOrderingESet;
		warOrdering = WAR_ORDERING_EDEFAULT;
		warOrderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING,
					oldWarOrdering, WAR_ORDERING_EDEFAULT, oldWarOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarOrdering() {
		return warOrderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType getWawOrdering() {
		return wawOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWawOrdering(OrderingType newWawOrdering) {
		OrderingType oldWawOrdering = wawOrdering;
		wawOrdering = newWawOrdering == null ? WAW_ORDERING_EDEFAULT : newWawOrdering;
		boolean oldWawOrderingESet = wawOrderingESet;
		wawOrderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING,
					oldWawOrdering, wawOrdering, !oldWawOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWawOrdering() {
		OrderingType oldWawOrdering = wawOrdering;
		boolean oldWawOrderingESet = wawOrderingESet;
		wawOrdering = WAW_ORDERING_EDEFAULT;
		wawOrderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING,
					oldWawOrdering, WAW_ORDERING_EDEFAULT, oldWawOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWawOrdering() {
		return wawOrderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderingType getRarOrdering() {
		return rarOrdering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRarOrdering(OrderingType newRarOrdering) {
		OrderingType oldRarOrdering = rarOrdering;
		rarOrdering = newRarOrdering == null ? RAR_ORDERING_EDEFAULT : newRarOrdering;
		boolean oldRarOrderingESet = rarOrderingESet;
		rarOrderingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING,
					oldRarOrdering, rarOrdering, !oldRarOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRarOrdering() {
		OrderingType oldRarOrdering = rarOrdering;
		boolean oldRarOrderingESet = rarOrderingESet;
		rarOrdering = RAR_ORDERING_EDEFAULT;
		rarOrderingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING,
					oldRarOrdering, RAR_ORDERING_EDEFAULT, oldRarOrderingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRarOrdering() {
		return rarOrderingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING:
			return getRawOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING:
			return getWarOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING:
			return getWawOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING:
			return getRarOrdering();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING:
			setRawOrdering((OrderingType) newValue);
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING:
			setWarOrdering((OrderingType) newValue);
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING:
			setWawOrdering((OrderingType) newValue);
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING:
			setRarOrdering((OrderingType) newValue);
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
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING:
			unsetRawOrdering();
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING:
			unsetWarOrdering();
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING:
			unsetWawOrdering();
			return;
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING:
			unsetRarOrdering();
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
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAW_ORDERING:
			return isSetRawOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAR_ORDERING:
			return isSetWarOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__WAW_ORDERING:
			return isSetWawOrdering();
		case ShimPackage.MEMORY_CONSISTENCY_MODEL__RAR_ORDERING:
			return isSetRarOrdering();
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
		result.append(" (rawOrdering: ");
		if (rawOrderingESet)
			result.append(rawOrdering);
		else
			result.append("<unset>");
		result.append(", warOrdering: ");
		if (warOrderingESet)
			result.append(warOrdering);
		else
			result.append("<unset>");
		result.append(", wawOrdering: ");
		if (wawOrderingESet)
			result.append(wawOrdering);
		else
			result.append("<unset>");
		result.append(", rarOrdering: ");
		if (rarOrderingESet)
			result.append(rarOrdering);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //MemoryConsistencyModelImpl
