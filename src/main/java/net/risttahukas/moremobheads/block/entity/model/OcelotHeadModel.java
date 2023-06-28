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
public class OcelotHeadModel extends SkullModel {
    public OcelotHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createOcelotHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-2.5F, -4.0F, -2.5F, 5.0F, 4.0F, 5.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 24)
                .addBox( -1.5F, -2.001F, -3.5F, 3, 2, 2),
                PartPose.ZERO);
        head.addOrReplaceChild("ear1", CubeListBuilder.create().texOffs(0, 10)
                .addBox(-2.0F, -5.0F, 0.5F, 1, 1, 2),
                PartPose.ZERO);
        head.addOrReplaceChild("ear2", CubeListBuilder.create().texOffs(6, 10)
                .addBox(1.0F, -5.0F, 0.5F, 1, 1, 2),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createOcelotHeadLayer() {
        MeshDefinition meshdefinition = createOcelotHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
