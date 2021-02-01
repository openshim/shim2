/**
 */
package org.multicore_association.shim.model.shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.Shim#getSystemConfiguration <em>System Configuration</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Shim#getPowerConfiguration <em>Power Configuration</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.Shim#getFunctionalUnitSet <em>Functional Unit Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getShim()
 * @model extendedMetaData="name='Shim' kind='elementOnly'"
 * @generated
 */
public interface Shim extends AbstractShim {
	/**
	 * Returns the value of the '<em><b>System Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Configuration</em>' containment reference.
	 * @see #setSystemConfiguration(SystemConfiguration)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getShim_SystemConfiguration()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SystemConfiguration'"
	 * @generated
	 */
	SystemConfiguration getSystemConfiguration();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Shim#getSystemConfiguration <em>System Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Configuration</em>' containment reference.
	 * @see #getSystemConfiguration()
	 * @generated
	 */
	void setSystemConfiguration(SystemConfiguration value);

	/**
	 * Returns the value of the '<em><b>Power Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Configuration</em>' containment reference.
	 * @see #setPowerConfiguration(PowerConfiguration)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getShim_PowerConfiguration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PowerConfiguration'"
	 * @generated
	 */
	PowerConfiguration getPowerConfiguration();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Shim#getPowerConfiguration <em>Power Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Power Configuration</em>' containment reference.
	 * @see #getPowerConfiguration()
	 * @generated
	 */
	void setPowerConfiguration(PowerConfiguration value);

	/**
	 * Returns the value of the '<em><b>Functional Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Unit Set</em>' containment reference.
	 * @see #setFunctionalUnitSet(FunctionalUnitSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getShim_FunctionalUnitSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FunctionalUnitSet'"
	 * @generated
	 */
	FunctionalUnitSet getFunctionalUnitSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.Shim#getFunctionalUnitSet <em>Functional Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Unit Set</em>' containment reference.
	 * @see #getFunctionalUnitSet()
	 * @generated
	 */
	void setFunctionalUnitSet(FunctionalUnitSet value);

} // Shim
