package com.cyborgJenn.terraDimensions.world.biome;

import com.cyborgJenn.terraDimensions.utils.Config;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;


public class ModBiomes {
	public static BiomeGenBase LushHills;
	public static BiomeGenBase GreenRiver;
	

	public static BiomeGenBase TreacherousHills;
	public static BiomeGenBase BloodMountains;

    public static void init() {
        intiBiomes();
        registerBiomeTypes();
    }
    public static void intiBiomes(){
        LushHills = (new BiomeGenLushHills(Config.biomeLushHillsID)).setColor(8900670).setBiomeName("Lush Hills").setTemperatureRainfall(0.2F, 0.3F).setEnableSnow();
        GreenRiver = (new BiomeGenGreenRiver(Config.biomeGreenRiverID)).setColor(8900670).setBiomeName("Green River").setTemperatureRainfall(0.2F, 0.3F).setEnableSnow();
        
        TreacherousHills = (new BiomeGenTreacherousHills(Config.biomeTreacherousHillsID)).setColor(6316128).setBiomeName("Treacherous Hills").setDisableRain();
        BloodMountains = (new BiomeGenBloodMountains(Config.biomeBloodMountainsID)).setColor(6316128).setBiomeName("Blood Mountains").setDisableRain();
    }
    
    public static void registerBiomeTypes(){
        BiomeDictionary.registerBiomeType(LushHills, Type.MAGICAL, Type.HILLS, Type.FOREST);
        BiomeDictionary.registerBiomeType(GreenRiver, Type.MAGICAL, Type.BEACH);
        
        BiomeDictionary.registerBiomeType(TreacherousHills, Type.NETHER, Type.HILLS);
        BiomeDictionary.registerBiomeType(BloodMountains, Type.NETHER, Type.HILLS);
    }
}
