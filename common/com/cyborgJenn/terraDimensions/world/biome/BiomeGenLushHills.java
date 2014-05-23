package com.cyborgJenn.terraDimensions.world.biome;

import java.util.ArrayList;
import java.util.Random;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenBase.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenTrees;

public class BiomeGenLushHills extends BiomeGenBase{

	private BiomeDecoratorVerdant customBiomeDecorator;

	public BiomeGenLushHills(int par1) {
		super(par1);
		theBiomeDecorator = new BiomeDecoratorVerdant(this);
		customBiomeDecorator = (BiomeDecoratorVerdant)theBiomeDecorator;
		this.topBlock = (Block) ModBlocks.verdantGrass;
		this.field_150604_aj = 1;// TopBlock MetaValue
		this.fillerBlock = (Block) ModBlocks.verdantDirt;
		this.rootHeight = 2.0F;// -2 to 2
		this.heightVariation = 1.0F;
		this.temperature = 0.2F;
		this.rainfall = 0.3F;
		this.setColor(8900670);
		this.waterColorMultiplier = 8900670;
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		//this.spawnableMonsterList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
		//this.spawnableCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
		//this.spawnableCreatureList.add(new SpawnListEntry(EntitySonicCreeper.class, 10, 1, 2));
		//this.spawnableWaterCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
		this.spawnableCaveCreatureList.add(new SpawnListEntry(EntityChicken.class, 10, 4, 4));
		this.enableRain = false;
		this.worldGeneratorTrees = new WorldGenTrees(false);
		//this.customBiomeDecorator.blueFlowersPerChunk = 3;
		//this.customBiomeDecorator.grayFlowersPerChunk = 2;
		//this.customBiomeDecorator.purpleFlowersPerChunk = 3;
		//this.customBiomeDecorator.treesPerChunk = 7;
		//this.customBiomeDecorator.nodesPerChunk = 3;
	}
	
	/**
	 * Provides the basic foliage color based on the biome temperature and rainfall
	 */
	@SideOnly(Side.CLIENT)
	public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_)
	{
		return 10387789;
	}

	/**
	 * Provides the basic grass color based on the biome temperature and rainfall
	 */
	@SideOnly(Side.CLIENT)
	public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_)
	{
		return 9470285;
	}
}
