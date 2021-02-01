/**
 */
package org.multicore_association.shim10.model.shim10;

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
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getClockFrequency <em>Clock Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getShimVersion <em>Shim Version</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration()
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
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_ComponentSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ComponentSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ComponentSet getComponentSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getComponentSet <em>Component Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Component Set</em>' containment reference.
	 * @see #getComponentSet()
	 * @generated
	 */
	void setComponentSet(ComponentSet value);

	/**
	 * Returns the value of the '<em><b>Communication Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Communication Set</em>' containment reference.
	 * @see #setCommunicationSet(CommunicationSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_CommunicationSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CommunicationSet' namespace='##targetNamespace'"
	 * @generated
	 */
	CommunicationSet getCommunicationSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getCommunicationSet <em>Communication Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Communication Set</em>' containment reference.
	 * @see #getCommunicationSet()
	 * @generated
	 */
	void setCommunicationSet(CommunicationSet value);

	/**
	 * Returns the value of the '<em><b>Address Space Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address Space Set</em>' containment reference.
	 * @see #setAddressSpaceSet(AddressSpaceSet)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_AddressSpaceSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='AddressSpaceSet' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressSpaceSet getAddressSpaceSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getAddressSpaceSet <em>Address Space Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Space Set</em>' containment reference.
	 * @see #getAddressSpaceSet()
	 * @generated
	 */
	void setAddressSpaceSet(AddressSpaceSet value);

	/**
	 * Returns the value of the '<em><b>Clock Frequency</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #setClockFrequency(ClockFrequency)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_ClockFrequency()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ClockFrequency' namespace='##targetNamespace'"
	 * @generated
	 */
	ClockFrequency getClockFrequency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getClockFrequency <em>Clock Frequency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clock Frequency</em>' containment reference.
	 * @see #getClockFrequency()
	 * @generated
	 */
	void setClockFrequency(ClockFrequency value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shim Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shim Version</em>' attribute.
	 * @see #setShimVersion(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getSystemConfiguration_ShimVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='shimVersion' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShimVersion();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.SystemConfiguration#getShimVersion <em>Shim Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shim Version</em>' attribute.
	 * @see #getShimVersion()
	 * @generated
	 */
	void setShimVersion(String value);

} // SystemConfiguration
