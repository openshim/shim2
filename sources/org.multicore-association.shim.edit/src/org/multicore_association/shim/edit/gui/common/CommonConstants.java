/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.common;

/**
 * A Constant Class
 */
public class CommonConstants {

	public static final String API_NAME = "SHIM Editor";

	public static final String EDITOR_VERSION = "2.0";

	public static final String SHIM_VERSION_2_0 = "2.0";

	// ------------------------------------------------
	// FIELD
	// ------------------------------------------------
	public static final String FIELD_NAME = "name";

	// ------------------------------------------------
	// DIALOG, MESSAGE
	// ------------------------------------------------
	public static final String QUESTION_DIALOG_TITLE = "QUESTION";

	public static final String MESSAGE_OVERWRITE_ELEMENT = "Target element(%s) with a maxOccurs=\"1\" attribute already exists.\nWould you like to overwrite it?";

	public static final String MESSAGE_INVALID_IDREF = "The AccessType references of the child Performance elements refer to an invalid AccessType.\nSelects the AccessType references of the child Performance elements again.";

	public static final int WIZARD_DEFAULT_X = 100;

	public static final int WIZARD_DEFAULT_Y = 100;

	public static final int WIZARD_WIDTH = 980;

	public static final int WIZARD_HEIGHT = 590;

	// ------------------------------------------------
	// FORMAT
	// ------------------------------------------------
	public static final String FORMAT_HEX = "%08x";

	public static final String FORMAT_FLOAT = "%#.1f";
}
