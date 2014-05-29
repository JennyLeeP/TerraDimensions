package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.TerraDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class BlockTDStairs extends BlockStairs {

	protected BlockTDStairs(Block block, int blockMeta) {
		super(block, blockMeta);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

}
