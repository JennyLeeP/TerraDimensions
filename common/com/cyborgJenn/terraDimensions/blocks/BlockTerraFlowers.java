package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraftforge.common.IPlantable;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTerraFlowers extends BlockBush implements IPlantable{
	@SideOnly(Side.CLIENT)
    private IIcon icon[];
    String[]  flowerTypes = {"flower_white","flower_orange","flower_magenta","flower_lightblue","flower_yellow", "flower_lime", "flower_pink","flower_gray"
            , "flower_lightgray", "flower_cyan", "flower_purple", "flower_blue", "flower_brown", "flower_green", "flower_red", "flower_black"};
    
    public BlockTerraFlowers() {
        super(Material.plants);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
    }
    @Override
    protected boolean canPlaceBlockOn(Block par1)
    {
        return par1 == Blocks.grass || par1 == Blocks.dirt || par1 == Blocks.farmland || par1 == ModBlocks.verdantDirt || par1 == ModBlocks.malaDirt;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        return icon[meta];
        //TODO Fix Icons 
    }
    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }
    @Override
    public int getRenderType() {
        return 1;
    }
    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        icon = new IIcon[16];

        for (int i = 0; i < flowerTypes.length; i++) {
            icon[i] = par1IconRegister.registerIcon(Reference.TEXTURE + flowerTypes[i]);
        }
    }
    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
    {
    	for(int i = 0; i < flowerTypes.length; i++){
            par3List.add(new ItemStack(par1, 1, i));
        } 
    }
    
}
