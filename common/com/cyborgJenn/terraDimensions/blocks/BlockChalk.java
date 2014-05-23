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
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockChalk extends Block{

	protected BlockChalk() {
		super(Material.clay);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;

	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5));
    }
	@Override
	public void onEntityWalking(World world, int posX, int posY, int posZ, Entity entity) {
		//this.breakBlock(world, posX, posY, posZ, this, 0);
		
	}
	@Override
	public void breakBlock(World world, int posX, int posY, int posZ, Block block, int tile){
		//world.setBlock(posX, posY, posZ, Blocks.air);
		
	}
}
