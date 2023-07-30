package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;

public class TraderLlamaHeadItem extends LlamaHeadItem {
    public TraderLlamaHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public AbstractActiveHeadEffect getActiveHeadEffect() {
        return HeadEffects.TRADER_SPIT;
    }
}
