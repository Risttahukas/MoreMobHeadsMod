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

        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_WHITE.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_ORANGE.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_MAGENTA.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIGHT_BLUE.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_YELLOW.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIME.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_PINK.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_GRAY.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_LIGHT_GRAY.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_CYAN.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_PURPLE.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BLUE.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BROWN.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_GREEN.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_RED.get());
        this.tag(ModTags.Items.COLORED_SHULKER_HEAD).add(ModItems.SHULKER_HEAD_BLACK.get());
    }
}
