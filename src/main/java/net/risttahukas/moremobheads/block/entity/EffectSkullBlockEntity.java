package net.risttahukas.moremobheads.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.risttahukas.moremobheads.block.ModBlocks;
import org.jetbrains.annotations.NotNull;

public class EffectSkullBlockEntity extends SkullBlockEntity {
    private int animationTickCount;
    private boolean isAnimating;

    public EffectSkullBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return ModBlockEntities.EFFECT_SKULL.get();
    }

    public static void animation(Level level, BlockPos blockPos, BlockState blockState, EffectSkullBlockEntity effectSkullBlockEntity) {
        if (level.hasNeighborSignal(blockPos) ||
                blockState.is(ModBlocks.SHEEP_HEAD_RAINBOW.get()) || blockState.is(ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get()) ||
                blockState.is(ModBlocks.CREEPER_HEAD_CHARGED.get()) || blockState.is(ModBlocks.CREEPER_WALL_HEAD_CHARGED.get())) {
            effectSkullBlockEntity.isAnimating = true;
            ++effectSkullBlockEntity.animationTickCount;
        } else {
            effectSkullBlockEntity.isAnimating = false;
        }

    }

    public float getAnimation(float p_262053_) {
        return this.isAnimating ? (float)this.animationTickCount + p_262053_ : (float)this.animationTickCount;
    }
}
