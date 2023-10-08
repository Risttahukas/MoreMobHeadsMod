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
        if (headItem == Items.CREEPER_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_CREEPER_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.VOLATILE_GUTS);
        } else if (headItem == Items.DRAGON_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_DRAGON_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.ENDERIC);
        } else if (headItem == Items.PIGLIN_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_PIGLIN_HEAD_EFFECTS.get()) {
            return ImmutableList.of();
        } else if (headItem == Items.SKELETON_SKULL && MoreMobHeadsModCommonConfigs.ENABLE_SKELETON_SKULL_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC, HeadEffects.UNDEAD);
        } else if (headItem == Items.WITHER_SKELETON_SKULL && MoreMobHeadsModCommonConfigs.ENABLE_WITHER_SKELETON_SKULL_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.DECAYING, HeadEffects.UNDEAD);
        } else if (headItem == Items.ZOMBIE_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_ZOMBIE_HEAD_EFFECTS.get()) {
            return ImmutableList.of(HeadEffects.HELIOPHOBIC, HeadEffects.UNDEAD);
        }
        return ImmutableList.of();
    }

    public static @Nullable AbstractActiveHeadEffect getActiveEffectFromHead(Item headItem) {
        if (!MoreMobHeadsModCommonConfigs.ENABLE_ACTIVE_HEAD_EFFECTS.get()) {
            return null;
        }
        if (headItem == Items.CREEPER_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_CREEPER_HEAD_EFFECTS.get()) {
            return null;
        } else if (headItem == Items.DRAGON_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_DRAGON_HEAD_EFFECTS.get()) {
            return null;
        } else if (headItem == Items.PIGLIN_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_PIGLIN_HEAD_EFFECTS.get()) {
            return null;
        } else if (headItem == Items.SKELETON_SKULL && MoreMobHeadsModCommonConfigs.ENABLE_SKELETON_SKULL_EFFECTS.get()) {
            return null;
        } else if (headItem == Items.WITHER_SKELETON_SKULL && MoreMobHeadsModCommonConfigs.ENABLE_WITHER_SKELETON_SKULL_EFFECTS.get()) {
            return null;
        } else if (headItem == Items.ZOMBIE_HEAD && MoreMobHeadsModCommonConfigs.ENABLE_ZOMBIE_HEAD_EFFECTS.get()) {
            return null;
        }
        return null;
    }
}
