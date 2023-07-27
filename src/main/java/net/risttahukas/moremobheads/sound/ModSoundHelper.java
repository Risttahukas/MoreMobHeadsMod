package net.risttahukas.moremobheads.sound;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;

public class ModSoundHelper {
    public static SoundEvent getSoundFromHead(Item headItem) {
        if (headItem == Items.SKELETON_SKULL) {
            return SoundEvents.NOTE_BLOCK_IMITATE_SKELETON.get();
        } else if (headItem == Items.WITHER_SKELETON_SKULL) {
            return SoundEvents.NOTE_BLOCK_IMITATE_WITHER_SKELETON.get();
        } else if (headItem == Items.ZOMBIE_HEAD) {
            return SoundEvents.NOTE_BLOCK_IMITATE_ZOMBIE.get();
        } else if (headItem == Items.CREEPER_HEAD) {
            return SoundEvents.NOTE_BLOCK_IMITATE_CREEPER.get();
        } else if (headItem == Items.DRAGON_HEAD) {
            return SoundEvents.NOTE_BLOCK_IMITATE_ENDER_DRAGON.get();
        } else if (headItem == Items.PIGLIN_HEAD) {
            return SoundEvents.NOTE_BLOCK_IMITATE_PIGLIN.get();
        }
        return null;
    }
}
