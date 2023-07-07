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
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class GuardianHeadModel extends SkullModel {
    private static final float[] SPIKE_X = new float[]{0.0F, 0.0F, 8.0F, -8.0F, -8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F, 8.0F, -8.0F};
    private static final float[] SPIKE_Y = new float[]{-8.0F, -8.0F, -8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 8.0F, 8.0F, 8.0F, 8.0F};
    private static final float[] SPIKE_Z = new float[]{8.0F, -8.0F, 0.0F, 0.0F, -8.0F, -8.0F, 8.0F, 8.0F, 8.0F, -8.0F, 0.0F, 0.0F};
    private static final float[] SPIKE_X_ROT = new float[]{1.75F, 0.25F, 0.0F, 0.0F, 0.5F, 0.5F, 0.5F, 0.5F, 1.25F, 0.75F, 0.0F, 0.0F};
    private static final float[] SPIKE_Y_ROT = new float[]{0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 1.75F, 1.25F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F};
    private static final float[] SPIKE_Z_ROT = new float[]{0.0F, 0.0F, 0.25F, 1.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.75F, 1.25F};
    private final ModelPart[] spikeParts;

    public GuardianHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.spikeParts = new ModelPart[12];
        for(int i = 0; i < this.spikeParts.length; ++i) {
            this.spikeParts[i] = modelPart.getChild("head").getChild(createSpikeName(i));
        }
    }

    private static String createSpikeName(int i) {
        return "spike" + i;
    }

    private void setupSpikes(float animationTickCount, float f) {
        for(int i = 0; i < 12; ++i) {
            this.spikeParts[i].x = getSpikeX(i, animationTickCount, f);
            this.spikeParts[i].y = getSpikeY(i, animationTickCount, f);
            this.spikeParts[i].z = getSpikeZ(i, animationTickCount, f);
        }
    }

    private static float getSpikeOffset(int i, float animationTickCount, float f) {
        return 1.0F + Mth.cos(animationTickCount * 1.5F + (float)i) * 0.01F - f;
    }

    private static float getSpikeX(int i, float animationTickCount, float f) {
        return SPIKE_X[i] * getSpikeOffset(i, animationTickCount, f);
    }

    private static float getSpikeY(int i, float animationTickCount, float f) {
        return -8.0F + SPIKE_Y[i] * getSpikeOffset(i, animationTickCount, f);
    }

    private static float getSpikeZ(int i, float animationTickCount, float f) {
        return SPIKE_Z[i] * getSpikeOffset(i, animationTickCount, f);
    }

    public static MeshDefinition createGuardianHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-6.0F, -14.0F, -8.0F, 12.0F, 12.0F, 16.0F)
                        .texOffs(0, 28)
                        .addBox(-8.0F, -14.0F, -6.0F, 2.0F, 12.0F, 12.0F)
                        .texOffs(0, 28)
                        .addBox(6.0F, -14.0F, -6.0F, 2.0F, 12.0F, 12.0F, true)
                        .texOffs(16, 40)
                        .addBox(-6.0F, -16.0F, -6.0F, 12.0F, 2.0F, 12.0F)
                        .texOffs(16, 40)
                        .addBox(-6.0F, -2.0F, -6.0F, 12.0F, 2.0F, 12.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("eye", CubeListBuilder.create().texOffs(8, 0)
                        .addBox(-1.0F, 15.0F, 0.0F, 2.0F, 2.0F, 1.0F),
                PartPose.offset(0.0F, -24.0F, -8.25F));
        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -4.5F, -1.0F, 2.0F, 9.0F, 2.0F);

        for(int i = 0; i < 12; ++i) {
            float f = getSpikeX(i, 0.0F, 0.0F);
            float f1 = getSpikeY(i, 0.0F, 0.0F);
            float f2 = getSpikeZ(i, 0.0F, 0.0F);
            float f3 = (float)Math.PI * SPIKE_X_ROT[i];
            float f4 = (float)Math.PI * SPIKE_Y_ROT[i];
            float f5 = (float)Math.PI * SPIKE_Z_ROT[i];
            head.addOrReplaceChild(createSpikeName(i), cubelistbuilder, PartPose.offsetAndRotation(f, f1, f2, f3, f4, f5));
        }
        return meshdefinition;
    }

    public static LayerDefinition createGuardianHeadLayer() {
        MeshDefinition meshdefinition = createGuardianHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        float f1 = (1.0F - Mth.sin(animationTickCount)) * 0.55F;
        this.setupSpikes(animationTickCount, f1);
    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        poseStack.scale(0.5F, 0.5F, 0.5F);
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }
}
