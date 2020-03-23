/*
 * Copyright (c) 2020 eSOL Co.,Ltd. 
 *
 * This software is released under the MIT License.
 * http://opensource.org/licenses/mit-license.php
 */
package org.multicore_association.shim.edit.model;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.multicore_association.shim.edit.log.ShimLoggerUtil;
import org.multicore_association.shim.edit.model.ShimComponentTree.TreeNode;
import org.multicore_association.shim.edit.model.data.DefaultDataStore;
import org.multicore_association.shim.model.shim.AccessType;
import org.multicore_association.shim.model.shim.AccessTypeSet;
import org.multicore_association.shim.model.shim.Accessor;
import org.multicore_association.shim.model.shim.AddressSpace;
import org.multicore_association.shim.model.shim.AddressSpaceSet;
import org.multicore_association.shim.model.shim.Cache;
import org.multicore_association.shim.model.shim.CacheType;
import org.multicore_association.shim.model.shim.CommonInstructionSet;
import org.multicore_association.shim.model.shim.ComponentSet;
import org.multicore_association.shim.model.shim.Connection;
import org.multicore_association.shim.model.shim.ConnectionSet;
import org.multicore_association.shim.model.shim.FunctionalUnit;
import org.multicore_association.shim.model.shim.FunctionalUnitSet;
import org.multicore_association.shim.model.shim.Instruction;
import org.multicore_association.shim.model.shim.Latency;
import org.multicore_association.shim.model.shim.MasterComponent;
import org.multicore_association.shim.model.shim.MasterSlaveBinding;
import org.multicore_association.shim.model.shim.MasterSlaveBindingSet;
import org.multicore_association.shim.model.shim.Performance;
import org.multicore_association.shim.model.shim.PerformanceSet;
import org.multicore_association.shim.model.shim.Pitch;
import org.multicore_association.shim.model.shim.Shim;
import org.multicore_association.shim.model.shim.ShimFactory;
import org.multicore_association.shim.model.shim.ShimPackage;
import org.multicore_association.shim.model.shim.SlaveComponent;
import org.multicore_association.shim.model.shim.SubSpace;
import org.multicore_association.shim.model.shim.SystemConfiguration;

/**
 * The SHIM Data Model manager which includes the ability to create an instance
 * in generation management.
 */
public class ShimModelManager {

	private static final Logger log = ShimLoggerUtil
			.getLogger(ShimModelManager.class);

	public static int masterPid_counter = 0;

	/**
	 * Constructs a new instance of Shim_ModelManager.
	 */
	private ShimModelManager() {
		// NOOP
	}

	/**
	 * Initialize the new ComponentSet instance with the name of the specified
	 * suffix.
	 * 
	 * @param subname
	 *            the suffix
	 * @return a new ComponentSet instance with the name of the specified suffix
	 */
	private static void initComponentSet(ComponentSet cs, String subname) {

		final ComponentSet dcs = (ComponentSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getComponentSet());

		cs.setName(dcs.getName() + subname);
	}

	/**
	 * Initialize the new MasterComponent instance with the name of the specified
	 * suffix.
	 * 
	 * @param subname
	 *            the suffix
	 * @return a new MasterComponent instance with the name of the specified
	 *         suffix
	 */
	private static void initMasterComponent(MasterComponent mc, String subname) {

		final MasterComponent dmc = (MasterComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMasterComponent());

		mc.setName(dmc.getName() + subname);

		mc.setPid(masterPid_counter + "");
		masterPid_counter++;

		mc.setArch(dmc.getArch());
		mc.setArchOption(dmc.getArchOption());
		mc.setNThread(dmc.getNThread());
		mc.setMasterType(dmc.getMasterType());
		mc.setEndian(dmc.getEndian());
	}

