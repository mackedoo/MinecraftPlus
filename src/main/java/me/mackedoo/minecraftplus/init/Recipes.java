package me.mackedoo.minecraftplus.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Recipes {
    public static void init() {
        initRecipes();
        initShapeless();
    }

    // Initialize shapeless recipes
    private static void initShapeless() {
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.COPPER_INGOT, 9), ModBlocks.COPPER_BLOCK);
    }

    private static void initRecipes() {
        //Recipes
        Object stick = Item.itemRegistry.getObject("stick");
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_AXE, 1), "CC ", "CS ", " S ", 'C', ModItems.COPPER_INGOT, 'S', stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_HOE, 1), "CC ", " S ", " S ", 'C', ModItems.COPPER_INGOT, 'S', stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_PICKAXE, 1), "CCC", " S ", " S ", 'C', ModItems.COPPER_INGOT, 'S', stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_SHOVEL, 1), " C ", " S ", " S ", 'C', ModItems.COPPER_INGOT, 'S', stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_SWORD, 1), " C ", " C ", " S ", 'C', ModItems.COPPER_INGOT, 'S', stick);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.COPPER_BLOCK, 1), "CCC", "CCC", "CCC", 'C', ModItems.COPPER_INGOT);

        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_HELMET, 1), "CCC", "C C", "   ", 'C', ModItems.COPPER_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_HELMET, 1), "   ", "CCC", "C C", 'C', ModItems.COPPER_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_CHESTPLATE, 1), "C C", "CCC", "CCC", 'C', ModItems.COPPER_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_LEGGINGS, 1), "CCC", "C C", "C C", 'C', ModItems.COPPER_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_BOOTS, 1), "C C", "C C", "   ", 'C', ModItems.COPPER_INGOT);
        GameRegistry.addRecipe(new ItemStack(ModItems.COPPER_BOOTS, 1), "   ", "C C", "C C", 'C', ModItems.COPPER_INGOT);
    }
}
