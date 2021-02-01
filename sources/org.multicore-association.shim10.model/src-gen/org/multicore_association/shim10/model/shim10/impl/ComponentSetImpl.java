/**
 */
package org.multicore_association.shim10.model.shim10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.multicore_association.shim10.model.shim10.Cache;
import org.multicore_association.shim10.model.shim10.ComponentSet;
import org.multicore_association.shim10.model.shim10.MasterComponent;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim10.model.shim10.SlaveComponent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl#getSlaveComponent <em>Slave Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl#getMasterComponent <em>Master Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl#getCache <em>Cache</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.impl.ComponentSetImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentSetImpl extends MinimalEObjectImpl.Container implements ComponentSet {
	/**
	 * The cached value of the '{@link #getComponentSet() <em>Component Set</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSet()
	 * @generated
	 * @ordered
	 */
	protected EList<ComponentSet> componentSet;

	/**
	 * The cached value of the '{@link #getSlaveComponent() <em>Slave Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SlaveComponent> slaveComponent;

	/**
	 * The cached value of the '{@link #getMasterComponent() <em>Master Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<MasterComponent> masterComponent;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected EList<Cache> cache;

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
	protected ComponentSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.COMPONENT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ComponentSet> getComponentSet() {
		if (componentSet == null) {
			componentSet = new EObjectContainmentEList<ComponentSet>(ComponentSet.class, this, ShimPackage.COMPONENT_SET__COMPONENT_SET);
		}
		return componentSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SlaveComponent> getSlaveComponent() {
		if (slaveComponent == null) {
			slaveComponent = new EObjectContainmentEList<SlaveComponent>(SlaveComponent.class, this, ShimPackage.COMPONENT_SET__SLAVE_COMPONENT);
		}
		return slaveComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MasterComponent> getMasterComponent() {
		if (masterComponent == null) {
			masterComponent = new EObjectContainmentEList<MasterComponent>(MasterComponent.class, this, ShimPackage.COMPONENT_SET__MASTER_COMPONENT);
		}
		return masterComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cache> getCache() {
		if (cache == null) {
			cache = new EObjectContainmentEList<Cache>(Cache.class, this, ShimPackage.COMPONENT_SET__CACHE);
		}
		return cache;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.COMPONENT_SET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ShimPackage.COMPONENT_SET__COMPONENT_SET:
				return ((InternalEList<?>)getComponentSet()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMPONENT_SET__SLAVE_COMPONENT:
				return ((InternalEList<?>)getSlaveComponent()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMPONENT_SET__MASTER_COMPONENT:
				return ((InternalEList<?>)getMasterComponent()).basicRemove(otherEnd, msgs);
			case ShimPackage.COMPONENT_SET__CACHE:
				return ((InternalEList<?>)getCache()).basicRemove(otherEnd, msgs);
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
			case ShimPackage.COMPONENT_SET__COMPONENT_SET:
				return getComponentSet();
			case ShimPackage.COMPONENT_SET__SLAVE_COMPONENT:
				return getSlaveComponent();
			case ShimPackage.COMPONENT_SET__MASTER_COMPONENT:
				return getMasterComponent();
			case ShimPackage.COMPONENT_SET__CACHE:
				return getCache();
			case ShimPackage.COMPONENT_SET__NAME:
				return getName();
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
			case ShimPackage.COMPONENT_SET__COMPONENT_SET:
				getComponentSet().clear();
				getComponentSet().addAll((Collection<? extends ComponentSet>)newValue);
				return;
			case ShimPackage.COMPONENT_SET__SLAVE_COMPONENT:
				getSlaveComponent().clear();
				getSlaveComponent().addAll((Collection<? extends SlaveComponent>)newValue);
				return;
			case ShimPackage.COMPONENT_SET__MASTER_COMPONENT:
				getMasterComponent().clear();
				getMasterComponent().addAll((Collection<? extends MasterComponent>)newValue);
				return;
			case ShimPackage.COMPONENT_SET__CACHE:
				getCache().clear();
				getCache().addAll((Collection<? extends Cache>)newValue);
				return;
			case ShimPackage.COMPONENT_SET__NAME:
				setName((String)newValue);
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
			case ShimPackage.COMPONENT_SET__COMPONENT_SET:
				getComponentSet().clear();
				return;
			case ShimPackage.COMPONENT_SET__SLAVE_COMPONENT:
				getSlaveComponent().clear();
				return;
			case ShimPackage.COMPONENT_SET__MASTER_COMPONENT:
				getMasterComponent().clear();
				return;
			case ShimPackage.COMPONENT_SET__CACHE:
				getCache().clear();
				return;
			case ShimPackage.COMPONENT_SET__NAME:
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
			case ShimPackage.COMPONENT_SET__COMPONENT_SET:
				return componentSet != null && !componentSet.isEmpty();
			case ShimPackage.COMPONENT_SET__SLAVE_COMPONENT:
				return slaveComponent != null && !slaveComponent.isEmpty();
			case ShimPackage.COMPONENT_SET__MASTER_COMPONENT:
				return masterComponent != null && !masterComponent.isEmpty();
			case ShimPackage.COMPONENT_SET__CACHE:
				return cache != null && !cache.isEmpty();
			case ShimPackage.COMPONENT_SET__NAME:
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ComponentSetImpl
