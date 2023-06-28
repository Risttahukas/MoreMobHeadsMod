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
    protected static final VoxelShape HUSK_SHAPE =
            Block.box(3.75D, 0.0D, 3.75D, 12.25D, 8.5D, 12.25D);
    protected static final VoxelShape OCELOT_SHAPE =
            Block.box(5.5D, 0.0D, 5.5D, 10.5D, 4.0D, 10.5D);
    protected static final VoxelShape PARROT_SHAPE =
            Block.box(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D);
    protected static final VoxelShape SHEEP_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 6.0D, 12.0D);

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
        } if (Types.HUSK.equals(this.getType())) {
            return HUSK_SHAPE;
        } if (Types.OCELOT.equals(this.getType())) {
            return OCELOT_SHAPE;
        } if (Types.PARROT_RED_BLUE.equals(this.getType()) || Types.PARROT_BLUE.equals(this.getType()) ||
                Types.PARROT_GREEN.equals(this.getType()) || Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                Types.PARROT_GREY.equals(this.getType())) {
            return PARROT_SHAPE;
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
                    blockState.is(ModBlocks.CREEPER_HEAD_CHARGED.get());
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
        DROWNED,
        GHAST,
        HUSK,
        MOOSHROOM_RED,
        MOOSHROOM_BROWN,
        OCELOT,
        PARROT_RED_BLUE,
        PARROT_BLUE,
        PARROT_GREEN,
        PARROT_YELLOW_BLUE,
        PARROT_GREY,
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
        SPIDER,
        STRAY,
        VEX,
        WITCH
    }
}
