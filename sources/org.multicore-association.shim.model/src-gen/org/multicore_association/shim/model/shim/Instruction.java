/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth <em>Immediate Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getInputBitWidth <em>Input Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#isInputPreserved <em>Input Preserved</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#isIsEmulated <em>Is Emulated</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getOperandAddressing <em>Operand Addressing</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth <em>Output Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness <em>Supported Signedness</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction()
 * @model extendedMetaData="name='Instruction' kind='elementOnly'"
 * @generated
 */
public interface Instruction extends AbstractInstruction {
	/**
	 * Returns the value of the '<em><b>Immediate Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Immediate Bit Width</em>' attribute.
	 * @see #isSetImmediateBitWidth()
	 * @see #unsetImmediateBitWidth()
	 * @see #setImmediateBitWidth(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_ImmediateBitWidth()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='immediateBitWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getImmediateBitWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth <em>Immediate Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Immediate Bit Width</em>' attribute.
	 * @see #isSetImmediateBitWidth()
	 * @see #unsetImmediateBitWidth()
	 * @see #getImmediateBitWidth()
	 * @generated
	 */
	void setImmediateBitWidth(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth <em>Immediate Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetImmediateBitWidth()
	 * @see #getImmediateBitWidth()
	 * @see #setImmediateBitWidth(Integer)
	 * @generated
	 */
	void unsetImmediateBitWidth();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getImmediateBitWidth <em>Immediate Bit Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Immediate Bit Width</em>' attribute is set.
	 * @see #unsetImmediateBitWidth()
	 * @see #getImmediateBitWidth()
	 * @see #setImmediateBitWidth(Integer)
	 * @generated
	 */
	boolean isSetImmediateBitWidth();

	/**
	 * Returns the value of the '<em><b>Input Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Bit Width</em>' attribute.
	 * @see #isSetInputBitWidth()
	 * @see #unsetInputBitWidth()
	 * @see #setInputBitWidth(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_InputBitWidth()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='inputBitWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getInputBitWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getInputBitWidth <em>Input Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Bit Width</em>' attribute.
	 * @see #isSetInputBitWidth()
	 * @see #unsetInputBitWidth()
	 * @see #getInputBitWidth()
	 * @generated
	 */
	void setInputBitWidth(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getInputBitWidth <em>Input Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputBitWidth()
	 * @see #getInputBitWidth()
	 * @see #setInputBitWidth(Integer)
	 * @generated
	 */
	void unsetInputBitWidth();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getInputBitWidth <em>Input Bit Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Bit Width</em>' attribute is set.
	 * @see #unsetInputBitWidth()
	 * @see #getInputBitWidth()
	 * @see #setInputBitWidth(Integer)
	 * @generated
	 */
	boolean isSetInputBitWidth();

	/**
	 * Returns the value of the '<em><b>Input Preserved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input Preserved</em>' attribute.
	 * @see #isSetInputPreserved()
	 * @see #unsetInputPreserved()
	 * @see #setInputPreserved(boolean)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_InputPreserved()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='inputPreserved' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isInputPreserved();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isInputPreserved <em>Input Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input Preserved</em>' attribute.
	 * @see #isSetInputPreserved()
	 * @see #unsetInputPreserved()
	 * @see #isInputPreserved()
	 * @generated
	 */
	void setInputPreserved(boolean value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isInputPreserved <em>Input Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetInputPreserved()
	 * @see #isInputPreserved()
	 * @see #setInputPreserved(boolean)
	 * @generated
	 */
	void unsetInputPreserved();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isInputPreserved <em>Input Preserved</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Input Preserved</em>' attribute is set.
	 * @see #unsetInputPreserved()
	 * @see #isInputPreserved()
	 * @see #setInputPreserved(boolean)
	 * @generated
	 */
	boolean isSetInputPreserved();

	/**
	 * Returns the value of the '<em><b>Is Emulated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Emulated</em>' attribute.
	 * @see #isSetIsEmulated()
	 * @see #unsetIsEmulated()
	 * @see #setIsEmulated(boolean)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_IsEmulated()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='isEmulated' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isIsEmulated();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isIsEmulated <em>Is Emulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Emulated</em>' attribute.
	 * @see #isSetIsEmulated()
	 * @see #unsetIsEmulated()
	 * @see #isIsEmulated()
	 * @generated
	 */
	void setIsEmulated(boolean value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isIsEmulated <em>Is Emulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetIsEmulated()
	 * @see #isIsEmulated()
	 * @see #setIsEmulated(boolean)
	 * @generated
	 */
	void unsetIsEmulated();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#isIsEmulated <em>Is Emulated</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Is Emulated</em>' attribute is set.
	 * @see #unsetIsEmulated()
	 * @see #isIsEmulated()
	 * @see #setIsEmulated(boolean)
	 * @generated
	 */
	boolean isSetIsEmulated();

	/**
	 * Returns the value of the '<em><b>Operand Addressing</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.OperandAddressingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operand Addressing</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @see #isSetOperandAddressing()
	 * @see #unsetOperandAddressing()
	 * @see #setOperandAddressing(OperandAddressingType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_OperandAddressing()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='operandAddressing' namespace='##targetNamespace'"
	 * @generated
	 */
	OperandAddressingType getOperandAddressing();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperandAddressing <em>Operand Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operand Addressing</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.OperandAddressingType
	 * @see #isSetOperandAddressing()
	 * @see #unsetOperandAddressing()
	 * @see #getOperandAddressing()
	 * @generated
	 */
	void setOperandAddressing(OperandAddressingType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperandAddressing <em>Operand Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperandAddressing()
	 * @see #getOperandAddressing()
	 * @see #setOperandAddressing(OperandAddressingType)
	 * @generated
	 */
	void unsetOperandAddressing();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperandAddressing <em>Operand Addressing</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operand Addressing</em>' attribute is set.
	 * @see #unsetOperandAddressing()
	 * @see #getOperandAddressing()
	 * @see #setOperandAddressing(OperandAddressingType)
	 * @generated
	 */
	boolean isSetOperandAddressing();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #setOperation(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_Operation()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='operation' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getOperation();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see #isSetOperation()
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperation()
	 * @see #getOperation()
	 * @see #setOperation(Integer)
	 * @generated
	 */
	void unsetOperation();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOperation <em>Operation</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operation</em>' attribute is set.
	 * @see #unsetOperation()
	 * @see #getOperation()
	 * @see #setOperation(Integer)
	 * @generated
	 */
	boolean isSetOperation();

	/**
	 * Returns the value of the '<em><b>Output Bit Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Output Bit Width</em>' attribute.
	 * @see #isSetOutputBitWidth()
	 * @see #unsetOutputBitWidth()
	 * @see #setOutputBitWidth(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_OutputBitWidth()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='outputBitWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getOutputBitWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth <em>Output Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Output Bit Width</em>' attribute.
	 * @see #isSetOutputBitWidth()
	 * @see #unsetOutputBitWidth()
	 * @see #getOutputBitWidth()
	 * @generated
	 */
	void setOutputBitWidth(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth <em>Output Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOutputBitWidth()
	 * @see #getOutputBitWidth()
	 * @see #setOutputBitWidth(Integer)
	 * @generated
	 */
	void unsetOutputBitWidth();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getOutputBitWidth <em>Output Bit Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Output Bit Width</em>' attribute is set.
	 * @see #unsetOutputBitWidth()
	 * @see #getOutputBitWidth()
	 * @see #setOutputBitWidth(Integer)
	 * @generated
	 */
	boolean isSetOutputBitWidth();

	/**
	 * Returns the value of the '<em><b>Supported Signedness</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.SignednessType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supported Signedness</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @see #isSetSupportedSignedness()
	 * @see #unsetSupportedSignedness()
	 * @see #setSupportedSignedness(SignednessType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getInstruction_SupportedSignedness()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='supportedSignedness' namespace='##targetNamespace'"
	 * @generated
	 */
	SignednessType getSupportedSignedness();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness <em>Supported Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Supported Signedness</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.SignednessType
	 * @see #isSetSupportedSignedness()
	 * @see #unsetSupportedSignedness()
	 * @see #getSupportedSignedness()
	 * @generated
	 */
	void setSupportedSignedness(SignednessType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness <em>Supported Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSupportedSignedness()
	 * @see #getSupportedSignedness()
	 * @see #setSupportedSignedness(SignednessType)
	 * @generated
	 */
	void unsetSupportedSignedness();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Instruction#getSupportedSignedness <em>Supported Signedness</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Supported Signedness</em>' attribute is set.
	 * @see #unsetSupportedSignedness()
	 * @see #getSupportedSignedness()
	 * @see #setSupportedSignedness(SignednessType)
	 * @generated
	 */
	boolean isSetSupportedSignedness();

} // Instruction
