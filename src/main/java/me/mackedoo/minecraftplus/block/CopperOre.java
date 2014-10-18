package me.mackedoo.minecraftplus.block;

import me.mackedoo.minecraftplus.MinecraftPlus;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;

public class CopperOre extends Block {
    public CopperOre(Material arg0) {
        super(arg0);
        setBlockName(Names.Blocks.COPPER_ORE);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
        setHardness(4F);
        setResistance(6.0F);
        setBlockTextureName(Reference.MOD_ID + ":copper_ore");
    }
}
