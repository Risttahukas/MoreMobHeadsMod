package net.risttahukas.moremobheads.effect.headeffects;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;

public class FreezeImmuneHeadEffect extends AbstractPassiveHeadEffect {

    @Override
    public MutableComponent getName() {
        return Component.translatable("head_effects.moremobheads.freeze_immune").withStyle(ChatFormatting.WHITE);
    }

    @Override
    public MutableComponent getDesc() {
        return Component.translatable("head_effects.moremobheads.freeze_immune.desc").withStyle(ChatFormatting.WHITE);
    }
}
