/**
 */
package org.multicore_association.shim.edit.model.app.provider;

import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

import org.multicore_association.shim.edit.model.app.AppPackage;

/**
 * This is the item provider adapter for a {@link org.multicore_association.shim.edit.model.app.CommunicationSetWizardPageData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CommunicationSetWizardPageDataItemProvider extends AbstractWizardPageDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationSetWizardPageDataItemProvider(AdapterFactory adapterFactory) {
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

			addCommunicationSetPreferencesPropertyDescriptor(object);
			addAddressSpacePropertyDescriptor(object);
			addSubSpacePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Communication Set Preferences feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommunicationSetPreferencesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetWizardPageData_communicationSetPreferences_feature"),
				getString("_UI_PropertyDescriptor_description",
						"_UI_CommunicationSetWizardPageData_communicationSetPreferences_feature",
						"_UI_CommunicationSetWizardPageData_type"),
				AppPackage.Literals.COMMUNICATION_SET_WIZARD_PAGE_DATA__COMMUNICATION_SET_PREFERENCES, true, false,
				true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Address Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAddressSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_CommunicationSetWizardPageData_addressSpace_feature"),
						getString("_UI_PropertyDescriptor_description",
								"_UI_CommunicationSetWizardPageData_addressSpace_feature",
								"_UI_CommunicationSetWizardPageData_type"),
						AppPackage.Literals.COMMUNICATION_SET_WIZARD_PAGE_DATA__ADDRESS_SPACE, true, false, true, null,
						null, null));
	}

	/**
	 * This adds a property descriptor for the Sub Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSubSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_CommunicationSetWizardPageData_subSpace_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_CommunicationSetWizardPageData_subSpace_feature",
						"_UI_CommunicationSetWizardPageData_type"),
				AppPackage.Literals.COMMUNICATION_SET_WIZARD_PAGE_DATA__SUB_SPACE, true, false, true, null, null,
				null));
	}

	/**
	 * This returns CommunicationSetWizardPageData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CommunicationSetWizardPageData"));
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
		return getString("_UI_CommunicationSetWizardPageData_type");
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
	}

}
