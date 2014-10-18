package me.mackedoo.minecraftplus.item;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemCopperShovel extends ItemSpade {
    public ItemCopperShovel(ToolMaterial p_i45353_1_) {
        super(p_i45353_1_);
        setUnlocalizedName(Names.Tools.COPPER_SHOVEL);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
        setTextureName(Reference.MOD_ID + ":copper_shovel");
    }
}
