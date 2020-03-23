/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Rate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.DataRate#getValue <em>Value</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.DataRate#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getDataRate()
 * @model extendedMetaData="name='DataRate' kind='elementOnly'"
 * @generated
 */
public interface DataRate extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getDataRate_Value()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(Integer)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getValue <em>Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value</em>' attribute is set.
	 * @see #unsetValue()
	 * @see #getValue()
	 * @see #setValue(Integer)
	 * @generated
	 */
	boolean isSetValue();

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.DataRateUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(DataRateUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getDataRate_Unit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	DataRateUnitType getUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.DataRateUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(DataRateUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(DataRateUnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.DataRate#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(DataRateUnitType)
	 * @generated
	 */
	boolean isSetUnit();

} // DataRate
