/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.model.shim.Shim;

/**
 * An implementation for the element of SHIM Data.
 */
public class ShimObject {

	public static final String CL_PARENT_NAME = "Parent Name";
	public static final String CL_X_PATH = "XPath";

	private EObject obj;
	private String parentName;
	private String xPath;
	
	

	/**
	 * Constructs a new instance of ShimObject.
	 * 
	 * @param obj
	 *            the element of SHIM Data
	 */
	public ShimObject(EObject obj) {
		this.obj = obj;
		this.parentName = obj.eContainingFeature().getName();
		this.xPath = "";
	}

	/**
	 * Returns the object.
	 * 
	 * @return the object
	 */
	public EObject getObj() {
		return this.obj;
	}

	/**
	 * Returns the parent name.
	 * 
	 * @return the parent name
	 */
	String getParentName() {
		return this.parentName;
	}

	/**
	 * Returns the XPath.
	 * 
	 * @return the XPath
	 */
	String getXPath() {
		return this.xPath;
	}

	/**
	 * Sets XPath to the field.
	 * 
	 * @param XPath
	 *            the XPath to set
	 */
	void setXPath(String XPath) {
		this.xPath = XPath;
	}

	
	public static String buildXPath(EObject obj) {
		Shim shim = ShimUtils.getShim(obj);
		String fragmentPath = EcoreUtil.getRelativeURIFragmentPath(shim, obj);
		List<String> fragments = new ArrayList<>();
		fragments.add(shim.eClass().getName());
		for (String fragment : StringUtils.splitByWholeSeparator(fragmentPath, "/")) {
			String capitalized = StringUtils.capitalize(fragment.replaceFirst("@", ""));
			fragments.add(capitalized.replaceAll("\\.(\\d+)", "[$1]"));
		}
		String xPath = "/" + StringUtils.join(fragments, "/");
		return xPath;
	}
	
	
	
	/**
	 * Returns the value of the specified field.
	 * 
	 * @param fieldName
	 *            the name of field to return
	 * @return the value of the specified field
	 */
	public Object getValue(String fieldName) {
		Object val = null;
		if (fieldName.equals(CL_PARENT_NAME)) {
			val = getParentName();

		} else if (fieldName.equals(CL_X_PATH)) {
			setXPath(buildXPath(getObj()));
			val = getXPath();

		} else {
			EStructuralFeature feature = obj.eClass().getEStructuralFeature(fieldName);
			if (feature instanceof EAttribute) {
				Object value = obj.eGet(feature);
				val = EcoreUtil.convertToString(
						((EAttribute) feature).getEAttributeType(),
						value);
			}
		}
		return val;
	}

	/**
	 * Sets the specified value to the specified field.
	 * 
	 * @param fieldName
	 *            the name of field to set
	 * @param val
	 *            the value to set to field
	 */
	public void setValue(String fieldName, Object val) {
		if (fieldName.equals(CL_PARENT_NAME)) {
			this.parentName = (String) val;

		} else if (fieldName.equals(CL_X_PATH)) {
			this.xPath = (String) val;
		} else if (val == null) {
			setNull(getObj(), fieldName);

		} else {
			setValObject(getObj(), fieldName, val);

			if (CommonConstants.FIELD_NAME.endsWith(fieldName)) {
				String _xPath = this.xPath;

				if (_xPath.length() > 0) {
					String str = "@" + CommonConstants.FIELD_NAME + "='";
					int startIdx = _xPath.lastIndexOf(str) + str.length();
					int endIdx = _xPath.lastIndexOf("'");

					StringBuffer sb = new StringBuffer();
					sb.append(_xPath.substring(0, startIdx));
					sb.append(val);
//					sb.append(_xPath.substring(endIdx, _xPath.length()));
					this.xPath = sb.toString();
				}
			}
		}
	}

	/**
	 * Sets the value to the specified field of the instance.
	 * 
	 * @param obj
	 *            Must be a member of the Shim API. Otherwise, those that
	 *            conform to the class definition of the Shim API.
	 * @param valueName
	 *            the field name of the value
	 * @param val
	 * @param value
	 *            Use this parameter to set null.
	 * @return
	 */
	public static void setValObject(EObject obj, String valueName, Object val) {
		EStructuralFeature feature = obj.eClass().getEStructuralFeature(valueName);
		if (feature != null) {
			obj.eSet(feature, val);
		}
	}

	
	
	
	
	/**
	 * Sets a null value to the specified field.
	 * 
	 * @param obj
	 *            the object which has the field to be set null
	 * @param valueName
	 *            the field name of tje value
	 */
	public static void setNull(EObject obj, String valueName) {
		EStructuralFeature feature = obj.eClass().getEStructuralFeature(valueName);
		obj.eUnset(feature);
	}
	
	
}