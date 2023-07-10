package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WitherHeadModel extends SkullModel {

    public WitherHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createWitherHeadModel(CubeDeformation cubeDeformation) {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -11.0F, -4.0F, 8.0F, 8.0F, 8.0F, cubeDeformation),
                PartPose.ZERO);
        PartDefinition shoulders = head.addOrReplaceChild("shoulders", CubeListBuilder.create().texOffs(0, 16)
                        .addBox(-10.0F, -3.1F, -0.5F, 20.0F, 3.0F, 3.0F, cubeDeformation),
                PartPose.ZERO);
        CubeListBuilder cubelistbuilder = CubeListBuilder.create().texOffs(32, 0)
                .addBox(-4.0F, -11.0F, -4.0F, 6.0F, 6.0F, 6.0F, cubeDeformation);
        shoulders.addOrReplaceChild("right_head", cubelistbuilder,
                PartPose.offset(-8.0F, 4.0F, 0.0F));
        shoulders.addOrReplaceChild("left_head", cubelistbuilder,
                PartPose.offset(10.0F, 4.0F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createWitherHeadLayer() {
        MeshDefinition meshdefinition = createWitherHeadModel(CubeDeformation.NONE);
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
