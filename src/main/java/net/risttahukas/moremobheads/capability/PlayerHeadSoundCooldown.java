package net.risttahukas.moremobheads.capability;

import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.AutoRegisterCapability;

@AutoRegisterCapability
public class PlayerHeadSoundCooldown {
    private int cooldown;

    public int getCooldown() {
        return cooldown;
    }

    public void setCooldown(int cooldown) {
        this.cooldown = cooldown;
    }

    public void reduceCooldown() {
        this.cooldown = Math.max(cooldown - 1, 0);
    }

    public void copyFrom(PlayerHeadSoundCooldown source) {
        this.cooldown = source.cooldown;
    }

    public void saveNBTData(CompoundTag nbt) {
        nbt.putInt("headSoundCooldown", cooldown);
    }

    public void loadNBTData(CompoundTag nbt) {
        this.cooldown = nbt.getInt("headSoundCooldown");
    }
}
