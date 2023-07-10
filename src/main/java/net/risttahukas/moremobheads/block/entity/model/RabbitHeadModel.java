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
public class RabbitHeadModel extends SkullModel {

    public RabbitHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createRabbitHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0)
                        .addBox(-2.5F, -4.0F, -2.5F, 5.0F, 4.0F, 5.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(32, 9)
                        .addBox(-0.5F, -2.5F, -3.0F, 1.0F, 1.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(52, 0)
                        .addBox(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F),
                PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.0F, -0.2617994F, 0.0F));
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(58, 0)
                        .addBox(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F),
                PartPose.offsetAndRotation(0.0F, 0.0F, 2.5F, 0.0F, 0.2617994F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createRabbitHeadLayer() {
        MeshDefinition meshdefinition = createRabbitHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.56666666F, 0.56666666F, 0.56666666F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
