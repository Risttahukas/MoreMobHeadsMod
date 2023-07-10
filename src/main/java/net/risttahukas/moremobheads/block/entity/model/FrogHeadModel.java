package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class FrogHeadModel extends SkullModel {
    private final ModelPart croakingBody;

    public FrogHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.croakingBody = modelPart.getChild("head").getChild("croaking_body");
    }

    public static MeshDefinition createFrogHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(3, 1)
                        .addBox(-3.5F, -3.0F, -4.5F, 7.0F, 3.0F, 9.0F)
                        .texOffs(23, 22)
                        .addBox(-3.5F, -2.0F, -4.5F, 7.0F, 0.0F, 9.0F),
                PartPose.ZERO);
        PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(23, 13)
                        .addBox(-3.5F, -1.0F, -7.0F, 7.0F, 0.0F, 9.0F)
                        .texOffs(0, 13)
                        .addBox(-3.5F, -2.0F, -7.0F, 7.0F, 3.0F, 9.0F),
                PartPose.offset(0.0F, -3.0F, 2.5F));
        head.addOrReplaceChild("tongue", CubeListBuilder.create().texOffs(17, 13)
                        .addBox(-2.0F, 0.0F, -7.1F, 4.0F, 0.0F, 7.0F),
                PartPose.offset(0.0F, -2.01F, 4.5F));
        face.addOrReplaceChild("right_eye", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F),
                PartPose.offset(-2.0F, -3.0F, -4.5F));
        face.addOrReplaceChild("left_eye", CubeListBuilder.create().texOffs(0, 5)
                        .addBox(-1.5F, -1.0F, -1.5F, 3.0F, 2.0F, 3.0F),
                PartPose.offset(2.0F, -3.0F, -4.5F));
        head.addOrReplaceChild("croaking_body", CubeListBuilder.create().texOffs(26, 5)
                        .addBox(-3.5F, -0.1F, -2.9F, 7.0F, 2.0F, 3.0F, new CubeDeformation(-0.1F)),
                PartPose.offset(0.0F, -3.0F, -1.5F));
        return meshdefinition;
    }

    public static LayerDefinition createFrogHeadLayer() {
        MeshDefinition meshdefinition = createFrogHeadModel();
        return LayerDefinition.create(meshdefinition, 48, 48);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        Vec3 croakingBodyScale = getCroakingBodyScale(animationTickCount);
        croakingBody.xScale = (float) croakingBodyScale.x;
        croakingBody.yScale = (float) croakingBodyScale.y;
        croakingBody.zScale = (float) croakingBodyScale.z;
    }

    public Vec3 getCroakingBodyScale(float animationTickCount) {
        animationTickCount = (animationTickCount / 20.0F) % 3;
        Vec3 scaleZero = new Vec3(0.0, 0.0, 0.0);
        Vec3 scaleNorm = new Vec3(1.0, 1.0, 1.0);
        Vec3 scaleLarge = new Vec3(1.3, 2.1, 1.6);
        if (animationTickCount <= 0.375) {
            return scaleZero;
        } if (animationTickCount <= 0.4167F) {
            return scaleNorm.add((scaleZero.subtract(scaleNorm)).scale((0.4167F-animationTickCount) / (0.4167F-0.375)));
        } if (animationTickCount <= 0.4583F) {
            return scaleNorm;
        } if (animationTickCount <= 0.5417F) {
            return scaleLarge.add((scaleNorm.subtract(scaleLarge)).scale((0.5417F-animationTickCount) / (0.5417F-0.4583F)));
        } if (animationTickCount <= 0.625F) {
            return scaleLarge;
        } if (animationTickCount <= 0.7083F) {
            return scaleNorm.add((scaleLarge.subtract(scaleNorm)).scale((0.7083F-animationTickCount) / (0.7083F-0.625F)));
        } if (animationTickCount <= 2.25F) {
            return scaleNorm;
        } if (animationTickCount <= 2.3333F) {
            return scaleLarge.add((scaleNorm.subtract(scaleLarge)).scale((2.3333F-animationTickCount) / (2.3333F-2.25F)));
        } if (animationTickCount <= 2.4167F) {
            return scaleLarge;
        } if (animationTickCount <= 2.5F) {
            return scaleNorm.add((scaleLarge.subtract(scaleNorm)).scale((2.5F-animationTickCount) / (2.5F-2.4167F)));
        } if (animationTickCount <= 2.5833F) {
            return scaleNorm;
        } if (animationTickCount <= 2.6667F) {
            return scaleLarge.add((scaleNorm.subtract(scaleLarge)).scale((2.6667F-animationTickCount) / (2.6667F-2.5833F)));
        } if (animationTickCount <= 2.875F) {
            return scaleLarge;
        } if (animationTickCount <= 2.9583F) {
            return scaleNorm.add((scaleLarge.subtract(scaleNorm)).scale((2.9583F-animationTickCount) / (2.9583F-2.875F)));
        } if (animationTickCount <= 3.0F) {
            return scaleZero.add((scaleNorm.subtract(scaleZero)).scale((3.0F-animationTickCount) / (3.0F-2.9583F)));
        }
        return scaleZero;
    }
}
