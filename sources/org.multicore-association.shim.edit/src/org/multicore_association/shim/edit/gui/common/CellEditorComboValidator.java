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
 * A delegate for handling validation for ComboBox.
 */
public class CellEditorComboValidator implements ICellEditorValidator {

	protected String propertyName = "";

	/**
	 * Constructs a new instance of CellEditorComboValidator.
	 * 
	 * @param propertyName
	 *            the property name to be validated
	 */
	public CellEditorComboValidator(String propertyName) {
		this.propertyName = propertyName;
	}

	/**
	 * @see org.eclipse.jface.viewers.ICellEditorValidator#isValid(java.lang.Object)
	 */
	@Override
	public String isValid(Object value) {
		if (value == null) {
			return "";
		}
		
		int intValue = (Integer) value;
		String result = "";
		if (intValue < 0) {
			result = "Please select a value from the combo in the "
					+ StringUtils.capitalize(propertyName) + ".";
		}
		return result;
	}
}
