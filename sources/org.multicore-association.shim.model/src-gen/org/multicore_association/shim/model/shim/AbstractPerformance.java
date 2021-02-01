/**
 */
package org.multicore_association.shim.model.shim;

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
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractPerformance#getBest <em>Best</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractPerformance#getTypical <em>Typical</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractPerformance#getWorst <em>Worst</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractPerformance()
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
	 * @see #setBest(Float)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractPerformance_Best()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedFloatObjectType"
	 *        extendedMetaData="kind='attribute' name='best'"
	 * @generated
	 */
	Float getBest();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Best</em>' attribute.
	 * @see #isSetBest()
	 * @see #unsetBest()
	 * @see #getBest()
	 * @generated
	 */
	void setBest(Float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getBest <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetBest()
	 * @see #getBest()
	 * @see #setBest(Float)
	 * @generated
	 */
	void unsetBest();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getBest <em>Best</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Best</em>' attribute is set.
	 * @see #unsetBest()
	 * @see #getBest()
	 * @see #setBest(Float)
	 * @generated
	 */
	boolean isSetBest();

	/**
	 * Returns the value of the '<em><b>Typical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typical</em>' attribute.
	 * @see #setTypical(float)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractPerformance_Typical()
	 * @model dataType="org.multicore_association.shim.model.shim.UnsignedFloatType" required="true"
	 *        extendedMetaData="kind='attribute' name='typical'"
	 * @generated
	 */
	float getTypical();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getTypical <em>Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typical</em>' attribute.
	 * @see #getTypical()
	 * @generated
	 */
	void setTypical(float value);

	/**
	 * Returns the value of the '<em><b>Worst</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worst</em>' attribute.
	 * @see #isSetWorst()
	 * @see #unsetWorst()
	 * @see #setWorst(Float)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractPerformance_Worst()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedFloatObjectType"
	 *        extendedMetaData="kind='attribute' name='worst'"
	 * @generated
	 */
	Float getWorst();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worst</em>' attribute.
	 * @see #isSetWorst()
	 * @see #unsetWorst()
	 * @see #getWorst()
	 * @generated
	 */
	void setWorst(Float value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getWorst <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWorst()
	 * @see #getWorst()
	 * @see #setWorst(Float)
	 * @generated
	 */
	void unsetWorst();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractPerformance#getWorst <em>Worst</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Worst</em>' attribute is set.
	 * @see #unsetWorst()
	 * @see #getWorst()
	 * @see #setWorst(Float)
	 * @generated
	 */
	boolean isSetWorst();

} // AbstractPerformance
