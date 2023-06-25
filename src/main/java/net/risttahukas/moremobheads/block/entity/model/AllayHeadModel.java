package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class AllayHeadModel extends SkullModel {
    public AllayHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createAllayHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-2.5F, -5.0F, -2.5F, 5.0F, 5.0F, 5.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createAllayHeadLayer() {
        MeshDefinition meshdefinition = createAllayHeadModel();
        return LayerDefinition.create(meshdefinition, 32, 32);
    }
}
