package Mod.MinecraftPlus.item.armor;

import Mod.MinecraftPlus.reference.Materials;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemArmor;

public class ArmorCopper extends ItemArmor {

	public ArmorCopper(int p_i45325_2_, int p_i45325_3_, String name) {
		super(Materials.Armor.COPPER, p_i45325_2_, p_i45325_3_);
		setUnlocalizedName(name);
		setTextureName(Reference.MOD_ID + ":" + name);
	}

}
