/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Throughput Unit Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getThroughputUnitType()
 * @model extendedMetaData="name='ThroughputUnitType'"
 * @generated
 */
public enum ThroughputUnitType implements Enumerator {
	/**
	 * The '<em><b>Bcycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	BCYCLE(0, "Bcycle", "B/cycle"),

	/**
	 * The '<em><b>BKcycle</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BKCYCLE_VALUE
	 * @generated
	 * @ordered
	 */
	BKCYCLE(1, "BKcycle", "B/Kcycle");

	/**
	 * The '<em><b>Bcycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BCYCLE
	 * @model name="Bcycle" literal="B/cycle"
	 * @generated
	 * @ordered
	 */
	public static final int BCYCLE_VALUE = 0;

	/**
	 * The '<em><b>BKcycle</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BKCYCLE
	 * @model name="BKcycle" literal="B/Kcycle"
	 * @generated
	 * @ordered
	 */
	public static final int BKCYCLE_VALUE = 1;

	/**
	 * An array of all the '<em><b>Throughput Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ThroughputUnitType[] VALUES_ARRAY = new ThroughputUnitType[] { BCYCLE, BKCYCLE, };

	/**
	 * A public read-only list of all the '<em><b>Throughput Unit Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ThroughputUnitType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Throughput Unit Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThroughputUnitType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThroughputUnitType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Throughput Unit Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThroughputUnitType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ThroughputUnitType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Throughput Unit Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ThroughputUnitType get(int value) {
		switch (value) {
		case BCYCLE_VALUE:
			return BCYCLE;
		case BKCYCLE_VALUE:
			return BKCYCLE;
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
	private ThroughputUnitType(int value, String name, String literal) {
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

} //ThroughputUnitType
