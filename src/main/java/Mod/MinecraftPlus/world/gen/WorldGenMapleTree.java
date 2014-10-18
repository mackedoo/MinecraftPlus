package Mod.MinecraftPlus.world.gen;

import Mod.MinecraftPlus.MinecraftPlus;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.util.Direction;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraftforge.common.util.ForgeDirection;

import java.util.Random;

public class WorldGenMapleTree extends MinecraftPlusTree {
    public WorldGenMapleTree(boolean notify, Block log, Block leaf, int minTreeHeight) {
        super(notify, log, leaf, minTreeHeight);
    }
}
