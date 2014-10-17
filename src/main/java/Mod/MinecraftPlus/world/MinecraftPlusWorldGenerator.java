package Mod.MinecraftPlus.world;

import Mod.MinecraftPlus.MinecraftPlus;
import Mod.MinecraftPlus.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenBigTree;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class MinecraftPlusWorldGenerator implements IWorldGenerator {
    private HashMap<Integer, AbstractGenerator> generators;

    public MinecraftPlusWorldGenerator() {
        generators = new HashMap<Integer, AbstractGenerator>();
        generators.put(0, new OverworldGenerator());
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        try {
            generators.get(world.provider.dimensionId).generate(random, chunkX * 16, chunkZ * 16, world);
        } catch(NullPointerException ignored) {
        }
    }
}
