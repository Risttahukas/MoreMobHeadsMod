package net.risttahukas.moremobheads.event;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.DamageTypeTags;
import net.minecraft.util.RandomSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.targeting.TargetingConditions;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.Snowball;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.food.FoodData;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.EntityHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.entity.EntityTeleportEvent;
import net.minecraftforge.event.entity.ProjectileImpactEvent;
import net.minecraftforge.event.entity.living.*;
import net.minecraftforge.event.entity.player.ItemTooltipEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.capability.PlayerHeadActiveEffectCooldownProvider;
import net.risttahukas.moremobheads.capability.PlayerHeadSoundCooldownProvider;
import net.risttahukas.moremobheads.config.MoreMobHeadsModCommonConfigs;
import net.risttahukas.moremobheads.effect.AbstractActiveHeadEffect;
import net.risttahukas.moremobheads.effect.AbstractPassiveHeadEffect;
import net.risttahukas.moremobheads.effect.HeadEffects;
import net.risttahukas.moremobheads.effect.ModHeadEffectHelper;
import net.risttahukas.moremobheads.enchantment.ModEnchantmentHelper;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.item.ModItems;
import net.risttahukas.moremobheads.loot.ModLootHelper;

import java.util.Collection;
import java.util.List;

@SuppressWarnings("unused")
public class SharedEvents {

    @Mod.EventBusSubscriber(modid = MoreMobHeadsMod.MOD_ID)
    public static class SharedForgeEvents {

