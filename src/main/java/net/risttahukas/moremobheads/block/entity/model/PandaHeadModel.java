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
public class PandaHeadModel extends SkullModel {
    public PandaHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createPandaHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 6)
                        .addBox(-6.5F, -10.0F, -4.5F, 13.0F, 10.0F, 9.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(45, 16)
                        .addBox(-3.5F, -5.0F, -6.5F, 7.0F, 5.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("left_ear", CubeListBuilder.create().texOffs(52, 25)
                        .addBox(3.5F, -13.0F, -1.5F, 5.0F, 4.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_ear", CubeListBuilder.create().texOffs(52, 25)
                        .addBox(-8.5F, -13.0F, -1.5F, 5.0F, 4.0F, 1.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createPandaHeadLayer() {
        MeshDefinition meshdefinition = createPandaHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
