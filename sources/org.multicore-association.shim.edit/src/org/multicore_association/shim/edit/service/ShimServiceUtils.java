/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.service;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecp.view.spi.context.ViewModelService;
import org.eclipse.emf.ecp.view.spi.context.ViewModelServiceProvider;

public class ShimServiceUtils {

	private ShimServiceUtils() {
	}

	public static ViewModelService[] getViewModelServices() {
		return new ViewModelService[] {
				new ShimReferenceService(),
				new ShimValidationInjectService(),
		};
	}

	public static ViewModelServiceProvider getViewModelServiceProvider() {
		List<ViewModelService> list = Arrays.asList(getViewModelServices());

		return (x, y) -> list;
	}
}