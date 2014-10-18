package me.mackedoo.minecraftplus.item;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item  {
	
	public ItemCopperIngot() {
        setUnlocalizedName(Names.Items.COPPER_INGOT);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
		setTextureName(Reference.MOD_ID + ":copper_ingot");
	}

}
