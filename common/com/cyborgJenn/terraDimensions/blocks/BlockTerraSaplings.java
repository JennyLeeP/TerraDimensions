package com.cyborgJenn.terraDimensions.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.block.IGrowable;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.render.TerraFenceRender;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenBigSparklingTree;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenBrilliantTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenCharredTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenDLTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenDarkTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenDeathTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenIceBoundTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenInfernalTrees;
import com.cyborgJenn.terraDimensions.world.generators.trees.WorldGenLifeTrees;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTerraSaplings extends BlockSapling implements IGrowable{
	
	
	public static final String[] TerraSaplings = new String[]{"sparkling","charred","brilliant", "dark", "icebound", "infernal", "life", "death"};
	private static final IIcon[] textures = new IIcon[TerraSaplings.length];

	protected BlockTerraSaplings()
	{
		super();
		float f = 0.4F;
		this.setStepSound(Block.soundTypeGrass);
		this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
		this.setCreativeTab(TerraDimensions.tabTerraDimensions);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public IIcon getIcon(int side, int meta)
	{
		
		meta &= 7;
		return textures[MathHelper.clamp_int(meta, 0, 5)];
	}

	/**
	 * Determines the damage on the item the block drops. Used in cloth and wood.
	 */
	public int damageDropped(int par1)
	{
		return par1 & 3;
	}
	
	 //TODO Fix Same Sapling Check and Grow Tree Functions
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister) 
	{
		for(int i = 0; i < textures.length; i++){
			textures[i] = iconRegister.registerIcon(Reference.TEXTURE + "sapling_" + TerraSaplings[i]);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, @SuppressWarnings("rawtypes") List par3List)
	{
		for(int i = 0; i < textures.length; i++){
			par3List.add(new ItemStack(par1, 1, i));
		}  
	}
	 @Override
	 protected boolean canPlaceBlockOn(Block block)
	 {
		 return block == Blocks.grass || block == Blocks.dirt || block == Blocks.farmland || block == ModBlocks.verdantDirt || block == ModBlocks.malaDirt;
	 }

	public void func_149878_d(World world, int chunkX, int chunkY, int chunkZ, Random random) {
		if (!TerrainGen.saplingGrowTree(world, random, chunkX, chunkY, chunkZ)) return;

        int l = world.getBlockMetadata(chunkX, chunkY, chunkZ) & 7;
        Object object = null;
        int i1 = 0;
        int j1 = 0;
        boolean flag = false;
        if (l == 1)//Meta Sapling 1
        {
        	if (Config.enableDebuging){
            	System.out.println("Grow Ash Tree");
            }
            object = new WorldGenCharredTrees(true);
        }
        else if (l == 2)//Meta Sapling 2
        {
        	if (Config.enableDebuging){
            	System.out.println("Grow Brilliant Tree");
            }
            for (i1 = 0; i1 >= -1; --i1)
            {
                for (j1 = 0; j1 >= -1; --j1)
                {
                    if (this.isSameSapling(world, chunkX + i1, chunkY, chunkZ + j1, 2) && this.isSameSapling(world, chunkX + i1 + 1, chunkY, chunkZ + j1, 2) && this.isSameSapling(world, chunkX + i1, chunkY, chunkZ + j1 + 1, 2) && this.isSameSapling(world, chunkX + i1 + 1, chunkY, chunkZ + j1 + 1, 2))
                    {
                        object = new WorldGenBrilliantTrees(true);
                        flag = true;
                        break;
                    }
                }

                if (object != null)
                {
                    break;
                }
            }
            if (object == null)
            {
                j1 = 0;
                i1 = 0;
                object = new WorldGenDLTrees(true, 8 + random.nextInt(7), 1, 2, false,0);
            }
        }
        else if (l == 3)//Meta Sapling 3 = vanilla jungle
        {
        	if (Config.enableDebuging){
            	System.out.println("Grow PrimeEvil Tree");
            }
            for (i1 = 0; i1 >= -1; --i1)
            {
                for (j1 = 0; j1 >= -1; --j1)
                {
                    if (this.isSameSapling(world, chunkX + i1, chunkY, chunkZ + j1, 3) && this.isSameSapling(world, chunkX + i1 + 1, chunkY, chunkZ + j1, 3) && this.isSameSapling(world, chunkX + i1, chunkY, chunkZ + j1 + 1, 3) && this.isSameSapling(world, chunkX + i1 + 1, chunkY, chunkZ + j1 + 1, 3))
                    {
                        object = new WorldGenDarkTrees(true, 30 + random.nextInt(20), 1, 3);
                        flag = true;
                        break;
                    }
                }

                if (object != null)
                {
                    break;
                }
            }

            if (object == null)
            {
                j1 = 0;
                i1 = 0;
                object = new WorldGenDLTrees(true, 15 + random.nextInt(20), 1, 3, false,1);
            }
        }
        else if (l == 4)//Meta Sapling 4
        {
            object = new WorldGenIceBoundTrees(true);
            if (Config.enableDebuging){
            	System.out.println("Grow Frigid Tree");
            }
            
        }
        else if (l == 5)//Meta Sapling 5
        {
            object = new WorldGenInfernalTrees(true);
            if (Config.enableDebuging){
            	System.out.println("Grow Infernal Tree");
            }
        }
        else if (l == 6)//Meta Sapling 6
        {
            object = new WorldGenLifeTrees(true);
            if (Config.enableDebuging){
            	System.out.println("Grow Life Tree");
            }
        }
        else if (l == 7)//Meta Sapling 7
        {
            object = new WorldGenDeathTrees(true);
            if (Config.enableDebuging){
            	System.out.println("Grow Death Tree");
            }
        }
        else
        {
            object = new WorldGenBigSparklingTree(true);

            if (random.nextInt(10) == 0)
            {
                object = new WorldGenBigSparklingTree(true);
            }
        }
//Meta Sapling if stops here ********
        if (flag)
        {
        	world.setBlock(chunkX + i1, chunkY, chunkZ + j1, this, 0, 4);
        	world.setBlock(chunkX + i1 + 1, chunkY, chunkZ + j1, this, 0, 4);
        	world.setBlock(chunkX + i1, chunkY, chunkZ + j1 + 1, this, 0, 4);
        	world.setBlock(chunkX + i1 + 1, chunkY, chunkZ + j1 + 1, this, 0, 4);
        }
        else
        {
        	world.setBlock(chunkX, chunkY, chunkZ, this, 0, 4);
        }

        if (!((WorldGenerator)object).generate(world, random, chunkX + i1, chunkY, chunkZ + j1))
        {
            if (flag)
            {
            	world.setBlock(chunkX + i1, chunkY, chunkZ + j1, this, l, 4);
            	world.setBlock(chunkX + i1 + 1, chunkY, chunkZ + j1, this, l, 4);
            	world.setBlock(chunkX + i1, chunkY, chunkZ + j1 + 1, this, l, 4);
            	world.setBlock(chunkX + i1 + 1, chunkY, chunkZ + j1 + 1, this, l, 4);
            }
            else
            {
            	world.setBlock(chunkX, chunkY, chunkZ, this, l, 4);
            }
        }
		
	}
	/**
     * Determines if the same sapling is present at the given location.
     */
    public boolean isSameSapling(World par1World, int chunkX, int par3, int par4, int par5)
    {
        return par1World.getBlock(chunkX, par3, par4) == this && (par1World.getBlockMetadata(chunkX, par3, par4) & 7) == par5;
    }
    
}
