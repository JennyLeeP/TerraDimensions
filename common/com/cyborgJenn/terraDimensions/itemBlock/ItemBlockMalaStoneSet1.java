package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;

public class ItemBlockMalaStoneSet1 extends ItemTerraDimensionsBlock{

	public ItemBlockMalaStoneSet1(Block par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        MetaNames = new String[]{"malastone","malacobble","bloodcobble", 
    			"malastonebrick", "malachiseledbrick",
    			"malacrackedbrick","bloodbrick"};
	}

}
