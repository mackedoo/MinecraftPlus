package me.mackedoo.minecraftplus.item.armor;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.init.ModItems;
import me.mackedoo.minecraftplus.reference.Materials;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ArmorCopper extends ItemArmor {
    public ArmorCopper(int armorType) {
        super(Materials.Armor.COPPER, 5, armorType);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);

        switch (armorType) {
            case 0:
                setUnlocalizedName(Names.Armor.COPPER_HELMET);
                setTextureName(Reference.MOD_ID + ":copper_helmet");
                break;
            case 1:
                setUnlocalizedName(Names.Armor.COPPER_CHESTPLATE);
                setTextureName(Reference.MOD_ID + ":copper_chestplate");
                break;
            case 2:
                setUnlocalizedName(Names.Armor.COPPER_LEGGINGS);
                setTextureName(Reference.MOD_ID + ":copper_leggings");
                break;
            case 3:
                setUnlocalizedName(Names.Armor.COPPER_BOOTS);
                setTextureName(Reference.MOD_ID + ":copper_boots");
                break;
        }
    }

    @Override
    public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
        Item item = stack.getItem();
        if (item == ModItems.COPPER_HELMET || item == ModItems.COPPER_CHESTPLATE || item == ModItems.COPPER_BOOTS) {
            return Reference.MOD_ID + ":textures/armor/copper_layer_1.png";
        } else if (item == ModItems.COPPER_LEGGINGS) {
            return Reference.MOD_ID + ":textures/armor/copper_layer_2.png";
        } else {
            return null;
        }
    }
}
