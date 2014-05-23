package com.cyborgJenn.terraDimensions.world.biome;

import com.cyborgJenn.terraDimensions.utils.Config;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;


public class ModBiomes {
	public static BiomeGenBase LushHills;
	public static BiomeGenBase GreenRiver;
	public static BiomeGenBase LivingPlateau;
	public static BiomeGenBase Beach;
	public static BiomeGenBase VioletBoscage;
	public static BiomeGenBase Morass;
	public static BiomeGenBase PrimevalForest;
	public static BiomeGenBase Mangroves;
	
	

	public static BiomeGenBase TreacherousHills;
	public static BiomeGenBase BloodMountains;

    public static void init() {
        initBiomes();
        registerBiomeTypes();
    }
    public static void initBiomes(){
    	// TerraVerdant Biome Types
        LushHills = (new BiomeGenLushHills(Config.biomeLushHillsID)).setBiomeName("Lush Hills");
        GreenRiver = (new BiomeGenGreenRiver(Config.biomeGreenRiverID)).setBiomeName("Green River");
        LivingPlateau = (new BiomeGenLivingPlateau(Config.biomeLivingPlateauID)).setBiomeName("Living Plateau");
        Beach = (new BiomeGenBeach(Config.biomeBeachID)).setBiomeName("Beach");
        VioletBoscage = (new BiomeGenVioletBoscage(Config.biomeVioletBoscageID)).setBiomeName("Violet Boscage");
        Morass = (new BiomeGenMorass(Config.biomeMorassID)).setBiomeName("Morass");
        PrimevalForest = (new BiomeGenPrimevalForest(Config.biomePrimevalForestID)).setBiomeName("Primeval Forest");
        Mangroves = (new BiomeGenMangroves(Config.biomeMangrovesID)).setBiomeName("Mangroves");
        
        // TerraMala Biome Types
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
