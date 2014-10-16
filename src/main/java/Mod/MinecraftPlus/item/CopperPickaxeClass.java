package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemPickaxe;

public class CopperPickaxeClass extends ItemPickaxe {

	public CopperPickaxeClass(ToolMaterial p_i45347_1_) {
		super(p_i45347_1_);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(MainClass.MODID + ":copper_pickaxe");
	}

}
