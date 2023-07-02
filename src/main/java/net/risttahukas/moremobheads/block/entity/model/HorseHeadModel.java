package net.risttahukas.moremobheads.block.entity.model;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.animal.horse.Markings;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class HorseHeadModel extends AbstractHorseHeadModel {
    private static final Map<Markings, ResourceLocation> LOCATION_BY_MARKINGS = Util.make(Maps.newEnumMap(Markings.class), (p_117069_) -> {
        p_117069_.put(Markings.NONE, null);
        p_117069_.put(Markings.WHITE, new ResourceLocation("textures/entity/horse/horse_markings_white.png"));
        p_117069_.put(Markings.WHITE_FIELD, new ResourceLocation("textures/entity/horse/horse_markings_whitefield.png"));
        p_117069_.put(Markings.WHITE_DOTS, new ResourceLocation("textures/entity/horse/horse_markings_whitedots.png"));
        p_117069_.put(Markings.BLACK_DOTS, new ResourceLocation("textures/entity/horse/horse_markings_blackdots.png"));
    });
    private final ModelPart rootMarkings;
    protected final ModelPart headMarkings;
    protected final Markings markings;

    public HorseHeadModel(ModelPart skinModelPart, ModelPart markingsModelPart, Markings markings) {
        super(skinModelPart);
        this.rootMarkings = markingsModelPart;
        this.headMarkings = markingsModelPart.getChild("head");
        this.markings = markings;
    }

    public static LayerDefinition createHorseHeadMarkingsLayer() {
        MeshDefinition meshdefinition = createHorseHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headMarkings.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headMarkings.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(1.1F, 1.1F, 1.1F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        if (this.markings != Markings.NONE) {
            VertexConsumer markingsVertexConsumer = multiBufferSource.getBuffer(ModRenderType.entityTranslucentNoCullZOffset(LOCATION_BY_MARKINGS.get(this.markings)));
            this.rootMarkings.render(poseStack, markingsVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        }
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(1.1F, 1.1F, 1.1F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
