package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;

public class ItemBlockVerdantStoneSet1 extends ItemTerraDimensionsBlock{

	public ItemBlockVerdantStoneSet1(Block par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        MetaNames = new String[]{"verdantcobble","verdantmossycobble", 
				"verdantstonebrick", "verdantchiseledbrick",
				"verdantcrackedbrick","verdantmossbrick", "granite",
				"granitebrick","marble","marblebrick"};
	}

}
