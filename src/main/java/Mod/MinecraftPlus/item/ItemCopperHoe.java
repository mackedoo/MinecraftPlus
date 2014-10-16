package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MinecraftPlus;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe {

	public ItemCopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
        setUnlocalizedName(Names.Tools.COPPER_HOE);
        setCreativeTab(MinecraftPlus.MinecraftPlusTab);
		setTextureName(Reference.MOD_ID + ":copper_hoe");
	}

}