        @SubscribeEvent
        public static void onLivingDropsEvent(LivingDropsEvent event) {
            LivingEntity entity = event.getEntity();
            RandomSource randomSource = entity.getRandom();
            if (!entity.level().isClientSide) {
                Entity sourceEntity = event.getSource().getEntity();
                if (sourceEntity != entity && (sourceEntity instanceof Creeper || sourceEntity instanceof Player)) {
                    if (sourceEntity instanceof Creeper creeper) {
                        if (entity instanceof Creeper creeper1) {
                            if (creeper1.isPowered()) {
                                Collection<ItemEntity> drops = event.getDrops();
                                ItemEntity dropToRemove = null;
                                ItemEntity dropToAdd = null;
                                for (ItemEntity drop : drops) {
                                    if (drop.getItem().getItem() == Items.CREEPER_HEAD) {
                                        dropToAdd = new ItemEntity(drop.level(), drop.getX(), drop.getY(), drop.getZ(), ModItems.CREEPER_HEAD_CHARGED.get().getDefaultInstance());
                                        dropToRemove = drop;
                                    }
                                }
                                if (dropToRemove != null) {
                                    drops.remove(dropToRemove);
                                } if (dropToAdd != null) {
                                    drops.add(dropToAdd);
                                }
                            }
                        }
                        if (creeper.canDropMobsSkull()) {
                            Item headToDrop = ModLootHelper.getHeadFromMob(entity);
                            if (headToDrop != null) {
                                creeper.increaseDroppedSkulls();
                                entity.spawnAtLocation(headToDrop);
                            }
                        }
                    } else {
                        Player player = (Player) sourceEntity;
                        Item headToDrop = ModLootHelper.getHeadFromMob(entity);
                        if (headToDrop != null) {
                            //Ensure a mob can't drop two heads
                            Collection<ItemEntity> drops = event.getDrops();
                            ItemEntity dropToRemove = null;
                            for (ItemEntity drop : drops) {
                                if (drop.getItem().getItem() == headToDrop) {
                                    dropToRemove = drop;
                                }
                            }
                            if (dropToRemove != null) {
                                drops.remove(dropToRemove);
                            }
                            if (randomSource.nextFloat() < ModLootHelper.getHeadDropChance(entity, event.getLootingLevel(), ModEnchantmentHelper.getMobBeheading(player))) {
                                entity.spawnAtLocation(headToDrop);
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onAttachCapabilitiesEvent(AttachCapabilitiesEvent<Entity> event) {
            if (event.getObject() instanceof Player) {
                if (!event.getObject().getCapability(PlayerHeadSoundCooldownProvider.PLAYER_HEAD_SOUND_COOLDOWN).isPresent()) {
                    event.addCapability(new ResourceLocation(MoreMobHeadsMod.MOD_ID, "player_head_sound_cooldown"),
                            new PlayerHeadSoundCooldownProvider());
                }
                if (!event.getObject().getCapability(PlayerHeadActiveEffectCooldownProvider.PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN).isPresent()) {
                    event.addCapability(new ResourceLocation(MoreMobHeadsMod.MOD_ID, "player_head_active_effect_cooldown"),
                            new PlayerHeadActiveEffectCooldownProvider());
                }
            }
        }

        @SubscribeEvent
        public static void onPlayerCloned(PlayerEvent.Clone event) {
            if (event.isWasDeath()) {
                event.getOriginal().reviveCaps();
                event.getOriginal().getCapability(PlayerHeadSoundCooldownProvider.PLAYER_HEAD_SOUND_COOLDOWN).ifPresent(oldStore ->
                        event.getEntity().getCapability(PlayerHeadSoundCooldownProvider.PLAYER_HEAD_SOUND_COOLDOWN).ifPresent(newStore ->
                                newStore.copyFrom(oldStore)));
                event.getOriginal().getCapability(PlayerHeadActiveEffectCooldownProvider.PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN).ifPresent(oldStore ->
                        event.getEntity().getCapability(PlayerHeadActiveEffectCooldownProvider.PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN).ifPresent(newStore ->
                                newStore.copyFrom(oldStore)));
                event.getOriginal().invalidateCaps();
            }
        }

        @SuppressWarnings("deprecation")
        @SubscribeEvent
        public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
            if (event.side.isServer() && event.phase == TickEvent.Phase.START) {
                Player player = event.player;
                player.getCapability(PlayerHeadSoundCooldownProvider.PLAYER_HEAD_SOUND_COOLDOWN).ifPresent(cooldown -> {
                    if (cooldown.getCooldown() > 0) {
                        cooldown.reduceCooldown();
                    }
                });
                player.getCapability(PlayerHeadActiveEffectCooldownProvider.PLAYER_HEAD_ACTIVE_EFFECT_COOLDOWN).ifPresent(cooldown -> {
                    if (cooldown.getCooldown() > 0) {
                        cooldown.reduceCooldown();
                    }
                });
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                        for (AbstractPassiveHeadEffect headEffect : headEffects) {
                            for (Pair<MobEffect, Pair<Integer, Integer>> pair : headEffect.getPassivePotionEffects()) {
                                MobEffect mobEffect = pair.getFirst();
                                Pair<Integer, Integer> data = pair.getSecond();
                                int amplifier = data.getFirst();
                                int duration = data.getSecond();
                                player.addEffect(new MobEffectInstance(mobEffect, duration, amplifier, false, false, false));
                            }
                        }
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.ECHOLOCATION && MoreMobHeadsModCommonConfigs.ENABLE_ECHOLOCATION_EFFECT.get()) {
                            List<LivingEntity> nearbyEntities = player.level().getNearbyEntities(LivingEntity.class,
                                    TargetingConditions.forCombat().range(25.0D).ignoreLineOfSight().ignoreInvisibilityTesting(),
                                    player,
                                    player.getBoundingBox().inflate(15.0D, 20.0D, 15.0D));
                            for (LivingEntity livingEntity : nearbyEntities) {
                                if (player.closerThan(livingEntity, 15.0D, 20.0D)) {
                                    livingEntity.addEffect(new MobEffectInstance(MobEffects.GLOWING, 2, 0, false, false, false));
                                }
                            }
                        } else if (headEffect == HeadEffects.HYDROPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_HYDROPHOBIC_EFFECT.get()) {
                            if (player.isInWaterRainOrBubble()) {
                                player.hurt(player.damageSources().drown(), 1.0F);
                            }
                        } else if (headEffect == HeadEffects.HELIOPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_HELIOPHOBIC_EFFECT.get()) {
                            boolean flag = false;
                            if (player.level().isDay()) {
                                float f = player.getLightLevelDependentMagicValue();
                                BlockPos blockpos = BlockPos.containing(player.getX(), player.getEyeY(), player.getZ());
                                boolean moist = player.isInWaterRainOrBubble() || player.isInPowderSnow || player.wasInPowderSnow;
                                if (f > 0.5F && player.getRandom().nextFloat() * 30.0F < (f - 0.4F) * 2.0F && !moist && player.level().canSeeSky(blockpos)) {
                                    flag = true;
                                }
                            }
                            if (flag) {
                                player.setSecondsOnFire(8);
                            }
                        } else if (headEffect == HeadEffects.THERMOPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_THERMOPHOBIC_EFFECT.get()) {
                            if (player.level().getBiome(player.blockPosition()).is(BiomeTags.SNOW_GOLEM_MELTS)) {
                                player.hurt(player.damageSources().onFire(), 1.0F);
                            }
                        } else if (headEffect == HeadEffects.FREEZE_IMMUNE && MoreMobHeadsModCommonConfigs.ENABLE_FREEZE_IMMUNE_EFFECT.get()) {
                            int i = player.getTicksFrozen();
                            if (i != 0) {
                                player.setTicksFrozen(Math.max(0, i - 3));
                            }
                        } else if (headEffect == HeadEffects.UNDEAD && MoreMobHeadsModCommonConfigs.ENABLE_UNDEAD_EFFECT.get()) {
                            if (player.hasEffect(MobEffects.REGENERATION)) {
                                player.removeEffect(MobEffects.REGENERATION);
                            } if (player.hasEffect(MobEffects.POISON)) {
                                player.removeEffect(MobEffects.POISON);
                            } if (player.hasEffect(MobEffects.SATURATION)) {
                                player.removeEffect(MobEffects.SATURATION);
                            } if (player.hasEffect(MobEffects.HUNGER)) {
                                player.removeEffect(MobEffects.HUNGER);
                            }
                            FoodData foodData = player.getFoodData();
                            if (foodData.getExhaustionLevel() > 3.9F) {
                                foodData.setExhaustion(3.9F);
                            }
                            if (foodData.getFoodLevel() > 17) {
                                foodData.setFoodLevel(17);
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onLivingBreatheEvent(LivingBreatheEvent event) {
            if (event.getEntity() instanceof Player player) {
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.HYDROPHILIC && MoreMobHeadsModCommonConfigs.ENABLE_HYDROPHILIC_EFFECT.get()) {
                            if (!player.isUnderWater() && !player.getAbilities().invulnerable) {
                                event.setCanBreathe(false);
                            } else if (player.isUnderWater()) {
                                event.setCanBreathe(true);
                                event.setCanRefillAir(true);
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onProjectileImpactEvent(ProjectileImpactEvent event) {
            Projectile projectile = event.getProjectile();
            if (projectile instanceof ThrownPotion thrownPotion) {
                ItemStack itemstack = thrownPotion.getItem();
                Potion potion = PotionUtils.getPotion(itemstack);
                List<MobEffectInstance> list = PotionUtils.getMobEffects(itemstack);
                if (potion == Potions.WATER && list.isEmpty()) {
                    AABB aabb = thrownPotion.getBoundingBox().inflate(4.0D, 2.0D, 4.0D);
                    for(Player player : thrownPotion.level().getEntitiesOfClass(Player.class, aabb)) {
                        double d = thrownPotion.distanceToSqr(player);
                        Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                        if (headItem instanceof EffectSkullItem ||
                                headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                                headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                                headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                            ImmutableList<AbstractPassiveHeadEffect> headEffects;
                            if (headItem instanceof EffectSkullItem effectSkullItem) {
                                headEffects = effectSkullItem.getPassiveHeadEffects();
                            } else {
                                headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                            }
                            for (AbstractPassiveHeadEffect headEffect : headEffects) {
                                if (headEffect == HeadEffects.HYDROPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_HYDROPHOBIC_EFFECT.get()) {
                                    player.hurt(thrownPotion.damageSources().indirectMagic(thrownPotion, thrownPotion.getOwner()), 1.0F);
                                }
                            }
                        }
                    }
                }
            } else if (projectile instanceof Snowball snowball) {
                if ((event.getImpactResult() == ProjectileImpactEvent.ImpactResult.DEFAULT ||
                        event.getImpactResult() == ProjectileImpactEvent.ImpactResult.STOP_AT_CURRENT) &&
                        event.getRayTraceResult() instanceof EntityHitResult entityHitResult) {
                    if (entityHitResult.getEntity() instanceof Player player) {
                        Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                        if (headItem instanceof EffectSkullItem ||
                                headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                                headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                                headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                            ImmutableList<AbstractPassiveHeadEffect> headEffects;
                            if (headItem instanceof EffectSkullItem effectSkullItem) {
                                headEffects = effectSkullItem.getPassiveHeadEffects();
                            } else {
                                headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                            }
                            for (AbstractPassiveHeadEffect headEffect : headEffects) {
                                if (headEffect == HeadEffects.CRYOPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_CRYOPHOBIC_EFFECT.get()) {
                                    player.hurt(snowball.damageSources().thrown(snowball, snowball.getOwner()), 3.0F);
                                }
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onLivingHurtEvent(LivingHurtEvent event) {
            LivingEntity target = event.getEntity();
            if (target instanceof Player player && !target.level().isClientSide()) {
                DamageSource damageSource = event.getSource();
                Entity attackingEntity = damageSource.getDirectEntity();
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.CRYOPHOBIC && MoreMobHeadsModCommonConfigs.ENABLE_CRYOPHOBIC_EFFECT.get()) {
                            if (damageSource.is(DamageTypeTags.IS_FREEZING)) {
                                event.setAmount(event.getAmount() * 5);
                            }
                        } else if (headEffect == HeadEffects.TURTLE_SHELL && MoreMobHeadsModCommonConfigs.ENABLE_TURTLE_SHELL_EFFECT.get()) {
                            boolean piercingAttack = false;
                            if (attackingEntity instanceof AbstractArrow abstractarrow) {
                                if (abstractarrow.getPierceLevel() > 0) {
                                    piercingAttack = true;
                                }
                            }
                            if (!damageSource.is(DamageTypeTags.BYPASSES_SHIELD) && !piercingAttack) {
                                Vec3 damageSourcePosition = damageSource.getSourcePosition();
                                if (damageSourcePosition != null) {
                                    Vec3 attackVector = damageSourcePosition.vectorTo(player.position());
                                    attackVector = new Vec3(attackVector.x, 0.0D, attackVector.z).normalize();
                                    Vec3 viewVector = player.getViewVector(1.0F);
                                    viewVector = new Vec3(viewVector.x, 0.0D, viewVector.z).normalize();
                                    if (attackVector.dot(viewVector) > 0.0D) {
                                        event.setAmount(event.getAmount() * 0.25F);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onLivingAttackEvent(LivingAttackEvent event) {
            LivingEntity target = event.getEntity();
            if (target instanceof Player player && !target.level().isClientSide()) {
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.FREEZE_IMMUNE && MoreMobHeadsModCommonConfigs.ENABLE_FREEZE_IMMUNE_EFFECT.get()) {
                            if (event.getSource().is(DamageTypeTags.IS_FREEZING)) {
                                event.setCanceled(true);
                            }
                        } else if (headEffect == HeadEffects.UNDEAD && MoreMobHeadsModCommonConfigs.ENABLE_UNDEAD_EFFECT.get()) {
                            if (event.getSource().is(DamageTypeTags.IS_DROWNING) || event.getSource().is(DamageTypes.STARVE)) {
                                event.setCanceled(true);
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onEnderPearlTeleportEvent(EntityTeleportEvent.EnderPearl event) {
            ServerPlayer player = event.getPlayer();
            if (!player.level().isClientSide()) {
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.ENDERIC && MoreMobHeadsModCommonConfigs.ENABLE_ENDERIC_EFFECT.get()) {
                            event.setAttackDamage(0);
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onMobEffectApplicableEvent(MobEffectEvent.Applicable event) {
            LivingEntity target = event.getEntity();
            if (target instanceof Player player && !target.level().isClientSide()) {
                Item headItem = player.getItemBySlot(EquipmentSlot.HEAD).getItem();
                if (headItem instanceof EffectSkullItem ||
                        headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                        headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                        headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                    ImmutableList<AbstractPassiveHeadEffect> headEffects;
                    if (headItem instanceof EffectSkullItem effectSkullItem) {
                        headEffects = effectSkullItem.getPassiveHeadEffects();
                    } else {
                        headEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                    }
                    for (AbstractPassiveHeadEffect headEffect : headEffects) {
                        if (headEffect == HeadEffects.UNDEAD && MoreMobHeadsModCommonConfigs.ENABLE_UNDEAD_EFFECT.get()) {
                            MobEffect mobEffect = event.getEffectInstance().getEffect();
                            if (mobEffect == MobEffects.REGENERATION || mobEffect == MobEffects.POISON ||
                                    mobEffect == MobEffects.SATURATION || mobEffect == MobEffects.HUNGER) {
                                event.setResult(Event.Result.DENY);
                            }
                        }
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onItemTooltipEvent(ItemTooltipEvent event) {
            Item headItem = event.getItemStack().getItem();
            if (headItem == Items.SKELETON_SKULL || headItem == Items.WITHER_SKELETON_SKULL ||
                    headItem == Items.ZOMBIE_HEAD || headItem == Items.CREEPER_HEAD ||
                    headItem == Items.DRAGON_HEAD || headItem == Items.PIGLIN_HEAD) {
                ImmutableList<AbstractPassiveHeadEffect> passiveHeadEffects = ModHeadEffectHelper.getPassiveEffectsFromHead(headItem);
                AbstractActiveHeadEffect activeHeadEffect = ModHeadEffectHelper.getActiveEffectFromHead(headItem);
                List<Component> components = event.getToolTip();
                int i = 0;
                if (!(components.size() == 0)) {
                    i = 1;
                }
                if (!passiveHeadEffects.isEmpty()) {
                    components.add(i++, Component.translatable("tooltip.moremobheads.passive_effects").withStyle(ChatFormatting.GRAY));
                    for (AbstractPassiveHeadEffect headEffect : passiveHeadEffects) {
                        if (Screen.hasShiftDown()) {
                            components.add(i++, headEffect.getDesc());
                        } else {
                            components.add(i++, headEffect.getName());
                        }
                    }
                }
                if (activeHeadEffect != null) {
                    components.add(i++, Component.translatable("tooltip.moremobheads.active_effect").withStyle(ChatFormatting.GRAY));
                    if (Screen.hasShiftDown()) {
                        components.add(i++, activeHeadEffect.getDesc());
                        components.add(i, Component.translatable("tooltip.moremobheads.active_effect.cooldown")
                                .append(" " + activeHeadEffect.getCooldown() + " ")
                                .append(Component.translatable(activeHeadEffect.getCooldown() == 1 ?
                                        "tooltip.moremobheads.tick.singular" :
                                        "tooltip.moremobheads.tick.plural"))
                                .withStyle(ChatFormatting.GRAY));
                    } else {
                        components.add(i, activeHeadEffect.getName());
                    }
                }
            }
        }

    }
}
