package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;


public class BlockVerdantLogs extends Block{
	
	public static final String[] VerdantWoodType = new String[] {"sparkling","brilliant","icebound", "life"};
    public static final String[] VerdantTreeTextureTops = new String[] {"sparkling_top","brilliant_top","icebound_top", "life_top"};
    
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArrayTS;
    @SideOnly(Side.CLIENT)
    private IIcon[] iconArrayTT;
    @SideOnly(Side.CLIENT)
    private IIcon tree_top;
    
	protected BlockVerdantLogs() {
		super(Material.wood);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
		this.setHarvestLevel("axe", 2);
		this.setHardness(3.0F);
        //blockFireSpreadSpeed[this.blockID] = 5;
        //blockFlammability[this.blockID] = 20;
	}
	
	/**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int meta)
    {
        return meta & 3;
    }
	
    /**
     * Called when a block is placed using its ItemBlock. Args: World, X, Y, Z, side, hitX, hitY, hitZ, block metadata
     */
    public int onBlockPlaced(World par1World, int par2, int par3, int par4, int side, float par6, float par7, float par8, int meta)
    {
        int j1 = meta & 3;
        byte b0 = 0;

        switch (side)
        {
            case 0:
            case 1:
                b0 = 0;
                break;
            case 2:
            case 3:
                b0 = 8;
                break;
            case 4:
            case 5:
                b0 = 4;
        }

        return j1 | b0;
    }
    
	/**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        int k = meta & 12 ;
        int l = meta & 3;
        //System.out.println("k= "+ k);
        //System.out.println("l= " + l);
        return k == 0 && (side == 1 || side == 0) ? this.iconArrayTT[l] : (k == 4 && (side == 5 || side == 4) ? this.iconArrayTT[l] : (k == 8 && (side == 2 || side == 3) ? this.iconArrayTT[l] : this.iconArrayTS[l]));
    }
	
	@SuppressWarnings("unchecked")
    @SideOnly(Side.CLIENT)

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
    {
        for(int i = 0; i < VerdantWoodType.length; i++){
        par3List.add(new ItemStack(par1, 1, i));
        }
        
    }
	@SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconregister)
    {
		this.iconArrayTS = new IIcon[VerdantWoodType.length];
        this.iconArrayTT = new IIcon[VerdantTreeTextureTops.length];
        
        for (int j = 0; j < this.iconArrayTT.length; ++j)
        {
            this.iconArrayTT[j] = iconregister.registerIcon(Reference.TEXTURE + "log_" +VerdantTreeTextureTops[j]);
        }
        for (int i = 0; i < this.iconArrayTS.length; ++i)
        {
            this.iconArrayTS[i] = iconregister.registerIcon(Reference.TEXTURE + "log_" +VerdantWoodType[i]);
        }
    }
	
}