	/**
	 * Initialize the new SlaveComponent instance with the name of the specified
	 * suffix.
	 * 
	 * @param subname
	 *            the suffix
	 * @return a new SlaveComponent instance with the name of the specified
	 *         suffix
	 */
	private static void initSlaveComponent(SlaveComponent slc, String subname) {
		final SlaveComponent dslc = (SlaveComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSlaveComponent());

		slc.setName(dslc.getName() + subname);
		slc.setSize(dslc.getSize());
		slc.setSizeUnit(dslc.getSizeUnit());
		slc.setRwType(dslc.getRwType());
	}

	/**
	 * Counts number of ComponentSet in the specified ComponentSet list
	 * recursively.
	 * 
	 * @param cs_list
	 *            the ComponentSet list to count number of ComponentSet
	 * @return number of ComponentSet
	 */
	public static int countComponentSet(List<ComponentSet> cs_list) {
		log.finest("In CountComponentSet ca_list.size() = " + cs_list.size());
		if (cs_list.size() == 0) {
			return 0;
		} else {
			int count = 0;
			for (ComponentSet cset : cs_list) {
				log.finest(" cs name= " + cset.getName());
				count += countComponentSet(cset.getComponentSet());
			}
			return cs_list.size() + count;
		}
	}

	/**
	 * Counts number of MasterComponent in the specified ComponentSet
	 * recursively.
	 * 
	 * @param cs
	 *            the ComponentSet to count number of MasterComponent
	 * @return number of MasterComponent
	 */
	public static int countMasterComponent(ComponentSet cs) {
		int count = 0;
		List<MasterComponent> masterComponent = cs.getMasterComponent();
		if (masterComponent != null) {
			count += masterComponent.size();
		}
		List<ComponentSet> componentSetList = cs.getComponentSet();
		if (componentSetList != null) {
			for (ComponentSet componentSet : componentSetList) {
				count += countMasterComponent(componentSet);
			}
		}
		return count;
	}

	/**
	 * Counts number of SlaveComponent in the specified ComponentSet
	 * recursively.
	 * 
	 * @param cs
	 *            the ComponentSet to count number of SlaveComponent
	 * @return number of the specified SlaveComponent
	 */
	public static int countSlaveComponent(ComponentSet cs) {
		int count = 0;
		List<SlaveComponent> slaveComponent = cs.getSlaveComponent();
		if (slaveComponent != null) {
			count += slaveComponent.size();
		}
		List<ComponentSet> componentSetList = cs.getComponentSet();
		if (componentSetList != null) {
			for (ComponentSet componentSet : componentSetList) {
				count += countSlaveComponent(componentSet);
			}
		}
		return count;
	}

	/**
	 * Creates the list of ComponentSet that is contained in the specified
	 * SystemConfiguration.
	 * 
	 * @param sys
	 *            the SystemConfiguration to create the list of contained
	 *            ComponentSets
	 * @return the list of ComponentSet that is contained in the specified
	 *         SystemConfiguration
	 */
	public static List<ComponentSet> makeComponentSetList(
			SystemConfiguration sys) {

		List<ComponentSet> csetList = makeComponentSetList(sys
				.getComponentSet().getComponentSet());

		csetList.add(sys.getComponentSet());

		return csetList;
	}

	/**
	 * Creates the list of ComponentSet that is contained in the specified
	 * ComponentSets.
	 * 
	 * @param cs_list
	 *            the ComponentSets to create the list of contained
	 *            ComponentSets
	 * 
	 * @return the list of ComponentSet that is contained in the specified
	 *         ComponentSets
	 */
	public static List<ComponentSet> makeComponentSetList(
			List<ComponentSet> cs_list) {

		log.finest("In makeComponentSetList ca_list.size() = " + cs_list.size());

		List<ComponentSet> csetList = new ArrayList<ComponentSet>();

		if (cs_list.size() == 0) {
			return csetList;
		} else {
			for (ComponentSet cset : cs_list) {
				log.finest(" cs name= " + cset.getName());
				csetList.add(cset);
				csetList.addAll(makeComponentSetList(cset.getComponentSet()));
			}
			log.finest("Return csetList Size= " + csetList.size());
			return csetList;
		}
	}

