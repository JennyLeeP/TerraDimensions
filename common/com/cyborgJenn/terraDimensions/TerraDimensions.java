package com.cyborgJenn.terraDimensions;

import java.util.logging.Logger;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.proxy.CommonProxy;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.Registry;
import com.cyborgJenn.terraDimensions.utils.TerraDimensionTabs;
import com.cyborgJenn.terraDimensions.world.biome.ModBiomes;

import net.minecraft.client.Minecraft;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TerraDimensions {

	@Instance(Reference.NAME)
	public static TerraDimensions  instance;

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static CommonProxy proxy;

	public static Logger logger = Logger.getLogger("TerraDimensions");
	
	// Declares a new Creative Tab
    public static CreativeTabs tabTerraDimensions = new TerraDimensionTabs(CreativeTabs.getNextID(), Reference.TABTERRADIMENSIONS);
    
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//logger.setParent(FMLCommonHandler.instance().getFMLLogger());
		// Loads the Configuration File
		Config.init(event);
		ModBlocks.initBlocks();
		System.out.println("[TerraDimensions] " + "Pre Init Complete..........");

	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		// Does all the game registry stuff
		//Registry.register();
		//Creates the Biomes
		ModBiomes.init();

		System.out.println("[TerraDimensions] " + "Init Complete.............");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{


		System.out.println("[TerraDimensions] " + "Post Init Complete.............");
	}
}
