package net.kaupenjoe.mccourse.worldgen.biome.region;

import com.mojang.datafixers.util.Pair;
import net.kaupenjoe.mccourse.worldgen.biome.ModBiomes;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Climate;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

import static terrablender.api.ParameterUtils.*;

public class NetherRegion extends Region {
    public NetherRegion(ResourceLocation name, int weight) {
        super(name, RegionType.NETHER, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<Climate.ParameterPoint, ResourceKey<Biome>>> mapper) {
        this.addBiome(mapper,
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F),
                Climate.Parameter.point(0.0F), 0.0F, ModBiomes.GLOWSTONE_PLAIN);
    }
}