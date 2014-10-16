package Mod.MinecraftPlus.item;

import Mod.MinecraftPlus.MinecraftPlus;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.item.ItemSword;

public class ItemCopperSword extends ItemSword {

	public ItemCopperSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
        setUnlocalizedName(Names.Tools.COPPER_SWORD);
        setCreativeTab(MinecraftPlus.MinecraftPlusTab);
		setTextureName(Reference.MOD_ID + ":copper_sword");
	}

}
