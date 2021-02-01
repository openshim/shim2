/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.multicore_association.shim10.model.shim10.ClockFrequency;
import org.multicore_association.shim10.model.shim10.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock Frequency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ClockFrequencyImpl#getClockValue <em>Clock Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockFrequencyImpl extends MinimalEObjectImpl.Container implements ClockFrequency {
	/**
	 * The default value of the '{@link #getClockValue() <em>Clock Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockValue()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_VALUE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClockValue() <em>Clock Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockValue()
	 * @generated
	 * @ordered
	 */
	protected float clockValue = CLOCK_VALUE_EDEFAULT;

	/**
	 * This is true if the Clock Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean clockValueESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClockFrequencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.CLOCK_FREQUENCY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getClockValue() {
		return clockValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockValue(float newClockValue) {
		float oldClockValue = clockValue;
		clockValue = newClockValue;
		boolean oldClockValueESet = clockValueESet;
		clockValueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE, oldClockValue, clockValue, !oldClockValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetClockValue() {
		float oldClockValue = clockValue;
		boolean oldClockValueESet = clockValueESet;
		clockValue = CLOCK_VALUE_EDEFAULT;
		clockValueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE, oldClockValue, CLOCK_VALUE_EDEFAULT, oldClockValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetClockValue() {
		return clockValueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE:
				return getClockValue();
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
			case ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE:
				setClockValue((Float)newValue);
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
			case ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE:
				unsetClockValue();
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
			case ShimPackage.CLOCK_FREQUENCY__CLOCK_VALUE:
				return isSetClockValue();
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
		result.append(" (clockValue: ");
		if (clockValueESet) result.append(clockValue); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ClockFrequencyImpl
