package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTerraFlowers extends ItemBlock{
	
	String[]  flowerTypes = {"flower_white","flower_orange","flower_magenta","flower_lightblue","flower_yellow", "flower_lime", "flower_pink","flower_gray"
            , "flower_lightgray", "flower_cyan", "flower_purple", "flower_blue", "flower_brown", "flower_green", "flower_red", "flower_black"};
	
	public ItemBlockTerraFlowers(Block par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(flowerTypes != null)
            
            return getUnlocalizedName().concat("." + flowerTypes[itemstack.getItemDamage()]);
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
