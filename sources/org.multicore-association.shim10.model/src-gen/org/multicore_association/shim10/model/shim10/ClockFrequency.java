/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock Frequency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue <em>Clock Value</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getClockFrequency()
 * @model extendedMetaData="name='ClockFrequency' kind='empty'"
 * @generated
 */
public interface ClockFrequency extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Value</em>' attribute.
	 * @see #isSetClockValue()
	 * @see #unsetClockValue()
	 * @see #setClockValue(float)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getClockFrequency_ClockValue()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='clockValue' namespace='##targetNamespace'"
	 * @generated
	 */
	float getClockValue();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue <em>Clock Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Value</em>' attribute.
	 * @see #isSetClockValue()
	 * @see #unsetClockValue()
	 * @see #getClockValue()
	 * @generated
	 */
	void setClockValue(float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue <em>Clock Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetClockValue()
	 * @see #getClockValue()
	 * @see #setClockValue(float)
	 * @generated
	 */
	void unsetClockValue();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.ClockFrequency#getClockValue <em>Clock Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Clock Value</em>' attribute is set.
	 * @see #unsetClockValue()
	 * @see #getClockValue()
	 * @see #setClockValue(float)
	 * @generated
	 */
	boolean isSetClockValue();

} // ClockFrequency
