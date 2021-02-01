/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Voltage Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getVoltageUnitType()
 * @model extendedMetaData="name='VoltageUnitType'"
 * @generated
 */
public enum VoltageUnitType implements Enumerator {
	/**
	 * The '<em><b>PV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV_VALUE
	 * @generated
	 * @ordered
	 */
	PV(0, "pV", "pV"),

	/**
	 * The '<em><b>NV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NV_VALUE
	 * @generated
	 * @ordered
	 */
	NV(1, "nV", "nV"),

	/**
	 * The '<em><b>UV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UV_VALUE
	 * @generated
	 * @ordered
	 */
	UV(2, "uV", "uV"),

	/**
	 * The '<em><b>MV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MV_VALUE
	 * @generated
	 * @ordered
	 */
	MV(3, "mV", "mV"),

	/**
	 * The '<em><b>V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V_VALUE
	 * @generated
	 * @ordered
	 */
	V(4, "V", "V");

	/**
	 * The '<em><b>PV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PV
	 * @model name="pV"
	 * @generated
	 * @ordered
	 */
	public static final int PV_VALUE = 0;

	/**
	 * The '<em><b>NV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NV
	 * @model name="nV"
	 * @generated
	 * @ordered
	 */
	public static final int NV_VALUE = 1;

	/**
	 * The '<em><b>UV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UV
	 * @model name="uV"
	 * @generated
	 * @ordered
	 */
	public static final int UV_VALUE = 2;

	/**
	 * The '<em><b>MV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MV
	 * @model name="mV"
	 * @generated
	 * @ordered
	 */
	public static final int MV_VALUE = 3;

	/**
	 * The '<em><b>V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int V_VALUE = 4;

	/**
	 * An array of all the '<em><b>Voltage Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final VoltageUnitType[] VALUES_ARRAY = new VoltageUnitType[] { PV, NV, UV, MV, V, };

	/**
	 * A public read-only list of all the '<em><b>Voltage Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<VoltageUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Voltage Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoltageUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voltage Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			VoltageUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Voltage Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static VoltageUnitType get(int value) {
		switch (value) {
		case PV_VALUE:
			return PV;
		case NV_VALUE:
			return NV;
		case UV_VALUE:
			return UV;
		case MV_VALUE:
			return MV;
		case V_VALUE:
			return V;
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
	private VoltageUnitType(int value, String name, String literal) {
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

} //VoltageUnitType
