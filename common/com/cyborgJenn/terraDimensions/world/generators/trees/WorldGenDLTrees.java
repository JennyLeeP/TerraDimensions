package com.cyborgJenn.terraDimensions.world.generators.trees;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.ForgeDirection;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

public class WorldGenDLTrees extends WorldGenAbstractTree{
    /** The minimum height of a generated tree. */
    private final int minTreeHeight;

    /** True if this tree should grow Vines. */
    private final boolean vinesGrow;

    /** The metadata value of the wood to use in tree generation. */
    private final int metaWood;

    /** The metadata value of the leaves to use in tree generation. */
    private final int metaLeaves;
    
    /** The Type of Logs to use 0 for Dream 1 for NM */
     private final int Logtype;

    public WorldGenDLTrees(boolean par1)
    {
        this(par1, 4, 0, 0, false, 0);
    }

    public WorldGenDLTrees(boolean par1, int par2, int par3, int par4, boolean par5, int par6)
    {
        super(par1);
        this.minTreeHeight = par2;
        this.metaWood = par3;
        this.metaLeaves = par4;
        this.vinesGrow = par5;
        this.Logtype = par6;
        
    }
    public Block Logtype(int par1){
        if (Logtype == 0){
             return ModBlocks.verdantLogs;
        }
        else {
            return ModBlocks.malaLogs;
        }
        
    }
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
		return false;
    }
}
