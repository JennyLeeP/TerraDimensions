package com.cyborgJenn.terraDimensions.utils;

import com.cyborgJenn.terraDimensions.Items.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class TerraDimensionTabs extends CreativeTabs {
	
	public TerraDimensionTabs(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public Item getTabIconItem() {
		return ModItems.itemActiveMalaPortalKey;
	}

}
