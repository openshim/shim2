/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.PowerConfiguration;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ShimImpl#getSystemConfiguration <em>System Configuration</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ShimImpl#getPowerConfiguration <em>Power Configuration</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ShimImpl#getFunctionalUnitSet <em>Functional Unit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShimImpl extends AbstractShimImpl implements Shim {
	/**
	 * The cached value of the '{@link #getSystemConfiguration() <em>System Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemConfiguration()
	 * @generated
	 * @ordered
	 */
	protected SystemConfiguration systemConfiguration;

	/**
	 * The cached value of the '{@link #getPowerConfiguration() <em>Power Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConfiguration()
	 * @generated
	 * @ordered
	 */
	protected PowerConfiguration powerConfiguration;

	/**
	 * The cached value of the '{@link #getFunctionalUnitSet() <em>Functional Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalUnitSet()
	 * @generated
	 * @ordered
	 */
	protected FunctionalUnitSet functionalUnitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SHIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemConfiguration getSystemConfiguration() {
		return systemConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemConfiguration(SystemConfiguration newSystemConfiguration,
			NotificationChain msgs) {
		SystemConfiguration oldSystemConfiguration = systemConfiguration;
		systemConfiguration = newSystemConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SHIM__SYSTEM_CONFIGURATION, oldSystemConfiguration, newSystemConfiguration);
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
	public void setSystemConfiguration(SystemConfiguration newSystemConfiguration) {
		if (newSystemConfiguration != systemConfiguration) {
			NotificationChain msgs = null;
			if (systemConfiguration != null)
				msgs = ((InternalEObject) systemConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__SYSTEM_CONFIGURATION, null, msgs);
			if (newSystemConfiguration != null)
				msgs = ((InternalEObject) newSystemConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__SYSTEM_CONFIGURATION, null, msgs);
			msgs = basicSetSystemConfiguration(newSystemConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHIM__SYSTEM_CONFIGURATION,
					newSystemConfiguration, newSystemConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PowerConfiguration getPowerConfiguration() {
		return powerConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerConfiguration(PowerConfiguration newPowerConfiguration,
			NotificationChain msgs) {
		PowerConfiguration oldPowerConfiguration = powerConfiguration;
		powerConfiguration = newPowerConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SHIM__POWER_CONFIGURATION, oldPowerConfiguration, newPowerConfiguration);
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
	public void setPowerConfiguration(PowerConfiguration newPowerConfiguration) {
		if (newPowerConfiguration != powerConfiguration) {
			NotificationChain msgs = null;
			if (powerConfiguration != null)
				msgs = ((InternalEObject) powerConfiguration).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__POWER_CONFIGURATION, null, msgs);
			if (newPowerConfiguration != null)
				msgs = ((InternalEObject) newPowerConfiguration).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__POWER_CONFIGURATION, null, msgs);
			msgs = basicSetPowerConfiguration(newPowerConfiguration, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHIM__POWER_CONFIGURATION,
					newPowerConfiguration, newPowerConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnitSet getFunctionalUnitSet() {
		return functionalUnitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalUnitSet(FunctionalUnitSet newFunctionalUnitSet, NotificationChain msgs) {
		FunctionalUnitSet oldFunctionalUnitSet = functionalUnitSet;
		functionalUnitSet = newFunctionalUnitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SHIM__FUNCTIONAL_UNIT_SET, oldFunctionalUnitSet, newFunctionalUnitSet);
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
	public void setFunctionalUnitSet(FunctionalUnitSet newFunctionalUnitSet) {
		if (newFunctionalUnitSet != functionalUnitSet) {
			NotificationChain msgs = null;
			if (functionalUnitSet != null)
				msgs = ((InternalEObject) functionalUnitSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__FUNCTIONAL_UNIT_SET, null, msgs);
			if (newFunctionalUnitSet != null)
				msgs = ((InternalEObject) newFunctionalUnitSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SHIM__FUNCTIONAL_UNIT_SET, null, msgs);
			msgs = basicSetFunctionalUnitSet(newFunctionalUnitSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SHIM__FUNCTIONAL_UNIT_SET,
					newFunctionalUnitSet, newFunctionalUnitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.SHIM__SYSTEM_CONFIGURATION:
			return basicSetSystemConfiguration(null, msgs);
		case ShimPackage.SHIM__POWER_CONFIGURATION:
			return basicSetPowerConfiguration(null, msgs);
		case ShimPackage.SHIM__FUNCTIONAL_UNIT_SET:
			return basicSetFunctionalUnitSet(null, msgs);
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
		case ShimPackage.SHIM__SYSTEM_CONFIGURATION:
			return getSystemConfiguration();
		case ShimPackage.SHIM__POWER_CONFIGURATION:
			return getPowerConfiguration();
		case ShimPackage.SHIM__FUNCTIONAL_UNIT_SET:
			return getFunctionalUnitSet();
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
		case ShimPackage.SHIM__SYSTEM_CONFIGURATION:
			setSystemConfiguration((SystemConfiguration) newValue);
			return;
		case ShimPackage.SHIM__POWER_CONFIGURATION:
			setPowerConfiguration((PowerConfiguration) newValue);
			return;
		case ShimPackage.SHIM__FUNCTIONAL_UNIT_SET:
			setFunctionalUnitSet((FunctionalUnitSet) newValue);
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
		case ShimPackage.SHIM__SYSTEM_CONFIGURATION:
			setSystemConfiguration((SystemConfiguration) null);
			return;
		case ShimPackage.SHIM__POWER_CONFIGURATION:
			setPowerConfiguration((PowerConfiguration) null);
			return;
		case ShimPackage.SHIM__FUNCTIONAL_UNIT_SET:
			setFunctionalUnitSet((FunctionalUnitSet) null);
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
		case ShimPackage.SHIM__SYSTEM_CONFIGURATION:
			return systemConfiguration != null;
		case ShimPackage.SHIM__POWER_CONFIGURATION:
			return powerConfiguration != null;
		case ShimPackage.SHIM__FUNCTIONAL_UNIT_SET:
			return functionalUnitSet != null;
		}
		return super.eIsSet(featureID);
	}

} //ShimImpl
