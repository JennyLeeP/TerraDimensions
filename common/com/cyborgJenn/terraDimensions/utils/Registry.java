package com.cyborgJenn.terraDimensions.utils;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.entity.EntityLavaMite;
import com.cyborgJenn.terraDimensions.entity.EntityNMCreeper;
import com.cyborgJenn.terraDimensions.entity.EntityPhoenix;
import com.cyborgJenn.terraDimensions.entity.EntityPurpleSlimer;
import com.cyborgJenn.terraDimensions.entity.EntitySonicCreeper;
import com.cyborgJenn.terraDimensions.entity.EntitySpud;
import com.cyborgJenn.terraDimensions.handlers.RecipeHandler;
import com.cyborgJenn.terraDimensions.handlers.TerraEventHandler;
import com.cyborgJenn.terraDimensions.handlers.TerraFuelHandler;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockMalaLogs;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockMalaStoneSet1;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraFlowers;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraGravel;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraOreSet1;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraOreSet2;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraSand;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraWalls;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraWood;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockVerdantLogs;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockVerdantStoneSet1;
import com.cyborgJenn.terraDimensions.village.VillagerTrades;
import com.cyborgJenn.terraDimensions.world.TMalaWorldProvider;
import com.cyborgJenn.terraDimensions.world.TVerdantWorldProvider;
import com.cyborgJenn.terraDimensions.world.biome.ModBiomes;

import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.VillagerRegistry;


public class Registry {

	public static void register() {

		registerItems();

		registerFuels();

		registerTileEntities();

		registerMobs();

		registerVillagers();

		registerDimension();

		registerEvents();

		RecipeHandler.addRecipes();
	}

