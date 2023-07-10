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
public class SalmonHeadModel extends SkullModel {

    public SalmonHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createSalmonHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.5F, -5.0F, -4.0F, 3.0F, 5.0F, 8.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(22, 0)
                        .addBox(-1.0F, -4.0F, -7.0F, 2.0F, 4.0F, 3.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("top_front_fin", CubeListBuilder.create().texOffs(2, 1)
                        .addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F),
                PartPose.offset(0.0F, -7.0F, 1.0F));
        head.addOrReplaceChild("top_back_fin", CubeListBuilder.create().texOffs(0, 2)
                        .addBox(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F),
                PartPose.offset(0.0F, -7.0F, 3.0F));
        head.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(-4, 0)
                        .addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F),
                PartPose.offsetAndRotation(-1.5F, -1.0F, -4.0F, 0.0F, 0.0F, (-(float)Math.PI / 4F)));
        head.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F),
                PartPose.offsetAndRotation(1.5F, -1.0F, -4.0F, 0.0F, 0.0F, ((float)Math.PI / 4F)));
        return meshdefinition;
    }

    public static LayerDefinition createSalmonHeadLayer() {
        MeshDefinition meshdefinition = createSalmonHeadModel();
        return LayerDefinition.create(meshdefinition, 32, 32);
    }
}
