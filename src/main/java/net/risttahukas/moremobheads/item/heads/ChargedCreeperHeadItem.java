package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;

public class ChargedCreeperHeadItem extends CreeperHeadItem {
    public ChargedCreeperHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public ImmutableList<AbstractPassiveHeadEffect> getPassiveHeadEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_PASSIVE_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_CREEPER_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.VOLATILE_GUTS_CHARGED);
        }
        return ImmutableList.of();
    }
}
