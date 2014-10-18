package me.mackedoo.minecraftplus.world;

import me.mackedoo.minecraftplus.world.gen.MinecraftPlusTree;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public abstract class AbstractGenerator {
    protected abstract void generate(Random random, int x, int z, World world);

    private WorldGenMinable getWorldGenMinable(Block block, int veinSize) {
        return new WorldGenMinable(block, veinSize);
    }

    private void generateOreVein(Block block, int veinSize, World world, Random random, int x, int y, int z) {
        generateOreVein(getWorldGenMinable(block, veinSize), world, random, x, y, z);
    }

    private void generateOreVein(WorldGenMinable minable, World world, Random random, int x, int y, int z) {
        minable.generate(world, random, x, y, z);
    }

    protected void generateStandardOre(Random random, World world, Block block, int veins, int maxVein, int x, int z, int minY, int maxY) {
        for (int l = 0; l < veins; ++l) {
            int beginX = x + random.nextInt(16);
            int beginY = random.nextInt(maxY - minY) + minY;
            int beginZ = z + random.nextInt(16);
            generateOreVein(block, maxVein, world, random, beginX, beginY, beginZ);
        }
    }

    protected void generateStandardTree(MinecraftPlusTree tree, World world, Random random, int trees, int x, int z, int maxY) {
        for (int l = 0; l < trees; ++l) {
            int beginX = x + random.nextInt(16);
            int beginY = random.nextInt(maxY);
            int beginZ = z + random.nextInt(16);

            tree.generate(world, random, beginX, beginY, beginZ);
        }
    }
}
