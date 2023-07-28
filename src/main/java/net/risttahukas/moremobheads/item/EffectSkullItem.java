package net.risttahukas.moremobheads.item;

import com.google.common.collect.ImmutableList;
import net.minecraft.ChatFormatting;
import net.minecraft.client.renderer.BlockEntityWithoutLevelRenderer;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Equipable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.StandingAndWallBlockItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;
import net.risttahukas.moremobheads.effect.AbstractHeadEffect;
import net.risttahukas.moremobheads.item.renderer.EffectSkullItemRenderer;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.function.Consumer;

public abstract class EffectSkullItem extends StandingAndWallBlockItem implements Equipable {
    private static final ImmutableList<AbstractHeadEffect> PASSIVE_HEAD_EFFECTS = ImmutableList.of();

    public EffectSkullItem(Block skull, Block wallSkull, Properties properties, Direction direction) {
        super(skull, wallSkull, properties, direction);
    }

    @Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        super.initializeClient(consumer);
        consumer.accept(new IClientItemExtensions() {
            @Override
            public BlockEntityWithoutLevelRenderer getCustomRenderer() {
                return EffectSkullItemRenderer.getInstance();
            }
        });
    }

    public abstract SoundEvent getSound();

    public ImmutableList<AbstractHeadEffect> getPassiveHeadEffects() {
        return PASSIVE_HEAD_EFFECTS;
    }

    @Override
    public EquipmentSlot getEquipmentSlot() {
        return EquipmentSlot.HEAD;
    }

    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable Level level, List<Component> components, TooltipFlag tooltipFlag) {
        ImmutableList<AbstractHeadEffect> passiveHeadEffects = getPassiveHeadEffects();
        if (!passiveHeadEffects.isEmpty()) {
            components.add(Component.translatable("tooltip.moremobheads.effects").withStyle(ChatFormatting.GRAY));
            for (AbstractHeadEffect headEffect : passiveHeadEffects) {
                components.add(headEffect.getName());
            }
        }
    }

    @SuppressWarnings("removal")
    @Override
    public void onArmorTick(ItemStack stack, Level level, Player player) {
        if (!level.isClientSide()) {
            evaluateHeadEffects(player);
        }
    }

    private void evaluateHeadEffects(Player player) {
        for (AbstractHeadEffect headEffect : getPassiveHeadEffects()) {
            for (MobEffect mobEffect : headEffect.getPassivePotionEffects()) {
                if (!player.hasEffect(mobEffect)) {
                    player.addEffect(new MobEffectInstance(mobEffect, 1, 0, false, false, false));
                }
            }
        }
    }
}
