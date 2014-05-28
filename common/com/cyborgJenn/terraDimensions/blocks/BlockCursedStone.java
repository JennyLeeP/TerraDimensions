package com.cyborgJenn.terraDimensions.blocks;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class BlockCursedStone extends Block{

	protected BlockCursedStone() {
		super(Material.rock);
		this.setStepSound(Block.soundTypeStone);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
		this.setHardness(4.0F);
		this.setHarvestLevel("pickaxe", 3);
		this.setResistance(100.0F);
	}
	@SideOnly(Side.CLIENT)
    private IIcon[] icons;
	
	@SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5));
    }
    public void breakBlock(){
    	
    }
}
