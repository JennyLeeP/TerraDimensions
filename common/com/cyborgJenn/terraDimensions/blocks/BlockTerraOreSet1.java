package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockTerraOreSet1 extends Block{

	@SideOnly(Side.CLIENT)
	private IIcon[] iconsSet1;

	public static final String[] OresSet1 = new String[] {"iron","gold","diamond","emerald","lapis","redstone","coal"};
	/*
	 * Thermal Expansion = Copper, Tin, Silver, Lead, Ferrous
	 * IC2               = Copper, Tin, Lead, Uranium
	 * Forestry          = Copper, Tin, Apatite
	 * Railcraft         = Sulfer, SaltPeter
	 * Tinkers Construct = Cobalt, Ardite, Copper, Tin, Aluminum
	 */
	protected BlockTerraOreSet1() {
		super(Material.rock);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);

	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return iconsSet1[meta];
	}
	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int par1)
	{
		return par1;
	}
	public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
    {
        return true;
    }
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) 
	{
		iconsSet1 = new IIcon[16];
		for(int i = 0; i < OresSet1.length; i++){
			iconsSet1[i] = iconRegister.registerIcon(Reference.TEXTURE + OresSet1[i]);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < OresSet1.length; i++){
			par3List.add(new ItemStack(par1, 1, i));
		}  
	}
		
}
