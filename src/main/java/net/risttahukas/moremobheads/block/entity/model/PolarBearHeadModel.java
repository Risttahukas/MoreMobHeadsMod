package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PolarBearHeadModel extends SkullModel {
    public PolarBearHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createPolarBearHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.5F, -7.0F, -3.5F, 7.0F, 7.0F, 7.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("mouth", CubeListBuilder.create().texOffs(0, 44)
                        .addBox(-2.5F, -3.0F, -6.5F, 5.0F, 3.0F, 3.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(26, 0)
                        .addBox(-4.5F, -8.0F, -1.5F, 2.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(26, 0).mirror()
                        .addBox(2.5F, -8.0F, -1.5F, 2.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createPolarBearHeadLayer() {
        MeshDefinition meshdefinition = createPolarBearHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 64);
    }
}
