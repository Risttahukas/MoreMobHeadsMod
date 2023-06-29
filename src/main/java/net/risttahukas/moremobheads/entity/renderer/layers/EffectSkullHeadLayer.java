package net.risttahukas.moremobheads.entity.renderer.layers;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HeadedModel;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.client.renderer.entity.RenderLayerParent;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.WalkAnimationState;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.item.*;
import net.minecraft.world.level.block.AbstractSkullBlock;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.risttahukas.moremobheads.block.EffectSkullBlock;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;
import net.risttahukas.moremobheads.event.ClientEvents;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

@OnlyIn(Dist.CLIENT)
public class EffectSkullHeadLayer<T extends LivingEntity, M extends EntityModel<T>&HeadedModel> extends CustomHeadLayer<T, M> {
    private final float scaleX;
    private final float scaleY;
    private final float scaleZ;
    private final Map<SkullBlock.Type, SkullModelBase> skullModels;
    private final ItemInHandRenderer itemInHandRenderer;

    public EffectSkullHeadLayer(RenderLayerParent<T, M>  renderLayerParent, EntityModelSet entityModelSet,
                                ItemInHandRenderer itemInHandRenderer) {
        this(renderLayerParent, entityModelSet, 1.0F, 1.0F, 1.0F, itemInHandRenderer);
    }

    public EffectSkullHeadLayer(RenderLayerParent<T, M> renderLayerParent, EntityModelSet entityModelSet, float p_234824_, float p_234825_, float p_234826_, ItemInHandRenderer p_234827_) {
        super(renderLayerParent, entityModelSet, p_234824_, p_234825_, p_234826_, p_234827_);
        this.scaleX = p_234824_;
        this.scaleY = p_234825_;
        this.scaleZ = p_234826_;
        this.skullModels = EffectSkullBlockRenderer.createSkullRenderers(entityModelSet);
        this.itemInHandRenderer = p_234827_;
    }

    @Override
    public void render(@NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource, int p_116733_, T p_116734_, float p_116735_, float p_116736_, float p_116737_, float p_116738_, float p_116739_, float p_116740_) {
        ItemStack itemstack = p_116734_.getItemBySlot(EquipmentSlot.HEAD);
        if (!itemstack.isEmpty()) {
            Item item = itemstack.getItem();
            poseStack.pushPose();
            poseStack.scale(this.scaleX, this.scaleY, this.scaleZ);
            boolean flag = p_116734_ instanceof Villager || p_116734_ instanceof ZombieVillager;
            if (p_116734_.isBaby() && !(p_116734_ instanceof Villager)) {
                poseStack.translate(0.0F, 0.03125F, 0.0F);
                poseStack.scale(0.7F, 0.7F, 0.7F);
                poseStack.translate(0.0F, 1.0F, 0.0F);
            }

            this.getParentModel().getHead().translateAndRotate(poseStack);
            if (item instanceof BlockItem && ((BlockItem)item).getBlock() instanceof AbstractSkullBlock) {
                poseStack.scale(1.1875F, -1.1875F, -1.1875F);
                if (flag) {
                    poseStack.translate(0.0F, 0.0625F, 0.0F);
                }

                GameProfile gameprofile = null;
                if (itemstack.hasTag()) {
                    CompoundTag compoundtag = itemstack.getTag();
                    assert compoundtag != null;
                    if (compoundtag.contains("SkullOwner", 10)) {
                        gameprofile = NbtUtils.readGameProfile(compoundtag.getCompound("SkullOwner"));
                    }
                }

                poseStack.translate(-0.5D, 0.0D, -0.5D);
                SkullBlock.Type skullblock$type = ((AbstractSkullBlock)((BlockItem)item).getBlock()).getType();
                SkullModelBase skullmodelbase = this.skullModels.get(skullblock$type);
                RenderType rendertype = SkullBlockRenderer.getRenderType(skullblock$type, gameprofile);
                Entity entity = p_116734_.getVehicle();
                WalkAnimationState walkanimationstate;
                if (entity instanceof LivingEntity livingentity) {
                    walkanimationstate = livingentity.walkAnimation;
                } else {
                    walkanimationstate = p_116734_.walkAnimation;
                }

                float animationProgress = walkanimationstate.position(p_116737_);

                if (skullblock$type == EffectSkullBlock.Types.SHEEP_RAINBOW ||
                        skullblock$type == EffectSkullBlock.Types.CREEPER_CHARGED ||
                        skullblock$type == EffectSkullBlock.Types.WARDEN) {
                    float tickCount = (float) ClientEvents.time + Minecraft.getInstance().getPartialTick();
                    animationProgress = tickCount / 2.0F;
                }

                EffectSkullBlockRenderer.renderSkull(null, 180.0F, animationProgress, poseStack, multiBufferSource, p_116733_, skullmodelbase, rendertype);
            } else {
                label60: {
                    if (item instanceof ArmorItem armoritem) {
                        if (armoritem.getEquipmentSlot() == EquipmentSlot.HEAD) {
                            break label60;
                        }
                    }

                    translateToHead(poseStack, flag);
                    this.itemInHandRenderer.renderItem(p_116734_, itemstack, ItemDisplayContext.HEAD, false, poseStack, multiBufferSource, p_116733_);
                }
            }

            poseStack.popPose();
        }
    }
}
