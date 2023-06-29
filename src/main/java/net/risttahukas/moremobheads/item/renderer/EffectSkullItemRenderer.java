package net.risttahukas.moremobheads.item.renderer;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderDispatcher;
import net.minecraft.client.renderer.blockentity.SkullBlockRenderer;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.AbstractSkullBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.risttahukas.moremobheads.block.EffectSkullBlock;
import net.risttahukas.moremobheads.block.entity.renderer.EffectSkullBlockRenderer;
import net.risttahukas.moremobheads.event.ClientEvents;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class EffectSkullItemRenderer extends BlockEntityWithoutLevelRenderer {
    private final Map<SkullBlock.Type, SkullModelBase> skullModels;

    public EffectSkullItemRenderer(BlockEntityRenderDispatcher blockEntityRenderDispatcher, EntityModelSet entityModelSet) {
        super(blockEntityRenderDispatcher, entityModelSet);
        this.skullModels = EffectSkullBlockRenderer.createSkullRenderers(entityModelSet);
    }

    @Override
    public void renderByItem(ItemStack itemStack, @NotNull ItemDisplayContext itemDisplayContext,
                             @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource,
                             int light, int overlay) {
        Item item = itemStack.getItem();
        if (item instanceof BlockItem blockItem) {
            Block block = blockItem.getBlock();
            if (block instanceof EffectSkullBlock) {
                GameProfile gameprofile = null;
                SkullBlock.Type type = ((AbstractSkullBlock)block).getType();
                SkullModelBase skullmodelbase = this.skullModels.get(type);
                RenderType rendertype = SkullBlockRenderer.getRenderType(type, gameprofile);
                if (type == EffectSkullBlock.Types.SHEEP_RAINBOW || type == EffectSkullBlock.Types.CREEPER_CHARGED ||
                        type == EffectSkullBlock.Types.WARDEN) {
                    float tickCount = (float)ClientEvents.time + Minecraft.getInstance().getPartialTick();
                    EffectSkullBlockRenderer.renderSkull(null, 180.0F, tickCount / 2.0F, poseStack, multiBufferSource, light, skullmodelbase, rendertype);
                } else {
                    EffectSkullBlockRenderer.renderSkull(null, 180.0F, 0.0F, poseStack, multiBufferSource, light, skullmodelbase, rendertype);
                }
            }
        }
    }
}
