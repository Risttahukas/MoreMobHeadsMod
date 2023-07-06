package net.risttahukas.moremobheads.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> SHULKER_HEAD = tag("shulker_head");
        public static final TagKey<Item> COLORED_SHULKER_HEAD = tag("colored_shulker_head");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreMobHeadsMod.MOD_ID, name));
        }
    }
}
