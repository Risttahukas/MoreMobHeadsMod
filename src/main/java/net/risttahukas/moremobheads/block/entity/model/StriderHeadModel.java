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
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class StriderHeadModel extends SkullModel {
    private final ModelPart rightBottomBristle;
    private final ModelPart rightMiddleBristle;
    private final ModelPart rightTopBristle;
    private final ModelPart leftTopBristle;
    private final ModelPart leftMiddleBristle;
    private final ModelPart leftBottomBristle;

    public StriderHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.rightBottomBristle = modelPart.getChild("head").getChild("right_bottom_bristle");
        this.rightMiddleBristle = modelPart.getChild("head").getChild("right_middle_bristle");
        this.rightTopBristle = modelPart.getChild("head").getChild("right_top_bristle");
        this.leftTopBristle = modelPart.getChild("head").getChild("left_top_bristle");
        this.leftMiddleBristle = modelPart.getChild("head").getChild("left_middle_bristle");
        this.leftBottomBristle = modelPart.getChild("head").getChild("left_bottom_bristle");
    }

    public static MeshDefinition createStriderHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-8.0F, -14.0F, -8.0F, 16.0F, 14.0F, 16.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_bottom_bristle", CubeListBuilder.create().texOffs(16, 65)
                        .addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
                PartPose.offsetAndRotation(-8.0F, -4.0F, -8.0F, 0.0F, 0.0F, -1.2217305F));
        head.addOrReplaceChild("right_middle_bristle", CubeListBuilder.create().texOffs(16, 49)
                        .addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
                PartPose.offsetAndRotation(-8.0F, -9.0F, -8.0F, 0.0F, 0.0F, -1.134464F));
        head.addOrReplaceChild("right_top_bristle", CubeListBuilder.create().texOffs(16, 33)
                        .addBox(-12.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F, true),
                PartPose.offsetAndRotation(-8.0F, -13.0F, -8.0F, 0.0F, 0.0F, -0.87266463F));
        head.addOrReplaceChild("left_top_bristle", CubeListBuilder.create().texOffs(16, 33)
                        .addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F),
                PartPose.offsetAndRotation(8.0F, -14.0F, -8.0F, 0.0F, 0.0F, 0.87266463F));
        head.addOrReplaceChild("left_middle_bristle", CubeListBuilder.create().texOffs(16, 49)
                        .addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F),
                PartPose.offsetAndRotation(8.0F, -10.0F, -8.0F, 0.0F, 0.0F, 1.134464F));
        head.addOrReplaceChild("left_bottom_bristle", CubeListBuilder.create().texOffs(16, 65)
                        .addBox(0.0F, 0.0F, 0.0F, 12.0F, 0.0F, 16.0F),
                PartPose.offsetAndRotation(8.0F, -5.0F, -8.0F, 0.0F, 0.0F, 1.2217305F));

        return meshdefinition;
    }

    public static LayerDefinition createStriderHeadLayer() {
        MeshDefinition meshdefinition = createStriderHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 128);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.rightBottomBristle.zRot = -1.2217305F;
        this.rightMiddleBristle.zRot = -1.134464F;
        this.rightTopBristle.zRot = -0.87266463F;
        this.leftTopBristle.zRot = 0.87266463F;
        this.leftMiddleBristle.zRot = 1.134464F;
        this.leftBottomBristle.zRot = 1.2217305F;
        this.rightBottomBristle.zRot += 0.05F * Mth.sin(animationTickCount * 1.0F * -0.4F);
        this.rightMiddleBristle.zRot += 0.1F * Mth.sin(animationTickCount * 1.0F * 0.2F);
        this.rightTopBristle.zRot += 0.1F * Mth.sin(animationTickCount * 1.0F * 0.4F);
        this.leftTopBristle.zRot += 0.1F * Mth.sin(animationTickCount * 1.0F * 0.4F);
        this.leftMiddleBristle.zRot += 0.1F * Mth.sin(animationTickCount * 1.0F * 0.2F);
        this.leftBottomBristle.zRot += 0.05F * Mth.sin(animationTickCount * 1.0F * -0.4F);
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
