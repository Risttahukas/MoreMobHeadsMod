package net.risttahukas.moremobheads.effect.activeheadeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;

public class EatGrassHeadEffect extends AbstractActiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("active_head_effects.moremobheads.eat_grass").withStyle(ChatFormatting.DARK_GREEN);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("active_head_effects.moremobheads.eat_grass.desc").withStyle(ChatFormatting.DARK_GREEN);
    }

    @Override
    public int getCooldown() {
        return 40;
    }
}
