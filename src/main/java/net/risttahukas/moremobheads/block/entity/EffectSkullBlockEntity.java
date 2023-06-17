package net.risttahukas.moremobheads.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;

public class EffectSkullBlockEntity extends SkullBlockEntity {

    public EffectSkullBlockEntity(BlockPos blockPos, BlockState blockState) {
        super(blockPos, blockState);
    }

    @Override
    public @NotNull BlockEntityType<?> getType() {
        return ModBlockEntities.EFFECT_SKULL.get();
    }
}