	/**
	 * Creates the list of MasterComponent that is contained in the specified
	 * SystemConfiguration.
	 * 
	 * @param sys
	 *            the SystemConfiguration to create the list of contained
	 *            MasterComponents
	 * @return the list of MasterComponent that is contained in the specified
	 *         SystemConfiguration
	 */
	public static List<MasterComponent> makeMasterComponentList(
			SystemConfiguration sys) {

		List<MasterComponent> masterList = makeMasterComponentList(sys
				.getComponentSet());

		return masterList;
	}

	/**
	 * Creates the list of MasterComponent that is contained in the specified
	 * ComponentSet.
	 * 
	 * @param cs
	 *            the ComponentSet to create the list of contained
	 *            MasterComponents
	 * @return the list of MasterComponent that is contained in the specified
	 *         ComponentSet
	 */
	public static List<MasterComponent> makeMasterComponentList(ComponentSet cs) {

		List<MasterComponent> masterList = new ArrayList<MasterComponent>();

		if (cs.getMasterComponent().size() > 0) {
			for (MasterComponent mc : cs.getMasterComponent()) {
				masterList.add(mc);
			}
		}
		if (cs.getComponentSet().size() > 0) {
			for (ComponentSet cset : cs.getComponentSet()) {
				masterList.addAll(makeMasterComponentList(cset));
			}
		}

		return masterList;
	}

	/**
	 * Creates the list of SlaveComponent that is contained in the specified
	 * ComponentSet.
	 * 
	 * @param cs
	 *            the ComponentSet to create the list of contained
	 *            SlaveComponents
	 * @return the list of SlaveComponent that is contained in the specified
	 *         ComponentSet
	 */
	public static List<SlaveComponent> makeSlaveComponentList(ComponentSet cs) {

		List<SlaveComponent> slaveList = new ArrayList<SlaveComponent>();

		if (cs.getMasterComponent().size() > 0) {
			for (SlaveComponent slc : cs.getSlaveComponent()) {
				slaveList.add(slc);
			}
		}
		if (cs.getComponentSet().size() > 0) {
			for (ComponentSet cset : cs.getComponentSet()) {
				slaveList.addAll(makeSlaveComponentList(cset));
			}
		}

		return slaveList;
	}

	/**
	 * Creates the list which covered all the connections between
	 * MasterComponents.
	 * 
	 * @param shim
	 *            a Shim
	 * @param dontConnect
	 *            whether make the connection with ancestors or not
	 * @return the list which covered all the connections between
	 *         MasterComponents
	 */
	public static ConnectionSet createDefaultConnectionList(Shim shim, boolean dontConnect) {

		SystemConfiguration system = shim.getSystemConfiguration();
		ConnectionSet conset = ShimFactory.eINSTANCE.createConnectionSet();

		List<Connection> conlist = conset.getConnection();
		List<MasterComponent> mlist = ShimModelManager
				.makeMasterComponentList(system);

		ShimComponentTree sctree = new ShimComponentTree(system);

		for (MasterComponent fromMC : mlist) {
			for (MasterComponent toMC : mlist) {

				if (dontConnect) {
					TreeNode tfmc = sctree.getNodeByMc(fromMC);
					TreeNode ttmc = sctree.getNodeByMc(toMC);
					if (!(tfmc.getParent().isAncestor(ttmc) || ttmc.getParent()
							.isAncestor(tfmc))) {
						continue;
					}
				}

				String from = fromMC.getName();
				String to = toMC.getName();
				if (from.compareTo(to) == 0)
					continue;
				Connection cij = ShimFactory.eINSTANCE.createConnection();
				cij.setFrom(fromMC);
				cij.setTo(toMC);

				List<Performance> performancelist = cij.getPerformance();

				Performance performance = (Performance) DefaultDataStore
						.getDefaultInstance(ShimPackage.eINSTANCE.getPerformance());

				// create latency
				Latency latency = (Latency) DefaultDataStore
						.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());
				performance.setLatency(latency);

				// create pitch
				Pitch pitch = (Pitch) DefaultDataStore
						.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());
				performance.setPitch(pitch);

				// add latency and pitch
				performancelist.add(performance);

				conlist.add(cij);
			}
		}
		return conset;
	}

	/**
	 * Sets the specified Cache instance to the MasterComponents which is
	 * included the specified ComponentSet.
	 * 
	 * @param cs
	 *            the ComponentSet which includes MasterComponents to be set
	 *            Cache
	 * @param hname
	 *            the lot number that is expressed by the '0_0_..._0' format<br>
	 *            (Start is "0")
	 * @param type
	 *            the cache type
	 * @param c1_base
	 *            the Cache instance
	 * @param c2_base
	 *            the instruction Cache instance if cache type is 'Data and
	 *            Instruction'
	 */
	public static void setCacheDataToMasterComponent(ComponentSet cs,
			String hname, String type, Cache c1_base, Cache c2_base) {

		if (cs.getMasterComponent().size() > 0) {

			int no = 0;
			for (MasterComponent mc : cs.getMasterComponent()) {

				if (type == "unified") {
					Cache c1 = (Cache) EcoreUtil.copy(c1_base);
					c1.setName("UnifiedCache_" + hname + "_" + no);
					cs.getCache().add(c1);
					mc.getCacheRef().add(c1);
					log.finest("Cache Data Set mc name=" + mc.getName()
							+ ", cache name=" + c1.getName());
				} else if (type == "data") {
					Cache c1 = (Cache) EcoreUtil.copy(c1_base);
					c1.setName("DataCache_" + hname + "_" + no);
					cs.getCache().add(c1);
					mc.getCacheRef().add(c1);
				} else if (type == "instruction") {
					Cache c1 = (Cache) EcoreUtil.copy(c1_base);
					c1.setName("InstructionCache_" + hname + "_" + no);
					cs.getCache().add(c1);
					mc.getCacheRef().add(c1);
				} else {
					Cache c1 = (Cache) EcoreUtil.copy(c1_base);
					Cache c2 = (Cache) EcoreUtil.copy(c2_base);
					c1.setName("DataCache_" + hname + "_" + no);
					c2.setName("InstructionCache_" + hname + "_" + no);
					cs.getCache().add(c1);
					cs.getCache().add(c2);
					mc.getCacheRef().add(c1);
					mc.getCacheRef().add(c2);

				}
				no++;
			}
		}
		if (cs.getComponentSet().size() > 0) {
			int no = 0;
			for (ComponentSet cset : cs.getComponentSet()) {
				log.finest(" cs name= " + cset.getName());
				setCacheDataToMasterComponent(cset, hname + "_" + no, type,
						c1_base, c2_base);
				no++;
			}
		}

		return;
	}

	/**
	 * Sets the specified AccessType instance to the MasterComponents which is
	 * included the specified ComponentSet.
	 * 
	 * @param cs
	 *            the ComponentSet which includes MasterComponents to be set
	 *            AccessType
	 * @param hname
	 *            the lot number that is expressed by the '0_0_..._0' format<br>
	 *            (Start is "0")
	 * @param batList
	 *            all combinations of RW types and byte sizes.
	 */
	public static void setAccessTypeDataToMasterComponent(ComponentSet cs,
			String hname, List<AccessType> batList) {

		if (cs.getMasterComponent().size() > 0) {

			int mc_no = 0;
			for (MasterComponent mc : cs.getMasterComponent()) {
				AccessTypeSet atset = ShimFactory.eINSTANCE.createAccessTypeSet();
				List<AccessType> atlist = atset.getAccessType();
				for (int bi = 0; bi < batList.size(); bi++) {
					AccessType at = (AccessType) DefaultDataStore
							.getDefaultInstance(ShimPackage.eINSTANCE.getAccessType());
					AccessType bat = batList.get(bi);

					at.setName("AT_" + hname + "_" + mc_no + "_" + bi);
					at.setAccessByteSize(bat.getAccessByteSize());
					at.setAlignmentByteSize(bat.getAlignmentByteSize());
					at.setNBurst(bat.getNBurst());
					at.setRwType(bat.getRwType());

					atlist.add(at);
					log.finest("AccessType Data Set mc name=" + mc.getName()
							+ ", AccessType name=" + at.getName());
				}
				mc.setAccessTypeSet(atset);
				mc_no++;
			}
		}
		if (cs.getComponentSet().size() > 0) {
			int no = 0;
			for (ComponentSet cset : cs.getComponentSet()) {
				log.finest(" cs name= " + cset.getName());
				setAccessTypeDataToMasterComponent(cset, hname + "_" + no,
						batList);
				no++;
			}
		}

		return;

	}

	/**
	 * Sets MasterSlaveBindings (all combinations of MasterComponent and
	 * SlaveComponent) to the specified SubSpace.
	 * 
	 * @param subspace
	 *            the SubSpace instance to set MasterSlaveBindings
	 * @param dontConnect
	 *            If true, does not connect siblings.
	 */
	public static void setMasterSlaveBindingToSubSpace(
			ShimComponentTree sctree, List<MasterComponent> mclist,
			List<SlaveComponent> slclist, SubSpace subspace, boolean dontConnect) {

		log.finest(">>> setMasterSlaveBindingToSubSpace");

		MasterSlaveBindingSet msbset = ShimFactory.eINSTANCE.createMasterSlaveBindingSet();

		List<MasterSlaveBinding> msblist = msbset.getMasterSlaveBinding();

		for (SlaveComponent slc : slclist) {

			MasterSlaveBinding msb = ShimFactory.eINSTANCE.createMasterSlaveBinding();
			msb.setSlaveComponentRef(slc);

			List<Accessor> accsessorList = msb.getAccessor();

			for (MasterComponent mc : mclist) {
				if (dontConnect) {
					TreeNode tn_slc = sctree.getNodeBySlc(slc);
					TreeNode tn_mc = sctree.getNodeByMc(mc);
					TreeNode tn_slc_parent = tn_slc.getParent();

					if (!(tn_slc_parent.isAncestor(tn_mc) || tn_slc_parent
							.isSibling(tn_mc))) {
						log.finest("---- not connect!!! donotConnect="
								+ dontConnect);
						log.finest("       Node["
								+ tn_slc_parent.getComponentSet().getName()
								+ "] is Not Ancestor of Node["
								+ tn_mc.getMasterComponent().getName());
						continue;
					}
				}

				Accessor accessor = (Accessor) DefaultDataStore
						.getDefaultInstance(ShimPackage.eINSTANCE.getAccessor());
				accessor.setMasterComponentRef(mc);

				AccessTypeSet atset = mc.getAccessTypeSet();

				List<AccessType> atlist = atset.getAccessType();

				List<PerformanceSet> psetlist = accessor.getPerformanceSet();

				PerformanceSet pset = ShimFactory.eINSTANCE.createPerformanceSet();
				psetlist.add(pset);

				List<Performance> plist = pset.getPerformance();

				// for number of MasterComponent's accessType
				for (AccessType at : atlist) {
					Latency latency = (Latency) DefaultDataStore
							.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());

					Pitch pitch = (Pitch) DefaultDataStore
							.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());

					Performance pm = ShimFactory.eINSTANCE.createPerformance();
					pm.setAccessTypeRef(at);
					pm.setLatency(latency);
					pm.setPitch(pitch);

					plist.add(pm);
				}

				accsessorList.add(accessor);

			}
			msblist.add(msb);

		}
		subspace.setMasterSlaveBindingSet(msbset);
	}

	private static final String[] instarray = { "ret", "br", "switch",
			"indirectbr", "invoke", "resume", "unreachable", "add", "fadd",
			"sub", "fsub", "mul", "fmul", "udiv", "sdiv", "fdiv", "urem",
			"srem", "frem", "shl", "lshr", "ashr", "and", "or", "xor",
			"extractelement", "insertelement", "shufflevector",
			"extractivalue", "insertvalue", "alloca", "load", "store", "fence",
			"cmpxchg", "atomicrmw", "getelementptr", "trunc", "zext", "sext",
			"fptrunc", "fpext", "fptoui", "uitofp", "sitofp", "ptrtoint",
			"uitofp", "sitofp", "ptrtoint", "inttoptr", "bitcast", "icmp",
			"fcmp", "phi", "select", "call", "va_arg", "landingpad" };

	/**
	 * Sets CommonInstructionSet to the MasterComponents which is included the
	 * specified ComponentSet.
	 * 
	 * @param cs
	 *            the ComponentSet which includes MasterComponents to be set
	 *            CommonInstructionSet
	 * @param hname
	 *            the base name
	 */
	public static void setCommonInstructionSetToMasterComponent(
			ComponentSet cs, String hname) {
		if (cs.getMasterComponent().size() > 0) {
			for (MasterComponent mc : cs.getMasterComponent()) {
				setCommonInstructionSetToSingleMasterComponent(mc);
			}
		}
		if (cs.getComponentSet().size() > 0) {
			int no = 0;
			for (ComponentSet cset : cs.getComponentSet()) {
				log.finest(" cs name= " + cset.getName());
				setCommonInstructionSetToMasterComponent(cset, hname + "_" + no);
				no++;
			}
		}

		return;
	}

	/**
	 * Sets CommonInstructionSet to the specified MasterComponent.
	 * 
	 * @param mc
	 *            the MasterComponent to be set
	 */
	public static void setCommonInstructionSetToSingleMasterComponent(
			MasterComponent mc) {
		CommonInstructionSet ciset = ShimFactory.eINSTANCE.createCommonInstructionSet();
		FunctionalUnitSet fuset = ShimFactory.eINSTANCE.createFunctionalUnitSet();
		FunctionalUnit fu = ShimFactory.eINSTANCE.createFunctionalUnit();
		ciset.setName("LLVM Instructions");

		fuset.getFunctionalUnit().add(fu);
		ciset.setFunctionalUnitSet(fuset);
		mc.setCommonInstructionSet(ciset);

		for (int j = 0; j < instarray.length; j++) {
			String instname = instarray[j];

			Instruction inst = ShimFactory.eINSTANCE.createInstruction();
			inst.setName(instname);

			Latency latency = (Latency) DefaultDataStore
					.getDefaultInstance(ShimPackage.eINSTANCE.getLatency());

			Pitch pitch = (Pitch) DefaultDataStore
					.getDefaultInstance(ShimPackage.eINSTANCE.getPitch());

			Performance pf = ShimFactory.eINSTANCE.createPerformance();
			pf.setLatency(latency);
			pf.setPitch(pitch);

			inst.setPerformance(pf);
			fu.getInstruction().add(inst);
		}
	}

	/**
	 * Renames components with auto-numbering.
	 * 
	 * @param shim
	 *            a Shim
	 */
	public static void reNummberComponentName(Shim shim) {

		SystemConfiguration sys = shim.getSystemConfiguration();

		log.finest("reNummberComponentName called");

		ComponentSet cb = (ComponentSet) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getComponentSet());
		MasterComponent mb = (MasterComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getMasterComponent());
		SlaveComponent sb = (SlaveComponent) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSlaveComponent());

		reNummberComponentName(sys.getComponentSet(), 0, "0", mb.getName(),
				sb.getName(), cb.getName());

		return;
	}

	/**
	 * Renames components with auto-numbering
	 * 
	 * @param cs
	 *            the ComponentSet to be renamed
	 * @param level
	 *            the level of component tree
	 * @param hstr
	 *            the lot number that is expressed by the '0_0_..._0' format<br>
	 *            (Start is "0")
	 * @param mb
	 *            the base name of MasterComponent
	 * @param sb
	 *            the base name of SlaveComponent
	 * @param cb
	 *            the base name of ComponentSet
	 */
	public static void reNummberComponentName(ComponentSet cs, int level,
			String hstr, String mb, String sb, String cb) {

		int nc0 = 0;
		for (Cache c : cs.getCache()) {
			if (c.getCacheType() == CacheType.DATA) {
				c.setName("DataChache_" + hstr + "_" + nc0);
			} else if (c.getCacheType() == CacheType.INSTRUCTION) {
				c.setName("InstructionCache_" + hstr + "_" + nc0);
			} else if (c.getCacheType() == CacheType.UNIFIED) {
				c.setName("UnifiedCache_" + hstr + "_" + nc0);
			} else {
				c.setName("UnknownType_Cache_" + hstr + "_" + nc0);
			}
			log.finest(space(level + 1) + "[CS/Cache]" + c.getName());
			nc0++;
		}

		if (cs.getMasterComponent().size() > 0) {
			for (int i = 0; i < cs.getMasterComponent().size(); i++) {
				MasterComponent mc = cs.getMasterComponent().get(i);
				mc.setName(mb + "_" + hstr + "_" + i);
				log.finest(space(level) + "[MC]" + mc.getName());

				int nc = 0;
				for (Cache c : mc.getCacheRef()) {
					if (c.getCacheType() == CacheType.DATA) {
						c.setName("DataChache_" + hstr + "_" + i + "_" + nc);
					} else if (c.getCacheType() == CacheType.INSTRUCTION) {
						c.setName("InstructionCache_" + hstr + "_" + i + "_"
								+ nc);
					} else if (c.getCacheType() == CacheType.UNIFIED) {
						c.setName("UnifiedCache_" + hstr + "_" + i + "_" + nc);
					} else {
						c.setName("UnknownType_Cache_" + hstr + "_" + i + "_"
								+ nc);
					}
					log.finest(space(level + 1) + "[MC/Cache]" + c.getName());
					nc++;
				}

				if (mc.getAccessTypeSet() != null) {
					int nat = 0;
					for (AccessType at : mc.getAccessTypeSet().getAccessType()) {
						at.setName("AT_" + hstr + "_" + i + "_" + nat);
						nat++;
					}
				}

			}
		}
		if (cs.getSlaveComponent().size() > 0) {
			for (int i = 0; i < cs.getSlaveComponent().size(); i++) {
				SlaveComponent slc = cs.getSlaveComponent().get(i);
				slc.setName(sb + "_" + hstr + "_" + i);
				log.finest(space(level) + "[SL]" + slc.getName());
			}
		}
		if (cs.getComponentSet().size() > 0) {
			for (int i = 0; i < cs.getComponentSet().size(); i++) {
				ComponentSet cset = cs.getComponentSet().get(i);
				cset.setName(cb + "_" + hstr + "_" + i);
				log.finest(space(level) + "[CS]" + cset.getName());
				reNummberComponentName(cset, level + 1, hstr + "_" + i, mb, sb,
						cb);
			}
		}
		return;
	}

	/**
	 * Returns space which length is according to the specified level.
	 * 
	 * @param level
	 *            the level of ComponentTree
	 * @return space which length is according to the specified level
	 */
	static String space(int level) {
		String s = String.format("%03d : ", level);
		for (int i = 0; i < level; i++) {
			s = s + "-";
		}
		return s;
	}

	/**
	 * Renames AddressSpaces and SubSpaces with auto-numbering.
	 * 
	 * @param shim
	 *            a Shim
	 */
	public static void reNumberAddressSpaceName(Shim shim) {

		SystemConfiguration sys = shim.getSystemConfiguration();
		log.finest("reNumberAddressSpaceName called");

		AddressSpace as = (AddressSpace) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getAddressSpace());
		SubSpace ss = (SubSpace) DefaultDataStore
				.getDefaultInstance(ShimPackage.eINSTANCE.getSubSpace());

		reNumberAddressSpaceName(sys.getAddressSpaceSet(), 0, "0",
				as.getName(), ss.getName());

		return;
	}

	/**
	 * Renames AddressSpaces and SubSpaces with auto-numbering
	 * 
	 * @param ass
	 *            the AddressSpaceSet which contains AddressSpaces and SubSpaces
	 *            to auto-number
	 * @param level
	 *            the level of component tree
	 * @param hstr
	 *            the lot number that is expressed by the '0_0_..._0' format<br>
	 *            (Start is "0")
	 * @param asName
	 *            the base name of AddressSpace
	 * @param ssName
	 *            the base name of SubSpace
	 */
	private static void reNumberAddressSpaceName(AddressSpaceSet ass,
			int level, String hstr, String asName, String ssName) {

		int i = 0;
		List<AddressSpace> asList = ass.getAddressSpace();
		String _sp = space(level);
		for (AddressSpace as : asList) {
			as.setName(asName + "_" + hstr + "_" + i);
			log.finest(_sp + "[AS]" + as.getName());

			int j = 0;
			List<SubSpace> ssList = as.getSubSpace();
			for (SubSpace ss : ssList) {
				ss.setName(ssName + "_" + hstr + "_" + j);
				log.finest(_sp + "[SS]" + ss.getName());
				j++;
			}
			i++;
		}
		return;
	}

	public static MasterComponent findParentRefMasterComponent(Performance performance) {
		MasterComponent result = null;

		if (performance == null) {
			return null;
		}
		Shim shim = ShimUtils.getShim(performance);

		SystemConfiguration currentScd = shim.getSystemConfiguration();
		if (currentScd == null) {
			return null;
		}

		List<AddressSpace> addressSpaceList = currentScd.getAddressSpaceSet()
				.getAddressSpace();
		outer_loop: for (AddressSpace addressSpace : addressSpaceList) {
			List<SubSpace> subSpaceList = addressSpace.getSubSpace();

			for (SubSpace subSpace : subSpaceList) {
				MasterSlaveBindingSet masterSlaveBindingSet = subSpace
						.getMasterSlaveBindingSet();
				if (masterSlaveBindingSet == null) {
					continue;
				}

				List<MasterSlaveBinding> masterSlaveBindingList = masterSlaveBindingSet
						.getMasterSlaveBinding();
				for (MasterSlaveBinding masterSlaveBinding : masterSlaveBindingList) {
					List<Accessor> accessorList = masterSlaveBinding
							.getAccessor();
					for (Accessor accessor : accessorList) {
						MasterComponent masterComponentRef = (MasterComponent) accessor
								.getMasterComponentRef();

						boolean contain = false;
						List<PerformanceSet> performanceSetList = accessor
								.getPerformanceSet();
						for (PerformanceSet performanceSet : performanceSetList) {
							List<Performance> performanceList = performanceSet
									.getPerformance();
							if (performanceList.contains(performance)) {
								contain = true;
								break;
							}
						}

						if (contain) {
							result = masterComponentRef;
							break outer_loop;
						}
					}
				}
			}
		}

		return result;
	}

	/**
	 * Initialize the instance.
	 * 
	 * @param object
	 *            the instance
	 * @param suffix
	 *            suffix of the name
	 * @return true if the instance is initialized
	 */
	public static boolean initObject(EObject object, String suffix) {
		if (object instanceof ComponentSet) {
			DefaultDataStore.initInstance(object, false, false);
			initComponentSet((ComponentSet) object, suffix);
			return true;
		} else if (object instanceof MasterComponent) {
			DefaultDataStore.initInstance(object, false, false);
			initMasterComponent((MasterComponent) object, suffix);
			return true;
		} else if (object instanceof SlaveComponent) {
			DefaultDataStore.initInstance(object, false, false);
			initSlaveComponent((SlaveComponent) object, suffix);
			return true;
		}
		return false;
	}
}
