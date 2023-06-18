package net.risttahukas.moremobheads.block.entity;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.ResourceLocation;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModBlockEntityModelLayers {
    public static final ModelLayerLocation SPIDER_HEAD = register("spider_head");
    public static final ModelLayerLocation CAVE_SPIDER_HEAD = register("cave_spider_head");
    public static final ModelLayerLocation CHICKEN_HEAD = register("chicken_head");
    public static final ModelLayerLocation WITCH_HEAD = register("witch_head");

    private static ModelLayerLocation register(String layer) {
        return new ModelLayerLocation(new ResourceLocation(MoreMobHeadsMod.MOD_ID, layer), "main");
    }
}
