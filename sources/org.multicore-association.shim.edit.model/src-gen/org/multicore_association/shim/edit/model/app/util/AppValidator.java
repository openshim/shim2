/**
 */
package org.multicore_association.shim.edit.model.app.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;

import org.multicore_association.shim.edit.model.app.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.multicore_association.shim.edit.model.app.AppPackage
 * @generated
 */
public class AppValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AppValidator INSTANCE = new AppValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.multicore_association.shim.edit.model.app";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return AppPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case AppPackage.ABSTRACT_WIZARD_PAGE_DATA:
			return validateAbstractWizardPageData((AbstractWizardPageData) value, diagnostics, context);
		case AppPackage.ACCESS_TYPE_WIZARD_PAGE_DATA:
			return validateAccessTypeWizardPageData((AccessTypeWizardPageData) value, diagnostics, context);
		case AppPackage.ADDRESS_SPACE_PARAMETER_WIZARD_PAGE_DATA:
			return validateAddressSpaceParameterWizardPageData((AddressSpaceParameterWizardPageData) value, diagnostics,
					context);
		case AppPackage.CACHE_WIZARD_PAGE_DATA:
			return validateCacheWizardPageData((CacheWizardPageData) value, diagnostics, context);
		case AppPackage.COMMUNICATION_SET_WIZARD_PAGE_DATA:
			return validateCommunicationSetWizardPageData((CommunicationSetWizardPageData) value, diagnostics, context);
		case AppPackage.COMPONENT_PARAMETER_WIZARD_PAGE_DATA:
			return validateComponentParameterWizardPageData((ComponentParameterWizardPageData) value, diagnostics,
					context);
		case AppPackage.BYTE_SIZE_LIST_TYPE:
			return validateByteSizeListType((String) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractWizardPageData(AbstractWizardPageData abstractWizardPageData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessTypeWizardPageData(AccessTypeWizardPageData accessTypeWizardPageData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(accessTypeWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressSpaceParameterWizardPageData(
			AddressSpaceParameterWizardPageData addressSpaceParameterWizardPageData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressSpaceParameterWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCacheWizardPageData(CacheWizardPageData cacheWizardPageData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cacheWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommunicationSetWizardPageData(CommunicationSetWizardPageData communicationSetWizardPageData,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(communicationSetWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentParameterWizardPageData(
			ComponentParameterWizardPageData componentParameterWizardPageData, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(componentParameterWizardPageData, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteSizeListType(String byteSizeListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		boolean result = validateByteSizeListType_Pattern(byteSizeListType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateByteSizeListType_Pattern
	 */
	public static final PatternMatcher[][] BYTE_SIZE_LIST_TYPE__PATTERN__VALUES = new PatternMatcher[][] {
			new PatternMatcher[] { XMLTypeUtil.createPatternMatcher("(\\d+(,\\d+)*)?") } };

	/**
	 * Validates the Pattern constraint of '<em>Byte Size List Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateByteSizeListType_Pattern(String byteSizeListType, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validatePattern(AppPackage.Literals.BYTE_SIZE_LIST_TYPE, byteSizeListType,
				BYTE_SIZE_LIST_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AppValidator
