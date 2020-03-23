/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model.search;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.multicore_association.shim.edit.gui.common.CommonConstants;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat;
import org.multicore_association.shim.edit.gui.swt.ShimObjectColumnFormat.ColumnType;
import org.multicore_association.shim.edit.gui.swt.viewer.ShimObjectTableViewer;
import org.multicore_association.shim.edit.model.ReflectionUtils;
import org.multicore_association.shim.edit.model.ShimUtils;
import org.multicore_association.shim.model.shim.ShimPackage;

/**
 * The class which provides the function that the search word compares with the
 * property of the class.
 */
public class PropertyCompareUtil {

	/**
	 * Returns features that is matched with the search text.
	 * 
	 * @param text
	 *            search text
	 * @param element
	 *            element
	 * @param options
	 */
	public static List<EStructuralFeature> getMatchFeatures(String text, EObject element,
			SearchOptions options) {
		List<EStructuralFeature> matchFeatures = new ArrayList<EStructuralFeature>();
		if (!options.matchElement(element.eClass().getName())) {
			return matchFeatures;
		}

		EClass eClass = element.eClass();

		String searchText = text;
		if (!options.isCaseSensitive()) {
			searchText = searchText.toLowerCase();
		}

		ValueMatcher valueMatcher = ValueMatcher.getValueMatcher(searchText,
				options.isWholeWord(), options.isRegExp());

		for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
			String propertyName = feature.getName();
			if (ShimObjectTableViewer.shouldHideFeature.test(feature)) {
				continue;
			}
			if (!options.matchProperty(propertyName)) {
				continue;
			}

			try {

				Object propValue = element.eGet(feature);
				if (propValue == null || propValue instanceof List) {
					continue;
				}

				ShimObjectColumnFormat format = getColumnFormat(feature);
				String propertyString = null;
				if (format != null && format.getType() == ColumnType.OBJECT) {
					propertyString = options.isDoNotSearchIdRef() ? null
							: ShimUtils.getName((EObject) propValue);
				} else {
					propertyString = getPropertyValueStr(propValue, format);
				}

				if (propertyString == null) {
					continue;
				}

				if (!options.isCaseSensitive()) {
					propertyString = propertyString.toLowerCase();
				}

				if (valueMatcher.isMatch(propertyString)) {
					matchFeatures.add(feature);
				}

			} catch (Exception e) {
			}

		}

