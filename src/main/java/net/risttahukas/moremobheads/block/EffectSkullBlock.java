package net.risttahukas.moremobheads.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.risttahukas.moremobheads.block.entity.EffectSkullBlockEntity;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import org.jetbrains.annotations.NotNull;

public class EffectSkullBlock extends SkullBlock {
    protected static final VoxelShape CAVE_SPIDER_SHAPE =
            Block.box(5.2D, 0.0D, 5.2D, 10.8D, 5.6D, 10.8D);
    protected static final VoxelShape CHICKEN_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    protected static final VoxelShape PARROT_SHAPE =
            Block.box(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D);

    public EffectSkullBlock(Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter,
                                        @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        if (Types.CAVE_SPIDER.equals(this.getType())) {
            return CAVE_SPIDER_SHAPE;
        } if (Types.CHICKEN.equals(this.getType())) {
            return CHICKEN_SHAPE;
        } if (Types.PARROT_RED_BLUE.equals(this.getType()) || Types.PARROT_BLUE.equals(this.getType()) ||
                Types.PARROT_GREEN.equals(this.getType()) || Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                Types.PARROT_GREY.equals(this.getType())) {
            return PARROT_SHAPE;
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
            boolean flag = blockState.is(ModBlocks.WITCH_HEAD.get()) || blockState.is(ModBlocks.GHAST_HEAD.get());
            if (flag) {
                return createTickerHelper(tBlockEntityType, ModBlockEntities.EFFECT_SKULL.get(),
                        EffectSkullBlockEntity::animation);
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    public enum Types implements SkullBlock.Type {
        CAVE_SPIDER,
        CHICKEN,
        GHAST,
        SPIDER,
        WITCH,
        PARROT_RED_BLUE,
        PARROT_BLUE,
        PARROT_GREEN,
        PARROT_YELLOW_BLUE,
        PARROT_GREY
    }
}
