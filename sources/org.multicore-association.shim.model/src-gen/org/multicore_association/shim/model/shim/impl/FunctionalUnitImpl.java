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
import org.eclipse.emf.ecore.util.InternalEList;

import org.multicore_association.shim.model.shim.CustomInstruction;
import org.multicore_association.shim.model.shim.FunctionalUnit;
import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Functional Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.FunctionalUnitImpl#getCustomInstruction <em>Custom Instruction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionalUnitImpl extends MinimalEObjectImpl.Container implements FunctionalUnit {
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
	 * The cached value of the '{@link #getInstruction() <em>Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instruction;

	/**
	 * The cached value of the '{@link #getCustomInstruction() <em>Custom Instruction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomInstruction()
	 * @generated
	 * @ordered
	 */
	protected EList<CustomInstruction> customInstruction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionalUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.FUNCTIONAL_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.FUNCTIONAL_UNIT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstruction() {
		if (instruction == null) {
			instruction = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION);
		}
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CustomInstruction> getCustomInstruction() {
		if (customInstruction == null) {
			customInstruction = new EObjectContainmentEList<CustomInstruction>(CustomInstruction.class, this,
					ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION);
		}
		return customInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION:
			return ((InternalEList<?>) getInstruction()).basicRemove(otherEnd, msgs);
		case ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION:
			return ((InternalEList<?>) getCustomInstruction()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.FUNCTIONAL_UNIT__NAME:
			return getName();
		case ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION:
			return getInstruction();
		case ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION:
			return getCustomInstruction();
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
		case ShimPackage.FUNCTIONAL_UNIT__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION:
			getInstruction().clear();
			getInstruction().addAll((Collection<? extends Instruction>) newValue);
			return;
		case ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION:
			getCustomInstruction().clear();
			getCustomInstruction().addAll((Collection<? extends CustomInstruction>) newValue);
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
		case ShimPackage.FUNCTIONAL_UNIT__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION:
			getInstruction().clear();
			return;
		case ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION:
			getCustomInstruction().clear();
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
		case ShimPackage.FUNCTIONAL_UNIT__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.FUNCTIONAL_UNIT__INSTRUCTION:
			return instruction != null && !instruction.isEmpty();
		case ShimPackage.FUNCTIONAL_UNIT__CUSTOM_INSTRUCTION:
			return customInstruction != null && !customInstruction.isEmpty();
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

} //FunctionalUnitImpl
