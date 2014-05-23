package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.TerraDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockSphagnumMoss extends Block{

	protected BlockSphagnumMoss() {
		super(Material.grass);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

}
