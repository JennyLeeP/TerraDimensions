package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;

public class ItemBlockVerdantLogs extends ItemTerraDimensionsBlock{

	protected ItemBlockVerdantLogs(Block par1) {
		super(par1);
        setHasSubtypes(true);
        setMaxDamage(0);
        MetaNames = new String[]{"sparkling","brilliant","icebound", "life"};
	}

}