	public static void registerBlocks() {
		// Gate Blocks
		GameRegistry.registerBlock(ModBlocks.gateVerdant, ModBlocks.gateVerdant.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.gateMala, ModBlocks.gateMala.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.gateGalifrey, ModBlocks.gateGalifrey.getUnlocalizedName());
		// Portal Blocks
		GameRegistry.registerBlock(ModBlocks.verdantPortal, ModBlocks.verdantPortal.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaPortal, ModBlocks.malaPortal.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyPortal, ModBlocks.galifreyPortal.getUnlocalizedName());
		// Grass Blocks
		GameRegistry.registerBlock(ModBlocks.verdantGrass, ModBlocks.verdantGrass.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaGrass, ModBlocks.malaGrass.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyGrass, ModBlocks.galifreyGrass.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.beachGrass, ModBlocks.beachGrass.getUnlocalizedName());
		// Dirty Ground Blocks
		GameRegistry.registerBlock(ModBlocks.verdantDirt, ModBlocks.verdantDirt.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaDirt, ModBlocks.malaDirt.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyDirt, ModBlocks.galifreyDirt.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.peat, ModBlocks.peat.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.bogg, ModBlocks.bogg.getUnlocalizedName());
		// Sand & Gravel Blocks
		GameRegistry.registerBlock(ModBlocks.terraSand, ItemBlockTerraSand.class, ModBlocks.terraSand.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraGravel, ItemBlockTerraGravel.class, ModBlocks.terraGravel.getUnlocalizedName());
		// Stone Blocks
		GameRegistry.registerBlock(ModBlocks.verdantStone, ModBlocks.verdantStone.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.verdantStone1, ItemBlockVerdantStoneSet1.class, ModBlocks.verdantStone1.getUnlocalizedName());
		
		GameRegistry.registerBlock(ModBlocks.malaStone, ModBlocks.malaStone.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaStone1, ItemBlockMalaStoneSet1.class, ModBlocks.malaStone1.getUnlocalizedName());
		/* Tree and Wood Blocks */
		GameRegistry.registerBlock(ModBlocks.verdantLogs, ItemBlockVerdantLogs.class, ModBlocks.verdantLogs.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaLogs, ItemBlockMalaLogs.class, ModBlocks.malaLogs.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraLeaves, ItemBlockTerraWood.class,ModBlocks.terraLeaves.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraPlanks, ItemBlockTerraWood.class, ModBlocks.terraPlanks.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraSaplings, ItemBlockTerraWood.class, ModBlocks.terraSaplings.getUnlocalizedName());
		/* Misc Block */
		GameRegistry.registerBlock(ModBlocks.chalk, ModBlocks.chalk.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.shells, ModBlocks.shells.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.cursedStone, ModBlocks.cursedStone.getUnlocalizedName());
		// Plants & Vines
		GameRegistry.registerBlock(ModBlocks.terraFlowers, ItemBlockTerraFlowers.class, ModBlocks.terraFlowers.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.sphagnumMoss, ModBlocks.sphagnumMoss.getUnlocalizedName());
		
		/* Walls and Fences */
		GameRegistry.registerBlock(ModBlocks.terraWalls, ItemBlockTerraWalls.class, ModBlocks.terraWalls.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraFences, ItemBlockTerraWood.class, ModBlocks.terraFences.getUnlocalizedName());
		// Ores Vanilla
		GameRegistry.registerBlock(ModBlocks.terraOreSet1, ItemBlockTerraOreSet1.class, ModBlocks.terraOreSet1.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraOreSet2, ItemBlockTerraOreSet2.class, ModBlocks.terraOreSet2.getUnlocalizedName());
		// Ores TerraDimensions

		// Ores Mod Support
		/*
        GameRegistry.registerBlock(ModBlocks.oreLucidity, "OreLucidity");
        GameRegistry.registerBlock(ModBlocks.oreBlocks, ItemDreamOres.class, "oreBlocks");
        GameRegistry.registerBlock(ModBlocks.dreamCobble, "Dream_Cobble");
        GameRegistry.registerBlock(ModBlocks.dreamStairs, "Dream_Stairs");
        /*
        
        //GameRegistry.registerBlock(ModBlocks.dreamWoodSlabs, ItemDreamSlabs.class, "Dream_Wood_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamStoneSlabs, ItemDreamStoneSlabs.class, "Dream_Stone_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamWoodDBLSlabs, ItemDreamSlabs.class, "Dream_Wood_DBL_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamStoneDBLSlabs, ItemDreamStoneSlabs.class, "Dream_Stone_DBL_Slabs");
        GameRegistry.registerBlock(ModBlocks.nmCobble, "NM_Cobble");
        GameRegistry.registerBlock(ModBlocks.nmStairs, "NM_Stairs");
        GameRegistry.registerBlock(ModBlocks.bloodStairs, "Blood_Stairs");
        GameRegistry.registerBlock(ModBlocks.oreMethaneClathrate, "Ore_Methane_Clathrate");
        */
        
        /*
        GameRegistry.registerBlock(ModBlocks.chickenAlter, "Chicken_Alter");
		 */
		System.out.println("[TerraDimensions] " + "Block Register Complete.............");
	}
	/*
	 * Register Items
	 */
	private static void registerItems() {
		
        GameRegistry.registerItem(ModItems.itemActiveMalaPortalKey, ReferenceItem.ItemActiveMalaPortalKey);
        GameRegistry.registerItem(ModItems.itemDarkenedMalaPortalKey, ReferenceItem.ItemDarkenedMalaPortalKey);
        GameRegistry.registerItem(ModItems.itemDarkenedCore, ReferenceItem.ItemDarkenedCore);
        GameRegistry.registerItem(ModItems.itemActiveVerdantPortalKey, ReferenceItem.ItemActiveVerdantPortalKey);
        GameRegistry.registerItem(ModItems.itemEnlightenedVerdantPortalKey, ReferenceItem.ItemEnlightenedVerdantPortalKey);
        GameRegistry.registerItem(ModItems.itemEnlightenedCore, ReferenceItem.ItemEnlightenedCore);
        
        GameRegistry.registerItem(ModItems.itemWhiteDye, ReferenceItem.ItemWhiteDye);
        GameRegistry.registerItem(ModItems.itemBlackDye, ReferenceItem.ItemBlackDye);
        GameRegistry.registerItem(ModItems.itemBrownDye, ReferenceItem.ItemBrownDye);
        
        GameRegistry.registerItem(ModItems.chalkShard, ReferenceItem.ChalkShard);
        GameRegistry.registerItem(ModItems.sphagnumMoss, ReferenceItem.SphagnumMoss);
        GameRegistry.registerItem(ModItems.peat, ReferenceItem.Peat);
        GameRegistry.registerItem(ModItems.shells, ReferenceItem.Shells);
        
        GameRegistry.registerItem(ModItems.itemMethaneClathrate, ReferenceItem.ItemMethaneClathrate);
        
		 
		System.out.println("[TerraDimensions] " + "Item Register Complete.............");
	}
	/*
	 * Register Fuels
	 */
	private static void registerFuels(){
		GameRegistry.registerFuelHandler(new TerraFuelHandler());
		System.out.println("[TerraDimensions] " + "Fuel Register Complete.............");
	}
	/*
	 * Register Tile Entities
	 */
	private static void registerTileEntities(){
		//ClientRegistry.registerTileEntity(TileChickenAlter.class, Reference.chickenAlter, new RenderChickenAlter());
		System.out.println("[TerraDimensions] " + "TileEntity Register Complete.............");
	}
	/*
	 * Register NPC's er Notch Mobs
	 */
	private static void registerMobs()
	{
		
        //************SONIC CREEPER ***********
        int entityID;
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntitySonicCreeper.class, "SonicCreeper", entityID, 0x6E4875, 0x969696);
        EntityRegistry.addSpawn(EntitySonicCreeper.class, 3, 1, 2, EnumCreatureType.creature, ModBiomes.LushHills);
        
