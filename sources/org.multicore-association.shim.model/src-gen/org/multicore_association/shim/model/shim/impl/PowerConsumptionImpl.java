/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.OperatingPoint;
import org.multicore_association.shim.model.shim.PowerConsumption;
import org.multicore_association.shim.model.shim.PowerUnitType;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Consumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl#getOperatingPointRef <em>Operating Point Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl#getPower <em>Power</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionImpl#getPowerUnit <em>Power Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerConsumptionImpl extends MinimalEObjectImpl.Container implements PowerConsumption {
	/**
	 * The cached value of the '{@link #getOperatingPointRef() <em>Operating Point Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingPointRef()
	 * @generated
	 * @ordered
	 */
	protected OperatingPoint operatingPointRef;

	/**
	 * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected static final Integer POWER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPower()
	 * @generated
	 * @ordered
	 */
	protected Integer power = POWER_EDEFAULT;

	/**
	 * This is true if the Power attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerESet;

	/**
	 * The default value of the '{@link #getPowerUnit() <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUnit()
	 * @generated
	 * @ordered
	 */
	protected static final PowerUnitType POWER_UNIT_EDEFAULT = PowerUnitType.PW;

	/**
	 * The cached value of the '{@link #getPowerUnit() <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerUnit()
	 * @generated
	 * @ordered
	 */
	protected PowerUnitType powerUnit = POWER_UNIT_EDEFAULT;

	/**
	 * This is true if the Power Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean powerUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerConsumptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.POWER_CONSUMPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingPoint getOperatingPointRef() {
		if (operatingPointRef != null && operatingPointRef.eIsProxy()) {
			InternalEObject oldOperatingPointRef = (InternalEObject) operatingPointRef;
			operatingPointRef = (OperatingPoint) eResolveProxy(oldOperatingPointRef);
			if (operatingPointRef != oldOperatingPointRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF, oldOperatingPointRef,
							operatingPointRef));
			}
		}
		return operatingPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingPoint basicGetOperatingPointRef() {
		return operatingPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingPointRef(OperatingPoint newOperatingPointRef) {
		OperatingPoint oldOperatingPointRef = operatingPointRef;
		operatingPointRef = newOperatingPointRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF,
					oldOperatingPointRef, operatingPointRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPower() {
		return power;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPower(Integer newPower) {
		Integer oldPower = power;
		power = newPower;
		boolean oldPowerESet = powerESet;
		powerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.POWER_CONSUMPTION__POWER, oldPower, power,
					!oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPower() {
		Integer oldPower = power;
		boolean oldPowerESet = powerESet;
		power = POWER_EDEFAULT;
		powerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.POWER_CONSUMPTION__POWER, oldPower,
					POWER_EDEFAULT, oldPowerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPower() {
		return powerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerUnitType getPowerUnit() {
		return powerUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerUnit(PowerUnitType newPowerUnit) {
		PowerUnitType oldPowerUnit = powerUnit;
		powerUnit = newPowerUnit == null ? POWER_UNIT_EDEFAULT : newPowerUnit;
		boolean oldPowerUnitESet = powerUnitESet;
		powerUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.POWER_CONSUMPTION__POWER_UNIT,
					oldPowerUnit, powerUnit, !oldPowerUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPowerUnit() {
		PowerUnitType oldPowerUnit = powerUnit;
		boolean oldPowerUnitESet = powerUnitESet;
		powerUnit = POWER_UNIT_EDEFAULT;
		powerUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.POWER_CONSUMPTION__POWER_UNIT,
					oldPowerUnit, POWER_UNIT_EDEFAULT, oldPowerUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPowerUnit() {
		return powerUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF:
			if (resolve)
				return getOperatingPointRef();
			return basicGetOperatingPointRef();
		case ShimPackage.POWER_CONSUMPTION__POWER:
			return getPower();
		case ShimPackage.POWER_CONSUMPTION__POWER_UNIT:
			return getPowerUnit();
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
		case ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF:
			setOperatingPointRef((OperatingPoint) newValue);
			return;
		case ShimPackage.POWER_CONSUMPTION__POWER:
			setPower((Integer) newValue);
			return;
		case ShimPackage.POWER_CONSUMPTION__POWER_UNIT:
			setPowerUnit((PowerUnitType) newValue);
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
		case ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF:
			setOperatingPointRef((OperatingPoint) null);
			return;
		case ShimPackage.POWER_CONSUMPTION__POWER:
			unsetPower();
			return;
		case ShimPackage.POWER_CONSUMPTION__POWER_UNIT:
			unsetPowerUnit();
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
		case ShimPackage.POWER_CONSUMPTION__OPERATING_POINT_REF:
			return operatingPointRef != null;
		case ShimPackage.POWER_CONSUMPTION__POWER:
			return isSetPower();
		case ShimPackage.POWER_CONSUMPTION__POWER_UNIT:
			return isSetPowerUnit();
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
		result.append(" (power: ");
		if (powerESet)
			result.append(power);
		else
			result.append("<unset>");
		result.append(", powerUnit: ");
		if (powerUnitESet)
			result.append(powerUnit);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PowerConsumptionImpl
