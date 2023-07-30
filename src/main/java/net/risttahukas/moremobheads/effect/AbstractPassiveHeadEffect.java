package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;

public abstract class AbstractPassiveHeadEffect {
    public abstract MutableComponent getName();

    public abstract MutableComponent getDesc();

    public ImmutableList<MobEffect> getPassivePotionEffects() {
        return ImmutableList.of();
    }
}
