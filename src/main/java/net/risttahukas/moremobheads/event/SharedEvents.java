package net.risttahukas.moremobheads.event;

import net.minecraft.ChatFormatting;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.GlowSquid;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ambient.Bat;
import net.minecraft.world.entity.animal.*;
import net.minecraft.world.entity.animal.allay.Allay;
import net.minecraft.world.entity.animal.axolotl.Axolotl;
import net.minecraft.world.entity.animal.camel.Camel;
import net.minecraft.world.entity.animal.frog.Frog;
import net.minecraft.world.entity.animal.frog.Tadpole;
import net.minecraft.world.entity.animal.goat.Goat;
import net.minecraft.world.entity.animal.horse.*;
import net.minecraft.world.entity.animal.sniffer.Sniffer;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.boss.wither.WitherBoss;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.entity.monster.hoglin.Hoglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.monster.warden.Warden;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerData;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.item.ModItems;

import java.util.Collection;
import java.util.Objects;

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
                if (sourceEntity != entity && sourceEntity instanceof Creeper creeper) {
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
                        Item headToDrop = null;
                        if (entity instanceof Allay) {
                            headToDrop = ModItems.ALLAY_HEAD.get();
                        } else if (entity instanceof Axolotl axolotl) {
                            headToDrop = switch (axolotl.getVariant()) {
                                case LUCY -> ModItems.AXOLOTL_HEAD_LUCY.get();
                                case WILD -> ModItems.AXOLOTL_HEAD_WILD.get();
                                case GOLD -> ModItems.AXOLOTL_HEAD_GOLD.get();
                                case CYAN -> ModItems.AXOLOTL_HEAD_CYAN.get();
                                case BLUE -> ModItems.AXOLOTL_HEAD_BLUE.get();
                            };
                        } else if (entity instanceof Bat) {
                            headToDrop = ModItems.BAT_HEAD.get();
                        } else if (entity instanceof Bee bee) {
                            if (bee.isAngry()) {
                                headToDrop = bee.hasNectar() ? ModItems.BEE_HEAD_ANGRY_POLLEN.get() : ModItems.BEE_HEAD_ANGRY.get();
                            } else {
                                headToDrop = bee.hasNectar() ? ModItems.BEE_HEAD_POLLEN.get() : ModItems.BEE_HEAD.get();
                            }
                        } else if (entity instanceof Blaze) {
                            headToDrop = ModItems.BLAZE_HEAD.get();
                        } else if (entity instanceof Camel) {
                            headToDrop = ModItems.CAMEL_HEAD.get();
                        } else if (entity instanceof Cat cat) {
                            String variant = Objects.requireNonNull(BuiltInRegistries.CAT_VARIANT.getKey(cat.getVariant())).toString();
                            headToDrop = switch (variant) {
                                case "minecraft:tabby" -> ModItems.CAT_HEAD_TABBY.get();
                                case "minecraft:black" -> ModItems.CAT_HEAD_BLACK.get();
                                case "minecraft:red" -> ModItems.CAT_HEAD_RED.get();
                                case "minecraft:siamese" -> ModItems.CAT_HEAD_SIAMESE.get();
                                case "minecraft:british_shorthair" -> ModItems.CAT_HEAD_BRITISH_SHORTHAIR.get();
                                case "minecraft:calico" -> ModItems.CAT_HEAD_CALICO.get();
                                case "minecraft:persian" -> ModItems.CAT_HEAD_PERSIAN.get();
                                case "minecraft:ragdoll" -> ModItems.CAT_HEAD_RAGDOLL.get();
                                case "minecraft:white" -> ModItems.CAT_HEAD_WHITE.get();
                                case "minecraft:jellie" -> ModItems.CAT_HEAD_JELLIE.get();
                                case "minecraft:all_black" -> ModItems.CAT_HEAD_ALL_BLACK.get();
                                default -> null;
                            };
                        } else if (entity instanceof CaveSpider) {
                            headToDrop = ModItems.CAVE_SPIDER_HEAD.get();
                        } else if (entity instanceof Chicken) {
                            headToDrop = ModItems.CHICKEN_HEAD.get();
                        } else if (entity instanceof Cod) {
                            headToDrop = ModItems.COD_HEAD.get();
                        } else if (entity instanceof Cow cow) {
                            if (cow instanceof MushroomCow mushroomCow) {
                                headToDrop = switch (mushroomCow.getVariant()) {
                                    case RED -> ModItems.MOOSHROOM_HEAD_RED.get();
                                    case BROWN -> ModItems.MOOSHROOM_HEAD_BROWN.get();
                                };
                            } else {
                                headToDrop = ModItems.COW_HEAD.get();
                            }
                        } else if (entity instanceof Dolphin) {
                            headToDrop = ModItems.DOLPHIN_HEAD.get();
                        } else if (entity instanceof Donkey) {
                            headToDrop = ModItems.DONKEY_HEAD.get();
                        } else if (entity instanceof Drowned) {
                            headToDrop = ModItems.DROWNED_HEAD.get();
                        } else if (entity instanceof EnderDragon) {
                            headToDrop = Items.DRAGON_HEAD;
                        } else if (entity instanceof EnderMan) {
                            headToDrop = ModItems.ENDERMAN_HEAD.get();
                        } else if (entity instanceof Endermite) {
                            headToDrop = ModItems.ENDERMITE_HEAD.get();
                        } else if (entity instanceof Evoker) {
                            headToDrop = ModItems.EVOKER_HEAD.get();
                        } else if (entity instanceof Fox fox) {
                            headToDrop = fox.getVariant() == Fox.Type.RED ? ModItems.FOX_HEAD_RED.get() : ModItems.FOX_HEAD_SNOW.get();
                        } else if (entity instanceof Frog frog) {
                            String variant = Objects.requireNonNull(BuiltInRegistries.FROG_VARIANT.getKey(frog.getVariant())).toString();
                            headToDrop = switch (variant) {
                                case "minecraft:temperate" -> ModItems.FROG_HEAD_TEMPERATE.get();
                                case "minecraft:warm" -> ModItems.FROG_HEAD_WARM.get();
                                case "minecraft:cold" -> ModItems.FROG_HEAD_COLD.get();
                                default -> null;
                            };
                        } else if (entity instanceof Ghast) {
                            headToDrop = ModItems.GHAST_HEAD.get();
                        } else if (entity instanceof Goat goat) {
                            headToDrop = goat.isScreamingGoat() ? ModItems.GOAT_HEAD_SCREAMING.get() : ModItems.GOAT_HEAD.get();
                        } else if (entity instanceof GlowSquid) {
                            headToDrop = ModItems.GLOW_SQUID_HEAD.get();
                        } else if (entity instanceof Guardian guardian) {
                            if (guardian instanceof ElderGuardian) {
                                headToDrop = ModItems.GUARDIAN_ELDER_HEAD.get();
                            } else {
                                headToDrop = ModItems.GUARDIAN_HEAD.get();
                            }
                        } else if (entity instanceof Hoglin) {
                            headToDrop = ModItems.HOGLIN_HEAD.get();
                        } else if (entity instanceof Horse horse) {
                            Variant variant = horse.getVariant();
                            Markings markings = horse.getMarkings();
                            headToDrop = switch (markings) {
                                case NONE -> switch (variant) {
                                    case WHITE -> ModItems.HORSE_HEAD_WHITE.get();
                                    case CREAMY -> ModItems.HORSE_HEAD_CREAMY.get();
                                    case CHESTNUT -> ModItems.HORSE_HEAD_CHESTNUT.get();
                                    case BROWN -> ModItems.HORSE_HEAD_BROWN.get();
                                    case BLACK -> ModItems.HORSE_HEAD_BLACK.get();
                                    case GRAY -> ModItems.HORSE_HEAD_GRAY.get();
                                    case DARK_BROWN -> ModItems.HORSE_HEAD_DARK_BROWN.get();
                                };
                                case WHITE -> switch (variant) {
                                    case WHITE -> ModItems.HORSE_HEAD_WHITE_WHITE.get();
                                    case CREAMY -> ModItems.HORSE_HEAD_CREAMY_WHITE.get();
                                    case CHESTNUT -> ModItems.HORSE_HEAD_CHESTNUT_WHITE.get();
                                    case BROWN -> ModItems.HORSE_HEAD_BROWN_WHITE.get();
                                    case BLACK -> ModItems.HORSE_HEAD_BLACK_WHITE.get();
                                    case GRAY -> ModItems.HORSE_HEAD_GRAY_WHITE.get();
                                    case DARK_BROWN -> ModItems.HORSE_HEAD_DARK_BROWN_WHITE.get();
                                };
                                case WHITE_FIELD -> switch (variant) {
                                    case WHITE -> ModItems.HORSE_HEAD_WHITE_WHITE_FIELD.get();
                                    case CREAMY -> ModItems.HORSE_HEAD_CREAMY_WHITE_FIELD.get();
                                    case CHESTNUT -> ModItems.HORSE_HEAD_CHESTNUT_WHITE_FIELD.get();
                                    case BROWN -> ModItems.HORSE_HEAD_BROWN_WHITE_FIELD.get();
                                    case BLACK -> ModItems.HORSE_HEAD_BLACK_WHITE_FIELD.get();
                                    case GRAY -> ModItems.HORSE_HEAD_GRAY_WHITE_FIELD.get();
                                    case DARK_BROWN -> ModItems.HORSE_HEAD_DARK_BROWN_WHITE_FIELD.get();
                                };
                                case WHITE_DOTS -> switch (variant) {
                                    case WHITE -> ModItems.HORSE_HEAD_WHITE_WHITE_DOTS.get();
                                    case CREAMY -> ModItems.HORSE_HEAD_CREAMY_WHITE_DOTS.get();
                                    case CHESTNUT -> ModItems.HORSE_HEAD_CHESTNUT_WHITE_DOTS.get();
                                    case BROWN -> ModItems.HORSE_HEAD_BROWN_WHITE_DOTS.get();
                                    case BLACK -> ModItems.HORSE_HEAD_BLACK_WHITE_DOTS.get();
                                    case GRAY -> ModItems.HORSE_HEAD_GRAY_WHITE_DOTS.get();
                                    case DARK_BROWN -> ModItems.HORSE_HEAD_DARK_BROWN_WHITE_DOTS.get();
                                };
                                case BLACK_DOTS -> switch (variant) {
                                    case WHITE -> ModItems.HORSE_HEAD_WHITE_BLACK_DOTS.get();
                                    case CREAMY -> ModItems.HORSE_HEAD_CREAMY_BLACK_DOTS.get();
                                    case CHESTNUT -> ModItems.HORSE_HEAD_CHESTNUT_BLACK_DOTS.get();
                                    case BROWN -> ModItems.HORSE_HEAD_BROWN_BLACK_DOTS.get();
                                    case BLACK -> ModItems.HORSE_HEAD_BLACK_BLACK_DOTS.get();
                                    case GRAY -> ModItems.HORSE_HEAD_GRAY_BLACK_DOTS.get();
                                    case DARK_BROWN -> ModItems.HORSE_HEAD_DARK_BROWN_BLACK_DOTS.get();
                                };
                            };
                        } else if (entity instanceof ZombieHorse) {
                            headToDrop = ModItems.HORSE_HEAD_ZOMBIE.get();
                        } else if (entity instanceof SkeletonHorse) {
                            headToDrop = ModItems.HORSE_SKULL_SKELETON.get();
                        } else if (entity instanceof Husk) {
                            headToDrop = ModItems.HUSK_HEAD.get();
                        } else if (entity instanceof Illusioner) {
                            headToDrop = ModItems.ILLUSIONER_HEAD.get();
                        } else if (entity instanceof IronGolem) {
                            headToDrop = ModItems.IRON_GOLEM_HEAD.get();
                        } else if (entity instanceof Llama llama) {
                            if (llama instanceof TraderLlama) {
                                headToDrop = switch (llama.getVariant()) {
                                    case CREAMY -> ModItems.TRADER_LLAMA_HEAD_CREAMY.get();
                                    case WHITE -> ModItems.TRADER_LLAMA_HEAD_WHITE.get();
                                    case BROWN -> ModItems.TRADER_LLAMA_HEAD_BROWN.get();
                                    case GRAY -> ModItems.TRADER_LLAMA_HEAD_GRAY.get();
                                };
                            } else {
                                headToDrop = switch (llama.getVariant()) {
                                    case CREAMY -> ModItems.LLAMA_HEAD_CREAMY.get();
                                    case WHITE -> ModItems.LLAMA_HEAD_WHITE.get();
                                    case BROWN -> ModItems.LLAMA_HEAD_BROWN.get();
                                    case GRAY -> ModItems.LLAMA_HEAD_GRAY.get();
                                };
                            }
                        } else if (entity instanceof MagmaCube) {
                            headToDrop = ModItems.MAGMA_CUBE_HEAD.get();
                        } else if (entity instanceof Mule) {
                            headToDrop = ModItems.MULE_HEAD.get();
                        } else if (entity instanceof Ocelot) {
                            headToDrop = ModItems.OCELOT_HEAD.get();
                        } else if (entity instanceof Panda panda) {
                            headToDrop = switch (panda.getVariant()) {
                                case NORMAL -> ModItems.PANDA_HEAD.get();
                                case LAZY -> ModItems.PANDA_HEAD_LAZY.get();
                                case WORRIED -> ModItems.PANDA_HEAD_WORRIED.get();
                                case PLAYFUL -> ModItems.PANDA_HEAD_PLAYFUL.get();
                                case BROWN -> ModItems.PANDA_HEAD_BROWN.get();
                                case WEAK -> ModItems.PANDA_HEAD_WEAK.get();
                                case AGGRESSIVE -> ModItems.PANDA_HEAD_AGGRESSIVE.get();
                            };
                        } else if (entity instanceof Parrot parrot) {
                            headToDrop = switch (parrot.getVariant()) {
                                case RED_BLUE -> ModItems.PARROT_HEAD_RED_BLUE.get();
                                case BLUE -> ModItems.PARROT_HEAD_BLUE.get();
                                case GREEN -> ModItems.PARROT_HEAD_GREEN.get();
                                case YELLOW_BLUE -> ModItems.PARROT_HEAD_YELLOW_BLUE.get();
                                case GRAY -> ModItems.PARROT_HEAD_GRAY.get();
                            };
                        } else if (entity instanceof Phantom) {
                            headToDrop = ModItems.PHANTOM_HEAD.get();
                        } else if (entity instanceof Pig) {
                            headToDrop = ModItems.PIG_HEAD.get();
                        } else if (entity instanceof PiglinBrute) {
                            headToDrop = ModItems.PIGLIN_BRUTE_HEAD.get();
                        } else if (entity instanceof Pillager) {
                            headToDrop = ModItems.PILLAGER_HEAD.get();
                        } else if (entity instanceof PolarBear) {
                            headToDrop = ModItems.POLAR_BEAR_HEAD.get();
                        } else if (entity instanceof Pufferfish) {
                            headToDrop = ModItems.PUFFERFISH_HEAD.get();
                        } else if (entity instanceof Rabbit rabbit) {
                            String name = ChatFormatting.stripFormatting(rabbit.getName().getString());
                            if ("Toast".equals(name)) {
                                headToDrop = ModItems.RABBIT_HEAD_TOAST.get();
                            } else {
                                headToDrop = switch (rabbit.getVariant()) {
                                    case BROWN -> ModItems.RABBIT_HEAD_BROWN.get();
                                    case WHITE -> ModItems.RABBIT_HEAD_WHITE.get();
                                    case BLACK -> ModItems.RABBIT_HEAD_BLACK.get();
                                    case WHITE_SPLOTCHED -> ModItems.RABBIT_HEAD_WHITE_SPLOTCHED.get();
                                    case GOLD -> ModItems.RABBIT_HEAD_GOLD.get();
                                    case SALT -> ModItems.RABBIT_HEAD_SALT.get();
                                    case EVIL -> ModItems.RABBIT_HEAD_CAERBANNOG.get();
                                };
                            }
                        } else if (entity instanceof Ravager) {
                            headToDrop = ModItems.RAVAGER_HEAD.get();
                        } else if (entity instanceof Salmon) {
                            headToDrop = ModItems.SALMON_HEAD.get();
                        } else if (entity instanceof Sheep sheep) {
                            String name = sheep.getName().getString();
                            if ("jeb_".equals(name)) {
                                headToDrop = ModItems.SHEEP_HEAD_RAINBOW.get();
                            } else {
                                headToDrop = switch (sheep.getColor()) {
                                    case WHITE -> ModItems.SHEEP_HEAD_WHITE.get();
                                    case ORANGE -> ModItems.SHEEP_HEAD_ORANGE.get();
                                    case MAGENTA -> ModItems.SHEEP_HEAD_MAGENTA.get();
                                    case LIGHT_BLUE -> ModItems.SHEEP_HEAD_LIGHT_BLUE.get();
                                    case YELLOW -> ModItems.SHEEP_HEAD_YELLOW.get();
                                    case LIME -> ModItems.SHEEP_HEAD_LIME.get();
                                    case PINK -> ModItems.SHEEP_HEAD_PINK.get();
                                    case GRAY -> ModItems.SHEEP_HEAD_GRAY.get();
                                    case LIGHT_GRAY -> ModItems.SHEEP_HEAD_LIGHT_GRAY.get();
                                    case CYAN -> ModItems.SHEEP_HEAD_CYAN.get();
                                    case PURPLE -> ModItems.SHEEP_HEAD_PURPLE.get();
                                    case BLUE -> ModItems.SHEEP_HEAD_BLUE.get();
                                    case BROWN -> ModItems.SHEEP_HEAD_BROWN.get();
                                    case GREEN -> ModItems.SHEEP_HEAD_GREEN.get();
                                    case RED -> ModItems.SHEEP_HEAD_RED.get();
                                    case BLACK -> ModItems.SHEEP_HEAD_BLACK.get();
                                };
                            }
                        } else if (entity instanceof Shulker shulker) {
                            if (shulker.getColor() == null) {
                                headToDrop = ModItems.SHULKER_HEAD.get();
                            } else {
                                headToDrop = switch (shulker.getColor()) {
                                    case WHITE -> ModItems.SHULKER_HEAD_WHITE.get();
                                    case ORANGE -> ModItems.SHULKER_HEAD_ORANGE.get();
                                    case MAGENTA -> ModItems.SHULKER_HEAD_MAGENTA.get();
                                    case LIGHT_BLUE -> ModItems.SHULKER_HEAD_LIGHT_BLUE.get();
                                    case YELLOW -> ModItems.SHULKER_HEAD_YELLOW.get();
                                    case LIME -> ModItems.SHULKER_HEAD_LIME.get();
                                    case PINK -> ModItems.SHULKER_HEAD_PINK.get();
                                    case GRAY -> ModItems.SHULKER_HEAD_GRAY.get();
                                    case LIGHT_GRAY -> ModItems.SHULKER_HEAD_LIGHT_GRAY.get();
                                    case CYAN -> ModItems.SHULKER_HEAD_CYAN.get();
                                    case PURPLE -> ModItems.SHULKER_HEAD_PURPLE.get();
                                    case BLUE -> ModItems.SHULKER_HEAD_BLUE.get();
                                    case BROWN -> ModItems.SHULKER_HEAD_BROWN.get();
                                    case GREEN -> ModItems.SHULKER_HEAD_GREEN.get();
                                    case RED -> ModItems.SHULKER_HEAD_RED.get();
                                    case BLACK -> ModItems.SHULKER_HEAD_BLACK.get();
                                };
                            }
                        } else if (entity instanceof Silverfish) {
                            headToDrop = ModItems.SILVERFISH_HEAD.get();
                        } else if (entity instanceof Slime) {
                            headToDrop = ModItems.SLIME_HEAD.get();
                        } else if (entity instanceof Sniffer) {
                            headToDrop = ModItems.SNIFFER_HEAD.get();
                        } else if (entity instanceof SnowGolem) {
                            headToDrop = ModItems.SNOW_GOLEM_HEAD.get();
                        } else if (entity instanceof Spider) {
                            headToDrop = ModItems.SPIDER_HEAD.get();
                        } else if (entity instanceof Squid) {
                            headToDrop = ModItems.SQUID_HEAD.get();
                        } else if (entity instanceof Stray) {
                            headToDrop = ModItems.STRAY_SKULL.get();
                        } else if (entity instanceof Strider strider) {
                            if (strider.level().dimension() == Level.NETHER) {
                                headToDrop = ModItems.STRIDER_HEAD.get();
                            } else {
                                headToDrop = ModItems.STRIDER_HEAD_COLD.get();
                            }
                        } else if (entity instanceof Tadpole) {
                            headToDrop = ModItems.TADPOLE_HEAD.get();
                        } else if (entity instanceof TropicalFish) {
                            headToDrop = ModItems.TROPICAL_FISH_HEAD.get();
                        } else if (entity instanceof Turtle) {
                            headToDrop = ModItems.TURTLE_HEAD.get();
                        } else if (entity instanceof Vex) {
                            headToDrop = ModItems.VEX_HEAD.get();
                        } else if (entity instanceof Villager villager) {
                            VillagerData villagerdata = villager.getVillagerData();
                            String villagerType = BuiltInRegistries.VILLAGER_TYPE.getKey(villagerdata.getType()).toString();
                            String villagerProfession = Objects.requireNonNull(ForgeRegistries.VILLAGER_PROFESSIONS.getKey(villagerdata.getProfession())).toString();
                            headToDrop = switch (villagerType) {
                                case "minecraft:desert" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_DESERT.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_DESERT_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_DESERT_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_DESERT_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_DESERT_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_DESERT_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_DESERT_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_DESERT_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_DESERT_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_DESERT_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_DESERT_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_DESERT_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_DESERT_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_DESERT_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_DESERT_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:jungle" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_JUNGLE.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_JUNGLE_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_JUNGLE_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_JUNGLE_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_JUNGLE_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_JUNGLE_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_JUNGLE_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_JUNGLE_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_JUNGLE_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_JUNGLE_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_JUNGLE_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_JUNGLE_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_JUNGLE_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_JUNGLE_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_JUNGLE_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:plains" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_PLAINS.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_PLAINS_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_PLAINS_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_PLAINS_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_PLAINS_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_PLAINS_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_PLAINS_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_PLAINS_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_PLAINS_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_PLAINS_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_PLAINS_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_PLAINS_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_PLAINS_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_PLAINS_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_PLAINS_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:savanna" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_SAVANNA.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_SAVANNA_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_SAVANNA_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_SAVANNA_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_SAVANNA_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_SAVANNA_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_SAVANNA_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_SAVANNA_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_SAVANNA_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_SAVANNA_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_SAVANNA_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_SAVANNA_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_SAVANNA_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_SAVANNA_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_SAVANNA_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:snow" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_SNOW.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_SNOW_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_SNOW_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_SNOW_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_SNOW_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_SNOW_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_SNOW_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_SNOW_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_SNOW_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_SNOW_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_SNOW_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_SNOW_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_SNOW_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_SNOW_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_SNOW_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:swamp" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_SWAMP.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_SWAMP_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_SWAMP_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_SWAMP_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_SWAMP_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_SWAMP_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_SWAMP_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_SWAMP_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_SWAMP_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_SWAMP_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_SWAMP_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_SWAMP_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_SWAMP_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_SWAMP_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_SWAMP_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:taiga" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.VILLAGER_HEAD_TAIGA.get();
                                    case "minecraft:armorer" -> ModItems.VILLAGER_HEAD_TAIGA_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.VILLAGER_HEAD_TAIGA_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.VILLAGER_HEAD_TAIGA_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.VILLAGER_HEAD_TAIGA_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.VILLAGER_HEAD_TAIGA_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.VILLAGER_HEAD_TAIGA_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.VILLAGER_HEAD_TAIGA_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.VILLAGER_HEAD_TAIGA_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.VILLAGER_HEAD_TAIGA_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.VILLAGER_HEAD_TAIGA_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.VILLAGER_HEAD_TAIGA_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.VILLAGER_HEAD_TAIGA_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.VILLAGER_HEAD_TAIGA_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.VILLAGER_HEAD_TAIGA_NITWIT.get();
                                    default -> null;
                                };
                                default -> null;
                            };
                        } else if (entity instanceof Vindicator) {
                            headToDrop = ModItems.VINDICATOR_HEAD.get();
                        } else if (entity instanceof WanderingTrader) {
                            headToDrop = ModItems.WANDERING_TRADER_HEAD.get();
                        } else if (entity instanceof Warden) {
                            headToDrop = ModItems.WARDEN_HEAD.get();
                        } else if (entity instanceof Witch) {
                            headToDrop = ModItems.WITCH_HEAD.get();
                        } else if (entity instanceof WitherBoss) {
                            if (randomSource.nextFloat() < 0.5) {
                                headToDrop = ModItems.WITHER_HEAD_INVULNERABLE.get();
                            } else {
                                headToDrop = ModItems.WITHER_HEAD.get();
                            }
                        } else if (entity instanceof Wolf wolf) {
                            headToDrop = wolf.isTame() ? ModItems.WOLF_HEAD_TAME.get() : wolf.isAngry() ? ModItems.WOLF_HEAD_ANGRY.get() : ModItems.WOLF_HEAD.get();
                        } else if (entity instanceof Zoglin) {
                            headToDrop = ModItems.ZOGLIN_HEAD.get();
                        } else if (entity instanceof ZombieVillager zombieVillager) {
                            VillagerData villagerdata = zombieVillager.getVillagerData();
                            String villagerType = BuiltInRegistries.VILLAGER_TYPE.getKey(villagerdata.getType()).toString();
                            String villagerProfession = Objects.requireNonNull(ForgeRegistries.VILLAGER_PROFESSIONS.getKey(villagerdata.getProfession())).toString();
                            headToDrop = switch (villagerType) {
                                case "minecraft:desert" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_DESERT_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:jungle" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_JUNGLE_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:plains" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_PLAINS_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:savanna" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_SAVANNA_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:snow" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_SNOW_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:swamp" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_SWAMP_NITWIT.get();
                                    default -> null;
                                };
                                case "minecraft:taiga" -> switch (villagerProfession) {
                                    case "minecraft:none" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA.get();
                                    case "minecraft:armorer" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_ARMORER.get();
                                    case "minecraft:butcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_BUTCHER.get();
                                    case "minecraft:cartographer" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_CARTOGRAPHER.get();
                                    case "minecraft:cleric" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_CLERIC.get();
                                    case "minecraft:farmer" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_FARMER.get();
                                    case "minecraft:fisherman" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_FISHERMAN.get();
                                    case "minecraft:fletcher" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_FLETCHER.get();
                                    case "minecraft:leatherworker" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_LEATHERWORKER.get();
                                    case "minecraft:librarian" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_LIBRARIAN.get();
                                    case "minecraft:mason" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_MASON.get();
                                    case "minecraft:shepherd" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_SHEPHERD.get();
                                    case "minecraft:toolsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_TOOLSMITH.get();
                                    case "minecraft:weaponsmith" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_WEAPONSMITH.get();
                                    case "minecraft:nitwit" -> ModItems.ZOMBIE_VILLAGER_HEAD_TAIGA_NITWIT.get();
                                    default -> null;
                                };
                                default -> null;
                            };
                        } else if (entity instanceof ZombifiedPiglin) {
                            headToDrop = ModItems.ZOMBIFIED_PIGLIN_HEAD.get();
                        }

                        if (headToDrop != null) {
                            creeper.increaseDroppedSkulls();
                            entity.spawnAtLocation(headToDrop);
                        }

                    }
                } else if (sourceEntity != entity && sourceEntity instanceof Player) {
                    Item headToDrop = null;
                    float chance = 0.025F;
                    float lootingMultiplier = 0.01F;
                    if (entity instanceof WitherBoss) {
                        if (randomSource.nextFloat() < 0.5) {
                            headToDrop = ModItems.WITHER_HEAD_INVULNERABLE.get();
                        } else {
                            headToDrop = ModItems.WITHER_HEAD.get();
                        }
                    } else if (entity instanceof Wolf wolf) {
                        headToDrop = wolf.isTame() ? ModItems.WOLF_HEAD_TAME.get() : wolf.isAngry() ? ModItems.WOLF_HEAD_ANGRY.get() : ModItems.WOLF_HEAD.get();
                    }
                    if (headToDrop != null) {
                        if (randomSource.nextFloat() < chance + lootingMultiplier * event.getLootingLevel()) {
                            entity.spawnAtLocation(headToDrop);
                        }
                    }
                }
            }

        }
    }
}
