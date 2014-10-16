package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MinecraftPlus;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemSpade;

public class ItemCopperShovel extends ItemSpade {
    public ItemCopperShovel(ToolMaterial p_i45353_1_) {
        super(p_i45353_1_);
        setUnlocalizedName(Names.Tools.COPPER_SHOVEL);
        setCreativeTab(MinecraftPlus.MinecraftPlusTab);
        setTextureName(Reference.MOD_ID + ":copper_shovel");
    }
}
