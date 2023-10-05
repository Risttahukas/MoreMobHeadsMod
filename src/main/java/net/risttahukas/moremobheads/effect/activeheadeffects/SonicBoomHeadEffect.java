package net.risttahukas.moremobheads.effect.activeheadeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;

public class SonicBoomHeadEffect extends AbstractActiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("active_head_effects.moremobheads.sonic_boom").withStyle(ChatFormatting.DARK_AQUA);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("active_head_effects.moremobheads.sonic_boom.desc").withStyle(ChatFormatting.DARK_AQUA);
    }

    @Override
    public int getCooldown() {
        return 100;
    }
}
