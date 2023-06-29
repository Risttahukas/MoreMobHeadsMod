package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.HorseModel;
import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ChestedHorseHeadModel extends AbstractHorseHeadModel {
    public ChestedHorseHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createHorseHeadModel() {
        MeshDefinition meshdefinition = AbstractHorseHeadModel.createHorseHeadModel();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition face = partdefinition.getChild("head").getChild("face");
        face.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(0, 12)
                        .addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F),
                PartPose.offsetAndRotation(1.25F, -10.0F, 2.5F, 0.2617994F, 0.0F, 0.2617994F));
        face.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(0, 12)
                        .addBox(-1.0F, -7.0F, 0.0F, 2.0F, 7.0F, 1.0F),
                PartPose.offsetAndRotation(-1.25F, -10.0F, 2.5F, 0.2617994F, 0.0F, -0.2617994F));
        return meshdefinition;
    }

    public static LayerDefinition createHorseHeadLayer() {
        MeshDefinition meshdefinition = createHorseHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
