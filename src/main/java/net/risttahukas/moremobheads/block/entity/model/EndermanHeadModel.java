package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;

@OnlyIn(Dist.CLIENT)
public class EndermanHeadModel extends SkullModel {
    private static final ResourceLocation ENDERMAN_EYES_LOCATION = new ResourceLocation("textures/entity/enderman/enderman_eyes.png");
    protected final ModelPart jaw;
    private final ModelPart rootEyes;
    protected final ModelPart headEyes;

    public EndermanHeadModel(ModelPart skinModelPart, ModelPart eyesModelPart) {
        super(skinModelPart);
        this.jaw = skinModelPart.getChild("jaw");
        this.rootEyes = eyesModelPart;
        this.headEyes = eyesModelPart.getChild("head");
    }

    public static MeshDefinition createEndermanHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        partdefinition.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(0, 16)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(-0.5F)),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createEndermanHeadLayer() {
        MeshDefinition meshdefinition = createEndermanHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.jaw.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.jaw.xRot = p_103813_ * ((float)Math.PI / 180F);
        this.headEyes.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headEyes.xRot = p_103813_ * ((float)Math.PI / 180F);
        float headHeight = getHeadHeight(animationTickCount);
        this.head.y = headHeight;
        this.headEyes.y = headHeight;
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer eyesVertexConsumer = multiBufferSource.getBuffer(ModRenderType.eyesZOffset(ENDERMAN_EYES_LOCATION));
        this.rootEyes.render(poseStack, eyesVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    public float getHeadHeight(float animationTickCount) {
        animationTickCount = (animationTickCount / 20.0F) % 10;
        float posUp = -5.0F;
        float posDown = 0.0F;
        if (animationTickCount <= 3.0F) {
            return posDown;
        } if (animationTickCount <= 3.1F) {
            return posUp + (3.1F-animationTickCount) / (3.1F-3.0F) * (posDown-posUp);
        } if (animationTickCount <= 6.9F) {
            return posUp;
        } if (animationTickCount <= 7.0F) {
            return posDown + (7.0F-animationTickCount) / (7.0F-6.9F) * (posUp-posDown);
        }
        return posDown;
    }
}
