package net.risttahukas.moremobheads.effect.headeffects;

import com.google.common.collect.ImmutableList;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;

public class FireproofHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.fireproof").withStyle(ChatFormatting.GOLD);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.fireproof.desc").withStyle(ChatFormatting.GOLD);
    }

    @Override
    public ImmutableList<MobEffect> getPassivePotionEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_FIREPROOF_EFFECT.get()) {
            return ImmutableList.of(MobEffects.FIRE_RESISTANCE);
        }
        return ImmutableList.of();
    }
}
