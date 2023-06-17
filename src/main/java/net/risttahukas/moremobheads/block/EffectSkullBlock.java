package net.risttahukas.moremobheads.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.risttahukas.moremobheads.block.entity.EffectSkullBlockEntity;
import org.jetbrains.annotations.NotNull;

public class EffectSkullBlock extends SkullBlock {
    public EffectSkullBlock(Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new EffectSkullBlockEntity(blockPos, blockState);
    }


    public enum Types implements SkullBlock.Type {
        CHICKEN,
        SPIDER
    }
}
