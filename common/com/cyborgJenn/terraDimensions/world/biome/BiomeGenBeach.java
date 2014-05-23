package com.cyborgJenn.terraDimensions.world.biome;

import java.util.Random;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenBeach extends BiomeGenTDBase{

	private int field_150644_aH;
	
	public BiomeGenBeach(int par1) {
		super(par1);
		//this.topBlock = (Block) Blocks.sand;
        //this.fillerBlock = (Block) Blocks.gravel;
        this.rootHeight = 0.0F;
        this.heightVariation = 0.1F;
        this.spawnableCreatureList.clear();
        this.setTemperatureRainfall(0.2F, 0.3F);
        this.setColor(8900670);
	}
	public void genTerrainBlocks(World world, Random rand, Block[] block, byte[] blockArray, int p_150573_5_, int p_150573_6_, double p_150573_7_)
    {      
            this.topBlock = ModBlocks.terraSand;
            this.field_150604_aj = 0;
            this.fillerBlock = ModBlocks.terraGravel;

        this.genCustomBiomeTerrain(world, rand, block, blockArray, p_150573_5_, p_150573_6_, p_150573_7_);
    }
}
