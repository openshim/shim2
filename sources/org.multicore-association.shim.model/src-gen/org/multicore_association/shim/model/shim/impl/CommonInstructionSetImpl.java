/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.FunctionalUnitSetFile;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Common Instruction Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl#getFunctionalUnitSetFile <em>Functional Unit Set File</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.CommonInstructionSetImpl#getFunctionalUnitSet <em>Functional Unit Set</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommonInstructionSetImpl extends MinimalEObjectImpl.Container implements CommonInstructionSet {
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
	 * The cached value of the '{@link #getFunctionalUnitSetFile() <em>Functional Unit Set File</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalUnitSetFile()
	 * @generated
	 * @ordered
	 */
	protected FunctionalUnitSetFile functionalUnitSetFile;

	/**
	 * The cached value of the '{@link #getFunctionalUnitSet() <em>Functional Unit Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalUnitSet()
	 * @generated
	 * @ordered
	 */
	protected FunctionalUnitSet functionalUnitSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommonInstructionSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.COMMON_INSTRUCTION_SET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.COMMON_INSTRUCTION_SET__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnitSetFile getFunctionalUnitSetFile() {
		return functionalUnitSetFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalUnitSetFile(FunctionalUnitSetFile newFunctionalUnitSetFile,
			NotificationChain msgs) {
		FunctionalUnitSetFile oldFunctionalUnitSetFile = functionalUnitSetFile;
		functionalUnitSetFile = newFunctionalUnitSetFile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE, oldFunctionalUnitSetFile,
					newFunctionalUnitSetFile);
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
	public void setFunctionalUnitSetFile(FunctionalUnitSetFile newFunctionalUnitSetFile) {
		if (newFunctionalUnitSetFile != functionalUnitSetFile) {
			NotificationChain msgs = null;
			if (functionalUnitSetFile != null)
				msgs = ((InternalEObject) functionalUnitSetFile).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE, null,
						msgs);
			if (newFunctionalUnitSetFile != null)
				msgs = ((InternalEObject) newFunctionalUnitSetFile).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE, null,
						msgs);
			msgs = basicSetFunctionalUnitSetFile(newFunctionalUnitSetFile, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE, newFunctionalUnitSetFile,
					newFunctionalUnitSetFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionalUnitSet getFunctionalUnitSet() {
		return functionalUnitSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFunctionalUnitSet(FunctionalUnitSet newFunctionalUnitSet, NotificationChain msgs) {
		FunctionalUnitSet oldFunctionalUnitSet = functionalUnitSet;
		functionalUnitSet = newFunctionalUnitSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET, oldFunctionalUnitSet,
					newFunctionalUnitSet);
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
	public void setFunctionalUnitSet(FunctionalUnitSet newFunctionalUnitSet) {
		if (newFunctionalUnitSet != functionalUnitSet) {
			NotificationChain msgs = null;
			if (functionalUnitSet != null)
				msgs = ((InternalEObject) functionalUnitSet).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET, null, msgs);
			if (newFunctionalUnitSet != null)
				msgs = ((InternalEObject) newFunctionalUnitSet).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET, null, msgs);
			msgs = basicSetFunctionalUnitSet(newFunctionalUnitSet, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET, newFunctionalUnitSet,
					newFunctionalUnitSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE:
			return basicSetFunctionalUnitSetFile(null, msgs);
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET:
			return basicSetFunctionalUnitSet(null, msgs);
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
		case ShimPackage.COMMON_INSTRUCTION_SET__NAME:
			return getName();
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE:
			return getFunctionalUnitSetFile();
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET:
			return getFunctionalUnitSet();
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
		case ShimPackage.COMMON_INSTRUCTION_SET__NAME:
			setName((String) newValue);
			return;
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE:
			setFunctionalUnitSetFile((FunctionalUnitSetFile) newValue);
			return;
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET:
			setFunctionalUnitSet((FunctionalUnitSet) newValue);
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
		case ShimPackage.COMMON_INSTRUCTION_SET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE:
			setFunctionalUnitSetFile((FunctionalUnitSetFile) null);
			return;
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET:
			setFunctionalUnitSet((FunctionalUnitSet) null);
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
		case ShimPackage.COMMON_INSTRUCTION_SET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET_FILE:
			return functionalUnitSetFile != null;
		case ShimPackage.COMMON_INSTRUCTION_SET__FUNCTIONAL_UNIT_SET:
			return functionalUnitSet != null;
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
		result.append(')');
		return result.toString();
	}

} //CommonInstructionSetImpl
