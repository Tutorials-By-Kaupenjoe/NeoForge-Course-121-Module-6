package net.kaupenjoe.mccourse.worldgen.tree;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.worldgen.ModConfiguredFeatures;
import net.minecraft.world.level.block.grower.TreeGrower;

import java.util.Optional;

public class ModTreeGrowers {
    public static final TreeGrower EBONY = new TreeGrower(MCCourseMod.MOD_ID + ":ebony",
            Optional.empty(), Optional.of(ModConfiguredFeatures.EBONY_KEY), Optional.empty());
}
