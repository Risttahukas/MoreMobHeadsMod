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
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> providerCompletableFuture,
                               CompletableFuture<TagLookup<Block>> tagLookupCompletableFuture,
                               ExistingFileHelper existingFileHelper) {
        super(packOutput, providerCompletableFuture, tagLookupCompletableFuture, MoreMobHeadsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        Iterator<RegistryObject<Item>> iterator = ModItems.ITEMS.getEntries().stream().iterator();
        while (iterator.hasNext()) {
            RegistryObject<Item> item = iterator.next();
            if (item.get() instanceof EffectSkullItem) {
                this.tag(ItemTags.NOTE_BLOCK_TOP_INSTRUMENTS).add(item.get());
            }
        }
    }
}