package com.cyborgJenn.terraDimensions.handlers;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import cpw.mods.fml.common.registry.GameRegistry;

public class RecipeHandler {
	public static void addRecipes() {
		
        // Creates Shaped Recipes
        addShapedRecipes();

        // Creates Shapeless Recipes
        addShapelessRecipes();
        
        // Smelting Recipes
        addSmeltingRecipes();
    }
	private static void addShapedRecipes() {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.gateVerdant), new Object[] { "XSX", "XOX", "XSX", 'X', Blocks.obsidian, 'S', Blocks.diamond_block, 'O', ModItems.itemActiveVerdantPortalKey});

        GameRegistry.addRecipe(new ItemStack(ModItems.itemDarkenedMalaPortalKey), new Object[] { " O ", "OXO", " O ", 'X', Items.diamond , 'O', ModItems.itemDarkenedCore});
        GameRegistry.addRecipe(new ItemStack(ModItems.itemDarkenedCore), new Object[] { " O ", "OXO", " O ", 'X', Items.diamond});
        GameRegistry.addRecipe(new ItemStack(ModItems.itemEnlightenedVerdantPortalKey), new Object[] { " O ", "OXO", " O ", 'X', Items.diamond , 'O', ModItems.itemDarkenedCore});
        GameRegistry.addRecipe(new ItemStack(ModItems.itemEnlightenedCore), new Object[] { " O ", "OXO", " O ", 'X', Items.diamond});

        //GameRegistry.addRecipe(new ItemStack(ModItems.itemSwordPhantomIron), new Object[] { " O ", " O ", " X ", 'X', Item.emerald, 'O', Item.diamond });
        // PLanks to Fences
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,0), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,1), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,1)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,2), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,2)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,3), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,3)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,4), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,4)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,5), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,5)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,6), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,6)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraFences,4,7), new Object[] { "XXX", "X X", 'X', new ItemStack(ModBlocks.terraPlanks,1,7)});

        // Stones to walls
        // TODO Fix Wall Recipes
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,0), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,1), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,2)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,2), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,3)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,3), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,4)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,4), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.malaStone1,1,0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,5), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,6)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,6), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,7)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,7), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,0)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,8), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,1)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,9), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,9)});
        GameRegistry.addRecipe(new ItemStack(ModBlocks.terraWalls,6,10), new Object[] { "XXX", "XXX", 'X', new ItemStack(ModBlocks.verdantStone1,1,10)});
        
        // Stones to Slabs
        //GameRegistry.addRecipe(new ItemStack(ModBlocks.dreamStoneSlabs,6,0), new Object[] { "XXX", 'X', new ItemStack(ModBlocks.dreamCobble,1,0)});
        
        // Flowers to Dyes
        
        GameRegistry.addRecipe(new ItemStack(ModItems.itemWhiteDye,2,15), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,0 )});// White - bonemeal
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,14), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,1 )});// orange
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,13), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,2 )});// magenta
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,12), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,3 )});// light blue
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,11), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,4 )});// yellow
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,10), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,5 )});// lime
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,9), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,6 )});// pink
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,8), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,7 )});// gray
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,7), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,8 )});//  silver
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,6), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,9 )});// cyan
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,5), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,10 )});// purple
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,4), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,11 )});// blue - lapis
        GameRegistry.addRecipe(new ItemStack(ModItems.itemBrownDye,2,0), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,12 )});// brown - cocoa
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,2), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,13 )});// green
        GameRegistry.addRecipe(new ItemStack(Items.dye,2,1), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,14)});// red
        GameRegistry.addRecipe(new ItemStack(ModItems.itemBlackDye,2,0), new Object[] { "XX", 'X', new ItemStack(ModBlocks.terraFlowers,1,15 )});// Black - inksacs
        
    }

    private static void addShapelessRecipes() {
        //Logs to Planks
    	
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 0), new Object[] {new ItemStack(ModBlocks.verdantLogs, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 2), new Object[] {new ItemStack(ModBlocks.verdantLogs, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 4), new Object[] {new ItemStack(ModBlocks.verdantLogs, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 6), new Object[] {new ItemStack(ModBlocks.verdantLogs, 1, 3)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 1), new Object[] {new ItemStack(ModBlocks.malaLogs, 1, 0)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 3), new Object[] {new ItemStack(ModBlocks.malaLogs, 1, 1)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 5), new Object[] {new ItemStack(ModBlocks.malaLogs, 1, 2)});
        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.terraPlanks, 4, 7), new Object[] {new ItemStack(ModBlocks.malaLogs, 1, 3)});

    }
    private static void addSmeltingRecipes(){
        // Cobble to Smooth Stone
        //GameRegistry.addSmelting(ModBlocks.verdantCobble, new ItemStack(ModBlocks.verdantStone), 0.1f);
        //GameRegistry.addSmelting(ModBlocks.malaCobble, new ItemStack(ModBlocks.malaStone), 0.1f);
        // Ores to ingots
        //FurnaceRecipes.smelting().addSmelting(ModBlocks.oreBlocks, 0, new ItemStack(ModItems.itemlighter, 1, 0), 0.1f);
        //FurnaceRecipes.smelting().addSmelting(ModBlocks.oreBlocks, 8, new ItemStack(ModItems.itemlighter, 1, 0), 0.1f);
    }
}
