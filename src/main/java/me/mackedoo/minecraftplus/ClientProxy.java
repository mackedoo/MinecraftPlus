package me.mackedoo.minecraftplus;

import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy {
    @Override
    public void initRendering() {
        RenderingRegistry.addNewArmourRendererPrefix("CopperArmor");
    }
}