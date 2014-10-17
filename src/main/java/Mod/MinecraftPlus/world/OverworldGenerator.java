package Mod.MinecraftPlus.world;

import Mod.MinecraftPlus.init.ModBlocks;
import net.minecraft.world.World;

import java.util.Random;

public class OverworldGenerator extends AbstractGenerator {
    @Override
    public void generate(Random random, int x, int z, World world) {
        generateStandardOre(random, world, ModBlocks.COPPER_ORE, 20, 8, x, z, 0, 64);
    }
}
