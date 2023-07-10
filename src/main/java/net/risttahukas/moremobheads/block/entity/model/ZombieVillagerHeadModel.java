package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class ZombieVillagerHeadModel extends VillagerHeadModel {
    protected String path = "zombie_villager";

    public ZombieVillagerHeadModel(ModelPart modelPart, VillagerType villagerType, VillagerProfession villagerProfession) {
        super(modelPart, villagerType, villagerProfession);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        float f = 16F/15F;
        poseStack.scale(f,f,f);
        super.renderToBuffer(poseStack, vertexConsumer, multiBufferSource, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {}

    @Override
    protected ResourceLocation getResourceLocation(String category, ResourceLocation resourceLocation) {
        return resourceLocation.withPath((path) -> "textures/entity/" + this.path + "/" + category + "/" + path + ".png");
    }

    @Override
    protected boolean renderTypeHat(VillagerType villagerType, VillagerProfession villagerProfession) {
        return (!fullHatProfessions.contains(villagerProfession) || partialHatProfessions.contains(villagerProfession));
    }
}
