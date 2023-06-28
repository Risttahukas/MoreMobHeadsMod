package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.math.Axis;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.BlockRenderDispatcher;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.model.data.ModelData;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class MooshroomHeadModel extends CowHeadModel {
    private final BlockState blockstate;
    protected float rotationAngle = 0.0F;

    public MooshroomHeadModel(ModelPart modelPart, BlockState blockstate) {
        super(modelPart);
        this.blockstate = blockstate;
    }

    @Override
    public void setupAnim(float animationTickCount, float rotationAngle, float p_103813_) {
        super.setupAnim(animationTickCount, rotationAngle, p_103813_);
        this.rotationAngle = rotationAngle;
    }

    @SuppressWarnings("ConstantConditions")
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        BlockRenderDispatcher blockRenderDispatcher = Minecraft.getInstance().getBlockRenderer();
        poseStack.scale(1.0F, -1.0F, 1.0F);
        poseStack.translate(-0.5F, 0.45F, -0.5F);
        float xTranslation = -0.01F * Mth.sin(rotationAngle * ((float)Math.PI / 180F));
        float zTranslation = -0.01F * Mth.cos(rotationAngle * ((float)Math.PI / 180F));
        poseStack.translate(xTranslation, 0.0F, zTranslation);
        poseStack.rotateAround(Axis.YP.rotationDegrees(-78.0F + rotationAngle), 0.5F, 0.0F, 0.5F);
        blockRenderDispatcher.renderSingleBlock(blockstate, poseStack, multiBufferSource, p_103817_, 655360, ModelData.EMPTY, null);
    }
}
