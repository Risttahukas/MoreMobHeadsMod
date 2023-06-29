package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AbstractHorseHeadModel extends SkullModel {
    public AbstractHorseHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createHorseHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 35)
                .addBox(-2.0F, -6.0F, -3.5F, 4.0F, 6.0F, 7.0F),
                PartPose.ZERO);
        PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 13)
                        .addBox(-3.0F, -11.0F, -3.5F, 6.0F, 5.0F, 7.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("mane", CubeListBuilder.create().texOffs(56, 36)
                .addBox(-1.0F, -11.0F, 3.51F, 2.0F, 10.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("upper_mouth", CubeListBuilder.create().texOffs(0, 25)
                .addBox(-2.0F, -11.0F, -8.5F, 4.0F, 5.0F, 5.0F),
                PartPose.ZERO);
        face.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(19, 16)
                .addBox(0.55F, -13.0F, 2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)),
                PartPose.ZERO);
        face.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(19, 16)
                .addBox(-2.55F, -13.0F, 2.5F, 2.0F, 3.0F, 1.0F, new CubeDeformation(-0.001F)),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createHorseHeadLayer() {
        MeshDefinition meshdefinition = createHorseHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
