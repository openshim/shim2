/**
 */
package org.multicore_association.shim.edit.model.app;

import org.eclipse.emf.ecore.EObject;

import org.multicore_association.shim.model.shim.Shim;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Wizard Page Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim <em>Shim</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAbstractWizardPageData()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractWizardPageData' kind='elementOnly'"
 * @generated
 */
public interface AbstractWizardPageData extends EObject {
	/**
	 * Returns the value of the '<em><b>Shim</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shim</em>' reference.
	 * @see #isSetShim()
	 * @see #unsetShim()
	 * @see #setShim(Shim)
	 * @see org.multicore_association.shim.edit.model.app.AppPackage#getAbstractWizardPageData_Shim()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='element' name='Shim' namespace='##targetNamespace'"
	 * @generated
	 */
	Shim getShim();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim <em>Shim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shim</em>' reference.
	 * @see #isSetShim()
	 * @see #unsetShim()
	 * @see #getShim()
	 * @generated
	 */
	void setShim(Shim value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim <em>Shim</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShim()
	 * @see #getShim()
	 * @see #setShim(Shim)
	 * @generated
	 */
	void unsetShim();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.edit.model.app.AbstractWizardPageData#getShim <em>Shim</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shim</em>' reference is set.
	 * @see #unsetShim()
	 * @see #getShim()
	 * @see #setShim(Shim)
	 * @generated
	 */
	boolean isSetShim();

} // AbstractWizardPageData
