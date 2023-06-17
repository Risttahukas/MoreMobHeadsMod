package net.risttahukas.moremobheads.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreMobHeadsMod.MOD_ID);

    public static RegistryObject<CreativeModeTab> MOB_HEADS_TAB = CREATIVE_MODE_TABS.register("mob_heads_tab", () ->
            CreativeModeTab.builder().icon(() -> new ItemStack(Items.CREEPER_HEAD))
                    .title(Component.translatable("creativemodetab.mob_heads_tab")).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
