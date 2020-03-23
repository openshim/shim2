/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.PowerConfiguration;
import org.multicore_association.shim.model.shim.PowerConsumptionSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl#getSystemConfigurationSrc <em>System Configuration Src</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConfigurationImpl#getPowerConsumptionSet <em>Power Consumption Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerConfigurationImpl extends MinimalEObjectImpl.Container implements PowerConfiguration {
	/**
	 * The default value of the '{@link #getSystemConfigurationSrc() <em>System Configuration Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfigurationSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_CONFIGURATION_SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemConfigurationSrc() <em>System Configuration Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfigurationSrc()
	 * @generated
	 * @ordered
	 */
	protected String systemConfigurationSrc = SYSTEM_CONFIGURATION_SRC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPowerConsumptionSet() <em>Power Consumption Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumptionSet()
	 * @generated
	 * @ordered
	 */
	protected PowerConsumptionSet powerConsumptionSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.POWER_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSystemConfigurationSrc() {
		return systemConfigurationSrc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemConfigurationSrc(String newSystemConfigurationSrc) {
		String oldSystemConfigurationSrc = systemConfigurationSrc;
		systemConfigurationSrc = newSystemConfigurationSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC, oldSystemConfigurationSrc,
					systemConfigurationSrc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConsumptionSet getPowerConsumptionSet() {
		return powerConsumptionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerConsumptionSet(PowerConsumptionSet newPowerConsumptionSet,
			NotificationChain msgs) {
		PowerConsumptionSet oldPowerConsumptionSet = powerConsumptionSet;
		powerConsumptionSet = newPowerConsumptionSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET, oldPowerConsumptionSet,
					newPowerConsumptionSet);
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
	public void setPowerConsumptionSet(PowerConsumptionSet newPowerConsumptionSet) {
		if (newPowerConsumptionSet != powerConsumptionSet) {
			NotificationChain msgs = null;
			if (powerConsumptionSet != null)
				msgs = ((InternalEObject) powerConsumptionSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET, null, msgs);
			if (newPowerConsumptionSet != null)
				msgs = ((InternalEObject) newPowerConsumptionSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET, null, msgs);
			msgs = basicSetPowerConsumptionSet(newPowerConsumptionSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET, newPowerConsumptionSet,
					newPowerConsumptionSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET:
			return basicSetPowerConsumptionSet(null, msgs);
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
		case ShimPackage.POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC:
			return getSystemConfigurationSrc();
		case ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET:
			return getPowerConsumptionSet();
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
		case ShimPackage.POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC:
			setSystemConfigurationSrc((String) newValue);
			return;
		case ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET:
			setPowerConsumptionSet((PowerConsumptionSet) newValue);
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
		case ShimPackage.POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC:
			setSystemConfigurationSrc(SYSTEM_CONFIGURATION_SRC_EDEFAULT);
			return;
		case ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET:
			setPowerConsumptionSet((PowerConsumptionSet) null);
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
		case ShimPackage.POWER_CONFIGURATION__SYSTEM_CONFIGURATION_SRC:
			return SYSTEM_CONFIGURATION_SRC_EDEFAULT == null ? systemConfigurationSrc != null
					: !SYSTEM_CONFIGURATION_SRC_EDEFAULT.equals(systemConfigurationSrc);
		case ShimPackage.POWER_CONFIGURATION__POWER_CONSUMPTION_SET:
			return powerConsumptionSet != null;
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
		result.append(" (systemConfigurationSrc: ");
		result.append(systemConfigurationSrc);
		result.append(')');
		return result.toString();
	}

} //PowerConfigurationImpl
