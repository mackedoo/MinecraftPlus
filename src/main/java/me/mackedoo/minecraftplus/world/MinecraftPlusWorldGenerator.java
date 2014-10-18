package me.mackedoo.minecraftplus.world;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

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
