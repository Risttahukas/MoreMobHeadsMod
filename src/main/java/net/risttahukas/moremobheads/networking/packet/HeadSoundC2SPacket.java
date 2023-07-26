package net.risttahukas.moremobheads.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraftforge.network.NetworkEvent;
import net.risttahukas.moremobheads.capability.PlayerHeadSoundCooldownProvider;
import net.risttahukas.moremobheads.item.EffectSkullItem;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class HeadSoundC2SPacket {
    public HeadSoundC2SPacket() {

    }

    public HeadSoundC2SPacket(FriendlyByteBuf friendlyByteBuf) {

    }

    public void toBytes(FriendlyByteBuf friendlyByteBuf) {

    }

    public void handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            if (player != null) {
                ServerLevel level = player.serverLevel();
                if (player.getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof EffectSkullItem effectSkullItem) {
                    player.getCapability(PlayerHeadSoundCooldownProvider.PLAYER_HEAD_SOUND_COOLDOWN).ifPresent(cooldown -> {
                        if (cooldown.getCooldown() == 0) {
                            level.playSound(null, player.blockPosition(), effectSkullItem.getSound(), player.getSoundSource(), 3.0F, 1.0F);
                            cooldown.setCooldown(60);
                        }
                    });
                }
            }
        });
        context.setPacketHandled(true);
    }
}
