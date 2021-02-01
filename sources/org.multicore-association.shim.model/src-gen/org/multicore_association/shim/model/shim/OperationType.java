/**
 */
package org.multicore_association.shim.model.shim;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Operation Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperationType()
 * @model extendedMetaData="name='OperationType'"
 * @generated
 */
public enum OperationType implements Enumerator {
	/**
	 * The '<em><b>TAS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test and Set
	 * <!-- end-model-doc -->
	 * @see #TAS_VALUE
	 * @generated
	 * @ordered
	 */
	TAS(0, "TAS", "TAS"),

	/**
	 * The '<em><b>LLSC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load Link/Store Conditional
	 * <!-- end-model-doc -->
	 * @see #LLSC_VALUE
	 * @generated
	 * @ordered
	 */
	LLSC(1, "LLSC", "LLSC"),

	/**
	 * The '<em><b>CAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compare and Exchange
	 * <!-- end-model-doc -->
	 * @see #CAX_VALUE
	 * @generated
	 * @ordered
	 */
	CAX(2, "CAX", "CAX"),

	/**
	 * The '<em><b>OTHER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "OTHER", "OTHER");

	/**
	 * The '<em><b>TAS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Test and Set
	 * <!-- end-model-doc -->
	 * @see #TAS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAS_VALUE = 0;

	/**
	 * The '<em><b>LLSC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Load Link/Store Conditional
	 * <!-- end-model-doc -->
	 * @see #LLSC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LLSC_VALUE = 1;

	/**
	 * The '<em><b>CAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Compare and Exchange
	 * <!-- end-model-doc -->
	 * @see #CAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAX_VALUE = 2;

	/**
	 * The '<em><b>OTHER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OperationType[] VALUES_ARRAY = new OperationType[] { TAS, LLSC, CAX, OTHER, };

	/**
	 * A public read-only list of all the '<em><b>Operation Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OperationType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OperationType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Operation Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OperationType get(int value) {
		switch (value) {
		case TAS_VALUE:
			return TAS;
		case LLSC_VALUE:
			return LLSC;
		case CAX_VALUE:
			return CAX;
		case OTHER_VALUE:
			return OTHER;
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
	private OperationType(int value, String name, String literal) {
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

} //OperationType
