package Mod.MinecraftPlus.block;

import Mod.MinecraftPlus.MainClass;
import Mod.MinecraftPlus.reference.Names;
import Mod.MinecraftPlus.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCopper extends Block {
    public BlockCopper(Material arg0) {
        super(arg0);
        setBlockName(Names.Blocks.COPPER_BLOCK);
        setCreativeTab(MainClass.MinecraftPlusTab);
        setHardness(5F);
        setResistance(7.0F);
        setBlockTextureName(Reference.MOD_ID + ":copper_block");
    }
}