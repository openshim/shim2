/**
 */
package org.multicore_association.shim10.model.shim10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Size Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSizeUnitType()
 * @model extendedMetaData="name='SizeUnitType'"
 * @generated
 */
public enum SizeUnitType implements Enumerator {
	/**
	 * The '<em><b>Ki B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KI_B_VALUE
	 * @generated
	 * @ordered
	 */
	KI_B(0, "KiB", "KiB"),

	/**
	 * The '<em><b>B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B_VALUE
	 * @generated
	 * @ordered
	 */
	B(1, "B", "B"),

	/**
	 * The '<em><b>Gi B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GI_B_VALUE
	 * @generated
	 * @ordered
	 */
	GI_B(2, "GiB", "GiB"),

	/**
	 * The '<em><b>Mi B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_B_VALUE
	 * @generated
	 * @ordered
	 */
	MI_B(3, "MiB", "MiB"),

	/**
	 * The '<em><b>Ti B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_B_VALUE
	 * @generated
	 * @ordered
	 */
	TI_B(4, "TiB", "TiB");

	/**
	 * The '<em><b>Ki B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KI_B
	 * @model name="KiB"
	 * @generated
	 * @ordered
	 */
	public static final int KI_B_VALUE = 0;

	/**
	 * The '<em><b>B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #B
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int B_VALUE = 1;

	/**
	 * The '<em><b>Gi B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GI_B
	 * @model name="GiB"
	 * @generated
	 * @ordered
	 */
	public static final int GI_B_VALUE = 2;

	/**
	 * The '<em><b>Mi B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_B
	 * @model name="MiB"
	 * @generated
	 * @ordered
	 */
	public static final int MI_B_VALUE = 3;

	/**
	 * The '<em><b>Ti B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_B
	 * @model name="TiB"
	 * @generated
	 * @ordered
	 */
	public static final int TI_B_VALUE = 4;

	/**
	 * An array of all the '<em><b>Size Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SizeUnitType[] VALUES_ARRAY =
		new SizeUnitType[] {
			KI_B,
			B,
			GI_B,
			MI_B,
			TI_B,
		};

	/**
	 * A public read-only list of all the '<em><b>Size Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SizeUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Size Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SizeUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Size Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SizeUnitType get(int value) {
		switch (value) {
			case KI_B_VALUE: return KI_B;
			case B_VALUE: return B;
			case GI_B_VALUE: return GI_B;
			case MI_B_VALUE: return MI_B;
			case TI_B_VALUE: return TI_B;
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
	private SizeUnitType(int value, String name, String literal) {
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
	
} //SizeUnitType
