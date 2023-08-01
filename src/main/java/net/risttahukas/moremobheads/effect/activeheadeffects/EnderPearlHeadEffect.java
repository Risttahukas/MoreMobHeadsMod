package net.risttahukas.moremobheads.effect.activeheadeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;

public class EnderPearlHeadEffect extends AbstractActiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("active_head_effects.moremobheads.ender_pearl").withStyle(ChatFormatting.DARK_PURPLE);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("active_head_effects.moremobheads.ender_pearl.desc").withStyle(ChatFormatting.DARK_PURPLE);
    }

    @Override
    public int getCooldown() {
        return 10;
    }
}
