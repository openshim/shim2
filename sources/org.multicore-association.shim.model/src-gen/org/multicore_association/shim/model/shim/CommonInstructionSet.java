/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Common Instruction Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSetFile <em>Functional Unit Set File</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSet <em>Functional Unit Set</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getCommonInstructionSet()
 * @model extendedMetaData="name='CommonInstructionSet' kind='elementOnly'"
 * @generated
 */
public interface CommonInstructionSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCommonInstructionSet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Functional Unit Set File</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Unit Set File</em>' containment reference.
	 * @see #setFunctionalUnitSetFile(FunctionalUnitSetFile)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCommonInstructionSet_FunctionalUnitSetFile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FunctionalUnitSetFile' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionalUnitSetFile getFunctionalUnitSetFile();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSetFile <em>Functional Unit Set File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Unit Set File</em>' containment reference.
	 * @see #getFunctionalUnitSetFile()
	 * @generated
	 */
	void setFunctionalUnitSetFile(FunctionalUnitSetFile value);

	/**
	 * Returns the value of the '<em><b>Functional Unit Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functional Unit Set</em>' containment reference.
	 * @see #setFunctionalUnitSet(FunctionalUnitSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getCommonInstructionSet_FunctionalUnitSet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FunctionalUnitSet' namespace='##targetNamespace'"
	 * @generated
	 */
	FunctionalUnitSet getFunctionalUnitSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.CommonInstructionSet#getFunctionalUnitSet <em>Functional Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Functional Unit Set</em>' containment reference.
	 * @see #getFunctionalUnitSet()
	 * @generated
	 */
	void setFunctionalUnitSet(FunctionalUnitSet value);

} // CommonInstructionSet
