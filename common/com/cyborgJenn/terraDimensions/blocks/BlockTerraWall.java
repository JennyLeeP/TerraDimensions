package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockWall;
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

public class BlockTerraWall extends BlockWall{
	@SideOnly(Side.CLIENT)
	private IIcon icon[];
	String[] wallTypes = {"verdantCobble", "verdantStoneBrick", "verdantStoneMossBrick", "verdantStoneCrackedBrick","malaCobble", "malaBrick", "malaCrackedBrick", "bloodCobble", "bloodBrick","marble", "granite"};

	public BlockTerraWall(Block par2Block) {
		super(par2Block);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		return icon[meta];
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
		icon = new IIcon[16];
		for(int i = 0; i < wallTypes.length; i++){
			icon[i] = iconRegister.registerIcon(Reference.TEXTURE + wallTypes[i]);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < wallTypes.length; i++){
			par3List.add(new ItemStack(par1, 1, i));
		}  
	}
}
