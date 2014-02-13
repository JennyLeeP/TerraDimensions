package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static Block gateVerdant;
	public static Block gateMala;
	public static Block gateGalifrey;
	public static Block verdantPortal;
	public static Block malaPortal;
	public static Block galifreyPortal;
	public static Block verdantGrass;
	public static Block malaGrass;
	public static Block galifreyGrass;
	public static Block verdantDirt;
	public static Block malaDirt;
	public static Block galifreyDirt;
	public static Block malaStone1;
	public static Block verdantStone1;
	public static Block terraSand;
	public static Block terraGravel;
	public static Block verdantLogs;
	public static Block malaLogs;
	public static Block terraLeaves;
	public static Block terraPlanks;
	public static Block terraSaplings;
	
	public static void initBlocks(){
		// Gate Blocks
		gateVerdant = new BlockTerraDimensions(0).setBlockName("gateVerdant").setHardness(3.0F).setLightLevel(1.0F).setResistance(2000.0F);
		gateMala = new BlockTerraDimensions(1).setBlockName("gateMala").setHardness(3.0F).setLightLevel(1.0F).setResistance(2000.0F);
		gateGalifrey = new BlockTerraDimensions(2).setBlockName("gateGalifrey").setHardness(3.0F).setLightLevel(1.0F).setResistance(2000.0F);
		// Portal Blocks
		verdantPortal = new BlockTerraPortal(0).setBlockName("verdantPortal");
		malaPortal = new BlockTerraPortal(1).setBlockName("malaPortal");
		galifreyPortal = new BlockTerraPortal(2).setBlockName("galifreyPortal");
		// Grass Blocks
		verdantGrass = new BlockTerraGrass(0).setBlockName("verdantGrass");
		malaGrass = new BlockTerraGrass(1).setBlockName("malaGrass");
		galifreyGrass = new BlockTerraGrass(2).setBlockName("galifreyGrass");
		// Dirt Blocks
		verdantDirt = new BlockTerraDimensions(Material.ground).setBlockName("verdantDirt");
		malaDirt = new BlockTerraDimensions(Material.ground).setBlockName("malaDirt");
		galifreyDirt = new BlockTerraDimensions(Material.ground).setBlockName("galifreyDirt");
		// Sand & Gravel Blocks
		terraSand = new BlockTerraSand().setBlockName("terraSand");
		terraGravel = new BlockTerraGravel().setBlockName("terraGravel");
		// Stone Blocks
		malaStone1 = new BlockMalaStone1().setBlockName("malaStone1");
		verdantStone1 = new BlockVerdantStone1().setBlockName("verdantStone1");
		// Tree Blocks
		verdantLogs = new BlockVerdantLogs().setBlockName("verdantLogs");
		//malaLogs = new BlockVerdantLogs().setBlockName("verdantLogs");
		terraLeaves= new BlockTerraLeaves().setBlockName("terraLeaves");
		//terraPlanks = new BlockTerraPlanks().setBlockName("terraPlanks");
		//terraSaplings = new BlockTerraSaplings().setBlockName("terraSaplings");
		// Plants & Vines
		
		// Ores Vanilla
		
		// Ores TerraDimensions
		
		// Ores Mod Support
		
		// Liquids
		
		//verdantGrass = new BlockGrass()
		
		
		Registry.registerBlocks();
	}
}
