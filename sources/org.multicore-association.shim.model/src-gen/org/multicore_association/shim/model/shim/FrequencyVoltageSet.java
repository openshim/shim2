/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frequency Voltage Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getFrequencyDomain <em>Frequency Domain</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getVoltageDomain <em>Voltage Domain</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FrequencyVoltageSet#getOperatingPointSet <em>Operating Point Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getFrequencyVoltageSet()
 * @model extendedMetaData="name='FrequencyVoltageSet' kind='elementOnly'"
 * @generated
 */
public interface FrequencyVoltageSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Frequency Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.FrequencyDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Domain</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFrequencyVoltageSet_FrequencyDomain()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FrequencyDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FrequencyDomain> getFrequencyDomain();

	/**
	 * Returns the value of the '<em><b>Voltage Domain</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.VoltageDomain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Domain</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFrequencyVoltageSet_VoltageDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VoltageDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VoltageDomain> getVoltageDomain();

	/**
	 * Returns the value of the '<em><b>Operating Point Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.OperatingPointSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Point Set</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFrequencyVoltageSet_OperatingPointSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='OperatingPointSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<OperatingPointSet> getOperatingPointSet();

} // FrequencyVoltageSet
