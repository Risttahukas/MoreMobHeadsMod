package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.effect.MobEffect;

public abstract class AbstractPassiveHeadEffect {
    public abstract MutableComponent getName();

    public abstract MutableComponent getDesc();

    public ImmutableList<Pair<MobEffect, Pair<Integer, Integer>>> getPassivePotionEffects() {
        return ImmutableList.of();
    }
}
