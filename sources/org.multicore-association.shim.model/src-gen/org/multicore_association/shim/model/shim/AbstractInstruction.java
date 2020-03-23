/**
 */
package org.multicore_association.shim.model.shim;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Instruction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength <em>Encoding Length</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs <em>NInputs</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs <em>NOutputs</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth <em>SIMD Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.AbstractInstruction#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction()
 * @model abstract="true"
 *        extendedMetaData="name='AbstractInstruction' kind='elementOnly'"
 * @generated
 */
public interface AbstractInstruction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Encoding Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Encoding Length</em>' attribute.
	 * @see #isSetEncodingLength()
	 * @see #unsetEncodingLength()
	 * @see #setEncodingLength(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_EncodingLength()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='encodingLength' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getEncodingLength();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength <em>Encoding Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encoding Length</em>' attribute.
	 * @see #isSetEncodingLength()
	 * @see #unsetEncodingLength()
	 * @see #getEncodingLength()
	 * @generated
	 */
	void setEncodingLength(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength <em>Encoding Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetEncodingLength()
	 * @see #getEncodingLength()
	 * @see #setEncodingLength(Integer)
	 * @generated
	 */
	void unsetEncodingLength();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getEncodingLength <em>Encoding Length</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Encoding Length</em>' attribute is set.
	 * @see #unsetEncodingLength()
	 * @see #getEncodingLength()
	 * @see #setEncodingLength(Integer)
	 * @generated
	 */
	boolean isSetEncodingLength();

	/**
	 * Returns the value of the '<em><b>NInputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NInputs</em>' attribute.
	 * @see #isSetNInputs()
	 * @see #unsetNInputs()
	 * @see #setNInputs(Integer)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_NInputs()
	 * @model unsettable="true" dataType="org.multicore_association.shim.model.shim.UnsignedIntObjectType"
	 *        extendedMetaData="kind='attribute' name='nInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	Integer getNInputs();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs <em>NInputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NInputs</em>' attribute.
	 * @see #isSetNInputs()
	 * @see #unsetNInputs()
	 * @see #getNInputs()
	 * @generated
	 */
	void setNInputs(Integer value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs <em>NInputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNInputs()
	 * @see #getNInputs()
	 * @see #setNInputs(Integer)
	 * @generated
	 */
	void unsetNInputs();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNInputs <em>NInputs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NInputs</em>' attribute is set.
	 * @see #unsetNInputs()
	 * @see #getNInputs()
	 * @see #setNInputs(Integer)
	 * @generated
	 */
	boolean isSetNInputs();

	/**
	 * Returns the value of the '<em><b>NOutputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NOutputs</em>' attribute.
	 * @see #isSetNOutputs()
	 * @see #unsetNOutputs()
	 * @see #setNOutputs(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_NOutputs()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='nOutputs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNOutputs();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs <em>NOutputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NOutputs</em>' attribute.
	 * @see #isSetNOutputs()
	 * @see #unsetNOutputs()
	 * @see #getNOutputs()
	 * @generated
	 */
	void setNOutputs(String value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs <em>NOutputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetNOutputs()
	 * @see #getNOutputs()
	 * @see #setNOutputs(String)
	 * @generated
	 */
	void unsetNOutputs();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getNOutputs <em>NOutputs</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>NOutputs</em>' attribute is set.
	 * @see #unsetNOutputs()
	 * @see #getNOutputs()
	 * @see #setNOutputs(String)
	 * @generated
	 */
	boolean isSetNOutputs();

	/**
	 * Returns the value of the '<em><b>SIMD Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SIMD Width</em>' attribute.
	 * @see #isSetSIMDWidth()
	 * @see #unsetSIMDWidth()
	 * @see #setSIMDWidth(String)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_SIMDWidth()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='sIMDWidth' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSIMDWidth();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth <em>SIMD Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SIMD Width</em>' attribute.
	 * @see #isSetSIMDWidth()
	 * @see #unsetSIMDWidth()
	 * @see #getSIMDWidth()
	 * @generated
	 */
	void setSIMDWidth(String value);

	/**
	 * Unsets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth <em>SIMD Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSIMDWidth()
	 * @see #getSIMDWidth()
	 * @see #setSIMDWidth(String)
	 * @generated
	 */
	void unsetSIMDWidth();

	/**
	 * Returns whether the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getSIMDWidth <em>SIMD Width</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>SIMD Width</em>' attribute is set.
	 * @see #unsetSIMDWidth()
	 * @see #getSIMDWidth()
	 * @see #setSIMDWidth(String)
	 * @generated
	 */
	boolean isSetSIMDWidth();

	/**
	 * Returns the value of the '<em><b>Performance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Performance</em>' containment reference.
	 * @see #setPerformance(Performance)
	 * @see org.multicore_association.shim.model.shim.ShimPackage#getAbstractInstruction_Performance()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Performance' namespace='##targetNamespace'"
	 * @generated
	 */
	Performance getPerformance();

	/**
	 * Sets the value of the '{@link org.multicore_association.shim.model.shim.AbstractInstruction#getPerformance <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Performance</em>' containment reference.
	 * @see #getPerformance()
	 * @generated
	 */
	void setPerformance(Performance value);

} // AbstractInstruction
