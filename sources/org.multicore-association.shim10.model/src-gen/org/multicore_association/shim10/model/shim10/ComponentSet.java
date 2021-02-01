/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ComponentSet#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ComponentSet#getSlaveComponent <em>Slave Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ComponentSet#getMasterComponent <em>Master Component</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ComponentSet#getCache <em>Cache</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.ComponentSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet()
 * @model extendedMetaData="name='ComponentSet' kind='elementOnly'"
 * @generated
 */
public interface ComponentSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Component Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.ComponentSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet_ComponentSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComponentSet' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ComponentSet> getComponentSet();

	/**
	 * Returns the value of the '<em><b>Slave Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.SlaveComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet_SlaveComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SlaveComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SlaveComponent> getSlaveComponent();

	/**
	 * Returns the value of the '<em><b>Master Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.MasterComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet_MasterComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasterComponent' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<MasterComponent> getMasterComponent();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim10.model.shim10.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference list.
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet_Cache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cache' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Cache> getCache();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getComponentSet_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.ComponentSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // ComponentSet
