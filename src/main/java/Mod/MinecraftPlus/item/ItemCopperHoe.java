package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe {

	public ItemCopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
        setUnlocalizedName(Names.Tools.COPPER_HOE);
        setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(Reference.MOD_ID + ":copper_hoe");
	}

}
