/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throughput</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef <em>Frequency Domain Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Throughput#getValue <em>Value</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Throughput#getUnit <em>Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getThroughput()
 * @model extendedMetaData="name='Throughput' kind='elementOnly'"
 * @generated
 */
public interface Throughput extends EObject {
	/**
	 * Returns the value of the '<em><b>Frequency Domain Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Domain Ref</em>' reference.
	 * @see #isSetFrequencyDomainRef()
	 * @see #unsetFrequencyDomainRef()
	 * @see #setFrequencyDomainRef(FrequencyDomain)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getThroughput_FrequencyDomainRef()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frequencyDomainRef' namespace='##targetNamespace'"
	 * @generated
	 */
	FrequencyDomain getFrequencyDomainRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference.
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
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequencyDomainRef()
	 * @see #getFrequencyDomainRef()
	 * @see #setFrequencyDomainRef(FrequencyDomain)
	 * @generated
	 */
	void unsetFrequencyDomainRef();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getFrequencyDomainRef <em>Frequency Domain Ref</em>}' reference is set.
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
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #isSetValue()
	 * @see #unsetValue()
	 * @see #setValue(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getThroughput_Value()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='value' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getValue();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getValue <em>Value</em>}' attribute.
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
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValue()
	 * @see #getValue()
	 * @see #setValue(Integer)
	 * @generated
	 */
	void unsetValue();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getValue <em>Value</em>}' attribute is set.
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
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.ThroughputUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #setUnit(ThroughputUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getThroughput_Unit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='unit' namespace='##targetNamespace'"
	 * @generated
	 */
	ThroughputUnitType getUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.ThroughputUnitType
	 * @see #isSetUnit()
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(ThroughputUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUnit()
	 * @see #getUnit()
	 * @see #setUnit(ThroughputUnitType)
	 * @generated
	 */
	void unsetUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.Throughput#getUnit <em>Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Unit</em>' attribute is set.
	 * @see #unsetUnit()
	 * @see #getUnit()
	 * @see #setUnit(ThroughputUnitType)
	 * @generated
	 */
	boolean isSetUnit();

} // Throughput
