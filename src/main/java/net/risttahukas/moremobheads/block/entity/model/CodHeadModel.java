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
public class CodHeadModel extends SkullModel {

    public CodHeadModel(ModelPart modelPart) {
        super(modelPart);
    }

    public static MeshDefinition createCodHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.0F, -4.0F, -3.0F, 2.0F, 4.0F, 7.0F),
                PartPose.ZERO);
        PartDefinition face = head.addOrReplaceChild("face", CubeListBuilder.create().texOffs(11, 0)
                        .addBox(-1.0F, -4.0F, -6.0F, 2.0F, 4.0F, 3.0F),
                PartPose.ZERO);
        face.addOrReplaceChild("nose", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.0F, -4.0F, -7.0F, 2.0F, 3.0F, 1.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("top_fin", CubeListBuilder.create().texOffs(20, -6)
                        .addBox(0.0F, -5.0F, -4.0F, 0.0F, 1.0F, 6.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("tail_fin", CubeListBuilder.create().texOffs(22, 3)
                .addBox(0.0F, -4.0F, 4.0F, 0.0F, 4.0F, 4.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("right_fin", CubeListBuilder.create().texOffs(22, 1)
                        .addBox(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F),
                PartPose.offsetAndRotation(-1.0F, -1.0F, -3.0F, 0.0F, 0.0F, (-(float)Math.PI / 4F)));
        head.addOrReplaceChild("left_fin", CubeListBuilder.create().texOffs(22, 4)
                        .addBox(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F),
                PartPose.offsetAndRotation(1.0F, -1.0F, -3.0F, 0.0F, 0.0F, ((float)Math.PI / 4F)));
        return meshdefinition;
    }

    public static LayerDefinition createCodHeadLayer() {
        MeshDefinition meshdefinition = createCodHeadModel();
        return LayerDefinition.create(meshdefinition, 32, 32);
    }
}
