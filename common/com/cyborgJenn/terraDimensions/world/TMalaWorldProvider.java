package com.cyborgJenn.terraDimensions.world;

import com.cyborgJenn.terraDimensions.render.TerraVerdantSkyRenderer;
import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.world.chunk.ChunkProviderTerraMala;
import com.cyborgJenn.terraDimensions.world.chunk.ChunkProviderTerraVerdant;
import com.cyborgJenn.terraDimensions.world.chunk.WorldChunkManagerMala;
import com.cyborgJenn.terraDimensions.world.chunk.WorldChunkManagerVerdant;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;
import net.minecraftforge.common.DimensionManager;

public class TMalaWorldProvider extends WorldProvider{

IRenderHandler skyRenderer;
	
	@Override
	public String getDimensionName() {
		return "TerraMala";
	}
	/*
	@SideOnly(Side.CLIENT)
    public IRenderHandler getSkyRenderer()
    {
            return new TerraVerdantSkyRenderer();
    }
	*/
	/**
     * creates a new world chunk manager for WorldProvider
     */
    @Override
    public void registerWorldChunkManager() {
        this.worldChunkMgr = new WorldChunkManagerMala(worldObj.getSeed(), terrainType);
        this.dimensionId = Config.dimensionMalaID;
        this.hasNoSky = true;//true = world with normal sky but no light
    }
    /**
     * Returns 'true' if in the "main surface world", but 'false' if in the Nether or End dimensions.
     */
    public boolean isSurfaceWorld()
    {
        return false;
    }
    /** Get Provider for dimension **/
    public static WorldProvider getProviderForDimension(int id)
    {
    return DimensionManager.createProviderFor(Config.dimensionMalaID);
    }
    
    /** Welcome message **/
    public String getWelcomeMessage()
    {
    return "Entering TerraMala";
    }

    /** What chunk provider to use **/
    public IChunkProvider createChunkGenerator()
    {
    return new ChunkProviderTerraMala(worldObj, worldObj.getSeed(), true);
    }
    public String getSaveFolder()
    {
        return "TerraMala";
    }
    /** Can player re-spawn here **/
    public boolean canRespawnHere()
    {
    return true;
    }
    /**
     * Return Vec3D with biome specific fog color
     */
    public Vec3 getFogColor(float par1, float par2)// World Fog Color * visible beyond loaded chunks.
    {
    	int i = 10518688;
        float f2 = MathHelper.cos(par1 * (float)Math.PI * 2.0F) * 2.0F + 0.5F;

        if (f2 < 0.0F)
        {
            f2 = 0.0F;
        }

        if (f2 > 1.0F)
        {
            f2 = 1.0F;
        }

        float f3 = (float)(i >> 16 & 255) / 255.0F;
        float f4 = (float)(i >> 8 & 255) / 255.0F;
        float f5 = (float)(i & 255) / 255.0F;
        f3 *= f2 * 0.0F + 0.15F;
        f4 *= f2 * 0.0F + 0.15F;
        f5 *= f2 * 0.0F + 0.15F;
        return this.worldObj.getWorldVec3Pool().getVecFromPool((double)f3, (double)f4, (double)f5);
    }
    @SideOnly(Side.CLIENT)
    @Override
    public float getCloudHeight()
    {
        return 0.0F;//256.0F Sets cloud height at 256 instead of 128, 0.0F = clouds at Bedrock
    }
}
