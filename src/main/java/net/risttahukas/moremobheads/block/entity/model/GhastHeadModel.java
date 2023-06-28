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
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

@OnlyIn(Dist.CLIENT)
public class GhastHeadModel extends SkullModel {
    private final ModelPart head;
    private final ModelPart[] tentacles = new ModelPart[9];

    public GhastHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.head = modelPart.getChild("head");
        for(int i = 0; i < this.tentacles.length; ++i) {
            this.tentacles[i] = this.head.getChild(createTentacleName(i));
        }
    }

    public static MeshDefinition createGhastHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-8.0F, -16.0F, -8.0F, 16.0F, 16.0F, 16.0F),
                PartPose.ZERO);
        RandomSource randomsource = RandomSource.create(1660L);

        for(int i = 0; i < 9; ++i) {
            float f = (((float)(i % 3) - (float)(i / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
            float f1 = ((float)(i / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
            int j = randomsource.nextInt(7) + 8;
            head.addOrReplaceChild(createTentacleName(i), CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, 0.0F, -1.0F, 2.0F, (float)j, 2.0F),
                    PartPose.offset(f, -1.0F, f1));
        }
        return meshdefinition;
    }

    private static String createTentacleName(int i) {
        return "tentacle" + i;
    }

    public static LayerDefinition createGhastHeadLayer() {
        MeshDefinition meshdefinition = createGhastHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }

    @Override
    public void renderToBuffer(@NotNull PoseStack poseStack, @NotNull VertexConsumer vertexConsumer,
                               int p_103817_, int p_103818_,
                               float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        this.head.render(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        for(int i = 0; i < this.tentacles.length; ++i) {
            this.tentacles[i].xRot = 0.2F * Mth.sin(animationTickCount * 0.3F + (float)i) + 0.4F;
        }
    }
}
