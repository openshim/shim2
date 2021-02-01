/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Power Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerUnitType()
 * @model extendedMetaData="name='PowerUnitType'"
 * @generated
 */
public enum PowerUnitType implements Enumerator {
	/**
	 * The '<em><b>PW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PW_VALUE
	 * @generated
	 * @ordered
	 */
	PW(0, "pW", "pW"),

	/**
	 * The '<em><b>NW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NW_VALUE
	 * @generated
	 * @ordered
	 */
	NW(1, "nW", "nW"),

	/**
	 * The '<em><b>UW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UW_VALUE
	 * @generated
	 * @ordered
	 */
	UW(2, "uW", "uW"),

	/**
	 * The '<em><b>MW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MW_VALUE
	 * @generated
	 * @ordered
	 */
	MW(3, "mW", "mW"),

	/**
	 * The '<em><b>W</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W_VALUE
	 * @generated
	 * @ordered
	 */
	W(4, "W", "W");

	/**
	 * The '<em><b>PW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PW
	 * @model name="pW"
	 * @generated
	 * @ordered
	 */
	public static final int PW_VALUE = 0;

	/**
	 * The '<em><b>NW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NW
	 * @model name="nW"
	 * @generated
	 * @ordered
	 */
	public static final int NW_VALUE = 1;

	/**
	 * The '<em><b>UW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UW
	 * @model name="uW"
	 * @generated
	 * @ordered
	 */
	public static final int UW_VALUE = 2;

	/**
	 * The '<em><b>MW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MW
	 * @model name="mW"
	 * @generated
	 * @ordered
	 */
	public static final int MW_VALUE = 3;

	/**
	 * The '<em><b>W</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #W
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int W_VALUE = 4;

	/**
	 * An array of all the '<em><b>Power Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PowerUnitType[] VALUES_ARRAY = new PowerUnitType[] { PW, NW, UW, MW, W, };

	/**
	 * A public read-only list of all the '<em><b>Power Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PowerUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Power Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PowerUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Power Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PowerUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Power Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PowerUnitType get(int value) {
		switch (value) {
		case PW_VALUE:
			return PW;
		case NW_VALUE:
			return NW;
		case UW_VALUE:
			return UW;
		case MW_VALUE:
			return MW;
		case W_VALUE:
			return W;
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
	private PowerUnitType(int value, String name, String literal) {
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

} //PowerUnitType
