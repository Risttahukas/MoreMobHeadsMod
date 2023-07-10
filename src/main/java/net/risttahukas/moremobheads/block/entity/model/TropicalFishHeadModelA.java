package net.risttahukas.moremobheads.block.entity.model;

import com.google.common.collect.Maps;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.Util;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class TropicalFishHeadModelA extends SkullModel {
    private static final Map<String, ResourceLocation> LOCATION_BY_PATTERN = Util.make(Maps.newHashMap(), (hashMap) -> {
        hashMap.put("kob", new ResourceLocation("textures/entity/fish/tropical_a_pattern_1.png"));
        hashMap.put("sunstreak", new ResourceLocation("textures/entity/fish/tropical_a_pattern_2.png"));
    });
    private final ModelPart rootPattern;
    protected final ModelPart headPattern;
    protected final String pattern;
    protected final int dyeID;
    protected final int patternDyeID;

    public TropicalFishHeadModelA(ModelPart skinModelPart, ModelPart patternModelPart, String pattern, int dyeID, int patternDyeID) {
        super(skinModelPart);
        this.rootPattern = patternModelPart;
        this.headPattern = patternModelPart.getChild("head");
        this.pattern = pattern;
        this.dyeID = dyeID;
        this.patternDyeID = patternDyeID;
    }

    public static MeshDefinition createTropicalFishHeadModel(CubeDeformation cubeDeformation) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.0F, -3.0F, -3.0F, 2.0F, 3.0F, 6.0F, cubeDeformation),
                PartPose.ZERO);
        head.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(22, -6)
                        .addBox(0.0F, -3.0F, 3.0F, 0.0F, 3.0F, 6.0F, cubeDeformation),
                PartPose.ZERO);
        head.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(2, 16)
                        .addBox(-2.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, cubeDeformation),
                PartPose.offsetAndRotation(-1.0F, -1.0F, 0.0F, 0.0F, ((float)Math.PI / 4F), 0.0F));
        head.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(2, 12)
                        .addBox(0.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, cubeDeformation),
                PartPose.offsetAndRotation(1.0F, -1.0F, 0.0F, 0.0F, (-(float)Math.PI / 4F), 0.0F));
        head.addOrReplaceChild("top_fin", CubeListBuilder.create().texOffs(10, -5)
                        .addBox(0.0F, -6.0F, -3.0F, 0.0F, 3.0F, 6.0F, cubeDeformation),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createTropicalFishHeadLayer() {
        MeshDefinition meshdefinition = createTropicalFishHeadModel(CubeDeformation.NONE);
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public static LayerDefinition createTropicalFishHeadPatternLayer() {
        MeshDefinition meshdefinition = createTropicalFishHeadModel(new CubeDeformation(0.008F));
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headPattern.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headPattern.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    @SuppressWarnings("unused")
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        float[] afloat1 = DyeColor.byId(dyeID).getTextureDiffuseColors();
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, afloat1[0], afloat1[1], afloat1[2], p_103822_);
        VertexConsumer patternVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(LOCATION_BY_PATTERN.get(this.pattern)));
        float[] afloat2 = DyeColor.byId(patternDyeID).getTextureDiffuseColors();
        this.rootPattern.render(poseStack, patternVertexConsumer, p_103817_, p_103818_, afloat2[0], afloat2[1], afloat2[2], p_103822_);
    }

}
