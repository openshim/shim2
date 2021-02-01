/**
 */
package org.multicore_association.shim.edit.model.app.preferences;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cache Type Select</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage#getCacheTypeSelect()
 * @model extendedMetaData="name='CacheTypeSelect'"
 * @generated
 */
public enum CacheTypeSelect implements Enumerator {
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
	 * The '<em><b>UNIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	UNIFIED(1, "UNIFIED", "UNIFIED"),

	/**
	 * The '<em><b>DATA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_VALUE
	 * @generated
	 * @ordered
	 */
	DATA(2, "DATA", "DATA"),

	/**
	 * The '<em><b>INSTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	INSTRUCTION(3, "INSTRUCTION", "INSTRUCTION"),

	/**
	 * The '<em><b>DATA AND INSTRUCTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AND_INSTRUCTION_VALUE
	 * @generated
	 * @ordered
	 */
	DATA_AND_INSTRUCTION(4, "DATA_AND_INSTRUCTION", "DATA_AND_INSTRUCTION");

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
	 * The '<em><b>UNIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNIFIED_VALUE = 1;

	/**
	 * The '<em><b>DATA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_VALUE = 2;

	/**
	 * The '<em><b>INSTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSTRUCTION_VALUE = 3;

	/**
	 * The '<em><b>DATA AND INSTRUCTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATA_AND_INSTRUCTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATA_AND_INSTRUCTION_VALUE = 4;

	/**
	 * An array of all the '<em><b>Cache Type Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheTypeSelect[] VALUES_ARRAY = new CacheTypeSelect[] { NONE, UNIFIED, DATA, INSTRUCTION,
			DATA_AND_INSTRUCTION, };

	/**
	 * A public read-only list of all the '<em><b>Cache Type Select</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CacheTypeSelect> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Type Select</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheTypeSelect get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheTypeSelect result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Type Select</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheTypeSelect getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheTypeSelect result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Type Select</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheTypeSelect get(int value) {
		switch (value) {
		case NONE_VALUE:
			return NONE;
		case UNIFIED_VALUE:
			return UNIFIED;
		case DATA_VALUE:
			return DATA;
		case INSTRUCTION_VALUE:
			return INSTRUCTION;
		case DATA_AND_INSTRUCTION_VALUE:
			return DATA_AND_INSTRUCTION;
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
	private CacheTypeSelect(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

} //CacheTypeSelect
