package com.cyborgJenn.terraDimensions;

import net.minecraft.creativetab.CreativeTabs;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.handlers.TerraFluidsHandler;
import com.cyborgJenn.terraDimensions.proxy.CommonProxy;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Dictionary;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.Registry;
import com.cyborgJenn.terraDimensions.utils.TerraDimensionTabs;
import com.cyborgJenn.terraDimensions.world.biome.ModBiomes;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class TerraDimensions {

	@Instance(Reference.NAME)
	public static TerraDimensions  instance;

	@SidedProxy(clientSide = Reference.CLIENTPROXY, serverSide = Reference.SERVERPROXY)
	public static CommonProxy proxy;

	// Declares a new Creative Tab
	public static CreativeTabs tabTerraDimensions = new TerraDimensionTabs(CreativeTabs.getNextID(), Reference.TABTERRADIMENSIONS);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {

		// Loads the Configuration File
		Config.init(event);
		ModBlocks.initBlocks();
		ModBiomes.init();
		ModItems.init();
		Registry.register();
		TerraFluidsHandler.addFluids();
		
		// Forge Dictionary registry
		Dictionary.register();
		proxy.registerRenderers();
		System.out.println("[TerraDimensions] " + "Pre Init Complete..........");

	}
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		System.out.println("[TerraDimensions] " + "Init Complete.............");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		

		System.out.println("[TerraDimensions] " + "Post Init Complete.............");
	}
}
