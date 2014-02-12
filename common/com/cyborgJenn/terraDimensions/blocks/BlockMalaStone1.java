package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockMalaStone1 extends Block{
	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	String[] StoneTypes1 = {"malastone","malacobble","bloodcobble", 
			"malastonebrick", "malachiseledbrick",
			"malacrackedbrick","bloodbrick", "cursedstone"};

	public BlockMalaStone1() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int i, int meta)
	{
		return icons[meta];
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister iconRegister) 
	{
		icons = new IIcon[16];
		for(int i = 0; i < StoneTypes1.length; i++){
			icons[i] = iconRegister.registerIcon(Reference.TEXTURE + StoneTypes1[i]);
		}
	}
	@Override
	public int damageDropped (int meta)
	{
		return meta;
	}
	@SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < StoneTypes1.length; i++){
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
}
