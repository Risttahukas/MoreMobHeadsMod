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
public class EndermiteHeadModel extends SkullModel {
    public EndermiteHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createEndermiteHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-2.0F, -3.0F, -1.0F, 4.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createEndermiteHeadLayer() {
        MeshDefinition meshdefinition = createEndermiteHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
