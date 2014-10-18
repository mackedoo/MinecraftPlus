package me.mackedoo.minecraftplus.block;

import me.mackedoo.minecraftplus.MinecraftPlus;
import me.mackedoo.minecraftplus.reference.Names;
import me.mackedoo.minecraftplus.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {
    public BlockCopper(Material arg0) {
        super(arg0);
        setBlockName(Names.Blocks.COPPER_BLOCK);
        setCreativeTab(MinecraftPlus.MINECRAFTPLUS_TAB);
        setHardness(5F);
        setResistance(7.0F);
        setBlockTextureName(Reference.MOD_ID + ":copper_block");
    }
}
