package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class CopperHoeClass extends ItemHoe {

	public CopperHoeClass(ToolMaterial p_i45343_1_) {
		super(p_i45343_1_);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(MainClass.MODID + ":copper_hoe");
	}

}
