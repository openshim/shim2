/**
 */
package org.multicore_association.shim.edit.model.app.preferences.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences;
import org.multicore_association.shim.edit.model.app.preferences.PreferencesPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.preferences.CommunicationSetPreferences} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationSetPreferencesItemProvider extends AbstractPreferencesItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSetPreferencesItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addCheckInterruptCommunicationPropertyDescriptor(object);
			addCheckEventCommunicationPropertyDescriptor(object);
			addCheckFIFOCommunicationPropertyDescriptor(object);
			addFifoDataSizePropertyDescriptor(object);
			addFifoDataSizeUnitPropertyDescriptor(object);
			addQueueSizePropertyDescriptor(object);
			addCheckSharedMemoryCommunicationPropertyDescriptor(object);
			addSharedMemoryDataSizePropertyDescriptor(object);
			addSharedMemoryDataSizeUnitPropertyDescriptor(object);
			addOperationTypePropertyDescriptor(object);
			addCheckSharedRegisterCommunicationPropertyDescriptor(object);
			addSharedRegisterDataSizePropertyDescriptor(object);
			addSharedRegisterDataSizeUnitPropertyDescriptor(object);
			addNRegisterPropertyDescriptor(object);
			addDontConnectPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Check Interrupt Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckInterruptCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_checkInterruptCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_checkInterruptCommunication_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION, true, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check Event Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckEventCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_checkEventCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_checkEventCommunication_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION, true, false,
				false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check FIFO Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckFIFOCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_checkFIFOCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_checkFIFOCommunication_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fifo Data Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFifoDataSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_fifoDataSize_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetPreferences_fifoDataSize_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fifo Data Size Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFifoDataSizeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationSetPreferences_fifoDataSizeUnit_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CommunicationSetPreferences_fifoDataSizeUnit_feature",
								"_UI_CommunicationSetPreferences_type"),
						PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Queue Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQueueSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_queueSize_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetPreferences_queueSize_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check Shared Memory Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckSharedMemoryCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_checkSharedMemoryCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_checkSharedMemoryCommunication_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION, true,
				false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Shared Memory Data Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedMemoryDataSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationSetPreferences_sharedMemoryDataSize_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CommunicationSetPreferences_sharedMemoryDataSize_feature",
								"_UI_CommunicationSetPreferences_type"),
						PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE, true, false,
						false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Shared Memory Data Size Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedMemoryDataSizeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_sharedMemoryDataSizeUnit_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_sharedMemoryDataSizeUnit_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_operationType_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetPreferences_operationType_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Check Shared Register Communication feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheckSharedRegisterCommunicationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_checkSharedRegisterCommunication_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_checkSharedRegisterCommunication_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION, true,
				false, false, ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Shared Register Data Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedRegisterDataSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_sharedRegisterDataSize_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_sharedRegisterDataSize_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE, true, false,
				false, ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Shared Register Data Size Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSharedRegisterDataSizeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_sharedRegisterDataSizeUnit_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetPreferences_sharedRegisterDataSizeUnit_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT, true, false,
				false, ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the NRegister feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNRegisterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_nRegister_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetPreferences_nRegister_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__NREGISTER, true, false, false,
				ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Dont Connect feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDontConnectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetPreferences_dontConnect_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetPreferences_dontConnect_feature",
						"_UI_CommunicationSetPreferences_type"),
				PreferencesPackage.Literals.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This returns CommunicationSetPreferences.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationSetPreferences"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		CommunicationSetPreferences communicationSetPreferences = (CommunicationSetPreferences) object;
		return getString("_UI_CommunicationSetPreferences_type") + " "
				+ communicationSetPreferences.isCheckInterruptCommunication();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CommunicationSetPreferences.class)) {
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_INTERRUPT_COMMUNICATION:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_EVENT_COMMUNICATION:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_FIFO_COMMUNICATION:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__FIFO_DATA_SIZE_UNIT:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__QUEUE_SIZE:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_MEMORY_COMMUNICATION:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_MEMORY_DATA_SIZE_UNIT:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__OPERATION_TYPE:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__CHECK_SHARED_REGISTER_COMMUNICATION:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__SHARED_REGISTER_DATA_SIZE_UNIT:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__NREGISTER:
		case PreferencesPackage.COMMUNICATION_SET_PREFERENCES__DONT_CONNECT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

}
