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

public class HeavyDutyHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.heavy_duty").withStyle(ChatFormatting.GRAY);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.heavy_duty.desc").withStyle(ChatFormatting.GRAY);
    }

    @Override
    public ImmutableList<Pair<MobEffect, Pair<Integer, Integer>>> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_HEAVY_DUTY_EFFECT.get()) {
            return ImmutableList.of(Pair.of(MobEffects.DAMAGE_RESISTANCE, Pair.of(1, 2)),
                    Pair.of(MobEffects.MOVEMENT_SLOWDOWN, Pair.of(0, 2)));
        }
        return ImmutableList.of();
    }
}
