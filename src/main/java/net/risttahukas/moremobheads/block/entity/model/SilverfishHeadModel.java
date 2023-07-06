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
public class SilverfishHeadModel extends SkullModel {
    public SilverfishHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createSilverfishHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 4)
                        .addBox(-2.0F, -3.0F, 0.0F, 4.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.5F, -2.0F, -2.0F, 3.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        face.addOrReplaceChild("face_frills", CubeListBuilder.create().texOffs(22, 20)
                        .addBox(-3.0F, -5.0F, -0.5F, 6.0F, 5.0F, 0.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createSilverfishHeadLayer() {
        MeshDefinition meshdefinition = createSilverfishHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
