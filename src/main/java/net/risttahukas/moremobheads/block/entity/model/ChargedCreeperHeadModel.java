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

@OnlyIn(Dist.CLIENT)
public class ChargedCreeperHeadModel extends SkullModel {
    private static final ResourceLocation CREEPER_CHARGE_LOCATION = new ResourceLocation("textures/entity/creeper/creeper_armor.png");
    private final ModelPart rootCharge;
    protected final ModelPart headCharge;
    protected int tickCount = 0;

    public ChargedCreeperHeadModel(ModelPart skinModelPart, ModelPart chargeModelPart) {
        super(skinModelPart);
        this.rootCharge = chargeModelPart;
        this.headCharge = chargeModelPart.getChild("head");
    }

    public static MeshDefinition createCreeperHeadChargeModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(2.0F)),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createCreeperHeadChargeLayer() {
        MeshDefinition meshdefinition = createCreeperHeadChargeModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headCharge.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headCharge.xRot = p_103813_ * ((float)Math.PI / 180F);
        tickCount = (int)animationTickCount;
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        float f = (float)this.tickCount * 0.01F;
        VertexConsumer chargeVertexConsumer = multiBufferSource.getBuffer(RenderType.energySwirl(CREEPER_CHARGE_LOCATION, f % 1.0F, f % 1.0F));
        this.rootCharge.render(poseStack, chargeVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
