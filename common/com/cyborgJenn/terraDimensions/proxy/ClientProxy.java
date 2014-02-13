package com.cyborgJenn.terraDimensions.proxy;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy{
	@SuppressWarnings("static-access")
    @Override
	public boolean getGraphicsLevel()
	{
		// TODO Auto-generated method stub
		return Minecraft.getMinecraft().isFancyGraphicsEnabled();
	}
}
