package net.risttahukas.moremobheads.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.item.ModItems;
import net.risttahukas.moremobheads.util.ModTags;

import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture,
                               ExistingFileHelper existingFileHelper) {
        super(packOutput, providerCompletableFuture, tagLookupCompletableFuture, MoreMobHeadsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        Iterator<RegistryObject<Item>> iterator = ModItems.ITEMS.getEntries().stream().iterator();
        while (iterator.hasNext()) {
            RegistryObject<Item> item = iterator.next();
            if (item.get() instanceof EffectSkullItem) {
                this.tag(ItemTags.NOTE_BLOCK_TOP_INSTRUMENTS).add(item.get());
            }
        }

        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_WHITE.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_ORANGE.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_MAGENTA.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIGHT_BLUE.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_YELLOW.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIME.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_PINK.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_GRAY.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIGHT_GRAY.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_CYAN.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_PURPLE.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BLUE.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BROWN.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_GREEN.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_RED.get());
        this.tag(ModTags.Items.SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BLACK.get());

        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_WHITE.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_ORANGE.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_MAGENTA.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_LIGHT_BLUE.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_YELLOW.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_LIME.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_PINK.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_GRAY.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_LIGHT_GRAY.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_CYAN.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_PURPLE.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_BLUE.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_BROWN.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHEEP_HEAD_GREEN.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHULKER_HEAD_RED.get());
        this.tag(ModTags.Items.COLORED_SHEEP_HEAD).add(ModItems.SHULKER_HEAD_BLACK.get());

        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_WHITE.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_ORANGE.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_MAGENTA.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_LIGHT_BLUE.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_YELLOW.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_LIME.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_PINK.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_GRAY.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_LIGHT_GRAY.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_CYAN.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_PURPLE.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_BLUE.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_BROWN.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_GREEN.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_RED.get());
        this.tag(ModTags.Items.CREAMY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_CREAMY_BLACK.get());

        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_WHITE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_ORANGE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_MAGENTA.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_LIGHT_BLUE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_YELLOW.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_LIME.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_PINK.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_GRAY.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_LIGHT_GRAY.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_CYAN.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_PURPLE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_BLUE.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_BROWN.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_GREEN.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_RED.get());
        this.tag(ModTags.Items.WHITE_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_WHITE_BLACK.get());

        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_WHITE.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_ORANGE.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_MAGENTA.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_LIGHT_BLUE.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_YELLOW.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_LIME.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_PINK.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_GRAY.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_LIGHT_GRAY.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_CYAN.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_PURPLE.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_BLUE.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_BROWN.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_GREEN.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_RED.get());
        this.tag(ModTags.Items.BROWN_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_BROWN_BLACK.get());

        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_WHITE.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_ORANGE.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_MAGENTA.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_LIGHT_BLUE.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_YELLOW.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_LIME.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_PINK.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_GRAY.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_LIGHT_GRAY.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_CYAN.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_PURPLE.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_BLUE.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_BROWN.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_GREEN.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_RED.get());
        this.tag(ModTags.Items.GRAY_LLAMA_HEAD).add(ModItems.LLAMA_HEAD_GRAY_BLACK.get());
    }
}
