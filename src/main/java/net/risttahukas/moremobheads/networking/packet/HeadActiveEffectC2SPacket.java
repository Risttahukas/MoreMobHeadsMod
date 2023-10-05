package net.risttahukas.moremobheads.networking.packet;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.ThrownEnderpearl;
import net.minecraft.world.item.Item;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkEvent;
import net.risttahukas.moremobheads.capability.PlayerHeadActiveEffectCooldownProvider;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.effect.ModHeadEffectHelper;
import net.risttahukas.moremobheads.entity.projectile.PlayerSpit;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.util.ModTargeting;

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
                            boolean applyCooldown = true;
                            if (activeHeadEffect == HeadEffects.ENDER_PEARL && MoreMobHeadsModCommonConfigs.ENABLE_ENDER_PEARL_ACTIVE_EFFECT.get()) {
                                ThrownEnderpearl thrownEnderpearl = new ThrownEnderpearl(level, player);
                                thrownEnderpearl.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.ENDER_PEARL_THROW, player.getSoundSource(), 1.0F, 0.4F / (player.getRandom().nextFloat() * 0.4F + 0.8F));
                                level.addFreshEntity(thrownEnderpearl);
                            } else if (activeHeadEffect == HeadEffects.SNOWBALL && MoreMobHeadsModCommonConfigs.ENABLE_SNOWBALL_ACTIVE_EFFECT.get()) {
                                Snowball snowball = new Snowball(level, player);
                                snowball.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.SNOW_GOLEM_SHOOT, player.getSoundSource(), 1.0F, 0.4F / (player.getRandom().nextFloat() * 0.4F + 0.8F));
                                level.addFreshEntity(snowball);
                            } else if (activeHeadEffect == HeadEffects.SONIC_BOOM && MoreMobHeadsModCommonConfigs.ENABLE_SONIC_BOOM_ACTIVE_EFFECT.get()) {
                                Entity target = ModTargeting.getPlayerTargetEntity(player, 25);
                                if (target instanceof LivingEntity livingTarget && player.closerThan(target, 15.0D, 20.0D)) {
                                    Vec3 playerEyePosition = player.getEyePosition();
                                    Vec3 attackVector = livingTarget.getEyePosition().subtract(playerEyePosition);
                                    Vec3 normalizedAttackVector = attackVector.normalize();
                                    for(int i = 1; i < Mth.floor(attackVector.length()) + 7; ++i) {
                                        Vec3 particlePosition = playerEyePosition.add(normalizedAttackVector.scale(i));
                                        level.sendParticles(ParticleTypes.SONIC_BOOM, particlePosition.x, particlePosition.y, particlePosition.z, 1, 0.0D, 0.0D, 0.0D, 0.0D);
                                    }
                                    level.playSound(null, player.blockPosition(), SoundEvents.WARDEN_SONIC_BOOM,
                                            player.getSoundSource(), 3.0F, 1.0F);
                                    target.hurt(level.damageSources().sonicBoom(player), 10.0F);
                                    double verticalKnockBack = 0.5D * (1.0D - livingTarget.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                                    double horizontalKnockBack = 2.5D * (1.0D - livingTarget.getAttributeValue(Attributes.KNOCKBACK_RESISTANCE));
                                    livingTarget.push(normalizedAttackVector.x() * horizontalKnockBack, normalizedAttackVector.y() * verticalKnockBack, normalizedAttackVector.z() * horizontalKnockBack);
                                } else {
                                    applyCooldown = false;
                                }
                            } else if (activeHeadEffect == HeadEffects.SPIT && MoreMobHeadsModCommonConfigs.ENABLE_SPIT_ACTIVE_EFFECT.get()) {
                                PlayerSpit playerSpit = new PlayerSpit(level, player, false);
                                playerSpit.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.LLAMA_SPIT, player.getSoundSource(), 1.0F, 1.0F + (player.getRandom().nextFloat() - player.getRandom().nextFloat()) * 0.2F);
                                level.addFreshEntity(playerSpit);
                            } else if (activeHeadEffect == HeadEffects.TRADER_SPIT && MoreMobHeadsModCommonConfigs.ENABLE_SPIT_ACTIVE_EFFECT.get()) {
                                PlayerSpit playerSpit = new PlayerSpit(level, player, true);
                                playerSpit.shootFromRotation(player, player.getXRot(), player.getYRot(), 0.0F, 1.5F, 1.0F);
                                level.playSound(null, player.blockPosition(), SoundEvents.LLAMA_SPIT, player.getSoundSource(), 1.0F, 1.0F + (player.getRandom().nextFloat() - player.getRandom().nextFloat()) * 0.2F);
                                level.addFreshEntity(playerSpit);
                            }
                            if (applyCooldown) {
                                cooldown.setCooldown(activeHeadEffect.getCooldown());
                            }
                        }
                    });
                }


            }
        });
        context.setPacketHandled(true);
    }
}
