package com.cyborgJenn.terraDimensions.proxy;

import com.cyborgJenn.terraDimensions.entity.EntityLavaMite;
import com.cyborgJenn.terraDimensions.entity.EntityNMCreeper;
import com.cyborgJenn.terraDimensions.entity.EntityPhoenix;
import com.cyborgJenn.terraDimensions.entity.EntityPurpleSlimer;
import com.cyborgJenn.terraDimensions.entity.EntitySonicCreeper;
import com.cyborgJenn.terraDimensions.entity.EntitySpud;
import com.cyborgJenn.terraDimensions.render.RenderLavaMite;
import com.cyborgJenn.terraDimensions.render.RenderNMCreeper;
import com.cyborgJenn.terraDimensions.render.RenderPhoenix;
import com.cyborgJenn.terraDimensions.render.RenderPurpleSlimer;
import com.cyborgJenn.terraDimensions.render.RenderSonicCreeper;
import com.cyborgJenn.terraDimensions.render.RenderSpud;
import com.cyborgJenn.terraDimensions.render.TerraFenceRender;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelSlime;

public class ClientProxy extends CommonProxy{
	@SuppressWarnings("static-access")
	@Override
	public boolean getGraphicsLevel()
	{
		// TODO Auto-generated method stub
		return Minecraft.getMinecraft().isFancyGraphicsEnabled();
	}
	public void registerRenderers() {

		RenderingRegistry.registerEntityRenderingHandler(EntitySonicCreeper.class, new RenderSonicCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityNMCreeper.class, new RenderNMCreeper());
		RenderingRegistry.registerEntityRenderingHandler(EntityPhoenix.class, new RenderPhoenix());
		RenderingRegistry.registerEntityRenderingHandler(EntitySpud.class, new RenderSpud());
		RenderingRegistry.registerEntityRenderingHandler(EntityLavaMite.class, new RenderLavaMite());
		RenderingRegistry.registerEntityRenderingHandler(EntityPurpleSlimer.class, new RenderPurpleSlimer(new ModelSlime(16), new ModelSlime(0), 0.25F));

		RenderingRegistry.registerBlockHandler(new TerraFenceRender());
		//ClientRegistry.bindTileEntitySpecialRenderer(TileChickenAlter.class, new RenderChickenAlter());
	}
}
