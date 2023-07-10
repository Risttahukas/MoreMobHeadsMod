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
public class ChickenHeadModel extends SkullModel {
    public ChickenHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createChickenHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                .addBox(-2.0F, -6.0F, -1.5F, 4.0F, 6.0F, 3.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("beak", CubeListBuilder.create().texOffs(14, 0)
                .addBox(-2.0F, -4.0F, -3.5F, 4.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("red_thing", CubeListBuilder.create().texOffs(14, 4)
                .addBox(-1.0F, -2.0F, -2.5F, 2.0F, 2.0F, 2.0F),
                PartPose.ZERO);
        return meshdefinition;
    }

    public static LayerDefinition createChickenHeadLayer() {
        MeshDefinition meshdefinition = createChickenHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
