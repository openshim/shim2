/**
 */
package org.multicore_association.shim.model.shim.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.multicore_association.shim.model.shim.AbstractPerformance;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Performance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl#getBest <em>Best</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl#getTypical <em>Typical</em>}</li>
 *   <li>{@link org.multicore_association.shim.model.shim.impl.AbstractPerformanceImpl#getWorst <em>Worst</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractPerformanceImpl extends MinimalEObjectImpl.Container implements AbstractPerformance {
	/**
	 * The default value of the '{@link #getBest() <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBest()
	 * @generated
	 * @ordered
	 */
	protected static final Float BEST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBest() <em>Best</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBest()
	 * @generated
	 * @ordered
	 */
	protected Float best = BEST_EDEFAULT;

	/**
	 * This is true if the Best attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean bestESet;

	/**
	 * The default value of the '{@link #getTypical() <em>Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypical()
	 * @generated
	 * @ordered
	 */
	protected static final float TYPICAL_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getTypical() <em>Typical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypical()
	 * @generated
	 * @ordered
	 */
	protected float typical = TYPICAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getWorst() <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorst()
	 * @generated
	 * @ordered
	 */
	protected static final Float WORST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorst() <em>Worst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorst()
	 * @generated
	 * @ordered
	 */
	protected Float worst = WORST_EDEFAULT;

	/**
	 * This is true if the Worst attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean worstESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractPerformanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ShimPackage.Literals.ABSTRACT_PERFORMANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getBest() {
		return best;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBest(Float newBest) {
		Float oldBest = best;
		best = newBest;
		boolean oldBestESet = bestESet;
		bestESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_PERFORMANCE__BEST, oldBest, best,
					!oldBestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetBest() {
		Float oldBest = best;
		boolean oldBestESet = bestESet;
		best = BEST_EDEFAULT;
		bestESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_PERFORMANCE__BEST, oldBest,
					BEST_EDEFAULT, oldBestESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBest() {
		return bestESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTypical() {
		return typical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypical(float newTypical) {
		float oldTypical = typical;
		typical = newTypical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_PERFORMANCE__TYPICAL, oldTypical,
					typical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getWorst() {
		return worst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWorst(Float newWorst) {
		Float oldWorst = worst;
		worst = newWorst;
		boolean oldWorstESet = worstESet;
		worstESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ShimPackage.ABSTRACT_PERFORMANCE__WORST, oldWorst,
					worst, !oldWorstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWorst() {
		Float oldWorst = worst;
		boolean oldWorstESet = worstESet;
		worst = WORST_EDEFAULT;
		worstESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ShimPackage.ABSTRACT_PERFORMANCE__WORST, oldWorst,
					WORST_EDEFAULT, oldWorstESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWorst() {
		return worstESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ShimPackage.ABSTRACT_PERFORMANCE__BEST:
			return getBest();
		case ShimPackage.ABSTRACT_PERFORMANCE__TYPICAL:
			return getTypical();
		case ShimPackage.ABSTRACT_PERFORMANCE__WORST:
			return getWorst();
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
		case ShimPackage.ABSTRACT_PERFORMANCE__BEST:
			setBest((Float) newValue);
			return;
		case ShimPackage.ABSTRACT_PERFORMANCE__TYPICAL:
			setTypical((Float) newValue);
			return;
		case ShimPackage.ABSTRACT_PERFORMANCE__WORST:
			setWorst((Float) newValue);
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
		case ShimPackage.ABSTRACT_PERFORMANCE__BEST:
			unsetBest();
			return;
		case ShimPackage.ABSTRACT_PERFORMANCE__TYPICAL:
			setTypical(TYPICAL_EDEFAULT);
			return;
		case ShimPackage.ABSTRACT_PERFORMANCE__WORST:
			unsetWorst();
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
		case ShimPackage.ABSTRACT_PERFORMANCE__BEST:
			return isSetBest();
		case ShimPackage.ABSTRACT_PERFORMANCE__TYPICAL:
			return typical != TYPICAL_EDEFAULT;
		case ShimPackage.ABSTRACT_PERFORMANCE__WORST:
			return isSetWorst();
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
		result.append(" (best: ");
		if (bestESet)
			result.append(best);
		else
			result.append("<unset>");
		result.append(", typical: ");
		result.append(typical);
		result.append(", worst: ");
		if (worstESet)
			result.append(worst);
		else
			result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AbstractPerformanceImpl
