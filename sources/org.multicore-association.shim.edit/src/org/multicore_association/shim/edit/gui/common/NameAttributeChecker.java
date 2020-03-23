/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.common;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.edit.validator.NameAttributeValidationProvider;

/**
 * A delegate for handling validation for "name" attribute.
 */
public class NameAttributeChecker {

	private Collection<EObject> objects;

	/**
	 * @param objectList
	 *            Specify the objects you want to compare.
	 * @param objectList
	 */
	public NameAttributeChecker(Collection<EObject> objectList) {
		this.objects = objectList;
	}

	/**
	 * Check the uniqueness without changing the value.
	 * 
	 * @param targetObject
	 * @return Error message. If there is no error, this method return null.
	 */
	public String checkNameList(EObject targetObject, String value) {

		List<Diagnostic> diagnostics = ShimUtils.getNameAttribute(targetObject)
				.map(attribute -> NameAttributeValidationProvider.validate(targetObject, attribute, value, objects))
				.orElse(Collections.emptyList());

		if (diagnostics.isEmpty()) {
			return null;
		}

		return diagnostics.get(0).getMessage();
	}
}
