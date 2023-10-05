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

public class AmphibianHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.amphibian").withStyle(ChatFormatting.DARK_AQUA);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.amphibian.desc").withStyle(ChatFormatting.DARK_AQUA);
    }

    @Override
    public ImmutableList<Pair<MobEffect, Pair<Integer, Integer>>> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_AMPHIBIAN_EFFECT.get()) {
            return ImmutableList.of(Pair.of(MobEffects.WATER_BREATHING, Pair.of(0, 2)));
        }
        return ImmutableList.of();
    }
}
