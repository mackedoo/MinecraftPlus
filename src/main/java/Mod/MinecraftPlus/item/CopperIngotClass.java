package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CopperIngotClass extends Item  {
	
	public CopperIngotClass() { //Constructor for BronzeIngotClass Class
		 setCreativeTab(MainClass.MinecraftPlusTab);
		 setTextureName(MainClass.MODID + ":copper_ingot");
	}

}
