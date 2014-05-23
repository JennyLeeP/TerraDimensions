package com.cyborgJenn.terraDimensions.world.generators;

import java.util.Arrays;
import java.util.List;

import com.cyborgJenn.terraDimensions.world.biome.ModBiomes;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.structure.MapGenVillage;

public class MapGenVillageTD extends MapGenVillage {
	
	public MapGenVillageTD()
    {
        super();
    }
	
	public static List villageSpawnBiomes = Arrays.asList(new BiomeGenBase[] {ModBiomes.LushHills, ModBiomes.GreenRiver, ModBiomes.Beach});
}
