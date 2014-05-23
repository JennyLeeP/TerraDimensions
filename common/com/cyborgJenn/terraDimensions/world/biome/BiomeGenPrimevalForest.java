package com.cyborgJenn.terraDimensions.world.biome;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenPrimevalForest extends BiomeGenBase{

	public BiomeGenPrimevalForest(int par1) {
		super(par1);
		this.topBlock = (Block) Blocks.bedrock;
        this.fillerBlock = (Block) Blocks.dirt;
        this.rootHeight = 1.0F;
        this.heightVariation = 0.5F;
        this.spawnableCreatureList.clear();
        this.setTemperatureRainfall(0.2F, 0.3F);
        this.setColor(8900670);
	}

}
