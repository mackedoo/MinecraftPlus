package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class CopperShovelClass extends ItemSpade {

	public CopperShovelClass(ToolMaterial p_i45353_1_) {
		super(p_i45353_1_);
		setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(MainClass.MODID + ":copper_shovel");
	}

}
