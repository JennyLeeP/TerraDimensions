package com.cyborgJenn.terraDimensions.blocks;

import java.util.Random;

import net.minecraft.block.BlockPortal;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;

import com.cyborgJenn.terraDimensions.TerraDimensions;
import com.cyborgJenn.terraDimensions.blocks.portal.TerraVerdantTeleporter;
import com.cyborgJenn.terraDimensions.utils.Config;

public class BlockMalaPortal extends BlockPortal{
	public BlockMalaPortal() { // Par1 = which portal, 0 = verdant, 1 = mala, 2 = galifrey
        super();
        this.setCreativeTab(TerraDimensions.tabTerraDimensions);
        this.setTickRandomly(true);
        this.setLightLevel(1.0F);
    }
	/**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World world, int par2, int par3, int par4, Random rand)
    {
        super.updateTick(world, par2, par3, par4, rand);

        if (world.provider.isSurfaceWorld() && world.getGameRules().getGameRuleBooleanValue("doMobSpawning") && rand.nextInt(2000) < world.difficultySetting.getDifficultyId())
        {
            int l;

            for (l = par3; !World.doesBlockHaveSolidTopSurface(world, par2, l, par4) && l > 0; --l)
            {
                ;
            }

            if (l > 0 && !world.getBlock(par2, l + 1, par4).isNormalCube())
            {
                Entity entity = ItemMonsterPlacer.spawnCreature(world, 57, (double)par2 + 0.5D, (double)l + 1.1D, (double)par4 + 0.5D);

                if (entity != null)
                {
                    entity.timeUntilPortal = entity.getPortalCooldown();
                }
            }
        }
    }
    /**
     * Returns a bounding box from the pool of bounding boxes (this means this box can change after the pool has been
     * cleared to be reused)
     */
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_)
    {
        return null;
    }
    /**
     * Triggered whenever an entity collides with this block (enters into the block). Args: world, x, y, z, entity
     */
    @Override
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity) {
        if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null)){

            if ((par5Entity.timeUntilPortal == 0) && (par5Entity instanceof EntityPlayerMP)){
                par5Entity.timeUntilPortal = 100;
                MinecraftServer minecraftserver = MinecraftServer.getServer();
                int dimID = par5Entity.dimension;
                WorldServer worldserver = minecraftserver.worldServerForDimension(dimID);
                WorldServer worldserver1 = minecraftserver
                        .worldServerForDimension(Config.dimensionMalaID);
                if (dimID == Config.dimensionMalaID){
                    minecraftserver.getConfigurationManager().transferPlayerToDimension(
                            (EntityPlayerMP) par5Entity, 0, new TerraVerdantTeleporter(worldserver));
                }else{
                    minecraftserver.getConfigurationManager().transferPlayerToDimension(
                            (EntityPlayerMP) par5Entity, Config.dimensionMalaID,
                            new TerraVerdantTeleporter(worldserver1));
                }
               
            }

        }
    }
}
