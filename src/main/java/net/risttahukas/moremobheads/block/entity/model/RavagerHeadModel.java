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
public class RavagerHeadModel extends SkullModel {
    private final ModelPart mouth;

    public RavagerHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.mouth = this.head.getChild("mouth");
    }

    public static MeshDefinition createRavagerHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-8.0F, -20.0F, -8.0F, 16.0F, 20.0F, 16.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-2.0F, -6.0F, -12.0F, 4.0F, 8.0F, 4.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 36)
                .addBox(-8.0F, 0.0F, -16.0F, 16.0F, 3.0F, 16.0F),
                PartPose.offset(0.0F, -2.0F, 8.0F));
        head.addOrReplaceChild("right_horn", CubeListBuilder.create().texOffs(74, 55)
                .addBox(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F),
                PartPose.offsetAndRotation(-10.0F, -14.0F, -2.0F, 1.0995574F, 0.0F, 0.0F));
        head.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(74, 55).mirror()
                .addBox(0.0F, -14.0F, -2.0F, 2.0F, 14.0F, 4.0F),
                PartPose.offsetAndRotation(8.0F, -14.0F, -2.0F, 1.0995574F, 0.0F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createRavagerHeadLayer() {
        MeshDefinition meshdefinition = createRavagerHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.mouth.xRot = (float)Math.PI * 0.01F;
        this.head.y = -1.5F;
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
