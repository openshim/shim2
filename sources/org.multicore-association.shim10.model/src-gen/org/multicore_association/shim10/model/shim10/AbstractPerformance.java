/**
 */
package org.multicore_association.shim10.model.shim10;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Performance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest <em>Best</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical <em>Typical</em>}</li>
 *   <li>{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst <em>Worst</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAbstractPerformance()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractPerformance' kind='empty'"
 * @generated
 */
public interface AbstractPerformance extends EObject {
	/**
	 * Returns the value of the '<em><b>Best</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Best</em>' attribute.
	 * @see #isSetBest()
	 * @see #unsetBest()
	 * @see #setBest(float)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAbstractPerformance_Best()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='best' namespace='##targetNamespace'"
	 * @generated
	 */
	float getBest();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best</em>' attribute.
	 * @see #isSetBest()
	 * @see #unsetBest()
	 * @see #getBest()
	 * @generated
	 */
	void setBest(float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBest()
	 * @see #getBest()
	 * @see #setBest(float)
	 * @generated
	 */
	void unsetBest();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getBest <em>Best</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best</em>' attribute is set.
	 * @see #unsetBest()
	 * @see #getBest()
	 * @see #setBest(float)
	 * @generated
	 */
	boolean isSetBest();

	/**
	 * Returns the value of the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typical</em>' attribute.
	 * @see #isSetTypical()
	 * @see #unsetTypical()
	 * @see #setTypical(float)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAbstractPerformance_Typical()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float" required="true"
	 *        extendedMetaData="kind='attribute' name='typical' namespace='##targetNamespace'"
	 * @generated
	 */
	float getTypical();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical <em>Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typical</em>' attribute.
	 * @see #isSetTypical()
	 * @see #unsetTypical()
	 * @see #getTypical()
	 * @generated
	 */
	void setTypical(float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical <em>Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTypical()
	 * @see #getTypical()
	 * @see #setTypical(float)
	 * @generated
	 */
	void unsetTypical();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getTypical <em>Typical</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Typical</em>' attribute is set.
	 * @see #unsetTypical()
	 * @see #getTypical()
	 * @see #setTypical(float)
	 * @generated
	 */
	boolean isSetTypical();

	/**
	 * Returns the value of the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst</em>' attribute.
	 * @see #isSetWorst()
	 * @see #unsetWorst()
	 * @see #setWorst(float)
	 * @see org.multicore_association.shim10.model.shim10.ShimPackage#getAbstractPerformance_Worst()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Float"
	 *        extendedMetaData="kind='attribute' name='worst' namespace='##targetNamespace'"
	 * @generated
	 */
	float getWorst();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst</em>' attribute.
	 * @see #isSetWorst()
	 * @see #unsetWorst()
	 * @see #getWorst()
	 * @generated
	 */
	void setWorst(float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorst()
	 * @see #getWorst()
	 * @see #setWorst(float)
	 * @generated
	 */
	void unsetWorst();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim10.model.shim10.AbstractPerformance#getWorst <em>Worst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst</em>' attribute is set.
	 * @see #unsetWorst()
	 * @see #getWorst()
	 * @see #setWorst(float)
	 * @generated
	 */
	boolean isSetWorst();

} // AbstractPerformance
