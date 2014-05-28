package com.cyborgJenn.terraDimensions.world.biome;

import java.util.Random;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenBrilliantTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenMangroveTrees;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTrees;
import net.minecraft.world.gen.feature.WorldGenerator;

public class BiomeGenVioletBoscage extends BiomeGenTDBase{

	private BiomeDecoratorVerdant customBiomeDecorator;
	
	public BiomeGenVioletBoscage(int par1) {
		super(par1);
		
		this.rootHeight = 1.0F;// -2 to 2
		this.heightVariation = 2.0F;
		this.temperature = 0.2F;
		this.rainfall = 0.3F;
		this.enableRain = true;
		this.waterColorMultiplier = 8900670;
		/* Entities and Animals */
		this.spawnableCreatureList.clear();
		this.spawnableMonsterList.clear();
		
		/* Trees and Plants */
		theBiomeDecorator = new BiomeDecoratorVerdant(this);
		customBiomeDecorator = (BiomeDecoratorVerdant)theBiomeDecorator;
		this.worldGeneratorTrees = new WorldGenTrees(false);
		this.customBiomeDecorator.whiteFlowersPerChunk = 3;
		this.customBiomeDecorator.grayFlowersPerChunk = 2;
		this.customBiomeDecorator.purpleFlowersPerChunk = 3;
		this.customBiomeDecorator.treesPerChunk = 7;
		this.customBiomeDecorator.nodesPerChunk = 3;
		this.customBiomeDecorator.sandPerChunk = 4;
		this.customBiomeDecorator.sandPerChunk2 = 4;
	}
	public void genTerrainBlocks(World world, Random rand, Block[] block, byte[] blockArray, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {      
            this.topBlock = ModBlocks.verdantGrass;
            this.field_150604_aj = 0;
            this.fillerBlock = ModBlocks.verdantDirt;

        this.genCustomBiomeTerrain(world, rand, block, blockArray, p_150573_5_, p_150573_6_, p_150573_7_);
    }
	
    /**
     * Allocate a new BiomeDecorator for this BiomeGenBase
     */
    @Override
    public BiomeDecorator createBiomeDecorator()
    {   
        return getModdedBiomeDecorator(new BiomeDecoratorVerdant(this));
    }
    
    public WorldGenAbstractTree func_150567_a(Random p_150567_1_)
    {
        return this.worldGeneratorTrees;
    }
    /**
     * Gets a WorldGen appropriate for this biome. Use this method to add World Gen items to certain Biomes.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        //return null;
    	return (WorldGenerator)(par1Random.nextInt(10) == 4 ? new WorldGenMangroveTrees(false) : (par1Random.nextInt(2) == 0 ? new WorldGenShrub(3, 0) : (par1Random.nextInt(3) == 0 ? new WorldGenBrilliantTrees(false) : new WorldGenMangroveTrees(true))));
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
