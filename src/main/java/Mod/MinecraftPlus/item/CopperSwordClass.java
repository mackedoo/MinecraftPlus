package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class CopperSwordClass extends ItemSword {

	public CopperSwordClass(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(MainClass.MODID + ":copper_sword");
	}

}
