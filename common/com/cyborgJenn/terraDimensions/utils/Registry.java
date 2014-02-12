package com.cyborgJenn.terraDimensions.utils;

import net.minecraftforge.common.DimensionManager;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockMalaStone1;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraGravel;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraTreeTypes;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockTerraSand;
import com.cyborgJenn.terraDimensions.itemBlock.ItemBlockVerdantStone1;
import com.cyborgJenn.terraDimensions.world.TMalaWorldProvider;
import com.cyborgJenn.terraDimensions.world.TVerdantWorldProvider;

import cpw.mods.fml.common.registry.GameRegistry;


public class Registry {

	public static void register() {

		registerItems();

		registerFuels();

		registerTileEntities();

		registerMobs();

		registerVillagers();

		registerDimension();

		registerEvents();

		addHarvestLevels();

		//RecipeHandler.add();
	}

	public static void registerBlocks() {
		// Gate Blocks
		GameRegistry.registerBlock(ModBlocks.gateVerdant, ModBlocks.gateVerdant.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.gateMala, ModBlocks.gateMala.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.gateGalifrey, ModBlocks.gateGalifrey.getUnlocalizedName());
		// Portal Blocks
		GameRegistry.registerBlock(ModBlocks.verdantPortal, "DreamLand_Portal");
		GameRegistry.registerBlock(ModBlocks.malaPortal, ModBlocks.malaPortal.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyPortal, ModBlocks.galifreyPortal.getUnlocalizedName());
		// Grass Blocks
		GameRegistry.registerBlock(ModBlocks.verdantGrass, ModBlocks.verdantGrass.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaGrass, ModBlocks.malaGrass.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyGrass, ModBlocks.galifreyGrass.getUnlocalizedName());
		// Dirt Blocks
		GameRegistry.registerBlock(ModBlocks.verdantDirt, ModBlocks.verdantDirt.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.malaDirt, ModBlocks.malaDirt.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.galifreyDirt, ModBlocks.galifreyDirt.getUnlocalizedName());
		// Sand & Gravel Blocks
		GameRegistry.registerBlock(ModBlocks.terraSand, ItemBlockTerraSand.class, ModBlocks.terraSand.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.terraGravel, ItemBlockTerraGravel.class, ModBlocks.terraGravel.getUnlocalizedName());
		// Stone Blocks
		GameRegistry.registerBlock(ModBlocks.malaStone1, ItemBlockMalaStone1.class, ModBlocks.malaStone1.getUnlocalizedName());
		GameRegistry.registerBlock(ModBlocks.verdantStone1, ItemBlockVerdantStone1.class, ModBlocks.verdantStone1.getUnlocalizedName());
		// Tree Blocks
		//GameRegistry.registerBlock(ModBlocks.verdantLogs, ModBlocks.verdantLogs.getUnlocalizedName());
		//GameRegistry.registerBlock(ModBlocks.malaLogs, ModBlocks.malaLogs.getUnlocalizedName());
		//GameRegistry.registerBlock(ModBlocks.terraLeaves, ItemBlockTerraTreeTypes.class,ModBlocks.terraLeaves.getUnlocalizedName());
		//GameRegistry.registerBlock(ModBlocks.terraPlanks, ItemBlockTerraTreeTypes.class, ModBlocks.terraPlanks.getUnlocalizedName());
		//GameRegistry.registerBlock(ModBlocks.terraSaplings, ItemBlockTerraTreeTypes.class, ModBlocks.terraSaplings.getUnlocalizedName());
		// Plants & Vines

		// Ores Vanilla

		// Ores TerraDimensions

		// Ores Mod Support

		// Liquids
		/*
        GameRegistry.registerBlock(ModBlocks.portalObsidian, "Obsidiatal");
        
        GameRegistry.registerBlock(ModBlocks.dreamStone, "Dream_Stone");
        GameRegistry.registerBlock(ModBlocks.dreamStones, ItemDreamStone.class,"Dream_Stones");
        
        
        GameRegistry.registerBlock(ModBlocks.oreLucidity, "OreLucidity");
        GameRegistry.registerBlock(ModBlocks.oreBlocks, ItemDreamOres.class, "oreBlocks");
        GameRegistry.registerBlock(ModBlocks.dreamCobble, "Dream_Cobble");
        GameRegistry.registerBlock(ModBlocks.dreamStairs, "Dream_Stairs");
        GameRegistry.registerBlock(ModBlocks.dreamLogs, ItemDreamTrees.class, "Dream_Logs");
        GameRegistry.registerBlock(ModBlocks.nmLogs, ItemNMTrees.class, "NM_Logs");
        GameRegistry.registerBlock(ModBlocks.dreamPlanks, ItemDreamWoodBlock.class,"Dream_Planks");
        GameRegistry.registerBlock(ModBlocks.dreamLeaves, ItemDreamWoodBlock.class, "Dream_Leaves");
        GameRegistry.registerBlock(ModBlocks.dreamSaplings, ItemDreamWoodBlock.class,"Dream_Saplings");
        GameRegistry.registerBlock(ModBlocks.dreamWall, ItemBlockDreamWall.class, "Dream_Wall");
        GameRegistry.registerBlock(ModBlocks.dreamFalling, ItemBlockFalling.class, "Dream_Falling");
        
        GameRegistry.registerBlock(ModBlocks.nmStone, "NM_Stone");
        GameRegistry.registerBlock(ModBlocks.dreamFence, ItemDreamWoodBlock.class, "Dream_Fence");
        //GameRegistry.registerBlock(ModBlocks.dreamWoodSlabs, ItemDreamSlabs.class, "Dream_Wood_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamStoneSlabs, ItemDreamStoneSlabs.class, "Dream_Stone_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamWoodDBLSlabs, ItemDreamSlabs.class, "Dream_Wood_DBL_Slabs");
        //GameRegistry.registerBlock(ModBlocks.dreamStoneDBLSlabs, ItemDreamStoneSlabs.class, "Dream_Stone_DBL_Slabs");
        GameRegistry.registerBlock(ModBlocks.nmCobble, "NM_Cobble");
        GameRegistry.registerBlock(ModBlocks.nmStairs, "NM_Stairs");
        GameRegistry.registerBlock(ModBlocks.bloodStairs, "Blood_Stairs");
        GameRegistry.registerBlock(ModBlocks.oreMethaneClathrate, "Ore_Methane_Clathrate");
        GameRegistry.registerBlock(ModBlocks.dreamFlowers, ItemDreamFlowers.class, "Dream_Flowers");
        GameRegistry.registerBlock(ModBlocks.chickenAlter, "Chicken_Alter");
		 */
		System.out.println("[TerraDimensions] " + "Block Register Complete.............");
	}
	/*
	 * Register Items
	 */
	private static void registerItems() {
		/*
        GameRegistry.registerItem(ModItems.itemlighter, "Boom Stick");
        GameRegistry.registerItem(ModItems.itemSwordPhantomIron, "Phantom Sword");
        GameRegistry.registerItem(ModItems.itemLucidity, "Lucidity");
        GameRegistry.registerItem(ModItems.itemMethaneClathrate, "Methane Clathrate");
		 */
		System.out.println("[TerraDimensions] " + "Item Register Complete.............");
	}
	/*
	 * Register Fuels
	 */
	private static void registerFuels(){
		//GameRegistry.registerFuelHandler(new DreamLandFuelHandler());
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
		/*
        //************SONIC CREEPER ***********
        int entityID;
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntitySonicCreeper.class, "SonicCreeper", entityID);
        EntityRegistry.addSpawn(EntitySonicCreeper.class, 3, 1, 2, EnumCreatureType.creature, ModBiomes.LushHills);
        EntityList.addMapping(EntitySonicCreeper.class, "SonicCreeper", entityID, 0x6E4875, 0x969696);
        //************NightMare Creeper *******
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityNMCreeper.class, "NightMareCreeper", entityID);
        EntityRegistry.addSpawn(EntityNMCreeper.class, 3, 1, 2, EnumCreatureType.monster, ModBiomes.TreacherousHills);
        EntityList.addMapping(EntityNMCreeper.class, "NightMareCreeper", entityID, 0x262425, 0x780510);
        //*************Ibong Adarna************



        //************Phoenix******************
        entityID = EntityRegistry.findGlobalUniqueEntityId();
        EntityRegistry.registerGlobalEntityID(EntityPhoenix.class, "Phoenix", entityID);
        EntityList.addMapping(EntityPhoenix.class, "Phoenix", entityID, 0x780510, 0xD16B04);
        //************Fire_Fish****************
		 */
		System.out.println("[TerraDimensions] " + "Entity Register Complete.............");
	}
	/*
	 * Register Villagers and Village Components
	 */
	private static void registerVillagers(){
		//VillagerRegistry.instance().registerVillagerType(Config.shamanVillagerID, Reference.mobTexture +"shamanVillager.png");
		//VillagerRegistry.instance().registerVillageTradeHandler(Config.shamanVillagerID,  new VillagerTrades());
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
		System.out.println("[TerraDimensions] " + "Dimension Register Complete.............");
	}
	private static void registerEvents(){

		//MinecraftForge.EVENT_BUS.register(new EventHookHandler());

		//MinecraftForge.EVENT_BUS.register(new DreamLand_EventBonemeal());
		System.out.println("[TerraDimensions] " + "Event Register Complete.............");
	}
	/** Harvest Levels : 3 = diamond, 2 = iron, 1 = stone and 0 = wood/gold*/
	public static void addHarvestLevels(){

		//MinecraftForge.setBlockHarvestLevel(ModBlocks.gateVerdant, "pickaxe", 3);
		System.out.println("[TerraDimensions] " + "Added Block Harvest Levels.............");

	}
}
