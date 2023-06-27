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
import net.minecraft.world.level.block.Blocks;
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
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.ALLAY, new ResourceLocation("textures/entity/allay/allay.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.AXOLOTL_LUCY, new ResourceLocation("textures/entity/axolotl/axolotl_lucy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.AXOLOTL_WILD, new ResourceLocation("textures/entity/axolotl/axolotl_wild.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.AXOLOTL_GOLD, new ResourceLocation("textures/entity/axolotl/axolotl_gold.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.AXOLOTL_CYAN, new ResourceLocation("textures/entity/axolotl/axolotl_cyan.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.AXOLOTL_BLUE, new ResourceLocation("textures/entity/axolotl/axolotl_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.BAT, new ResourceLocation("textures/entity/bat.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAMEL, new ResourceLocation("textures/entity/camel/camel.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_TABBY, new ResourceLocation("textures/entity/cat/tabby.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_BLACK, new ResourceLocation("textures/entity/cat/black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_RED, new ResourceLocation("textures/entity/cat/red.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_SIAMESE, new ResourceLocation("textures/entity/cat/siamese.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_BRITISH_SHORTHAIR, new ResourceLocation("textures/entity/cat/british_shorthair.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_CALICO, new ResourceLocation("textures/entity/cat/calico.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_PERSIAN, new ResourceLocation("textures/entity/cat/persian.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_RAGDOLL, new ResourceLocation("textures/entity/cat/ragdoll.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_WHITE, new ResourceLocation("textures/entity/cat/white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_JELLIE, new ResourceLocation("textures/entity/cat/jellie.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAT_ALL_BLACK, new ResourceLocation("textures/entity/cat/all_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CAVE_SPIDER, new ResourceLocation("textures/entity/spider/cave_spider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CHICKEN, new ResourceLocation("textures/entity/chicken.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.COW, new ResourceLocation("textures/entity/cow/cow.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.GHAST, new ResourceLocation("textures/entity/ghast/ghast.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MOOSHROOM_RED, new ResourceLocation("textures/entity/cow/red_mooshroom.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MOOSHROOM_BROWN, new ResourceLocation("textures/entity/cow/brown_mooshroom.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.OCELOT, new ResourceLocation("textures/entity/cat/ocelot.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_BLUE, new ResourceLocation("textures/entity/parrot/parrot_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREEN, new ResourceLocation("textures/entity/parrot/parrot_green.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREY, new ResourceLocation("textures/entity/parrot/parrot_grey.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_WHITE, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_ORANGE, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_MAGENTA, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_LIGHT_BLUE, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_YELLOW, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_LIME, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_PINK, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_GRAY, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_LIGHT_GRAY, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_CYAN, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_PURPLE, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_BLUE, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_BROWN, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_GREEN, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_RED, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_BLACK, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SHEEP_RAINBOW, new ResourceLocation("textures/entity/sheep/sheep.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SPIDER, new ResourceLocation("textures/entity/spider/spider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.VEX, new ResourceLocation("textures/entity/illager/vex.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.WITCH, new ResourceLocation("textures/entity/witch.png"));
    }

    @Override
    public void render(SkullBlockEntity skullBlockEntity, float partialTicks, @NotNull PoseStack poseStack,
                       @NotNull MultiBufferSource multiBufferSource, int p_112538_, int p_112539_) {
        float f = skullBlockEntity.getAnimation(partialTicks);
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

    public static void renderSkull(@Nullable Direction direction, float p_173665_, float animationProgress,
                                   PoseStack poseStack, MultiBufferSource multiBufferSource, int p_173669_,
                                   SkullModelBase skullModelBase, @NotNull RenderType renderType) {
        poseStack.pushPose();
        if (direction == null) {
            poseStack.translate(0.5F, 0.0F, 0.5F);
        } else {
            float horizontalTranslation = 0.25F;
            float verticalTranslation = 0.25F;
            if (skullModelBase instanceof AxolotlHeadModel || skullModelBase instanceof CatHeadModel) {
                horizontalTranslation = 0.375F;
            } else if (skullModelBase instanceof AllayHeadModel || skullModelBase instanceof OcelotHeadModel) {
                horizontalTranslation = 0.34375F;
            } else if (skullModelBase instanceof BatHeadModel) {
                horizontalTranslation = 0.434375F;
            } else if (skullModelBase instanceof CamelHeadModel) {
                horizontalTranslation = 0.28125F;
                verticalTranslation = 0.125F;
            } else if (skullModelBase instanceof CaveSpiderHeadModel) {
                horizontalTranslation = 0.325F;
            } else if (skullModelBase instanceof ChickenHeadModel || skullModelBase instanceof ParrotHeadModel) {
                horizontalTranslation = 0.4375F;
            } else if (skullModelBase instanceof CowHeadModel) {
                horizontalTranslation = 0.3125F;
            }
            poseStack.translate(0.5F - (float)direction.getStepX() * horizontalTranslation, verticalTranslation,
                    0.5F - (float)direction.getStepZ() * horizontalTranslation);
        }

        poseStack.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexconsumer = multiBufferSource.getBuffer(renderType);
        skullModelBase.setupAnim(animationProgress, p_173665_, 0.0F);
        if (skullModelBase instanceof SheepHeadModel sheepHeadModel) {
            sheepHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof SpiderHeadModel spiderHeadModel) {
            spiderHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof MooshroomHeadModel mooshroomHeadModel) {
            mooshroomHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else {
            skullModelBase.renderToBuffer(poseStack, vertexconsumer, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        }
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

        builder.put(EffectSkullBlock.Types.ALLAY, new AllayHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ALLAY_HEAD)));
        builder.put(EffectSkullBlock.Types.AXOLOTL_LUCY, new AxolotlHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.AXOLOTL_HEAD)));
        builder.put(EffectSkullBlock.Types.AXOLOTL_WILD, new AxolotlHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.AXOLOTL_HEAD)));
        builder.put(EffectSkullBlock.Types.AXOLOTL_GOLD, new AxolotlHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.AXOLOTL_HEAD)));
        builder.put(EffectSkullBlock.Types.AXOLOTL_CYAN, new AxolotlHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.AXOLOTL_HEAD)));
        builder.put(EffectSkullBlock.Types.AXOLOTL_BLUE, new AxolotlHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.AXOLOTL_HEAD)));
        builder.put(EffectSkullBlock.Types.BAT, new BatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.BAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAMEL, new CamelHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAMEL_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_TABBY, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_BLACK, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_RED, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_SIAMESE, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_BRITISH_SHORTHAIR, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_CALICO, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_PERSIAN, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_RAGDOLL, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_WHITE, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_JELLIE, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAT_ALL_BLACK, new CatHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAT_HEAD)));
        builder.put(EffectSkullBlock.Types.CAVE_SPIDER, new CaveSpiderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CAVE_SPIDER_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_EYES)));
        builder.put(EffectSkullBlock.Types.CHICKEN, new ChickenHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CHICKEN_HEAD)));
        builder.put(EffectSkullBlock.Types.COW, new CowHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.COW_HEAD)));
        builder.put(EffectSkullBlock.Types.GHAST, new GhastHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.GHAST_HEAD)));
        builder.put(EffectSkullBlock.Types.MOOSHROOM_RED, new MooshroomHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.COW_HEAD), Blocks.RED_MUSHROOM.defaultBlockState()));
        builder.put(EffectSkullBlock.Types.MOOSHROOM_BROWN, new MooshroomHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.COW_HEAD), Blocks.BROWN_MUSHROOM.defaultBlockState()));
        builder.put(EffectSkullBlock.Types.OCELOT, new OcelotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.OCELOT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREEN, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREY, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.SHEEP_WHITE, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 0));
        builder.put(EffectSkullBlock.Types.SHEEP_ORANGE, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 1));
        builder.put(EffectSkullBlock.Types.SHEEP_MAGENTA, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 2));
        builder.put(EffectSkullBlock.Types.SHEEP_LIGHT_BLUE, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 3));
        builder.put(EffectSkullBlock.Types.SHEEP_YELLOW, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 4));
        builder.put(EffectSkullBlock.Types.SHEEP_LIME, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 5));
        builder.put(EffectSkullBlock.Types.SHEEP_PINK, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 6));
        builder.put(EffectSkullBlock.Types.SHEEP_GRAY, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 7));
        builder.put(EffectSkullBlock.Types.SHEEP_LIGHT_GRAY, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 8));
        builder.put(EffectSkullBlock.Types.SHEEP_CYAN, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 9));
        builder.put(EffectSkullBlock.Types.SHEEP_PURPLE, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 10));
        builder.put(EffectSkullBlock.Types.SHEEP_BLUE, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 11));
        builder.put(EffectSkullBlock.Types.SHEEP_BROWN, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 12));
        builder.put(EffectSkullBlock.Types.SHEEP_GREEN, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 13));
        builder.put(EffectSkullBlock.Types.SHEEP_RED, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 14));
        builder.put(EffectSkullBlock.Types.SHEEP_BLACK, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 15));
        builder.put(EffectSkullBlock.Types.SHEEP_RAINBOW, new SheepHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SHEEP_HEAD_WOOL), 16));
        builder.put(EffectSkullBlock.Types.SPIDER, new SpiderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_EYES)));
        builder.put(EffectSkullBlock.Types.VEX, new AllayHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ALLAY_HEAD)));
        builder.put(EffectSkullBlock.Types.WITCH, new WitchHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.WITCH_HEAD)));
        ModLoader.get().postEvent(new EntityRenderersEvent.CreateSkullModels(builder, entityModelSet));
        return builder.build();
    }
}
