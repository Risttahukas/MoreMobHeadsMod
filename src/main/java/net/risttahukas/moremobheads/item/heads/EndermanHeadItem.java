package net.risttahukas.moremobheads.item.heads;

import com.google.common.collect.ImmutableList;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.monster.EnderMan;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.sound.ModSoundEvents;

public class EndermanHeadItem extends EffectSkullItem {
    public EndermanHeadItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public SoundEvent getSound() {
        return ModSoundEvents.NOTE_BLOCK_IMITATE_ENDERMAN.get();
    }

    @Override
    public ImmutableList<AbstractPassiveHeadEffect> getPassiveHeadEffects() {
        if (MoreMobHeadsModCommonConfigs.ENABLE_PASSIVE_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_ENDERMAN_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.ENDERIC, HeadEffects.HYDROPHOBIC);
        }
        return ImmutableList.of();
    }

    @Override
    public boolean isEnderMask(ItemStack stack, Player player, EnderMan endermanEntity) {
        return MoreMobHeadsModCommonConfigs.ENABLE_ENDERMAN_HEAD_EFFECTS.get() && MoreMobHeadsModCommonConfigs.ENABLE_ENDERIC_EFFECT.get();
    }
}
