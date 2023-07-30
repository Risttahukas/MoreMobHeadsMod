package net.risttahukas.moremobheads.effect;

import net.minecraft.network.chat.MutableComponent;

public abstract class AbstractActiveHeadEffect {
    public abstract MutableComponent getName();

    public abstract MutableComponent getDesc();

    public abstract int getCooldown();
}
