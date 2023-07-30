package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModHeadEffectHelper {
    public static ImmutableList<AbstractPassiveHeadEffect> getPassiveEffectsFromHead(Item headItem) {
        if (headItem == Items.SKELETON_SKULL) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC);
        } else if (headItem == Items.WITHER_SKELETON_SKULL) {
            return ImmutableList.of();
        } else if (headItem == Items.ZOMBIE_HEAD) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC);
        } else if (headItem == Items.CREEPER_HEAD) {
            return ImmutableList.of();
        } else if (headItem == Items.DRAGON_HEAD) {
            return ImmutableList.of();
        } else if (headItem == Items.PIGLIN_HEAD) {
            return ImmutableList.of();
        }
        return ImmutableList.of();
    }
}
