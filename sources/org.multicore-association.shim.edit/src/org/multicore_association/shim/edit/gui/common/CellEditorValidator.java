/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.common;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.jface.viewers.ICellEditorValidator;

/**
 * A delegate for handling validation for required value.
 */
public class CellEditorValidator implements ICellEditorValidator {

	protected String propertyName = "";
	protected boolean isRequired = false;
	
	/**
	 * Constructs a new instance of CellEditorValidator.
	 * 
	 * @param propertyName
	 *            the property name to be validated
	 * @param isRequired
	 *            whether the property is required to be non-null value or not
	 */
	public CellEditorValidator(String propertyName, boolean isRequired){
		this.propertyName = propertyName;
		this.isRequired = isRequired;
	}

	/**
	 * @see org.eclipse.jface.viewers.ICellEditorValidator#isValid(java.lang.Object)
	 */
	@Override
	public String isValid(Object value) {
		String valueStr = (String) value;
		String result = "";
		if (isRequired) {
			if (valueStr == null ||  valueStr.length() == 0){
				result = StringUtils.capitalize(propertyName) + " is required.";
			}
		}
		return result;
	}
}
