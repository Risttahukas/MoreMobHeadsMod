package net.risttahukas.moremobheads;

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
import net.risttahukas.moremobheads.block.ModBlocks;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import net.risttahukas.moremobheads.item.ModCreativeModeTabs;
import net.risttahukas.moremobheads.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MoreMobHeadsMod.MOD_ID)
public class MoreMobHeadsMod
{
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "moremobheads";
    // Directly reference a slf4j logger
    @SuppressWarnings("unused")
    private static final Logger LOGGER = LogUtils.getLogger();

    public MoreMobHeadsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == ModCreativeModeTabs.MOB_HEADS_TAB.get()) {
            event.accept(ModItems.ALLAY_HEAD);
            event.accept(ModItems.AXOLOTL_HEAD_LUCY);
            event.accept(ModItems.AXOLOTL_HEAD_WILD);
            event.accept(ModItems.AXOLOTL_HEAD_GOLD);
            event.accept(ModItems.AXOLOTL_HEAD_CYAN);
            event.accept(ModItems.AXOLOTL_HEAD_BLUE);
            event.accept(ModItems.BAT_HEAD);
            event.accept(ModItems.BLAZE_HEAD);
            event.accept(ModItems.CAMEL_HEAD);
            event.accept(ModItems.CAT_HEAD_TABBY);
            event.accept(ModItems.CAT_HEAD_BLACK);
            event.accept(ModItems.CAT_HEAD_RED);
            event.accept(ModItems.CAT_HEAD_SIAMESE);
            event.accept(ModItems.CAT_HEAD_BRITISH_SHORTHAIR);
            event.accept(ModItems.CAT_HEAD_CALICO);
            event.accept(ModItems.CAT_HEAD_PERSIAN);
            event.accept(ModItems.CAT_HEAD_RAGDOLL);
            event.accept(ModItems.CAT_HEAD_WHITE);
            event.accept(ModItems.CAT_HEAD_JELLIE);
            event.accept(ModItems.CAT_HEAD_ALL_BLACK);
            event.accept(ModItems.CAVE_SPIDER_HEAD);
            event.accept(ModItems.CHICKEN_HEAD);
            event.accept(ModItems.COW_HEAD);
            event.accept(Items.CREEPER_HEAD);
            event.accept(ModItems.CREEPER_HEAD_CHARGED);
            event.accept(ModItems.DROWNED_HEAD);
            event.accept(Items.DRAGON_HEAD);
            event.accept(ModItems.GHAST_HEAD);
            event.accept(ModItems.HUSK_HEAD);
            event.accept(ModItems.MOOSHROOM_HEAD_RED);
            event.accept(ModItems.MOOSHROOM_HEAD_BROWN);
            event.accept(ModItems.OCELOT_HEAD);
            event.accept(ModItems.PARROT_HEAD_RED_BLUE);
            event.accept(ModItems.PARROT_HEAD_BLUE);
            event.accept(ModItems.PARROT_HEAD_GREEN);
            event.accept(ModItems.PARROT_HEAD_YELLOW_BLUE);
            event.accept(ModItems.PARROT_HEAD_GREY);
            event.accept(Items.PIGLIN_HEAD);
            event.accept(Items.PLAYER_HEAD);
            event.accept(ModItems.SHEEP_HEAD_WHITE);
            event.accept(ModItems.SHEEP_HEAD_ORANGE);
            event.accept(ModItems.SHEEP_HEAD_MAGENTA);
            event.accept(ModItems.SHEEP_HEAD_LIGHT_BLUE);
            event.accept(ModItems.SHEEP_HEAD_YELLOW);
            event.accept(ModItems.SHEEP_HEAD_LIME);
            event.accept(ModItems.SHEEP_HEAD_PINK);
            event.accept(ModItems.SHEEP_HEAD_GRAY);
            event.accept(ModItems.SHEEP_HEAD_LIGHT_GRAY);
            event.accept(ModItems.SHEEP_HEAD_CYAN);
            event.accept(ModItems.SHEEP_HEAD_PURPLE);
            event.accept(ModItems.SHEEP_HEAD_BLUE);
            event.accept(ModItems.SHEEP_HEAD_BROWN);
            event.accept(ModItems.SHEEP_HEAD_GREEN);
            event.accept(ModItems.SHEEP_HEAD_RED);
            event.accept(ModItems.SHEEP_HEAD_BLACK);
            event.accept(ModItems.SHEEP_HEAD_RAINBOW);
            event.accept(Items.SKELETON_SKULL);
            event.accept(ModItems.SPIDER_HEAD);
            event.accept(ModItems.STRAY_SKULL);
            event.accept(ModItems.VEX_HEAD);
            event.accept(ModItems.WITCH_HEAD);
            event.accept(Items.WITHER_SKELETON_SKULL);
            event.accept(Items.ZOMBIE_HEAD);
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @SuppressWarnings("unused")
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
