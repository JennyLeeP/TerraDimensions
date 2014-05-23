package com.cyborgJenn.terraDimensions.handlers;

import com.cyborgJenn.terraDimensions.Items.ModItems;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class TerraFuelHandler implements IFuelHandler{

	@Override
	public int getBurnTime(ItemStack fuel) {
		if(fuel.getItem() == ModItems.itemMethaneClathrate){
            return 10000;
        }else if (fuel.getItem() == ModItems.peat){
            return 8000;
        }else {
        	 return 0;
        }
	}

}
