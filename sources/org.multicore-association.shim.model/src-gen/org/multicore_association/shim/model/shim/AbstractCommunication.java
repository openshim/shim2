/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Communication</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractCommunication#getConnectionSet <em>Connection Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractCommunication#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractCommunication()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractCommunication' kind='elementOnly'"
 * @generated
 */
public interface AbstractCommunication extends EObject {
	/**
	 * Returns the value of the '<em><b>Connection Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Set</em>' containment reference.
	 * @see #setConnectionSet(ConnectionSet)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractCommunication_ConnectionSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ConnectionSet' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionSet getConnectionSet();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractCommunication#getConnectionSet <em>Connection Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Set</em>' containment reference.
	 * @see #getConnectionSet()
	 * @generated
	 */
	void setConnectionSet(ConnectionSet value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractCommunication_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractCommunication#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // AbstractCommunication
