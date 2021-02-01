/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Cache Write Allocate Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getCacheWriteAllocateType()
 * @model extendedMetaData="name='CacheWriteAllocateType'"
 * @generated
 */
public enum CacheWriteAllocateType implements Enumerator {
	/**
	 * The '<em><b>ALWAYS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS_VALUE
	 * @generated
	 * @ordered
	 */
	ALWAYS(0, "ALWAYS", "ALWAYS"),

	/**
	 * The '<em><b>NEVER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER_VALUE
	 * @generated
	 * @ordered
	 */
	NEVER(1, "NEVER", "NEVER"),

	/**
	 * The '<em><b>NOFETCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFETCH_VALUE
	 * @generated
	 * @ordered
	 */
	NOFETCH(2, "NOFETCH", "NOFETCH");

	/**
	 * The '<em><b>ALWAYS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALWAYS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALWAYS_VALUE = 0;

	/**
	 * The '<em><b>NEVER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEVER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NEVER_VALUE = 1;

	/**
	 * The '<em><b>NOFETCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOFETCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOFETCH_VALUE = 2;

	/**
	 * An array of all the '<em><b>Cache Write Allocate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CacheWriteAllocateType[] VALUES_ARRAY = new CacheWriteAllocateType[] { ALWAYS, NEVER,
			NOFETCH, };

	/**
	 * A public read-only list of all the '<em><b>Cache Write Allocate Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CacheWriteAllocateType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Cache Write Allocate Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheWriteAllocateType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheWriteAllocateType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Write Allocate Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheWriteAllocateType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CacheWriteAllocateType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Cache Write Allocate Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static CacheWriteAllocateType get(int value) {
		switch (value) {
		case ALWAYS_VALUE:
			return ALWAYS;
		case NEVER_VALUE:
			return NEVER;
		case NOFETCH_VALUE:
			return NOFETCH;
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
	private CacheWriteAllocateType(int value, String name, String literal) {
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

} //CacheWriteAllocateType
