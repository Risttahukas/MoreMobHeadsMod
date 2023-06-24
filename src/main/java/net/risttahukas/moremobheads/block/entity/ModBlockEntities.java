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
                            ModBlocks.AXOLOTL_HEAD_LUCY.get(), ModBlocks.AXOLOTL_WALL_HEAD_LUCY.get(),
                            ModBlocks.AXOLOTL_HEAD_WILD.get(), ModBlocks.AXOLOTL_WALL_HEAD_WILD.get(),
                            ModBlocks.AXOLOTL_HEAD_GOLD.get(), ModBlocks.AXOLOTL_WALL_HEAD_GOLD.get(),
                            ModBlocks.AXOLOTL_HEAD_CYAN.get(), ModBlocks.AXOLOTL_WALL_HEAD_CYAN.get(),
                            ModBlocks.AXOLOTL_HEAD_BLUE.get(), ModBlocks.AXOLOTL_WALL_HEAD_BLUE.get(),
                            ModBlocks.CAVE_SPIDER_HEAD.get(), ModBlocks.CAVE_SPIDER_WALL_HEAD.get(),
                            ModBlocks.CHICKEN_HEAD.get(), ModBlocks.CHICKEN_WALL_HEAD.get(),
                            ModBlocks.GHAST_HEAD.get(), ModBlocks.GHAST_WALL_HEAD.get(),
                            ModBlocks.PARROT_HEAD_RED_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_RED_BLUE.get(),
                            ModBlocks.PARROT_HEAD_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_BLUE.get(),
                            ModBlocks.PARROT_HEAD_GREEN.get(), ModBlocks.PARROT_WALL_HEAD_GREEN.get(),
                            ModBlocks.PARROT_HEAD_YELLOW_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_YELLOW_BLUE.get(),
                            ModBlocks.PARROT_HEAD_GREY.get(), ModBlocks.PARROT_WALL_HEAD_GREY.get(),
                            ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
                            ModBlocks.WITCH_HEAD.get(), ModBlocks.WITCH_WALL_HEAD.get())
                    .build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITY_TYPES.register(eventBus);
    }
}
