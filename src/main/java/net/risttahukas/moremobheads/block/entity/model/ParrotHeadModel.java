package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;

public class ParrotHeadModel extends SkullModel {
    public ParrotHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createParrotHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(2, 2)
                        .addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(10, 0)
                .addBox(-1.0F, -4.0F, -3.0F, 2.0F, 1.0F, 4.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("beak1", CubeListBuilder.create().texOffs(11, 7)
                .addBox(-0.5F, -3.0F, -2.0F, 1.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("beak2", CubeListBuilder.create().texOffs(16, 7)
                .addBox(-0.5F, -3.0F, -3.0F, 1.0F, 2.0F, 1.0F),
                PartPose.offset(0.0F, -0.25F, 0.05F));
        head.addOrReplaceChild("feather", CubeListBuilder.create().texOffs(2, 18)
                .addBox(0.0F, -7.0F, -2.0F, 0.0F, 5.0F, 4.0F),
                PartPose.offsetAndRotation(0.0F, -0.72F, -0.50F, -0.2214F, 0.0F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createParrotHeadLayer() {
        MeshDefinition meshdefinition = createParrotHeadModel();
        return LayerDefinition.create(meshdefinition, 32, 32);
    }
}
