package com.cyborgJenn.terraDimensions.world.generators.trees;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class WorldGenCharredTrees extends WorldGenAbstractTree{

    public WorldGenCharredTrees(boolean par1)
    {
        super(par1);
    }
    @Override
    
    public boolean generate(World par1World, Random par2Random, int par3, int par4, int par5)
    {
		return false;
    	
    }
}
