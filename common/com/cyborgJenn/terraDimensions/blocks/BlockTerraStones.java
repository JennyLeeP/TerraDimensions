package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.TerraDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTerraStones extends Block{

	protected BlockTerraStones() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

}
