/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AbstractInstruction;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getEncodingLength <em>Encoding Length</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getNInputs <em>NInputs</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getNOutputs <em>NOutputs</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getSIMDWidth <em>SIMD Width</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractInstructionImpl#getPerformance <em>Performance</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractInstructionImpl extends MinimalEObjectImpl.Container implements AbstractInstruction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncodingLength() <em>Encoding Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENCODING_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingLength() <em>Encoding Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncodingLength()
	 * @generated
	 * @ordered
	 */
	protected Integer encodingLength = ENCODING_LENGTH_EDEFAULT;

	/**
	 * This is true if the Encoding Length attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean encodingLengthESet;

	/**
	 * The default value of the '{@link #getNInputs() <em>NInputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNInputs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NINPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNInputs() <em>NInputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNInputs()
	 * @generated
	 * @ordered
	 */
	protected Integer nInputs = NINPUTS_EDEFAULT;

	/**
	 * This is true if the NInputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nInputsESet;

	/**
	 * The default value of the '{@link #getNOutputs() <em>NOutputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOutputs()
	 * @generated
	 * @ordered
	 */
	protected static final String NOUTPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNOutputs() <em>NOutputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNOutputs()
	 * @generated
	 * @ordered
	 */
	protected String nOutputs = NOUTPUTS_EDEFAULT;

	/**
	 * This is true if the NOutputs attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean nOutputsESet;

	/**
	 * The default value of the '{@link #getSIMDWidth() <em>SIMD Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMDWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String SIMD_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSIMDWidth() <em>SIMD Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSIMDWidth()
	 * @generated
	 * @ordered
	 */
	protected String sIMDWidth = SIMD_WIDTH_EDEFAULT;

	/**
	 * This is true if the SIMD Width attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sIMDWidthESet;

	/**
	 * The cached value of the '{@link #getPerformance() <em>Performance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerformance()
	 * @generated
	 * @ordered
	 */
	protected Performance performance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractInstructionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ABSTRACT_INSTRUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEncodingLength() {
		return encodingLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncodingLength(Integer newEncodingLength) {
		Integer oldEncodingLength = encodingLength;
		encodingLength = newEncodingLength;
		boolean oldEncodingLengthESet = encodingLengthESet;
		encodingLengthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH,
					oldEncodingLength, encodingLength, !oldEncodingLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEncodingLength() {
		Integer oldEncodingLength = encodingLength;
		boolean oldEncodingLengthESet = encodingLengthESet;
		encodingLength = ENCODING_LENGTH_EDEFAULT;
		encodingLengthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH,
					oldEncodingLength, ENCODING_LENGTH_EDEFAULT, oldEncodingLengthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEncodingLength() {
		return encodingLengthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNInputs() {
		return nInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNInputs(Integer newNInputs) {
		Integer oldNInputs = nInputs;
		nInputs = newNInputs;
		boolean oldNInputsESet = nInputsESet;
		nInputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS, oldNInputs,
					nInputs, !oldNInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNInputs() {
		Integer oldNInputs = nInputs;
		boolean oldNInputsESet = nInputsESet;
		nInputs = NINPUTS_EDEFAULT;
		nInputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS,
					oldNInputs, NINPUTS_EDEFAULT, oldNInputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNInputs() {
		return nInputsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNOutputs() {
		return nOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNOutputs(String newNOutputs) {
		String oldNOutputs = nOutputs;
		nOutputs = newNOutputs;
		boolean oldNOutputsESet = nOutputsESet;
		nOutputsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS,
					oldNOutputs, nOutputs, !oldNOutputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetNOutputs() {
		String oldNOutputs = nOutputs;
		boolean oldNOutputsESet = nOutputsESet;
		nOutputs = NOUTPUTS_EDEFAULT;
		nOutputsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS,
					oldNOutputs, NOUTPUTS_EDEFAULT, oldNOutputsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetNOutputs() {
		return nOutputsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSIMDWidth() {
		return sIMDWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSIMDWidth(String newSIMDWidth) {
		String oldSIMDWidth = sIMDWidth;
		sIMDWidth = newSIMDWidth;
		boolean oldSIMDWidthESet = sIMDWidthESet;
		sIMDWidthESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH,
					oldSIMDWidth, sIMDWidth, !oldSIMDWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSIMDWidth() {
		String oldSIMDWidth = sIMDWidth;
		boolean oldSIMDWidthESet = sIMDWidthESet;
		sIMDWidth = SIMD_WIDTH_EDEFAULT;
		sIMDWidthESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH,
					oldSIMDWidth, SIMD_WIDTH_EDEFAULT, oldSIMDWidthESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSIMDWidth() {
		return sIMDWidthESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance getPerformance() {
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPerformance(Performance newPerformance, NotificationChain msgs) {
		Performance oldPerformance = performance;
		performance = newPerformance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE, oldPerformance, newPerformance);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerformance(Performance newPerformance) {
		if (newPerformance != performance) {
			NotificationChain msgs = null;
			if (performance != null)
				msgs = ((InternalEObject) performance).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE, null, msgs);
			if (newPerformance != null)
				msgs = ((InternalEObject) newPerformance).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE, null, msgs);
			msgs = basicSetPerformance(newPerformance, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE,
					newPerformance, newPerformance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE:
			return basicSetPerformance(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_INSTRUCTION__NAME:
			return getName();
		case ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH:
			return getEncodingLength();
		case ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS:
			return getNInputs();
		case ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS:
			return getNOutputs();
		case ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH:
			return getSIMDWidth();
		case ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE:
			return getPerformance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_INSTRUCTION__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH:
			setEncodingLength((Integer) newValue);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS:
			setNInputs((Integer) newValue);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS:
			setNOutputs((String) newValue);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH:
			setSIMDWidth((String) newValue);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE:
			setPerformance((Performance) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_INSTRUCTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH:
			unsetEncodingLength();
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS:
			unsetNInputs();
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS:
			unsetNOutputs();
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH:
			unsetSIMDWidth();
			return;
		case ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE:
			setPerformance((Performance) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_INSTRUCTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.ABSTRACT_INSTRUCTION__ENCODING_LENGTH:
			return isSetEncodingLength();
		case ShimPackage.ABSTRACT_INSTRUCTION__NINPUTS:
			return isSetNInputs();
		case ShimPackage.ABSTRACT_INSTRUCTION__NOUTPUTS:
			return isSetNOutputs();
		case ShimPackage.ABSTRACT_INSTRUCTION__SIMD_WIDTH:
			return isSetSIMDWidth();
		case ShimPackage.ABSTRACT_INSTRUCTION__PERFORMANCE:
			return performance != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", encodingLength: ");
		if (encodingLengthESet)
			result.append(encodingLength);
		else
			result.append("<unset>");
		result.append(", nInputs: ");
		if (nInputsESet)
			result.append(nInputs);
		else
			result.append("<unset>");
		result.append(", nOutputs: ");
		if (nOutputsESet)
			result.append(nOutputs);
		else
			result.append("<unset>");
		result.append(", sIMDWidth: ");
		if (sIMDWidthESet)
			result.append(sIMDWidth);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AbstractInstructionImpl
