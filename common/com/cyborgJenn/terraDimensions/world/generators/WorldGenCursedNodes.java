package com.cyborgJenn.terraDimensions.world.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

public class WorldGenCursedNodes extends WorldGenerator {

    private Block block;
    private Block coreBlockType;
    private int metaCoreID;

    public WorldGenCursedNodes(Block par1, Block coreBlock, int par2) {
        this.block = par1;
        this.coreBlockType = coreBlock;
        this.metaCoreID = par2;
    }
    @Override
    public boolean generate(World world, Random random, int x, int y, int z) {
       
        Block var1 = world.getBlock(x, y, z);
        for (int i1 = 0; i1 < 64; i1++){
            if(var1 == ModBlocks.verdantStone || var1 == ModBlocks.malaStone){
                // Center Block
                world.setBlock(x, y, z, this.coreBlockType, this.metaCoreID, 2);
                // Surrounding Blocks
                world.setBlock(x - 1, y, z, this.block, 0, 2);
                world.setBlock(x + 1, y, z, this.block, 0, 2);
                world.setBlock(x, y - 1, z, this.block, 0, 2);
                world.setBlock(x, y + 1, z, this.block, 0, 2);
                world.setBlock(x, y, z - 1, this.block, 0, 2);
                world.setBlock(x, y, z + 1, this.block, 0, 2);
            }
        }
        return true;
    }

}
