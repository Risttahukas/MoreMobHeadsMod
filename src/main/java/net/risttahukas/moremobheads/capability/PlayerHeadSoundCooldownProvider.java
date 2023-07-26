package net.risttahukas.moremobheads.capability;

import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.common.util.INBTSerializable;
import net.minecraftforge.common.util.LazyOptional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class PlayerHeadSoundCooldownProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<PlayerHeadSoundCooldown> PLAYER_HEAD_SOUND_COOLDOWN =
            CapabilityManager.get(new CapabilityToken<>() {});

    private PlayerHeadSoundCooldown playerHeadSoundCooldown = null;
    private final LazyOptional<PlayerHeadSoundCooldown> optional = LazyOptional.of(this::createPlayerHeadSoundCooldown);

    private PlayerHeadSoundCooldown createPlayerHeadSoundCooldown() {
        if (this.playerHeadSoundCooldown == null) {
            this.playerHeadSoundCooldown = new PlayerHeadSoundCooldown();
        }
        return this.playerHeadSoundCooldown;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> capability, @Nullable Direction side) {
        if (capability == PLAYER_HEAD_SOUND_COOLDOWN) {
            return optional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerHeadSoundCooldown().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerHeadSoundCooldown().loadNBTData(nbt);
    }
}
