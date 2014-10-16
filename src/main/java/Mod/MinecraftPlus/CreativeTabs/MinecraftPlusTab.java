 package Mod.MinecraftPlus.CreativeTabs;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class MinecraftPlusTab extends CreativeTabs {

	public MinecraftPlusTab(int p_i1853_1_, String p_i1853_2_) {
		super(p_i1853_1_, p_i1853_2_);
	}

	@Override
	public Item getTabIconItem() {
		return MainClass.CopperIngot;
	}

}
