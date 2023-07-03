package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SnifferHeadModel extends SkullModel {
    protected final ModelPart left_ear;
    protected final ModelPart right_ear;
    protected final ModelPart nose;

    public SnifferHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.left_ear = modelPart.getChild("head").getChild("left_ear");
        this.right_ear = modelPart.getChild("head").getChild("right_ear");
        this.nose = modelPart.getChild("head").getChild("nose");
    }

    public static MeshDefinition createSnifferHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(8, 15)
                        .addBox(-6.5F, -15.0F, -3.0F, 13.0F, 18.0F, 11.0F)
                        .texOffs(8, 4)
                        .addBox(-6.5F, 0.0F, -3.0F, 13.0F, 0.0F, 11.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(2, 0)
                .addBox(0.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F),
                PartPose.offset(6.51F, -15.0F, 3.99F));
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(48, 0)
                .addBox(-1.0F, 0.0F, -3.0F, 1.0F, 19.0F, 7.0F),
                PartPose.offset(-6.51F, -15.0F, 3.99F));
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(10, 45)
                .addBox(-6.5F, -2.0F, -9.0F, 13.0F, 2.0F, 9.0F),
                PartPose.offset(0.0F, -12.0F, -3.0F));
        head.addOrReplaceChild("lower_beak", CubeListBuilder.create().texOffs(10, 57)
                .addBox(-6.5F, -7.0F, -8.0F, 13.0F, 12.0F, 9.0F),
                PartPose.offset(0.0F, -5.0F, -4.0F));
        return meshdefinition;
    }

    public static LayerDefinition createSnifferHeadLayer() {
        MeshDefinition meshdefinition = createSnifferHeadModel();
        return LayerDefinition.create(meshdefinition, 192, 192);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.nose.yScale = getNoseVerticalScale(animationTickCount);
        float earAngle = getEarAngle(animationTickCount) * ((float)Math.PI / 180F);
        this.right_ear.zRot = earAngle;
        this.left_ear.zRot = -earAngle;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    public float getNoseVerticalScale(float animationTickCount) {
        animationTickCount = (animationTickCount / 20.0F) % 4;
        float posUpper = 3.0F;
        float posUp = 2.5F;
        float posNorm = 1.0F;
        float posDown = 0.5F;
        if (animationTickCount <= 0.5417F) {
            return posNorm;
        } if (animationTickCount <= 0.5833F) {
            return posDown + (0.5833F-animationTickCount) / (0.5833F-0.5417F) * (posNorm-posDown);
        } if (animationTickCount <= 0.6667F) {
            return posUp + (0.6667F-animationTickCount) / (0.6667F-0.5833F) * (posDown-posUp);
        } if (animationTickCount <= 0.7917F) {
            return posNorm + (0.7917F-animationTickCount) / (0.7917F-0.6667F) * (posUp-posNorm);
        } if (animationTickCount <= 0.9167F) {
            return posNorm;
        } if (animationTickCount <= 1.0F) {
            return posUpper + (1.0F-animationTickCount) / (1.0F-0.9167F) * (posNorm-posUpper);
        }if (animationTickCount <= 1.125F) {
            return posNorm + (1.125F-animationTickCount) / (1.125F-1.0F) * (posUpper-posNorm);
        }
        return posNorm;
    }

    public float getEarAngle(float animationTickCount) {
        animationTickCount = (animationTickCount / 20.0F) % 2;
        float posUp = 7.5F;
        float posDown = 2.5F;
        if (animationTickCount <= 0.0F) {
            return posDown;
        } if (animationTickCount <= 0.5F) {
            return posUp + (0.5F-animationTickCount) / 0.5F * (posDown-posUp);
        } if (animationTickCount <= 1.0F) {
            return posDown + (1.0F-animationTickCount) / (1.0F-0.5F) * (posUp-posDown);
        } if (animationTickCount <= 1.5F) {
            return posUp + (1.5F-animationTickCount) / (1.5F-1.0F) * (posDown-posUp);
        } if (animationTickCount <= 2.0F) {
            return posDown + (2.0F-animationTickCount) / (2.0F-1.5F) * (posUp-posDown);
        }
        return posDown;
    }
}
