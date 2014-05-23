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
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockTerraPlanks extends Block{

	
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	String[] TreeTypes ={"sparkling","charred","brilliant", "dark", "icebound", "infernal", "life", "death"};
	public BlockTerraPlanks() {
		super(Material.wood);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
		this.setHardness(2.0F);
		this.setStepSound(Block.soundTypeWood);
		//TODO add Flamability
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
		this.icons = new IIcon[TreeTypes.length];
		
		for(int i = 0; i < icons.length; i++)
		{
			icons[i] = iconRegister.registerIcon(Reference.TEXTURE + "planks_" + TreeTypes[i]);
		}
	}
	@Override
	public int damageDropped (int meta)
	{
		return meta;
	}

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < TreeTypes.length; i++){
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
}
