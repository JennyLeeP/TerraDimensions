package cyborgJenn.terraDimensions.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockBaseTerraDimensions extends Block{

	protected BlockBaseTerraDimensions(Material material) {
		super(material);
		//this.setCreativeTab(DreamLand.tabDreamLand);
	}

	public BlockBaseTerraDimensions(int i) {
		super(Material.rock);
	}

}
