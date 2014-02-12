package com.cyborgJenn.terraDimensions.utils;

import net.minecraft.block.Block;

public class Reference {

	public static final String MODID = "terraDimensions";
	public static final String NAME = "TerraDimensions";
	public static final String VERSION = "@VERSION@";

	//*********************** Locations ***********************
	public static final String PROXY = "com.cyborgJenn.terraDimensions.proxy.";
	public static final String CLIENTPROXY =  PROXY + "ClientProxy";
	public static final String SERVERPROXY = PROXY + "CommonProxy";
	public static final String TEXTURE = MODID + ":";
	public static final String GUITEXTURE = TEXTURE + "/textures/gui/";
	public static final String lang = "/assets/terraDimensions/lang/";

	//*********************** Biomes ***************************
	
	//*********************** Creative Tabs ********************
    public static final String TABTERRADIMENSIONS = "tabTerraDimensions";
    
    //*********************** Languages ********************
    public static String[] langFiles = { 
        // EN Language
        lang + "en_US.xml", 
        // ES Language
        lang + "es_ES.xml" };
    
  //************************* Blocks ********************
	public static String GATEVERDANT = "gateVerdant";
	public static String GATEMALA = "gateMala";
	public static String GATEGALIFREY = "gateGalifrey";
	
	
}
