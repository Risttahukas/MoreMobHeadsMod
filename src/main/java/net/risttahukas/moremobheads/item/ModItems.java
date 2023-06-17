package net.risttahukas.moremobheads.item;

import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMobHeadsMod.MOD_ID);

    public static final RegistryObject<Item> SPIDER_HEAD = ITEMS.register("spider_head", () ->
            new EffectSkullItem(ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
            (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
