package com.cyborgJenn.terraDimensions.utils;

import java.io.File;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class Config {
	public static boolean enableTreeParticles;
	/* Debug */
	public static boolean enableDebugNaming;
	public static boolean enableDebuging;
    /* Dimension ID's */
    public static int dimensionVerdantID;
    public static int dimensionMalaID;
    public static int dimensionGalifreyID;
    /* Biome ID's TerraVerdant */
    public static int biomeLushHillsID;
    public static int biomeGreenRiverID;
    public static int biomeLivingPlateauID;
    public static int biomeBeachID;
    public static int biomeVioletBoscageID;
    public static int biomeMorassID;
    public static int biomePrimevalForestID;
    public static int biomeMangrovesID;
    /* Biome ID's TerraMala */
    public static int biomeTreacherousHillsID;
    public static int biomeBloodMountainsID;
	public static int keyMasterVillagerID;
	
	
	/*  Items */
	//public static int ItemActiveMalaPortalKeyId;
	
	
	public static void init(FMLPreInitializationEvent event) {

        File configFile = new File(event.getModConfigurationDirectory(), Reference.NAME + ".cfg");

        Configuration config = new Configuration(configFile);

        try{
            config.load();
            configParticles(config);
            configDebug(config);
            configStuff(config);

            configDimensionOptions(config);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            if (config.hasChanged())
                config.save();
        }
    }
    private static void configDimensionOptions(Configuration config) {
		String configDimensionOptions = "Dimension and Biome Options";
		
		/* Dimension ID's */
        dimensionVerdantID = config.get(configDimensionOptions, "TerraVerdant-DimensionID", 42).getInt();
        dimensionMalaID = config.get(configDimensionOptions, "TerraMala-DimensionID", 21).getInt();
        dimensionGalifreyID = config.get(configDimensionOptions, "Galifrey-DimensionID", 84).getInt();
       
        /* Biome ID's TerraVerdant */
        biomeLushHillsID = config.get(configDimensionOptions, "BiomeLushHillsID", 120).getInt();
        biomeGreenRiverID = config.get(configDimensionOptions, "BiomeGreenRiverID", 121).getInt();
        biomeLivingPlateauID = config.get(configDimensionOptions, "BiomeLivingPlateauID", 122).getInt();
        biomeBeachID = config.get(configDimensionOptions, "BiomeBeachID", 123).getInt();
        biomeVioletBoscageID = config.get(configDimensionOptions, "BiomeVioletBoscageID", 124).getInt();
        biomeMorassID = config.get(configDimensionOptions, "BiomeMorassID", 125).getInt();
        biomePrimevalForestID = config.get(configDimensionOptions, "BiomePrimevalForestID", 126).getInt();
        biomeMangrovesID = config.get(configDimensionOptions, "BiomeMangrovesID", 127).getInt();
        
        /* Biome ID's TerraMala */
        biomeTreacherousHillsID = config.get(configDimensionOptions, "BiomeTreacherousHillsID", 130).getInt();
        biomeBloodMountainsID = config.get(configDimensionOptions, "BiomeBloodMountainsID", 131).getInt();
		
	}
    private static void configParticles(Configuration config) {
		String configParticles = "Particles";
		enableTreeParticles = config.get(configParticles, "Enable Tree Particles", true).getBoolean(true);
    }
    private static void configStuff(Configuration config) {
        int iID = 30000;
        String configStuff = "Stuff 'n' Things";
        keyMasterVillagerID = config.get(configStuff, "KeyMasterVillagerID", 78844).getInt();
        //ItemActiveMalaPortalKeyId = config.get(configItems, ReferenceItem.ItemActiveMalaPortalKey, iID++).getInt();
         
    } 
	private static void configDebug(Configuration config){
        String debug = "Debug";
        enableDebugNaming = config.get(debug, "enable Debug Naming", true).getBoolean(true);
        enableDebuging = config.get(debug, "enable Debuging", true).getBoolean(true);
      
    }
}
