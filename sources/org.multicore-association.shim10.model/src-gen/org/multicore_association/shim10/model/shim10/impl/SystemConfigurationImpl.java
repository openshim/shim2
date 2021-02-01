/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.multicore_association.shim10.model.shim10.AddressSpaceSet;
import org.multicore_association.shim10.model.shim10.ClockFrequency;
import org.multicore_association.shim10.model.shim10.CommunicationSet;
import org.multicore_association.shim10.model.shim10.ComponentSet;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.SystemConfigurationImpl#getShimVersion <em>Shim Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemConfigurationImpl extends MinimalEObjectImpl.Container implements SystemConfiguration {
	/**
	 * The cached value of the '{@link #getComponentSet() <em>Component Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSet()
	 * @generated
	 * @ordered
	 */
	protected ComponentSet componentSet;

	/**
	 * The cached value of the '{@link #getCommunicationSet() <em>Communication Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSet()
	 * @generated
	 * @ordered
	 */
	protected CommunicationSet communicationSet;

	/**
	 * The cached value of the '{@link #getAddressSpaceSet() <em>Address Space Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceSet()
	 * @generated
	 * @ordered
	 */
	protected AddressSpaceSet addressSpaceSet;

	/**
	 * The cached value of the '{@link #getClockFrequency() <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClockFrequency()
	 * @generated
	 * @ordered
	 */
	protected ClockFrequency clockFrequency;

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
	 * The default value of the '{@link #getShimVersion() <em>Shim Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShimVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String SHIM_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShimVersion() <em>Shim Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShimVersion()
	 * @generated
	 * @ordered
	 */
	protected String shimVersion = SHIM_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.SYSTEM_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComponentSet getComponentSet() {
		return componentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentSet(ComponentSet newComponentSet, NotificationChain msgs) {
		ComponentSet oldComponentSet = componentSet;
		componentSet = newComponentSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, oldComponentSet, newComponentSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComponentSet(ComponentSet newComponentSet) {
		if (newComponentSet != componentSet) {
			NotificationChain msgs = null;
			if (componentSet != null)
				msgs = ((InternalEObject)componentSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, null, msgs);
			if (newComponentSet != null)
				msgs = ((InternalEObject)newComponentSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, null, msgs);
			msgs = basicSetComponentSet(newComponentSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, newComponentSet, newComponentSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSet getCommunicationSet() {
		return communicationSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationSet(CommunicationSet newCommunicationSet, NotificationChain msgs) {
		CommunicationSet oldCommunicationSet = communicationSet;
		communicationSet = newCommunicationSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, oldCommunicationSet, newCommunicationSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommunicationSet(CommunicationSet newCommunicationSet) {
		if (newCommunicationSet != communicationSet) {
			NotificationChain msgs = null;
			if (communicationSet != null)
				msgs = ((InternalEObject)communicationSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, null, msgs);
			if (newCommunicationSet != null)
				msgs = ((InternalEObject)newCommunicationSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, null, msgs);
			msgs = basicSetCommunicationSet(newCommunicationSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, newCommunicationSet, newCommunicationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressSpaceSet getAddressSpaceSet() {
		return addressSpaceSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpaceSet(AddressSpaceSet newAddressSpaceSet, NotificationChain msgs) {
		AddressSpaceSet oldAddressSpaceSet = addressSpaceSet;
		addressSpaceSet = newAddressSpaceSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, oldAddressSpaceSet, newAddressSpaceSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressSpaceSet(AddressSpaceSet newAddressSpaceSet) {
		if (newAddressSpaceSet != addressSpaceSet) {
			NotificationChain msgs = null;
			if (addressSpaceSet != null)
				msgs = ((InternalEObject)addressSpaceSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, null, msgs);
			if (newAddressSpaceSet != null)
				msgs = ((InternalEObject)newAddressSpaceSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, null, msgs);
			msgs = basicSetAddressSpaceSet(newAddressSpaceSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, newAddressSpaceSet, newAddressSpaceSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClockFrequency getClockFrequency() {
		return clockFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClockFrequency(ClockFrequency newClockFrequency, NotificationChain msgs) {
		ClockFrequency oldClockFrequency = clockFrequency;
		clockFrequency = newClockFrequency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY, oldClockFrequency, newClockFrequency);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClockFrequency(ClockFrequency newClockFrequency) {
		if (newClockFrequency != clockFrequency) {
			NotificationChain msgs = null;
			if (clockFrequency != null)
				msgs = ((InternalEObject)clockFrequency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY, null, msgs);
			if (newClockFrequency != null)
				msgs = ((InternalEObject)newClockFrequency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY, null, msgs);
			msgs = basicSetClockFrequency(newClockFrequency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY, newClockFrequency, newClockFrequency));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShimVersion() {
		return shimVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShimVersion(String newShimVersion) {
		String oldShimVersion = shimVersion;
		shimVersion = newShimVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION, oldShimVersion, shimVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
				return basicSetComponentSet(null, msgs);
			case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
				return basicSetCommunicationSet(null, msgs);
			case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
				return basicSetAddressSpaceSet(null, msgs);
			case ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
				return basicSetClockFrequency(null, msgs);
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
			case ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
				return getComponentSet();
			case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
				return getCommunicationSet();
			case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
				return getAddressSpaceSet();
			case ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
				return getClockFrequency();
			case ShimPackage.SYSTEM_CONFIGURATION__NAME:
				return getName();
			case ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION:
				return getShimVersion();
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
			case ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
				setComponentSet((ComponentSet)newValue);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
				setCommunicationSet((CommunicationSet)newValue);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
				setAddressSpaceSet((AddressSpaceSet)newValue);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
				setClockFrequency((ClockFrequency)newValue);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__NAME:
				setName((String)newValue);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION:
				setShimVersion((String)newValue);
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
			case ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
				setComponentSet((ComponentSet)null);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
				setCommunicationSet((CommunicationSet)null);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
				setAddressSpaceSet((AddressSpaceSet)null);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
				setClockFrequency((ClockFrequency)null);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION:
				setShimVersion(SHIM_VERSION_EDEFAULT);
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
			case ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET:
				return componentSet != null;
			case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
				return communicationSet != null;
			case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
				return addressSpaceSet != null;
			case ShimPackage.SYSTEM_CONFIGURATION__CLOCK_FREQUENCY:
				return clockFrequency != null;
			case ShimPackage.SYSTEM_CONFIGURATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ShimPackage.SYSTEM_CONFIGURATION__SHIM_VERSION:
				return SHIM_VERSION_EDEFAULT == null ? shimVersion != null : !SHIM_VERSION_EDEFAULT.equals(shimVersion);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", shimVersion: ");
		result.append(shimVersion);
		result.append(')');
		return result.toString();
	}

} //SystemConfigurationImpl
