package com.cyborgJenn.terraDimensions.itemBlock;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Config;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class ItemTerraDimensionsBlock extends ItemBlock{

	public String[] MetaNames;
    public IIcon[] icons;
    
	protected ItemTerraDimensionsBlock(Block par1) {
		super(par1);
		setHasSubtypes(true);
        //this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}
	@Override
    public String getUnlocalizedName(ItemStack itemstack)
    {
        if(Config.enableDebugNaming){
            System.out.println("[Terra Dimensions]" + getUnlocalizedName()+ "." + MetaNames[itemstack.getItemDamage()]);
        }
        
        
        if(MetaNames != null)
            
            return getUnlocalizedName().concat("."+ MetaNames[itemstack.getItemDamage()]);
        
        return super.getUnlocalizedName(itemstack);
    }
    @Override
    public int getMetadata(int meta) 
    {       
        return meta;
    }
}
