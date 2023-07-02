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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class LlamaHeadModel extends SkullModel {
    private static final Map<String, ResourceLocation> LOCATION_BY_DECOR = Util.make(Maps.newHashMap(), (hashMap) -> {
        hashMap.put("white", new ResourceLocation("textures/entity/llama/decor/white.png"));
        hashMap.put("orange", new ResourceLocation("textures/entity/llama/decor/orange.png"));
        hashMap.put("magenta", new ResourceLocation("textures/entity/llama/decor/magenta.png"));
        hashMap.put("light_blue", new ResourceLocation("textures/entity/llama/decor/light_blue.png"));
        hashMap.put("yellow", new ResourceLocation("textures/entity/llama/decor/yellow.png"));
        hashMap.put("lime", new ResourceLocation("textures/entity/llama/decor/lime.png"));
        hashMap.put("pink", new ResourceLocation("textures/entity/llama/decor/pink.png"));
        hashMap.put("gray", new ResourceLocation("textures/entity/llama/decor/gray.png"));
        hashMap.put("light_gray", new ResourceLocation("textures/entity/llama/decor/light_gray.png"));
        hashMap.put("cyan", new ResourceLocation("textures/entity/llama/decor/cyan.png"));
        hashMap.put("purple", new ResourceLocation("textures/entity/llama/decor/purple.png"));
        hashMap.put("blue", new ResourceLocation("textures/entity/llama/decor/blue.png"));
        hashMap.put("brown", new ResourceLocation("textures/entity/llama/decor/brown.png"));
        hashMap.put("green", new ResourceLocation("textures/entity/llama/decor/green.png"));
        hashMap.put("red", new ResourceLocation("textures/entity/llama/decor/red.png"));
        hashMap.put("black", new ResourceLocation("textures/entity/llama/decor/black.png"));
        hashMap.put("trader", new ResourceLocation("textures/entity/llama/decor/trader_llama.png"));
    });
    private final ModelPart rootDecor;
    protected final ModelPart headDecor;
    protected final String decorColor;

    public LlamaHeadModel(ModelPart skinModelPart, ModelPart decorModelPart, String decorColor) {
        super(skinModelPart);
        this.rootDecor = decorModelPart;
        this.headDecor = decorModelPart.getChild("head");
        this.decorColor = decorColor;
    }

    public static MeshDefinition createLlamaHeadModel(CubeDeformation cubeDeformation) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 14)
                        .addBox(-4.0F, -10.0F, -3.0F, 8.0F, 10.0F, 6.0F, cubeDeformation),
                PartPose.ZERO);
        PartDefinition face = head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-2.0F, -8.0F, -7.0F, 4.0F, 4.0F, 9.0F, cubeDeformation),
                PartPose.ZERO);
        face.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(17, 0)
                .addBox(1.0F, -13.0F, -1.0F, 3.0F, 3.0F, 2.0F, cubeDeformation),
                PartPose.ZERO);
        face.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(17, 0)
                .addBox(-4.0F, -13.0F, -1.0F, 3.0F, 3.0F, 2.0F, cubeDeformation),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createLlamaHeadLayer() {
        MeshDefinition meshdefinition = createLlamaHeadModel(CubeDeformation.NONE);
        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    public static LayerDefinition createLlamaHeadDecorLayer() {
        MeshDefinition meshdefinition = createLlamaHeadModel(new CubeDeformation(0.5F));
        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headDecor.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headDecor.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        if (!this.decorColor.equals("")) {
            VertexConsumer decorVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(LOCATION_BY_DECOR.get(this.decorColor)));
            this.rootDecor.render(poseStack, decorVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        }
    }
}
