package Mod.MinecraftPlus.init;

import Mod.MinecraftPlus.reference.Materials;
import Mod.MinecraftPlus.item.*;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Materials.Armor;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ModItems {
    //Items
    public static final Item COPPER_INGOT = new ItemCopperIngot();

    //Tools
    public static final Item COPPER_AXE = new ItemCopperAxe(Materials.Tools.COPPER);
    public static final Item COPPER_HOE = new ItemCopperHoe(Materials.Tools.COPPER);
    public static final Item COPPER_PICKAXE = new ItemCopperPickaxe(Materials.Tools.COPPER);
    public static final Item COPPER_SHOVEL = new ItemCopperShovel(Materials.Tools.COPPER);
    public static final Item COPPER_SWORD = new ItemCopperSword(Materials.Tools.COPPER);
    
    //Armor
    public static final Item COPPER_HELMET = new ArmorCopper(Materials.Armor.COPPER);
    public static void init() {
        initItems();
        initTools();
        initArmor();
    }

    private static void initArmor() {
    	GameRegistry.registerItem(COPPER_HELMET, Names.Armor.COPPER_HELMET);
		
	}

	// Register the items
    private static void initItems() {
        GameRegistry.registerItem(COPPER_INGOT, Names.Items.COPPER_INGOT);
    }

    // Register the tools
    private static void initTools() {
        GameRegistry.registerItem(COPPER_AXE, Names.Tools.COPPER_AXE);
        GameRegistry.registerItem(COPPER_HOE, Names.Tools.COPPER_HOE);
        GameRegistry.registerItem(COPPER_PICKAXE, Names.Tools.COPPER_PICKAXE);
        GameRegistry.registerItem(COPPER_SHOVEL, Names.Tools.COPPER_SHOVEL);
        GameRegistry.registerItem(COPPER_SWORD, Names.Tools.COPPER_SWORD);
    }
}
