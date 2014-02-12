package com.cyborgJenn.terraDimensions.blocks;

import net.minecraft.block.BlockPortal;
import com.cyborgJenn.terraDimensions.TerraDimensions;

public class BlockTerraPortal extends BlockPortal{
	public BlockTerraPortal(int par1) { // Par1 = which portal, 0 = verdant, 1 = mala, 2 = galifrey
        super();
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
        this.setTickRandomly(true);
        this.setLightLevel(1.0F);
    }
}
