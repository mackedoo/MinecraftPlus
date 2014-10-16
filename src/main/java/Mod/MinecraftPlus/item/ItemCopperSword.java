package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword {

	public ItemCopperSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
        setUnlocalizedName(Names.Tools.COPPER_SWORD);
        setCreativeTab(MainClass.MinecraftPlusTab);
		setTextureName(Reference.MOD_ID + ":copper_sword");
	}

}
