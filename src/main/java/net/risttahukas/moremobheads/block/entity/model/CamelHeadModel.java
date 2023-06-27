package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class CamelHeadModel extends SkullModel {
    protected final ModelPart left_ear;
    protected final ModelPart right_ear;

    public CamelHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.left_ear = modelPart.getChild("head").getChild("left_ear");
        this.right_ear = modelPart.getChild("head").getChild("right_ear");
    }

    public static MeshDefinition createCamelHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(21, 0)
                        .addBox(-3.5F, -14.0F, -3.5F, 7.0F, 14.0F, 7.0F)
                        .texOffs(21, 0)
                        .addBox(-3.5F, 0.0F, -3.5F, 7.0F, 0.0F, 7.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(50, 0)
                        .addBox(-2.5F, -14.0F, -9.5F, 5.0F, 5.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(45, 0)
                .addBox(-0.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
                PartPose.offset(3.0F, -14.0F, 2.0F));
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(67, 0).
                addBox(-2.5F, 0.5F, -1.0F, 3.0F, 1.0F, 2.0F),
                PartPose.offset(-3.0F, -14.0F, 2.0F));
        return meshdefinition;
    }

    public static LayerDefinition createCamelHeadLayer() {
        MeshDefinition meshdefinition = createCamelHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        float earAngle = getEarAngle(animationTickCount) * ((float)Math.PI / 180F);
        this.right_ear.zRot = earAngle;
        this.left_ear.zRot = -earAngle;
    }

    public float getEarAngle(float animationTickCount) {
        animationTickCount = (animationTickCount / 20.0F) % 4;
        float posUp = 45.0F;
        float posDown = -22.5F;
        if (animationTickCount <= 2.5F) {
            return posUp;
        } if (animationTickCount <= 2.625F) {
            return posDown + (2.625F-animationTickCount) / (2.625F-2.5F) * (posUp-posDown);
        } if (animationTickCount <= 2.75F) {
            return posUp + (2.75F-animationTickCount) / (2.75F-2.625F) * (posDown-posUp);
        } if (animationTickCount <= 2.875F) {
            return posDown + (2.875F-animationTickCount) / (2.875F-2.75F) * (posUp-posDown);
        } if (animationTickCount <= 3.0F) {
            return posUp + (3.0F-animationTickCount) / (3.0F-2.875F) * (posDown-posUp);
        }
        return posUp;
    }
}
