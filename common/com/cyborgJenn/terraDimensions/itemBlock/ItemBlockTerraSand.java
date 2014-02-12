package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockTerraSand extends ItemTerraDimensionsBlock{

	public ItemBlockTerraSand(Block par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        MetaNames = new String[]{"verdantsand","malasand", "galifreysand"};
	}

}
