package net.risttahukas.moremobheads.event;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import net.risttahukas.moremobheads.block.entity.ModBlockEntityModelLayers;
import net.risttahukas.moremobheads.block.entity.model.SpiderHeadModel;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;

import java.util.List;
import java.util.Map;

public class ClientEvents {
    @Mod.EventBusSubscriber(modid = MoreMobHeadsMod.MOD_ID, value = Dist.CLIENT)
    public static class ClientForgeEvents {

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
        }


        @SubscribeEvent(priority = EventPriority.LOWEST)
        public static void registerEffectSkullHeadLayers(final EntityRenderersEvent.AddLayers event) {
            Map<EntityType<?>, EntityRenderer<?>> renderers = Minecraft.getInstance().getEntityRenderDispatcher().renderers;
            for(Map.Entry<EntityType<?>, EntityRenderer<?>> renderer : renderers.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer) {
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, (LivingEntityRenderer) renderer.getValue(),"layers");
                    assert layers != null;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer) {
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, (CustomHeadLayer) layer, skullModels, "skullModels");
                        }
                    }
                }
            }

            Map<String, EntityRenderer<? extends Player>> skins = Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap();
            for(Map.Entry<String, EntityRenderer<? extends Player>> renderer : skins.entrySet()) {
                if (renderer.getValue() instanceof LivingEntityRenderer) {
                    List<? extends RenderLayer<?, ?>> layers = ObfuscationReflectionHelper
                            .getPrivateValue(LivingEntityRenderer.class, (LivingEntityRenderer) renderer.getValue(),"layers");
                    assert layers != null;
                    for (RenderLayer<?, ?> layer : layers) {
                        if (layer instanceof CustomHeadLayer) {
                            final Map<SkullBlock.Type, SkullModelBase> skullModels =
                                    EffectSkullBlockRenderer.createSkullRenderers(Minecraft.getInstance().getEntityModels());
                            ObfuscationReflectionHelper.setPrivateValue(CustomHeadLayer.class, (CustomHeadLayer) layer, skullModels, "skullModels");
                        }
                    }
                }
            }
        }

    }
}
