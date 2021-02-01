/**
 */
package Shim.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim10.model.shim10.SharedMemoryCommunication} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SharedMemoryCommunicationItemProvider extends AbstractCommunicationItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharedMemoryCommunicationItemProvider(AdapterFactory adapterFactory) {
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

			addDataSizePropertyDescriptor(object);
			addDataSizeUnitPropertyDescriptor(object);
			addOperationTypePropertyDescriptor(object);
			addAddressSpaceRefPropertyDescriptor(object);
			addSubSpaceRefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Address Space Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressSpaceRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SharedMemoryCommunication_addressSpaceRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SharedMemoryCommunication_addressSpaceRef_feature", "_UI_SharedMemoryCommunication_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Size feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSizePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SharedMemoryCommunication_dataSize_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SharedMemoryCommunication_dataSize_feature", "_UI_SharedMemoryCommunication_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION__DATA_SIZE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Data Size Unit feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDataSizeUnitPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SharedMemoryCommunication_dataSizeUnit_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SharedMemoryCommunication_dataSizeUnit_feature", "_UI_SharedMemoryCommunication_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Operation Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOperationTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SharedMemoryCommunication_operationType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SharedMemoryCommunication_operationType_feature", "_UI_SharedMemoryCommunication_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Sub Space Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSpaceRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SharedMemoryCommunication_subSpaceRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SharedMemoryCommunication_subSpaceRef_feature", "_UI_SharedMemoryCommunication_type"),
				 org.multicore_association.shim10.model.shim10.ShimPackage.Literals.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns SharedMemoryCommunication.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SharedMemoryCommunication"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((org.multicore_association.shim10.model.shim10.SharedMemoryCommunication)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SharedMemoryCommunication_type") :
			getString("_UI_SharedMemoryCommunication_type") + " " + label;
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

		switch (notification.getFeatureID(org.multicore_association.shim10.model.shim10.SharedMemoryCommunication.class)) {
			case org.multicore_association.shim10.model.shim10.ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SHARED_MEMORY_COMMUNICATION__DATA_SIZE_UNIT:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SHARED_MEMORY_COMMUNICATION__OPERATION_TYPE:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SHARED_MEMORY_COMMUNICATION__ADDRESS_SPACE_REF:
			case org.multicore_association.shim10.model.shim10.ShimPackage.SHARED_MEMORY_COMMUNICATION__SUB_SPACE_REF:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
