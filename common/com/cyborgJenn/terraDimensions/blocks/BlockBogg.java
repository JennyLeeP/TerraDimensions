package com.cyborgJenn.terraDimensions.blocks;

import java.util.Random;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public class BlockBogg extends Block{

	public Random rand;
	protected BlockBogg() {
		super(Material.ground);
		this.setStepSound(Block.soundTypeSand);
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
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
	{
		float var5 = 0.35F;
		return AxisAlignedBB.getAABBPool().getAABB(x, y, z, x + 1, y + 1 - var5, z + 1);

	}
	@Override
	public void onEntityCollidedWithBlock(World world, int posX, int posY, int posZ, Entity entity)
	{
		rand = new Random();
		entity.motionX *= 0.1D;
		entity.motionZ *= 0.1D;
		entity.motionY *= 0.001D;

		//entity.setInWeb();
		//entity.playSound("game.neutral.swim", 0.7F, 1.6F + (this.rand.nextFloat() - this.rand.nextFloat()) * 0.4F);
	}
}
