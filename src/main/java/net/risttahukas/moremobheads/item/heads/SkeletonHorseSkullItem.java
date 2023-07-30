package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.sound.ModSoundEvents;

public class SkeletonHorseSkullItem extends HorseHeadItem {
    public SkeletonHorseSkullItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public SoundEvent getSound() {
        return ModSoundEvents.NOTE_BLOCK_IMITATE_HORSE_SKELETON.get();
    }

    @Override
    public ImmutableList<AbstractPassiveHeadEffect> getPassiveHeadEffects() {
        return ImmutableList.of(HeadEffects.UNDEAD);
    }
}
