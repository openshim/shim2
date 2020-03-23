/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionOutput#getType <em>Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionOutput#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.InstructionOutput#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOutput()
 * @model extendedMetaData="name='InstructionOutput' kind='elementOnly'"
 * @generated
 */
public interface InstructionOutput extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.InstructionOutputType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(InstructionOutputType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOutput_Type()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	InstructionOutputType getType();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionOutput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.InstructionOutputType
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(InstructionOutputType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.InstructionOutput#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(InstructionOutputType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.InstructionOutput#getType <em>Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' attribute is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(InstructionOutputType)
	 * @generated
	 */
	boolean isSetType();

	/**
	 * Returns the value of the '<em><b>Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bit Width</em>' attribute.
	 * @see #setBitWidth(int)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOutput_BitWidth()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedIntType" required="true"
	 *        extendedMetaData="kind='attribute' name='bitWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	int getBitWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionOutput#getBitWidth <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bit Width</em>' attribute.
	 * @see #getBitWidth()
	 * @generated
	 */
	void setBitWidth(int value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see #setRef(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstructionOutput_Ref()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ref' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.InstructionOutput#getRef <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' attribute.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(String value);

} // InstructionOutput
