package cyborgJenn.terraDimensions.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class MalaStone1 extends BlockBaseTerraDimensions{

IIcon[] icons = new IIcon[16];
    
    String[] StoneTypes1 = {"malastone","malacobble","bloodcobble", 
    						"malastonebrick", "malachiseledbrick",
    						"malacrackedbrick","bloodbrick", "cursedstone"};
    
	protected MalaStone1(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}

}
