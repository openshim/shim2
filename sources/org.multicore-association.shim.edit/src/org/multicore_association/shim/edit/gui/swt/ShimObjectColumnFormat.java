/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt;

import org.eclipse.emf.ecore.EClassifier;

/**
 * The format of columns managed by the SHIM Object.
 */
public class ShimObjectColumnFormat {

	private String propertyName;
	private ColumnType type;
	private EClassifier eType;
	private boolean isRequired = false;

	/**
	 * Constructs a new instance of ShimObjectColumnFormat.
	 * 
	 * @param propertyName
	 *            the property name
	 * @param type
	 *            the column type
	 */
	public ShimObjectColumnFormat(String propertyName, ColumnType type) {
		this.propertyName = propertyName;
		this.type = type;
		this.eType = null;
		this.isRequired = false;
	}

	/**
	 * Constructs a new instance of ShimObjectColumnFormat.
	 * 
	 * @param propertyName
	 *            the property name
	 * @param type
	 *            the column type
	 * @param eType
	 *            the class of the column value
	 * @param isRequired
	 *            whether the non-null value is required
	 */
	public ShimObjectColumnFormat(String propertyName, ColumnType type,
			EClassifier eType, boolean isRequired) {
		this.propertyName = propertyName;
		this.type = type;
		this.eType = eType;
		this.isRequired = isRequired;
	}

	/**
	 * Returns the property name.
	 * 
	 * @return the property name
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * Returns the column type.
	 * 
	 * @return the column type
	 */
	public ColumnType getType() {
		return this.type;
	}

	/**
	 * Returns the class of the column value.
	 * 
	 * @return the class of the column value
	 */
	public EClassifier getEType() {
		return this.eType;
	}

	/**
	 * Returns whether the non-null value is required.
	 * 
	 * @return Returns true if non-null value is required, and false otherwise.
	 */
	public boolean isRequired() {
		return this.isRequired;
	}

	/**
	 * Type of columns managed by the SHIM Object.
	 */
	public enum ColumnType {
		TEXT, INT, HEX, FLOAT, COMBO, HEADER, FOOTER, OBJECT;

		/**
		 * Returns the name of this column type.
		 * 
		 * @return the name of this column type
		 */
		public String value() {
			return name();
		}

		/**
		 * Returns the ColumnType which matches the specified text.
		 * 
		 * @param v
		 *            the ColumnType text
		 * @return the ColumnType which matches the specified text
		 */
		public static ColumnType fromValue(String v) {
			return valueOf(v);
		}

	}
}
