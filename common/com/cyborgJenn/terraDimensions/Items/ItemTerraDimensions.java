package com.cyborgJenn.terraDimensions.Items;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.ReferenceItem;

import net.minecraft.item.Item;

public class ItemTerraDimensions extends Item{

	public ItemTerraDimensions(String name) {
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
		this.setUnlocalizedName(name);
	}

}
