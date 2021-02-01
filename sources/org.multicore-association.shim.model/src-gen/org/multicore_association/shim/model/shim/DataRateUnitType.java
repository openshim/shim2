/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Rate Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getDataRateUnitType()
 * @model extendedMetaData="name='DataRateUnitType'"
 * @generated
 */
public enum DataRateUnitType implements Enumerator {
	/**
	 * The '<em><b>Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS_VALUE
	 * @generated
	 * @ordered
	 */
	BS(0, "Bs", "B/s"),

	/**
	 * The '<em><b>Ki Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KI_BS_VALUE
	 * @generated
	 * @ordered
	 */
	KI_BS(1, "KiBs", "KiB/s"),

	/**
	 * The '<em><b>Mi Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_BS_VALUE
	 * @generated
	 * @ordered
	 */
	MI_BS(2, "MiBs", "MiB/s"),

	/**
	 * The '<em><b>Gi Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GI_BS_VALUE
	 * @generated
	 * @ordered
	 */
	GI_BS(3, "GiBs", "GiB/s"),

	/**
	 * The '<em><b>Ti Bs</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_BS_VALUE
	 * @generated
	 * @ordered
	 */
	TI_BS(4, "TiBs", "TiB/s");

	/**
	 * The '<em><b>Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS
	 * @model name="Bs" literal="B/s"
	 * @generated
	 * @ordered
	 */
	public static final int BS_VALUE = 0;

	/**
	 * The '<em><b>Ki Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KI_BS
	 * @model name="KiBs" literal="KiB/s"
	 * @generated
	 * @ordered
	 */
	public static final int KI_BS_VALUE = 1;

	/**
	 * The '<em><b>Mi Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MI_BS
	 * @model name="MiBs" literal="MiB/s"
	 * @generated
	 * @ordered
	 */
	public static final int MI_BS_VALUE = 2;

	/**
	 * The '<em><b>Gi Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GI_BS
	 * @model name="GiBs" literal="GiB/s"
	 * @generated
	 * @ordered
	 */
	public static final int GI_BS_VALUE = 3;

	/**
	 * The '<em><b>Ti Bs</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TI_BS
	 * @model name="TiBs" literal="TiB/s"
	 * @generated
	 * @ordered
	 */
	public static final int TI_BS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Data Rate Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataRateUnitType[] VALUES_ARRAY = new DataRateUnitType[] { BS, KI_BS, MI_BS, GI_BS, TI_BS, };

	/**
	 * A public read-only list of all the '<em><b>Data Rate Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataRateUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Rate Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRateUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Rate Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRateUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Rate Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRateUnitType get(int value) {
		switch (value) {
		case BS_VALUE:
			return BS;
		case KI_BS_VALUE:
			return KI_BS;
		case MI_BS_VALUE:
			return MI_BS;
		case GI_BS_VALUE:
			return GI_BS;
		case TI_BS_VALUE:
			return TI_BS;
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
	private DataRateUnitType(int value, String name, String literal) {
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

} //DataRateUnitType
