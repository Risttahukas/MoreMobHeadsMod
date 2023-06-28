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
import net.minecraft.world.entity.animal.Sheep;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class SheepHeadModel extends SkullModel {
    private static final ResourceLocation SHEEP_FUR_LOCATION = new ResourceLocation("textures/entity/sheep/sheep_fur.png");
    private final ModelPart rootWool;
    protected final ModelPart headWool;
    protected final int dyeID;
    protected int tickCount = 0;

    public SheepHeadModel(ModelPart skinModelPart, ModelPart woolModelPart, int dyeID) {
        super(skinModelPart);
        this.rootWool = woolModelPart;
        this.headWool = woolModelPart.getChild("head");
        this.dyeID = dyeID;
    }

    public static MeshDefinition createSheepHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.0F, -6.0F, -4.0F, 6.0F, 6.0F, 8.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static MeshDefinition createSheepHeadWoolModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.6F)),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createSheepHeadLayer() {
        MeshDefinition meshdefinition = createSheepHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    public static LayerDefinition createSheepHeadWoolLayer() {
        MeshDefinition meshdefinition = createSheepHeadWoolModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headWool.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headWool.xRot = p_103813_ * ((float)Math.PI / 180F);
        tickCount = (int)animationTickCount;
    }

    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        float f;
        float f1;
        float f2;
        if (dyeID == 16) {
            int i = tickCount / 25;
            int j = DyeColor.values().length;
            int k = i % j;
            int l = (i + 1) % j;
            float f3 = ((float)(tickCount % 25) + p_103819_) / 25.0F;
            float[] afloat1 = Sheep.getColorArray(DyeColor.byId(k));
            float[] afloat2 = Sheep.getColorArray(DyeColor.byId(l));
            f = afloat1[0] * (1.0F - f3) + afloat2[0] * f3;
            f1 = afloat1[1] * (1.0F - f3) + afloat2[1] * f3;
            f2 = afloat1[2] * (1.0F - f3) + afloat2[2] * f3;
        } else {
            float[] afloat = Sheep.getColorArray(DyeColor.byId(dyeID));
            f = afloat[0];
            f1 = afloat[1];
            f2 = afloat[2];
        }
        VertexConsumer woolVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(SHEEP_FUR_LOCATION));
        this.rootWool.render(poseStack, woolVertexConsumer, p_103817_, p_103818_, f, f1, f2, p_103822_);
    }
}
