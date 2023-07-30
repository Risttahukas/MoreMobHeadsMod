package net.risttahukas.moremobheads.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class MoreMobHeadsModCommonConfigs {
    public static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec SPEC;

    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_PASSIVE_HEAD_EFFECTS;
    public static final ForgeConfigSpec.ConfigValue<Boolean> ENABLE_ACTIVE_HEAD_EFFECTS;

    static {
        BUILDER.push("Configs for More Mob Heads Mod");

        ENABLE_PASSIVE_HEAD_EFFECTS = BUILDER.comment("Should passive head effect from the mod be used?")
                .define("Enable passive head effects", true);
        ENABLE_ACTIVE_HEAD_EFFECTS = BUILDER.comment("Should active head effect from the mod be used?")
                .define("Enable active head effects", true);

        BUILDER.pop();
        SPEC = BUILDER.build();
    }
}
