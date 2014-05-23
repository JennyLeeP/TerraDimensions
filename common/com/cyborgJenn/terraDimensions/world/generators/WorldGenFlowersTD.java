package com.cyborgJenn.terraDimensions.world.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenFlowersTD extends WorldGenerator{

	 /** The ID of the plant block used in this plant generator. */
    private Block plantBlock;
    
    private int metaID;

    public WorldGenFlowersTD(Block par1)
    {
        this.plantBlock = par1;
    }
    
    public WorldGenFlowersTD(Block par1, int par2) {
        this.plantBlock = par1;
        this.metaID = par2;
    }

    @Override
    public boolean generate(World world, Random rand, int posX, int posY, int posZ) {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = posX + rand.nextInt(8) - rand.nextInt(8);
            int j1 = posY + rand.nextInt(4) - rand.nextInt(4);
            int k1 = posZ + rand.nextInt(8) - rand.nextInt(8);

            if (world.isAirBlock(i1, j1, k1) && (!world.provider.hasNoSky || j1 < 127) && this.plantBlock.canBlockStay(world, i1, j1, k1))
            {
            	world.setBlock(i1, j1, k1, this.plantBlock, this.metaID, 2);
            }
        }

        return true;
    }

}
