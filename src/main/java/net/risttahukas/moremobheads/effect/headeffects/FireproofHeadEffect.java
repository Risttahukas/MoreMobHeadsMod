package net.risttahukas.moremobheads.effect.headeffects;

import com.google.common.collect.ImmutableList;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.risttahukas.moremobheads.effect.AbstractHeadEffect;

public class FireproofHeadEffect extends AbstractHeadEffect {
    private static final ImmutableList<MobEffect> PASSIVE_POTION_EFFECTS = ImmutableList.of(MobEffects.FIRE_RESISTANCE);

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.fireproof").withStyle(ChatFormatting.GOLD);
    }

    @Override
    public ImmutableList<MobEffect> getPassivePotionEffects() {
        return PASSIVE_POTION_EFFECTS;
    }
}
