package com.cyborgJenn.terraDimensions.render;

import com.cyborgJenn.terraDimensions.entity.EntityPhoenix;
import com.cyborgJenn.terraDimensions.model.ModelPhoenix;
import com.cyborgJenn.terraDimensions.utils.Reference;

import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;

public class RenderPhoenix extends RenderLiving{

	private static final ResourceLocation phoenixTexture = new ResourceLocation(Reference.TEXTURE + "textures/mobs/phoenix.png");
	
	public RenderPhoenix() {
		super(new ModelPhoenix(), 0.5F);
		// TODO Auto-generated constructor stub
	}
	public void renderPhoenix(EntityPhoenix par1EntityPhoenix, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityPhoenix, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderPhoenix((EntityPhoenix)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderPhoenix((EntityPhoenix)par1Entity, par2, par4, par6, par8, par9);
    }
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		// TODO Auto-generated method stub
		return phoenixTexture;
	}
}
