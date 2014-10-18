package me.mackedoo.minecraftplus.item;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.item.ItemHoe;

public class ItemCopperHoe extends ItemHoe {

	public ItemCopperHoe(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
        setUnlocalizedName(Names.Tools.COPPER_HOE);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
		setTextureName(Reference.MOD_ID + ":copper_hoe");
	}

}
