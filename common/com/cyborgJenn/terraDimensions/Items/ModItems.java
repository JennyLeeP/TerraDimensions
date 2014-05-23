package com.cyborgJenn.terraDimensions.Items;

import com.cyborgJenn.terraDimensions.utils.Config;
import com.cyborgJenn.terraDimensions.utils.Reference;
import com.cyborgJenn.terraDimensions.utils.ReferenceItem;

import net.minecraft.item.Item;

public class ModItems {
	public static Item itemActiveMalaPortalKey;
	public static Item itemDarkenedMalaPortalKey;
	public static Item itemDarkenedCore;
	public static Item itemActiveVerdantPortalKey;
	public static Item itemEnlightenedVerdantPortalKey;
	public static Item itemEnlightenedCore;
	
	public static Item itemWhiteDye;
	public static Item itemBlackDye;
	public static Item itemBrownDye;
	public static Item itemMethaneClathrate;
	
	public static Item sphagnumMoss;
	public static Item shells;
	public static Item chalkShard;
	public static Item peat;
	
	public static void init() {
		itemActiveMalaPortalKey = new ItemMalaPortalKey(0).setUnlocalizedName(ReferenceItem.ItemActiveMalaPortalKey);		
		itemDarkenedMalaPortalKey = new ItemTerraDimensions(ReferenceItem.ItemDarkenedMalaPortalKey);
		itemDarkenedCore = new ItemTerraDimensions(ReferenceItem.ItemDarkenedCore);
		
		itemActiveVerdantPortalKey = new ItemVerdantPortalKey(0).setUnlocalizedName(ReferenceItem.ItemActiveVerdantPortalKey);		
		itemEnlightenedVerdantPortalKey = new ItemTerraDimensions(ReferenceItem.ItemEnlightenedVerdantPortalKey);
		itemEnlightenedCore = new ItemTerraDimensions(ReferenceItem.ItemEnlightenedCore);
		
		/* dyes */
		itemWhiteDye = new ItemTerraDimensions(ReferenceItem.ItemWhiteDye).setTextureName(Reference.TEXTURE + "dye_powder_white");
		itemBlackDye = new ItemTerraDimensions(ReferenceItem.ItemBlackDye).setTextureName(Reference.TEXTURE + "dye_powder_black");
		itemBrownDye = new ItemTerraDimensions(ReferenceItem.ItemBrownDye).setTextureName(Reference.TEXTURE + "dye_powder_brown");
		
		sphagnumMoss = new ItemTerraDimensions(ReferenceItem.SphagnumMoss).setTextureName(Reference.TEXTURE + "sphagnummoss");
		shells = new ItemTerraDimensions(ReferenceItem.Shells).setTextureName(Reference.TEXTURE + "shells");
		chalkShard = new ItemTerraDimensions(ReferenceItem.ChalkShard).setTextureName(Reference.TEXTURE + "chalkshard");
		peat = new ItemTerraDimensions(ReferenceItem.Peat).setTextureName(Reference.TEXTURE + "peat");
		
		itemMethaneClathrate = new ItemTerraDimensions(ReferenceItem.ItemMethaneClathrate).setTextureName(Reference.TEXTURE + "itemMethaneClathrate");
	}
}
