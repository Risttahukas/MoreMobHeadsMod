package net.risttahukas.moremobheadsmod;

import com.mojang.logging.LogUtils;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.risttahukas.moremobheadsmod.item.ModCreativeModeTabs;
import net.risttahukas.moremobheadsmod.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreMobHeadsMod.MOD_ID)
public class MoreMobHeadsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "moremobheads";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreMobHeadsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTabs.MOB_HEADS_TAB.get()) {
            event.accept(Items.SKELETON_SKULL);
            event.accept(Items.WITHER_SKELETON_SKULL);
            event.accept(Items.PLAYER_HEAD);
            event.accept(Items.ZOMBIE_HEAD);
            event.accept(Items.CREEPER_HEAD);
            event.accept(Items.PIGLIN_HEAD);
            event.accept(Items.DRAGON_HEAD);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
