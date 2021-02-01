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

import org.multicore_association.shim.model.shim.CustomInstruction;
import org.multicore_association.shim.model.shim.InstructionInput;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CustomInstructionImpl#getInstructionInput <em>Instruction Input</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CustomInstructionImpl#getInstructionOperation <em>Instruction Operation</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CustomInstructionImpl#getInstructionOutput <em>Instruction Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomInstructionImpl extends MinimalEObjectImpl.Container implements CustomInstruction {
	/**
	 * The cached value of the '{@link #getInstructionInput() <em>Instruction Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InstructionInput> instructionInput;

	/**
	 * The cached value of the '{@link #getInstructionOperation() <em>Instruction Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Performance> instructionOperation;

	/**
	 * The cached value of the '{@link #getInstructionOutput() <em>Instruction Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructionOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Performance> instructionOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.CUSTOM_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstructionInput> getInstructionInput() {
		if (instructionInput == null) {
			instructionInput = new EObjectContainmentEList<InstructionInput>(InstructionInput.class, this,
					ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT);
		}
		return instructionInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performance> getInstructionOperation() {
		if (instructionOperation == null) {
			instructionOperation = new EObjectContainmentEList<Performance>(Performance.class, this,
					ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION);
		}
		return instructionOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Performance> getInstructionOutput() {
		if (instructionOutput == null) {
			instructionOutput = new EObjectContainmentEList<Performance>(Performance.class, this,
					ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT);
		}
		return instructionOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT:
			return ((InternalEList<?>) getInstructionInput()).basicRemove(otherEnd, msgs);
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION:
			return ((InternalEList<?>) getInstructionOperation()).basicRemove(otherEnd, msgs);
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT:
			return ((InternalEList<?>) getInstructionOutput()).basicRemove(otherEnd, msgs);
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
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT:
			return getInstructionInput();
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION:
			return getInstructionOperation();
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT:
			return getInstructionOutput();
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
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT:
			getInstructionInput().clear();
			getInstructionInput().addAll((Collection<? extends InstructionInput>) newValue);
			return;
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION:
			getInstructionOperation().clear();
			getInstructionOperation().addAll((Collection<? extends Performance>) newValue);
			return;
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT:
			getInstructionOutput().clear();
			getInstructionOutput().addAll((Collection<? extends Performance>) newValue);
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
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT:
			getInstructionInput().clear();
			return;
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION:
			getInstructionOperation().clear();
			return;
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT:
			getInstructionOutput().clear();
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
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_INPUT:
			return instructionInput != null && !instructionInput.isEmpty();
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OPERATION:
			return instructionOperation != null && !instructionOperation.isEmpty();
		case ShimPackage.CUSTOM_INSTRUCTION__INSTRUCTION_OUTPUT:
			return instructionOutput != null && !instructionOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CustomInstructionImpl
