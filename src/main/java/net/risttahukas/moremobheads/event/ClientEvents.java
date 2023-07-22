package net.risttahukas.moremobheads.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import net.risttahukas.moremobheads.block.entity.ModBlockEntityModelLayers;
import net.risttahukas.moremobheads.block.entity.model.*;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;
import net.risttahukas.moremobheads.entity.renderer.layers.EffectSkullHeadLayer;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.util.ModKeyBindings;

import java.util.Map;

@SuppressWarnings("unused")
public class ClientEvents {
    public static int time = 0;

    @Mod.EventBusSubscriber(modid = MoreMobHeadsMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {
        @SubscribeEvent
        public static void renderHeadPre(RenderLivingEvent.Pre<?, ?> event) {
            EntityModel<?> model = event.getRenderer().getModel();
            if (model instanceof HumanoidModel<?> humanoidModel) {
                if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof EffectSkullItem) {
                    humanoidModel.head.visible = false;
                }
            }
        }

        @SubscribeEvent
        public static void renderHeadPost(RenderLivingEvent.Post<?, ?> event) {
            EntityModel<?> model = event.getRenderer().getModel();
            if (model instanceof HumanoidModel<?> humanoidModel) {
                if (event.getEntity().getItemBySlot(EquipmentSlot.HEAD).getItem() instanceof EffectSkullItem) {
                    humanoidModel.head.visible = true;
                }
            }
        }

        @SubscribeEvent
        public static void clientTick(TickEvent.ClientTickEvent event) {
            Minecraft minecraft = Minecraft.getInstance();
            if (!minecraft.isPaused()) {
                time++;
            }
        }

        @SubscribeEvent
        public static void onKeyInput(InputEvent.Key inputEvent) {
            if (ModKeyBindings.HEAD_EFFECT_KEY.consumeClick()) {
                assert Minecraft.getInstance().player != null;
                Minecraft.getInstance().player.sendSystemMessage(Component.literal("This key will one day activate active effects on heads"));
            }
        }

    }

