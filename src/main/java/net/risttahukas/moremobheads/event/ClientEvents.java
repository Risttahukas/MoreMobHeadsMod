package net.risttahukas.moremobheads.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import net.risttahukas.moremobheads.block.entity.ModBlockEntityModelLayers;
import net.risttahukas.moremobheads.block.entity.model.*;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;
import net.risttahukas.moremobheads.entity.renderer.layers.EffectSkullHeadLayer;
import net.risttahukas.moremobheads.item.EffectSkullItem;

import java.util.List;
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
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAMEL_HEAD, CamelHeadModel::createCamelHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAT_HEAD, CatHeadModel::createCatHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAVE_SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CHESTED_HORSE_HEAD, ChestedHorseHeadModel::createHorseHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CHICKEN_HEAD, ChickenHeadModel::createChickenHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.COW_HEAD, CowHeadModel::createCowHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CREEPER_HEAD_CHARGE, ChargedCreeperHeadModel::createCreeperHeadChargeLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.DOLPHIN_HEAD, DolphinHeadModel::createDolphinHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.DROWNED_HEAD_CLOTHES, DrownedHeadModel::createDrownedHeadClothesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ENDERMAN_HEAD, EndermanHeadModel::createEndermanHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.FOX_HEAD, FoxHeadModel::createFoxHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.GHAST_HEAD, GhastHeadModel::createGhastHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.HORSE_HEAD, AbstractHorseHeadModel::createHorseHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS, HorseHeadModel::createHorseHeadMarkingsLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.ILLAGER_HEAD, IllagerHeadModel::createIllagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.IRON_GOLEM_HEAD, IronGolemHeadModel::createIronGolemHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.MAGMA_CUBE_HEAD, MagmaCubeHeadModel::createMagmaCubeHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.OCELOT_HEAD, OcelotHeadModel::createOcelotHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PANDA_HEAD, PandaHeadModel::createPandaHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PARROT_HEAD, ParrotHeadModel::createParrotHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PHANTOM_HEAD, PhantomHeadModel::createPhantomHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.POLAR_BEAR_HEAD, PolarBearHeadModel::createPolarBearHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.PUFFERFISH_HEAD, PufferfishHeadModel::createPufferfishHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.RABBIT_HEAD, RabbitHeadModel::createRabbitHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.RAVAGER_HEAD, RavagerHeadModel::createRavagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHEEP_HEAD, SheepHeadModel::createSheepHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL, SheepHeadModel::createSheepHeadWoolLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SHULKER_HEAD, ShulkerHeadModel::createShulkerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SLIME_HEAD, SlimeHeadModel::createSlimeHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SLIME_HEAD_OUTER_LAYER, SlimeHeadModel::createSlimeHeadOuterLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SNOW_GOLEM_HEAD, SnowGolemHeadModel::createSnowGolemHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SPIDER_EYES, SpiderHeadModel::createSpiderHeadEyesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.SQUID_HEAD, SquidHeadModel::createSquidHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.STRAY_SKULL_CLOTHES, StraySkullModel::createStraySkullClothesLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.STRIDER_HEAD, StriderHeadModel::createStriderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.VILLAGER_HEAD, VillagerHeadModel::createVillagerHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WARDEN_HEAD, WardenHeadModel::createWardenHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WARDEN_HEAD_EMISSIVE, WardenHeadModel::createWardenHeadEmissiveLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.WITCH_HEAD, WitchHeadModel::createWitchHeadLayer);
        }


        @SuppressWarnings({"unchecked", "rawtypes"})
        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void registerEffectSkullHeadLayers(final EntityRenderersEvent.AddLayers event) {
            Map<EntityType<?>, EntityRenderer<?>> renderers = Minecraft.getInstance().getEntityRenderDispatcher().renderers;
            for(Map.Entry<EntityType<?>, EntityRenderer<?>> renderer : renderers.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer<?, ?> livingEntityRenderer) {
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, livingEntityRenderer,"layers");
                    assert layers != null;
                    boolean flag = false;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            flag = true;
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, customHeadLayer, skullModels, "skullModels");
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
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, livingEntityRenderer,"layers");
                    assert layers != null;
                    boolean flag = false;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            flag = true;
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, customHeadLayer, skullModels, "skullModels");
                        }
                    }
                    if (flag) {
                        livingEntityRenderer.addLayer(new EffectSkullHeadLayer(livingEntityRenderer,Minecraft.getInstance().getEntityModels(),Minecraft.getInstance().getEntityRenderDispatcher().getItemInHandRenderer()));
                    }
                }
            }
        }

    }
}
