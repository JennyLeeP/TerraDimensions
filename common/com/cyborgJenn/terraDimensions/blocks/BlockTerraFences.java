package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.render.TerraFenceRender;
import com.cyborgJenn.terraDimensions.utils.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFence;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTerraFences extends BlockFence{
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
	String[] TreeTypes = {"sparkling","charred","brilliant", "dark", "icebound", "infernal", "life", "death"};

	public BlockTerraFences() {
		super("wood", Material.wood);
		this.setHardness(2.0F);
		this.setResistance(5.0F);
		this.setStepSound(Block.soundTypeWood);
		//setBurnProperties(this.blockID, 5, 20);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}
	/**
	 * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
	 */
	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return icons[meta];
	}


	@SideOnly(Side.CLIENT)
	/**
	 * When this method is called, your block should register all the icons it needs with the given IconRegister. This
	 * is the only chance you get to register icons.
	 */
	@Override
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		this.icons = new IIcon[TreeTypes.length];

		for(int i = 0; i < icons.length; i++)
		{
			icons[i] = iconRegister.registerIcon(Reference.TEXTURE + "planks_" + TreeTypes[i]);
		}
	}
	public static boolean canConnectFenceTo(int par0)
	{
		return true;
	}

	@Override
	public int damageDropped (int meta)
	{
		return meta;
	}

	public boolean canPlaceTorchOnTop(World world, int x, int y, int z)
	{
		return true;
	}
	@SuppressWarnings("unchecked")
	@SideOnly(Side.CLIENT)

	/**
	 * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
	 */
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < TreeTypes.length; i++)
		{
			par3List.add(new ItemStack(par1, 1, i));
		}
	}
	public int getRenderType()
	{
		return TerraFenceRender.fenceModel;// or 11 
	}
}
