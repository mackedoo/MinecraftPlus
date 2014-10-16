package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemPickaxe;

public class ItemCopperPickaxe extends ItemPickaxe {
    public ItemCopperPickaxe(ToolMaterial p_i45347_1_) {
        super(p_i45347_1_);
        setUnlocalizedName(Names.Tools.COPPER_PICKAXE);
        setCreativeTab(MainClass.MinecraftPlusTab);
        setTextureName(Reference.MOD_ID + ":copper_pickaxe");
    }
}
