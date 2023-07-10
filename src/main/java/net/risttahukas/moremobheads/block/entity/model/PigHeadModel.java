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
public class PigHeadModel extends SkullModel {

    public PigHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createPigHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("snout", CubeListBuilder.create().texOffs(16, 16)
                        .addBox(-2.0F, -4.0F, -5.0F, 4.0F, 3.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createPigHeadLayer() {
        MeshDefinition meshdefinition = createPigHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
