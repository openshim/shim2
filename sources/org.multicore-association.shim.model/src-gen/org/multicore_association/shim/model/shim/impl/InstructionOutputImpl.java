/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.InstructionOutput;
import org.multicore_association.shim.model.shim.InstructionOutputType;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instruction Output</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionOutputImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionOutputImpl#getBitWidth <em>Bit Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.InstructionOutputImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstructionOutputImpl extends MinimalEObjectImpl.Container implements InstructionOutput {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final InstructionOutputType TYPE_EDEFAULT = InstructionOutputType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected InstructionOutputType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * The default value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BIT_WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBitWidth() <em>Bit Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBitWidth()
	 * @generated
	 * @ordered
	 */
	protected int bitWidth = BIT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstructionOutputImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.INSTRUCTION_OUTPUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InstructionOutputType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(InstructionOutputType newType) {
		InstructionOutputType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION_OUTPUT__TYPE, oldType, type,
					!oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		InstructionOutputType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.INSTRUCTION_OUTPUT__TYPE, oldType,
					TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBitWidth() {
		return bitWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBitWidth(int newBitWidth) {
		int oldBitWidth = bitWidth;
		bitWidth = newBitWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION_OUTPUT__BIT_WIDTH,
					oldBitWidth, bitWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.INSTRUCTION_OUTPUT__REF, oldRef, ref));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.INSTRUCTION_OUTPUT__TYPE:
			return getType();
		case ShimPackage.INSTRUCTION_OUTPUT__BIT_WIDTH:
			return getBitWidth();
		case ShimPackage.INSTRUCTION_OUTPUT__REF:
			return getRef();
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
		case ShimPackage.INSTRUCTION_OUTPUT__TYPE:
			setType((InstructionOutputType) newValue);
			return;
		case ShimPackage.INSTRUCTION_OUTPUT__BIT_WIDTH:
			setBitWidth((Integer) newValue);
			return;
		case ShimPackage.INSTRUCTION_OUTPUT__REF:
			setRef((String) newValue);
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
		case ShimPackage.INSTRUCTION_OUTPUT__TYPE:
			unsetType();
			return;
		case ShimPackage.INSTRUCTION_OUTPUT__BIT_WIDTH:
			setBitWidth(BIT_WIDTH_EDEFAULT);
			return;
		case ShimPackage.INSTRUCTION_OUTPUT__REF:
			setRef(REF_EDEFAULT);
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
		case ShimPackage.INSTRUCTION_OUTPUT__TYPE:
			return isSetType();
		case ShimPackage.INSTRUCTION_OUTPUT__BIT_WIDTH:
			return bitWidth != BIT_WIDTH_EDEFAULT;
		case ShimPackage.INSTRUCTION_OUTPUT__REF:
			return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
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
		result.append(" (type: ");
		if (typeESet)
			result.append(type);
		else
			result.append("<unset>");
		result.append(", bitWidth: ");
		result.append(bitWidth);
		result.append(", ref: ");
		result.append(ref);
		result.append(')');
		return result.toString();
	}

} //InstructionOutputImpl
