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

import org.multicore_association.shim.model.shim.ContentionGroup;
import org.multicore_association.shim.model.shim.ContentionGroupSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contention Group Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.ContentionGroupSetImpl#getContentionGroup <em>Contention Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContentionGroupSetImpl extends MinimalEObjectImpl.Container implements ContentionGroupSet {
	/**
	 * The cached value of the '{@link #getContentionGroup() <em>Contention Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentionGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<ContentionGroup> contentionGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentionGroupSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.CONTENTION_GROUP_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContentionGroup> getContentionGroup() {
		if (contentionGroup == null) {
			contentionGroup = new EObjectContainmentEList<ContentionGroup>(ContentionGroup.class, this,
					ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP);
		}
		return contentionGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP:
			return ((InternalEList<?>) getContentionGroup()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP:
			return getContentionGroup();
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
		case ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP:
			getContentionGroup().clear();
			getContentionGroup().addAll((Collection<? extends ContentionGroup>) newValue);
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
		case ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP:
			getContentionGroup().clear();
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
		case ShimPackage.CONTENTION_GROUP_SET__CONTENTION_GROUP:
			return contentionGroup != null && !contentionGroup.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ContentionGroupSetImpl
