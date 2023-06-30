package net.risttahukas.moremobheads.block.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, MoreMobHeadsMod.MOD_ID);

    @SuppressWarnings("all")
    public static final RegistryObject<BlockEntityType<EffectSkullBlockEntity>> EFFECT_SKULL =
            BLOCK_ENTITY_TYPES.register("effect_skull", () -> BlockEntityType.Builder.of(EffectSkullBlockEntity::new,
                            ModBlocks.ALLAY_HEAD.get(), ModBlocks.ALLAY_WALL_HEAD.get(),
                            ModBlocks.AXOLOTL_HEAD_LUCY.get(), ModBlocks.AXOLOTL_WALL_HEAD_LUCY.get(),
                            ModBlocks.AXOLOTL_HEAD_WILD.get(), ModBlocks.AXOLOTL_WALL_HEAD_WILD.get(),
                            ModBlocks.AXOLOTL_HEAD_GOLD.get(), ModBlocks.AXOLOTL_WALL_HEAD_GOLD.get(),
                            ModBlocks.AXOLOTL_HEAD_CYAN.get(), ModBlocks.AXOLOTL_WALL_HEAD_CYAN.get(),
                            ModBlocks.AXOLOTL_HEAD_BLUE.get(), ModBlocks.AXOLOTL_WALL_HEAD_BLUE.get(),
                            ModBlocks.BAT_HEAD.get(), ModBlocks.BAT_WALL_HEAD.get(),
                            ModBlocks.BLAZE_HEAD.get(), ModBlocks.BLAZE_WALL_HEAD.get(),
                            ModBlocks.CAMEL_HEAD.get(), ModBlocks.CAMEL_WALL_HEAD.get(),
                            ModBlocks.CAT_HEAD_TABBY.get(), ModBlocks.CAT_WALL_HEAD_TABBY.get(),
                            ModBlocks.CAT_HEAD_BLACK.get(), ModBlocks.CAT_WALL_HEAD_BLACK.get(),
                            ModBlocks.CAT_HEAD_RED.get(), ModBlocks.CAT_WALL_HEAD_RED.get(),
                            ModBlocks.CAT_HEAD_SIAMESE.get(), ModBlocks.CAT_WALL_HEAD_SIAMESE.get(),
                            ModBlocks.CAT_HEAD_BRITISH_SHORTHAIR.get(), ModBlocks.CAT_WALL_HEAD_BRITISH_SHORTHAIR.get(),
                            ModBlocks.CAT_HEAD_CALICO.get(), ModBlocks.CAT_WALL_HEAD_CALICO.get(),
                            ModBlocks.CAT_HEAD_PERSIAN.get(), ModBlocks.CAT_WALL_HEAD_PERSIAN.get(),
                            ModBlocks.CAT_HEAD_RAGDOLL.get(), ModBlocks.CAT_WALL_HEAD_RAGDOLL.get(),
                            ModBlocks.CAT_HEAD_WHITE.get(), ModBlocks.CAT_WALL_HEAD_WHITE.get(),
                            ModBlocks.CAT_HEAD_JELLIE.get(), ModBlocks.CAT_WALL_HEAD_JELLIE.get(),
                            ModBlocks.CAT_HEAD_ALL_BLACK.get(), ModBlocks.CAT_WALL_HEAD_ALL_BLACK.get(),
                            ModBlocks.CAVE_SPIDER_HEAD.get(), ModBlocks.CAVE_SPIDER_WALL_HEAD.get(),
                            ModBlocks.CHICKEN_HEAD.get(), ModBlocks.CHICKEN_WALL_HEAD.get(),
                            ModBlocks.COW_HEAD.get(), ModBlocks.COW_WALL_HEAD.get(),
                            ModBlocks.CREEPER_HEAD_CHARGED.get(), ModBlocks.CREEPER_WALL_HEAD_CHARGED.get(),
                            ModBlocks.DOLPHIN_HEAD.get(), ModBlocks.DOLPHIN_WALL_HEAD.get(),
                            ModBlocks.DONKEY_HEAD.get(), ModBlocks.DONKEY_WALL_HEAD.get(),
                            ModBlocks.DROWNED_HEAD.get(), ModBlocks.DROWNED_WALL_HEAD.get(),
                            ModBlocks.ENDERMAN_HEAD.get(), ModBlocks.ENDERMAN_WALL_HEAD.get(),
                            ModBlocks.EVOKER_HEAD.get(), ModBlocks.EVOKER_WALL_HEAD.get(),
                            ModBlocks.GHAST_HEAD.get(), ModBlocks.GHAST_WALL_HEAD.get(),
                            ModBlocks.HORSE_HEAD_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE.get(),
                            ModBlocks.HORSE_HEAD_CREAMY.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY.get(),
                            ModBlocks.HORSE_HEAD_CHESTNUT.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT.get(),
                            ModBlocks.HORSE_HEAD_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_BROWN.get(),
                            ModBlocks.HORSE_HEAD_BLACK.get(), ModBlocks.HORSE_WALL_HEAD_BLACK.get(),
                            ModBlocks.HORSE_HEAD_GRAY.get(), ModBlocks.HORSE_WALL_HEAD_GRAY.get(),
                            ModBlocks.HORSE_HEAD_DARK_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN.get(),
                            ModBlocks.HORSE_HEAD_WHITE_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE.get(),
                            ModBlocks.HORSE_HEAD_CREAMY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE.get(),
                            ModBlocks.HORSE_HEAD_CHESTNUT_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE.get(),
                            ModBlocks.HORSE_HEAD_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE.get(),
                            ModBlocks.HORSE_HEAD_BLACK_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE.get(),
                            ModBlocks.HORSE_HEAD_GRAY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE.get(),
                            ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE.get(),
                            ModBlocks.HORSE_HEAD_WHITE_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_CREAMY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_BLACK_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_GRAY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_FIELD.get(),
                            ModBlocks.HORSE_HEAD_WHITE_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_CREAMY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_BLACK_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_GRAY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_DOTS.get(),
                            ModBlocks.HORSE_HEAD_WHITE_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_CREAMY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_CHESTNUT_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_BLACK_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_GRAY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_DARK_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_BLACK_DOTS.get(),
                            ModBlocks.HORSE_HEAD_ZOMBIE.get(), ModBlocks.HORSE_WALL_HEAD_ZOMBIE.get(),
                            ModBlocks.HORSE_SKULL_SKELETON.get(), ModBlocks.HORSE_WALL_SKULL_SKELETON.get(),
                            ModBlocks.HUSK_HEAD.get(), ModBlocks.HUSK_WALL_HEAD.get(),
                            ModBlocks.ILLUSIONER_HEAD.get(), ModBlocks.ILLUSIONER_WALL_HEAD.get(),
                            ModBlocks.IRON_GOLEM_HEAD.get(), ModBlocks.IRON_GOLEM_WALL_HEAD.get(),
                            ModBlocks.MAGMA_CUBE_HEAD.get(), ModBlocks.MAGMA_CUBE_WALL_HEAD.get(),
                            ModBlocks.MOOSHROOM_HEAD_RED.get(), ModBlocks.MOOSHROOM_WALL_HEAD_RED.get(),
                            ModBlocks.MOOSHROOM_HEAD_BROWN.get(), ModBlocks.MOOSHROOM_WALL_HEAD_BROWN.get(),
                            ModBlocks.MULE_HEAD.get(), ModBlocks.MULE_WALL_HEAD.get(),
                            ModBlocks.OCELOT_HEAD.get(), ModBlocks.OCELOT_WALL_HEAD.get(),
                            ModBlocks.PANDA_HEAD.get(), ModBlocks.PANDA_WALL_HEAD.get(),
                            ModBlocks.PANDA_HEAD_AGGRESSIVE.get(), ModBlocks.PANDA_WALL_HEAD_AGGRESSIVE.get(),
                            ModBlocks.PANDA_HEAD_LAZY.get(), ModBlocks.PANDA_WALL_HEAD_LAZY.get(),
                            ModBlocks.PANDA_HEAD_WORRIED.get(), ModBlocks.PANDA_WALL_HEAD_WORRIED.get(),
                            ModBlocks.PANDA_HEAD_PLAYFUL.get(), ModBlocks.PANDA_WALL_HEAD_PLAYFUL.get(),
                            ModBlocks.PANDA_HEAD_WEAK.get(), ModBlocks.PANDA_WALL_HEAD_WEAK.get(),
                            ModBlocks.PANDA_HEAD_BROWN.get(), ModBlocks.PANDA_WALL_HEAD_BROWN.get(),
                            ModBlocks.PARROT_HEAD_RED_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_RED_BLUE.get(),
                            ModBlocks.PARROT_HEAD_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_BLUE.get(),
                            ModBlocks.PARROT_HEAD_GREEN.get(), ModBlocks.PARROT_WALL_HEAD_GREEN.get(),
                            ModBlocks.PARROT_HEAD_YELLOW_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_YELLOW_BLUE.get(),
                            ModBlocks.PARROT_HEAD_GREY.get(), ModBlocks.PARROT_WALL_HEAD_GREY.get(),
                            ModBlocks.PHANTOM_HEAD.get(), ModBlocks.PHANTOM_WALL_HEAD.get(),
                            ModBlocks.PILLAGER_HEAD.get(), ModBlocks.PILLAGER_WALL_HEAD.get(),
                            ModBlocks.POLAR_BEAR_HEAD.get(), ModBlocks.POLAR_BEAR_WALL_HEAD.get(),
                            ModBlocks.PUFFERFISH_HEAD.get(), ModBlocks.PUFFERFISH_WALL_HEAD.get(),
                            ModBlocks.RAVAGER_HEAD.get(), ModBlocks.RAVAGER_WALL_HEAD.get(),
                            ModBlocks.SHEEP_HEAD_WHITE.get(), ModBlocks.SHEEP_WALL_HEAD_WHITE.get(),
                            ModBlocks.SHEEP_HEAD_ORANGE.get(), ModBlocks.SHEEP_WALL_HEAD_ORANGE.get(),
                            ModBlocks.SHEEP_HEAD_MAGENTA.get(), ModBlocks.SHEEP_WALL_HEAD_MAGENTA.get(),
                            ModBlocks.SHEEP_HEAD_LIGHT_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_BLUE.get(),
                            ModBlocks.SHEEP_HEAD_YELLOW.get(), ModBlocks.SHEEP_WALL_HEAD_YELLOW.get(),
                            ModBlocks.SHEEP_HEAD_LIME.get(), ModBlocks.SHEEP_WALL_HEAD_LIME.get(),
                            ModBlocks.SHEEP_HEAD_PINK.get(), ModBlocks.SHEEP_WALL_HEAD_PINK.get(),
                            ModBlocks.SHEEP_HEAD_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_GRAY.get(),
                            ModBlocks.SHEEP_HEAD_LIGHT_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_GRAY.get(),
                            ModBlocks.SHEEP_HEAD_CYAN.get(), ModBlocks.SHEEP_WALL_HEAD_CYAN.get(),
                            ModBlocks.SHEEP_HEAD_PURPLE.get(), ModBlocks.SHEEP_WALL_HEAD_PURPLE.get(),
                            ModBlocks.SHEEP_HEAD_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_BLUE.get(),
                            ModBlocks.SHEEP_HEAD_BROWN.get(), ModBlocks.SHEEP_WALL_HEAD_BROWN.get(),
                            ModBlocks.SHEEP_HEAD_GREEN.get(), ModBlocks.SHEEP_WALL_HEAD_GREEN.get(),
                            ModBlocks.SHEEP_HEAD_RED.get(), ModBlocks.SHEEP_WALL_HEAD_RED.get(),
                            ModBlocks.SHEEP_HEAD_BLACK.get(), ModBlocks.SHEEP_WALL_HEAD_BLACK.get(),
                            ModBlocks.SHEEP_HEAD_RAINBOW.get(), ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get(),
                            ModBlocks.SLIME_HEAD.get(), ModBlocks.SLIME_WALL_HEAD.get(),
                            ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
                            ModBlocks.STRAY_SKULL.get(), ModBlocks.STRAY_WALL_SKULL.get(),
                            ModBlocks.VEX_HEAD.get(), ModBlocks.VEX_WALL_HEAD.get(),
                            ModBlocks.VINDICATOR_HEAD.get(), ModBlocks.VINDICATOR_WALL_HEAD.get(),
                            ModBlocks.WARDEN_HEAD.get(), ModBlocks.WARDEN_WALL_HEAD.get(),
                            ModBlocks.WITCH_HEAD.get(), ModBlocks.WITCH_WALL_HEAD.get())
                    .build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
