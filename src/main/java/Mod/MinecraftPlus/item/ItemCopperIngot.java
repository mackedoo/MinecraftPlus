package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCopperIngot extends Item  {
	
	public ItemCopperIngot() {
        setUnlocalizedName(Names.Items.COPPER_INGOT);
        setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(Reference.MOD_ID + ":copper_ingot");
	}

}
