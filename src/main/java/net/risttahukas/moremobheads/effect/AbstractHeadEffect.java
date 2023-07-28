package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;

public abstract class AbstractHeadEffect {
    public abstract MutableComponent getName();

    public ImmutableList<MobEffect> getPassivePotionEffects() {
        return ImmutableList.of();
    }
}
