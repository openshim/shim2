/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Functional Unit Set File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.FunctionalUnitSetFile#getSrc <em>Src</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnitSetFile()
 * @model extendedMetaData="name='FunctionalUnitSetFile' kind='elementOnly'"
 * @generated
 */
public interface FunctionalUnitSetFile extends EObject {
	/**
	 * Returns the value of the '<em><b>Src</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' attribute.
	 * @see #setSrc(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getFunctionalUnitSetFile_Src()
	 * @model default="0" required="true"
	 *        extendedMetaData="kind='attribute' name='src' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSrc();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.FunctionalUnitSetFile#getSrc <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' attribute.
	 * @see #getSrc()
	 * @generated
	 */
	void setSrc(String value);

} // FunctionalUnitSetFile
