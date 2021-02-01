/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contention Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroup#getId <em>Id</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroup#getThroughput <em>Throughput</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroup#getDataRate <em>Data Rate</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.ContentionGroup#getPerformanceSetRef <em>Performance Set Ref</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup()
 * @model extendedMetaData="name='ContentionGroup' kind='elementOnly'"
 * @generated
 */
public interface ContentionGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.ContentionGroup#getName <em>Name</em>}' attribute.
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
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.ContentionGroup#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Throughput</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Throughput</em>' containment reference.
	 * @see #setThroughput(Throughput)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup_Throughput()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Throughput'"
	 * @generated
	 */
	Throughput getThroughput();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.ContentionGroup#getThroughput <em>Throughput</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Throughput</em>' containment reference.
	 * @see #getThroughput()
	 * @generated
	 */
	void setThroughput(Throughput value);

	/**
	 * Returns the value of the '<em><b>Data Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Rate</em>' containment reference.
	 * @see #setDataRate(DataRate)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup_DataRate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DataRate'"
	 * @generated
	 */
	DataRate getDataRate();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.ContentionGroup#getDataRate <em>Data Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Rate</em>' containment reference.
	 * @see #getDataRate()
	 * @generated
	 */
	void setDataRate(DataRate value);

	/**
	 * Returns the value of the '<em><b>Performance Set Ref</b></em>' reference list.
	 * The list contents are of type {@link org.multicore_association.shim.model.shim.PerformanceSet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance Set Ref</em>' reference list.
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getContentionGroup_PerformanceSetRef()
	 * @model resolveProxies="false" required="true"
	 *        extendedMetaData="kind='element' name='PerformanceSetRef'"
	 * @generated
	 */
	EList<PerformanceSet> getPerformanceSetRef();

} // ContentionGroup
