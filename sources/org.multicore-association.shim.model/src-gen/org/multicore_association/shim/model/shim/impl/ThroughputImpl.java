/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.FrequencyDomain;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.Throughput;
import org.multicore_association.shim.model.shim.ThroughputUnitType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Throughput</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ThroughputImpl#getFrequencyDomainRef <em>Frequency Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ThroughputImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ThroughputImpl#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ThroughputImpl extends MinimalEObjectImpl.Container implements Throughput {
	/**
	 * The cached value of the '{@link #getFrequencyDomainRef() <em>Frequency Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyDomainRef()
	 * @generated
	 * @ordered
	 */
	protected FrequencyDomain frequencyDomainRef;

	/**
	 * This is true if the Frequency Domain Ref reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean frequencyDomainRefESet;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Integer value = VALUE_EDEFAULT;

	/**
	 * This is true if the Value attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueESet;

	/**
	 * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected static final ThroughputUnitType UNIT_EDEFAULT = ThroughputUnitType.BCYCLE;

	/**
	 * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnit()
	 * @generated
	 * @ordered
	 */
	protected ThroughputUnitType unit = UNIT_EDEFAULT;

	/**
	 * This is true if the Unit attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean unitESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ThroughputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.THROUGHPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyDomain getFrequencyDomainRef() {
		if (frequencyDomainRef != null && frequencyDomainRef.eIsProxy()) {
			InternalEObject oldFrequencyDomainRef = (InternalEObject) frequencyDomainRef;
			frequencyDomainRef = (FrequencyDomain) eResolveProxy(oldFrequencyDomainRef);
			if (frequencyDomainRef != oldFrequencyDomainRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF, oldFrequencyDomainRef, frequencyDomainRef));
			}
		}
		return frequencyDomainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyDomain basicGetFrequencyDomainRef() {
		return frequencyDomainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyDomainRef(FrequencyDomain newFrequencyDomainRef) {
		FrequencyDomain oldFrequencyDomainRef = frequencyDomainRef;
		frequencyDomainRef = newFrequencyDomainRef;
		boolean oldFrequencyDomainRefESet = frequencyDomainRefESet;
		frequencyDomainRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF,
					oldFrequencyDomainRef, frequencyDomainRef, !oldFrequencyDomainRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetFrequencyDomainRef() {
		FrequencyDomain oldFrequencyDomainRef = frequencyDomainRef;
		boolean oldFrequencyDomainRefESet = frequencyDomainRefESet;
		frequencyDomainRef = null;
		frequencyDomainRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF,
					oldFrequencyDomainRef, null, oldFrequencyDomainRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFrequencyDomainRef() {
		return frequencyDomainRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Integer newValue) {
		Integer oldValue = value;
		value = newValue;
		boolean oldValueESet = valueESet;
		valueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.THROUGHPUT__VALUE, oldValue, value,
					!oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValue() {
		Integer oldValue = value;
		boolean oldValueESet = valueESet;
		value = VALUE_EDEFAULT;
		valueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.THROUGHPUT__VALUE, oldValue,
					VALUE_EDEFAULT, oldValueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue() {
		return valueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThroughputUnitType getUnit() {
		return unit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnit(ThroughputUnitType newUnit) {
		ThroughputUnitType oldUnit = unit;
		unit = newUnit == null ? UNIT_EDEFAULT : newUnit;
		boolean oldUnitESet = unitESet;
		unitESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.THROUGHPUT__UNIT, oldUnit, unit,
					!oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnit() {
		ThroughputUnitType oldUnit = unit;
		boolean oldUnitESet = unitESet;
		unit = UNIT_EDEFAULT;
		unitESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.THROUGHPUT__UNIT, oldUnit,
					UNIT_EDEFAULT, oldUnitESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnit() {
		return unitESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF:
			if (resolve)
				return getFrequencyDomainRef();
			return basicGetFrequencyDomainRef();
		case ShimPackage.THROUGHPUT__VALUE:
			return getValue();
		case ShimPackage.THROUGHPUT__UNIT:
			return getUnit();
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
		case ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF:
			setFrequencyDomainRef((FrequencyDomain) newValue);
			return;
		case ShimPackage.THROUGHPUT__VALUE:
			setValue((Integer) newValue);
			return;
		case ShimPackage.THROUGHPUT__UNIT:
			setUnit((ThroughputUnitType) newValue);
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
		case ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF:
			unsetFrequencyDomainRef();
			return;
		case ShimPackage.THROUGHPUT__VALUE:
			unsetValue();
			return;
		case ShimPackage.THROUGHPUT__UNIT:
			unsetUnit();
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
		case ShimPackage.THROUGHPUT__FREQUENCY_DOMAIN_REF:
			return isSetFrequencyDomainRef();
		case ShimPackage.THROUGHPUT__VALUE:
			return isSetValue();
		case ShimPackage.THROUGHPUT__UNIT:
			return isSetUnit();
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
		result.append(" (value: ");
		if (valueESet)
			result.append(value);
		else
			result.append("<unset>");
		result.append(", unit: ");
		if (unitESet)
			result.append(unit);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ThroughputImpl
