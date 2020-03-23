/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Components Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl#getNumberMaster <em>Number Master</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl#getNumberSlave <em>Number Slave</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl#getNumberComponent <em>Number Component</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ComponentsPreferencesImpl#getClock <em>Clock</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentsPreferencesImpl extends AbstractPreferencesImpl implements ComponentsPreferences {
	/**
	 * The default value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected static final String SYSTEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSystemName() <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemName()
	 * @generated
	 * @ordered
	 */
	protected String systemName = SYSTEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberMaster() <em>Number Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMaster()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_MASTER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberMaster() <em>Number Master</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberMaster()
	 * @generated
	 * @ordered
	 */
	protected int numberMaster = NUMBER_MASTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberSlave() <em>Number Slave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSlave()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_SLAVE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberSlave() <em>Number Slave</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberSlave()
	 * @generated
	 * @ordered
	 */
	protected int numberSlave = NUMBER_SLAVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberComponent() <em>Number Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberComponent()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_COMPONENT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberComponent() <em>Number Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberComponent()
	 * @generated
	 * @ordered
	 */
	protected int numberComponent = NUMBER_COMPONENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected static final float CLOCK_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected float clock = CLOCK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentsPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.COMPONENTS_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSystemName() {
		return systemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSystemName(String newSystemName) {
		String oldSystemName = systemName;
		systemName = newSystemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME, oldSystemName, systemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberMaster() {
		return numberMaster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberMaster(int newNumberMaster) {
		int oldNumberMaster = numberMaster;
		numberMaster = newNumberMaster;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER, oldNumberMaster, numberMaster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberSlave() {
		return numberSlave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberSlave(int newNumberSlave) {
		int oldNumberSlave = numberSlave;
		numberSlave = newNumberSlave;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE, oldNumberSlave, numberSlave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNumberComponent() {
		return numberComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNumberComponent(int newNumberComponent) {
		int oldNumberComponent = numberComponent;
		numberComponent = newNumberComponent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT, oldNumberComponent, numberComponent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public float getClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClock(float newClock) {
		float oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK,
					oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME:
			return getSystemName();
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER:
			return getNumberMaster();
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE:
			return getNumberSlave();
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT:
			return getNumberComponent();
		case PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK:
			return getClock();
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
		case PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME:
			setSystemName((String) newValue);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER:
			setNumberMaster((Integer) newValue);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE:
			setNumberSlave((Integer) newValue);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT:
			setNumberComponent((Integer) newValue);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK:
			setClock((Float) newValue);
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
		case PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME:
			setSystemName(SYSTEM_NAME_EDEFAULT);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER:
			setNumberMaster(NUMBER_MASTER_EDEFAULT);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE:
			setNumberSlave(NUMBER_SLAVE_EDEFAULT);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT:
			setNumberComponent(NUMBER_COMPONENT_EDEFAULT);
			return;
		case PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK:
			setClock(CLOCK_EDEFAULT);
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
		case PreferencesPackage.COMPONENTS_PREFERENCES__SYSTEM_NAME:
			return SYSTEM_NAME_EDEFAULT == null ? systemName != null : !SYSTEM_NAME_EDEFAULT.equals(systemName);
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_MASTER:
			return numberMaster != NUMBER_MASTER_EDEFAULT;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_SLAVE:
			return numberSlave != NUMBER_SLAVE_EDEFAULT;
		case PreferencesPackage.COMPONENTS_PREFERENCES__NUMBER_COMPONENT:
			return numberComponent != NUMBER_COMPONENT_EDEFAULT;
		case PreferencesPackage.COMPONENTS_PREFERENCES__CLOCK:
			return clock != CLOCK_EDEFAULT;
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
		result.append(" (systemName: ");
		result.append(systemName);
		result.append(", numberMaster: ");
		result.append(numberMaster);
		result.append(", numberSlave: ");
		result.append(numberSlave);
		result.append(", numberComponent: ");
		result.append(numberComponent);
		result.append(", clock: ");
		result.append(clock);
		result.append(')');
		return result.toString();
	}

} //ComponentsPreferencesImpl
