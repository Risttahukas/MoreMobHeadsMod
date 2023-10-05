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

public class BlindnessHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.blindness").withStyle(ChatFormatting.GRAY);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.blindness.desc").withStyle(ChatFormatting.GRAY);
    }

    @Override
    public ImmutableList<Pair<MobEffect, Pair<Integer, Integer>>> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_BLINDNESS_EFFECT.get()) {
            return ImmutableList.of(Pair.of(MobEffects.BLINDNESS, Pair.of(0, 30)));
        }
        return ImmutableList.of();
    }
}
