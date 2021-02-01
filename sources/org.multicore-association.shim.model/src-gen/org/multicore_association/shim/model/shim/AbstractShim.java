/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Shim</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractShim#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractShim#getShimVersion <em>Shim Version</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractShim()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractShim' kind='elementOnly'"
 * @generated
 */
public interface AbstractShim extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractShim_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractShim#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Shim Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shim Version</em>' attribute.
	 * @see #setShimVersion(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractShim_ShimVersion()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='shimVersion'"
	 * @generated
	 */
	String getShimVersion();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractShim#getShimVersion <em>Shim Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shim Version</em>' attribute.
	 * @see #getShimVersion()
	 * @generated
	 */
	void setShimVersion(String value);

} // AbstractShim
