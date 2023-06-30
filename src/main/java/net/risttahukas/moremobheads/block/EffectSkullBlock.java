package net.risttahukas.moremobheads.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.risttahukas.moremobheads.block.entity.EffectSkullBlockEntity;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import org.jetbrains.annotations.NotNull;

public class EffectSkullBlock extends SkullBlock {
    protected static final VoxelShape ALLAY_SHAPE =
            Block.box(5.5D, 0.0D, 5.5D, 10.5D, 5.0D, 10.5D);
    protected static final VoxelShape AXOLOTL_SHAPE =
            Block.box(5.0D, 0.0D, 5.0D, 11.0D, 5.0D, 11.0D);
    protected static final VoxelShape BAT_SHAPE =
            Block.box(6.95D, 0.0D, 6.95D, 9.05D, 2.1D, 9.05D);
    protected static final VoxelShape CAMEL_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 14.0D, 11.5D);
    protected static final VoxelShape CAT_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 3.2D, 10.0D);
    protected static final VoxelShape CAVE_SPIDER_SHAPE =
            Block.box(5.2D, 0.0D, 5.2D, 10.8D, 5.6D, 10.8D);
    protected static final VoxelShape CHICKEN_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    protected static final VoxelShape DOLPHIN_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 7.0D, 12.0D);
    protected static final VoxelShape DONKEY_SHAPE =
            Block.box(4.955D, 0.0D, 4.955D, 11.045D, 9.57D, 11.045D);
    protected static final VoxelShape HORSE_SHAPE =
            Block.box(4.15D, 0.0D, 4.15D, 11.85D, 12.1D, 11.85D);
    protected static final VoxelShape HUSK_SHAPE =
            Block.box(3.75D, 0.0D, 3.75D, 12.25D, 8.5D, 12.25D);
    protected static final VoxelShape MULE_SHAPE =
            Block.box(4.78D, 0.0D, 4.78D, 11.22D, 10.12D, 11.22D);
    protected static final VoxelShape OCELOT_SHAPE =
            Block.box(5.5D, 0.0D, 5.5D, 10.5D, 4.0D, 10.5D);
    protected static final VoxelShape PANDA_SHAPE =
            Block.box(2.5D, 0.0D, 2.5D, 13.5D, 10.0D, 13.5D);
    protected static final VoxelShape PARROT_SHAPE =
            Block.box(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D);
    protected static final VoxelShape POLAR_BEAR_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 7.0D, 11.5D);
    protected static final VoxelShape RAVAGER_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 10.75D, 12.0D);
    protected static final VoxelShape SHEEP_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 6.0D, 12.0D);
    protected static final VoxelShape UNDEAD_HORSE_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 11.0D, 11.5D);
    protected static final VoxelShape VILLAGER_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 10.0D, 12.0D);


    public EffectSkullBlock(Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter,
                                        @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        if (Types.ALLAY.equals(this.getType()) || Types.VEX.equals(this.getType())) {
            return ALLAY_SHAPE;
        } if (Types.AXOLOTL_LUCY.equals(this.getType()) || Types.AXOLOTL_WILD.equals(this.getType()) ||
                Types.AXOLOTL_GOLD.equals(this.getType()) || Types.AXOLOTL_CYAN.equals(this.getType()) ||
                Types.AXOLOTL_BLUE.equals(this.getType())) {
            return AXOLOTL_SHAPE;
        } if (Types.BAT.equals(this.getType())) {
            return BAT_SHAPE;
        } if (Types.CAMEL.equals(this.getType())) {
            return CAMEL_SHAPE;
        } if (Types.CAT_TABBY.equals(this.getType()) || Types.CAT_BLACK.equals(this.getType()) ||
                Types.CAT_RED.equals(this.getType()) || Types.CAT_SIAMESE.equals(this.getType()) ||
                Types.CAT_BRITISH_SHORTHAIR.equals(this.getType()) || Types.CAT_CALICO.equals(this.getType()) ||
                Types.CAT_PERSIAN.equals(this.getType()) || Types.CAT_RAGDOLL.equals(this.getType()) ||
                Types.CAT_WHITE.equals(this.getType()) || Types.CAT_JELLIE.equals(this.getType()) ||
                Types.CAT_ALL_BLACK.equals(this.getType())) {
            return CAT_SHAPE;
        } if (Types.CAVE_SPIDER.equals(this.getType())) {
            return CAVE_SPIDER_SHAPE;
        } if (Types.CHICKEN.equals(this.getType())) {
            return CHICKEN_SHAPE;
        } if (Types.DOLPHIN.equals(this.getType())) {
            return DOLPHIN_SHAPE;
        } if (Types.DONKEY.equals(this.getType())) {
            return DONKEY_SHAPE;
        } if (Types.HORSE_WHITE.equals(this.getType()) || Types.HORSE_CREAMY.equals(this.getType()) ||
                Types.HORSE_CHESTNUT.equals(this.getType()) || Types.HORSE_BROWN.equals(this.getType()) ||
                Types.HORSE_BLACK.equals(this.getType()) || Types.HORSE_GRAY.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE.equals(this.getType()) || Types.HORSE_CREAMY_WHITE.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE.equals(this.getType()) || Types.HORSE_BROWN_WHITE.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE.equals(this.getType()) || Types.HORSE_GRAY_WHITE.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE_FIELD.equals(this.getType()) || Types.HORSE_CREAMY_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE_FIELD.equals(this.getType()) || Types.HORSE_BROWN_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE_FIELD.equals(this.getType()) || Types.HORSE_GRAY_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE_DOTS.equals(this.getType()) || Types.HORSE_CREAMY_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE_DOTS.equals(this.getType()) || Types.HORSE_BROWN_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE_DOTS.equals(this.getType()) || Types.HORSE_GRAY_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_WHITE_BLACK_DOTS.equals(this.getType()) || Types.HORSE_CREAMY_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_BLACK_DOTS.equals(this.getType()) || Types.HORSE_BROWN_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_BLACK_BLACK_DOTS.equals(this.getType()) || Types.HORSE_GRAY_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_BLACK_DOTS.equals(this.getType())) {
            return HORSE_SHAPE;
        } if (Types.HORSE_ZOMBIE.equals(this.getType()) || Types.HORSE_SKELETON.equals(this.getType())) {
            return UNDEAD_HORSE_SHAPE;
        } if (Types.HUSK.equals(this.getType())) {
            return HUSK_SHAPE;
        } if (Types.MULE.equals(this.getType())) {
            return MULE_SHAPE;
        } if (Types.OCELOT.equals(this.getType())) {
            return OCELOT_SHAPE;
        } if (Types.PANDA.equals(this.getType()) || Types.PANDA_AGGRESSIVE.equals(this.getType()) ||
                Types.PANDA_LAZY.equals(this.getType()) || Types.PANDA_WORRIED.equals(this.getType()) ||
                Types.PANDA_PLAYFUL.equals(this.getType()) || Types.PANDA_WEAK.equals(this.getType()) ||
                Types.PANDA_BROWN.equals(this.getType())) {
            return PANDA_SHAPE;
        } if (Types.PARROT_RED_BLUE.equals(this.getType()) || Types.PARROT_BLUE.equals(this.getType()) ||
                Types.PARROT_GREEN.equals(this.getType()) || Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                Types.PARROT_GREY.equals(this.getType())) {
            return PARROT_SHAPE;
        } if (Types.POLAR_BEAR.equals(this.getType())) {
            return POLAR_BEAR_SHAPE;
        } if (Types.SHEEP_WHITE.equals(this.getType()) || Types.SHEEP_ORANGE.equals(this.getType()) ||
                Types.SHEEP_MAGENTA.equals(this.getType()) || Types.SHEEP_LIGHT_BLUE.equals(this.getType()) ||
                Types.SHEEP_YELLOW.equals(this.getType()) || Types.SHEEP_LIME.equals(this.getType()) ||
                Types.SHEEP_PINK.equals(this.getType()) || Types.SHEEP_GRAY.equals(this.getType()) ||
                Types.SHEEP_LIGHT_GRAY.equals(this.getType()) || Types.SHEEP_CYAN.equals(this.getType()) ||
                Types.SHEEP_PURPLE.equals(this.getType()) || Types.SHEEP_BLUE.equals(this.getType()) ||
                Types.SHEEP_BROWN.equals(this.getType()) || Types.SHEEP_GREEN.equals(this.getType()) ||
                Types.SHEEP_RED.equals(this.getType()) || Types.SHEEP_BLACK.equals(this.getType()) ||
                Types.SHEEP_RAINBOW.equals(this.getType())) {
            return SHEEP_SHAPE;
        } if (Types.IRON_GOLEM.equals(this.getType()) || Types.WITCH.equals(this.getType()) ||
                Types.EVOKER.equals(this.getType()) || Types.ILLUSIONER.equals(this.getType()) ||
                Types.PILLAGER.equals(this.getType()) || Types.VINDICATOR.equals(this.getType())) {
            return VILLAGER_SHAPE;
        } if (Types.RAVAGER.equals(this.getType())) {
            return RAVAGER_SHAPE;
        }
        return SHAPE;
    }

    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new EffectSkullBlockEntity(blockPos, blockState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState blockState,
                                                                  @NotNull BlockEntityType<T> tBlockEntityType) {
        if (level.isClientSide) {
            boolean flag = blockState.is(ModBlocks.WITCH_HEAD.get()) || blockState.is(ModBlocks.GHAST_HEAD.get()) ||
                    blockState.is(ModBlocks.SHEEP_HEAD_RAINBOW.get()) || blockState.is(ModBlocks.CAMEL_HEAD.get()) ||
                    blockState.is(ModBlocks.CREEPER_HEAD_CHARGED.get()) || blockState.is(ModBlocks.PUFFERFISH_HEAD.get()) ||
                    blockState.is(ModBlocks.ENDERMAN_HEAD.get()) || blockState.is(ModBlocks.WARDEN_HEAD.get());
            if (flag) {
                return createTickerHelper(tBlockEntityType, ModBlockEntities.EFFECT_SKULL.get(),
                        EffectSkullBlockEntity::animation);
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    public enum Types implements SkullBlock.Type {
        ALLAY,
        AXOLOTL_LUCY,
        AXOLOTL_WILD,
        AXOLOTL_GOLD,
        AXOLOTL_CYAN,
        AXOLOTL_BLUE,
        BAT,
        BLAZE,
        BEE,
        CAMEL,
        CAT_TABBY,
        CAT_BLACK,
        CAT_RED,
        CAT_SIAMESE,
        CAT_BRITISH_SHORTHAIR,
        CAT_CALICO,
        CAT_PERSIAN,
        CAT_RAGDOLL,
        CAT_WHITE,
        CAT_JELLIE,
        CAT_ALL_BLACK,
        CAVE_SPIDER,
        CHICKEN,
        COW,
        CREEPER_CHARGED,
        DOLPHIN,
        DONKEY,
        DROWNED,
        ENDERMAN,
        EVOKER,
        GHAST,
        HORSE_WHITE,
        HORSE_CREAMY,
        HORSE_CHESTNUT,
        HORSE_BROWN,
        HORSE_BLACK,
        HORSE_GRAY,
        HORSE_DARK_BROWN,
        HORSE_WHITE_WHITE,
        HORSE_CREAMY_WHITE,
        HORSE_CHESTNUT_WHITE,
        HORSE_BROWN_WHITE,
        HORSE_BLACK_WHITE,
        HORSE_GRAY_WHITE,
        HORSE_DARK_BROWN_WHITE,
        HORSE_WHITE_WHITE_FIELD,
        HORSE_CREAMY_WHITE_FIELD,
        HORSE_CHESTNUT_WHITE_FIELD,
        HORSE_BROWN_WHITE_FIELD,
        HORSE_BLACK_WHITE_FIELD,
        HORSE_GRAY_WHITE_FIELD,
        HORSE_DARK_BROWN_WHITE_FIELD,
        HORSE_WHITE_WHITE_DOTS,
        HORSE_CREAMY_WHITE_DOTS,
        HORSE_CHESTNUT_WHITE_DOTS,
        HORSE_BROWN_WHITE_DOTS,
        HORSE_BLACK_WHITE_DOTS,
        HORSE_GRAY_WHITE_DOTS,
        HORSE_DARK_BROWN_WHITE_DOTS,
        HORSE_WHITE_BLACK_DOTS,
        HORSE_CREAMY_BLACK_DOTS,
        HORSE_CHESTNUT_BLACK_DOTS,
        HORSE_BROWN_BLACK_DOTS,
        HORSE_BLACK_BLACK_DOTS,
        HORSE_GRAY_BLACK_DOTS,
        HORSE_DARK_BROWN_BLACK_DOTS,
        HORSE_ZOMBIE,
        HORSE_SKELETON,
        HUSK,
        ILLUSIONER,
        IRON_GOLEM,
        MAGMA_CUBE,
        MOOSHROOM_RED,
        MOOSHROOM_BROWN,
        MULE,
        OCELOT,
        PANDA,
        PANDA_AGGRESSIVE,
        PANDA_LAZY,
        PANDA_WORRIED,
        PANDA_PLAYFUL,
        PANDA_WEAK,
        PANDA_BROWN,
        PARROT_RED_BLUE,
        PARROT_BLUE,
        PARROT_GREEN,
        PARROT_YELLOW_BLUE,
        PARROT_GREY,
        PILLAGER,
        POLAR_BEAR,
        PUFFERFISH,
        RAVAGER,
        SHEEP_WHITE,
        SHEEP_ORANGE,
        SHEEP_MAGENTA,
        SHEEP_LIGHT_BLUE,
        SHEEP_YELLOW,
        SHEEP_LIME,
        SHEEP_PINK,
        SHEEP_GRAY,
        SHEEP_LIGHT_GRAY,
        SHEEP_CYAN,
        SHEEP_PURPLE,
        SHEEP_BLUE,
        SHEEP_BROWN,
        SHEEP_GREEN,
        SHEEP_RED,
        SHEEP_BLACK,
        SHEEP_RAINBOW,
        SLIME,
        SPIDER,
        STRAY,
        VEX,
        VINDICATOR,
        WARDEN,
        WITCH
    }
}
