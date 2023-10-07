package net.risttahukas.moremobheads.item.heads;

import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.sound.ModSoundEvents;

public class SheepHeadItem extends EffectSkullItem {
    public SheepHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public SoundEvent getSound() {
        return ModSoundEvents.NOTE_BLOCK_IMITATE_SHEEP.get();
    }

    @Override
    public AbstractActiveHeadEffect getActiveHeadEffect() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_ACTIVE_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_SHEEP_HEAD_EFFECTS.get()) {
            return HeadEffects.EAT_GRASS;
        }
        return null;
    }
}
