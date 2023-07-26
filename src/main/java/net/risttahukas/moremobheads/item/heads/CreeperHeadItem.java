package net.risttahukas.moremobheads.item.heads;

import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.item.EffectSkullItem;

public class CreeperHeadItem extends EffectSkullItem {
    public CreeperHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public SoundEvent getSound() {
        return SoundEvents.NOTE_BLOCK_IMITATE_CREEPER.get();
    }
}
