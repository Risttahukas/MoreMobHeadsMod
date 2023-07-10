package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AxolotlHeadModel extends SkullModel {
    public AxolotlHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createAxolotlHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        CubeDeformation cubedeformation = new CubeDeformation(0.001F);
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 1)
                        .addBox(-4.0F, -5.0F, -3.0F, 8.0F, 5.0F, 5.0F, cubedeformation),
                PartPose.ZERO);
        head.addOrReplaceChild("top_gills", CubeListBuilder.create().texOffs(3, 37)
                .addBox(-4.0F, -8.0F, 1.0F, 8.0F, 3.0F, 0.0F, cubedeformation),
                PartPose.ZERO);
        head.addOrReplaceChild("left_gills", CubeListBuilder.create().texOffs(0, 40)
                .addBox(-7.0F, -7.0F, 1.0F, 3.0F, 7.0F, 0.0F, cubedeformation),
                PartPose.ZERO);
        head.addOrReplaceChild("right_gills", CubeListBuilder.create().texOffs(11, 40)
                .addBox(4.0F, -7.0F, 1.0F, 3.0F, 7.0F, 0.0F, cubedeformation),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createAxolotlHeadLayer() {
        MeshDefinition meshdefinition = createAxolotlHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
