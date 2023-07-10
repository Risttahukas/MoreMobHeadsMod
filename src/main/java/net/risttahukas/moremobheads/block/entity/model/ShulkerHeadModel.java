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

@OnlyIn(Dist.CLIENT)
public class ShulkerHeadModel extends SkullModel {
    private final ModelPart lid;

    public ShulkerHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.lid = modelPart.getChild("head").getChild("lid");
    }

    public static MeshDefinition createShulkerHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 52)
                        .addBox(-3.0F, -12.0F, -3.0F, 6.0F, 6.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("lid", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-8.0F, -16.0F, -8.0F, 16.0F, 12.0F, 16.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("base", CubeListBuilder.create().texOffs(0, 28)
                        .addBox(-8.0F, -8.0F, -8.0F, 16.0F, 8.0F, 16.0F),
                PartPose.ZERO);

        return meshdefinition;
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        animationTickCount = (animationTickCount / 20.0F);
        float f1 = (0.5F + getPeakAmount(animationTickCount)) * (float)Math.PI;
        float f2 = -1.0F + Mth.sin(f1);
        float f3 = 0.0F;
        if (f1 > (float)Math.PI) {
            f3 = Mth.sin(animationTickCount * 0.1F) * 0.7F;
        }
        this.lid.setPos(0.0F, -8.0F + Mth.sin(f1) * 8.0F + f3, 0.0F);
        if (getPeakAmount(animationTickCount) > 0.3F) {
            this.lid.yRot = f2 * f2 * f2 * f2 * (float)Math.PI * 0.125F;
        } else {
            this.lid.yRot = 0.0F;
        }
    }

    public static LayerDefinition createShulkerHeadLayer() {
        MeshDefinition meshdefinition = createShulkerHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    public float getPeakAmount(float animationTickCount) {
        animationTickCount = animationTickCount % 2;
        if (animationTickCount < 1F) {
            return animationTickCount;
        } else {
            return 2F - animationTickCount;
        }

    }
}
