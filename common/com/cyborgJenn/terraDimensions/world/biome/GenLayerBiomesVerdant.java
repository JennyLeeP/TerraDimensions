package com.cyborgJenn.terraDimensions.world.biome;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerBiomesVerdant extends GenLayer {

	protected BiomeGenBase[] allowedBiomes = {ModBiomes.LushHills, ModBiomes.GreenRiver,ModBiomes.LivingPlateau,ModBiomes.Beach,
			ModBiomes.VioletBoscage, ModBiomes.Morass, ModBiomes.PrimevalForest, ModBiomes.Mangroves};
	
	public GenLayerBiomesVerdant(long seed, GenLayer genlayer) {
		super(seed);
		this.parent = genlayer;

	}
	public GenLayerBiomesVerdant(long seed) {
		super(seed);
		}


	@Override
	public int[] getInts(int x, int z, int width, int depth) {
		int[] dest = IntCache.getIntCache(width*depth);

		for (int dz=0; dz<depth; dz++)
		{
		for (int dx=0; dx<width; dx++)
		{
		this.initChunkSeed(dx+x, dz+z);
		dest[(dx+dz*width)] = this.allowedBiomes[nextInt(this.allowedBiomes.length)].biomeID;
		}
		}
		return dest;

	}

}
