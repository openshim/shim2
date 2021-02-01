/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operating Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit <em>Frequency Unit</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit <em>Voltage Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint()
 * @model extendedMetaData="name='OperatingPoint' kind='elementOnly'"
 * @generated
 */
public interface OperatingPoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getName <em>Name</em>}' attribute.
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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #setFrequency(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_Frequency()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='frequency'"
	 * @generated
	 */
	Integer getFrequency();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency</em>' attribute.
	 * @see #isSetFrequency()
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @generated
	 */
	void setFrequency(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequency <em>Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(Integer)
	 * @generated
	 */
	void unsetFrequency();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequency <em>Frequency</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency</em>' attribute is set.
	 * @see #unsetFrequency()
	 * @see #getFrequency()
	 * @see #setFrequency(Integer)
	 * @generated
	 */
	boolean isSetFrequency();

	/**
	 * Returns the value of the '<em><b>Frequency Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.FrequencyUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frequency Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @see #isSetFrequencyUnit()
	 * @see #unsetFrequencyUnit()
	 * @see #setFrequencyUnit(FrequencyUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_FrequencyUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='frequencyUnit'"
	 * @generated
	 */
	FrequencyUnitType getFrequencyUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frequency Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.FrequencyUnitType
	 * @see #isSetFrequencyUnit()
	 * @see #unsetFrequencyUnit()
	 * @see #getFrequencyUnit()
	 * @generated
	 */
	void setFrequencyUnit(FrequencyUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit <em>Frequency Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFrequencyUnit()
	 * @see #getFrequencyUnit()
	 * @see #setFrequencyUnit(FrequencyUnitType)
	 * @generated
	 */
	void unsetFrequencyUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getFrequencyUnit <em>Frequency Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Frequency Unit</em>' attribute is set.
	 * @see #unsetFrequencyUnit()
	 * @see #getFrequencyUnit()
	 * @see #setFrequencyUnit(FrequencyUnitType)
	 * @generated
	 */
	boolean isSetFrequencyUnit();

	/**
	 * Returns the value of the '<em><b>Voltage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #setVoltage(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_Voltage()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='voltage'"
	 * @generated
	 */
	Integer getVoltage();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage</em>' attribute.
	 * @see #isSetVoltage()
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @generated
	 */
	void setVoltage(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltage <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(Integer)
	 * @generated
	 */
	void unsetVoltage();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltage <em>Voltage</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage</em>' attribute is set.
	 * @see #unsetVoltage()
	 * @see #getVoltage()
	 * @see #setVoltage(Integer)
	 * @generated
	 */
	boolean isSetVoltage();

	/**
	 * Returns the value of the '<em><b>Voltage Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.VoltageUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #setVoltageUnit(VoltageUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getOperatingPoint_VoltageUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='voltageUnit'"
	 * @generated
	 */
	VoltageUnitType getVoltageUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Voltage Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.VoltageUnitType
	 * @see #isSetVoltageUnit()
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @generated
	 */
	void setVoltageUnit(VoltageUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit <em>Voltage Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(VoltageUnitType)
	 * @generated
	 */
	void unsetVoltageUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.OperatingPoint#getVoltageUnit <em>Voltage Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Voltage Unit</em>' attribute is set.
	 * @see #unsetVoltageUnit()
	 * @see #getVoltageUnit()
	 * @see #setVoltageUnit(VoltageUnitType)
	 * @generated
	 */
	boolean isSetVoltageUnit();

} // OperatingPoint
