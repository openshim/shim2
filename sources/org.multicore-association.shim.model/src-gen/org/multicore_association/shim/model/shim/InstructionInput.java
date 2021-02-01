/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionInput#getType <em>Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionInput#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionInput#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionInput()
 * @model extendedMetaData="name='InstructionInput' kind='elementOnly'"
 * @generated
 */
public interface InstructionInput extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.InstructionInputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(InstructionInputType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionInput_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	InstructionInputType getType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionInput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.InstructionInputType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(InstructionInputType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.InstructionInput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(InstructionInputType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.InstructionInput#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(InstructionInputType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionInput_BitWidth()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='bitWidth'"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionInput#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionInput_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='value'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionInput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // InstructionInput
