package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import com.cyborgJenn.terraDimensions.TerraDimensions;

public class ItemBlockTerraWalls extends ItemBlock{
	
	String[] wallTypes = {"verdantCobble", "verdantStoneBrick", "verdantStoneMossBrick", "verdantStoneCrackedBrick","malaCobble", "malaBrick", "malaCrackedBrick", "bloodCobble", "bloodBrick","marble", "granite"};
	
	public ItemBlockTerraWalls(Block par1) {
		super(par1);
		setHasSubtypes(true);
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(wallTypes != null)
            
            return getUnlocalizedName().concat("."+ wallTypes[itemstack.getItemDamage()]);
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
