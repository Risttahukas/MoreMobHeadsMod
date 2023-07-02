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
public class TurtleHeadModel extends SkullModel {

    public TurtleHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createTurtleHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(3, 0)
                        .addBox(-3.0F, -5.0F, -3.0F, 6.0F, 5.0F, 6.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createTurtleHeadLayer() {
        MeshDefinition meshdefinition = createTurtleHeadModel();
        return LayerDefinition.create(meshdefinition, 128, 64);
    }
}
