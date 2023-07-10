package net.risttahukas.moremobheads.block.entity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;
import java.util.Set;

@OnlyIn(Dist.CLIENT)
public class VillagerHeadModel extends AbstractVillagerHeadModel {
    protected static final Set<VillagerType> fullHatTypes = Set.of(
            VillagerType.DESERT,
            VillagerType.SNOW
    );
    protected static final Set<VillagerProfession> fullHatProfessions = Set.of(
            VillagerProfession.FARMER,
            VillagerProfession.FISHERMAN,
            VillagerProfession.FLETCHER,
            VillagerProfession.LIBRARIAN,
            VillagerProfession.SHEPHERD
    );
    protected static final Set<VillagerProfession> partialHatProfessions = Set.of(
            VillagerProfession.BUTCHER
    );
    private final ModelPart rootType;
    protected final ModelPart headType;
    private final VillagerType villagerType;
    private final VillagerProfession villagerProfession;
    protected String path = "villager";

    public VillagerHeadModel(ModelPart modelPart, VillagerType villagerType, VillagerProfession villagerProfession) {
        super(modelPart);
        this.rootType = modelPart;
        this.headType = modelPart.getChild("head");
        this.villagerType = villagerType;
        this.villagerProfession = villagerProfession;
    }

    @Override
    public void setupAnim(float animationTickCount, float p_103812_, float p_103813_) {
        super.setupAnim(animationTickCount, p_103812_, p_103813_);
        this.headType.yRot = p_103812_ * ((float)Math.PI / 180F);
        this.headType.xRot = p_103813_ * ((float)Math.PI / 180F);
    }

    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, MultiBufferSource multiBufferSource, int p_103817_, int p_103818_, float p_103819_, float p_103820_, float p_103821_, float p_103822_) {
        super.renderToBuffer(poseStack, vertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);

        if (renderTypeHat(this.villagerType, this.villagerProfession)) {
            ResourceLocation typeResourceLocation = this.getResourceLocation("type", BuiltInRegistries.VILLAGER_TYPE.getKey(villagerType));
            VertexConsumer typeVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(typeResourceLocation));
            this.rootType.render(poseStack, typeVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        }

        if (villagerProfession != VillagerProfession.NONE) {
            ResourceLocation professionResourceLocation = this.getResourceLocation("profession", Objects.requireNonNull(ForgeRegistries.VILLAGER_PROFESSIONS.getKey(villagerProfession)));
            VertexConsumer professionVertexConsumer = multiBufferSource.getBuffer(RenderType.entityCutoutNoCullZOffset(professionResourceLocation));
            this.rootType.render(poseStack, professionVertexConsumer, p_103817_, p_103818_, p_103819_, p_103820_, p_103821_, p_103822_);
        }
    }

    protected ResourceLocation getResourceLocation(String category, ResourceLocation resourceLocation) {
        return resourceLocation.withPath((path) -> "textures/entity/" + this.path + "/" + category + "/" + path + ".png");
    }

    protected boolean renderTypeHat(VillagerType villagerType, VillagerProfession villagerProfession) {
        return (!fullHatProfessions.contains(villagerProfession) && !partialHatProfessions.contains(villagerProfession) || partialHatProfessions.contains(villagerProfession) && !fullHatTypes.contains(villagerType));
    }
}
