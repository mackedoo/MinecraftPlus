package Mod.MinecraftPlus.init;

import Mod.MinecraftPlus.block.BlockCopper;
import Mod.MinecraftPlus.reference.Names;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

// This class handles all the blocks and their respective initializations
public class ModBlocks {
    public static final Block COPPER_BLOCK = new BlockCopper(Material.iron);

    public static void init() {
        GameRegistry.registerBlock(COPPER_BLOCK, Names.Blocks.COPPER_BLOCK);
    }

}
