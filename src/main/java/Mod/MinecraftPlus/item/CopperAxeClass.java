package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemAxe;

public class CopperAxeClass extends ItemAxe {

	public CopperAxeClass(ToolMaterial p_i45327_1_) {
		super(p_i45327_1_);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(MainClass.MODID + ":copper_axe");
	}

}
