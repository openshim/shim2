/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.SystemConfiguration#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SystemConfiguration#getFrequencyVoltageSet <em>Frequency Voltage Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.SystemConfiguration#getContentionGroupSet <em>Contention Group Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration()
 * @model extendedMetaData="name='SystemConfiguration' kind='elementOnly'"
 * @generated
 */
public interface SystemConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set</em>' containment reference.
	 * @see #setComponentSet(ComponentSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration_ComponentSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComponentSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSet getComponentSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getComponentSet <em>Component Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set</em>' containment reference.
	 * @see #getComponentSet()
	 * @generated
	 */
	void setComponentSet(ComponentSet value);

	/**
	 * Returns the value of the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Set</em>' containment reference.
	 * @see #setAddressSpaceSet(AddressSpaceSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration_AddressSpaceSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressSpaceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpaceSet getAddressSpaceSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Set</em>' containment reference.
	 * @see #getAddressSpaceSet()
	 * @generated
	 */
	void setAddressSpaceSet(AddressSpaceSet value);

	/**
	 * Returns the value of the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set</em>' containment reference.
	 * @see #setCommunicationSet(CommunicationSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration_CommunicationSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommunicationSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationSet getCommunicationSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Set</em>' containment reference.
	 * @see #getCommunicationSet()
	 * @generated
	 */
	void setCommunicationSet(CommunicationSet value);

	/**
	 * Returns the value of the '<em><b>Frequency Voltage Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Voltage Set</em>' containment reference.
	 * @see #setFrequencyVoltageSet(FrequencyVoltageSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration_FrequencyVoltageSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FrequencyVoltageSet' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyVoltageSet getFrequencyVoltageSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getFrequencyVoltageSet <em>Frequency Voltage Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Voltage Set</em>' containment reference.
	 * @see #getFrequencyVoltageSet()
	 * @generated
	 */
	void setFrequencyVoltageSet(FrequencyVoltageSet value);

	/**
	 * Returns the value of the '<em><b>Contention Group Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contention Group Set</em>' containment reference.
	 * @see #setContentionGroupSet(ContentionGroupSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getSystemConfiguration_ContentionGroupSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ContentionGroupSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ContentionGroupSet getContentionGroupSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.SystemConfiguration#getContentionGroupSet <em>Contention Group Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contention Group Set</em>' containment reference.
	 * @see #getContentionGroupSet()
	 * @generated
	 */
	void setContentionGroupSet(ContentionGroupSet value);

} // SystemConfiguration
