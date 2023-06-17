package net.risttahukas.moremobheads.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.Direction;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.risttahukas.moremobheads.item.renderer.EffectSkullItemRenderer;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class EffectSkullItem extends StandingAndWallBlockItem {
    public EffectSkullItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public void initializeClient(@NotNull Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return new EffectSkullItemRenderer(Minecraft.getInstance().getBlockEntityRenderDispatcher(),
                        Minecraft.getInstance().getEntityModels());
            }
        });
    }
}
