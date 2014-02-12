package com.cyborgJenn.terraDimensions.utils;

import java.io.File;

import net.minecraft.block.material.Material;
import net.minecraftforge.common.config.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


public class Config {
	//Debug 
	public static boolean enableDebugNaming;
    // Dimension ID
    public static int dimensionVerdantID;
    public static int dimensionMalaID;
    public static int dimensionGalifreyID;
    // Biome ID's
    public static int biomeLushHillsID;
    public static int biomeTreacherousHillsID;
    public static int biomeGreenRiverID;
    public static int biomeBloodMountainsID;
	public static Material gateVerdantM;
    
	public static void init(FMLPreInitializationEvent event) {

        File configFile = new File(event.getModConfigurationDirectory(), Reference.NAME + ".cfg");

        Configuration config = new Configuration(configFile);

        try{
            config.load();

            configDebug(config);

            configDimensionOptions(config);

        }catch(Exception e){
            System.out.println(e);
        }finally{
            if (config.hasChanged())
                config.save();
        }
    }
    private static void configDimensionOptions(Configuration config) {
		String configDimensionOptions = "Dimension Options";
		//**********Dimension ID's***********
        dimensionVerdantID = config.get(configDimensionOptions, "TerraVerdant-DimensionID", 42).getInt();
        dimensionMalaID = config.get(configDimensionOptions, "TerraMala-DimensionID", 21).getInt();
        dimensionGalifreyID = config.get(configDimensionOptions, "Galifrey-DimensionID", 84).getInt();
        
        //**********Biome ID's***************
        biomeLushHillsID = config.get(configDimensionOptions, "BiomeLushHillsID", 120).getInt();
        biomeGreenRiverID = config.get(configDimensionOptions, "BiomeGreenRiverID", 121).getInt();
        
        biomeTreacherousHillsID = config.get(configDimensionOptions, "BiomeTreacherousHillsID", 130).getInt();
        biomeBloodMountainsID = config.get(configDimensionOptions, "BiomeBloodMountainsID", 131).getInt();
		
	}
    private static void configBlocks(Configuration config) {
		String configBlocks = "********Blocks********";
		
    }
	private static void configDebug(Configuration config){
        String debug = "Debug";
        enableDebugNaming = config.get(debug, "enable Debug Naming", true).getBoolean(true);
      
    }
}
