package net.risttahukas.moremobheads.event;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.Creeper;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.enchantment.ModEnchantmentHelper;
import net.risttahukas.moremobheads.item.ModItems;
import net.risttahukas.moremobheads.loot.ModLootHelper;

import java.util.Collection;

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
    }
}
