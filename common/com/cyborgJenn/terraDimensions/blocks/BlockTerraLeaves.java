package com.cyborgJenn.terraDimensions.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLeavesBase;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTerraLeaves extends BlockLeavesBase implements IShearable{

	int adjacentTreeBlocks[];

    IIcon[] icons = new IIcon[16];
    IIcon[] iconsOpaque = new IIcon[16];
    
	protected BlockTerraLeaves() {
		super(Material.leaves, false);
		this.setTickRandomly(true);
        this.setHardness(0.2F);
        this.setLightOpacity(1);
        this.setStepSound(Block.soundTypeGrass);
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}
	/**
     * ejects contained items into the world, and notifies neighbors of an update, as appropriate
     */
    public void breakBlock(World world, int par2, int par3, int par4, int par5, int par6)
    {
        byte b0 = 1;
        int j1 = b0 + 1;

        if (world.checkChunksExist(par2 - j1, par3 - j1, par4 - j1, par2 + j1, par3 + j1, par4 + j1))
        {
            for (int k1 = -b0; k1 <= b0; ++k1)
            {
                for (int l1 = -b0; l1 <= b0; ++l1)
                {
                    for (int i2 = -b0; i2 <= b0; ++i2)
                    {
                        Block block = world.getBlock(par2 + k1, par3 + l1, par4 + i2);

                        if (block.isLeaves(world, par2 + k1, par3 + l1, par4 + i2))
                        {
                        	block.beginLeavesDecay(world, par2 + k1, par3 + l1, par4 + i2);
                        }
                    }
                }
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int par2, int par3, int par4, Random par5Random)
    {
        if (!world.isRemote)
        {
            int l = world.getBlockMetadata(par2, par3, par4);

            if ((l & 8) != 0 && (l & 4) == 0)
            {
                byte b0 = 4;
                int i1 = b0 + 1;
                byte b1 = 32;
                int j1 = b1 * b1;
                int k1 = b1 / 2;

                if (this.adjacentTreeBlocks == null)
                {
                    this.adjacentTreeBlocks = new int[b1 * b1 * b1];
                }

                int l1;

                if (world.checkChunksExist(par2 - i1, par3 - i1, par4 - i1, par2 + i1, par3 + i1, par4 + i1))
                {
                    int i2;
                    int j2;
                    int k2;

                    for (l1 = -b0; l1 <= b0; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                            	Block block = world.getBlock(par2 + l1, par3 + i2, par4 + j2);

                                if (block != null && block.canSustainLeaves(world, par2 + l1, par3 + i2, par4 + j2))
                                {
                                    this.adjacentTreeBlocks[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = 0;
                                }
                                else if (block != null && block.isLeaves(world, par2 + l1, par3 + i2, par4 + j2))
                                {
                                    this.adjacentTreeBlocks[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -2;
                                }
                                else
                                {
                                    this.adjacentTreeBlocks[(l1 + k1) * j1 + (i2 + k1) * b1 + j2 + k1] = -1;
                                }
                            }
                        }
                    }

                    for (l1 = 1; l1 <= 4; ++l1)
                    {
                        for (i2 = -b0; i2 <= b0; ++i2)
                        {
                            for (j2 = -b0; j2 <= b0; ++j2)
                            {
                                for (k2 = -b0; k2 <= b0; ++k2)
                                {
                                    if (this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1] == l1 - 1)
                                    {
                                        if (this.adjacentTreeBlocks[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1 - 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.adjacentTreeBlocks[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1 + 1) * j1 + (j2 + k1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1 - 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1 + 1) * b1 + k2 + k1] = l1;
                                        }

                                        if (this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1) * b1 + (k2 + k1 - 1)] = l1;
                                        }

                                        if (this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] == -2)
                                        {
                                            this.adjacentTreeBlocks[(i2 + k1) * j1 + (j2 + k1) * b1 + k2 + k1 + 1] = l1;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                l1 = this.adjacentTreeBlocks[k1 * j1 + k1 * b1 + k1];

                if (l1 >= 0)
                {
                	world.setBlockMetadataWithNotify(par2, par3, par4, l & -9, 4);
                }
                else
                {
                    this.removeLeaves(world, par2, par3, par4);
                }
            }
        }
    }

    @SideOnly(Side.CLIENT)

    /**
     * A randomly called display update to be able to add particles or other items for display
     */
    public void randomDisplayTick(World world, int chunkX, int chunkY, int chunkZ, Random par5Random)
    {
        if (world.canLightningStrikeAt(chunkX, chunkY + 1, chunkZ) && !world.doesBlockHaveSolidTopSurface(world, chunkX, chunkY - 1, chunkZ) && par5Random.nextInt(15) == 1)
        {
            double d0 = (double)((float)chunkX + par5Random.nextFloat());
            double d1 = (double)chunkY - 0.05D;
            double d2 = (double)((float)chunkZ + par5Random.nextFloat());
            world.spawnParticle("dripWater", d0, d1, d2, 0.0D, 0.0D, 0.0D);
        }   
        if(Config.enableTreeParticles){
            int l = world.getBlockMetadata(chunkX, chunkY, chunkZ) & 7;
            if (l == 0 )
            {
                double d0 = (double)((float)chunkX + par5Random.nextFloat());
                double d1 = (double)chunkY - 0.05D;
                double d2 = (double)((float)chunkZ + par5Random.nextFloat());
                world.spawnParticle("crit", d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
            if (l == 1 )
            {
                double d0 = (double)((float)chunkX + par5Random.nextFloat());
                double d1 = (double)chunkY - 0.05D;
                double d2 = (double)((float)chunkZ + par5Random.nextFloat());
                world.spawnParticle("smoke", d0, d1, d2, 0.0D, 0.0D, 0.0D);
            }
            if (l == 5 )
            {
                double d0 = (double)((float)chunkX + par5Random.nextFloat());
                double d1 = (double)chunkY - 0.0D;
                double d2 = (double)((float)chunkZ + par5Random.nextFloat());
                world.spawnParticle("flame", d0, d1, d2, 0.0D, -0.2D, 0.0D);
            }
        }
    }

    private void removeLeaves(World par1World, int par2, int par3, int par4)
    {
        this.dropBlockAsItem(par1World, par2, par3, par4, par1World.getBlockMetadata(par2, par3, par4), 0);
        par1World.setBlockToAir(par2, par3, par4);
    }

    /**
     * Returns the quantity of items to drop on block destruction.
     */
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(20) == 0 ? 1 : 0;
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public Item getItemDropped(int par1, Random par2Random, int par3)
    {
    	return Item.getItemFromBlock(ModBlocks.terraSaplings);
        
    }

    /**
     * Drops the block items with a specified chance of dropping the specified items
     */
    public void dropBlockAsItemWithChance(World par1World, int par2, int par3, int par4, int par5, float par6, int par7)
    {
        if (!par1World.isRemote)
        {
            int j1 = 20;

            if ((par5 & 3) == 3)
            {
                j1 = 40;
            }

            if (par7 > 0)
            {
                j1 -= 2 << par7;

                if (j1 < 10)
                {
                    j1 = 10;
                }
            }

            if (par1World.rand.nextInt(j1) == 0)
            {
            	Item item = this.getItemDropped(par5, par1World.rand, par7);
                this.dropBlockAsItem(par1World, par2, par3, par4, new ItemStack(item, 1, this.damageDropped(par5)));
            }

            j1 = 200;

            if (par7 > 0)
            {
                j1 -= 10 << par7;

                if (j1 < 40)
                {
                    j1 = 40;
                }
            }

            this.dropApple(par1World, par2, par3, par4, par5, j1);
        }
    }
    protected void dropApple(World world, int par2, int par3, int par4, int par5, int par6) {}

    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6)
    {
        super.harvestBlock(par1World, par2EntityPlayer, par3, par4, par5, par6);
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1 & 7;
    }

    @Override
    public boolean isOpaqueCube()
    {
        if(TerraDimensions.proxy != null)
            return !TerraDimensions.proxy.getGraphicsLevel();
        else
            return false;
    }
    @SideOnly(Side.CLIENT)
    @Override
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        return true;
    }

    @SideOnly(Side.CLIENT)
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    @Override
    public IIcon getIcon(int i, int meta)
    {
        if (TerraDimensions.proxy.getGraphicsLevel())
        {
            return icons[(meta & 7)];
        }
        else
        {
            return iconsOpaque[(meta & 7)];
        }    
    }
    

    @SideOnly(Side.CLIENT)
    String[] TreeTypes = {"sparkling","charred","brilliant", "calignous", "icebound", "infernal", "life"};
    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    @Override
    public void registerBlockIcons(IIconRegister iconRegisterer)
    {

        for(int i = 0; i < TreeTypes.length; i++)
        {
            icons[i] = iconRegisterer.registerIcon(Reference.TEXTURE + "leaves_" + TreeTypes[i]);
            iconsOpaque[i] = iconRegisterer.registerIcon(Reference.TEXTURE + "leaves_" + TreeTypes[i] + "_opaque");
        }
    }

    /**
     * Returns an item stack containing a single instance of the current block type. 'i' is the block's subtype/damage
     * and is ignored for blocks which do not support subtypes. Blocks which cannot be harvested should return null.
     */
    protected ItemStack createStackedBlock(int par1)
    {
    	return new ItemStack(Item.getItemFromBlock(this), 1, par1 & 3);
    }

    @Override
    public boolean isShearable(ItemStack item, IBlockAccess world, int x, int y, int z)
    {
        return true;
    }

    @Override
    public ArrayList<ItemStack> onSheared(ItemStack item, IBlockAccess world, int x, int y, int z, int fortune)
    {
        ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        ret.add(new ItemStack(this, 1, world.getBlockMetadata(x, y, z) & 3));
        return ret;
    }

    @Override
    public void beginLeavesDecay(World world, int x, int y, int z)
    {
        world.setBlockMetadataWithNotify(x, y, z, world.getBlockMetadata(x, y, z) | 8, 4);
    }

    @Override
    public boolean isLeaves(IBlockAccess world, int x, int y, int z)
    {
        return true;
    }	
}
