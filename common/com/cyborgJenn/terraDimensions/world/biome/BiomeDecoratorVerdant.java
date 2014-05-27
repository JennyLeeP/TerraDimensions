package com.cyborgJenn.terraDimensions.world.biome;

import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.CLAY;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.FLOWERS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND;
import static net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.SAND_PASS2;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.COAL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIAMOND;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.DIRT;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GOLD;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.GRAVEL;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.IRON;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.LAPIS;
import static net.minecraftforge.event.terraingen.OreGenEvent.GenerateMinable.EventType.REDSTONE;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.event.terraingen.OreGenEvent;
import net.minecraftforge.event.terraingen.TerrainGen;

import com.cyborgJenn.terraDimensions.blocks.ModBlocks;
import com.cyborgJenn.terraDimensions.world.generators.WorldGenCursedNodes;
import com.cyborgJenn.terraDimensions.world.generators.WorldGenFlowersTD;
import com.cyborgJenn.terraDimensions.world.generators.WorldGenMethIce;

public class BiomeDecoratorVerdant extends BiomeDecorator{
	public WorldGenerator dirtGen;
    public WorldGenerator gravelGen;
    public WorldGenerator plantYellowGen;
    public WorldGenerator plantRedGen;
    public WorldGenerator methIceGen;

    public WorldGenerator Solarium;
    public WorldGenerator Quartz;
    public WorldGenerator BlackTourmaline;
    public WorldGenerator Carnelian;
    public WorldGenerator GoldenCalcite;
    public WorldGenerator BlueTopaz;
    public WorldGenerator Rubelite;
    public WorldGenerator Azurite;
    
    public WorldGenerator cursedNodesGen;
    
    public WorldGenerator whiteFlowersGen;
    public WorldGenerator orangeFlowersGen;
    public WorldGenerator yellowFlowersGen;
    public WorldGenerator magentaFlowersGen;
    public WorldGenerator blueFlowersGen;
    public WorldGenerator lightBlueFlowersGen;
    public WorldGenerator cyanFlowersGen;
    public WorldGenerator lightGrayFlowersGen;
    public WorldGenerator grayFlowersGen;
    public WorldGenerator purpleFlowersGen;
    public WorldGenerator pinkFlowersGen;
    public WorldGenerator limeFlowersGen;
    public WorldGenerator greenFlowersGen;
    public WorldGenerator brownFlowersGen;
    public WorldGenerator redFlowersGen;
    public WorldGenerator blackFlowersGen;

    
    public int methIcePerChunk;
    public int grassPerChunk;
    public int nodesPerChunk;
    
    public int whiteFlowersPerChunk;
    public int orangeFlowersPerChunk;
    public int yellowFlowersPerChunk;
    public int blueFlowersPerChunk;
    public int lightBlueFlowersPerChunk;
    public int CyanFlowersPerChunk;
    public int limeFlowersPerChunk;
    public int lightGrayFlowersPerChunk;
    public int grayFlowersPerChunk;
    public int purpleFlowersPerChunk;
    public int magentaFlowersPerChunk;
    public int pinkFlowersPerChunk;
    public int greenFlowersPerChunk;
    public int brownFlowersPerChunk;
    public int redFlowersPerChunk;
    public int blackFlowersPerChunk;

