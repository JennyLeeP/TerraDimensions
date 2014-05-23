package com.cyborgJenn.terraDimensions.itemBlock;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

public class ItemBlockTerraTreeTypes extends ItemBlock{

	protected ItemBlockTerraTreeTypes(Block par1) {
		super(par1);
		setHasSubtypes(true);
		// MetaNames = new String[]{"sparkling","charred","brilliant", "dark", "icebound", "infernal", "life", "death"};
	}
	public String getUnlocalizedName(ItemStack itemstack)
	{
		String name = "";
		switch (itemstack.getItemDamage())
		{
			case 0:
			{
				name = "sparkling";
				break;
			}
			case 1:
			{
				name = "charred";
				break;
			}
			case 2:
			{
				name = "brilliant";
				break;
			}
			case 3:
			{
				name = "dark";
				break;
			}
			case 4:
			{
				name = "icebound";
				break;
			}
			case 5:
			{
				name = "infernal";
				break;
			}
			case 6:
			{
				name = "life";
				break;
			}
			case 7:
			{
				name = "death";
				break;
			}
			case 8:
			{
				name = "mangrove";
				break;
			}
			default: name = "broken";
			}
		return getUnlocalizedName() + "." + name;

	}

}
