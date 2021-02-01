/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.FunctionalUnit#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FunctionalUnit#getInstruction <em>Instruction</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.FunctionalUnit#getCustomInstruction <em>Custom Instruction</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnit()
 * @model extendedMetaData="name='FunctionalUnit' kind='elementOnly'"
 * @generated
 */
public interface FunctionalUnit extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnit_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.FunctionalUnit#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Instruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnit_Instruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Instruction'"
	 * @generated
	 */
	EList<Instruction> getInstruction();

	/**
	 * Returns the value of the '<em><b>Custom Instruction</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.CustomInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Custom Instruction</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnit_CustomInstruction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CustomInstruction'"
	 * @generated
	 */
	EList<CustomInstruction> getCustomInstruction();

} // FunctionalUnit
