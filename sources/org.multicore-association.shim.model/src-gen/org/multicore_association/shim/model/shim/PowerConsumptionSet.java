/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Power Consumption Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumption <em>Power Consumption</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getPowerConsumerRef <em>Power Consumer Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumptionSet()
 * @model extendedMetaData="name='PowerConsumptionSet' kind='elementOnly'"
 * @generated
 */
public interface PowerConsumptionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumptionSet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getName <em>Name</em>}' attribute.
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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumptionSet_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id' namespace='##targetNamespace'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.PowerConsumptionSet#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Power Consumption</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.PowerConsumption}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumption</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumptionSet_PowerConsumption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PowerConsumption' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PowerConsumption> getPowerConsumption();

	/**
	 * Returns the value of the '<em><b>Power Consumer Ref</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.AbstractComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Power Consumer Ref</em>' reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getPowerConsumptionSet_PowerConsumerRef()
	 * @model extendedMetaData="kind='element' name='PowerConsumerRef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AbstractComponent> getPowerConsumerRef();

} // PowerConsumptionSet
