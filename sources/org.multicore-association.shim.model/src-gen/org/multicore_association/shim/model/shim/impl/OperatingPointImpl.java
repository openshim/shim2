/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.FrequencyUnitType;
import org.multicore_association.shim.model.shim.OperatingPoint;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.VoltageUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operating Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getFrequencyUnit <em>Frequency Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.OperatingPointImpl#getVoltageUnit <em>Voltage Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatingPointImpl extends MinimalEObjectImpl.Container implements OperatingPoint {
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
	 * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FREQUENCY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequency()
	 * @generated
	 * @ordered
	 */
	protected Integer frequency = FREQUENCY_EDEFAULT;

	/**
	 * This is true if the Frequency attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyESet;

	/**
	 * The default value of the '{@link #getFrequencyUnit() <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyUnit()
	 * @generated
	 * @ordered
	 */
	protected static final FrequencyUnitType FREQUENCY_UNIT_EDEFAULT = FrequencyUnitType.HZ;

	/**
	 * The cached value of the '{@link #getFrequencyUnit() <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyUnit()
	 * @generated
	 * @ordered
	 */
	protected FrequencyUnitType frequencyUnit = FREQUENCY_UNIT_EDEFAULT;

	/**
	 * This is true if the Frequency Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyUnitESet;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VOLTAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected Integer voltage = VOLTAGE_EDEFAULT;

	/**
	 * This is true if the Voltage attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageESet;

	/**
	 * The default value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected static final VoltageUnitType VOLTAGE_UNIT_EDEFAULT = VoltageUnitType.PV;

	/**
	 * The cached value of the '{@link #getVoltageUnit() <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageUnit()
	 * @generated
	 * @ordered
	 */
	protected VoltageUnitType voltageUnit = VOLTAGE_UNIT_EDEFAULT;

	/**
	 * This is true if the Voltage Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageUnitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatingPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.OPERATING_POINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFrequency() {
		return frequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(Integer newFrequency) {
		Integer oldFrequency = frequency;
		frequency = newFrequency;
		boolean oldFrequencyESet = frequencyESet;
		frequencyESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__FREQUENCY, oldFrequency,
					frequency, !oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrequency() {
		Integer oldFrequency = frequency;
		boolean oldFrequencyESet = frequencyESet;
		frequency = FREQUENCY_EDEFAULT;
		frequencyESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.OPERATING_POINT__FREQUENCY,
					oldFrequency, FREQUENCY_EDEFAULT, oldFrequencyESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrequency() {
		return frequencyESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnitType getFrequencyUnit() {
		return frequencyUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyUnit(FrequencyUnitType newFrequencyUnit) {
		FrequencyUnitType oldFrequencyUnit = frequencyUnit;
		frequencyUnit = newFrequencyUnit == null ? FREQUENCY_UNIT_EDEFAULT : newFrequencyUnit;
		boolean oldFrequencyUnitESet = frequencyUnitESet;
		frequencyUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__FREQUENCY_UNIT,
					oldFrequencyUnit, frequencyUnit, !oldFrequencyUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrequencyUnit() {
		FrequencyUnitType oldFrequencyUnit = frequencyUnit;
		boolean oldFrequencyUnitESet = frequencyUnitESet;
		frequencyUnit = FREQUENCY_UNIT_EDEFAULT;
		frequencyUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.OPERATING_POINT__FREQUENCY_UNIT,
					oldFrequencyUnit, FREQUENCY_UNIT_EDEFAULT, oldFrequencyUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrequencyUnit() {
		return frequencyUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(Integer newVoltage) {
		Integer oldVoltage = voltage;
		voltage = newVoltage;
		boolean oldVoltageESet = voltageESet;
		voltageESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__VOLTAGE, oldVoltage,
					voltage, !oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoltage() {
		Integer oldVoltage = voltage;
		boolean oldVoltageESet = voltageESet;
		voltage = VOLTAGE_EDEFAULT;
		voltageESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.OPERATING_POINT__VOLTAGE, oldVoltage,
					VOLTAGE_EDEFAULT, oldVoltageESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoltage() {
		return voltageESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageUnitType getVoltageUnit() {
		return voltageUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageUnit(VoltageUnitType newVoltageUnit) {
		VoltageUnitType oldVoltageUnit = voltageUnit;
		voltageUnit = newVoltageUnit == null ? VOLTAGE_UNIT_EDEFAULT : newVoltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.OPERATING_POINT__VOLTAGE_UNIT,
					oldVoltageUnit, voltageUnit, !oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoltageUnit() {
		VoltageUnitType oldVoltageUnit = voltageUnit;
		boolean oldVoltageUnitESet = voltageUnitESet;
		voltageUnit = VOLTAGE_UNIT_EDEFAULT;
		voltageUnitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.OPERATING_POINT__VOLTAGE_UNIT,
					oldVoltageUnit, VOLTAGE_UNIT_EDEFAULT, oldVoltageUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoltageUnit() {
		return voltageUnitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.OPERATING_POINT__NAME:
			return getName();
		case ShimPackage.OPERATING_POINT__ID:
			return getId();
		case ShimPackage.OPERATING_POINT__FREQUENCY:
			return getFrequency();
		case ShimPackage.OPERATING_POINT__FREQUENCY_UNIT:
			return getFrequencyUnit();
		case ShimPackage.OPERATING_POINT__VOLTAGE:
			return getVoltage();
		case ShimPackage.OPERATING_POINT__VOLTAGE_UNIT:
			return getVoltageUnit();
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
		case ShimPackage.OPERATING_POINT__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.OPERATING_POINT__ID:
			setId((String) newValue);
			return;
		case ShimPackage.OPERATING_POINT__FREQUENCY:
			setFrequency((Integer) newValue);
			return;
		case ShimPackage.OPERATING_POINT__FREQUENCY_UNIT:
			setFrequencyUnit((FrequencyUnitType) newValue);
			return;
		case ShimPackage.OPERATING_POINT__VOLTAGE:
			setVoltage((Integer) newValue);
			return;
		case ShimPackage.OPERATING_POINT__VOLTAGE_UNIT:
			setVoltageUnit((VoltageUnitType) newValue);
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
		case ShimPackage.OPERATING_POINT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.OPERATING_POINT__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.OPERATING_POINT__FREQUENCY:
			unsetFrequency();
			return;
		case ShimPackage.OPERATING_POINT__FREQUENCY_UNIT:
			unsetFrequencyUnit();
			return;
		case ShimPackage.OPERATING_POINT__VOLTAGE:
			unsetVoltage();
			return;
		case ShimPackage.OPERATING_POINT__VOLTAGE_UNIT:
			unsetVoltageUnit();
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
		case ShimPackage.OPERATING_POINT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.OPERATING_POINT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.OPERATING_POINT__FREQUENCY:
			return isSetFrequency();
		case ShimPackage.OPERATING_POINT__FREQUENCY_UNIT:
			return isSetFrequencyUnit();
		case ShimPackage.OPERATING_POINT__VOLTAGE:
			return isSetVoltage();
		case ShimPackage.OPERATING_POINT__VOLTAGE_UNIT:
			return isSetVoltageUnit();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", frequency: ");
		if (frequencyESet)
			result.append(frequency);
		else
			result.append("<unset>");
		result.append(", frequencyUnit: ");
		if (frequencyUnitESet)
			result.append(frequencyUnit);
		else
			result.append("<unset>");
		result.append(", voltage: ");
		if (voltageESet)
			result.append(voltage);
		else
			result.append("<unset>");
		result.append(", voltageUnit: ");
		if (voltageUnitESet)
			result.append(voltageUnit);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //OperatingPointImpl
