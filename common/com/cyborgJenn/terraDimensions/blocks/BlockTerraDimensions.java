package com.cyborgJenn.terraDimensions.blocks;


import com.cyborgJenn.terraDimensions.TerraDimensions;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockTerraDimensions extends Block{

	protected BlockTerraDimensions(Material material) {
		super(material);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

	public BlockTerraDimensions(int sound) {
		super(Material.rock);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
		
		if (sound == 0){
			this.setStepSound(Block.soundTypeStone);
		} else if (sound == 1){
			this.setStepSound(Block.soundTypeGravel);
		} else {
			this.setStepSound(Block.soundTypeSand);
		}
	}

}
