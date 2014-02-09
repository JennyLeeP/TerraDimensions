package cyborgJenn.terraDimensions.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.util.IIcon;

public class VerdantStone1 extends BlockBaseTerraDimensions{

IIcon[] icons = new IIcon[16];
    
    String[] StoneTypes1 = {"verdantstone","verdantcobble","verdantmossycobble", 
    						"verdantstonebrick", "verdantchiseledbrick",
    						"verdantcrackedbrick","verdantmossbrick", "granite",
    						"granitebrick","marble","marblebrick"};
    
	protected VerdantStone1(Material material) {
		super(material);
		// TODO Auto-generated constructor stub
	}

}
