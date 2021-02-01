/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.ComponentSet#getComponentSet <em>Component Set</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ComponentSet#getMasterComponent <em>Master Component</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ComponentSet#getSlaveComponent <em>Slave Component</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ComponentSet#getCache <em>Cache</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getComponentSet()
 * @model extendedMetaData="name='ComponentSet' kind='elementOnly'"
 * @generated
 */
public interface ComponentSet extends AbstractComponent {
	/**
	 * Returns the value of the '<em><b>Component Set</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.ComponentSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component Set</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getComponentSet_ComponentSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ComponentSet'"
	 * @generated
	 */
	EList<ComponentSet> getComponentSet();

	/**
	 * Returns the value of the '<em><b>Master Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.MasterComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Master Component</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getComponentSet_MasterComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='MasterComponent'"
	 * @generated
	 */
	EList<MasterComponent> getMasterComponent();

	/**
	 * Returns the value of the '<em><b>Slave Component</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.SlaveComponent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Slave Component</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getComponentSet_SlaveComponent()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SlaveComponent'"
	 * @generated
	 */
	EList<SlaveComponent> getSlaveComponent();

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.Cache}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getComponentSet_Cache()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Cache'"
	 * @generated
	 */
	EList<Cache> getCache();

} // ComponentSet
