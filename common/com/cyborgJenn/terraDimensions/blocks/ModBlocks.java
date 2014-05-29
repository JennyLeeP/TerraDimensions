package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.blocks.portal.BlockGalifreyPortal;
import com.cyborgJenn.terraDimensions.blocks.portal.BlockMalaPortal;
import com.cyborgJenn.terraDimensions.blocks.portal.BlockVerdantPortal;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.ReferenceBlock;
import com.cyborgJenn.terraDimensions.utils.Registry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.Fluid;

public class ModBlocks {

	public static Block gateVerdant;
	public static Block gateMala;
	public static Block gateGalifrey;
	public static BlockVerdantPortal verdantPortal;
	public static BlockMalaPortal malaPortal;
	public static BlockGalifreyPortal galifreyPortal;
	public static BlockVerdantGrass verdantGrass;
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
	public static Block cursedStone;
	public static Block terraOreSet1;
	public static Block terraOreSet2;
	public static Block oreMethaneClathrate;
	
	public static Block blockStoneSlabsSet1;
	public static Block blockWoodSlabsSet1;
	public static Block blockWoodDBLSlabs;
	public static Block blockStoneDBLSlabs;
	public static Block terraVines;
	public static Block pedestal;
	
	public static Block brilliantStairs;
	public static Block sparklingStairs;
	public static Block charredStairs;
	public static Block darkStairs;
	public static Block iceboundStairs;
	public static Block infernalStairs;
	public static Block lifeStairs;
	public static Block deathStairs;

	public static void initBlocks(){
		// Gate Blocks
		gateVerdant = new BlockTerraDimensions(0, Material.rock).setBlockName("gateVerdant");
		gateMala = new BlockTerraDimensions(0, Material.rock).setBlockName("gateMala");
		gateGalifrey = new BlockTerraDimensions(0, Material.rock).setBlockName("gateGalifrey");
		// Portal Blocks
		verdantPortal = (BlockVerdantPortal) new BlockVerdantPortal().setBlockName("verdantPortal");
		malaPortal = (BlockMalaPortal) new BlockMalaPortal().setBlockName("malaPortal");
		galifreyPortal = (BlockGalifreyPortal) new BlockGalifreyPortal().setBlockName("galifreyPortal");
		// Grass Blocks
		verdantGrass = (BlockVerdantGrass) new BlockVerdantGrass(0).setBlockName("grass");
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
		terraSand     = new BlockTerraSand().setBlockName("terraSand");
		terraGravel   = new BlockTerraGravel().setBlockName("terraGravel");
		/* Stone Blocks */
		verdantStone  = new BlockTerraDimensions(1, Material.rock).setBlockName("verdantStone_alt2");
		verdantStone1 = new BlockVerdantStoneSet1().setBlockName("verdantStone1");
		
		malaStone     = new BlockTerraDimensions(1, Material.rock).setBlockName("verdantStone_alt");
		malaStone1    = new BlockMalaStoneSet1().setBlockName("malaStone1");
		
		galifreyStone = new BlockTerraDimensions(1, Material.rock).setBlockName("galifreyStone");
		
		/* Misc Blocks */
		chalk         = new BlockChalk().setBlockName("chalk");
		shells        = new BlockShells().setBlockName("shells");
		cursedStone   = new BlockCursedStone().setBlockName("cursedStone");
		/* Fences and Walls */
		terraWalls    = new BlockTerraWall(verdantStone1).setBlockName("terraWalls");
		terraFences   = new BlockTerraFences().setBlockName("terraFences");
		/* Tree Blocks */
		verdantLogs   = new BlockVerdantLogs().setBlockName("verdantLogs");
		malaLogs      = new BlockMalaLogs().setBlockName("malaLogs");
		terraLeaves   = new BlockTerraLeaves().setBlockName("terraLeaves");
		terraPlanks   = new BlockTerraPlanks().setBlockName("terraPlanks");
		terraSaplings = new BlockTerraSaplings().setBlockName(ReferenceBlock.TERRASAPLINGS);
		
		/* Wood Stairs */	
		sparklingStairs = new BlockTDStairs(terraPlanks, 0).setBlockName("sparklingStairs");
		charredStairs   = new BlockTDStairs(terraPlanks, 1).setBlockName("charredStairs");
		brilliantStairs = new BlockTDStairs(terraPlanks, 2).setBlockName("brilliantStairs");
		darkStairs      = new BlockTDStairs(terraPlanks, 3).setBlockName("darkStairs");
		iceboundStairs  = new BlockTDStairs(terraPlanks, 4).setBlockName("iceboundStairs");
		infernalStairs  = new BlockTDStairs(terraPlanks, 5).setBlockName("infernalStairs");
		lifeStairs      = new BlockTDStairs(terraPlanks, 6).setBlockName("lifeStairs");
		deathStairs     = new BlockTDStairs(terraPlanks, 7).setBlockName("deathStairs");
		
		/* Stone Stairs */	
		
		/* Slabs */
		
		/* Plants & Vines */
		terraFlowers = new BlockTerraFlowers().setBlockName("terraFlowers");
		sphagnumMoss = new BlockSphagnumMoss().setBlockName("sphagnumMoss");
		terraVines   = new BlockVines().setBlockName("terraVines");
		
		/* Ores */
		terraOreSet1 = new BlockTerraOreSet1().setBlockName("terraOreSet1");
		terraOreSet2 = new BlockTerraOreSet2().setBlockName("terraOreSet2");
		oreMethaneClathrate = new BlockTerraDimensions(ModItems.itemMethaneClathrate, Material.clay, 1).setBlockName("oreMethaneClathrate");

		Registry.registerBlocks();
	}
}
