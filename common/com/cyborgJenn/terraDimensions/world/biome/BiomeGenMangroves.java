package com.cyborgJenn.terraDimensions.world.biome;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenMangroveTrees;

public class BiomeGenMangroves extends BiomeGenTDBase{

	private BiomeDecoratorVerdant customBiomeDecorator;
	
	public BiomeGenMangroves(int par1) {
		super(par1);
        this.rootHeight = -0.5F;
        this.heightVariation = 0.1F;
        this.spawnableCreatureList.clear();
        this.setTemperatureRainfall(0.2F, 0.3F);
        this.setColor(8900670);
        theBiomeDecorator = new BiomeDecoratorVerdant(this);
        customBiomeDecorator = (BiomeDecoratorVerdant)theBiomeDecorator;
        this.customBiomeDecorator.treesPerChunk = 7;
        this.customBiomeDecorator.nodesPerChunk = 1;
	}
	public void genTerrainBlocks(World world, Random rand, Block[] block, byte[] blockArray, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {      
            this.topBlock = ModBlocks.verdantGrass;
            this.field_150604_aj = 0;
            this.fillerBlock = ModBlocks.verdantDirt;

        this.genCustomBiomeTerrain(world, rand, block, blockArray, p_150573_5_, p_150573_6_, p_150573_7_);
    }
	
	public int getBiomeGrassColor()
    {
        return 0xA6EDE0;
        //return 0x9ab219;
    }
	
    /**
     * Allocate a new BiomeDecorator for this BiomeGenBase
     */
    @Override
    public BiomeDecorator createBiomeDecorator()
    {   
        return getModdedBiomeDecorator(new BiomeDecoratorVerdant(this));
    }
	/**
     * Gets a WorldGen appropriate for this biome. Use this method to add World Gen items to certain Biomes.
     */
    public WorldGenerator getRandomWorldGenForTrees(Random par1Random)
    {
        //return new WorldGenMangroveTrees(false);
    	return (WorldGenerator)(par1Random.nextInt(10) == 4 ? new WorldGenMangroveTrees(false) : (par1Random.nextInt(2) == 0 ? new WorldGenShrub(3, 0) : (par1Random.nextInt(3) == 0 ? new WorldGenMangroveTrees(false) : new WorldGenMangroveTrees(false))));
    }
}
