package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class CaveSpiderHeadModel extends SpiderHeadModel {
    public CaveSpiderHeadModel(ModelPart skinModelPart, ModelPart eyesModelPart) {
        super(skinModelPart, eyesModelPart);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource,
                               int p_103817_, int p_103818_,
                               float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.7F, 0.7F, 0.7F);
        super.renderToBuffer(poseStack, vertexConsumer, multiBufferSource, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int p_103817_, int p_103818_,
                               float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.7F, 0.7F, 0.7F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
