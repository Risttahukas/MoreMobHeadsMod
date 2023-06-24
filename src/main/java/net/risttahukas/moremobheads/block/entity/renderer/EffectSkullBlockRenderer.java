package net.risttahukas.moremobheads.block.entity.renderer;

import com.google.common.collect.ImmutableMap;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.PiglinHeadModel;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.dragon.DragonHeadModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.AbstractSkullBlock;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.WallSkullBlock;
import net.minecraft.world.level.block.entity.SkullBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.RotationSegment;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.fml.ModLoader;
import net.risttahukas.moremobheads.block.EffectSkullBlock;
import net.risttahukas.moremobheads.block.entity.ModBlockEntityModelLayers;
import net.risttahukas.moremobheads.block.entity.model.*;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class EffectSkullBlockRenderer extends SkullBlockRenderer implements BlockEntityRenderer<SkullBlockEntity> {

    private final Map<SkullBlock.Type, SkullModelBase> modelByType;

    public EffectSkullBlockRenderer(BlockEntityRendererProvider.Context context) {
        super(context);
        this.modelByType = createSkullRenderers(context.getModelSet());
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAVE_SPIDER, new ResourceLocation("textures/entity/spider/cave_spider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CHICKEN, new ResourceLocation("textures/entity/chicken.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.GHAST, new ResourceLocation("textures/entity/ghast/ghast.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_BLUE, new ResourceLocation("textures/entity/parrot/parrot_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREEN, new ResourceLocation("textures/entity/parrot/parrot_green.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREY, new ResourceLocation("textures/entity/parrot/parrot_grey.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SPIDER, new ResourceLocation("textures/entity/spider/spider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.WITCH, new ResourceLocation("textures/entity/witch.png"));
    }

    @Override
    public void render(SkullBlockEntity skullBlockEntity, float p_112535_, @NotNull PoseStack poseStack,
                       @NotNull MultiBufferSource multiBufferSource, int p_112538_, int p_112539_) {
        float f = skullBlockEntity.getAnimation(p_112535_);
        BlockState blockstate = skullBlockEntity.getBlockState();
        boolean flag = blockstate.getBlock() instanceof WallSkullBlock;
        Direction direction = flag ? blockstate.getValue(WallSkullBlock.FACING) : null;
        int i = flag ? RotationSegment.convertToSegment(direction.getOpposite()) : blockstate.getValue(SkullBlock.ROTATION);
        float f1 = RotationSegment.convertToDegrees(i);
        SkullBlock.Type skullblock$type = ((AbstractSkullBlock)blockstate.getBlock()).getType();
        SkullModelBase skullmodelbase = this.modelByType.get(skullblock$type);
        RenderType rendertype = getRenderType(skullblock$type, skullBlockEntity.getOwnerProfile());
        renderSkull(direction, f1, f, poseStack, multiBufferSource, p_112538_, skullmodelbase, rendertype);
    }

    public static void renderSkull(@Nullable Direction direction, float p_173665_, float p_173666_,
                                   PoseStack poseStack, MultiBufferSource multiBufferSource, int p_173669_,
                                   SkullModelBase skullModelBase, @NotNull RenderType renderType) {
        poseStack.pushPose();
        if (direction == null) {
            poseStack.translate(0.5F, 0.0F, 0.5F);
        } else {
            if (skullModelBase instanceof CaveSpiderHeadModel) {
                poseStack.translate(0.5F - (float)direction.getStepX() * 0.325F, 0.25F,
                        0.5F - (float)direction.getStepZ() * 0.325F);
            } else if (skullModelBase instanceof ChickenHeadModel || skullModelBase instanceof ParrotHeadModel) {
                poseStack.translate(0.5F - (float)direction.getStepX() * 0.4375F, 0.25F,
                        0.5F - (float)direction.getStepZ() * 0.4375F);
            } else {
                poseStack.translate(0.5F - (float)direction.getStepX() * 0.25F, 0.25F,
                        0.5F - (float)direction.getStepZ() * 0.25F);
            }
        }

        poseStack.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexconsumer = multiBufferSource.getBuffer(renderType);
        skullModelBase.setupAnim(p_173666_, p_173665_, 0.0F);
        skullModelBase.renderToBuffer(poseStack, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        poseStack.popPose();
    }

    @SuppressWarnings("UnstableApiUsage")
    public static @NotNull Map<SkullBlock.Type, SkullModelBase> createSkullRenderers(EntityModelSet entityModelSet) {
        ImmutableMap.Builder<SkullBlock.Type, SkullModelBase> builder = ImmutableMap.builder();
        builder.put(SkullBlock.Types.SKELETON, new SkullModel(entityModelSet.bakeLayer(ModelLayers.SKELETON_SKULL)));
        builder.put(SkullBlock.Types.WITHER_SKELETON, new SkullModel(entityModelSet.bakeLayer(ModelLayers.WITHER_SKELETON_SKULL)));
        builder.put(SkullBlock.Types.PLAYER, new SkullModel(entityModelSet.bakeLayer(ModelLayers.PLAYER_HEAD)));
        builder.put(SkullBlock.Types.ZOMBIE, new SkullModel(entityModelSet.bakeLayer(ModelLayers.ZOMBIE_HEAD)));
        builder.put(SkullBlock.Types.CREEPER, new SkullModel(entityModelSet.bakeLayer(ModelLayers.CREEPER_HEAD)));
        builder.put(SkullBlock.Types.DRAGON, new DragonHeadModel(entityModelSet.bakeLayer(ModelLayers.DRAGON_SKULL)));
        builder.put(SkullBlock.Types.PIGLIN, new PiglinHeadModel(entityModelSet.bakeLayer(ModelLayers.PIGLIN_HEAD)));

        builder.put(EffectSkullBlock.Types.CAVE_SPIDER, new CaveSpiderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAVE_SPIDER_HEAD)));
        builder.put(EffectSkullBlock.Types.CHICKEN, new ChickenHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CHICKEN_HEAD)));
        builder.put(EffectSkullBlock.Types.GHAST, new GhastHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.GHAST_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREEN, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREY, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.SPIDER, new SpiderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_HEAD)));
        builder.put(EffectSkullBlock.Types.WITCH, new WitchHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.WITCH_HEAD)));
        ModLoader.get().postEvent(new EntityRenderersEvent.CreateSkullModels(builder, entityModelSet));
        return builder.build();
    }
}
