package net.risttahukas.moremobheads.util;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> SHULKER_HEAD = tag("shulker_head");
        public static final TagKey<Item> COLORED_SHEEP_HEAD = tag("colored_sheep_head");
        public static final TagKey<Item> CREAMY_LLAMA_HEAD = tag("creamy_llama_head");
        public static final TagKey<Item> WHITE_LLAMA_HEAD = tag("white_llama_head");
        public static final TagKey<Item> BROWN_LLAMA_HEAD = tag("brown_llama_head");
        public static final TagKey<Item> GRAY_LLAMA_HEAD = tag("gray_llama_head");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(MoreMobHeadsMod.MOD_ID, name));
        }
    }
}
