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
            event.accept(ModItems.BEE_HEAD);
            event.accept(ModItems.BEE_HEAD_ANGRY);
            event.accept(ModItems.BEE_HEAD_POLLEN);
            event.accept(ModItems.BEE_HEAD_ANGRY_POLLEN);
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
            event.accept(ModItems.COD_HEAD);
            event.accept(ModItems.COW_HEAD);
            event.accept(Items.CREEPER_HEAD);
            event.accept(ModItems.CREEPER_HEAD_CHARGED);
            event.accept(ModItems.DOLPHIN_HEAD);
            event.accept(ModItems.DONKEY_HEAD);
            event.accept(ModItems.DROWNED_HEAD);
            event.accept(Items.DRAGON_HEAD);
            event.accept(ModItems.ENDERMAN_HEAD);
            event.accept(ModItems.ENDERMITE_HEAD);
            event.accept(ModItems.EVOKER_HEAD);
            event.accept(ModItems.FOX_HEAD_RED);
            event.accept(ModItems.FOX_HEAD_SNOW);
            event.accept(ModItems.FROG_HEAD_TEMPERATE);
            event.accept(ModItems.FROG_HEAD_WARM);
            event.accept(ModItems.FROG_HEAD_COLD);
            event.accept(ModItems.GHAST_HEAD);
            event.accept(ModItems.GLOW_SQUID_HEAD);
            event.accept(ModItems.GOAT_HEAD);
            event.accept(ModItems.GOAT_HEAD_SCREAMING);
            event.accept(ModItems.GUARDIAN_HEAD);
            event.accept(ModItems.GUARDIAN_ELDER_HEAD);
            event.accept(ModItems.HOGLIN_HEAD);
            event.accept(ModItems.HORSE_HEAD_WHITE);
            event.accept(ModItems.HORSE_HEAD_CREAMY);
            event.accept(ModItems.HORSE_HEAD_CHESTNUT);
            event.accept(ModItems.HORSE_HEAD_BROWN);
            event.accept(ModItems.HORSE_HEAD_BLACK);
            event.accept(ModItems.HORSE_HEAD_GRAY);
            event.accept(ModItems.HORSE_HEAD_DARK_BROWN);
            event.accept(ModItems.HORSE_HEAD_WHITE_WHITE);
            event.accept(ModItems.HORSE_HEAD_CREAMY_WHITE);
            event.accept(ModItems.HORSE_HEAD_CHESTNUT_WHITE);
            event.accept(ModItems.HORSE_HEAD_BROWN_WHITE);
            event.accept(ModItems.HORSE_HEAD_BLACK_WHITE);
            event.accept(ModItems.HORSE_HEAD_GRAY_WHITE);
            event.accept(ModItems.HORSE_HEAD_DARK_BROWN_WHITE);
            event.accept(ModItems.HORSE_HEAD_WHITE_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_CREAMY_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_CHESTNUT_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_BROWN_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_BLACK_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_GRAY_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_DARK_BROWN_WHITE_FIELD);
            event.accept(ModItems.HORSE_HEAD_WHITE_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_CREAMY_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_CHESTNUT_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_BROWN_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_BLACK_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_GRAY_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_DARK_BROWN_WHITE_DOTS);
            event.accept(ModItems.HORSE_HEAD_WHITE_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_CREAMY_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_CHESTNUT_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_BROWN_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_BLACK_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_GRAY_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_DARK_BROWN_BLACK_DOTS);
            event.accept(ModItems.HORSE_HEAD_ZOMBIE);
            event.accept(ModItems.HORSE_SKULL_SKELETON);
            event.accept(ModItems.HUSK_HEAD);
            event.accept(ModItems.ILLUSIONER_HEAD);
            event.accept(ModItems.IRON_GOLEM_HEAD);
            event.accept(ModItems.LLAMA_HEAD_CREAMY);
            event.accept(ModItems.LLAMA_HEAD_WHITE);
            event.accept(ModItems.LLAMA_HEAD_BROWN);
            event.accept(ModItems.LLAMA_HEAD_GRAY);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_WHITE);
            event.accept(ModItems.LLAMA_HEAD_WHITE_WHITE);
            event.accept(ModItems.LLAMA_HEAD_BROWN_WHITE);
            event.accept(ModItems.LLAMA_HEAD_GRAY_WHITE);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_ORANGE);
            event.accept(ModItems.LLAMA_HEAD_WHITE_ORANGE);
            event.accept(ModItems.LLAMA_HEAD_BROWN_ORANGE);
            event.accept(ModItems.LLAMA_HEAD_GRAY_ORANGE);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_MAGENTA);
            event.accept(ModItems.LLAMA_HEAD_WHITE_MAGENTA);
            event.accept(ModItems.LLAMA_HEAD_BROWN_MAGENTA);
            event.accept(ModItems.LLAMA_HEAD_GRAY_MAGENTA);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_LIGHT_BLUE);
            event.accept(ModItems.LLAMA_HEAD_WHITE_LIGHT_BLUE);
            event.accept(ModItems.LLAMA_HEAD_BROWN_LIGHT_BLUE);
            event.accept(ModItems.LLAMA_HEAD_GRAY_LIGHT_BLUE);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_YELLOW);
            event.accept(ModItems.LLAMA_HEAD_WHITE_YELLOW);
            event.accept(ModItems.LLAMA_HEAD_BROWN_YELLOW);
            event.accept(ModItems.LLAMA_HEAD_GRAY_YELLOW);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_LIME);
            event.accept(ModItems.LLAMA_HEAD_WHITE_LIME);
            event.accept(ModItems.LLAMA_HEAD_BROWN_LIME);
            event.accept(ModItems.LLAMA_HEAD_GRAY_LIME);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_PINK);
            event.accept(ModItems.LLAMA_HEAD_WHITE_PINK);
            event.accept(ModItems.LLAMA_HEAD_BROWN_PINK);
            event.accept(ModItems.LLAMA_HEAD_GRAY_PINK);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_GRAY);
            event.accept(ModItems.LLAMA_HEAD_WHITE_GRAY);
            event.accept(ModItems.LLAMA_HEAD_BROWN_GRAY);
            event.accept(ModItems.LLAMA_HEAD_GRAY_GRAY);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_LIGHT_GRAY);
            event.accept(ModItems.LLAMA_HEAD_WHITE_LIGHT_GRAY);
            event.accept(ModItems.LLAMA_HEAD_BROWN_LIGHT_GRAY);
            event.accept(ModItems.LLAMA_HEAD_GRAY_LIGHT_GRAY);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_CYAN);
            event.accept(ModItems.LLAMA_HEAD_WHITE_CYAN);
            event.accept(ModItems.LLAMA_HEAD_BROWN_CYAN);
            event.accept(ModItems.LLAMA_HEAD_GRAY_CYAN);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_PURPLE);
            event.accept(ModItems.LLAMA_HEAD_WHITE_PURPLE);
            event.accept(ModItems.LLAMA_HEAD_BROWN_PURPLE);
            event.accept(ModItems.LLAMA_HEAD_GRAY_PURPLE);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_BLUE);
            event.accept(ModItems.LLAMA_HEAD_WHITE_BLUE);
            event.accept(ModItems.LLAMA_HEAD_BROWN_BLUE);
            event.accept(ModItems.LLAMA_HEAD_GRAY_BLUE);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_BROWN);
            event.accept(ModItems.LLAMA_HEAD_WHITE_BROWN);
            event.accept(ModItems.LLAMA_HEAD_BROWN_BROWN);
            event.accept(ModItems.LLAMA_HEAD_GRAY_BROWN);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_GREEN);
            event.accept(ModItems.LLAMA_HEAD_WHITE_GREEN);
            event.accept(ModItems.LLAMA_HEAD_BROWN_GREEN);
            event.accept(ModItems.LLAMA_HEAD_GRAY_GREEN);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_RED);
            event.accept(ModItems.LLAMA_HEAD_WHITE_RED);
            event.accept(ModItems.LLAMA_HEAD_BROWN_RED);
            event.accept(ModItems.LLAMA_HEAD_GRAY_RED);
            event.accept(ModItems.LLAMA_HEAD_CREAMY_BLACK);
            event.accept(ModItems.LLAMA_HEAD_WHITE_BLACK);
            event.accept(ModItems.LLAMA_HEAD_BROWN_BLACK);
            event.accept(ModItems.LLAMA_HEAD_GRAY_BLACK);
            event.accept(ModItems.MAGMA_CUBE_HEAD);
            event.accept(ModItems.MOOSHROOM_HEAD_RED);
            event.accept(ModItems.MOOSHROOM_HEAD_BROWN);
            event.accept(ModItems.MULE_HEAD);
            event.accept(ModItems.OCELOT_HEAD);
            event.accept(ModItems.PANDA_HEAD);
            event.accept(ModItems.PANDA_HEAD_AGGRESSIVE);
            event.accept(ModItems.PANDA_HEAD_LAZY);
            event.accept(ModItems.PANDA_HEAD_WORRIED);
            event.accept(ModItems.PANDA_HEAD_PLAYFUL);
            event.accept(ModItems.PANDA_HEAD_WEAK);
            event.accept(ModItems.PANDA_HEAD_BROWN);
            event.accept(ModItems.PARROT_HEAD_RED_BLUE);
            event.accept(ModItems.PARROT_HEAD_BLUE);
            event.accept(ModItems.PARROT_HEAD_GREEN);
            event.accept(ModItems.PARROT_HEAD_YELLOW_BLUE);
            event.accept(ModItems.PARROT_HEAD_GREY);
            event.accept(ModItems.PHANTOM_HEAD);
            event.accept(ModItems.PIG_HEAD);
            event.accept(Items.PIGLIN_HEAD);
            event.accept(ModItems.PIGLIN_BRUTE_HEAD);
            event.accept(ModItems.PILLAGER_HEAD);
            event.accept(Items.PLAYER_HEAD);
            event.accept(ModItems.POLAR_BEAR_HEAD);
            event.accept(ModItems.PUFFERFISH_HEAD);
            event.accept(ModItems.RABBIT_HEAD_BROWN);
            event.accept(ModItems.RABBIT_HEAD_WHITE);
            event.accept(ModItems.RABBIT_HEAD_BLACK);
            event.accept(ModItems.RABBIT_HEAD_WHITE_SPLOTCHED);
            event.accept(ModItems.RABBIT_HEAD_GOLD);
            event.accept(ModItems.RABBIT_HEAD_SALT);
            event.accept(ModItems.RABBIT_HEAD_CAERBANNOG);
            event.accept(ModItems.RABBIT_HEAD_TOAST);
            event.accept(ModItems.RAVAGER_HEAD);
            event.accept(ModItems.SALMON_HEAD);
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
            event.accept(ModItems.SHULKER_HEAD);
            event.accept(ModItems.SHULKER_HEAD_WHITE);
            event.accept(ModItems.SHULKER_HEAD_ORANGE);
            event.accept(ModItems.SHULKER_HEAD_MAGENTA);
            event.accept(ModItems.SHULKER_HEAD_LIGHT_BLUE);
            event.accept(ModItems.SHULKER_HEAD_YELLOW);
            event.accept(ModItems.SHULKER_HEAD_LIME);
            event.accept(ModItems.SHULKER_HEAD_PINK);
            event.accept(ModItems.SHULKER_HEAD_GRAY);
            event.accept(ModItems.SHULKER_HEAD_LIGHT_GRAY);
            event.accept(ModItems.SHULKER_HEAD_CYAN);
            event.accept(ModItems.SHULKER_HEAD_PURPLE);
            event.accept(ModItems.SHULKER_HEAD_BLUE);
            event.accept(ModItems.SHULKER_HEAD_BROWN);
            event.accept(ModItems.SHULKER_HEAD_GREEN);
            event.accept(ModItems.SHULKER_HEAD_RED);
            event.accept(ModItems.SHULKER_HEAD_BLACK);
            event.accept(Items.SKELETON_SKULL);
            event.accept(ModItems.SILVERFISH_HEAD);
            event.accept(ModItems.SLIME_HEAD);
            event.accept(ModItems.SNIFFER_HEAD);
            event.accept(ModItems.SNOW_GOLEM_HEAD);
            event.accept(ModItems.SPIDER_HEAD);
            event.accept(ModItems.SQUID_HEAD);
            event.accept(ModItems.STRAY_SKULL);
            event.accept(ModItems.STRIDER_HEAD);
            event.accept(ModItems.STRIDER_HEAD_COLD);
            event.accept(ModItems.TADPOLE_HEAD);
            event.accept(ModItems.TRADER_LLAMA_HEAD_CREAMY);
            event.accept(ModItems.TRADER_LLAMA_HEAD_WHITE);
            event.accept(ModItems.TRADER_LLAMA_HEAD_BROWN);
            event.accept(ModItems.TRADER_LLAMA_HEAD_GRAY);
            event.accept(ModItems.TROPICAL_FISH_HEAD);
            event.accept(ModItems.TURTLE_HEAD);
            event.accept(ModItems.VEX_HEAD);
            event.accept(ModItems.VILLAGER_HEAD_DESERT);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_MASON);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_DESERT_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_MASON);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_JUNGLE_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_MASON);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_PLAINS_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_MASON);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SAVANNA_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_SNOW);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_MASON);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SNOW_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_MASON);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_SWAMP_NITWIT);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_ARMORER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_BUTCHER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_CARTOGRAPHER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_CLERIC);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_FARMER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_FISHERMAN);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_FLETCHER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_LEATHERWORKER);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_LIBRARIAN);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_MASON);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_SHEPHERD);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_TOOLSMITH);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_WEAPONSMITH);
            event.accept(ModItems.VILLAGER_HEAD_TAIGA_NITWIT);
            event.accept(ModItems.VINDICATOR_HEAD);
            event.accept(ModItems.WANDERING_TRADER_HEAD);
            event.accept(ModItems.WARDEN_HEAD);
            event.accept(ModItems.WITCH_HEAD);
            event.accept(ModItems.WITHER_HEAD);
            event.accept(ModItems.WITHER_HEAD_INVULNERABLE);
            event.accept(ModItems.WITHER_HEAD_SHIELD);
            event.accept(ModItems.WITHER_HEAD_INVULNERABLE_SHIELD);
            event.accept(ModItems.WOLF_HEAD);
            event.accept(ModItems.WOLF_HEAD_TAME);
            event.accept(ModItems.WOLF_HEAD_ANGRY);
            event.accept(Items.WITHER_SKELETON_SKULL);
            event.accept(ModItems.ZOGLIN_HEAD);
            event.accept(Items.ZOMBIE_HEAD);
            event.accept(ModItems.ZOMBIFIED_PIGLIN_HEAD);
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
