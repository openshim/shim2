/**
 */
package org.multicore_association.shim.edit.model.app.preferences.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.multicore_association.shim.edit.model.app.preferences.AccessTypePreferences;
import org.multicore_association.shim.edit.model.app.preferences.AddressSpacePreferences;
import org.multicore_association.shim.edit.model.app.preferences.CacheDataPreferences;
import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ComponentsPreferences;
import org.multicore_association.shim.edit.model.app.preferences.LatencyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.MasterComponentPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PitchPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;
import org.multicore_association.shim.edit.model.app.preferences.SavePolicyPreferences;
import org.multicore_association.shim.edit.model.app.preferences.ShimPreferences;
import org.multicore_association.shim.edit.model.app.preferences.SlaveComponentPreferences;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shim Preferences</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getComponentsPreferences <em>Components Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getMasterComponentPreferences <em>Master Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getSlaveComponentPreferences <em>Slave Component Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getComponentSetPreferences <em>Component Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getAddressSpacePreferences <em>Address Space Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getCommunicationSetPreferences <em>Communication Set Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getCacheDataPreferences <em>Cache Data Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getAccessTypePreferences <em>Access Type Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getLatencyPreferences <em>Latency Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getPitchPreferences <em>Pitch Preferences</em>}</li>
 *   <li>{@link org.multicore_association.shim.edit.model.app.preferences.impl.ShimPreferencesImpl#getSavePolicyPreferences <em>Save Policy Preferences</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShimPreferencesImpl extends AbstractPreferencesImpl implements ShimPreferences {
	/**
	 * The cached value of the '{@link #getComponentsPreferences() <em>Components Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentsPreferences()
	 * @generated
	 * @ordered
	 */
	protected ComponentsPreferences componentsPreferences;

	/**
	 * The cached value of the '{@link #getMasterComponentPreferences() <em>Master Component Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMasterComponentPreferences()
	 * @generated
	 * @ordered
	 */
	protected MasterComponentPreferences masterComponentPreferences;

	/**
	 * The cached value of the '{@link #getSlaveComponentPreferences() <em>Slave Component Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSlaveComponentPreferences()
	 * @generated
	 * @ordered
	 */
	protected SlaveComponentPreferences slaveComponentPreferences;

	/**
	 * The cached value of the '{@link #getComponentSetPreferences() <em>Component Set Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponentSetPreferences()
	 * @generated
	 * @ordered
	 */
	protected ComponentSetPreferences componentSetPreferences;

	/**
	 * The cached value of the '{@link #getAddressSpacePreferences() <em>Address Space Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressSpacePreferences()
	 * @generated
	 * @ordered
	 */
	protected AddressSpacePreferences addressSpacePreferences;

	/**
	 * The cached value of the '{@link #getCommunicationSetPreferences() <em>Communication Set Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunicationSetPreferences()
	 * @generated
	 * @ordered
	 */
	protected CommunicationSetPreferences communicationSetPreferences;

	/**
	 * The cached value of the '{@link #getCacheDataPreferences() <em>Cache Data Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCacheDataPreferences()
	 * @generated
	 * @ordered
	 */
	protected CacheDataPreferences cacheDataPreferences;

	/**
	 * The cached value of the '{@link #getAccessTypePreferences() <em>Access Type Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessTypePreferences()
	 * @generated
	 * @ordered
	 */
	protected AccessTypePreferences accessTypePreferences;

	/**
	 * The cached value of the '{@link #getLatencyPreferences() <em>Latency Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatencyPreferences()
	 * @generated
	 * @ordered
	 */
	protected LatencyPreferences latencyPreferences;

	/**
	 * The cached value of the '{@link #getPitchPreferences() <em>Pitch Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPitchPreferences()
	 * @generated
	 * @ordered
	 */
	protected PitchPreferences pitchPreferences;

	/**
	 * The cached value of the '{@link #getSavePolicyPreferences() <em>Save Policy Preferences</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSavePolicyPreferences()
	 * @generated
	 * @ordered
	 */
	protected SavePolicyPreferences savePolicyPreferences;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ShimPreferencesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PreferencesPackage.Literals.SHIM_PREFERENCES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentsPreferences getComponentsPreferences() {
		return componentsPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentsPreferences(ComponentsPreferences newComponentsPreferences,
			NotificationChain msgs) {
		ComponentsPreferences oldComponentsPreferences = componentsPreferences;
		componentsPreferences = newComponentsPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES, oldComponentsPreferences,
					newComponentsPreferences);
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
	@Override
	public void setComponentsPreferences(ComponentsPreferences newComponentsPreferences) {
		if (newComponentsPreferences != componentsPreferences) {
			NotificationChain msgs = null;
			if (componentsPreferences != null)
				msgs = ((InternalEObject) componentsPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES, null,
						msgs);
			if (newComponentsPreferences != null)
				msgs = ((InternalEObject) newComponentsPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES, null,
						msgs);
			msgs = basicSetComponentsPreferences(newComponentsPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES, newComponentsPreferences,
					newComponentsPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MasterComponentPreferences getMasterComponentPreferences() {
		return masterComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMasterComponentPreferences(
			MasterComponentPreferences newMasterComponentPreferences, NotificationChain msgs) {
		MasterComponentPreferences oldMasterComponentPreferences = masterComponentPreferences;
		masterComponentPreferences = newMasterComponentPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES, oldMasterComponentPreferences,
					newMasterComponentPreferences);
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
	@Override
	public void setMasterComponentPreferences(MasterComponentPreferences newMasterComponentPreferences) {
		if (newMasterComponentPreferences != masterComponentPreferences) {
			NotificationChain msgs = null;
			if (masterComponentPreferences != null)
				msgs = ((InternalEObject) masterComponentPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES,
						null, msgs);
			if (newMasterComponentPreferences != null)
				msgs = ((InternalEObject) newMasterComponentPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES,
						null, msgs);
			msgs = basicSetMasterComponentPreferences(newMasterComponentPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES, newMasterComponentPreferences,
					newMasterComponentPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SlaveComponentPreferences getSlaveComponentPreferences() {
		return slaveComponentPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSlaveComponentPreferences(SlaveComponentPreferences newSlaveComponentPreferences,
			NotificationChain msgs) {
		SlaveComponentPreferences oldSlaveComponentPreferences = slaveComponentPreferences;
		slaveComponentPreferences = newSlaveComponentPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES, oldSlaveComponentPreferences,
					newSlaveComponentPreferences);
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
	@Override
	public void setSlaveComponentPreferences(SlaveComponentPreferences newSlaveComponentPreferences) {
		if (newSlaveComponentPreferences != slaveComponentPreferences) {
			NotificationChain msgs = null;
			if (slaveComponentPreferences != null)
				msgs = ((InternalEObject) slaveComponentPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES, null,
						msgs);
			if (newSlaveComponentPreferences != null)
				msgs = ((InternalEObject) newSlaveComponentPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES, null,
						msgs);
			msgs = basicSetSlaveComponentPreferences(newSlaveComponentPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES, newSlaveComponentPreferences,
					newSlaveComponentPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComponentSetPreferences getComponentSetPreferences() {
		return componentSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetComponentSetPreferences(ComponentSetPreferences newComponentSetPreferences,
			NotificationChain msgs) {
		ComponentSetPreferences oldComponentSetPreferences = componentSetPreferences;
		componentSetPreferences = newComponentSetPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES, oldComponentSetPreferences,
					newComponentSetPreferences);
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
	@Override
	public void setComponentSetPreferences(ComponentSetPreferences newComponentSetPreferences) {
		if (newComponentSetPreferences != componentSetPreferences) {
			NotificationChain msgs = null;
			if (componentSetPreferences != null)
				msgs = ((InternalEObject) componentSetPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES, null,
						msgs);
			if (newComponentSetPreferences != null)
				msgs = ((InternalEObject) newComponentSetPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES, null,
						msgs);
			msgs = basicSetComponentSetPreferences(newComponentSetPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES, newComponentSetPreferences,
					newComponentSetPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AddressSpacePreferences getAddressSpacePreferences() {
		return addressSpacePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressSpacePreferences(AddressSpacePreferences newAddressSpacePreferences,
			NotificationChain msgs) {
		AddressSpacePreferences oldAddressSpacePreferences = addressSpacePreferences;
		addressSpacePreferences = newAddressSpacePreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES, oldAddressSpacePreferences,
					newAddressSpacePreferences);
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
	@Override
	public void setAddressSpacePreferences(AddressSpacePreferences newAddressSpacePreferences) {
		if (newAddressSpacePreferences != addressSpacePreferences) {
			NotificationChain msgs = null;
			if (addressSpacePreferences != null)
				msgs = ((InternalEObject) addressSpacePreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES, null,
						msgs);
			if (newAddressSpacePreferences != null)
				msgs = ((InternalEObject) newAddressSpacePreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES, null,
						msgs);
			msgs = basicSetAddressSpacePreferences(newAddressSpacePreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES, newAddressSpacePreferences,
					newAddressSpacePreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationSetPreferences getCommunicationSetPreferences() {
		return communicationSetPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommunicationSetPreferences(
			CommunicationSetPreferences newCommunicationSetPreferences, NotificationChain msgs) {
		CommunicationSetPreferences oldCommunicationSetPreferences = communicationSetPreferences;
		communicationSetPreferences = newCommunicationSetPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES, oldCommunicationSetPreferences,
					newCommunicationSetPreferences);
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
	@Override
	public void setCommunicationSetPreferences(CommunicationSetPreferences newCommunicationSetPreferences) {
		if (newCommunicationSetPreferences != communicationSetPreferences) {
			NotificationChain msgs = null;
			if (communicationSetPreferences != null)
				msgs = ((InternalEObject) communicationSetPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES,
						null, msgs);
			if (newCommunicationSetPreferences != null)
				msgs = ((InternalEObject) newCommunicationSetPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES,
						null, msgs);
			msgs = basicSetCommunicationSetPreferences(newCommunicationSetPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES, newCommunicationSetPreferences,
					newCommunicationSetPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CacheDataPreferences getCacheDataPreferences() {
		return cacheDataPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCacheDataPreferences(CacheDataPreferences newCacheDataPreferences,
			NotificationChain msgs) {
		CacheDataPreferences oldCacheDataPreferences = cacheDataPreferences;
		cacheDataPreferences = newCacheDataPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES, oldCacheDataPreferences,
					newCacheDataPreferences);
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
	@Override
	public void setCacheDataPreferences(CacheDataPreferences newCacheDataPreferences) {
		if (newCacheDataPreferences != cacheDataPreferences) {
			NotificationChain msgs = null;
			if (cacheDataPreferences != null)
				msgs = ((InternalEObject) cacheDataPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES, null,
						msgs);
			if (newCacheDataPreferences != null)
				msgs = ((InternalEObject) newCacheDataPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES, null,
						msgs);
			msgs = basicSetCacheDataPreferences(newCacheDataPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES, newCacheDataPreferences,
					newCacheDataPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AccessTypePreferences getAccessTypePreferences() {
		return accessTypePreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessTypePreferences(AccessTypePreferences newAccessTypePreferences,
			NotificationChain msgs) {
		AccessTypePreferences oldAccessTypePreferences = accessTypePreferences;
		accessTypePreferences = newAccessTypePreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES, oldAccessTypePreferences,
					newAccessTypePreferences);
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
	@Override
	public void setAccessTypePreferences(AccessTypePreferences newAccessTypePreferences) {
		if (newAccessTypePreferences != accessTypePreferences) {
			NotificationChain msgs = null;
			if (accessTypePreferences != null)
				msgs = ((InternalEObject) accessTypePreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES, null,
						msgs);
			if (newAccessTypePreferences != null)
				msgs = ((InternalEObject) newAccessTypePreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES, null,
						msgs);
			msgs = basicSetAccessTypePreferences(newAccessTypePreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES, newAccessTypePreferences,
					newAccessTypePreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LatencyPreferences getLatencyPreferences() {
		return latencyPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatencyPreferences(LatencyPreferences newLatencyPreferences,
			NotificationChain msgs) {
		LatencyPreferences oldLatencyPreferences = latencyPreferences;
		latencyPreferences = newLatencyPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES, oldLatencyPreferences,
					newLatencyPreferences);
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
	@Override
	public void setLatencyPreferences(LatencyPreferences newLatencyPreferences) {
		if (newLatencyPreferences != latencyPreferences) {
			NotificationChain msgs = null;
			if (latencyPreferences != null)
				msgs = ((InternalEObject) latencyPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES, null, msgs);
			if (newLatencyPreferences != null)
				msgs = ((InternalEObject) newLatencyPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES, null, msgs);
			msgs = basicSetLatencyPreferences(newLatencyPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES, newLatencyPreferences,
					newLatencyPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PitchPreferences getPitchPreferences() {
		return pitchPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPitchPreferences(PitchPreferences newPitchPreferences, NotificationChain msgs) {
		PitchPreferences oldPitchPreferences = pitchPreferences;
		pitchPreferences = newPitchPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES, oldPitchPreferences, newPitchPreferences);
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
	@Override
	public void setPitchPreferences(PitchPreferences newPitchPreferences) {
		if (newPitchPreferences != pitchPreferences) {
			NotificationChain msgs = null;
			if (pitchPreferences != null)
				msgs = ((InternalEObject) pitchPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES, null, msgs);
			if (newPitchPreferences != null)
				msgs = ((InternalEObject) newPitchPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES, null, msgs);
			msgs = basicSetPitchPreferences(newPitchPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES, newPitchPreferences, newPitchPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SavePolicyPreferences getSavePolicyPreferences() {
		return savePolicyPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSavePolicyPreferences(SavePolicyPreferences newSavePolicyPreferences,
			NotificationChain msgs) {
		SavePolicyPreferences oldSavePolicyPreferences = savePolicyPreferences;
		savePolicyPreferences = newSavePolicyPreferences;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES, oldSavePolicyPreferences,
					newSavePolicyPreferences);
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
	@Override
	public void setSavePolicyPreferences(SavePolicyPreferences newSavePolicyPreferences) {
		if (newSavePolicyPreferences != savePolicyPreferences) {
			NotificationChain msgs = null;
			if (savePolicyPreferences != null)
				msgs = ((InternalEObject) savePolicyPreferences).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES, null,
						msgs);
			if (newSavePolicyPreferences != null)
				msgs = ((InternalEObject) newSavePolicyPreferences).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES, null,
						msgs);
			msgs = basicSetSavePolicyPreferences(newSavePolicyPreferences, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES, newSavePolicyPreferences,
					newSavePolicyPreferences));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
			return basicSetComponentsPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
			return basicSetMasterComponentPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
			return basicSetSlaveComponentPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
			return basicSetComponentSetPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
			return basicSetAddressSpacePreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
			return basicSetCommunicationSetPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
			return basicSetCacheDataPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
			return basicSetAccessTypePreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
			return basicSetLatencyPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
			return basicSetPitchPreferences(null, msgs);
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			return basicSetSavePolicyPreferences(null, msgs);
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
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
			return getComponentsPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
			return getMasterComponentPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
			return getSlaveComponentPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
			return getComponentSetPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
			return getAddressSpacePreferences();
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
			return getCommunicationSetPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
			return getCacheDataPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
			return getAccessTypePreferences();
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
			return getLatencyPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
			return getPitchPreferences();
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			return getSavePolicyPreferences();
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
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
			setComponentsPreferences((ComponentsPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
			setMasterComponentPreferences((MasterComponentPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
			setSlaveComponentPreferences((SlaveComponentPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
			setComponentSetPreferences((ComponentSetPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
			setAddressSpacePreferences((AddressSpacePreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
			setCommunicationSetPreferences((CommunicationSetPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
			setCacheDataPreferences((CacheDataPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
			setAccessTypePreferences((AccessTypePreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
			setLatencyPreferences((LatencyPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
			setPitchPreferences((PitchPreferences) newValue);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			setSavePolicyPreferences((SavePolicyPreferences) newValue);
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
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
			setComponentsPreferences((ComponentsPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
			setMasterComponentPreferences((MasterComponentPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
			setSlaveComponentPreferences((SlaveComponentPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
			setComponentSetPreferences((ComponentSetPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
			setAddressSpacePreferences((AddressSpacePreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
			setCommunicationSetPreferences((CommunicationSetPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
			setCacheDataPreferences((CacheDataPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
			setAccessTypePreferences((AccessTypePreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
			setLatencyPreferences((LatencyPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
			setPitchPreferences((PitchPreferences) null);
			return;
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			setSavePolicyPreferences((SavePolicyPreferences) null);
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
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENTS_PREFERENCES:
			return componentsPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__MASTER_COMPONENT_PREFERENCES:
			return masterComponentPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__SLAVE_COMPONENT_PREFERENCES:
			return slaveComponentPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__COMPONENT_SET_PREFERENCES:
			return componentSetPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__ADDRESS_SPACE_PREFERENCES:
			return addressSpacePreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__COMMUNICATION_SET_PREFERENCES:
			return communicationSetPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__CACHE_DATA_PREFERENCES:
			return cacheDataPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__ACCESS_TYPE_PREFERENCES:
			return accessTypePreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__LATENCY_PREFERENCES:
			return latencyPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__PITCH_PREFERENCES:
			return pitchPreferences != null;
		case PreferencesPackage.SHIM_PREFERENCES__SAVE_POLICY_PREFERENCES:
			return savePolicyPreferences != null;
		}
		return super.eIsSet(featureID);
	}

} //ShimPreferencesImpl
