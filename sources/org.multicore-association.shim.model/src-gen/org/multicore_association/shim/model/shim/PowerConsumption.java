/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Consumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumption#getOperatingPointRef <em>Operating Point Ref</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumption#getPower <em>Power</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit <em>Power Unit</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumption()
 * @model extendedMetaData="name='PowerConsumption' kind='elementOnly'"
 * @generated
 */
public interface PowerConsumption extends EObject {
	/**
	 * Returns the value of the '<em><b>Operating Point Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operating Point Ref</em>' reference.
	 * @see #setOperatingPointRef(OperatingPoint)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumption_OperatingPointRef()
	 * @model extendedMetaData="kind='attribute' name='operatingPointRef'"
	 * @generated
	 */
	OperatingPoint getOperatingPointRef();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getOperatingPointRef <em>Operating Point Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operating Point Ref</em>' reference.
	 * @see #getOperatingPointRef()
	 * @generated
	 */
	void setOperatingPointRef(OperatingPoint value);

	/**
	 * Returns the value of the '<em><b>Power</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #setPower(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumption_Power()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='power'"
	 * @generated
	 */
	Integer getPower();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power</em>' attribute.
	 * @see #isSetPower()
	 * @see #unsetPower()
	 * @see #getPower()
	 * @generated
	 */
	void setPower(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPower <em>Power</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPower()
	 * @see #getPower()
	 * @see #setPower(Integer)
	 * @generated
	 */
	void unsetPower();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPower <em>Power</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power</em>' attribute is set.
	 * @see #unsetPower()
	 * @see #getPower()
	 * @see #setPower(Integer)
	 * @generated
	 */
	boolean isSetPower();

	/**
	 * Returns the value of the '<em><b>Power Unit</b></em>' attribute.
	 * The literals are from the enumeration {@link org.multicore_association.shim.model.shim.PowerUnitType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @see #isSetPowerUnit()
	 * @see #unsetPowerUnit()
	 * @see #setPowerUnit(PowerUnitType)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumption_PowerUnit()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='powerUnit'"
	 * @generated
	 */
	PowerUnitType getPowerUnit();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Unit</em>' attribute.
	 * @see org.multicore_association.shim.model.shim.PowerUnitType
	 * @see #isSetPowerUnit()
	 * @see #unsetPowerUnit()
	 * @see #getPowerUnit()
	 * @generated
	 */
	void setPowerUnit(PowerUnitType value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit <em>Power Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPowerUnit()
	 * @see #getPowerUnit()
	 * @see #setPowerUnit(PowerUnitType)
	 * @generated
	 */
	void unsetPowerUnit();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumption#getPowerUnit <em>Power Unit</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Power Unit</em>' attribute is set.
	 * @see #unsetPowerUnit()
	 * @see #getPowerUnit()
	 * @see #setPowerUnit(PowerUnitType)
	 * @generated
	 */
	boolean isSetPowerUnit();

} // PowerConsumption
