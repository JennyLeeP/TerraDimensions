package cyborgJenn.terraDimensions.blocks;

import cyborgJenn.terraDimensions.utils.Config;
import cyborgJenn.terraDimensions.utils.Reference;
import net.minecraft.block.Block;

public class ModBlocks {

	public static Block gateVerdant;

	public static void init(){
		gateVerdant = new BlockBaseTerraDimensions(1000).setBlockName(Reference.GATEVERDANT);
	}
}
