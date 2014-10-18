package me.mackedoo.minecraftplus.item;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemCopperPickaxe extends ItemPickaxe {
    public ItemCopperPickaxe(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        setUnlocalizedName(Names.Tools.COPPER_PICKAXE);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
        setTextureName(Reference.MOD_ID + ":copper_pickaxe");
    }
}
