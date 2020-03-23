/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.gui.swt.panel;

import java.io.InputStream;

import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.multicore_association.shim.edit.gui.common.ErrorMessageWriter;

/**
 * Abstract base implementation for composite to show and edit SHIM Data.
 */
public abstract class InputPanelBase extends Composite implements
		ErrorMessageWriter {

	private Label lblTitle;
	private Composite composite_1;

	/**
	 * Constructs a new instance of InputPanelBase.
	 * 
	 * @param parent
	 *            parent composite
	 * @param style
	 *            SWT style bits
	 */
	public InputPanelBase(Composite parent, int style) {
		super(parent, style);

		setLayout(new GridLayout());

		createTitle(this);

		Control container = createContents(this, style);
		GridDataFactory.fillDefaults().grab(true, true).align(SWT.FILL, SWT.FILL).applyTo(container);

		createStatusArea(this);
	}

	protected void createTitle(Composite parent) {
		lblTitle = new Label(parent, SWT.NONE);
		lblTitle.setAlignment(SWT.CENTER);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.BEGINNING).applyTo(lblTitle);
		lblTitle.setText("[ANY NAME]");
	}

	protected void createStatusArea(Composite parent) {
		composite_1 = new Composite(parent, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).align(SWT.FILL, SWT.END).applyTo(composite_1);
		composite_1.setLayout(new GridLayout(1, false));

		textErrorMassage = new Text(composite_1, SWT.BORDER);
		textErrorMassage.setEditable(false);
		textErrorMassage.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true,
				false, 1, 1));
		textErrorMassage.setVisible(true);

		controlDecoration = new ControlDecoration(textErrorMassage, SWT.TOP);
		controlDecoration
				.setImage(getImage("/org/eclipse/jface/fieldassist/images/error_ovr"));
		controlDecoration.setDescriptionText("");
		controlDecoration.hide();
	}

	/**
	 * Returns the image of the specified resource.
	 * 
	 * @param resouce
	 *            the resource to return the image
	 * @return the image of the specified resource
	 */
	protected Image getImage(String resouce) {
		InputStream stream = InputPanelBase.class.getResourceAsStream(resouce + ".png");
		if (stream == null) {
			stream = InputPanelBase.class.getResourceAsStream(resouce + ".gif");
			if (stream == null) {
				return null;
			}
		}
		ImageData data = new ImageData(stream);
		Image image = null;
		if (data.transparentPixel > 0) {
			image = new Image(Display.getCurrent(), data,
					data.getTransparencyMask());
		} else {
			image = new Image(Display.getCurrent(), data);
		}
		return image;
	}

	protected Text textErrorMassage;
	private ControlDecoration controlDecoration;

	protected abstract Control createContents(Composite parent, int style);

	public abstract void setInput(Object input);

	/**
	 * Sets the label of the page title.
	 * 
	 * @param title
	 *            the text to set the page title
	 */
	protected void setLblTitleText(String title) {
		this.lblTitle.setText(title);
	}

	/**
	 * Sets empty message to the error message field.
	 */
	public void clearErrorMessage() {
		textErrorMassage.setText("");
		controlDecoration.hide();
	}

	/**
	 * Sets an error message to the error message field.
	 * 
	 * @param msg
	 *            the error message to set
	 */
	public void setErrorMessage(String msg) {
		if (msg == null || msg.length() <= 0) {
			clearErrorMessage();
		} else {
			textErrorMassage.setText(msg);
			controlDecoration.show();
		}
	}

	/**
	 * @see org.multicore_association.shim.edit.gui.common.ErrorMessageWriter#writeErrorMessage(java.lang.String)
	 */
	@Override
	public void writeErrorMessage(String value) {
		setErrorMessage(value);
	}
}
