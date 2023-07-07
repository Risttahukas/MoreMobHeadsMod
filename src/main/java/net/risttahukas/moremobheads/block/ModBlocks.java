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

    public static final RegistryObject<Block> BAT_HEAD = BLOCKS.register("bat_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BAT, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BAT_WALL_HEAD = BLOCKS.register("bat_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BAT, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BAT_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> BEE_HEAD = BLOCKS.register("bee_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BEE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BEE_WALL_HEAD = BLOCKS.register("bee_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BEE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BEE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> BEE_HEAD_ANGRY = BLOCKS.register("bee_head_angry",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BEE_ANGRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BEE_WALL_HEAD_ANGRY = BLOCKS.register("bee_wall_head_angry",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BEE_ANGRY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BEE_HEAD_ANGRY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> BEE_HEAD_POLLEN = BLOCKS.register("bee_head_pollen",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BEE_POLLEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BEE_WALL_HEAD_POLLEN = BLOCKS.register("bee_wall_head_pollen",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BEE_POLLEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BEE_HEAD_POLLEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> BEE_HEAD_ANGRY_POLLEN = BLOCKS.register("bee_head_angry_pollen",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BEE_ANGRY_POLLEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BEE_WALL_HEAD_ANGRY_POLLEN = BLOCKS.register("bee_wall_head_angry_pollen",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BEE_ANGRY_POLLEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BEE_HEAD_ANGRY_POLLEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> BLAZE_HEAD = BLOCKS.register("blaze_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.BLAZE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> BLAZE_WALL_HEAD = BLOCKS.register("blaze_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.BLAZE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(BLAZE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAMEL_HEAD = BLOCKS.register("camel_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAMEL, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAMEL_WALL_HEAD = BLOCKS.register("camel_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAMEL, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAMEL_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_TABBY = BLOCKS.register("cat_head_tabby",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_TABBY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_TABBY = BLOCKS.register("cat_wall_head_tabby",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_TABBY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_TABBY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_BLACK = BLOCKS.register("cat_head_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_BLACK = BLOCKS.register("cat_wall_head_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_RED = BLOCKS.register("cat_head_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_RED = BLOCKS.register("cat_wall_head_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_SIAMESE = BLOCKS.register("cat_head_siamese",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_SIAMESE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_SIAMESE = BLOCKS.register("cat_wall_head_siamese",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_SIAMESE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_SIAMESE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_BRITISH_SHORTHAIR = BLOCKS.register("cat_head_british_shorthair",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_BRITISH_SHORTHAIR, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_BRITISH_SHORTHAIR = BLOCKS.register("cat_wall_head_british_shorthair",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_BRITISH_SHORTHAIR, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_BRITISH_SHORTHAIR).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_CALICO = BLOCKS.register("cat_head_calico",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_CALICO, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_CALICO = BLOCKS.register("cat_wall_head_calico",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_CALICO, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_CALICO).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_PERSIAN = BLOCKS.register("cat_head_persian",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_PERSIAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_PERSIAN = BLOCKS.register("cat_wall_head_persian",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_PERSIAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_PERSIAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_RAGDOLL = BLOCKS.register("cat_head_ragdoll",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_RAGDOLL, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_RAGDOLL = BLOCKS.register("cat_wall_head_ragdoll",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_RAGDOLL, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_RAGDOLL).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_WHITE = BLOCKS.register("cat_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_WHITE = BLOCKS.register("cat_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_JELLIE = BLOCKS.register("cat_head_jellie",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_JELLIE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_JELLIE = BLOCKS.register("cat_wall_head_jellie",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_JELLIE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_JELLIE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CAT_HEAD_ALL_BLACK = BLOCKS.register("cat_head_all_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CAT_ALL_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CAT_WALL_HEAD_ALL_BLACK = BLOCKS.register("cat_wall_head_all_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CAT_ALL_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CAT_HEAD_ALL_BLACK).pushReaction(PushReaction.DESTROY)));

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

    public static final RegistryObject<Block> COD_HEAD = BLOCKS.register("cod_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.COD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> COD_WALL_HEAD = BLOCKS.register("cod_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.COD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(COD_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> COW_HEAD = BLOCKS.register("cow_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.COW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> COW_WALL_HEAD = BLOCKS.register("cow_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.COW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(COW_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> CREEPER_HEAD_CHARGED = BLOCKS.register("creeper_head_charged",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.CREEPER_CHARGED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.CREEPER).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> CREEPER_WALL_HEAD_CHARGED = BLOCKS.register("creeper_wall_head_charged",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.CREEPER_CHARGED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(CREEPER_HEAD_CHARGED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> DOLPHIN_HEAD = BLOCKS.register("dolphin_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.DOLPHIN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DOLPHIN_WALL_HEAD = BLOCKS.register("dolphin_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.DOLPHIN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(DOLPHIN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> DONKEY_HEAD = BLOCKS.register("donkey_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.DONKEY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DONKEY_WALL_HEAD = BLOCKS.register("donkey_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.DONKEY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(DONKEY_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> DROWNED_HEAD = BLOCKS.register("drowned_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.DROWNED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> DROWNED_WALL_HEAD = BLOCKS.register("drowned_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.DROWNED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(DROWNED_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ENDERMAN_HEAD = BLOCKS.register("enderman_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.ENDERMAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ENDERMAN_WALL_HEAD = BLOCKS.register("enderman_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.ENDERMAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(ENDERMAN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ENDERMITE_HEAD = BLOCKS.register("endermite_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.ENDERMITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ENDERMITE_WALL_HEAD = BLOCKS.register("endermite_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.ENDERMITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(ENDERMITE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> EVOKER_HEAD = BLOCKS.register("evoker_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.EVOKER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> EVOKER_WALL_HEAD = BLOCKS.register("evoker_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.EVOKER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(EVOKER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> FOX_HEAD_RED = BLOCKS.register("fox_head_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.FOX_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FOX_WALL_HEAD_RED = BLOCKS.register("fox_wall_head_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.FOX_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(FOX_HEAD_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> FOX_HEAD_SNOW = BLOCKS.register("fox_head_snow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.FOX_SNOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FOX_WALL_HEAD_SNOW = BLOCKS.register("fox_wall_head_snow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.FOX_SNOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(FOX_HEAD_SNOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> FROG_HEAD_TEMPERATE = BLOCKS.register("frog_head_temperate",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.FROG_TEMPERATE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FROG_WALL_HEAD_TEMPERATE = BLOCKS.register("frog_wall_head_temperate",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.FROG_TEMPERATE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(FROG_HEAD_TEMPERATE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> FROG_HEAD_WARM = BLOCKS.register("frog_head_warm",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.FROG_WARM, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FROG_WALL_HEAD_WARM = BLOCKS.register("frog_wall_head_warm",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.FROG_WARM, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(FROG_HEAD_WARM).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> FROG_HEAD_COLD = BLOCKS.register("frog_head_cold",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.FROG_COLD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> FROG_WALL_HEAD_COLD = BLOCKS.register("frog_wall_head_cold",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.FROG_COLD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(FROG_HEAD_COLD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GHAST_HEAD = BLOCKS.register("ghast_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GHAST, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GHAST_WALL_HEAD = BLOCKS.register("ghast_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GHAST, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GHAST_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GLOW_SQUID_HEAD = BLOCKS.register("glow_squid_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GLOW_SQUID, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GLOW_SQUID_WALL_HEAD = BLOCKS.register("glow_squid_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GLOW_SQUID, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GLOW_SQUID_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GOAT_HEAD = BLOCKS.register("goat_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GOAT, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOAT_WALL_HEAD = BLOCKS.register("goat_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GOAT, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GOAT_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GOAT_HEAD_SCREAMING = BLOCKS.register("goat_head_screaming",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GOAT_SCREAMING, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GOAT_WALL_HEAD_SCREAMING = BLOCKS.register("goat_wall_head_screaming",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GOAT_SCREAMING, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GOAT_HEAD_SCREAMING).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GUARDIAN_HEAD = BLOCKS.register("guardian_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GUARDIAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GUARDIAN_WALL_HEAD = BLOCKS.register("guardian_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GUARDIAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GUARDIAN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> GUARDIAN_ELDER_HEAD = BLOCKS.register("guardian_elder_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.GUARDIAN_ELDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> GUARDIAN_ELDER_WALL_HEAD = BLOCKS.register("guardian_elder_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.GUARDIAN_ELDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(GUARDIAN_ELDER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_WHITE = BLOCKS.register("horse_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_WHITE = BLOCKS.register("horse_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CREAMY = BLOCKS.register("horse_head_creamy",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CREAMY = BLOCKS.register("horse_wall_head_creamy",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CREAMY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CHESTNUT = BLOCKS.register("horse_head_chestnut",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CHESTNUT = BLOCKS.register("horse_wall_head_chestnut",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CHESTNUT).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BROWN = BLOCKS.register("horse_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BROWN = BLOCKS.register("horse_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BLACK = BLOCKS.register("horse_head_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BLACK = BLOCKS.register("horse_wall_head_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_GRAY = BLOCKS.register("horse_head_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_GRAY = BLOCKS.register("horse_wall_head_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_DARK_BROWN = BLOCKS.register("horse_head_dark_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_DARK_BROWN = BLOCKS.register("horse_wall_head_dark_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_DARK_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_WHITE_WHITE = BLOCKS.register("horse_head_white_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_WHITE_WHITE = BLOCKS.register("horse_wall_head_white_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_WHITE_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CREAMY_WHITE = BLOCKS.register("horse_head_creamy_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CREAMY_WHITE = BLOCKS.register("horse_wall_head_creamy_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CREAMY_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CHESTNUT_WHITE = BLOCKS.register("horse_head_chestnut_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CHESTNUT_WHITE = BLOCKS.register("horse_wall_head_chestnut_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CHESTNUT_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BROWN_WHITE = BLOCKS.register("horse_head_brown_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BROWN_WHITE = BLOCKS.register("horse_wall_head_brown_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BROWN_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BLACK_WHITE = BLOCKS.register("horse_head_black_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BLACK_WHITE = BLOCKS.register("horse_wall_head_black_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BLACK_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_GRAY_WHITE = BLOCKS.register("horse_head_gray_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_GRAY_WHITE = BLOCKS.register("horse_wall_head_gray_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_GRAY_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_DARK_BROWN_WHITE = BLOCKS.register("horse_head_dark_brown_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_DARK_BROWN_WHITE = BLOCKS.register("horse_wall_head_dark_brown_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_DARK_BROWN_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_WHITE_WHITE_FIELD = BLOCKS.register("horse_head_white_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_WHITE_WHITE_FIELD = BLOCKS.register("horse_wall_head_white_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_WHITE_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CREAMY_WHITE_FIELD = BLOCKS.register("horse_head_creamy_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CREAMY_WHITE_FIELD = BLOCKS.register("horse_wall_head_creamy_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CREAMY_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CHESTNUT_WHITE_FIELD = BLOCKS.register("horse_head_chestnut_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CHESTNUT_WHITE_FIELD = BLOCKS.register("horse_wall_head_chestnut_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CHESTNUT_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BROWN_WHITE_FIELD = BLOCKS.register("horse_head_brown_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BROWN_WHITE_FIELD = BLOCKS.register("horse_wall_head_brown_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BROWN_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BLACK_WHITE_FIELD = BLOCKS.register("horse_head_black_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BLACK_WHITE_FIELD = BLOCKS.register("horse_wall_head_black_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BLACK_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_GRAY_WHITE_FIELD = BLOCKS.register("horse_head_gray_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_GRAY_WHITE_FIELD = BLOCKS.register("horse_wall_head_gray_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_GRAY_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_DARK_BROWN_WHITE_FIELD = BLOCKS.register("horse_head_dark_brown_white_field",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_FIELD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_DARK_BROWN_WHITE_FIELD = BLOCKS.register("horse_wall_head_dark_brown_white_field",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_FIELD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_DARK_BROWN_WHITE_FIELD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_WHITE_WHITE_DOTS = BLOCKS.register("horse_head_white_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_WHITE_WHITE_DOTS = BLOCKS.register("horse_wall_head_white_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_WHITE_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CREAMY_WHITE_DOTS = BLOCKS.register("horse_head_creamy_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CREAMY_WHITE_DOTS = BLOCKS.register("horse_wall_head_creamy_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CREAMY_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CHESTNUT_WHITE_DOTS = BLOCKS.register("horse_head_chestnut_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CHESTNUT_WHITE_DOTS = BLOCKS.register("horse_wall_head_chestnut_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CHESTNUT_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BROWN_WHITE_DOTS = BLOCKS.register("horse_head_brown_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BROWN_WHITE_DOTS = BLOCKS.register("horse_wall_head_brown_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BROWN_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BLACK_WHITE_DOTS = BLOCKS.register("horse_head_black_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BLACK_WHITE_DOTS = BLOCKS.register("horse_wall_head_black_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BLACK_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_GRAY_WHITE_DOTS = BLOCKS.register("horse_head_gray_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_GRAY_WHITE_DOTS = BLOCKS.register("horse_wall_head_gray_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_GRAY_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_DARK_BROWN_WHITE_DOTS = BLOCKS.register("horse_head_dark_brown_white_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_DARK_BROWN_WHITE_DOTS = BLOCKS.register("horse_wall_head_dark_brown_white_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_DARK_BROWN_WHITE_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_WHITE_BLACK_DOTS = BLOCKS.register("horse_head_white_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_WHITE_BLACK_DOTS = BLOCKS.register("horse_wall_head_white_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_WHITE_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_WHITE_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CREAMY_BLACK_DOTS = BLOCKS.register("horse_head_creamy_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CREAMY_BLACK_DOTS = BLOCKS.register("horse_wall_head_creamy_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CREAMY_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CREAMY_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_CHESTNUT_BLACK_DOTS = BLOCKS.register("horse_head_chestnut_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_CHESTNUT_BLACK_DOTS = BLOCKS.register("horse_wall_head_chestnut_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_CHESTNUT_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_CHESTNUT_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BROWN_BLACK_DOTS = BLOCKS.register("horse_head_brown_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BROWN_BLACK_DOTS = BLOCKS.register("horse_wall_head_brown_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BROWN_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BROWN_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_BLACK_BLACK_DOTS = BLOCKS.register("horse_head_black_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_BLACK_BLACK_DOTS = BLOCKS.register("horse_wall_head_black_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_BLACK_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_BLACK_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_GRAY_BLACK_DOTS = BLOCKS.register("horse_head_gray_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_GRAY_BLACK_DOTS = BLOCKS.register("horse_wall_head_gray_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_GRAY_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_GRAY_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_DARK_BROWN_BLACK_DOTS = BLOCKS.register("horse_head_dark_brown_black_dots",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_BLACK_DOTS, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_DARK_BROWN_BLACK_DOTS = BLOCKS.register("horse_wall_head_dark_brown_black_dots",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_DARK_BROWN_BLACK_DOTS, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_DARK_BROWN_BLACK_DOTS).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_HEAD_ZOMBIE = BLOCKS.register("horse_head_zombie",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_ZOMBIE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_HEAD_ZOMBIE = BLOCKS.register("horse_wall_head_zombie",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_ZOMBIE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_HEAD_ZOMBIE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HORSE_SKULL_SKELETON = BLOCKS.register("horse_skull_skeleton",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HORSE_SKELETON, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HORSE_WALL_SKULL_SKELETON = BLOCKS.register("horse_wall_skull_skeleton",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HORSE_SKELETON, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HORSE_SKULL_SKELETON).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> HUSK_HEAD = BLOCKS.register("husk_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.HUSK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> HUSK_WALL_HEAD = BLOCKS.register("husk_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.HUSK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(HUSK_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ILLUSIONER_HEAD = BLOCKS.register("illusioner_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.ILLUSIONER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ILLUSIONER_WALL_HEAD = BLOCKS.register("illusioner_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.ILLUSIONER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(ILLUSIONER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> IRON_GOLEM_HEAD = BLOCKS.register("iron_golem_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.IRON_GOLEM, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> IRON_GOLEM_WALL_HEAD = BLOCKS.register("iron_golem_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.IRON_GOLEM, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(IRON_GOLEM_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY = BLOCKS.register("llama_head_creamy",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY = BLOCKS.register("llama_wall_head_creamy",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE = BLOCKS.register("llama_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE = BLOCKS.register("llama_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN = BLOCKS.register("llama_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN = BLOCKS.register("llama_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY = BLOCKS.register("llama_head_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY = BLOCKS.register("llama_wall_head_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_WHITE = BLOCKS.register("llama_head_creamy_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_WHITE = BLOCKS.register("llama_wall_head_creamy_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_WHITE = BLOCKS.register("llama_head_white_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_WHITE = BLOCKS.register("llama_wall_head_white_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_WHITE = BLOCKS.register("llama_head_brown_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_WHITE = BLOCKS.register("llama_wall_head_brown_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_WHITE = BLOCKS.register("llama_head_gray_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_WHITE = BLOCKS.register("llama_wall_head_gray_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_ORANGE = BLOCKS.register("llama_head_creamy_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_ORANGE = BLOCKS.register("llama_wall_head_creamy_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_ORANGE = BLOCKS.register("llama_head_white_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_ORANGE = BLOCKS.register("llama_wall_head_white_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_ORANGE = BLOCKS.register("llama_head_brown_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_ORANGE = BLOCKS.register("llama_wall_head_brown_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_ORANGE = BLOCKS.register("llama_head_gray_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_ORANGE = BLOCKS.register("llama_wall_head_gray_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_MAGENTA = BLOCKS.register("llama_head_creamy_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_MAGENTA = BLOCKS.register("llama_wall_head_creamy_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_MAGENTA = BLOCKS.register("llama_head_white_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_MAGENTA = BLOCKS.register("llama_wall_head_white_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_MAGENTA = BLOCKS.register("llama_head_brown_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_MAGENTA = BLOCKS.register("llama_wall_head_brown_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_MAGENTA = BLOCKS.register("llama_head_gray_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_MAGENTA = BLOCKS.register("llama_wall_head_gray_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_LIGHT_BLUE = BLOCKS.register("llama_head_creamy_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_LIGHT_BLUE = BLOCKS.register("llama_wall_head_creamy_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_LIGHT_BLUE = BLOCKS.register("llama_head_white_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_LIGHT_BLUE = BLOCKS.register("llama_wall_head_white_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_LIGHT_BLUE = BLOCKS.register("llama_head_brown_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_LIGHT_BLUE = BLOCKS.register("llama_wall_head_brown_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_LIGHT_BLUE = BLOCKS.register("llama_head_gray_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_LIGHT_BLUE = BLOCKS.register("llama_wall_head_gray_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_YELLOW = BLOCKS.register("llama_head_creamy_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_YELLOW = BLOCKS.register("llama_wall_head_creamy_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_YELLOW = BLOCKS.register("llama_head_white_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_YELLOW = BLOCKS.register("llama_wall_head_white_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_YELLOW = BLOCKS.register("llama_head_brown_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_YELLOW = BLOCKS.register("llama_wall_head_brown_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_YELLOW = BLOCKS.register("llama_head_gray_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_YELLOW = BLOCKS.register("llama_wall_head_gray_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_LIME = BLOCKS.register("llama_head_creamy_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_LIME = BLOCKS.register("llama_wall_head_creamy_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_LIME = BLOCKS.register("llama_head_white_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_LIME = BLOCKS.register("llama_wall_head_white_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_LIME = BLOCKS.register("llama_head_brown_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_LIME = BLOCKS.register("llama_wall_head_brown_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_LIME = BLOCKS.register("llama_head_gray_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_LIME = BLOCKS.register("llama_wall_head_gray_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_PINK = BLOCKS.register("llama_head_creamy_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_PINK = BLOCKS.register("llama_wall_head_creamy_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_PINK = BLOCKS.register("llama_head_white_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_PINK = BLOCKS.register("llama_wall_head_white_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_PINK = BLOCKS.register("llama_head_brown_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_PINK = BLOCKS.register("llama_wall_head_brown_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_PINK = BLOCKS.register("llama_head_gray_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_PINK = BLOCKS.register("llama_wall_head_gray_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_GRAY = BLOCKS.register("llama_head_creamy_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_GRAY = BLOCKS.register("llama_wall_head_creamy_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_GRAY = BLOCKS.register("llama_head_white_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_GRAY = BLOCKS.register("llama_wall_head_white_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_GRAY = BLOCKS.register("llama_head_brown_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_GRAY = BLOCKS.register("llama_wall_head_brown_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_GRAY = BLOCKS.register("llama_head_gray_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_GRAY = BLOCKS.register("llama_wall_head_gray_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_LIGHT_GRAY = BLOCKS.register("llama_head_creamy_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_LIGHT_GRAY = BLOCKS.register("llama_wall_head_creamy_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_LIGHT_GRAY = BLOCKS.register("llama_head_white_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_LIGHT_GRAY = BLOCKS.register("llama_wall_head_white_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_LIGHT_GRAY = BLOCKS.register("llama_head_brown_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_LIGHT_GRAY = BLOCKS.register("llama_wall_head_brown_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_LIGHT_GRAY = BLOCKS.register("llama_head_gray_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_LIGHT_GRAY = BLOCKS.register("llama_wall_head_gray_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_CYAN = BLOCKS.register("llama_head_creamy_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_CYAN = BLOCKS.register("llama_wall_head_creamy_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_CYAN = BLOCKS.register("llama_head_white_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_CYAN = BLOCKS.register("llama_wall_head_white_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_CYAN = BLOCKS.register("llama_head_brown_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_CYAN = BLOCKS.register("llama_wall_head_brown_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_CYAN = BLOCKS.register("llama_head_gray_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_CYAN = BLOCKS.register("llama_wall_head_gray_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_PURPLE = BLOCKS.register("llama_head_creamy_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_PURPLE = BLOCKS.register("llama_wall_head_creamy_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_PURPLE = BLOCKS.register("llama_head_white_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_PURPLE = BLOCKS.register("llama_wall_head_white_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_PURPLE = BLOCKS.register("llama_head_brown_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_PURPLE = BLOCKS.register("llama_wall_head_brown_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_PURPLE = BLOCKS.register("llama_head_gray_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_PURPLE = BLOCKS.register("llama_wall_head_gray_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_BLUE = BLOCKS.register("llama_head_creamy_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_BLUE = BLOCKS.register("llama_wall_head_creamy_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_BLUE = BLOCKS.register("llama_head_white_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_BLUE = BLOCKS.register("llama_wall_head_white_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_BLUE = BLOCKS.register("llama_head_brown_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_BLUE = BLOCKS.register("llama_wall_head_brown_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_BLUE = BLOCKS.register("llama_head_gray_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_BLUE = BLOCKS.register("llama_wall_head_gray_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_BROWN = BLOCKS.register("llama_head_creamy_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_BROWN = BLOCKS.register("llama_wall_head_creamy_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_BROWN = BLOCKS.register("llama_head_white_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_BROWN = BLOCKS.register("llama_wall_head_white_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_BROWN = BLOCKS.register("llama_head_brown_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_BROWN = BLOCKS.register("llama_wall_head_brown_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_BROWN = BLOCKS.register("llama_head_gray_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_BROWN = BLOCKS.register("llama_wall_head_gray_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_GREEN = BLOCKS.register("llama_head_creamy_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_GREEN = BLOCKS.register("llama_wall_head_creamy_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_GREEN = BLOCKS.register("llama_head_white_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_GREEN = BLOCKS.register("llama_wall_head_white_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_GREEN = BLOCKS.register("llama_head_brown_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_GREEN = BLOCKS.register("llama_wall_head_brown_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_GREEN = BLOCKS.register("llama_head_gray_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_GREEN = BLOCKS.register("llama_wall_head_gray_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_RED = BLOCKS.register("llama_head_creamy_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_RED = BLOCKS.register("llama_wall_head_creamy_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_RED = BLOCKS.register("llama_head_white_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_RED = BLOCKS.register("llama_wall_head_white_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_RED = BLOCKS.register("llama_head_brown_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_RED = BLOCKS.register("llama_wall_head_brown_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_RED = BLOCKS.register("llama_head_gray_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_RED = BLOCKS.register("llama_wall_head_gray_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_CREAMY_BLACK = BLOCKS.register("llama_head_creamy_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_CREAMY_BLACK = BLOCKS.register("llama_wall_head_creamy_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_CREAMY_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_CREAMY_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_WHITE_BLACK = BLOCKS.register("llama_head_white_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_WHITE_BLACK = BLOCKS.register("llama_wall_head_white_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_WHITE_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_WHITE_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_BROWN_BLACK = BLOCKS.register("llama_head_brown_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_BROWN_BLACK = BLOCKS.register("llama_wall_head_brown_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_BROWN_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_BROWN_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> LLAMA_HEAD_GRAY_BLACK = BLOCKS.register("llama_head_gray_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> LLAMA_WALL_HEAD_GRAY_BLACK = BLOCKS.register("llama_wall_head_gray_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.LLAMA_GRAY_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(LLAMA_HEAD_GRAY_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MAGMA_CUBE_HEAD = BLOCKS.register("magma_cube_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.MAGMA_CUBE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MAGMA_CUBE_WALL_HEAD = BLOCKS.register("magma_cube_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.MAGMA_CUBE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(MAGMA_CUBE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MOOSHROOM_HEAD_RED = BLOCKS.register("mooshroom_head_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.MOOSHROOM_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MOOSHROOM_WALL_HEAD_RED = BLOCKS.register("mooshroom_wall_head_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.MOOSHROOM_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(MOOSHROOM_HEAD_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MOOSHROOM_HEAD_BROWN = BLOCKS.register("mooshroom_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.MOOSHROOM_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MOOSHROOM_WALL_HEAD_BROWN = BLOCKS.register("mooshroom_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.MOOSHROOM_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(MOOSHROOM_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> MULE_HEAD = BLOCKS.register("mule_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.MULE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> MULE_WALL_HEAD = BLOCKS.register("mule_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.MULE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(MULE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> OCELOT_HEAD = BLOCKS.register("ocelot_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.OCELOT, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> OCELOT_WALL_HEAD = BLOCKS.register("ocelot_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.OCELOT, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(OCELOT_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD = BLOCKS.register("panda_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD = BLOCKS.register("panda_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_AGGRESSIVE = BLOCKS.register("panda_head_aggressive",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_AGGRESSIVE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_AGGRESSIVE = BLOCKS.register("panda_wall_head_aggressive",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_AGGRESSIVE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_AGGRESSIVE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_LAZY = BLOCKS.register("panda_head_lazy",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_LAZY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_LAZY = BLOCKS.register("panda_wall_head_lazy",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_LAZY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_LAZY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_WORRIED = BLOCKS.register("panda_head_worried",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_WORRIED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_WORRIED = BLOCKS.register("panda_wall_head_worried",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_WORRIED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_WORRIED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_PLAYFUL = BLOCKS.register("panda_head_playful",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_PLAYFUL, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_PLAYFUL = BLOCKS.register("panda_wall_head_playful",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_PLAYFUL, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_PLAYFUL).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_WEAK = BLOCKS.register("panda_head_weak",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_WEAK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_WEAK = BLOCKS.register("panda_wall_head_weak",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_WEAK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_WEAK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PANDA_HEAD_BROWN = BLOCKS.register("panda_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PANDA_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PANDA_WALL_HEAD_BROWN = BLOCKS.register("panda_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PANDA_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PANDA_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

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

    public static final RegistryObject<Block> PHANTOM_HEAD = BLOCKS.register("phantom_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PHANTOM, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PHANTOM_WALL_HEAD = BLOCKS.register("phantom_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PHANTOM, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PHANTOM_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PIG_HEAD = BLOCKS.register("pig_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PIG, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PIG_WALL_HEAD = BLOCKS.register("pig_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PIG, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PIG_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PIGLIN_BRUTE_HEAD = BLOCKS.register("piglin_brute_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PIGLIN_BRUTE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PIGLIN_BRUTE_WALL_HEAD = BLOCKS.register("piglin_brute_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PIGLIN_BRUTE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PIGLIN_BRUTE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PILLAGER_HEAD = BLOCKS.register("pillager_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PILLAGER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PILLAGER_WALL_HEAD = BLOCKS.register("pillager_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PILLAGER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PILLAGER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> POLAR_BEAR_HEAD = BLOCKS.register("polar_bear_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.POLAR_BEAR, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> POLAR_BEAR_WALL_HEAD = BLOCKS.register("polar_bear_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.POLAR_BEAR, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(POLAR_BEAR_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> PUFFERFISH_HEAD = BLOCKS.register("pufferfish_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.PUFFERFISH, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> PUFFERFISH_WALL_HEAD = BLOCKS.register("pufferfish_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.PUFFERFISH, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(PUFFERFISH_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_BROWN = BLOCKS.register("rabbit_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_BROWN = BLOCKS.register("rabbit_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_WHITE = BLOCKS.register("rabbit_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_WHITE = BLOCKS.register("rabbit_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_BLACK = BLOCKS.register("rabbit_head_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_BLACK = BLOCKS.register("rabbit_wall_head_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_WHITE_SPLOTCHED = BLOCKS.register("rabbit_head_white_splotched",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_WHITE_SPLOTCHED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_WHITE_SPLOTCHED = BLOCKS.register("rabbit_wall_head_white_splotched",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_WHITE_SPLOTCHED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_WHITE_SPLOTCHED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_GOLD = BLOCKS.register("rabbit_head_gold",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_GOLD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_GOLD = BLOCKS.register("rabbit_wall_head_gold",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_GOLD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_GOLD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_SALT = BLOCKS.register("rabbit_head_salt",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_SALT, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_SALT = BLOCKS.register("rabbit_wall_head_salt",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_SALT, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_SALT).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_CAERBANNOG = BLOCKS.register("rabbit_head_caerbannog",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_CAERBANNOG, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_CAERBANNOG = BLOCKS.register("rabbit_wall_head_caerbannog",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_CAERBANNOG, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_CAERBANNOG).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RABBIT_HEAD_TOAST = BLOCKS.register("rabbit_head_toast",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RABBIT_TOAST, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RABBIT_WALL_HEAD_TOAST = BLOCKS.register("rabbit_wall_head_toast",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RABBIT_TOAST, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RABBIT_HEAD_TOAST).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> RAVAGER_HEAD = BLOCKS.register("ravager_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.RAVAGER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> RAVAGER_WALL_HEAD = BLOCKS.register("ravager_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.RAVAGER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(RAVAGER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SALMON_HEAD = BLOCKS.register("salmon_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SALMON, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SALMON_WALL_HEAD = BLOCKS.register("salmon_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SALMON, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SALMON_HEAD).pushReaction(PushReaction.DESTROY)));

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

    public static final RegistryObject<Block> SHULKER_HEAD = BLOCKS.register("shulker_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD = BLOCKS.register("shulker_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_WHITE = BLOCKS.register("shulker_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_WHITE = BLOCKS.register("shulker_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_ORANGE = BLOCKS.register("shulker_head_orange",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_ORANGE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_ORANGE = BLOCKS.register("shulker_wall_head_orange",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_ORANGE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_ORANGE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_MAGENTA = BLOCKS.register("shulker_head_magenta",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_MAGENTA, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_MAGENTA = BLOCKS.register("shulker_wall_head_magenta",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_MAGENTA, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_MAGENTA).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_LIGHT_BLUE = BLOCKS.register("shulker_head_light_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_LIGHT_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_LIGHT_BLUE = BLOCKS.register("shulker_wall_head_light_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_LIGHT_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_LIGHT_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_YELLOW = BLOCKS.register("shulker_head_yellow",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_YELLOW, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_YELLOW = BLOCKS.register("shulker_wall_head_yellow",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_YELLOW, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_YELLOW).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_LIME = BLOCKS.register("shulker_head_lime",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_LIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_LIME = BLOCKS.register("shulker_wall_head_lime",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_LIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_LIME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_PINK = BLOCKS.register("shulker_head_pink",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_PINK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_PINK = BLOCKS.register("shulker_wall_head_pink",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_PINK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_PINK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_GRAY = BLOCKS.register("shulker_head_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_GRAY = BLOCKS.register("shulker_wall_head_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_LIGHT_GRAY = BLOCKS.register("shulker_head_light_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_LIGHT_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_LIGHT_GRAY = BLOCKS.register("shulker_wall_head_light_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_LIGHT_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_LIGHT_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_CYAN = BLOCKS.register("shulker_head_cyan",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_CYAN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_CYAN = BLOCKS.register("shulker_wall_head_cyan",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_CYAN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_CYAN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_PURPLE = BLOCKS.register("shulker_head_purple",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_PURPLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_PURPLE = BLOCKS.register("shulker_wall_head_purple",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_PURPLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_PURPLE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_BLUE = BLOCKS.register("shulker_head_blue",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_BLUE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_BLUE = BLOCKS.register("shulker_wall_head_blue",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_BLUE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_BLUE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_BROWN = BLOCKS.register("shulker_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_BROWN = BLOCKS.register("shulker_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_GREEN = BLOCKS.register("shulker_head_green",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_GREEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_GREEN = BLOCKS.register("shulker_wall_head_green",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_GREEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_GREEN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_RED = BLOCKS.register("shulker_head_red",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_RED, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_RED = BLOCKS.register("shulker_wall_head_red",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_RED, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_RED).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SHULKER_HEAD_BLACK = BLOCKS.register("shulker_head_black",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SHULKER_BLACK, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SHULKER_WALL_HEAD_BLACK = BLOCKS.register("shulker_wall_head_black",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SHULKER_BLACK, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SHULKER_HEAD_BLACK).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SILVERFISH_HEAD = BLOCKS.register("silverfish_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SILVERFISH, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SILVERFISH_WALL_HEAD = BLOCKS.register("silverfish_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SILVERFISH, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SILVERFISH_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SLIME_HEAD = BLOCKS.register("slime_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SLIME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SLIME_WALL_HEAD = BLOCKS.register("slime_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SLIME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SLIME_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SNIFFER_HEAD = BLOCKS.register("sniffer_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SNIFFER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SNIFFER_WALL_HEAD = BLOCKS.register("sniffer_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SNIFFER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SNIFFER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SNOW_GOLEM_HEAD = BLOCKS.register("snow_golem_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SNOW_GOLEM, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SNOW_GOLEM_WALL_HEAD = BLOCKS.register("snow_golem_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SNOW_GOLEM, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SNOW_GOLEM_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SPIDER_HEAD = BLOCKS.register("spider_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SPIDER_WALL_HEAD = BLOCKS.register("spider_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SPIDER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> SQUID_HEAD = BLOCKS.register("squid_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SQUID, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SQUID_WALL_HEAD = BLOCKS.register("squid_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SQUID, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SQUID_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> STRAY_SKULL = BLOCKS.register("stray_skull",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.STRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> STRAY_WALL_SKULL = BLOCKS.register("stray_wall_skull",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.STRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(STRAY_SKULL).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> STRIDER_HEAD = BLOCKS.register("strider_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.STRIDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> STRIDER_WALL_HEAD = BLOCKS.register("strider_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.STRIDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(STRIDER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> STRIDER_HEAD_COLD = BLOCKS.register("strider_head_cold",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.STRIDER_COLD, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> STRIDER_WALL_HEAD_COLD = BLOCKS.register("strider_wall_head_cold",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.STRIDER_COLD, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(STRIDER_HEAD_COLD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TADPOLE_HEAD = BLOCKS.register("tadpole_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TADPOLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TADPOLE_WALL_HEAD = BLOCKS.register("tadpole_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TADPOLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TADPOLE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TRADER_LLAMA_HEAD_CREAMY = BLOCKS.register("trader_llama_head_creamy",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_CREAMY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TRADER_LLAMA_WALL_HEAD_CREAMY = BLOCKS.register("trader_llama_wall_head_creamy",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_CREAMY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TRADER_LLAMA_HEAD_CREAMY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TRADER_LLAMA_HEAD_WHITE = BLOCKS.register("trader_llama_head_white",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_WHITE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TRADER_LLAMA_WALL_HEAD_WHITE = BLOCKS.register("trader_llama_wall_head_white",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_WHITE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TRADER_LLAMA_HEAD_WHITE).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TRADER_LLAMA_HEAD_BROWN = BLOCKS.register("trader_llama_head_brown",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_BROWN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TRADER_LLAMA_WALL_HEAD_BROWN = BLOCKS.register("trader_llama_wall_head_brown",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_BROWN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TRADER_LLAMA_HEAD_BROWN).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TRADER_LLAMA_HEAD_GRAY = BLOCKS.register("trader_llama_head_gray",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_GRAY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TRADER_LLAMA_WALL_HEAD_GRAY = BLOCKS.register("trader_llama_wall_head_gray",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TRADER_LLAMA_GRAY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TRADER_LLAMA_HEAD_GRAY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TROPICAL_FISH_HEAD = BLOCKS.register("tropical_fish_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TROPICAL_FISH, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TROPICAL_FISH_WALL_HEAD = BLOCKS.register("tropical_fish_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TROPICAL_FISH, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TROPICAL_FISH_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> TURTLE_HEAD = BLOCKS.register("turtle_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.TURTLE, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> TURTLE_WALL_HEAD = BLOCKS.register("turtle_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.TURTLE, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(TURTLE_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> VEX_HEAD = BLOCKS.register("vex_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.VEX, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VEX_WALL_HEAD = BLOCKS.register("vex_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.VEX, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(VEX_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> VINDICATOR_HEAD = BLOCKS.register("vindicator_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.VINDICATOR, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> VINDICATOR_WALL_HEAD = BLOCKS.register("vindicator_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.VINDICATOR, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(VINDICATOR_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WANDERING_TRADER_HEAD = BLOCKS.register("wandering_trader_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WANDERING_TRADER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WANDERING_TRADER_WALL_HEAD = BLOCKS.register("wandering_trader_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WANDERING_TRADER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WANDERING_TRADER_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WARDEN_HEAD = BLOCKS.register("warden_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WARDEN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WARDEN_WALL_HEAD = BLOCKS.register("warden_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WARDEN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WARDEN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WITCH_HEAD = BLOCKS.register("witch_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WITCH, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WITCH_WALL_HEAD = BLOCKS.register("witch_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WITCH, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WITCH_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WOLF_HEAD = BLOCKS.register("wolf_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WOLF, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WOLF_WALL_HEAD = BLOCKS.register("wolf_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WOLF, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WOLF_HEAD).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WOLF_HEAD_TAME = BLOCKS.register("wolf_head_tame",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WOLF_TAME, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WOLF_WALL_HEAD_TAME = BLOCKS.register("wolf_wall_head_tame",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WOLF_TAME, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WOLF_HEAD_TAME).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> WOLF_HEAD_ANGRY = BLOCKS.register("wolf_head_angry",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.WOLF_ANGRY, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> WOLF_WALL_HEAD_ANGRY = BLOCKS.register("wolf_wall_head_angry",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.WOLF_ANGRY, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(WOLF_HEAD_ANGRY).pushReaction(PushReaction.DESTROY)));

    public static final RegistryObject<Block> ZOMBIFIED_PIGLIN_HEAD = BLOCKS.register("zombified_piglin_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.ZOMBIFIED_PIGLIN, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> ZOMBIFIED_PIGLIN_WALL_HEAD = BLOCKS.register("zombified_piglin_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.ZOMBIFIED_PIGLIN, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(ZOMBIFIED_PIGLIN_HEAD).pushReaction(PushReaction.DESTROY)));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
