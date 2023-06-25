package net.risttahukas.moremobheads.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.PushReaction;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MoreMobHeadsMod.MOD_ID);

    public static final RegistryObject<Block> ALLAY_HEAD = BLOCKS.register("allay_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.ALLAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ALLAY_WALL_HEAD = BLOCKS.register("allay_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.ALLAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(ALLAY_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> AXOLOTL_HEAD_LUCY = BLOCKS.register("axolotl_head_lucy",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.AXOLOTL_LUCY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AXOLOTL_WALL_HEAD_LUCY = BLOCKS.register("axolotl_wall_head_lucy",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.AXOLOTL_LUCY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(AXOLOTL_HEAD_LUCY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> AXOLOTL_HEAD_WILD = BLOCKS.register("axolotl_head_wild",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.AXOLOTL_WILD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AXOLOTL_WALL_HEAD_WILD = BLOCKS.register("axolotl_wall_head_wild",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.AXOLOTL_WILD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(AXOLOTL_HEAD_WILD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> AXOLOTL_HEAD_GOLD = BLOCKS.register("axolotl_head_gold",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.AXOLOTL_GOLD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AXOLOTL_WALL_HEAD_GOLD = BLOCKS.register("axolotl_wall_head_gold",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.AXOLOTL_GOLD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(AXOLOTL_HEAD_GOLD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> AXOLOTL_HEAD_CYAN = BLOCKS.register("axolotl_head_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.AXOLOTL_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AXOLOTL_WALL_HEAD_CYAN = BLOCKS.register("axolotl_wall_head_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.AXOLOTL_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(AXOLOTL_HEAD_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> AXOLOTL_HEAD_BLUE = BLOCKS.register("axolotl_head_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.AXOLOTL_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> AXOLOTL_WALL_HEAD_BLUE = BLOCKS.register("axolotl_wall_head_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.AXOLOTL_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(AXOLOTL_HEAD_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAVE_SPIDER_HEAD = BLOCKS.register("cave_spider_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAVE_SPIDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAVE_SPIDER_WALL_HEAD = BLOCKS.register("cave_spider_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAVE_SPIDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAVE_SPIDER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CHICKEN_HEAD = BLOCKS.register("chicken_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CHICKEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CHICKEN_WALL_HEAD = BLOCKS.register("chicken_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CHICKEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CHICKEN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GHAST_HEAD = BLOCKS.register("ghast_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GHAST, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GHAST_WALL_HEAD = BLOCKS.register("ghast_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GHAST, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GHAST_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PARROT_HEAD_RED_BLUE = BLOCKS.register("parrot_head_red_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PARROT_RED_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PARROT_WALL_HEAD_RED_BLUE = BLOCKS.register("parrot_wall_head_red_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PARROT_RED_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PARROT_HEAD_RED_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PARROT_HEAD_BLUE = BLOCKS.register("parrot_head_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PARROT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PARROT_WALL_HEAD_BLUE = BLOCKS.register("parrot_wall_head_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PARROT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PARROT_HEAD_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PARROT_HEAD_GREEN = BLOCKS.register("parrot_head_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PARROT_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PARROT_WALL_HEAD_GREEN = BLOCKS.register("parrot_wall_head_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PARROT_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PARROT_HEAD_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PARROT_HEAD_YELLOW_BLUE = BLOCKS.register("parrot_head_yellow_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PARROT_WALL_HEAD_YELLOW_BLUE = BLOCKS.register("parrot_wall_head_yellow_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PARROT_HEAD_YELLOW_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PARROT_HEAD_GREY = BLOCKS.register("parrot_head_grey",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PARROT_GREY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PARROT_WALL_HEAD_GREY = BLOCKS.register("parrot_wall_head_grey",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PARROT_GREY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PARROT_HEAD_GREY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_WHITE = BLOCKS.register("sheep_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_WHITE = BLOCKS.register("sheep_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_ORANGE = BLOCKS.register("sheep_head_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_ORANGE = BLOCKS.register("sheep_wall_head_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_MAGENTA = BLOCKS.register("sheep_head_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_MAGENTA = BLOCKS.register("sheep_wall_head_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_LIGHT_BLUE = BLOCKS.register("sheep_head_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_LIGHT_BLUE = BLOCKS.register("sheep_wall_head_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_YELLOW = BLOCKS.register("sheep_head_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_YELLOW = BLOCKS.register("sheep_wall_head_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_LIME = BLOCKS.register("sheep_head_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_LIME = BLOCKS.register("sheep_wall_head_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_PINK = BLOCKS.register("sheep_head_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_PINK = BLOCKS.register("sheep_wall_head_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_GRAY = BLOCKS.register("sheep_head_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_GRAY = BLOCKS.register("sheep_wall_head_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_LIGHT_GRAY = BLOCKS.register("sheep_head_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_LIGHT_GRAY = BLOCKS.register("sheep_wall_head_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_CYAN = BLOCKS.register("sheep_head_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_CYAN = BLOCKS.register("sheep_wall_head_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_PURPLE = BLOCKS.register("sheep_head_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_PURPLE = BLOCKS.register("sheep_wall_head_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_BLUE = BLOCKS.register("sheep_head_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_BLUE = BLOCKS.register("sheep_wall_head_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_BROWN = BLOCKS.register("sheep_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_BROWN = BLOCKS.register("sheep_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_GREEN = BLOCKS.register("sheep_head_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_GREEN = BLOCKS.register("sheep_wall_head_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_RED = BLOCKS.register("sheep_head_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_RED = BLOCKS.register("sheep_wall_head_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_BLACK = BLOCKS.register("sheep_head_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_BLACK = BLOCKS.register("sheep_wall_head_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHEEP_HEAD_RAINBOW = BLOCKS.register("sheep_head_rainbow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHEEP_RAINBOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHEEP_WALL_HEAD_RAINBOW = BLOCKS.register("sheep_wall_head_rainbow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHEEP_RAINBOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHEEP_HEAD_RAINBOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SPIDER_HEAD = BLOCKS.register("spider_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SPIDER_WALL_HEAD = BLOCKS.register("spider_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SPIDER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WITCH_HEAD = BLOCKS.register("witch_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WITCH, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WITCH_WALL_HEAD = BLOCKS.register("witch_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WITCH, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WITCH_HEAD).pushReaction(PushReaction.DESTROY)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
