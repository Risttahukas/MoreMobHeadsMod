package net.risttahukas.moremobheads.networking.packet;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.item.Item;
import net.minecraftforge.network.NetworkEvent;
import net.risttahukas.moremobheads.capability.PlayerHeadActiveEffectCooldownProvider;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.effect.ModHeadEffectHelper;
import net.risttahukas.moremobheads.entity.projectile.PlayerSpit;
import net.risttahukas.moremobheads.item.EffectSkullItem;

import java.util.function.Supplier;

@SuppressWarnings("unused")
public class HeadActiveEffectC2SPacket {
    public HeadActiveEffectC2SPacket() {

    }

    public HeadActiveEffectC2SPacket(FriendlyByteBuf friendlyByteBuf) {

    }

    public void toBytes(FriendlyByteBuf friendlyByteBuf) {

    }

    public void handle(Supplier<NetworkEvent.Context> supplier) {
        NetworkEvent.Context context = supplier.get();
        context.enqueueWork(() -> {
            ServerPlayer player = context.getSender();
            if (player != null) {
                ServerLevel level = player.serverLevel();
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                AbstractActiveHeadEffect activeHeadEffect;
                if (headItem instanceof EffectSkullItem effectSkullItem) {
                    activeHeadEffect = effectSkullItem.getActiveHeadEffect();
                } else {
                    activeHeadEffect = ModHeadEffectHelper.getActiveEffectFromHead(headItem);
                }
                if (activeHeadEffect != null) {
                    player.getCapability(PlayerHeadActiveEffectCooldownProvider.PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN).ifPresent(cooldown -> {
                        if (cooldown.getCooldown() == 0) {
                            if (activeHeadEffect == HeadEffects.SNOWBALL) {
                                Snowball snowball = new Snowball(level, player);
                                snowball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.SNOW_GOLEM_SHOOT, player.getSoundSource(), 1.0F, 0.4F / (player.getRandom().nextFloat() * 0.4F + 0.8F));
                                level.addFreshEntity(snowball);
                            } else if (activeHeadEffect == HeadEffects.SPIT) {
                                PlayerSpit playerSpit = new PlayerSpit(level, player, false);
                                playerSpit.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.LLAMA_SPIT, player.getSoundSource(), 1.0F, 1.0F + (player.getRandom().nextFloat() - player.getRandom().nextFloat()) * 0.2F);
                                level.addFreshEntity(playerSpit);
                            } else if (activeHeadEffect == HeadEffects.TRADER_SPIT) {
                                PlayerSpit playerSpit = new PlayerSpit(level, player, true);
                                playerSpit.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.LLAMA_SPIT, player.getSoundSource(), 1.0F, 1.0F + (player.getRandom().nextFloat() - player.getRandom().nextFloat()) * 0.2F);
                                level.addFreshEntity(playerSpit);
                            }
                            cooldown.setCooldown(activeHeadEffect.getCooldown());
                        }
                    });
                }


            }
        });
        context.setPacketHandled(true);
    }
}
