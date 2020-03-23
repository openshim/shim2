/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model.search;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat.ColumnType;
import org.multicore_association.shim.edit.model.ReflectionUtils;
import org.multicore_association.shim.edit.model.ShimUtils;

/**
 * A search result.
 */
public class ShimSearchResult {

	private String type;

	private String name;

	private EObject data;

	private EStructuralFeature matchFeature;

	private Object propertyValue;

	private ShimObjectColumnFormat format;

	private String valueStr;

	private String parentName;

	/**
	 * Constructs a new instance of ShimSearchResult.
	 * 
	 * @param data
	 *            the hit data
	 * @param matchFeature
	 *            the feature of the data which matches search text
	 * @param parentName
	 *            the parent name
	 */
	public ShimSearchResult(EObject data, EStructuralFeature matchFeature, String parentName) {
		this.data = data;
		this.matchFeature = matchFeature;
		this.parentName = parentName;

		this.propertyValue = data.eGet(matchFeature);
		this.format = PropertyCompareUtil.getColumnFormat(matchFeature);
	}

	/**
	 * Returns the type of SHIM API.
	 * 
	 * @return the type of SHIM API
	 */
	public String getType() {
		if (type == null) {
			type = data.eClass().getName();
		}
		return type;
	}

	/**
	 * Returns the 'name' field value of data.
	 * 
	 * @return the 'name' field value of data
	 */
	public String getName() {
		if (name == null) {
			String _name = ShimUtils.getName(data);
			if (_name == null) {
				name = "-";
			} else {
				name = _name;
			}
		}
		return name;
	}

	/**
	 * Returns the feature value which is converted to String type.
	 * 
	 * @return the feature value
	 */
	public String getPropertyValueStr() {
		if (valueStr == null) {
			if (format != null && format.getType() == ColumnType.OBJECT) {
				this.valueStr = ShimUtils.getName((EObject) propertyValue);
			} else {
				this.valueStr = PropertyCompareUtil.getPropertyValueStr(
						propertyValue, format);
			}
		}
		return valueStr;
	}

	/**
	 * Replaces the value with the specified value.
	 * 
	 * @param searchText
	 * @param replaceText
	 */
	public void replace(String searchText, String replaceText) {
		// replace
		String orgValue = getPropertyValueStr();
		String replaceValue = orgValue.replace(searchText, replaceText);
		if (matchFeature instanceof EAttribute) {
			ReflectionUtils.setAttributeWithAutoTypeConversion(data,
					(EAttribute) matchFeature, replaceValue);
		}
		
		// update field value
		propertyValue = data.eGet(matchFeature);
		name = null;
		valueStr = null;
	}

	/**
	 * Returns the hit data.
	 * 
	 * @return the hit data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * Returns  the feature of the data which matches search text.
	 * 
	 * @return  the feature of the data which matches search text
	 */
	public EStructuralFeature getMatchFeature() {
		return matchFeature;
	}

	/**
	 * Returns the parent name.
	 * 
	 * @return the parent name
	 */
	public String getParentName() {
		return parentName;
	}
}
