package net.risttahukas.moremobheads.effect.headeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;

public class HydrophobicHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.hydrophobic").withStyle(ChatFormatting.BLUE);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.hydrophobic.desc").withStyle(ChatFormatting.BLUE);
    }
}
