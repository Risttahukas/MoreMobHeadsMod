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
public class WolfHeadModel extends SkullModel {

    public WolfHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createWolfHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-3.0F, -6.0F, -2.0F, 6.0F, 6.0F, 4.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 10)
                        .addBox(-1.5F, -3.001F, -5.0F, 3.0F, 3.0F, 4.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(16, 14)
                        .addBox(-3.0F, -8.0F, 0.0F, 2.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(16, 14)
                        .addBox(1.0F, -8.0F, 0.0F, 2.0F, 2.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createWolfHeadLayer() {
        MeshDefinition meshdefinition = createWolfHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
