/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.multicore_association.shim.model.shim.FrequencyDomain;
import org.multicore_association.shim.model.shim.FrequencyVoltageSet;
import org.multicore_association.shim.model.shim.OperatingPointSet;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.VoltageDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frequency Voltage Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl#getFrequencyDomain <em>Frequency Domain</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl#getVoltageDomain <em>Voltage Domain</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FrequencyVoltageSetImpl#getOperatingPointSet <em>Operating Point Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FrequencyVoltageSetImpl extends MinimalEObjectImpl.Container implements FrequencyVoltageSet {
	/**
	 * The cached value of the '{@link #getFrequencyDomain() <em>Frequency Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<FrequencyDomain> frequencyDomain;

	/**
	 * The cached value of the '{@link #getVoltageDomain() <em>Voltage Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<VoltageDomain> voltageDomain;

	/**
	 * The cached value of the '{@link #getOperatingPointSet() <em>Operating Point Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingPointSet()
	 * @generated
	 * @ordered
	 */
	protected EList<OperatingPointSet> operatingPointSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrequencyVoltageSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.FREQUENCY_VOLTAGE_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FrequencyDomain> getFrequencyDomain() {
		if (frequencyDomain == null) {
			frequencyDomain = new EObjectContainmentEList<FrequencyDomain>(FrequencyDomain.class, this,
					ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN);
		}
		return frequencyDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VoltageDomain> getVoltageDomain() {
		if (voltageDomain == null) {
			voltageDomain = new EObjectContainmentEList<VoltageDomain>(VoltageDomain.class, this,
					ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN);
		}
		return voltageDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperatingPointSet> getOperatingPointSet() {
		if (operatingPointSet == null) {
			operatingPointSet = new EObjectContainmentEList<OperatingPointSet>(OperatingPointSet.class, this,
					ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET);
		}
		return operatingPointSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN:
			return ((InternalEList<?>) getFrequencyDomain()).basicRemove(otherEnd, msgs);
		case ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN:
			return ((InternalEList<?>) getVoltageDomain()).basicRemove(otherEnd, msgs);
		case ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET:
			return ((InternalEList<?>) getOperatingPointSet()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN:
			return getFrequencyDomain();
		case ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN:
			return getVoltageDomain();
		case ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET:
			return getOperatingPointSet();
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
		case ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN:
			getFrequencyDomain().clear();
			getFrequencyDomain().addAll((Collection<? extends FrequencyDomain>) newValue);
			return;
		case ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN:
			getVoltageDomain().clear();
			getVoltageDomain().addAll((Collection<? extends VoltageDomain>) newValue);
			return;
		case ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET:
			getOperatingPointSet().clear();
			getOperatingPointSet().addAll((Collection<? extends OperatingPointSet>) newValue);
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
		case ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN:
			getFrequencyDomain().clear();
			return;
		case ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN:
			getVoltageDomain().clear();
			return;
		case ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET:
			getOperatingPointSet().clear();
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
		case ShimPackage.FREQUENCY_VOLTAGE_SET__FREQUENCY_DOMAIN:
			return frequencyDomain != null && !frequencyDomain.isEmpty();
		case ShimPackage.FREQUENCY_VOLTAGE_SET__VOLTAGE_DOMAIN:
			return voltageDomain != null && !voltageDomain.isEmpty();
		case ShimPackage.FREQUENCY_VOLTAGE_SET__OPERATING_POINT_SET:
			return operatingPointSet != null && !operatingPointSet.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FrequencyVoltageSetImpl
