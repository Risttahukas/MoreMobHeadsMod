package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PufferfishHeadModel extends SkullModel {
    private final ModelPart leftBlueFin;
    private final ModelPart rightBlueFin;

    public PufferfishHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.leftBlueFin = modelPart.getChild("head").getChild("left_blue_fin");
        this.rightBlueFin = modelPart.getChild("head").getChild("right_blue_fin");
    }

    public static MeshDefinition createPufferfishHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_blue_fin", CubeListBuilder.create().texOffs(24, 0)
                .addBox(-2.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
                PartPose.offset(-4.0F, -7.0F, -2.0F));
        head.addOrReplaceChild("left_blue_fin", CubeListBuilder.create().texOffs(24, 3)
                .addBox(0.0F, 0.0F, -1.0F, 2.0F, 1.0F, 2.0F),
                PartPose.offset(4.0F, -7.0F, -2.0F));
        head.addOrReplaceChild("top_front_fin", CubeListBuilder.create().texOffs(15, 17)
                .addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, -8.0F, -4.0F, ((float)Math.PI / 4F), 0.0F, 0.0F));
        head.addOrReplaceChild("top_middle_fin", CubeListBuilder.create().texOffs(14, 16)
                .addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 1.0F),
                PartPose.offset(0.0F, -8.0F, 0.0F));
        head.addOrReplaceChild("top_back_fin", CubeListBuilder.create().texOffs(23, 18)
                .addBox(-4.0F, -1.0F, 0.0F, 8.0F, 1.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, -8.0F, 4.0F, (-(float)Math.PI / 4F), 0.0F, 0.0F));
        head.addOrReplaceChild("right_front_fin", CubeListBuilder.create().texOffs(5, 17)
                .addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(-4.0F, 0.0F, -4.0F, 0.0F, (-(float)Math.PI / 4F), 0.0F));
        head.addOrReplaceChild("left_front_fin", CubeListBuilder.create().texOffs(1, 17)
                .addBox(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(4.0F, 0.0F, -4.0F, 0.0F, ((float)Math.PI / 4F), 0.0F));
        head.addOrReplaceChild("bottom_front_fin", CubeListBuilder.create().texOffs(15, 20)
                .addBox(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, 0.0F, -4.0F, (-(float)Math.PI / 4F), 0.0F, 0.0F));
        head.addOrReplaceChild("bottom_middle_fin", CubeListBuilder.create().texOffs(15, 20)
                .addBox(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F),
                PartPose.offset(0.0F, 0.0F, 0.0F));
        head.addOrReplaceChild("bottom_back_fin", CubeListBuilder.create().texOffs(15, 20)
                .addBox(-4.0F, 0.0F, 0.0F, 8.0F, 1.0F, 0.0F),
                PartPose.offsetAndRotation(0.0F, 0.0F, 4.0F, ((float)Math.PI / 4F), 0.0F, 0.0F));
        head.addOrReplaceChild("right_back_fin", CubeListBuilder.create().texOffs(9, 17)
                .addBox(-1.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(-4.0F, 0.0F, 4.0F, 0.0F, ((float)Math.PI / 4F), 0.0F));
        head.addOrReplaceChild("left_back_fin", CubeListBuilder.create().texOffs(9, 17)
                .addBox(0.0F, -8.0F, 0.0F, 1.0F, 8.0F, 0.0F),
                PartPose.offsetAndRotation(4.0F, 0.0F, 4.0F, 0.0F, (-(float)Math.PI / 4F), 0.0F));

        return meshdefinition;
    }

    public static LayerDefinition createPufferfishHeadLayer() {
        MeshDefinition meshdefinition = createPufferfishHeadModel();
        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.rightBlueFin.zRot = -0.2F + 0.4F * Mth.sin(animationTickCount * 0.2F);
        this.leftBlueFin.zRot = 0.2F - 0.4F * Mth.sin(animationTickCount * 0.2F);
    }
}
