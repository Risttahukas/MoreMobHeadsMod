package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class StraySkullModel extends SkullModel {
    private static final ResourceLocation STRAY_CLOTHES_LOCATION = new ResourceLocation("textures/entity/skeleton/stray_overlay.png");
    private final ModelPart rootClothes;
    protected final ModelPart headClothes;

    public StraySkullModel(ModelPart skinModelPart, ModelPart clothesModelPart) {
        super(skinModelPart);
        this.rootClothes = clothesModelPart;
        this.headClothes = clothesModelPart.getChild("head");
    }

    public static MeshDefinition createStraySkullClothesModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createStraySkullClothesLayer() {
        MeshDefinition meshdefinition = createStraySkullClothesModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headClothes.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headClothes.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer clothesVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(STRAY_CLOTHES_LOCATION));
        this.rootClothes.render(poseStack, clothesVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
