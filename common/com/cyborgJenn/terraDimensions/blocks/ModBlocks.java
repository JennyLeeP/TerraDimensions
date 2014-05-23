package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.ReferenceBlock;
import com.cyborgJenn.terraDimensions.utils.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class ModBlocks {

	public static Block gateVerdant;
	public static Block gateMala;
	public static Block gateGalifrey;
	public static BlockVerdantPortal verdantPortal;
	public static Block malaPortal;
	public static Block galifreyPortal;
	public static Block verdantGrass;
	public static Block malaGrass;
	public static Block galifreyGrass;
	public static Block verdantDirt;
	public static Block malaDirt;
	public static Block galifreyDirt;
	public static Block verdantStone;
	public static Block malaStone;
	public static Block galifreyStone;
	public static Block malaStone1;
	public static Block verdantStone1;
	public static Block terraSand;
	public static Block terraGravel;
	public static Block verdantLogs;
	public static Block malaLogs;
	public static Block terraLeaves;
	public static Block terraPlanks;
	public static Block terraSaplings;
	public static Block terraWalls;
	public static Block terraFlowers;
	public static Block terraFences;
	public static Block peat;
	public static Block bogg;
	public static Block chalk;
	public static Block sphagnumMoss;
	public static Block shells;
	public static Block beachGrass;

	public static void initBlocks(){
		// Gate Blocks
		gateVerdant = new BlockTerraDimensions(0, Material.rock).setBlockName("gateVerdant");
		gateMala = new BlockTerraDimensions(0, Material.rock).setBlockName("gateMala");
		gateGalifrey = new BlockTerraDimensions(0, Material.rock).setBlockName("gateGalifrey");
		// Portal Blocks
		verdantPortal = (BlockVerdantPortal) new BlockVerdantPortal().setBlockName("verdantPortal");
		malaPortal = new BlockMalaPortal().setBlockName("malaPortal");
		galifreyPortal = new BlockGalifreyPortal().setBlockName("galifreyPortal");
		// Grass Blocks
		verdantGrass = new BlockVerdantGrass(0).setBlockName("verdantGrass");
		malaGrass = new BlockMalaGrass(0).setBlockName("malaGrass");
		galifreyGrass = new BlockGalifreyGrass(0).setBlockName("galifreyGrass");
		beachGrass = new BlockBeachGrass().setBlockName("beachGrass");
		// Dirty Ground type  Blocks
		verdantDirt = new BlockTerraDimensions(2, Material.ground).setBlockName("verdantDirt");
		malaDirt = new BlockTerraDimensions(2, Material.ground).setBlockName("malaDirt");
		galifreyDirt = new BlockTerraDimensions(2, Material.ground).setBlockName("galifreyDirt");
		peat = new BlockTerraDimensions(2, Material.ground).setBlockName("peat");
		bogg = new BlockBogg().setBlockName("bogg");
		// Sand & Gravel Blocks
		terraSand = new BlockTerraSand().setBlockName("terraSand");
		terraGravel = new BlockTerraGravel().setBlockName("terraGravel");
		/* Stone Blocks */
		verdantStone = new BlockTerraDimensions(1, Material.rock).setBlockName("verdantStone_alt");
		verdantStone1 = new BlockVerdantStone1().setBlockName("verdantStone1");
		
		malaStone = new BlockTerraDimensions(1, Material.rock).setBlockName("malaStone");
		malaStone1 = new BlockMalaStone1().setBlockName("malaStone1");
		
		galifreyStone = new BlockTerraDimensions(1, Material.rock).setBlockName("galifreyStone");
		
		/* Misc Blocks */
		chalk = new BlockChalk().setBlockName("chalk");
		shells = new BlockShells().setBlockName("shells");
		/* Fences and Walls */
		terraWalls = new BlockTerraWall(verdantStone1).setBlockName("terraWalls");
		terraFences = new BlockTerraFences().setBlockName("terraFences");
		/* Tree Blocks */
		verdantLogs = new BlockVerdantLogs().setBlockName("verdantLogs");
		malaLogs = new BlockMalaLogs().setBlockName("malaLogs");
		terraLeaves= new BlockTerraLeaves().setBlockName("terraLeaves");
		terraPlanks = new BlockTerraPlanks().setBlockName("terraPlanks");
		terraSaplings = new BlockTerraSaplings().setBlockName(ReferenceBlock.TERRASAPLINGS);
		
		// Plants & Vines
		terraFlowers = new BlockTerraFlowers().setBlockName("terraFlowers");
		sphagnumMoss = new BlockSphagnumMoss().setBlockName("sphagnumMoss");
		
		// Ores Vanilla
		
		// Ores TerraDimensions
		
		// Ores Mod Support
		

		Registry.registerBlocks();
	}
}
