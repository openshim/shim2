/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AbstractComponent;
import org.multicore_association.shim.model.shim.FrequencyDomain;
import org.multicore_association.shim.model.shim.OperatingPointSet;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.VoltageDomain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl#getFrequencyDomainRef <em>Frequency Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl#getVoltageDomainRef <em>Voltage Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractComponentImpl#getOperatingPointRef <em>Operating Point Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractComponentImpl extends MinimalEObjectImpl.Container implements AbstractComponent {
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
	 * The cached value of the '{@link #getVoltageDomainRef() <em>Voltage Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltageDomainRef()
	 * @generated
	 * @ordered
	 */
	protected VoltageDomain voltageDomainRef;

	/**
	 * This is true if the Voltage Domain Ref reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean voltageDomainRefESet;

	/**
	 * The cached value of the '{@link #getOperatingPointRef() <em>Operating Point Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperatingPointRef()
	 * @generated
	 * @ordered
	 */
	protected OperatingPointSet operatingPointRef;

	/**
	 * This is true if the Operating Point Ref reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operatingPointRefESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ABSTRACT_COMPONENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMPONENT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMPONENT__ID, oldId, id));
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
							ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF, oldFrequencyDomainRef,
							frequencyDomainRef));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF,
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
			eNotify(new ENotificationImpl(this, Notification.UNSET,
					ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF, oldFrequencyDomainRef, null,
					oldFrequencyDomainRefESet));
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
	public VoltageDomain getVoltageDomainRef() {
		if (voltageDomainRef != null && voltageDomainRef.eIsProxy()) {
			InternalEObject oldVoltageDomainRef = (InternalEObject) voltageDomainRef;
			voltageDomainRef = (VoltageDomain) eResolveProxy(oldVoltageDomainRef);
			if (voltageDomainRef != oldVoltageDomainRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF, oldVoltageDomainRef, voltageDomainRef));
			}
		}
		return voltageDomainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VoltageDomain basicGetVoltageDomainRef() {
		return voltageDomainRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltageDomainRef(VoltageDomain newVoltageDomainRef) {
		VoltageDomain oldVoltageDomainRef = voltageDomainRef;
		voltageDomainRef = newVoltageDomainRef;
		boolean oldVoltageDomainRefESet = voltageDomainRefESet;
		voltageDomainRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF,
					oldVoltageDomainRef, voltageDomainRef, !oldVoltageDomainRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVoltageDomainRef() {
		VoltageDomain oldVoltageDomainRef = voltageDomainRef;
		boolean oldVoltageDomainRefESet = voltageDomainRefESet;
		voltageDomainRef = null;
		voltageDomainRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF,
					oldVoltageDomainRef, null, oldVoltageDomainRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVoltageDomainRef() {
		return voltageDomainRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperatingPointSet getOperatingPointRef() {
		if (operatingPointRef != null && operatingPointRef.eIsProxy()) {
			InternalEObject oldOperatingPointRef = (InternalEObject) operatingPointRef;
			operatingPointRef = (OperatingPointSet) eResolveProxy(oldOperatingPointRef);
			if (operatingPointRef != oldOperatingPointRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF, oldOperatingPointRef,
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
	public OperatingPointSet basicGetOperatingPointRef() {
		return operatingPointRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperatingPointRef(OperatingPointSet newOperatingPointRef) {
		OperatingPointSet oldOperatingPointRef = operatingPointRef;
		operatingPointRef = newOperatingPointRef;
		boolean oldOperatingPointRefESet = operatingPointRefESet;
		operatingPointRefESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF,
					oldOperatingPointRef, operatingPointRef, !oldOperatingPointRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperatingPointRef() {
		OperatingPointSet oldOperatingPointRef = operatingPointRef;
		boolean oldOperatingPointRefESet = operatingPointRefESet;
		operatingPointRef = null;
		operatingPointRefESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF,
					oldOperatingPointRef, null, oldOperatingPointRefESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperatingPointRef() {
		return operatingPointRefESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_COMPONENT__NAME:
			return getName();
		case ShimPackage.ABSTRACT_COMPONENT__ID:
			return getId();
		case ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF:
			if (resolve)
				return getFrequencyDomainRef();
			return basicGetFrequencyDomainRef();
		case ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF:
			if (resolve)
				return getVoltageDomainRef();
			return basicGetVoltageDomainRef();
		case ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF:
			if (resolve)
				return getOperatingPointRef();
			return basicGetOperatingPointRef();
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
		case ShimPackage.ABSTRACT_COMPONENT__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__ID:
			setId((String) newValue);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF:
			setFrequencyDomainRef((FrequencyDomain) newValue);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF:
			setVoltageDomainRef((VoltageDomain) newValue);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF:
			setOperatingPointRef((OperatingPointSet) newValue);
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
		case ShimPackage.ABSTRACT_COMPONENT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF:
			unsetFrequencyDomainRef();
			return;
		case ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF:
			unsetVoltageDomainRef();
			return;
		case ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF:
			unsetOperatingPointRef();
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
		case ShimPackage.ABSTRACT_COMPONENT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.ABSTRACT_COMPONENT__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.ABSTRACT_COMPONENT__FREQUENCY_DOMAIN_REF:
			return isSetFrequencyDomainRef();
		case ShimPackage.ABSTRACT_COMPONENT__VOLTAGE_DOMAIN_REF:
			return isSetVoltageDomainRef();
		case ShimPackage.ABSTRACT_COMPONENT__OPERATING_POINT_REF:
			return isSetOperatingPointRef();
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
		result.append(')');
		return result.toString();
	}

} //AbstractComponentImpl
