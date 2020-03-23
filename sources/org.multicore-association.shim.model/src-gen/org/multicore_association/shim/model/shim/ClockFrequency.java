/**
 */
package org.multicore_association.shim.model.shim;

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
 *   <li>{@link org.multicore_association.shim.model.shim.ClockFrequency#getClockValue <em>Clock Value</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getClockFrequency()
 * @model extendedMetaData="name='ClockFrequency' kind='empty'"
 * @generated
 */
public interface ClockFrequency extends EObject {
	/**
	 * Returns the value of the '<em><b>Clock Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Value</em>' attribute.
	 * @see #setClockValue(float)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getClockFrequency_ClockValue()
	 * @model default="0" dataType="org.multicore_association.shim.model.shim.UnsignedFloatType" required="true"
	 *        extendedMetaData="kind='attribute' name='clockValue' namespace='##targetNamespace'"
	 * @generated
	 */
	float getClockValue();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.ClockFrequency#getClockValue <em>Clock Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Value</em>' attribute.
	 * @see #getClockValue()
	 * @generated
	 */
	void setClockValue(float value);

} // ClockFrequency
