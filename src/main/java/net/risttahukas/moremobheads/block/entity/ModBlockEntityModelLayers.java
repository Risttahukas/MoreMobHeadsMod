package net.risttahukas.moremobheads.block.entity;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModBlockEntityModelLayers {
    public static final ModelLayerLocation HUMANOID_SKULL = register("humanoid_skull");
    public static final ModelLayerLocation MOB_SKULL = register("mob_skull");

    public static final ModelLayerLocation ALLAY_HEAD = register("allay_head");
    public static final ModelLayerLocation AXOLOTL_HEAD = register("axolotl_head");
    public static final ModelLayerLocation BAT_HEAD = register("bat_head");
    public static final ModelLayerLocation BEE_HEAD = register("bee_head");
    public static final ModelLayerLocation CAMEL_HEAD = register("camel_head");
    public static final ModelLayerLocation CAT_HEAD = register("cat_head");
    public static final ModelLayerLocation CAVE_SPIDER_HEAD = register("cave_spider_head");
    public static final ModelLayerLocation CHESTED_HORSE_HEAD = register("chested_horse_head");
    public static final ModelLayerLocation CHICKEN_HEAD = register("chicken_head");
    public static final ModelLayerLocation COD_HEAD = register("cod_head");
    public static final ModelLayerLocation COW_HEAD = register("cow_head");
    public static final ModelLayerLocation CREEPER_HEAD_CHARGE = register("creeper_head_charge");
    public static final ModelLayerLocation DOLPHIN_HEAD = register("dolphin_head");
    public static final ModelLayerLocation DROWNED_HEAD_CLOTHES = register("drowned_head_clothes");
    public static final ModelLayerLocation ENDERMAN_HEAD = register("enderman_head");
    public static final ModelLayerLocation ENDERMITE_HEAD = register("endermite_head");
    public static final ModelLayerLocation FOX_HEAD = register("fox_head");
    public static final ModelLayerLocation FROG_HEAD = register("frog_head");
    public static final ModelLayerLocation GHAST_HEAD = register("ghast_head");
    public static final ModelLayerLocation GOAT_HEAD = register("goat_head");
    public static final ModelLayerLocation GUARDIAN_HEAD = register("guardian_head");
    public static final ModelLayerLocation HOGLIN_HEAD = register("hoglin_head");
    public static final ModelLayerLocation HORSE_HEAD = register("horse_head");
    public static final ModelLayerLocation HORSE_HEAD_MARKINGS = register("horse_head_markings");
    public static final ModelLayerLocation ILLAGER_HEAD = register("illager_head");
    public static final ModelLayerLocation IRON_GOLEM_HEAD = register("iron_golem_head");
    public static final ModelLayerLocation LLAMA_HEAD = register("llama_head");
    public static final ModelLayerLocation LLAMA_HEAD_DECOR = register("llama_head_decor");
    public static final ModelLayerLocation MAGMA_CUBE_HEAD = register("magma_cube_head");
    public static final ModelLayerLocation OCELOT_HEAD = register("ocelot_head");
    public static final ModelLayerLocation PANDA_HEAD = register("panda_head");
    public static final ModelLayerLocation PARROT_HEAD = register("parrot_head");
    public static final ModelLayerLocation PHANTOM_HEAD = register("phantom_head");
    public static final ModelLayerLocation PIG_HEAD = register("pig_head");
    public static final ModelLayerLocation POLAR_BEAR_HEAD = register("polar_bear_head");
    public static final ModelLayerLocation PUFFERFISH_HEAD = register("pufferfish_head");
    public static final ModelLayerLocation RABBIT_HEAD = register("rabbit_head");
    public static final ModelLayerLocation RAVAGER_HEAD = register("ravager_head");
    public static final ModelLayerLocation SALMON_HEAD = register("salmon_head");
    public static final ModelLayerLocation SHEEP_HEAD = register("sheep_head");
    public static final ModelLayerLocation SHEEP_HEAD_WOOL = register("sheep_head_wool");
    public static final ModelLayerLocation SHULKER_HEAD = register("shulker_head");
    public static final ModelLayerLocation SILVERFISH_HEAD = register("silverfish_head");
    public static final ModelLayerLocation SLIME_HEAD = register("slime_head");
    public static final ModelLayerLocation SLIME_HEAD_OUTER_LAYER = register("slime_head_outer_layer");
    public static final ModelLayerLocation SNIFFER_HEAD = register("sniffer_head");
    public static final ModelLayerLocation SNOW_GOLEM_HEAD = register("snow_golem_head");
    public static final ModelLayerLocation SPIDER_HEAD = register("spider_head");
    public static final ModelLayerLocation SPIDER_EYES = register("spider_eyes");
    public static final ModelLayerLocation SQUID_HEAD = register("squid_head");
    public static final ModelLayerLocation STRAY_SKULL_CLOTHES = register("stray_skull_clothes");
    public static final ModelLayerLocation STRIDER_HEAD = register("strider_head");
    public static final ModelLayerLocation TADPOLE_HEAD = register("tadpole_head");
    public static final ModelLayerLocation TROPICAL_FISH_HEAD = register("tropical_fish_head");
    public static final ModelLayerLocation TROPICAL_FISH_HEAD_PATTERN = register("tropical_fish_head_pattern");
    public static final ModelLayerLocation TURTLE_HEAD = register("turtle_head");
    public static final ModelLayerLocation VILLAGER_HEAD = register("villager_head");
    public static final ModelLayerLocation WARDEN_HEAD = register("warden_head");
    public static final ModelLayerLocation WARDEN_HEAD_EMISSIVE = register("warden_head_emissive");
    public static final ModelLayerLocation WITCH_HEAD = register("witch_head");
    public static final ModelLayerLocation WOLF_HEAD = register("wolf_head");

    private static ModelLayerLocation register(String layer) {
        return new ModelLayerLocation(new ResourceLocation(MoreMobHeadsMod.MOD_ID, layer), "main");
    }
}
