/**
 */
package org.multicore_association.shim.model.shim.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.multicore_association.shim.model.shim.AbstractComponent;
import org.multicore_association.shim.model.shim.PowerConsumption;
import org.multicore_association.shim.model.shim.PowerConsumptionSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power Consumption Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.PowerConsumptionSetImpl#getPowerConsumerRef <em>Power Consumer Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerConsumptionSetImpl extends MinimalEObjectImpl.Container implements PowerConsumptionSet {
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
	 * The cached value of the '{@link #getPowerConsumption() <em>Power Consumption</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumption()
	 * @generated
	 * @ordered
	 */
	protected EList<PowerConsumption> powerConsumption;

	/**
	 * The cached value of the '{@link #getPowerConsumerRef() <em>Power Consumer Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerConsumerRef()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractComponent> powerConsumerRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerConsumptionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.POWER_CONSUMPTION_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.POWER_CONSUMPTION_SET__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.POWER_CONSUMPTION_SET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PowerConsumption> getPowerConsumption() {
		if (powerConsumption == null) {
			powerConsumption = new EObjectContainmentEList<PowerConsumption>(PowerConsumption.class, this,
					ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION);
		}
		return powerConsumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractComponent> getPowerConsumerRef() {
		if (powerConsumerRef == null) {
			powerConsumerRef = new EObjectResolvingEList<AbstractComponent>(AbstractComponent.class, this,
					ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMER_REF);
		}
		return powerConsumerRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION:
			return ((InternalEList<?>) getPowerConsumption()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.POWER_CONSUMPTION_SET__NAME:
			return getName();
		case ShimPackage.POWER_CONSUMPTION_SET__ID:
			return getId();
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION:
			return getPowerConsumption();
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMER_REF:
			return getPowerConsumerRef();
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
		case ShimPackage.POWER_CONSUMPTION_SET__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__ID:
			setId((String) newValue);
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION:
			getPowerConsumption().clear();
			getPowerConsumption().addAll((Collection<? extends PowerConsumption>) newValue);
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMER_REF:
			getPowerConsumerRef().clear();
			getPowerConsumerRef().addAll((Collection<? extends AbstractComponent>) newValue);
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
		case ShimPackage.POWER_CONSUMPTION_SET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__ID:
			setId(ID_EDEFAULT);
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION:
			getPowerConsumption().clear();
			return;
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMER_REF:
			getPowerConsumerRef().clear();
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
		case ShimPackage.POWER_CONSUMPTION_SET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.POWER_CONSUMPTION_SET__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMPTION:
			return powerConsumption != null && !powerConsumption.isEmpty();
		case ShimPackage.POWER_CONSUMPTION_SET__POWER_CONSUMER_REF:
			return powerConsumerRef != null && !powerConsumerRef.isEmpty();
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

} //PowerConsumptionSetImpl
