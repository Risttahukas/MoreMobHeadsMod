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
public class CowHeadModel extends SkullModel {
    public CowHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createCowHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-4.0F, -8.0F, -3.0F, 8.0F, 8.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_horn", CubeListBuilder.create().texOffs(22, 0)
                        .addBox(-5.0F, -9.0F, -1.0F, 1.0F, 3.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(22, 0)
                        .addBox(4.0F, -9.0F, -1.0F, 1.0F, 3.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createCowHeadLayer() {
        MeshDefinition meshdefinition = createCowHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
