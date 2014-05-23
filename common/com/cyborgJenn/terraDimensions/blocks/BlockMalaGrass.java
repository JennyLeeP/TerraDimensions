package com.cyborgJenn.terraDimensions.blocks;

import java.util.Random;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.util.ForgeDirection;

public class BlockMalaGrass extends Block implements IGrowable{
	
	@SideOnly(Side.CLIENT)
    private IIcon iconGrassTop;
    @SideOnly(Side.CLIENT)
    private IIcon iconSnowSide;
    @SideOnly(Side.CLIENT)
    private IIcon iconGrassSideOverlay;
    
	public BlockMalaGrass(int par1) {
        super(Material.ground);
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
        this.setTickRandomly(true);
        this.setHardness(1.0F);
        this.setStepSound(Block.soundTypeGrass);
        this.setHarvestLevel("shovel", 2);
        this.setResistance(25.0F);
        
    }
	@Override
    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public IIcon getIcon(int par1, int par2) {
			return par1 == 1 ? iconGrassTop : (par1 == 0 ? ModBlocks.malaDirt.getBlockTextureFromSide(par1) : blockIcon);  
    }
	/**
     * Returns the ID of the items to drop on destruction.
     */
    @Override
    public Item getItemDropped(int par1, Random par2Random, int par3) {
        return ModBlocks.malaDirt.getItemDropped(0, par2Random, par3);
    }
    /**
     * Ticks the block if it's been scheduled
     */
    @Override
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random) {
        if (!par1World.isRemote){
            if ((par1World.getBlockLightValue(par2, par3 + 1, par4) < 4)
                    && (par1World.getBlockLightOpacity(par2, par3 + 1, par4) > 2)){
                par1World.setBlock(par2, par3, par4, ModBlocks.malaDirt);
            }else if (par1World.getBlockLightValue(par2, par3 + 1, par4) >= 9){
                for (int l = 0; l < 4; ++l){
                    int i1 = (par2 + par5Random.nextInt(3)) - 1;
                    int j1 = (par3 + par5Random.nextInt(5)) - 3;
                    int k1 = (par4 + par5Random.nextInt(3)) - 1;
                    par1World.getBlock(i1, j1 + 1, k1);

                    if ((par1World.getBlock(i1, j1, k1) == ModBlocks.malaDirt)
                            && (par1World.getBlockLightValue(i1, j1 + 1, k1) >= 4)
                            && (par1World.getBlockLightOpacity(i1, j1 + 1, k1) <= 2)){
                        par1World.setBlock(i1, j1, k1, ModBlocks.malaGrass);
                    }
                }
            }
        }
    }
    @Override
    @SideOnly(Side.CLIENT)
    /**
     * Retrieves the block texture to use based on the display side. Args: iBlockAccess, x, y, z, side
     */
    public IIcon getIcon(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5) {
         
        if (par5 == 1)
        {
            return iconGrassTop;
        }
        else if (par5 == 0)
        {
            return ModBlocks.malaDirt.getBlockTextureFromSide(par5);
        }
        else
        {
            Material material = par1IBlockAccess.getBlock(par2, par3 + 1, par4).getMaterial();
            return material != Material.snow && material != Material.craftedSnow ? this.blockIcon : this.iconSnowSide;
        }
    }

    @Override
    @SideOnly(Side.CLIENT)
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerBlockIcons(IIconRegister par1IconRegister) {
        blockIcon = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5) + "_side");
        iconGrassTop = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5) + "_top");
        iconSnowSide = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5) + "_snow_side");
        iconGrassSideOverlay = par1IconRegister.registerIcon(Reference.TEXTURE + this.getUnlocalizedName().substring(5) + "_side_overlay");
    }
    @Override
    public boolean canSustainPlant(IBlockAccess world, int x, int y, int z, ForgeDirection direction, IPlantable plantable)
    {
        return true;
    }
    @Override
    public void onPlantGrow(World world, int x, int y, int z, int sourceX, int sourceY, int sourceZ)
    {
        if (this == ModBlocks.malaGrass )// TODO: add back farm land ** || this == ModBlocks.verdantFarmLand **
        {
            world.setBlock(x, y, z, ModBlocks.malaDirt, 0, 2);
        }
    }
	@Override
	public boolean func_149851_a(World var1, int var2, int var3, int var4,
			boolean var5) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean func_149852_a(World var1, Random var2, int var3, int var4,
			int var5) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void func_149853_b(World var1, Random var2, int var3, int var4,
			int var5) {
		// TODO Auto-generated method stub
		
	}
    
}
