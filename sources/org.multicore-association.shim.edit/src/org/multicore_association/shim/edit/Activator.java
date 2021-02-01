/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit;

import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public static Bundle bundle;

	public static Properties message;

	@Override
	public void start(BundleContext context) throws Exception {
		bundle = context.getBundle();

		message = new Properties();
		URL url = bundle.getEntry("resources/message.properties");
		if (url != null) {
			try (InputStream stream = url.openStream()) {
				message.load(stream);
			}
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
	}

}
