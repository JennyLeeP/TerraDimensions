package com.cyborgJenn.terraDimensions.village;

import java.util.Random;

import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;

import com.cyborgJenn.terraDimensions.Items.ModItems;
import com.cyborgJenn.terraDimensions.utils.Config;

import cpw.mods.fml.common.registry.VillagerRegistry.IVillageTradeHandler;

public class VillagerTrades implements IVillageTradeHandler {

	@Override
	public void manipulateTradesForVillager(EntityVillager villager,MerchantRecipeList recipeList, Random random) {
		if (villager.getProfession() == Config.keyMasterVillagerID)
		{
			recipeList.addToListWithCheck(new MerchantRecipe(new ItemStack(Items.emerald, 1, 23), new ItemStack(ModItems.itemDarkenedMalaPortalKey, 1, 20)));
		}

	}

}
