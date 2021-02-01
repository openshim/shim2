/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionInput <em>Instruction Input</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOperation <em>Instruction Operation</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.CustomInstruction#getInstructionOutput <em>Instruction Output</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getCustomInstruction()
 * @model extendedMetaData="name='CustomInstruction' kind='elementOnly'"
 * @generated
 */
public interface CustomInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Instruction Input</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.InstructionInput}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Input</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCustomInstruction_InstructionInput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InstructionInput'"
	 * @generated
	 */
	EList<InstructionInput> getInstructionInput();

	/**
	 * Returns the value of the '<em><b>Instruction Operation</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Operation</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCustomInstruction_InstructionOperation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InstructionOperation'"
	 * @generated
	 */
	EList<Performance> getInstructionOperation();

	/**
	 * Returns the value of the '<em><b>Instruction Output</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Performance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Output</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCustomInstruction_InstructionOutput()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='InstructionOutput'"
	 * @generated
	 */
	EList<Performance> getInstructionOutput();

} // CustomInstruction
