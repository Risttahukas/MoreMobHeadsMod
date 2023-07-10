package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WitherHeadArmorModel extends WitherHeadModel {
    private static final ResourceLocation WITHER_ARMOR_LOCATION = new ResourceLocation("textures/entity/wither/wither_armor.png");
    private final ModelPart rootArmor;
    protected final ModelPart headArmor;
    protected int tickCount = 0;

    public WitherHeadArmorModel(ModelPart skinModelPart, ModelPart armorModelPart) {
        super(skinModelPart);
        this.rootArmor = armorModelPart;
        this.headArmor = armorModelPart.getChild("head");
    }

    public static LayerDefinition createWitherHeadArmorLayer() {
        MeshDefinition meshdefinition = createWitherHeadModel(new CubeDeformation(0.5F));
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headArmor.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headArmor.xRot = p_103813_ * ((float)Math.PI / 180F);
        tickCount = (int)animationTickCount;
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        VertexConsumer armorVertexConsumer = multiBufferSource.getBuffer(RenderType.energySwirl(WITHER_ARMOR_LOCATION, Mth.cos(this.tickCount * 0.02F) * 3.0F % 1.0F, this.tickCount * 0.01F % 1.0F));
        this.rootArmor.render(poseStack, armorVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
