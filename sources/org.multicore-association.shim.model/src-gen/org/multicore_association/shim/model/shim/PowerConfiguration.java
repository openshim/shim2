/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConfiguration#getSystemConfigurationSrc <em>System Configuration Src</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConfiguration#getPowerConsumptionSet <em>Power Consumption Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConfiguration()
 * @model extendedMetaData="name='PowerConfiguration' kind='elementOnly'"
 * @generated
 */
public interface PowerConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>System Configuration Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Configuration Src</em>' attribute.
	 * @see #setSystemConfigurationSrc(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConfiguration_SystemConfigurationSrc()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='systemConfigurationSrc'"
	 * @generated
	 */
	String getSystemConfigurationSrc();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConfiguration#getSystemConfigurationSrc <em>System Configuration Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Configuration Src</em>' attribute.
	 * @see #getSystemConfigurationSrc()
	 * @generated
	 */
	void setSystemConfigurationSrc(String value);

	/**
	 * Returns the value of the '<em><b>Power Consumption Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumption Set</em>' containment reference.
	 * @see #setPowerConsumptionSet(PowerConsumptionSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConfiguration_PowerConsumptionSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PowerConsumptionSet'"
	 * @generated
	 */
	PowerConsumptionSet getPowerConsumptionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConfiguration#getPowerConsumptionSet <em>Power Consumption Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Consumption Set</em>' containment reference.
	 * @see #getPowerConsumptionSet()
	 * @generated
	 */
	void setPowerConsumptionSet(PowerConsumptionSet value);

} // PowerConfiguration