    @Mod.EventBusSubscriber(modid = MoreMobHeadsMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.EFFECT_SKULL.get(), EffectSkullBlockRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(ModBlockEntityModelLayers.HUMANOID_SKULL, SkullModel::createHumanoidHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.MOB_SKULL, SkullModel::createMobHeadLayer);

            event.registerLayerDefinition(ModBlockEntityModelLayers.AXOLOTL_HEAD, AxolotlHeadModel::createAxolotlHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ALLAY_HEAD, AllayHeadModel::createAllayHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.BAT_HEAD, BatHeadModel::createBatHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.BEE_HEAD, BeeHeadModel::createBeeHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAMEL_HEAD, CamelHeadModel::createCamelHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAT_HEAD, CatHeadModel::createCatHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAVE_SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CHESTED_HORSE_HEAD, ChestedHorseHeadModel::createHorseHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CHICKEN_HEAD, ChickenHeadModel::createChickenHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.COD_HEAD, CodHeadModel::createCodHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.COW_HEAD, CowHeadModel::createCowHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CREEPER_HEAD_CHARGE, ChargedCreeperHeadModel::createCreeperHeadChargeLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.DOLPHIN_HEAD, DolphinHeadModel::createDolphinHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.DROWNED_HEAD_CLOTHES, DrownedHeadModel::createDrownedHeadClothesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ENDERMAN_HEAD, EndermanHeadModel::createEndermanHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ENDERMITE_HEAD, EndermiteHeadModel::createEndermiteHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.FOX_HEAD, FoxHeadModel::createFoxHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.FROG_HEAD, FrogHeadModel::createFrogHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.GHAST_HEAD, GhastHeadModel::createGhastHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.GOAT_HEAD, GoatHeadModel::createGoatHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.GUARDIAN_HEAD, GuardianHeadModel::createGuardianHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.HOGLIN_HEAD, HoglinHeadModel::createHoglinHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.HORSE_HEAD, AbstractHorseHeadModel::createHorseHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS, HorseHeadModel::createHorseHeadMarkingsLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ILLAGER_HEAD, IllagerHeadModel::createIllagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.IRON_GOLEM_HEAD, IronGolemHeadModel::createIronGolemHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.LLAMA_HEAD, LlamaHeadModel::createLlamaHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.LLAMA_HEAD_DECOR, LlamaHeadModel::createLlamaHeadDecorLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.MAGMA_CUBE_HEAD, MagmaCubeHeadModel::createMagmaCubeHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.OCELOT_HEAD, OcelotHeadModel::createOcelotHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PANDA_HEAD, PandaHeadModel::createPandaHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PARROT_HEAD, ParrotHeadModel::createParrotHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PHANTOM_HEAD, PhantomHeadModel::createPhantomHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PIG_HEAD, PigHeadModel::createPigHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.POLAR_BEAR_HEAD, PolarBearHeadModel::createPolarBearHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PUFFERFISH_HEAD, PufferfishHeadModel::createPufferfishHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.RABBIT_HEAD, RabbitHeadModel::createRabbitHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.RAVAGER_HEAD, RavagerHeadModel::createRavagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SALMON_HEAD, SalmonHeadModel::createSalmonHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHEEP_HEAD, SheepHeadModel::createSheepHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL, SheepHeadModel::createSheepHeadWoolLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHULKER_HEAD, ShulkerHeadModel::createShulkerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SILVERFISH_HEAD, SilverfishHeadModel::createSilverfishHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SLIME_HEAD, SlimeHeadModel::createSlimeHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SLIME_HEAD_OUTER_LAYER, SlimeHeadModel::createSlimeHeadOuterLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SNIFFER_HEAD, SnifferHeadModel::createSnifferHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SNOW_GOLEM_HEAD, SnowGolemHeadModel::createSnowGolemHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SPIDER_EYES, SpiderHeadModel::createSpiderHeadEyesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SQUID_HEAD, SquidHeadModel::createSquidHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.STRAY_SKULL_CLOTHES, StraySkullModel::createStraySkullClothesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.STRIDER_HEAD, StriderHeadModel::createStriderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.TADPOLE_HEAD, TadpoleHeadModel::createTadpoleHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.TROPICAL_FISH_HEAD, TropicalFishHeadModelA::createTropicalFishHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.TROPICAL_FISH_HEAD_PATTERN, TropicalFishHeadModelA::createTropicalFishHeadPatternLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.TURTLE_HEAD, TurtleHeadModel::createTurtleHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.VILLAGER_HEAD, AbstractVillagerHeadModel::createVillagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WARDEN_HEAD, WardenHeadModel::createWardenHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WARDEN_HEAD_EMISSIVE, WardenHeadModel::createWardenHeadEmissiveLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WITCH_HEAD, WitchHeadModel::createWitchHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WITHER_HEAD, WitherHeadModel::createWitherHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WITHER_HEAD_ARMOR, WitherHeadArmorModel::createWitherHeadArmorLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WOLF_HEAD, WolfHeadModel::createWolfHeadLayer);
        }


        @SuppressWarnings({"unchecked", "rawtypes"})
        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void registerEffectSkullHeadLayers(final EntityRenderersEvent.AddLayers event) {
            Map<EntityType<?>, EntityRenderer<?>> renderers = Minecraft.getInstance().getEntityRenderDispatcher().renderers;
            for(Map.Entry<EntityType<?>, EntityRenderer<?>> renderer : renderers.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer<?, ?> livingEntityRenderer) {
                    boolean flag = false;
                    for (RenderLayer<?, ?> layer : livingEntityRenderer.layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            flag = true;
                            customHeadLayer.skullModels = EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                        }
                    }
                    if (flag) {
                        livingEntityRenderer.addLayer(new EffectSkullHeadLayer(livingEntityRenderer, Minecraft.getInstance().getEntityModels(), Minecraft.getInstance().getEntityRenderDispatcher().getItemInHandRenderer()));
                    }
                }
            }

            Map<String, EntityRenderer<? extends Player>> skins = Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap();
            for(Map.Entry<String, EntityRenderer<? extends Player>> renderer : skins.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer<?, ?> livingEntityRenderer) {
                    boolean flag = false;
                    for (RenderLayer<?, ?> layer : livingEntityRenderer.layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            flag = true;
                            customHeadLayer.skullModels = EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                        }
                    }
                    if (flag) {
                        livingEntityRenderer.addLayer(new EffectSkullHeadLayer(livingEntityRenderer,Minecraft.getInstance().getEntityModels(),Minecraft.getInstance().getEntityRenderDispatcher().getItemInHandRenderer()));
                    }
                }
            }
        }

        @SubscribeEvent
        public static void onKeyRegister(RegisterKeyMappingsEvent registerKeyMappingsEvent) {
            registerKeyMappingsEvent.register(ModKeyBindings.HEAD_EFFECT_KEY);
        }

    }
}
