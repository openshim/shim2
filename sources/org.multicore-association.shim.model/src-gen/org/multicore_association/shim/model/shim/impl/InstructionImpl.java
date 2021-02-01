/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.OperandAddressingType;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SignednessType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getImmediateBitWidth <em>Immediate Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getInputBitWidth <em>Input Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#isInputPreserved <em>Input Preserved</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#isIsEmulated <em>Is Emulated</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getOperandAddressing <em>Operand Addressing</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getOutputBitWidth <em>Output Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionImpl#getSupportedSignedness <em>Supported Signedness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionImpl extends AbstractInstructionImpl implements Instruction {
	/**
	 * The default value of the '{@link #getImmediateBitWidth() <em>Immediate Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IMMEDIATE_BIT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImmediateBitWidth() <em>Immediate Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImmediateBitWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer immediateBitWidth = IMMEDIATE_BIT_WIDTH_EDEFAULT;

	/**
	 * This is true if the Immediate Bit Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean immediateBitWidthESet;

	/**
	 * The default value of the '{@link #getInputBitWidth() <em>Input Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INPUT_BIT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputBitWidth() <em>Input Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputBitWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer inputBitWidth = INPUT_BIT_WIDTH_EDEFAULT;

	/**
	 * This is true if the Input Bit Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputBitWidthESet;

	/**
	 * The default value of the '{@link #isInputPreserved() <em>Input Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputPreserved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INPUT_PRESERVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInputPreserved() <em>Input Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInputPreserved()
	 * @generated
	 * @ordered
	 */
	protected boolean inputPreserved = INPUT_PRESERVED_EDEFAULT;

	/**
	 * This is true if the Input Preserved attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean inputPreservedESet;

	/**
	 * The default value of the '{@link #isIsEmulated() <em>Is Emulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EMULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEmulated() <em>Is Emulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEmulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEmulated = IS_EMULATED_EDEFAULT;

	/**
	 * This is true if the Is Emulated attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isEmulatedESet;

	/**
	 * The default value of the '{@link #getOperandAddressing() <em>Operand Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandAddressing()
	 * @generated
	 * @ordered
	 */
	protected static final OperandAddressingType OPERAND_ADDRESSING_EDEFAULT = OperandAddressingType.NONE;

	/**
	 * The cached value of the '{@link #getOperandAddressing() <em>Operand Addressing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperandAddressing()
	 * @generated
	 * @ordered
	 */
	protected OperandAddressingType operandAddressing = OPERAND_ADDRESSING_EDEFAULT;

	/**
	 * This is true if the Operand Addressing attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operandAddressingESet;

	/**
	 * The default value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPERATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Integer operation = OPERATION_EDEFAULT;

	/**
	 * This is true if the Operation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean operationESet;

	/**
	 * The default value of the '{@link #getOutputBitWidth() <em>Output Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OUTPUT_BIT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputBitWidth() <em>Output Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputBitWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer outputBitWidth = OUTPUT_BIT_WIDTH_EDEFAULT;

	/**
	 * This is true if the Output Bit Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean outputBitWidthESet;

	/**
	 * The default value of the '{@link #getSupportedSignedness() <em>Supported Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSignedness()
	 * @generated
	 * @ordered
	 */
	protected static final SignednessType SUPPORTED_SIGNEDNESS_EDEFAULT = SignednessType.SIGNED;

	/**
	 * The cached value of the '{@link #getSupportedSignedness() <em>Supported Signedness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedSignedness()
	 * @generated
	 * @ordered
	 */
	protected SignednessType supportedSignedness = SUPPORTED_SIGNEDNESS_EDEFAULT;

	/**
	 * This is true if the Supported Signedness attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean supportedSignednessESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getImmediateBitWidth() {
		return immediateBitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImmediateBitWidth(Integer newImmediateBitWidth) {
		Integer oldImmediateBitWidth = immediateBitWidth;
		immediateBitWidth = newImmediateBitWidth;
		boolean oldImmediateBitWidthESet = immediateBitWidthESet;
		immediateBitWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH,
					oldImmediateBitWidth, immediateBitWidth, !oldImmediateBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetImmediateBitWidth() {
		Integer oldImmediateBitWidth = immediateBitWidth;
		boolean oldImmediateBitWidthESet = immediateBitWidthESet;
		immediateBitWidth = IMMEDIATE_BIT_WIDTH_EDEFAULT;
		immediateBitWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH,
					oldImmediateBitWidth, IMMEDIATE_BIT_WIDTH_EDEFAULT, oldImmediateBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImmediateBitWidth() {
		return immediateBitWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getInputBitWidth() {
		return inputBitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputBitWidth(Integer newInputBitWidth) {
		Integer oldInputBitWidth = inputBitWidth;
		inputBitWidth = newInputBitWidth;
		boolean oldInputBitWidthESet = inputBitWidthESet;
		inputBitWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH,
					oldInputBitWidth, inputBitWidth, !oldInputBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputBitWidth() {
		Integer oldInputBitWidth = inputBitWidth;
		boolean oldInputBitWidthESet = inputBitWidthESet;
		inputBitWidth = INPUT_BIT_WIDTH_EDEFAULT;
		inputBitWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH,
					oldInputBitWidth, INPUT_BIT_WIDTH_EDEFAULT, oldInputBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputBitWidth() {
		return inputBitWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInputPreserved() {
		return inputPreserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputPreserved(boolean newInputPreserved) {
		boolean oldInputPreserved = inputPreserved;
		inputPreserved = newInputPreserved;
		boolean oldInputPreservedESet = inputPreservedESet;
		inputPreservedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__INPUT_PRESERVED,
					oldInputPreserved, inputPreserved, !oldInputPreservedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetInputPreserved() {
		boolean oldInputPreserved = inputPreserved;
		boolean oldInputPreservedESet = inputPreservedESet;
		inputPreserved = INPUT_PRESERVED_EDEFAULT;
		inputPreservedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__INPUT_PRESERVED,
					oldInputPreserved, INPUT_PRESERVED_EDEFAULT, oldInputPreservedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInputPreserved() {
		return inputPreservedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEmulated() {
		return isEmulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEmulated(boolean newIsEmulated) {
		boolean oldIsEmulated = isEmulated;
		isEmulated = newIsEmulated;
		boolean oldIsEmulatedESet = isEmulatedESet;
		isEmulatedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__IS_EMULATED, oldIsEmulated,
					isEmulated, !oldIsEmulatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsEmulated() {
		boolean oldIsEmulated = isEmulated;
		boolean oldIsEmulatedESet = isEmulatedESet;
		isEmulated = IS_EMULATED_EDEFAULT;
		isEmulatedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__IS_EMULATED, oldIsEmulated,
					IS_EMULATED_EDEFAULT, oldIsEmulatedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsEmulated() {
		return isEmulatedESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperandAddressingType getOperandAddressing() {
		return operandAddressing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperandAddressing(OperandAddressingType newOperandAddressing) {
		OperandAddressingType oldOperandAddressing = operandAddressing;
		operandAddressing = newOperandAddressing == null ? OPERAND_ADDRESSING_EDEFAULT : newOperandAddressing;
		boolean oldOperandAddressingESet = operandAddressingESet;
		operandAddressingESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__OPERAND_ADDRESSING,
					oldOperandAddressing, operandAddressing, !oldOperandAddressingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperandAddressing() {
		OperandAddressingType oldOperandAddressing = operandAddressing;
		boolean oldOperandAddressingESet = operandAddressingESet;
		operandAddressing = OPERAND_ADDRESSING_EDEFAULT;
		operandAddressingESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__OPERAND_ADDRESSING,
					oldOperandAddressing, OPERAND_ADDRESSING_EDEFAULT, oldOperandAddressingESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperandAddressing() {
		return operandAddressingESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Integer newOperation) {
		Integer oldOperation = operation;
		operation = newOperation;
		boolean oldOperationESet = operationESet;
		operationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__OPERATION, oldOperation,
					operation, !oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOperation() {
		Integer oldOperation = operation;
		boolean oldOperationESet = operationESet;
		operation = OPERATION_EDEFAULT;
		operationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__OPERATION, oldOperation,
					OPERATION_EDEFAULT, oldOperationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperation() {
		return operationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOutputBitWidth() {
		return outputBitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputBitWidth(Integer newOutputBitWidth) {
		Integer oldOutputBitWidth = outputBitWidth;
		outputBitWidth = newOutputBitWidth;
		boolean oldOutputBitWidthESet = outputBitWidthESet;
		outputBitWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH,
					oldOutputBitWidth, outputBitWidth, !oldOutputBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetOutputBitWidth() {
		Integer oldOutputBitWidth = outputBitWidth;
		boolean oldOutputBitWidthESet = outputBitWidthESet;
		outputBitWidth = OUTPUT_BIT_WIDTH_EDEFAULT;
		outputBitWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH,
					oldOutputBitWidth, OUTPUT_BIT_WIDTH_EDEFAULT, oldOutputBitWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOutputBitWidth() {
		return outputBitWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignednessType getSupportedSignedness() {
		return supportedSignedness;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupportedSignedness(SignednessType newSupportedSignedness) {
		SignednessType oldSupportedSignedness = supportedSignedness;
		supportedSignedness = newSupportedSignedness == null ? SUPPORTED_SIGNEDNESS_EDEFAULT : newSupportedSignedness;
		boolean oldSupportedSignednessESet = supportedSignednessESet;
		supportedSignednessESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS,
					oldSupportedSignedness, supportedSignedness, !oldSupportedSignednessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSupportedSignedness() {
		SignednessType oldSupportedSignedness = supportedSignedness;
		boolean oldSupportedSignednessESet = supportedSignednessESet;
		supportedSignedness = SUPPORTED_SIGNEDNESS_EDEFAULT;
		supportedSignednessESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS,
					oldSupportedSignedness, SUPPORTED_SIGNEDNESS_EDEFAULT, oldSupportedSignednessESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSupportedSignedness() {
		return supportedSignednessESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH:
			return getImmediateBitWidth();
		case ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH:
			return getInputBitWidth();
		case ShimPackage.INSTRUCTION__INPUT_PRESERVED:
			return isInputPreserved();
		case ShimPackage.INSTRUCTION__IS_EMULATED:
			return isIsEmulated();
		case ShimPackage.INSTRUCTION__OPERAND_ADDRESSING:
			return getOperandAddressing();
		case ShimPackage.INSTRUCTION__OPERATION:
			return getOperation();
		case ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH:
			return getOutputBitWidth();
		case ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS:
			return getSupportedSignedness();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH:
			setImmediateBitWidth((Integer) newValue);
			return;
		case ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH:
			setInputBitWidth((Integer) newValue);
			return;
		case ShimPackage.INSTRUCTION__INPUT_PRESERVED:
			setInputPreserved((Boolean) newValue);
			return;
		case ShimPackage.INSTRUCTION__IS_EMULATED:
			setIsEmulated((Boolean) newValue);
			return;
		case ShimPackage.INSTRUCTION__OPERAND_ADDRESSING:
			setOperandAddressing((OperandAddressingType) newValue);
			return;
		case ShimPackage.INSTRUCTION__OPERATION:
			setOperation((Integer) newValue);
			return;
		case ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH:
			setOutputBitWidth((Integer) newValue);
			return;
		case ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS:
			setSupportedSignedness((SignednessType) newValue);
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
		case ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH:
			unsetImmediateBitWidth();
			return;
		case ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH:
			unsetInputBitWidth();
			return;
		case ShimPackage.INSTRUCTION__INPUT_PRESERVED:
			unsetInputPreserved();
			return;
		case ShimPackage.INSTRUCTION__IS_EMULATED:
			unsetIsEmulated();
			return;
		case ShimPackage.INSTRUCTION__OPERAND_ADDRESSING:
			unsetOperandAddressing();
			return;
		case ShimPackage.INSTRUCTION__OPERATION:
			unsetOperation();
			return;
		case ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH:
			unsetOutputBitWidth();
			return;
		case ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS:
			unsetSupportedSignedness();
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
		case ShimPackage.INSTRUCTION__IMMEDIATE_BIT_WIDTH:
			return isSetImmediateBitWidth();
		case ShimPackage.INSTRUCTION__INPUT_BIT_WIDTH:
			return isSetInputBitWidth();
		case ShimPackage.INSTRUCTION__INPUT_PRESERVED:
			return isSetInputPreserved();
		case ShimPackage.INSTRUCTION__IS_EMULATED:
			return isSetIsEmulated();
		case ShimPackage.INSTRUCTION__OPERAND_ADDRESSING:
			return isSetOperandAddressing();
		case ShimPackage.INSTRUCTION__OPERATION:
			return isSetOperation();
		case ShimPackage.INSTRUCTION__OUTPUT_BIT_WIDTH:
			return isSetOutputBitWidth();
		case ShimPackage.INSTRUCTION__SUPPORTED_SIGNEDNESS:
			return isSetSupportedSignedness();
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
		result.append(" (immediateBitWidth: ");
		if (immediateBitWidthESet)
			result.append(immediateBitWidth);
		else
			result.append("<unset>");
		result.append(", inputBitWidth: ");
		if (inputBitWidthESet)
			result.append(inputBitWidth);
		else
			result.append("<unset>");
		result.append(", inputPreserved: ");
		if (inputPreservedESet)
			result.append(inputPreserved);
		else
			result.append("<unset>");
		result.append(", isEmulated: ");
		if (isEmulatedESet)
			result.append(isEmulated);
		else
			result.append("<unset>");
		result.append(", operandAddressing: ");
		if (operandAddressingESet)
			result.append(operandAddressing);
		else
			result.append("<unset>");
		result.append(", operation: ");
		if (operationESet)
			result.append(operation);
		else
			result.append("<unset>");
		result.append(", outputBitWidth: ");
		if (outputBitWidthESet)
			result.append(outputBitWidth);
		else
			result.append("<unset>");
		result.append(", supportedSignedness: ");
		if (supportedSignednessESet)
			result.append(supportedSignedness);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InstructionImpl
