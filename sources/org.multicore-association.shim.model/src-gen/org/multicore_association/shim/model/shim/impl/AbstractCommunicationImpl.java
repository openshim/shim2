/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AbstractCommunication;
import org.multicore_association.shim.model.shim.ConnectionSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl#getConnectionSet <em>Connection Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractCommunicationImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractCommunicationImpl extends MinimalEObjectImpl.Container implements AbstractCommunication {
	/**
	 * The cached value of the '{@link #getConnectionSet() <em>Connection Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionSet()
	 * @generated
	 * @ordered
	 */
	protected ConnectionSet connectionSet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractCommunicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ABSTRACT_COMMUNICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionSet getConnectionSet() {
		return connectionSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionSet(ConnectionSet newConnectionSet, NotificationChain msgs) {
		ConnectionSet oldConnectionSet = connectionSet;
		connectionSet = newConnectionSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET, oldConnectionSet, newConnectionSet);
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
	public void setConnectionSet(ConnectionSet newConnectionSet) {
		if (newConnectionSet != connectionSet) {
			NotificationChain msgs = null;
			if (connectionSet != null)
				msgs = ((InternalEObject) connectionSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET, null, msgs);
			if (newConnectionSet != null)
				msgs = ((InternalEObject) newConnectionSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET, null, msgs);
			msgs = basicSetConnectionSet(newConnectionSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET,
					newConnectionSet, newConnectionSet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_COMMUNICATION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET:
			return basicSetConnectionSet(null, msgs);
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
		case ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET:
			return getConnectionSet();
		case ShimPackage.ABSTRACT_COMMUNICATION__NAME:
			return getName();
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
		case ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET:
			setConnectionSet((ConnectionSet) newValue);
			return;
		case ShimPackage.ABSTRACT_COMMUNICATION__NAME:
			setName((String) newValue);
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
		case ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET:
			setConnectionSet((ConnectionSet) null);
			return;
		case ShimPackage.ABSTRACT_COMMUNICATION__NAME:
			setName(NAME_EDEFAULT);
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
		case ShimPackage.ABSTRACT_COMMUNICATION__CONNECTION_SET:
			return connectionSet != null;
		case ShimPackage.ABSTRACT_COMMUNICATION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(')');
		return result.toString();
	}

} //AbstractCommunicationImpl