		return matchFeatures;
	}

	/**
	 * Returns the string representation of the specified property value.
	 * 
	 * @param propVal
	 *            the property value
	 * @param format
	 *            the column format
	 * @return the string representation of the property value
	 */
	public static String getPropertyValueStr(Object propVal,
			ShimObjectColumnFormat format) {
		if (format != null) {
			ColumnType type = format.getType();

			if (propVal == null) {
				return null;
			}

			switch (type) {
			case TEXT:
			case INT:
			case HEADER:
			case FOOTER:
			case COMBO:
				return propVal.toString();
			case FLOAT:
				return String.format(CommonConstants.FORMAT_FLOAT, propVal);
			case HEX:
				return String.format(CommonConstants.FORMAT_HEX, propVal);
			default:
				break;
			}
		}
		return null;
	}

	/**
	 * Returns the column format of the specified field.
	 * 
	 * @param apiClass
	 *            the class of ShimObject's data
	 * @param f
	 *            the field of element
	 * @return the column format of the specified field.
	 */
	public static ShimObjectColumnFormat getColumnFormat(EStructuralFeature f) {

		String name = f.getName();
		EClassifier type = f.getEType();

		ShimObjectColumnFormat format = null;

		boolean isRequied = f.isRequired();

		String insName = type.getInstanceClassName();

		if (type.getEPackage() instanceof ShimPackage) {
			if (type instanceof EEnum) {
				// It is 'Type' Class of SHIM API.
				format = new ShimObjectColumnFormat(name, ColumnType.COMBO,
						type, isRequied);
			} else if (f instanceof EReference && !((EReference) f).isContainment()) {
				// It is 'IDREF' Field of SHIM API.
				format = new ShimObjectColumnFormat(name, ColumnType.OBJECT,
						type, isRequied);
			}
		} else {

			if (insName.equals(ReflectionUtils.CLASS_NAME_STRING)) {
				format = new ShimObjectColumnFormat(name, ColumnType.TEXT,
						type, isRequied);
			} else if (insName
					.equals(ReflectionUtils.CLASS_NAME_INTEGER_WRAPPER)
					|| insName
							.equals(ReflectionUtils.CLASS_NAME_INTEGER_PRIMITIVE)) {
				format = new ShimObjectColumnFormat(name, ColumnType.INT, type,
						isRequied);
			} else if (insName.equals(ReflectionUtils.CLASS_NAME_LONG_WRAPPER)
					|| insName
							.equals(ReflectionUtils.CLASS_NAME_LONG_PRIMITIVE)) {
				format = new ShimObjectColumnFormat(name, ColumnType.HEX, type,
						isRequied);
			} else if (insName
					.equals(ReflectionUtils.CLASS_NAME_FLOAT_WRAPPER)
					|| insName
							.equals(ReflectionUtils.CLASS_NAME_FLOAT_PRIMITIVE)) {
				format = new ShimObjectColumnFormat(name, ColumnType.FLOAT,
						type, isRequied);

			} else if (insName.equals(ReflectionUtils.CLASS_NAME_OBJECT)) {
				format = new ShimObjectColumnFormat(name, ColumnType.OBJECT,
						type, isRequied);

			} else {
				format = new ShimObjectColumnFormat(name, ColumnType.TEXT,
						type, isRequied);
			}
		}

		return format;
	}

	/**
	 * Abstract base implementation for matching values.
	 */
	private abstract static class ValueMatcher {

		protected String searchText;

		/**
		 * Constructs a new instance of ValueMatcher.
		 * 
		 * @param searchText
		 *            a string to search
		 */
		ValueMatcher(String searchText) {
			this.searchText = searchText;
		}

		/**
		 * Returns whether the searchText is matched with the specified property
		 * value.
		 * 
		 * @param propertyValue
		 *            the property value
		 * @return Returns true if searchText is matched with the specified
		 *         property value, and false otherwise.
		 */
		abstract boolean isMatch(String propertyValue);

		/**
		 * Returns the ValueMatcher according to the search option.
		 * 
		 * @param searchText
		 *            the text to search
		 * @param isWholeWord
		 *            if true, only whole words were searched
		 * @param isRegExp
		 *            if true, regular expression search was performed; if
		 *            false, search with basic wildcards was performed
		 * @return the ValueMatcher instance
		 */
		static ValueMatcher getValueMatcher(String searchText,
				boolean isWholeWord, boolean isRegExp) {
			if (isRegExp) {
				return new RegularExpressionMatcher(searchText);
			} else if (isWholeWord) {
				return new PerfectMatcher(searchText);
			} else {
				return new ParticleMatcher(searchText);
			}
		}
	}

	/**
	 * Perfect-Matching ValueMatcher class
	 */
	static class PerfectMatcher extends ValueMatcher {

		/**
		 * Constructs a new instance of PerfectMatcher.
		 * 
		 * @param searchText
		 *            a string to search
		 */
		PerfectMatcher(String searchText) {
			super(searchText);
		}

		/**
		 * @see org.multicore_association.shim.edit.model.search.PropertyCompareUtil.ValueMatcher#isMatch(java.lang.String)
		 */
		@Override
		boolean isMatch(String propertyValue) {
			return propertyValue.equals(searchText);
		}
	}

	/**
	 * Particle-Matching ValueMatcher class
	 */
	static class ParticleMatcher extends ValueMatcher {

		/**
		 * Constructs a new instance of ParticleMatcher.
		 * 
		 * @param searchText
		 *            a string to search
		 */
		ParticleMatcher(String searchText) {
			super(searchText);
		}

		/**
		 * @see org.multicore_association.shim.edit.model.search.PropertyCompareUtil.ValueMatcher#isMatch(java.lang.String)
		 */
		@Override
		boolean isMatch(String propertyValue) {
			return propertyValue.contains(searchText);
		}
	}

	/**
	 * Pattern-Matching ValueMatcher class
	 */
	static class RegularExpressionMatcher extends ValueMatcher {

		private Pattern pattern;

		/**
		 * Constructs a new instance of RegularExpressionMatcher.
		 * 
		 * @param searchText
		 *            regular expressions to search
		 */
		RegularExpressionMatcher(String searchText) {
			super(searchText);
			this.pattern = Pattern.compile(searchText);
		}

		/**
		 * @see org.multicore_association.shim.edit.model.search.PropertyCompareUtil.ValueMatcher#isMatch(java.lang.String)
		 */
		@Override
		boolean isMatch(String propertyValue) {
			return pattern.matcher(propertyValue).matches();
		}
	}

}
