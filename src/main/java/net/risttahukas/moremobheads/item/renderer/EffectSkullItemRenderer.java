package net.risttahukas.moremobheads.item.renderer;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.vertex.PoseStack;
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
                             int p_108834_, int p_108835_) {
        Item item = itemStack.getItem();
        if (item instanceof BlockItem) {
            Block block = ((BlockItem)item).getBlock();
            if (block instanceof EffectSkullBlock) {
                GameProfile gameprofile = null;
                SkullBlock.Type type = ((AbstractSkullBlock)block).getType();
                SkullModelBase skullmodelbase = this.skullModels.get(type);
                RenderType rendertype = SkullBlockRenderer.getRenderType(type, gameprofile);
                SkullBlockRenderer.renderSkull(null, 180.0F, 0.0F, poseStack, multiBufferSource, p_108834_, skullmodelbase, rendertype);
            }
        }
    }
}
