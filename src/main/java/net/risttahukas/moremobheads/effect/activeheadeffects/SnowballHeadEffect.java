package net.risttahukas.moremobheads.effect.activeheadeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;

public class SnowballHeadEffect extends AbstractActiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("active_head_effects.moremobheads.snowball").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public int getCooldown() {
        return 1;
    }
}
