/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.log;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.logging.FileHandler;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.apache.commons.lang3.StringUtils;
import org.eclipse.emf.ecore.EObject;
import org.multicore_association.shim.edit.Activator;
import org.multicore_association.shim.edit.model.ShimUtils;

/**
 * Logging utility.
 */
public class ShimLoggerUtil {

	static {
		File file = new File("conf/shimeditor-logging.properties");
		if (file.exists()) {
			try {
				readConfig(new FileInputStream(file));
			} catch (Exception e) {
			}
			// If the custom property file exists, loads it.
			getLogger(ShimLoggerUtil.class)
					.info("Load logging properties. : Path="
							+ file.getAbsoluteFile());
		} else {
			// If the custom property file does not exist, loads default
			// property file.
			URL url = Activator.bundle.getEntry("resources/conf/shimeditor-default-logging.properties");

			if (url != null) {
				try (InputStream stream = url.openStream()) {
					readConfig(stream);
				} catch (Exception e) {
				}
			}

			getLogger(ShimLoggerUtil.class).info(
					"Load default logging properties.");
		}
	}

	/**
	 * Reads logging property file.<br>
	 * If you will use FileHandler and configure FileHandler.pattern, makes
	 * parent directory of log file.
	 * 
	 * @param stream
	 * @throws IOException
	 */
	protected static void readConfig(InputStream stream) throws IOException {
		LogManager manager = LogManager.getLogManager();
		manager.readConfiguration(stream);

		// And creates parent directories.
		String pattern = manager.getProperty(FileHandler.class.getName()
				+ ".pattern");
		if (pattern != null && !pattern.isEmpty()) {
			int lastIndexOf = pattern.lastIndexOf("/");
			if (lastIndexOf > 0) {
				String substring = pattern.substring(0, lastIndexOf);
				File dir = new File(substring);
				if (!dir.exists()) {
					dir.mkdirs();
				}
			}
		}
	}

	/**
	 * Returns a logger for the specified class.
	 * 
	 * @param claz
	 *            the class that needs a logger
	 * @return the logger for the specified class
	 */
	public static Logger getLogger(Class<?> claz) {
		return Logger.getLogger(claz.getName());
	}

	/**
	 * Returns the name attribute of the element.
	 * 
	 * @param element
	 *            the element which may have name attribute
	 * @return the name attribute of the element
	 */
	public static String getNameProperty(EObject element) {
		String name = ShimUtils.getName(element);

		return StringUtils.defaultString(name, element.eClass().getName());
	}

}
