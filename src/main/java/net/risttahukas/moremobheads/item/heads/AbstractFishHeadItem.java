package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.item.EffectSkullItem;

public abstract class AbstractFishHeadItem extends EffectSkullItem {
    public AbstractFishHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    public ImmutableList<AbstractPassiveHeadEffect> getPassiveHeadEffects() {
        return ImmutableList.of(HeadEffects.HYDROPHILIC);
    }
}
