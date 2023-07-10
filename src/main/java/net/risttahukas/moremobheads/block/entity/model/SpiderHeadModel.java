package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;

@OnlyIn(Dist.CLIENT)
public class SpiderHeadModel extends SkullModel {
    private static final ResourceLocation SPIDER_EYES_LOCATION = new ResourceLocation("textures/entity/spider_eyes.png");
    private final ModelPart rootEyes;
    protected final ModelPart headEyes;

    public SpiderHeadModel(ModelPart skinModelPart, ModelPart eyesModelPart) {
        super(skinModelPart);
        this.rootEyes = eyesModelPart;
        this.headEyes = eyesModelPart.getChild("head");
    }

    public static MeshDefinition createSpiderHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 4)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static MeshDefinition createSpiderHeadEyesModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 4)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createSpiderHeadLayer() {
        MeshDefinition meshdefinition = createSpiderHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public static LayerDefinition createSpiderHeadEyesLayer() {
        MeshDefinition meshdefinition = createSpiderHeadEyesModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headEyes.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headEyes.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer eyesVertexConsumer = multiBufferSource.getBuffer(ModRenderType.eyesZOffset(SPIDER_EYES_LOCATION));
        this.rootEyes.render(poseStack, eyesVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
