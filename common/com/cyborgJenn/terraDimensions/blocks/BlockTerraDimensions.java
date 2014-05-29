package com.cyborgJenn.terraDimensions.blocks;


import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

public class BlockTerraDimensions extends Block{

	protected BlockTerraDimensions(Material material) {
		super(material);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

	public BlockTerraDimensions(int type, Material material) {
		super(material);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);

		if (type == 0){ // Gate Blocks
			this.setStepSound(Block.soundTypeStone);
			//this.setLightLevel(1.0F);
			this.setHardness(1.0F);
			this.setHarvestLevel("pickaxe", 3);
			this.setResistance(100.0F);// resistance to tnt

		} else if (type == 1){ // Stone Blocks
			this.setStepSound(Block.soundTypeStone);
			this.setHardness(2.0F);
			this.setHarvestLevel("pickaxe", 2);
			this.setResistance(100.0F);

		} else if (type == 2){ // Dirt type Blocks
			this.setStepSound(Block.soundTypeGrass);
			this.setHardness(1.0F);
			this.setHarvestLevel("shovel", 2);
			this.setResistance(25.0F);
		}else {

		}
	}
	public BlockTerraDimensions(Item drop, Material material, int type) {
		super(material);


	}
	@SideOnly(Side.CLIENT)
	@Override
	public void registerBlockIcons(IIconRegister par1IconRegister) {
		blockIcon = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5));
	}
	@SideOnly(Side.CLIENT)
	private IIcon[] icons;
}