        //************NightMare Creeper *******
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityNMCreeper.class, "NightMareCreeper", entityID, 0x262425, 0x780510);
        EntityRegistry.addSpawn(EntityNMCreeper.class, 3, 1, 2, EnumCreatureType.monster, ModBiomes.TreacherousHills);

        /*   Phoenix */
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityPhoenix.class, "Phoenix", entityID, 0x780510, 0xD16B04);
        
        /* LavaMite */ 
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityLavaMite.class, "lavaMite", entityID, 0x780510, 0xD16B04);
        
        /* PurpleSlimer */
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityPurpleSlimer.class, "purpleSlimer", entityID, 0x780510, 0xD16B04);
        
        /* Spud */
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntitySpud.class, "spud", entityID, 0x171717, 0xCFC184);
        
		System.out.println("[TerraDimensions] " + "Entity Register Complete.............");
	}
	/*
	 * Register Villagers and Village Components
	 */
	private static void registerVillagers(){
		
		final ResourceLocation villagerSkin = new ResourceLocation(Reference.TEXTURE + "textures/mobs/shamanVillager.png");
    	VillagerRegistry.instance().registerVillagerId(Config.keyMasterVillagerID);
    	VillagerRegistry.instance().registerVillagerSkin(Config.keyMasterVillagerID, villagerSkin);
        VillagerRegistry.instance().registerVillageTradeHandler(Config.keyMasterVillagerID,  new VillagerTrades());
		
		System.out.println("[TerraDimensions] " + "Villager Register Complete.............");
	}
	/*
	 * Register Dimensions
	 */
	private static void registerDimension() {

		DimensionManager.registerProviderType(Config.dimensionVerdantID, TVerdantWorldProvider.class, true);//boolean = to keep Dim loaded or not
		DimensionManager.registerDimension(Config.dimensionVerdantID, Config.dimensionVerdantID);

		DimensionManager.registerProviderType(Config.dimensionMalaID, TMalaWorldProvider.class, true);//boolean = to keep Dim loaded or not
		DimensionManager.registerDimension(Config.dimensionMalaID, Config.dimensionMalaID);
		
		DimensionManager.registerProviderType(Config.dimensionGalifreyID, TVerdantWorldProvider.class, true);//boolean = to keep Dim loaded or not
		DimensionManager.registerDimension(Config.dimensionGalifreyID, Config.dimensionGalifreyID);
		
		
		
		System.out.println("[TerraDimensions] " + "Dimension Register Complete.............");
	}
	private static void registerEvents(){

		MinecraftForge.EVENT_BUS.register(new TerraEventHandler());
		
		System.out.println("[TerraDimensions] " + "Event Register Complete.............");
	}
	
}
