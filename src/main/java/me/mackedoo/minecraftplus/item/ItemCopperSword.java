package me.mackedoo.minecraftplus.item;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword {

	public ItemCopperSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
        setUnlocalizedName(Names.Tools.COPPER_SWORD);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
		setTextureName(Reference.MOD_ID + ":copper_sword");
	}

}
