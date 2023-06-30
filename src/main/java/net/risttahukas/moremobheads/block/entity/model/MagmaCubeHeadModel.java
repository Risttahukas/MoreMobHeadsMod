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
public class MagmaCubeHeadModel extends SkullModel {

    public MagmaCubeHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    private static String getSegmentName(int i) {
        return "cube" + i;
    }

    public static MeshDefinition createMagmaCubeHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 1.0F, 8.0F),
                PartPose.ZERO);

        for(int i = 1; i < 8; ++i) {
            int j = 0;
            int k = i;
            if (i == 2) {
                j = 24;
                k = 10;
            } else if (i == 3) {
                j = 24;
                k = 19;
            }
            head.addOrReplaceChild(getSegmentName(i), CubeListBuilder.create().texOffs(j, k)
                    .addBox(-4.0F, (float)(-8 + i), -4.0F, 8.0F, 1.0F, 8.0F),
                    PartPose.ZERO);
        }
        head.addOrReplaceChild("inside_cube", CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 4.0F, 4.0F), PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createMagmaCubeHeadLayer() {
        MeshDefinition meshdefinition = createMagmaCubeHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
