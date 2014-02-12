package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.TerraDimensions;

import net.minecraft.block.BlockGrass;

public class BlockTerraGrass extends BlockGrass{
	public BlockTerraGrass(int par1) {
        super();
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
        this.setTickRandomly(true);
        
    }
}
