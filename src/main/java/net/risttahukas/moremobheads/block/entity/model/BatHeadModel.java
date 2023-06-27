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
import org.jetbrains.annotations.NotNull;

public class BatHeadModel extends SkullModel {
    public BatHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createBatHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.0F, -6.0F, -3.0F, 6.0F, 6.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(24, 0)
                .addBox(-4.0F, -9.0F, -2.0F, 3.0F, 4.0F, 1.0F), PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(24, 0).mirror()
                .addBox(1.0F, -9.0F, -2.0F, 3.0F, 4.0F, 1.0F), PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createBatHeadLayer() {
        MeshDefinition meshdefinition = createBatHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.35F, 0.35F, 0.35F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
