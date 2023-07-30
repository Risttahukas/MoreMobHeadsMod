package net.risttahukas.moremobheads.effect;

import com.google.common.collect.ImmutableList;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import org.jetbrains.annotations.Nullable;

public class ModHeadEffectHelper {
    public static ImmutableList<AbstractPassiveHeadEffect> getPassiveEffectsFromHead(Item headItem) {
        if (!MoreMobHeadsModCommonConfigs.ENABLE_PASSIVE_HEAD_EFFECTS.get()) {
            return ImmutableList.of();
        }
        if (headItem == Items.SKELETON_SKULL) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC, HeadEffects.UNDEAD);
        } else if (headItem == Items.WITHER_SKELETON_SKULL) {
            return ImmutableList.of(HeadEffects.UNDEAD);
        } else if (headItem == Items.ZOMBIE_HEAD) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC, HeadEffects.UNDEAD);
        } else if (headItem == Items.CREEPER_HEAD) {
            return ImmutableList.of();
        } else if (headItem == Items.DRAGON_HEAD) {
            return ImmutableList.of();
        } else if (headItem == Items.PIGLIN_HEAD) {
            return ImmutableList.of();
        }
        return ImmutableList.of();
    }

    public static @Nullable AbstractActiveHeadEffect getActiveEffectFromHead(Item headItem) {
        if (!MoreMobHeadsModCommonConfigs.ENABLE_ACTIVE_HEAD_EFFECTS.get()) {
            return null;
        }
        if (headItem == Items.SKELETON_SKULL) {
            return null;
        } else if (headItem == Items.WITHER_SKELETON_SKULL) {
            return null;
        } else if (headItem == Items.ZOMBIE_HEAD) {
            return null;
        } else if (headItem == Items.CREEPER_HEAD) {
            return null;
        } else if (headItem == Items.DRAGON_HEAD) {
            return null;
        } else if (headItem == Items.PIGLIN_HEAD) {
            return null;
        }
        return null;
    }
}
