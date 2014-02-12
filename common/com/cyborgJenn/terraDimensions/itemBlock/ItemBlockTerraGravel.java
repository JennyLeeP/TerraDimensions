package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;

public class ItemBlockTerraGravel extends ItemTerraDimensionsBlock{

	public ItemBlockTerraGravel(Block par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        MetaNames = new String[]{"verdantgravel","malagravel", "galifreygravel"};
	}
}
