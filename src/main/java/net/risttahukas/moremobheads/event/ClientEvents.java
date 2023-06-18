package net.risttahukas.moremobheads.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HumanoidModel;
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
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import net.risttahukas.moremobheads.block.entity.ModBlockEntityModelLayers;
import net.risttahukas.moremobheads.block.entity.model.ChickenHeadModel;
import net.risttahukas.moremobheads.block.entity.model.SpiderHeadModel;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;
import net.risttahukas.moremobheads.item.EffectSkullItem;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
public class ClientEvents {
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

    }

    @Mod.EventBusSubscriber(modid = MoreMobHeadsMod.MOD_ID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModBusEvents {
        @SubscribeEvent
        public static void registerRenderers(final EntityRenderersEvent.RegisterRenderers event) {
            event.registerBlockEntityRenderer(ModBlockEntities.EFFECT_SKULL.get(), EffectSkullBlockRenderer::new);
        }

        @SubscribeEvent
        public static void registerLayerDefinitions(final EntityRenderersEvent.RegisterLayerDefinitions event) {
            event.registerLayerDefinition(ModBlockEntityModelLayers.SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CAVE_SPIDER_HEAD, SpiderHeadModel::createSpiderHeadLayer);
            event.registerLayerDefinition(ModBlockEntityModelLayers.CHICKEN_HEAD, ChickenHeadModel::createChickenHeadLayer);
        }


        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void registerEffectSkullHeadLayers(final EntityRenderersEvent.AddLayers event) {
            Map<EntityType<?>, EntityRenderer<?>> renderers = Minecraft.getInstance().getEntityRenderDispatcher().renderers;
            for(Map.Entry<EntityType<?>, EntityRenderer<?>> renderer : renderers.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer livingEntityRenderer) {
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, livingEntityRenderer,"layers");
                    assert layers != null;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, customHeadLayer, skullModels, "skullModels");
                        }
                    }
                }
            }

            Map<String, EntityRenderer<? extends Player>> skins = Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap();
            for(Map.Entry<String, EntityRenderer<? extends Player>> renderer : skins.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer livingEntityRenderer) {
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, livingEntityRenderer,"layers");
                    assert layers != null;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer customHeadLayer) {
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, customHeadLayer, skullModels, "skullModels");
                        }
                    }
                }
            }
        }

    }
}
