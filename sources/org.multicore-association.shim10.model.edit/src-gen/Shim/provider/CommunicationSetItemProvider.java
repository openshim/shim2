/**
 */
package Shim.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim10.model.shim10.CommunicationSet} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationSetItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSetItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__EVENT_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__FIFO_COMMUNICATION);
			childrenFeatures.add(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__INTERRUPT_COMMUNICATION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns CommunicationSet.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationSet"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_CommunicationSet_type");
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

		switch (notification.getFeatureID(org.multicore_association.shim10.model.shim10.CommunicationSet.class)) {
			case org.multicore_association.shim10.model.shim10.ShimPackage.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.COMMUNICATION_SET__EVENT_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.COMMUNICATION_SET__FIFO_COMMUNICATION:
			case org.multicore_association.shim10.model.shim10.ShimPackage.COMMUNICATION_SET__INTERRUPT_COMMUNICATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__SHARED_REGISTER_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedRegisterCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__SHARED_MEMORY_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createSharedMemoryCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__EVENT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createEventCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__FIFO_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createFIFOCommunication()));

		newChildDescriptors.add
			(createChildParameter
				(org.multicore_association.shim10.model.shim10.ShimPackage.Literals.COMMUNICATION_SET__INTERRUPT_COMMUNICATION,
				 org.multicore_association.shim10.model.shim10.ShimFactory.eINSTANCE.createInterruptCommunication()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return Shim10EditPlugin.INSTANCE;
	}

}
