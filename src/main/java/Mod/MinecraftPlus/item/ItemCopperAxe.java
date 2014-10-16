package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemAxe;

public class ItemCopperAxe extends ItemAxe {
    public ItemCopperAxe(ToolMaterial p_i45327_1_) {
        super(p_i45327_1_);

        setUnlocalizedName(Names.Tools.COPPER_AXE);
        setCreativeTab(MainClass.MinecraftPlusTab);
        setTextureName(Reference.MOD_ID + ":copper_axe");
    }
}
