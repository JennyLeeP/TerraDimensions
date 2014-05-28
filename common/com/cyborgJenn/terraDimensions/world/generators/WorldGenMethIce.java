package com.cyborgJenn.terraDimensions.world.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

public class WorldGenMethIce extends WorldGenerator{
	/** The block ID for clay. */
    private Block methaneIceBlock;

    /** The number of blocks to generate. */
    private int numberOfBlocks;

    public WorldGenMethIce(int par1)
    {
        this.methaneIceBlock = ModBlocks.bogg;
        this.numberOfBlocks = par1;
    }

    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
        if (par1World.getBlock(par3, par4, par5).getMaterial() != Material.water)
        {
            return false;
        }
        else
        {
            int l = par2Random.nextInt(this.numberOfBlocks - 2) + 2;
            byte b0 = 1;

            for (int i1 = par3 - l; i1 <= par3 + l; ++i1)
            {
                for (int j1 = par5 - l; j1 <= par5 + l; ++j1)
                {
                    int k1 = i1 - par3;
                    int l1 = j1 - par5;

                    if (k1 * k1 + l1 * l1 <= l * l)
                    {
                        for (int i2 = par4 - b0; i2 <= par4 + b0; ++i2)
                        {
                            Block j2 = par1World.getBlock(i1, i2, j1);

                            if (j2 == ModBlocks.verdantDirt || j2 == ModBlocks.bogg)
                            {
                                par1World.setBlock(i1, i2, j1, this.methaneIceBlock, 0, 2);
                            }
                        }
                    }
                }
            }

            return true;
        }
    }
}
