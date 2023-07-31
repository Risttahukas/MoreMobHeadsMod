package net.risttahukas.moremobheads.effect.headeffects;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;

public class SlowFallingHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.slow_falling").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.slow_falling.desc").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public ImmutableList<Pair<MobEffect, Integer>> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_SLOW_FALLING_EFFECT.get()) {
            return ImmutableList.of(Pair.of(MobEffects.SLOW_FALLING, 0));
        }
        return ImmutableList.of();
    }
}
