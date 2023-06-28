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
public class DolphinHeadModel extends SkullModel {
    public DolphinHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createDolphinHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-4.0F, -7.0F, -3.0F, 8.0F, 7.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 13)
                .addBox( -1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F),
                PartPose.offset(0.0F, -4.0F, 0.0F));
        return meshdefinition;
    }

    public static LayerDefinition createDolphinHeadLayer() {
        MeshDefinition meshdefinition = createDolphinHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
