package com.cyborgJenn.terraDimensions.handlers;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.cyborgJenn.terraDimensions.blocks.BlockTerraSaplings;
import com.cyborgJenn.terraDimensions.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.FillBucketEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent;
import net.minecraftforge.event.terraingen.InitMapGenEvent.EventType;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.Event.Result;


public class TerraEventHandler {

	@EventHandler
	public boolean onUseBonemeal(BonemealEvent event){
		
		if(event.world.isRemote)
			return true;

		if(event.block == ModBlocks.terraSaplings)
		{
			((BlockTerraSaplings)(ModBlocks.terraSaplings)).func_149878_d(event.world, event.x, event.y, event.z, new Random());
			event.setResult(Result.ALLOW);
		}
		return false;
	}
	
	public static TerraEventHandler INSTANCE = new TerraEventHandler();
	public Map<Block, Item> buckets = new HashMap<Block, Item>();

	@EventHandler
	public void onBucketFill(FillBucketEvent event){

		ItemStack result = fillBucket(event.world, event.target);

		if (result == null){
			return;
		}

		event.result = result;
		event.setResult(Result.ALLOW);

	}
	private ItemStack fillBucket(World world, MovingObjectPosition pos){

		Block block = world.getBlock(pos.blockX, pos.blockY, pos.blockZ);

		Item bucket = buckets.get(block);

		if (bucket != null && world.getBlockMetadata(pos.blockX, pos.blockY, pos.blockZ) == 0){
			world.setBlockToAir(pos.blockX, pos.blockY, pos.blockZ);
			return new ItemStack(bucket);
		}

		return null;


	}
	@EventHandler
	public void onMineshaftGeneration(InitMapGenEvent event){
		World world = Minecraft.getMinecraft().theWorld;
		if (event.type == EventType.MINESHAFT){
			System.out.println("Generated Mineshaft");
		}
	}
}
