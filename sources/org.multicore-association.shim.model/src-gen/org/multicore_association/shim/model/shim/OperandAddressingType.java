/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operand Addressing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperandAddressingType()
 * @model extendedMetaData="name='OperandAddressingType'"
 * @generated
 */
public enum OperandAddressingType implements Enumerator {
	/**
	 * The '<em><b>NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "NONE", "NONE"),

	/**
	 * The '<em><b>IMMEDIATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE_VALUE
	 * @generated
	 * @ordered
	 */
	IMMEDIATE(1, "IMMEDIATE", "IMMEDIATE"),

	/**
	 * The '<em><b>REGISTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER_VALUE
	 * @generated
	 * @ordered
	 */
	REGISTER(2, "REGISTER", "REGISTER"),

	/**
	 * The '<em><b>BOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH_VALUE
	 * @generated
	 * @ordered
	 */
	BOTH(3, "BOTH", "BOTH");

	/**
	 * The '<em><b>NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>IMMEDIATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMMEDIATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMMEDIATE_VALUE = 1;

	/**
	 * The '<em><b>REGISTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REGISTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REGISTER_VALUE = 2;

	/**
	 * The '<em><b>BOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operand Addressing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperandAddressingType[] VALUES_ARRAY = new OperandAddressingType[] { NONE, IMMEDIATE, REGISTER,
			BOTH, };

	/**
	 * A public read-only list of all the '<em><b>Operand Addressing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperandAddressingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operand Addressing Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperandAddressingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperandAddressingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operand Addressing Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperandAddressingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperandAddressingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operand Addressing Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperandAddressingType get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case IMMEDIATE_VALUE:
			return IMMEDIATE;
		case REGISTER_VALUE:
			return REGISTER;
		case BOTH_VALUE:
			return BOTH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private OperandAddressingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
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
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //OperandAddressingType
