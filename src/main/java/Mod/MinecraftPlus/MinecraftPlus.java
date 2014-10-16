package Mod.MinecraftPlus;

import Mod.MinecraftPlus.creativetab.MinecraftPlusTab;
import Mod.MinecraftPlus.init.ModBlocks;
import Mod.MinecraftPlus.init.ModItems;
import Mod.MinecraftPlus.init.Recipes;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import Mod.MinecraftPlus.world.MinecraftPlusWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION)
public class MinecraftPlus {
    @SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_COMMON)
    public static CommonProxy proxy;

    //Creative Tabs
    public static CreativeTabs MINECRAFTPLUS_TAB = new MinecraftPlusTab(CreativeTabs.getNextID(), Names.Tabs.MINECRAFTPLUS_TAB);

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
        GameRegistry.registerWorldGenerator(new MinecraftPlusWorldGenerator(), 1);

        proxy.initRendering();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

