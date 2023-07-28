package net.risttahukas.moremobheads.effect.headeffects;

import com.google.common.collect.ImmutableList;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.risttahukas.moremobheads.effect.AbstractHeadEffect;

public class AmphibianHeadEffect extends AbstractHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.amphibian").withStyle(ChatFormatting.DARK_AQUA);
    }

    @Override
    public ImmutableList<MobEffect> getPassivePotionEffects() {
        return ImmutableList.of(MobEffects.WATER_BREATHING);
    }
}
