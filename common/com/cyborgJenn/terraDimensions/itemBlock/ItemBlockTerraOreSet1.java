package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTerraOreSet1 extends ItemBlock{

	public ItemBlockTerraOreSet1(Block p_i45328_1_) {
		super(p_i45328_1_);
		setHasSubtypes(true);
	}
	String[] OresSet1 = {"iron","gold","diamond","emerald","lapis","redstone","coal"};
	
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(OresSet1 != null){
        	return getUnlocalizedName().concat("."+ OresSet1[itemstack.getItemDamage()]);
        }  
            
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
