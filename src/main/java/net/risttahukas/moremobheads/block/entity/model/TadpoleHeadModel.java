package net.risttahukas.moremobheads.block.entity.model;

import net.minecraft.client.model.SkullModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.util.Mth;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class TadpoleHeadModel extends SkullModel {
    private final ModelPart tail;

    public TadpoleHeadModel(ModelPart modelPart) {
        super(modelPart);
        this.tail = modelPart.getChild("head").getChild("tail");
    }

    public static MeshDefinition createTadpoleHeadModel() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F),
                PartPose.ZERO);
        head.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 0)
                        .addBox(0.0F, -1.0F, 0.0F, 0.0F, 2.0F, 7.0F),
                PartPose.offset(0.0F, -1.0F, 1.5F));
        return meshdefinition;
    }

    public static LayerDefinition createTadpoleHeadLayer() {
        MeshDefinition meshdefinition = createTadpoleHeadModel();
        return LayerDefinition.create(meshdefinition, 16, 16);
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.tail.yRot = -1.5F * 0.25F * Mth.sin(0.3F * animationTickCount);
    }
}
