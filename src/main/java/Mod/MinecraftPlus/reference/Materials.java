package Mod.MinecraftPlus.reference;

import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

// A class to store materials
public class Materials {
	public static final class Tools {
		public static final Item.ToolMaterial COPPER = EnumHelper.addToolMaterial(Names.Materials.COPPER, 2, 175, 7.0F, 2.0F, 14);
	}

	public static final class Armor {
		public static final ItemArmor.ArmorMaterial COPPER = EnumHelper.addArmorMaterial(Names.Materials.COPPER, 15, new int[] { 2, 6, 5, 2 }, 9);
	}
}
