/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Instruction#getPerformance <em>Performance</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.Instruction#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getInstruction()
 * @model extendedMetaData="name='Instruction' kind='elementOnly'"
 * @generated
 */
public interface Instruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference.
	 * @see #setPerformance(Performance)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getInstruction_Performance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Performance' namespace='##targetNamespace'"
	 * @generated
	 */
	Performance getPerformance();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Instruction#getPerformance <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' containment reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Performance value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getInstruction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.Instruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Instruction
