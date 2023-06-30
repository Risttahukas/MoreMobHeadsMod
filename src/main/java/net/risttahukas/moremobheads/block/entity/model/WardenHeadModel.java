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
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.entity.renderer.ModRenderType;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class WardenHeadModel extends SkullModel {
    private static final ResourceLocation BIOLUMINESCENT_LAYER_TEXTURE = new ResourceLocation("textures/entity/warden/warden_bioluminescent_layer.png");
    private static final ResourceLocation PULSATING_SPOTS_TEXTURE_1 = new ResourceLocation("textures/entity/warden/warden_pulsating_spots_1.png");
    private static final ResourceLocation PULSATING_SPOTS_TEXTURE_2 = new ResourceLocation("textures/entity/warden/warden_pulsating_spots_2.png");
    private final ModelPart rootEmissive;
    protected final ModelPart headEmissive;
    protected float tickCount = 0.0F;

    public WardenHeadModel(ModelPart skinModelPart, ModelPart emissiveModelPart) {
        super(skinModelPart);
        this.rootEmissive = emissiveModelPart;
        this.headEmissive = emissiveModelPart.getChild("head");
    }

    public static MeshDefinition createWardenHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 32)
                        .addBox(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_tendril", CubeListBuilder.create().texOffs(52, 32)
                .addBox(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F),
                PartPose.offset(-8.0F, -12.0F, 0.0F));
        head.addOrReplaceChild("left_tendril", CubeListBuilder.create().texOffs(58, 0)
                .addBox(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F),
                PartPose.offset(8.0F, -12.0F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createWardenHeadLayer() {
        MeshDefinition meshdefinition = createWardenHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    public static LayerDefinition createWardenHeadEmissiveLayer() {
        MeshDefinition meshdefinition = createWardenHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 128);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headEmissive.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headEmissive.xRot = p_103813_ * ((float)Math.PI / 180F);
        tickCount = animationTickCount;
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer bioluminescentLayerVertexConsumer = multiBufferSource.getBuffer(ModRenderType.entityTranslucentEmissiveZOffset(BIOLUMINESCENT_LAYER_TEXTURE));
        this.rootEmissive.render(poseStack, bioluminescentLayerVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, 1.0F);
        VertexConsumer pulsatingSpotsVertexConsumer1 = multiBufferSource.getBuffer(ModRenderType.entityTranslucentEmissiveZOffset(PULSATING_SPOTS_TEXTURE_1));
        this.rootEmissive.render(poseStack, pulsatingSpotsVertexConsumer1, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, Math.max(0.0F, Mth.cos(this.tickCount * 0.045F) * 0.25F));
        VertexConsumer pulsatingSpotsVertexConsumer2 = multiBufferSource.getBuffer(ModRenderType.entityTranslucentEmissiveZOffset(PULSATING_SPOTS_TEXTURE_2));
        this.rootEmissive.render(poseStack, pulsatingSpotsVertexConsumer2, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, Math.max(0.0F, Mth.cos(this.tickCount * 0.045F + (float)Math.PI) * 0.25F));
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
