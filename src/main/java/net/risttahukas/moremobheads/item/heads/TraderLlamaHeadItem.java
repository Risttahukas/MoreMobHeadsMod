package net.risttahukas.moremobheads.item.heads;

import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;

public class TraderLlamaHeadItem extends LlamaHeadItem {
    public TraderLlamaHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public AbstractActiveHeadEffect getActiveHeadEffect() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_ACTIVE_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_TRADER_LLAMA_HEAD_EFFECTS.get()) {
            return HeadEffects.TRADER_SPIT;
        }
        return null;
    }
}
