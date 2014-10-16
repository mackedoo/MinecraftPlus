package Mod.MinecraftPlus.item.armor;

import Mod.MinecraftPlus.MinecraftPlus;
import Mod.MinecraftPlus.reference.Materials;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemArmor;

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
}
