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

public class DecayingHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.decaying").withStyle(ChatFormatting.RED);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.decaying.desc").withStyle(ChatFormatting.RED);
    }

    @Override
    public ImmutableList<Pair<MobEffect, Integer>> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_DECAYING_EFFECT.get()) {
            return ImmutableList.of(Pair.of(MobEffects.DAMAGE_RESISTANCE, -2));
        }
        return ImmutableList.of();
    }
}
