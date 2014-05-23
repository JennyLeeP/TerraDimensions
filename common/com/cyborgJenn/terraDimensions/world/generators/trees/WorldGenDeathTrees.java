package com.cyborgJenn.terraDimensions.world.generators.trees;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;

public class WorldGenDeathTrees extends WorldGenAbstractTree{

    public WorldGenDeathTrees(boolean par1)
    {
        super(par1);
    }
    @Override
    public boolean generate(World world, Random random, int i, int j, int k) {
        // TODO Auto-generated method stub
        return false;
    }

}
