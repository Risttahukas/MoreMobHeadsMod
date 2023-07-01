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
import net.minecraft.world.entity.animal.horse.Markings;
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
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.BLAZE, new ResourceLocation("textures/entity/blaze.png"));
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
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.CREEPER_CHARGED, new ResourceLocation("textures/entity/creeper/creeper.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.DOLPHIN, new ResourceLocation("textures/entity/dolphin.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.DONKEY, new ResourceLocation("textures/entity/horse/donkey.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.DROWNED, new ResourceLocation("textures/entity/zombie/drowned.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.ENDERMAN, new ResourceLocation("textures/entity/enderman/enderman.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.EVOKER, new ResourceLocation("textures/entity/illager/evoker.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.GHAST, new ResourceLocation("textures/entity/ghast/ghast.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_WHITE, new ResourceLocation("textures/entity/horse/horse_white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CREAMY, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CHESTNUT, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BROWN, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BLACK, new ResourceLocation("textures/entity/horse/horse_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_GRAY, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_DARK_BROWN, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE, new ResourceLocation("textures/entity/horse/horse_white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE, new ResourceLocation("textures/entity/horse/horse_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_WHITE_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CREAMY_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_creamy.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_CHESTNUT_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_chestnut.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BROWN_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_BLACK_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_GRAY_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_gray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_darkbrown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_ZOMBIE, new ResourceLocation("textures/entity/horse/horse_zombie.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HORSE_SKELETON, new ResourceLocation("textures/entity/horse/horse_skeleton.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.HUSK, new ResourceLocation("textures/entity/zombie/husk.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.ILLUSIONER, new ResourceLocation("textures/entity/illager/illusioner.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.IRON_GOLEM, new ResourceLocation("textures/entity/iron_golem/iron_golem.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MAGMA_CUBE, new ResourceLocation("textures/entity/slime/magmacube.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MOOSHROOM_RED, new ResourceLocation("textures/entity/cow/red_mooshroom.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MOOSHROOM_BROWN, new ResourceLocation("textures/entity/cow/brown_mooshroom.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.MULE, new ResourceLocation("textures/entity/horse/mule.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.OCELOT, new ResourceLocation("textures/entity/cat/ocelot.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA, new ResourceLocation("textures/entity/panda/panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_AGGRESSIVE, new ResourceLocation("textures/entity/panda/aggressive_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_LAZY, new ResourceLocation("textures/entity/panda/lazy_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_WORRIED, new ResourceLocation("textures/entity/panda/worried_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_PLAYFUL, new ResourceLocation("textures/entity/panda/playful_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_WEAK, new ResourceLocation("textures/entity/panda/weak_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PANDA_BROWN, new ResourceLocation("textures/entity/panda/brown_panda.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ResourceLocation("textures/entity/parrot/parrot_red_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_BLUE, new ResourceLocation("textures/entity/parrot/parrot_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREEN, new ResourceLocation("textures/entity/parrot/parrot_green.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ResourceLocation("textures/entity/parrot/parrot_yellow_blue.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PARROT_GREY, new ResourceLocation("textures/entity/parrot/parrot_grey.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PHANTOM, new ResourceLocation("textures/entity/phantom.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PILLAGER, new ResourceLocation("textures/entity/illager/pillager.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.POLAR_BEAR, new ResourceLocation("textures/entity/bear/polarbear.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.PUFFERFISH, new ResourceLocation("textures/entity/fish/pufferfish.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_BROWN, new ResourceLocation("textures/entity/rabbit/brown.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_WHITE, new ResourceLocation("textures/entity/rabbit/white.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_BLACK, new ResourceLocation("textures/entity/rabbit/black.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_WHITE_SPLOTCHED, new ResourceLocation("textures/entity/rabbit/white_splotched.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_GOLD, new ResourceLocation("textures/entity/rabbit/gold.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_SALT, new ResourceLocation("textures/entity/rabbit/salt.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_CAERBANNOG, new ResourceLocation("textures/entity/rabbit/caerbannog.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RABBIT_TOAST, new ResourceLocation("textures/entity/rabbit/toast.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.RAVAGER, new ResourceLocation("textures/entity/illager/ravager.png"));
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
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SLIME, new ResourceLocation("textures/entity/slime/slime.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SNOW_GOLEM, new ResourceLocation("textures/entity/snow_golem.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.SPIDER, new ResourceLocation("textures/entity/spider/spider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.STRAY, new ResourceLocation("textures/entity/skeleton/stray.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.STRIDER, new ResourceLocation("textures/entity/strider/strider.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.STRIDER_COLD, new ResourceLocation("textures/entity/strider/strider_cold.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.VEX, new ResourceLocation("textures/entity/illager/vex.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.VINDICATOR, new ResourceLocation("textures/entity/illager/vindicator.png"));
        SKIN_BY_TYPE.put(EffectSkullBlock.Types.WARDEN, new ResourceLocation("textures/entity/warden/warden.png"));
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
        SkullBlock.Type skullBlock$type = ((AbstractSkullBlock)blockstate.getBlock()).getType();
        SkullModelBase skullmodelbase = this.modelByType.get(skullBlock$type);
        RenderType rendertype = getRenderType(skullBlock$type, skullBlockEntity.getOwnerProfile());
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
            } else if (skullModelBase instanceof AllayHeadModel || skullModelBase instanceof OcelotHeadModel ||
                    skullModelBase instanceof WardenHeadModel || skullModelBase instanceof PhantomHeadModel) {
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
            } else if (skullModelBase instanceof CowHeadModel || skullModelBase instanceof DolphinHeadModel) {
                horizontalTranslation = 0.3125F;
            } else if (skullModelBase instanceof DonkeyHeadModel) {
                horizontalTranslation = 0.3096875F;
            } else if (skullModelBase instanceof MuleHeadModel) {
                horizontalTranslation = 0.29875F;
            } else if (skullModelBase instanceof HorseHeadModel) {
                horizontalTranslation = 0.259375F;
                verticalTranslation = 0.1875F;
            } else if (skullModelBase instanceof AbstractHorseHeadModel || skullModelBase instanceof PolarBearHeadModel ||
                    skullModelBase instanceof SnowGolemHeadModel) {
                horizontalTranslation = 0.28125F;
            } else if (skullModelBase instanceof PandaHeadModel) {
                horizontalTranslation = 0.21875F;
            } else if (skullModelBase instanceof RabbitHeadModel) {
                horizontalTranslation = 0.411458334F;
            } else if (skullModelBase instanceof HuskHeadModel) {
                horizontalTranslation = 0.234375F;
            } else if (skullModelBase instanceof RavagerHeadModel) {
                verticalTranslation = 0.203125F;
            }
            poseStack.translate(0.5F - (float)direction.getStepX() * horizontalTranslation, verticalTranslation,
                    0.5F - (float)direction.getStepZ() * horizontalTranslation);
        }

        poseStack.scale(-1.0F, -1.0F, 1.0F);
        VertexConsumer vertexconsumer = multiBufferSource.getBuffer(renderType);
        skullModelBase.setupAnim(animationProgress, p_173665_, 0.0F);
        if (skullModelBase instanceof ChargedCreeperHeadModel chargedCreeperHeadModel) {
            chargedCreeperHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof DrownedHeadModel drownedHeadModel) {
            drownedHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof EndermanHeadModel endermanHeadModel) {
            endermanHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof HorseHeadModel horseHeadModel) {
            horseHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof MooshroomHeadModel mooshroomHeadModel) {
            mooshroomHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof PhantomHeadModel phantomHeadModel) {
            phantomHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof SheepHeadModel sheepHeadModel) {
            sheepHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof SlimeHeadModel slimeHeadModel) {
            slimeHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof SpiderHeadModel spiderHeadModel) {
            spiderHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof StraySkullModel straySkullModel) {
            straySkullModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
        } else if (skullModelBase instanceof WardenHeadModel wardenHeadModel) {
            wardenHeadModel.renderToBuffer(poseStack, vertexconsumer, multiBufferSource, p_173669_, OverlayTexture.NO_OVERLAY, 1.0F, 1.0F, 1.0F, 1.0F);
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
        builder.put(EffectSkullBlock.Types.BLAZE, new SkullModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.MOB_SKULL)));
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
        builder.put(EffectSkullBlock.Types.CREEPER_CHARGED, new ChargedCreeperHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.MOB_SKULL), entityModelSet.bakeLayer(ModBlockEntityModelLayers.CREEPER_HEAD_CHARGE)));
        builder.put(EffectSkullBlock.Types.DOLPHIN, new DolphinHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.DOLPHIN_HEAD)));
        builder.put(EffectSkullBlock.Types.DONKEY, new DonkeyHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CHESTED_HORSE_HEAD)));
        builder.put(EffectSkullBlock.Types.DROWNED, new DrownedHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HUMANOID_SKULL), entityModelSet.bakeLayer(ModBlockEntityModelLayers.DROWNED_HEAD_CLOTHES)));
        builder.put(EffectSkullBlock.Types.ENDERMAN, new EndermanHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ENDERMAN_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.ENDERMAN_HEAD)));
        builder.put(EffectSkullBlock.Types.EVOKER, new IllagerHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ILLAGER_HEAD)));
        builder.put(EffectSkullBlock.Types.GHAST, new GhastHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.GHAST_HEAD)));
        builder.put(EffectSkullBlock.Types.HORSE_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_CREAMY, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_CHESTNUT, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_BROWN, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_BLACK, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_GRAY, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_DARK_BROWN, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.NONE));
        builder.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE));
        builder.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_FIELD, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_FIELD));
        builder.put(EffectSkullBlock.Types.HORSE_WHITE_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_CREAMY_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_BROWN_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_BLACK_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_GRAY_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.WHITE_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_WHITE_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_CREAMY_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_CHESTNUT_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_BROWN_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_BLACK_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_GRAY_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_DARK_BROWN_BLACK_DOTS, new HorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD_MARKINGS), Markings.BLACK_DOTS));
        builder.put(EffectSkullBlock.Types.HORSE_ZOMBIE, new AbstractHorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD)));
        builder.put(EffectSkullBlock.Types.HORSE_SKELETON, new AbstractHorseHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HORSE_HEAD)));
        builder.put(EffectSkullBlock.Types.HUSK, new HuskHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.HUMANOID_SKULL)));
        builder.put(EffectSkullBlock.Types.ILLUSIONER, new IllagerHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ILLAGER_HEAD)));
        builder.put(EffectSkullBlock.Types.IRON_GOLEM, new IronGolemHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.IRON_GOLEM_HEAD)));
        builder.put(EffectSkullBlock.Types.MAGMA_CUBE, new MagmaCubeHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.MAGMA_CUBE_HEAD)));
        builder.put(EffectSkullBlock.Types.MOOSHROOM_RED, new MooshroomHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.COW_HEAD), Blocks.RED_MUSHROOM.defaultBlockState()));
        builder.put(EffectSkullBlock.Types.MOOSHROOM_BROWN, new MooshroomHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.COW_HEAD), Blocks.BROWN_MUSHROOM.defaultBlockState()));
        builder.put(EffectSkullBlock.Types.MULE, new MuleHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.CHESTED_HORSE_HEAD)));
        builder.put(EffectSkullBlock.Types.OCELOT, new OcelotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.OCELOT_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_AGGRESSIVE, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_LAZY, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_WORRIED, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_PLAYFUL, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_WEAK, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PANDA_BROWN, new PandaHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PANDA_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_RED_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREEN, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_YELLOW_BLUE, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PARROT_GREY, new ParrotHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PARROT_HEAD)));
        builder.put(EffectSkullBlock.Types.PHANTOM, new PhantomHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PHANTOM_HEAD)));
        builder.put(EffectSkullBlock.Types.PILLAGER, new IllagerHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ILLAGER_HEAD)));
        builder.put(EffectSkullBlock.Types.POLAR_BEAR, new PolarBearHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.POLAR_BEAR_HEAD)));
        builder.put(EffectSkullBlock.Types.PUFFERFISH, new PufferfishHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.PUFFERFISH_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_BROWN, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_WHITE, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_BLACK, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_WHITE_SPLOTCHED, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_GOLD, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_SALT, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_CAERBANNOG, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RABBIT_TOAST, new RabbitHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RABBIT_HEAD)));
        builder.put(EffectSkullBlock.Types.RAVAGER, new RavagerHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.RAVAGER_HEAD)));
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
        builder.put(EffectSkullBlock.Types.SLIME, new SlimeHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SLIME_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SLIME_HEAD_OUTER_LAYER)));
        builder.put(EffectSkullBlock.Types.SNOW_GOLEM, new SnowGolemHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SNOW_GOLEM_HEAD)));
        builder.put(EffectSkullBlock.Types.SPIDER, new SpiderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.SPIDER_EYES)));
        builder.put(EffectSkullBlock.Types.STRAY, new StraySkullModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.MOB_SKULL), entityModelSet.bakeLayer(ModBlockEntityModelLayers.STRAY_SKULL_CLOTHES)));
        builder.put(EffectSkullBlock.Types.STRIDER, new StriderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.STRIDER_HEAD)));
        builder.put(EffectSkullBlock.Types.STRIDER_COLD, new StriderHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.STRIDER_HEAD)));
        builder.put(EffectSkullBlock.Types.VEX, new AllayHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ALLAY_HEAD)));
        builder.put(EffectSkullBlock.Types.VINDICATOR, new IllagerHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.ILLAGER_HEAD)));
        builder.put(EffectSkullBlock.Types.WARDEN, new WardenHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.WARDEN_HEAD), entityModelSet.bakeLayer(ModBlockEntityModelLayers.WARDEN_HEAD_EMISSIVE)));
        builder.put(EffectSkullBlock.Types.WITCH, new WitchHeadModel(entityModelSet.bakeLayer(ModBlockEntityModelLayers.WITCH_HEAD)));
        ModLoader.get().postEvent(new EntityRenderersEvent.CreateSkullModels(builder, entityModelSet));
        return builder.build();
    }
}
