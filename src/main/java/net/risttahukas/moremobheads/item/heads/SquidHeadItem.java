package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.sound.ModSoundEvents;

public class SquidHeadItem extends EffectSkullItem {
    public SquidHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public SoundEvent getSound() {
        return ModSoundEvents.NOTE_BLOCK_IMITATE_SQUID.get();
    }

    @Override
    public ImmutableList<AbstractPassiveHeadEffect> getPassiveHeadEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_PASSIVE_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_SQUID_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.HYDROPHILIC);
        }
        return ImmutableList.of();
    }
}
