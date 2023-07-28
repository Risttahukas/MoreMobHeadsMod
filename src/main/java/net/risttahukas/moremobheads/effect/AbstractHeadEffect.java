package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;

public abstract class AbstractHeadEffect {
    private static final ImmutableList<MobEffect> PASSIVE_POTION_EFFECTS = ImmutableList.of();

    public abstract MutableComponent getName();

    public ImmutableList<MobEffect> getPassivePotionEffects() {
        return PASSIVE_POTION_EFFECTS;
    }
}
