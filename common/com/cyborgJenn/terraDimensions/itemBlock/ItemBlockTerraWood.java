package com.cyborgJenn.terraDimensions.itemBlock;

import com.cyborgJenn.terraDimensions.blocks.BlockTerraPlanks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockLeaves;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemBlockTerraWood extends ItemBlock{
	
	String[] TreeTypes ={"sparkling","charred","brilliant", "dark", "icebound", "infernal", "life", "death"};
	
	public ItemBlockTerraWood(Block par1) {
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        
        if(TreeTypes != null)
            
            return getUnlocalizedName().concat("."+ TreeTypes[itemstack.getItemDamage()]);
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
