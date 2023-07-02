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
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;

@OnlyIn(Dist.CLIENT)
public class PhantomHeadModel extends SkullModel {
    private static final ResourceLocation PHANTOM_EYES_LOCATION = new ResourceLocation("textures/entity/phantom_eyes.png");

    public PhantomHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createPhantomHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.5F, -3.0F, -2.5F, 7.0F, 3.0F, 5.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createPhantomHeadLayer() {
        MeshDefinition meshdefinition = createPhantomHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer eyesVertexConsumer = multiBufferSource.getBuffer(ModRenderType.eyesZOffset(PHANTOM_EYES_LOCATION));
        super.renderToBuffer(poseStack, eyesVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
