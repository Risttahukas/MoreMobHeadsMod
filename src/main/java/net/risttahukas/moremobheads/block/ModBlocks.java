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

    public static final RegistryObject<Block> SPIDER_HEAD = BLOCKS.register("spider_head",
            () -> new EffectSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of()
                    .instrument(NoteBlockInstrument.SKELETON).strength(1.0F).pushReaction(PushReaction.DESTROY)));
    public static final RegistryObject<Block> SPIDER_WALL_HEAD = BLOCKS.register("spider_wall_head",
            () -> new EffectWallSkullBlock(EffectSkullBlock.Types.SPIDER, BlockBehaviour.Properties.of().strength(1.0F)
                    .lootFrom(SPIDER_HEAD).pushReaction(PushReaction.DESTROY)));

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
