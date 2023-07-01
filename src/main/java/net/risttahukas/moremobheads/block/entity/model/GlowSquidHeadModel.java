package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class GlowSquidHeadModel extends SquidHeadModel {
    ResourceLocation GLOW_SQUID_LOCATION = new ResourceLocation("textures/entity/squid/glow_squid.png");

    public GlowSquidHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer glowVertexConsumer = multiBufferSource.getBuffer(ModRenderType.entityTranslucentEmissiveZOffset(GLOW_SQUID_LOCATION));
        poseStack.scale(2.0F, 2.0F, 2.0F);
        super.renderToBuffer(poseStack, glowVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
