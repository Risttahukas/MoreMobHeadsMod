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

public class PlayerHeadActiveEffectCooldownProvider implements ICapabilityProvider, INBTSerializable<CompoundTag> {
    public static Capability<PlayerHeadActiveEffectCooldown> PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN =
            CapabilityManager.get(new CapabilityToken<>() {});

    private PlayerHeadActiveEffectCooldown playerHeadActiveEffectCooldown = null;
    private final LazyOptional<PlayerHeadActiveEffectCooldown> optional = LazyOptional.of(this::createPlayerHeadActiveEffectCooldown);

    private PlayerHeadActiveEffectCooldown createPlayerHeadActiveEffectCooldown() {
        if (this.playerHeadActiveEffectCooldown == null) {
            this.playerHeadActiveEffectCooldown = new PlayerHeadActiveEffectCooldown();
        }
        return this.playerHeadActiveEffectCooldown;
    }

    @Override
    public @NotNull <T> LazyOptional<T> getCapability(@NotNull Capability<T> capability, @Nullable Direction side) {
        if (capability == PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN) {
            return optional.cast();
        }
        return LazyOptional.empty();
    }

    @Override
    public CompoundTag serializeNBT() {
        CompoundTag nbt = new CompoundTag();
        createPlayerHeadActiveEffectCooldown().saveNBTData(nbt);
        return nbt;
    }

    @Override
    public void deserializeNBT(CompoundTag nbt) {
        createPlayerHeadActiveEffectCooldown().loadNBTData(nbt);
    }
}
