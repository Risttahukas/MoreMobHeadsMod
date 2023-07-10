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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class HoglinHeadModel extends SkullModel {
    public HoglinHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createHoglinHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(61, 1)
                        .addBox(-7.0F, -6.0F, -9.5F, 14.0F, 6.0F, 19.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(1, 1)
                        .addBox(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
                PartPose.offsetAndRotation(-6.0F, -5.0F, 6.5F, 0.0F, 0.0F, -0.6981317F));
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(1, 6)
                        .addBox(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F),
                PartPose.offsetAndRotation(6.0F, -5.0F, 6.5F, 0.0F, 0.0F, 0.6981317F));
        head.addOrReplaceChild("right_horn", CubeListBuilder.create().texOffs(10, 13)
                        .addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F),
                PartPose.offset(-7.0F, -1.0F, -2.5F));
        head.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(1, 13)
                        .addBox(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F),
                PartPose.offset(7.0F, -1.0F, -2.5F));
        return meshdefinition;
    }

    public static LayerDefinition createHoglinHeadLayer() {
        MeshDefinition meshdefinition = createHoglinHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 64);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
