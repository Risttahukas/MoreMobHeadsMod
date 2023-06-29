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
    public static final ModelLayerLocation CAMEL_HEAD = register("camel_head");
    public static final ModelLayerLocation CAT_HEAD = register("cat_head");
    public static final ModelLayerLocation CAVE_SPIDER_HEAD = register("cave_spider_head");
    public static final ModelLayerLocation CHESTED_HORSE_HEAD = register("chested_horse_head");
    public static final ModelLayerLocation CHICKEN_HEAD = register("chicken_head");
    public static final ModelLayerLocation COW_HEAD = register("cow_head");
    public static final ModelLayerLocation CREEPER_HEAD_CHARGE = register("creeper_head_charge");
    public static final ModelLayerLocation DOLPHIN_HEAD = register("dolphin_head");
    public static final ModelLayerLocation DROWNED_HEAD_CLOTHES = register("drowned_head_clothes");
    public static final ModelLayerLocation ENDERMAN_HEAD = register("enderman_head");
    public static final ModelLayerLocation GHAST_HEAD = register("ghast_head");
    public static final ModelLayerLocation HORSE_HEAD = register("horse_head");
    public static final ModelLayerLocation HORSE_HEAD_MARKINGS = register("horse_head_markings");
    public static final ModelLayerLocation OCELOT_HEAD = register("ocelot_head");
    public static final ModelLayerLocation PARROT_HEAD = register("parrot_head");
    public static final ModelLayerLocation PUFFERFISH_HEAD = register("pufferfish_head");
    public static final ModelLayerLocation SHEEP_HEAD = register("sheep_head");
    public static final ModelLayerLocation SHEEP_HEAD_WOOL = register("sheep_head_wool");
    public static final ModelLayerLocation SPIDER_HEAD = register("spider_head");
    public static final ModelLayerLocation SPIDER_EYES = register("spider_eyes");
    public static final ModelLayerLocation STRAY_SKULL_CLOTHES = register("stray_skull_clothes");
    public static final ModelLayerLocation WITCH_HEAD = register("witch_head");

    private static ModelLayerLocation register(String layer) {
        return new ModelLayerLocation(new ResourceLocation(MoreMobHeadsMod.MOD_ID, layer), "main");
    }
}
