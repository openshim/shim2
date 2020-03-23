/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;

/**
 * This class contains various methods for using java.lang.reflect API.
 */
public class ReflectionUtils {

	public static final String CLASS_NAME_STRING = String.class.getName();

	public static final String CLASS_NAME_INTEGER_WRAPPER = Integer.class
			.getName();
	public static final String CLASS_NAME_LONG_WRAPPER = Long.class.getName();
	public static final String CLASS_NAME_FLOAT_WRAPPER = Float.class.getName();
	public static final String CLASS_NAME_INTEGER_PRIMITIVE = "int";
	public static final String CLASS_NAME_LONG_PRIMITIVE = "long";
	public static final String CLASS_NAME_FLOAT_PRIMITIVE = "float";
	public static final String CLASS_NAME_OBJECT = Object.class.getName(); // Added.
																			// 2014/06/17
	/**
	 * Sets the declared attribute value of the specified object.
	 * 
	 * @param obj
	 *            the object
	 * @param attribute
	 *            the attribute to set
	 * @param value
	 *            the field value to set
	 * @return the declared field value
	 */
	public static void setAttributeWithAutoTypeConversion(EObject obj,
			EAttribute attribute, String value) {

		try {
			Class<?> type = attribute.getEAttributeType().getInstanceClass();
			if (type.equals(Integer.class) || type.equals(int.class)) {
				obj.eSet(attribute, Integer.parseInt(value));

			} else if (type.equals(Long.class) || type.equals(long.class)) {
				obj.eSet(attribute, Long.parseLong(value));

			} else if (type.equals(Float.class) || type.equals(float.class)) {
				obj.eSet(attribute, Float.parseFloat(value));

			} else if (type.equals(String.class)) {
				obj.eSet(attribute, value);

			} else if (type.isEnum()) {
				@SuppressWarnings({ "unchecked", "rawtypes" })
				Enum enumVal = Enum.valueOf((Class<Enum>)type, value);
				obj.eSet(attribute, enumVal);
			}

		} catch (Exception e) {
		}
	}
}
