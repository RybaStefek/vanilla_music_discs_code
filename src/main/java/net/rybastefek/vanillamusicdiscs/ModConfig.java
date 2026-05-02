package net.rybastefek.vanillamusicdiscs;

import net.minecraftforge.common.ForgeConfigSpec;

public class ModConfig {
    public static final ForgeConfigSpec.IntValue PLAINS_SPACING;
    public static final ForgeConfigSpec.IntValue PLAINS_SEPARATION;
    public static final ForgeConfigSpec.IntValue DESERT_SPACING;
    public static final ForgeConfigSpec.IntValue DESERT_SEPARATION;
    public static final ForgeConfigSpec.IntValue TAIGA_SPACING;
    public static final ForgeConfigSpec.IntValue TAIGA_SEPARATION;

    public static final ForgeConfigSpec SPEC;

    static {
        ForgeConfigSpec.Builder builder = new ForgeConfigSpec.Builder();

        builder.push("musical_house_plains");
        PLAINS_SPACING = builder.comment("Min: 2, separation must be lower").defineInRange("spacing", 16, 2, 100);
        PLAINS_SEPARATION = builder.comment("Must be lower than spacing").defineInRange("separation", 8, 1, 99);
        builder.pop();

        builder.push("musical_house_desert");
        DESERT_SPACING = builder.defineInRange("spacing", 16, 2, 100);
        DESERT_SEPARATION = builder.defineInRange("separation", 8, 1, 99);
        builder.pop();

        builder.push("musical_house_taiga");
        TAIGA_SPACING = builder.defineInRange("spacing", 16, 2, 100);
        TAIGA_SEPARATION = builder.defineInRange("separation", 8, 1, 99);
        builder.pop();

        SPEC = builder.build();
    }
}
