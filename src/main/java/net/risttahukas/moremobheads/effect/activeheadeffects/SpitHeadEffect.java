package net.risttahukas.moremobheads.effect.activeheadeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;

public class SpitHeadEffect extends AbstractActiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("active_head_effects.moremobheads.spit").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("active_head_effects.moremobheads.spit.desc").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public int getCooldown() {
        return 5;
    }
}
