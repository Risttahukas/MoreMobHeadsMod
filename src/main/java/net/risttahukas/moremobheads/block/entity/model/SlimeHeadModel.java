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
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class SlimeHeadModel extends SkullModel {
    private static final ResourceLocation SLIME_LOCATION = new ResourceLocation("textures/entity/slime/slime.png");
    private final ModelPart rootOuter;
    protected final ModelPart headOuter;

    public SlimeHeadModel(ModelPart skinModelPart, ModelPart outerModelPart) {
        super(skinModelPart);
        this.rootOuter = outerModelPart;
        this.headOuter = outerModelPart.getChild("head");
    }

    public static MeshDefinition createSlimeHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 16)
                        .addBox(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_eye", CubeListBuilder.create().texOffs(32, 0)
                .addBox(-3.25F, -6.0F, -3.5F, 2.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_eye", CubeListBuilder.create().texOffs(32, 4)
                .addBox(1.25F, -6.0F, -3.5F, 2.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(32, 8)
                .addBox(0.0F, -3.0F, -3.5F, 1.0F, 1.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static MeshDefinition createSlimeHeadOuterModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createSlimeHeadLayer() {
        MeshDefinition meshdefinition = createSlimeHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public static LayerDefinition createSlimeHeadOuterLayer() {
        MeshDefinition meshdefinition = createSlimeHeadOuterModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headOuter.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headOuter.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer outerLayerVertexConsumer = multiBufferSource.getBuffer(ModRenderType.entityTranslucentNoCullZOffset(SLIME_LOCATION));
        this.rootOuter.render(poseStack, outerLayerVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
