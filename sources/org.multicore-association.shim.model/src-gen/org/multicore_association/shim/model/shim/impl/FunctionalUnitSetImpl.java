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

import org.multicore_association.shim.model.shim.FunctionalUnit;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Unit Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitSetImpl#getFunctionalUnit <em>Functional Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalUnitSetImpl extends MinimalEObjectImpl.Container implements FunctionalUnitSet {
	/**
	 * The cached value of the '{@link #getFunctionalUnit() <em>Functional Unit</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalUnit> functionalUnit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalUnitSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.FUNCTIONAL_UNIT_SET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FunctionalUnit> getFunctionalUnit() {
		if (functionalUnit == null) {
			functionalUnit = new EObjectContainmentEList<FunctionalUnit>(FunctionalUnit.class, this,
					ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT);
		}
		return functionalUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT:
			return ((InternalEList<?>) getFunctionalUnit()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT:
			return getFunctionalUnit();
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
		case ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT:
			getFunctionalUnit().clear();
			getFunctionalUnit().addAll((Collection<? extends FunctionalUnit>) newValue);
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
		case ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT:
			getFunctionalUnit().clear();
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
		case ShimPackage.FUNCTIONAL_UNIT_SET__FUNCTIONAL_UNIT:
			return functionalUnit != null && !functionalUnit.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FunctionalUnitSetImpl
