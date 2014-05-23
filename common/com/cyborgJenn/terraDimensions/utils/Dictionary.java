package com.cyborgJenn.terraDimensions.utils;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class Dictionary {

    public static void register() {
    	/* Trees and Wood */
        OreDictionary.registerOre("plankWood", new ItemStack(ModBlocks.terraPlanks,1, Short.MAX_VALUE));
        OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.verdantLogs,1, Short.MAX_VALUE));    
        OreDictionary.registerOre("logWood", new ItemStack(ModBlocks.malaLogs,1, Short.MAX_VALUE));
        OreDictionary.registerOre("treeSapling", new ItemStack(ModBlocks.terraSaplings, 1, Short.MAX_VALUE));
        OreDictionary.registerOre("treeLeaves", new ItemStack(ModBlocks.terraLeaves, 1, Short.MAX_VALUE));
        
        /* dyes */
        OreDictionary.registerOre("dyeWhite", ModItems.itemWhiteDye);
        OreDictionary.registerOre("dyeBrown", ModItems.itemBrownDye);
        OreDictionary.registerOre("dyeBlack", ModItems.itemBlackDye);
        
        /* Ores */   // oreIron , etc
    }

}
