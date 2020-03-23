/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionOperation#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionOperation#getInstructionOperand <em>Instruction Operand</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOperation()
 * @model extendedMetaData="name='InstructionOperation' kind='elementOnly'"
 * @generated
 */
public interface InstructionOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #setOperation(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOperation_Operation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperation();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionOperation#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(String value);

	/**
	 * Returns the value of the '<em><b>Instruction Operand</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Operand</em>' attribute list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOperation_InstructionOperand()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='InstructionOperand' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<String> getInstructionOperand();

} // InstructionOperation
