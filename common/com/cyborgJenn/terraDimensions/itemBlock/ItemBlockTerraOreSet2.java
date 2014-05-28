package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTerraOreSet2 extends ItemBlock{

	public ItemBlockTerraOreSet2(Block block) {
		super(block);
		setHasSubtypes(true);
	}
	String[] OresSet2 = {"copper","tin","silver","lead","ferrous","uranium","aluminum","apatite"};
	
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(OresSet2 != null){
        	return getUnlocalizedName().concat("."+ OresSet2[itemstack.getItemDamage()]);
        }  
            
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
