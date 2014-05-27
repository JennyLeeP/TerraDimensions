package com.cyborgJenn.terraDimensions.world.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BiomeGenMorass extends BiomeGenTDBase{

	private BiomeDecoratorVerdant customBiomeDecorator;
	
	public BiomeGenMorass(int par1) {
		super(par1);
        this.rootHeight = -0.5F;
        this.heightVariation = 0.1F;
        this.spawnableCreatureList.clear();
        this.spawnableMonsterList.clear();
        this.setTemperatureRainfall(0.2F, 0.3F);
        this.waterColorMultiplier = 8900670;
        theBiomeDecorator = new BiomeDecoratorVerdant(this);
        customBiomeDecorator = (BiomeDecoratorVerdant)theBiomeDecorator;
        this.customBiomeDecorator.blueFlowersPerChunk = 3;
        this.customBiomeDecorator.grayFlowersPerChunk = 2;
        this.customBiomeDecorator.purpleFlowersPerChunk = 3;
        this.customBiomeDecorator.treesPerChunk = 7;
        this.customBiomeDecorator.nodesPerChunk = 1;
        this.customBiomeDecorator.grassPerChunk = 5;
        this.customBiomeDecorator.methIcePerChunk = 4;

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
        return null;
    	//return (WorldGenerator)(par1Random.nextInt(10) == 4 ? new WorldGenBigSparklingTree(false) : (par1Random.nextInt(2) == 0 ? new WorldGenShrub(3, 0) : (par1Random.nextInt(3) == 0 ? new WorldGenBrilliantTrees(false) : new WorldGenBigSparklingTree(true))));
    }
    /**
     * Provides the basic foliage color based on the biome temperature and rainfall
     */
    @SideOnly(Side.CLIENT)
    @Override
    public int getBiomeFoliageColor(int p_150571_1_, int p_150571_2_, int p_150571_3_)
    {
        return 5470085;
    }

    /**
     * Provides the basic grass color based on the biome temperature and rainfall
     */
    @SideOnly(Side.CLIENT)
    @Override
    public int getBiomeGrassColor(int p_150558_1_, int p_150558_2_, int p_150558_3_)
    {
        return 5470085;
    }
}
