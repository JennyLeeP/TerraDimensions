package com.cyborgJenn.terraDimensions.world.generators;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

public class WorldGenTDSand extends WorldGenerator {

	/** Stores ID for WorldGenSand */
	private Block sandID;

	/** The maximum radius used when generating a patch of blocks. */
	private int radius;
	private int metaData;
	
	public WorldGenTDSand(int radius, Block block, int meta) {
		this.sandID = block;
        this.radius = radius;
        this.metaData = meta;
	}

	@Override
	public boolean generate(World world, Random rand, int posX, int posY, int posZ) {
		if (world.getBlock(posX, posY, posZ).getMaterial() != Material.water)
		{
			return false;
		}
		else
		{
			int l = rand.nextInt(this.radius - 2) + 2;
			byte b0 = 2;

			for (int i1 = posX - l; i1 <= posX + l; ++i1)
			{
				for (int j1 = posZ - l; j1 <= posZ + l; ++j1)
				{
					int k1 = i1 - posX;
					int l1 = j1 - posZ;

					if (k1 * k1 + l1 * l1 <= l * l)
					{
						for (int i2 = posY - b0; i2 <= posY + b0; ++i2)
						{
							Block j2 = world.getBlock(i1, i2, j1);

							if (j2 == ModBlocks.verdantDirt || j2 == ModBlocks.verdantGrass)
							{
							    //System.out.println("Sand DL Meta = "+ metaData);
							    this.setBlockAndNotifyAdequately(world, i1, i2, j1, this.sandID, this.metaData);
								//par1World.setBlockWithMeta(i1, i2, j1, this.sandID, 0, 2);
							}
						}
					}
				}
			}

			return true;
		}
		
	}
}
