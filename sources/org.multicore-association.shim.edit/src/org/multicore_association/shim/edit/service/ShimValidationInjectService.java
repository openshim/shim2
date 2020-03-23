/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.service;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecp.view.spi.context.ViewModelContext;
import org.eclipse.emf.ecp.view.spi.context.ViewModelService;
import org.eclipse.emf.ecp.view.spi.validation.ValidationProvider;
import org.eclipse.emf.ecp.view.spi.validation.ValidationService;
import org.multicore_association.shim.edit.validator.AddressRangeAttributeValidationProvider;
import org.multicore_association.shim.edit.validator.AddressSpaceReferenceValidationProvider;
import org.multicore_association.shim.edit.validator.MasterComponentReferenceValidationProvider;
import org.multicore_association.shim.edit.validator.NameAttributeValidationProvider;

public class ShimValidationInjectService implements ViewModelService {

	private static List<ValidationProvider> validationProviders;
	static {
		validationProviders = Arrays.asList(
				new AddressRangeAttributeValidationProvider(),
				new AddressSpaceReferenceValidationProvider(),
				new MasterComponentReferenceValidationProvider(),
				new NameAttributeValidationProvider());
	}

	private ValidationService validationService;

	@Override
	public void instantiate(ViewModelContext context) {
		validationService = context.getService(ValidationService.class);

		if (validationService != null) {
			validationProviders.forEach(validationService::addValidationProvider);
		}
	}

	@Override
	public void dispose() {
		if (validationService != null) {
			validationProviders.forEach(validationService::removeValidationProvider);
		}
	}

	@Override
	public int getPriority() {
		return 10;
	}
}