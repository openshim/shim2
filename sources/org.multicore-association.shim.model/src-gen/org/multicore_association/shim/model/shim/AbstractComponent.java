/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractComponent#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractComponent#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef <em>Frequency Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef <em>Voltage Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef <em>Operating Point Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractComponent' kind='elementOnly'"
 * @generated
 */
public interface AbstractComponent extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Domain Ref</em>' reference.
	 * @see #isSetFrequencyDomainRef()
	 * @see #unsetFrequencyDomainRef()
	 * @see #setFrequencyDomainRef(FrequencyDomain)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent_FrequencyDomainRef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frequencyDomainRef'"
	 * @generated
	 */
	FrequencyDomain getFrequencyDomainRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Domain Ref</em>' reference.
	 * @see #isSetFrequencyDomainRef()
	 * @see #unsetFrequencyDomainRef()
	 * @see #getFrequencyDomainRef()
	 * @generated
	 */
	void setFrequencyDomainRef(FrequencyDomain value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequencyDomainRef()
	 * @see #getFrequencyDomainRef()
	 * @see #setFrequencyDomainRef(FrequencyDomain)
	 * @generated
	 */
	void unsetFrequencyDomainRef();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency Domain Ref</em>' reference is set.
	 * @see #unsetFrequencyDomainRef()
	 * @see #getFrequencyDomainRef()
	 * @see #setFrequencyDomainRef(FrequencyDomain)
	 * @generated
	 */
	boolean isSetFrequencyDomainRef();

	/**
	 * Returns the value of the '<em><b>Voltage Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Domain Ref</em>' reference.
	 * @see #isSetVoltageDomainRef()
	 * @see #unsetVoltageDomainRef()
	 * @see #setVoltageDomainRef(VoltageDomain)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent_VoltageDomainRef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='voltageDomainRef'"
	 * @generated
	 */
	VoltageDomain getVoltageDomainRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef <em>Voltage Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Domain Ref</em>' reference.
	 * @see #isSetVoltageDomainRef()
	 * @see #unsetVoltageDomainRef()
	 * @see #getVoltageDomainRef()
	 * @generated
	 */
	void setVoltageDomainRef(VoltageDomain value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef <em>Voltage Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageDomainRef()
	 * @see #getVoltageDomainRef()
	 * @see #setVoltageDomainRef(VoltageDomain)
	 * @generated
	 */
	void unsetVoltageDomainRef();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getVoltageDomainRef <em>Voltage Domain Ref</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Domain Ref</em>' reference is set.
	 * @see #unsetVoltageDomainRef()
	 * @see #getVoltageDomainRef()
	 * @see #setVoltageDomainRef(VoltageDomain)
	 * @generated
	 */
	boolean isSetVoltageDomainRef();

	/**
	 * Returns the value of the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Point Ref</em>' reference.
	 * @see #isSetOperatingPointRef()
	 * @see #unsetOperatingPointRef()
	 * @see #setOperatingPointRef(OperatingPointSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractComponent_OperatingPointRef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='operatingPointRef'"
	 * @generated
	 */
	OperatingPointSet getOperatingPointRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef <em>Operating Point Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Point Ref</em>' reference.
	 * @see #isSetOperatingPointRef()
	 * @see #unsetOperatingPointRef()
	 * @see #getOperatingPointRef()
	 * @generated
	 */
	void setOperatingPointRef(OperatingPointSet value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef <em>Operating Point Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetOperatingPointRef()
	 * @see #getOperatingPointRef()
	 * @see #setOperatingPointRef(OperatingPointSet)
	 * @generated
	 */
	void unsetOperatingPointRef();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractComponent#getOperatingPointRef <em>Operating Point Ref</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Operating Point Ref</em>' reference is set.
	 * @see #unsetOperatingPointRef()
	 * @see #getOperatingPointRef()
	 * @see #setOperatingPointRef(OperatingPointSet)
	 * @generated
	 */
	boolean isSetOperatingPointRef();

} // AbstractComponent
