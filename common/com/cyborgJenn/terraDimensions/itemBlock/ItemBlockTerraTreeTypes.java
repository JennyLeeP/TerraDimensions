package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;

public class ItemBlockTerraTreeTypes extends ItemTerraDimensionsBlock{

	protected ItemBlockTerraTreeTypes(Block par1) {
		super(par1);
        setMaxDamage(0);
        setHasSubtypes(true);
        MetaNames = new String[]{"brilliant","icebound", "calignous","necrosis"};
	}

}
