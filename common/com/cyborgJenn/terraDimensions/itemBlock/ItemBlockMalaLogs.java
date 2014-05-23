package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockMalaLogs extends ItemBlock{
	
	String[] LogNames = new String[]{"sparkling","brilliant","icebound", "life"};
	
	public ItemBlockMalaLogs(Block par1) {
		super(par1);
		this.setMaxDamage(0);
		this.setHasSubtypes(true);
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(LogNames != null)
            
            return getUnlocalizedName().concat("."+ LogNames[itemstack.getItemDamage()]);
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
