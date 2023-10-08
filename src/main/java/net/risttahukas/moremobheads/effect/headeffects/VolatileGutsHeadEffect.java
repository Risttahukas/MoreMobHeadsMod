package net.risttahukas.moremobheads.effect.headeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;

public class VolatileGutsHeadEffect extends AbstractPassiveHeadEffect {

    private final int explosionPower;

    public VolatileGutsHeadEffect(int explosionPower) {
        this.explosionPower = explosionPower;
    }

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.volatile_guts").withStyle(ChatFormatting.GOLD);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.volatile_guts.desc").withStyle(ChatFormatting.GOLD);
    }

    public int getExplosionPower() {
        return this.explosionPower;
    }
}
