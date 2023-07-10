package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class BeeHeadModel extends SkullModel {
    private final ModelPart rightWing;
    private final ModelPart leftWing;
    private final ModelPart frontLeg;
    private final ModelPart midLeg;
    private final ModelPart backLeg;

    public BeeHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.rightWing = modelPart.getChild("head").getChild("right_wing");
        this.leftWing = modelPart.getChild("head").getChild("left_wing");
        this.frontLeg = modelPart.getChild("head").getChild("front_legs");
        this.midLeg = modelPart.getChild("head").getChild("middle_legs");
        this.backLeg = modelPart.getChild("head").getChild("back_legs");
    }

    public static MeshDefinition createBeeHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.5F, -7.0F, -5.0F, 7.0F, 7.0F, 10.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("stinger", CubeListBuilder.create().texOffs(26, 7)
                        .addBox(0.0F, -4.0F, 5.0F, 0.0F, 1.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_antenna", CubeListBuilder.create().texOffs(2, 0)
                        .addBox(1.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F),
                PartPose.offset(0.0F, -5.0F, -5.0F));
        head.addOrReplaceChild("right_antenna", CubeListBuilder.create().texOffs(2, 3)
                        .addBox(-2.5F, -2.0F, -3.0F, 1.0F, 2.0F, 3.0F),
                PartPose.offset(0.0F, -5.0F, -5.0F));
        CubeDeformation cubedeformation = new CubeDeformation(0.001F);
        head.addOrReplaceChild("right_wing", CubeListBuilder.create().texOffs(0, 18)
                        .addBox(-9.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, cubedeformation),
                PartPose.offsetAndRotation(-1.5F, -7.0F, -3.0F, 0.0F, -0.2618F, 0.0F));
        head.addOrReplaceChild("left_wing", CubeListBuilder.create().texOffs(0, 18).mirror()
                        .addBox(0.0F, 0.0F, 0.0F, 9.0F, 0.0F, 6.0F, cubedeformation),
                PartPose.offsetAndRotation(1.5F, -7.0F, -3.0F, 0.0F, 0.2618F, 0.0F));
        head.addOrReplaceChild("front_legs", CubeListBuilder.create()
                        .addBox("front_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 1),
                PartPose.offset(1.5F, 0.0F, -2.0F));
        head.addOrReplaceChild("middle_legs", CubeListBuilder.create()
                        .addBox("middle_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 3),
                PartPose.offset(1.5F, 0.0F, 0.0F));
        head.addOrReplaceChild("back_legs", CubeListBuilder.create()
                        .addBox("back_legs", -5.0F, 0.0F, 0.0F, 7, 2, 0, 26, 5),
                PartPose.offset(1.5F, 0.0F, 2.0F));
        return meshdefinition;
    }

    public static LayerDefinition createBeeHeadLayer() {
        MeshDefinition meshdefinition = createBeeHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.frontLeg.xRot = ((float)Math.PI / 4F);
        this.midLeg.xRot = ((float)Math.PI / 4F);
        this.backLeg.xRot = ((float)Math.PI / 4F);
        float f = animationTickCount * 120.32113F * ((float)Math.PI / 180F);
        this.rightWing.yRot = 0.0F;
        this.rightWing.zRot = Mth.cos(f) * (float)Math.PI * 0.15F;
        this.leftWing.yRot = 0.0F;
        this.leftWing.zRot = -this.rightWing.zRot;
    }
}