    public BiomeDecoratorVerdant(BiomeGenBase par1BiomeGenBase) {
        super();
        //this.plantYellowGen = new WorldGenDLFlowers(Block.plantYellow.blockID);
        //this.plantRedGen = new WorldGenDLFlowers(Block.plantRed.blockID);
        //this.sandGen = new WorldGenDLSand(7, ModBlocks.dreamFalling.blockID,0);
        this.dirtGen = new WorldGenMinable(ModBlocks.verdantDirt, 0, 32, ModBlocks.verdantStone);
        this.gravelGen = new WorldGenMinable(ModBlocks.terraGravel, 1, 32, ModBlocks.verdantStone);
        this.methIceGen = new WorldGenMethIce(4);
        //this.Solarium = new WorldGenMinable(ModBlocks.oreBlocks.blockID, 0, 6, ModBlocks.dreamStone.blockID);
        //this.Quartz = new WorldGenMinable(ModBlocks.oreBlocks.blockID,1 , 8, ModBlocks.dreamStone.blockID); 
        //this.BlackTourmaline = new WorldGenMinable(ModBlocks.oreBlocks.blockID,2 , 6, ModBlocks.dreamStone.blockID);
        //this.Carnelian = new WorldGenMinable(ModBlocks.oreBlocks.blockID,3 , 6, ModBlocks.dreamStone.blockID);
       // this.GoldenCalcite = new WorldGenMinable(ModBlocks.oreBlocks.blockID,4 , 6, ModBlocks.dreamStone.blockID);
        //this.BlueTopaz = new WorldGenMinable(ModBlocks.oreBlocks.blockID,5 , 8, ModBlocks.dreamStone.blockID);
        //this.Rubelite = new WorldGenMinable(ModBlocks.oreBlocks.blockID,6 , 6, ModBlocks.dreamStone.blockID);
        //this.Azurite = new WorldGenMinable(ModBlocks.oreBlocks.blockID,7 , 6, ModBlocks.dreamStone.blockID);

        this.cursedNodesGen = new WorldGenCursedNodes(ModBlocks.verdantStone1, 11);
        this.whiteFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,0);
        this.orangeFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,1);
        this.magentaFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,2);
        this.lightBlueFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,3);
        this.yellowFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,4);
        this.limeFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,5);
        this.pinkFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,6);
        this.grayFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,7);
        this.lightGrayFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,8);
        this.cyanFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,9);
        this.purpleFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,10);
        this.blueFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,11);
        this.brownFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,12);
        this.greenFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,13);
        this.redFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,14);
        this.blackFlowersGen = new WorldGenFlowersTD(ModBlocks.terraFlowers,15);


        
        this.whiteFlowersPerChunk = 0;
        this.orangeFlowersPerChunk = 0;
        this.yellowFlowersPerChunk = 0;
        this.blueFlowersPerChunk = 0;
        this.lightBlueFlowersPerChunk = 0;
        this.CyanFlowersPerChunk = 0;
        this.limeFlowersPerChunk = 0;
        this.lightGrayFlowersPerChunk = 0;
        this.grayFlowersPerChunk = 0;
        this.purpleFlowersPerChunk = 0;
        this.magentaFlowersPerChunk = 0;
        this.pinkFlowersPerChunk = 0;
        this.greenFlowersPerChunk = 0;
        this.brownFlowersPerChunk = 0;
        this.redFlowersPerChunk = 0;
        this.blackFlowersPerChunk = 0;
        
        this.methIcePerChunk = 2;
        this.flowersPerChunk = 0;
        this.grassPerChunk = 1;
        this.sandPerChunk = 7;
        this.sandPerChunk2 = 5;
        this.nodesPerChunk = 0;
        
    }
    /**
     * The method that does the work of actually decorating chunks
     */
    @Override
    protected void genDecorations(BiomeGenBase p_150513_1_)
    {
    	
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
        this.generateOres();
        int i;
        int j;
        int k;

        boolean doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND);
        for (i = 0; doGen && i < this.sandPerChunk; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }
        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, SAND_PASS2);
        for (i = 0; doGen && i < this.sandPerChunk2; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            this.sandGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }
        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, CLAY);
        for (i = 0; doGen && i < this.methIcePerChunk; ++i)
        {
            j = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            k = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            //this.methIceGen.generate(this.currentWorld, this.randomGenerator, j, this.currentWorld.getTopSolidOrLiquidBlock(j, k), k);
        }
        i = this.treesPerChunk;

        if (this.randomGenerator.nextInt(10) == 0)
        {
            ++i;
        }

        int l;

        
        int i1;

        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, FLOWERS);
        for (j = 0; doGen && j < this.flowersPerChunk; ++j)
        {
            k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(128);
            i1 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            //this.plantYellowGen.generate(this.currentWorld, this.randomGenerator, k, l, i1);

            if (this.randomGenerator.nextInt(4) == 0)
            {
                k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
                l = this.randomGenerator.nextInt(128);
                i1 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
                //this.plantRedGen.generate(this.currentWorld, this.randomGenerator, k, l, i1);
            }
        }
        for (j = 0; j < whiteFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            whiteFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < orangeFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            orangeFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < magentaFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            magentaFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < lightBlueFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            lightBlueFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < yellowFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            yellowFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < limeFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
           limeFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < pinkFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
           pinkFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < grayFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            grayFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < lightGrayFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            lightGrayFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < CyanFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            cyanFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < purpleFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            purpleFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < blueFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            blueFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < brownFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            brownFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < greenFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            greenFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < redFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            redFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < blackFlowersPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            blackFlowersGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        for (j = 0; j < nodesPerChunk; ++j)
        {
            k = chunk_X + randomGenerator.nextInt(16) + 8;
            l = randomGenerator.nextInt(128);
            i1 = chunk_Z + randomGenerator.nextInt(16) + 8;
            cursedNodesGen.generate(currentWorld, randomGenerator, k, l, i1);
        }
        doGen = TerrainGen.decorate(currentWorld, randomGenerator, chunk_X, chunk_Z, GRASS);
        for (j = 0; doGen && j < this.grassPerChunk; ++j)
        {
            k = this.chunk_X + this.randomGenerator.nextInt(16) + 8;
            l = this.randomGenerator.nextInt(128);
            i1 = this.chunk_Z + this.randomGenerator.nextInt(16) + 8;
            WorldGenerator worldgenerator = p_150513_1_.getRandomWorldGenForGrass(this.randomGenerator);
            worldgenerator.generate(this.currentWorld, this.randomGenerator, k, l, i1);
        }
        MinecraftForge.EVENT_BUS.post(new DecorateBiomeEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
    }
    
    /**
     * Standard ore generation helper. Generates most ores.
     */
    protected void genStandardOre1(int par1, WorldGenerator par2WorldGenerator, int par3, int par4)
    {
        
    }

    /**
     * Standard ore generation helper. Generates Lapis Lazuli.
     */
    protected void genStandardOre2(int par1, WorldGenerator par2WorldGenerator, int par3, int par4)
    {
        
    }
    /**
     * Generates ores in the current chunk
     */
    protected void generateOres()
    {
        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Pre(currentWorld, randomGenerator, chunk_X, chunk_Z));
        if (TerrainGen.generateOre(currentWorld, randomGenerator, dirtGen, chunk_X, chunk_Z, DIRT))
        this.genStandardOre1(20, this.dirtGen, 0, 256);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, gravelGen, chunk_X, chunk_Z, GRAVEL))
        this.genStandardOre1(10, this.gravelGen, 0, 256);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, coalGen, chunk_X, chunk_Z, COAL))
        this.genStandardOre1(20, this.coalGen, 0, 128);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, ironGen, chunk_X, chunk_Z, IRON))
        this.genStandardOre1(20, this.ironGen, 0, 64);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, goldGen, chunk_X, chunk_Z, GOLD))
        this.genStandardOre1(2, this.goldGen, 0, 32);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, redstoneGen, chunk_X, chunk_Z, REDSTONE))
        this.genStandardOre1(8, this.redstoneGen, 0, 16);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, diamondGen, chunk_X, chunk_Z, DIAMOND))
        this.genStandardOre1(1, this.diamondGen, 0, 16);
        if (TerrainGen.generateOre(currentWorld, randomGenerator, lapisGen, chunk_X, chunk_Z, LAPIS))
        this.genStandardOre2(1, this.lapisGen, 16, 16);
        MinecraftForge.ORE_GEN_BUS.post(new OreGenEvent.Post(currentWorld, randomGenerator, chunk_X, chunk_Z));
    }
}
