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
public class GoatHeadModel extends SkullModel {

    public GoatHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createGoatHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(34, 46)
                        .addBox(-2.5F, -7.0F, -5.0F, 5.0F, 7.0F, 10.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right ear", CubeListBuilder.create().texOffs(2, 61)
                        .addBox(-6.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F),
                PartPose.offsetAndRotation(0.5F, 8.0F, 1.0F,-0.9599F, 0.0F, 0.0F));
        head.addOrReplaceChild("left ear", CubeListBuilder.create().texOffs(2, 61).mirror()
                        .addBox(2.0F, -11.0F, -10.0F, 3.0F, 2.0F, 1.0F),
                PartPose.offsetAndRotation(0.5F, 8.0F, 1.0F,-0.9599F, 0.0F, 0.0F));
        head.addOrReplaceChild("goatee", CubeListBuilder.create().texOffs(23, 52)
                        .addBox(-0.5F, -3.0F, -14.0F, 0.0F, 7.0F, 5.0F),
                PartPose.offsetAndRotation(0.5F, 8.0F, 1.0F,-0.9599F, 0.0F, 0.0F));
        head.addOrReplaceChild("left_horn", CubeListBuilder.create().texOffs(12, 55)
                        .addBox(-0.01F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F),
                PartPose.offsetAndRotation(0.5F, 8.0F, 1.0F,-0.9599F, 0.0F, 0.0F));
        head.addOrReplaceChild("right_horn", CubeListBuilder.create().texOffs(12, 55)
                        .addBox(-2.99F, -16.0F, -10.0F, 2.0F, 7.0F, 2.0F),
                PartPose.offsetAndRotation(0.5F, 8.0F, 1.0F,-0.9599F, 0.0F, 0.0F));

        return meshdefinition;
    }

    public static LayerDefinition createGoatHeadLayer() {
        MeshDefinition meshdefinition = createGoatHeadModel();
        return LayerDefinition.create(meshdefinition, 64, 64);
    }
}
