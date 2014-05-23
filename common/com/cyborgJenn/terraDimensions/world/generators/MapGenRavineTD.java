package com.cyborgJenn.terraDimensions.world.generators;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.handlers.TerraFluidsHandler;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.MapGenRavine;

public class MapGenRavineTD extends MapGenRavine{
	protected void digBlock(Block[] data, int index, int x, int y, int z, int chunkX, int chunkZ, boolean foundTop)
    {
        BiomeGenBase biome = worldObj.getBiomeGenForCoords(x + chunkX * 16, z + chunkZ * 16);
        Block top    =  biome.topBlock;
        Block filler =  biome.fillerBlock;
        Block block  = data[index];

        if (block == ModBlocks.verdantStone || block == filler || block == top)
        {
            if (y < 10)
            {
                data[index] = TerraFluidsHandler.blockFluidTerraLava;
            }
            else
            {
                data[index] = null;

                if (foundTop && data[index - 1] == filler)
                {
                    data[index - 1] = top;
                }
            }
        }
    }
}
