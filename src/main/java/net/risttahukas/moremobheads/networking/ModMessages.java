package net.risttahukas.moremobheads.networking;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraftforge.network.NetworkDirection;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.networking.packet.HeadActiveEffectC2SPacket;
import net.risttahukas.moremobheads.networking.packet.HeadSoundC2SPacket;

public class ModMessages {
    private static SimpleChannel INSTANCE;

    private static int packetId = 0;
    private static int id() {
        return packetId++;
    }

    public static void register() {
        SimpleChannel simpleChannel = NetworkRegistry.ChannelBuilder
                .named(new ResourceLocation(MoreMobHeadsMod.MOD_ID, "messages"))
                .networkProtocolVersion(() -> "1.0")
                .clientAcceptedVersions(s -> true)
                .serverAcceptedVersions(s -> true)
                .simpleChannel();

        INSTANCE = simpleChannel;

        simpleChannel.messageBuilder(HeadSoundC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(HeadSoundC2SPacket::new)
                .encoder(HeadSoundC2SPacket::toBytes)
                .consumerMainThread(HeadSoundC2SPacket::handle)
                .add();

        simpleChannel.messageBuilder(HeadActiveEffectC2SPacket.class, id(), NetworkDirection.PLAY_TO_SERVER)
                .decoder(HeadActiveEffectC2SPacket::new)
                .encoder(HeadActiveEffectC2SPacket::toBytes)
                .consumerMainThread(HeadActiveEffectC2SPacket::handle)
                .add();
    }

    public static <MSG> void sendToServer(MSG message) {
        INSTANCE.sendToServer(message);
    }

    public static <MSG> void sendToPlayer(MSG message, ServerPlayer player) {
        INSTANCE.send(PacketDistributor.PLAYER.with(() -> player), message);
    }
}
