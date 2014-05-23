package com.cyborgJenn.terraDimensions.blocks.portal;

import net.minecraft.util.ChunkCoordinates;

public class TerraVerdantPortalPosition extends ChunkCoordinates {
	public long field_85087_d;
	final TerraVerdantTeleporter field_85088_e;
	public TerraVerdantPortalPosition(TerraVerdantTeleporter par1Teleporter, int par2, int par3, int par4, long par5) {
		super();// (par2, par3, par4)
		field_85088_e = par1Teleporter;
		field_85087_d = par5;
	}

}

