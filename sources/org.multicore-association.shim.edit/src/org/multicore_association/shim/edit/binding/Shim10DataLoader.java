package org.multicore_association.shim.edit.binding;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.BasicExtendedMetaData;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.multicore_association.shim10.model.shim10.DocumentRoot;
import org.multicore_association.shim10.model.shim10.ShimPackage;
import org.multicore_association.shim.edit.convert.ShimConvertData;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.MasterSlaveBindingSet;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.SystemConfiguration;


public class Shim10DataLoader {
	
	private String path = null;
	private DocumentRoot root = null;
	private Shim shim20 = null;

	public Shim10DataLoader(String path) {
		this.path = path;
	}
	
	public int Load() throws Exception {
		
		try {
			Resource resource = createResource(path);
			
			try (InputStream xmlInputStream = new FileInputStream(path)) {
				resource.load(xmlInputStream, createLoadOptions());
			}
			
			EObject content = resource.getContents().get(0);
			
			if (!(content instanceof DocumentRoot)) {
				return -1;
			}
			root = (DocumentRoot) content;
			
			ShimConvertData shimData = new ShimConvertData(root);
			shim20 = shimData.getShim();
			printShimData(shim20);
			
			if (shim20 != null) {
				shim20 = EcoreUtil.copy(shim20);
			}
			
//			SystemConfiguration systemconfiguration = shim20.getSystemConfiguration();
//			AddressSpaceSet addressSpaceSet = systemconfiguration.getAddressSpaceSet();
//			for (AddressSpace as : addressSpaceSet.getAddressSpace()) {
//				for (SubSpace ss : as.getSubSpace()) {
//					MasterSlaveBindingSet masterSlaveBindingSet = ss.getMasterSlaveBindingSet();
//					for (MasterSlaveBinding msb : masterSlaveBindingSet.getMasterSlaveBinding()) {
//						System.out.println(msb.getSlaveComponentRef());
//					}
//				}
//			}
			
			return 1;
		} catch (Exception e) {
			throw e;
		}
	}
	
	/**
	 * Prints the loaded SHIM Data to the standard output stream.
	 * 
	 * @param sys
	 *            the loaded SHIM Data
	 */
	private void printShimData(Shim shim) {
		System.out.println("<Output Start>----------------");
		System.out.println("  name=" + shim.getName());
		printComponentSet(shim.getSystemConfiguration().getComponentSet(), 1);
		System.out.println("</Output End>----------------");

	}

	/**
	 * Prints the ComponentSet to the standard output stream.
	 * 
	 * @param cset
	 *            the ComponentSet to write
	 * @param level
	 *            non-negative level of cset
	 */
	private void printComponentSet(ComponentSet cset, int level) {
		if (cset == null) {
			System.out.println("<<No ComponentSet>>");
		}
		for (MasterComponent mc : cset.getMasterComponent()) {
			printMasterComponent(mc, level + 1);

		}
		for (SlaveComponent sc : cset.getSlaveComponent()) {
			printSlaveComponent(sc, level + 1);

		}
		for (ComponentSet subCset : cset.getComponentSet()) {
			printComponentSet(subCset, level + 1);
		}

	}

	/**
	 * Prints the MasterComponent to the standard output stream.
	 * 
	 * @param mc
	 *            the MasterComponent to print
	 * @param level
	 *            non-negative level of mc
	 */
	private void printMasterComponent(MasterComponent mc, int level) {
		System.out.println(sp(level) + "<MasterComponent>----------------");
		System.out.println(sp(level) + "  Name=" + mc.getName());
		System.out.println(sp(level) + "  Pid =" + mc.getPid());
		System.out.println(sp(level) + "  Arch=" + mc.getArch());
		System.out.println(sp(level) + "</MasterComponent>----------------");
	}

	/**
	 * Spaces according to level.
	 * 
	 * @param level
	 *            non-negative level of element
	 * @return space
	 */
	private String sp(int level) {
		String ss = "";
		for (int i = 0; i < level; i++) {
			ss = ss + "    ";
		}
		return ss;
	}

	/**
	 * Prints the SlaveComponent to the standard output stream.<br>
	 * <b>No operation now.</b>
	 * 
	 * @param sc
	 *            the SlaveComponent to print
	 * @param level
	 *            non-negative level of mc
	 */
	private void printSlaveComponent(SlaveComponent sc, int level) {
		// NOOP
	}
	
	public static Resource createResource(String path) {
		ResourceSet resourceSet = new ResourceSetImpl();

		Map<String, Object> resourceSetMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		if (!resourceSetMap.containsKey(Resource.Factory.Registry.DEFAULT_EXTENSION)) {
			resourceSetMap.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		}

		Resource resource = resourceSet.createResource(URI.createFileURI(path));

		return resource;
	}
	
	public static Map<Object, Object> createLoadOptions() {
		Map<Object, Object> options = new HashMap<Object, Object>();

		options.put(XMIResource.OPTION_SUPPRESS_XMI, Boolean.TRUE);
		options.put(XMLResource.OPTION_EXTENDED_META_DATA, new BasicExtendedMetaData() {
			@Override
			public EPackage getPackage(String namespace) {
				if (namespace == null) {
					return ShimPackage.eINSTANCE;
				}
				return super.getPackage(namespace);
			}
		});

		return options;
	}
	
	public Shim getShim() {
		return shim20;
	}
	
	public DocumentRoot getRoot() {
		return root;
	}

}
