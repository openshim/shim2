/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.CommunicationSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.ContentionGroupSet;
import org.multicore_association.shim.model.shim.FrequencyVoltageSet;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl#getFrequencyVoltageSet <em>Frequency Voltage Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.SystemConfigurationImpl#getContentionGroupSet <em>Contention Group Set</em>}</li>
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
	 * The cached value of the '{@link #getAddressSpaceSet() <em>Address Space Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpaceSet()
	 * @generated
	 * @ordered
	 */
	protected AddressSpaceSet addressSpaceSet;

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
	 * The cached value of the '{@link #getFrequencyVoltageSet() <em>Frequency Voltage Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrequencyVoltageSet()
	 * @generated
	 * @ordered
	 */
	protected FrequencyVoltageSet frequencyVoltageSet;

	/**
	 * The cached value of the '{@link #getContentionGroupSet() <em>Contention Group Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentionGroupSet()
	 * @generated
	 * @ordered
	 */
	protected ContentionGroupSet contentionGroupSet;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, oldComponentSet, newComponentSet);
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
	public void setComponentSet(ComponentSet newComponentSet) {
		if (newComponentSet != componentSet) {
			NotificationChain msgs = null;
			if (componentSet != null)
				msgs = ((InternalEObject) componentSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, null, msgs);
			if (newComponentSet != null)
				msgs = ((InternalEObject) newComponentSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET, null, msgs);
			msgs = basicSetComponentSet(newComponentSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMPONENT_SET,
					newComponentSet, newComponentSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, oldAddressSpaceSet, newAddressSpaceSet);
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
	public void setAddressSpaceSet(AddressSpaceSet newAddressSpaceSet) {
		if (newAddressSpaceSet != addressSpaceSet) {
			NotificationChain msgs = null;
			if (addressSpaceSet != null)
				msgs = ((InternalEObject) addressSpaceSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, null, msgs);
			if (newAddressSpaceSet != null)
				msgs = ((InternalEObject) newAddressSpaceSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET, null, msgs);
			msgs = basicSetAddressSpaceSet(newAddressSpaceSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET,
					newAddressSpaceSet, newAddressSpaceSet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, oldCommunicationSet, newCommunicationSet);
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
	public void setCommunicationSet(CommunicationSet newCommunicationSet) {
		if (newCommunicationSet != communicationSet) {
			NotificationChain msgs = null;
			if (communicationSet != null)
				msgs = ((InternalEObject) communicationSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, null, msgs);
			if (newCommunicationSet != null)
				msgs = ((InternalEObject) newCommunicationSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET, null, msgs);
			msgs = basicSetCommunicationSet(newCommunicationSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET,
					newCommunicationSet, newCommunicationSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyVoltageSet getFrequencyVoltageSet() {
		return frequencyVoltageSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrequencyVoltageSet(FrequencyVoltageSet newFrequencyVoltageSet,
			NotificationChain msgs) {
		FrequencyVoltageSet oldFrequencyVoltageSet = frequencyVoltageSet;
		frequencyVoltageSet = newFrequencyVoltageSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET, oldFrequencyVoltageSet,
					newFrequencyVoltageSet);
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
	public void setFrequencyVoltageSet(FrequencyVoltageSet newFrequencyVoltageSet) {
		if (newFrequencyVoltageSet != frequencyVoltageSet) {
			NotificationChain msgs = null;
			if (frequencyVoltageSet != null)
				msgs = ((InternalEObject) frequencyVoltageSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET, null, msgs);
			if (newFrequencyVoltageSet != null)
				msgs = ((InternalEObject) newFrequencyVoltageSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET, null, msgs);
			msgs = basicSetFrequencyVoltageSet(newFrequencyVoltageSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET, newFrequencyVoltageSet,
					newFrequencyVoltageSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentionGroupSet getContentionGroupSet() {
		return contentionGroupSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentionGroupSet(ContentionGroupSet newContentionGroupSet,
			NotificationChain msgs) {
		ContentionGroupSet oldContentionGroupSet = contentionGroupSet;
		contentionGroupSet = newContentionGroupSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET, oldContentionGroupSet,
					newContentionGroupSet);
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
	public void setContentionGroupSet(ContentionGroupSet newContentionGroupSet) {
		if (newContentionGroupSet != contentionGroupSet) {
			NotificationChain msgs = null;
			if (contentionGroupSet != null)
				msgs = ((InternalEObject) contentionGroupSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET, null, msgs);
			if (newContentionGroupSet != null)
				msgs = ((InternalEObject) newContentionGroupSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET, null, msgs);
			msgs = basicSetContentionGroupSet(newContentionGroupSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET, newContentionGroupSet,
					newContentionGroupSet));
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
		case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			return basicSetAddressSpaceSet(null, msgs);
		case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			return basicSetCommunicationSet(null, msgs);
		case ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET:
			return basicSetFrequencyVoltageSet(null, msgs);
		case ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET:
			return basicSetContentionGroupSet(null, msgs);
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
		case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			return getAddressSpaceSet();
		case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			return getCommunicationSet();
		case ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET:
			return getFrequencyVoltageSet();
		case ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET:
			return getContentionGroupSet();
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
			setComponentSet((ComponentSet) newValue);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			setAddressSpaceSet((AddressSpaceSet) newValue);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			setCommunicationSet((CommunicationSet) newValue);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET:
			setFrequencyVoltageSet((FrequencyVoltageSet) newValue);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET:
			setContentionGroupSet((ContentionGroupSet) newValue);
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
			setComponentSet((ComponentSet) null);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			setAddressSpaceSet((AddressSpaceSet) null);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			setCommunicationSet((CommunicationSet) null);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET:
			setFrequencyVoltageSet((FrequencyVoltageSet) null);
			return;
		case ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET:
			setContentionGroupSet((ContentionGroupSet) null);
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
		case ShimPackage.SYSTEM_CONFIGURATION__ADDRESS_SPACE_SET:
			return addressSpaceSet != null;
		case ShimPackage.SYSTEM_CONFIGURATION__COMMUNICATION_SET:
			return communicationSet != null;
		case ShimPackage.SYSTEM_CONFIGURATION__FREQUENCY_VOLTAGE_SET:
			return frequencyVoltageSet != null;
		case ShimPackage.SYSTEM_CONFIGURATION__CONTENTION_GROUP_SET:
			return contentionGroupSet != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemConfigurationImpl
