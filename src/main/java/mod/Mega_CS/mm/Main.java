package mod.Mega_CS.mm;

import mod.Mega_CS.mm.init.RecipeInit;
import mod.Mega_CS.mm.proxy.CommonProxy;
import mod.Mega_CS.mm.tabs.MCrafterzzModBuildingTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModMapMakingTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModSmallerBuildingBlocksTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModToolsTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModWorkInProgressTab;
import mod.Mega_CS.mm.tabs.MCrafterzzModWorldTab;
import mod.Mega_CS.mm.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main {
	@Instance
	public static Main instance;
	
	public static final CreativeTabs MOD_TAB = new MCrafterzzModTab("modTab");
	public static final CreativeTabs BUILD_TAB = new MCrafterzzModBuildingTab("buildTab");
	public static final CreativeTabs MAP_MAKING_TAB = new MCrafterzzModMapMakingTab("mapTab");
	public static final CreativeTabs SMALL_BUILD_TAB = new MCrafterzzModSmallerBuildingBlocksTab("smallBuildTab");
	public static final CreativeTabs TOOLS_TAB = new MCrafterzzModToolsTab("toolTab");
	public static final CreativeTabs WIP_TAB = new MCrafterzzModWorkInProgressTab("wipTab");
	public static final CreativeTabs WORLD_TAB = new MCrafterzzModWorldTab("worldTab");
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.COMMON_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		
	}
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		RecipeInit.init();
	}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		
	}
}
