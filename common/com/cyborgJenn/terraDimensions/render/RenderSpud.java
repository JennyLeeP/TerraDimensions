package com.cyborgJenn.terraDimensions.render;

import net.minecraft.block.Block;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.MinecraftForgeClient;

import org.lwjgl.opengl.GL11;

import com.cyborgJenn.terraDimensions.model.ModelNMCreeper;
import com.cyborgJenn.terraDimensions.model.ModelPhoenix;
import com.cyborgJenn.terraDimensions.model.ModelSonicCreeper;
import com.cyborgJenn.terraDimensions.model.ModelSpud;
import com.cyborgJenn.terraDimensions.utils.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderSpud extends RenderLiving {
	
	private static final ResourceLocation spudTexture = new ResourceLocation(Reference.TEXTURE + "textures/mobs/spud.png");
	

	/** The creeper model. */
    private ModelBase spudModel = new ModelSpud();

    public RenderSpud()
    {
        super(new ModelSpud(), 0.5F);
    }

	

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return spudTexture;
	}
}
