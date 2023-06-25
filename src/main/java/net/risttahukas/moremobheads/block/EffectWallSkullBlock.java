package net.risttahukas.moremobheads.block;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.WallSkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.risttahukas.moremobheads.block.entity.EffectSkullBlockEntity;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public class EffectWallSkullBlock extends WallSkullBlock {
    private static final Map<Direction, VoxelShape> AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 12.0D, 12.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> ALLAY_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.5D, 4.0D, 11.0D, 10.5D, 9.0D, 16.0D),
            Direction.SOUTH, Block.box(5.5D, 4.0D, 0.0D, 10.5D, 9.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.5D, 5.0D, 9.0D, 10.5D),
            Direction.WEST, Block.box(11.0D, 4.0D, 5.5D, 16.0D, 9.0D, 10.5D)));
    private static final Map<Direction, VoxelShape> AXOLOTL_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 11.0D, 12.0D, 9.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 9.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 5.0D, 9.0D, 12.0D),
            Direction.WEST, Block.box(11.0D, 4.0D, 4.0D, 16.0D, 9.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> CAVE_SPIDER_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.2D, 4.0D, 10.4D, 10.8D, 9.6D, 16.0D),
            Direction.SOUTH, Block.box(5.2D, 4.0D, 0.0D, 10.8D, 9.6D, 5.6D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.2D, 5.6D, 9.6D, 10.8D),
            Direction.WEST, Block.box(10.4D, 4.0D, 5.2D, 16.0D, 9.6D, 10.8D)));
    private static final Map<Direction, VoxelShape> CHICKEN_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.0D, 4.0D, 11.0D, 10.0D, 10.0D, 16.0D),
            Direction.SOUTH, Block.box(6.0D, 4.0D, 0.0D, 10.0D, 10.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.0D, 5.0D, 10.0D, 10.0D),
            Direction.WEST, Block.box(11.0D, 4.0D, 6.0D, 16.0D, 10.0D, 10.0D)));
    private static final Map<Direction, VoxelShape> SHEEP_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 8.0D, 11.0D, 10.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 10.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 8.0D, 10.0D, 11.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 5.0D, 16.0D, 10.0D, 11.0D)));
    private static final Map<Direction, VoxelShape> PARROT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(7.0D, 4.0D, 12.0D, 9.0D, 8.0D, 16.0D),
            Direction.SOUTH, Block.box(7.0D, 4.0D, 0.0D, 9.0D, 8.0D, 4.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 7.0D, 4.0D, 8.0D, 9.0D),
            Direction.WEST, Block.box(12.0D, 4.0D, 7.0D, 16.0D, 8.0D, 9.0D)));


    public EffectWallSkullBlock(SkullBlock.Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState blockState, @NotNull BlockGetter blockGetter,
                                        @NotNull BlockPos blockPos, @NotNull CollisionContext collisionContext) {
        if (EffectSkullBlock.Types.ALLAY.equals(this.getType())) {
            return ALLAY_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.AXOLOTL_LUCY.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_WILD.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_GOLD.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_BLUE.equals(this.getType())) {
            return AXOLOTL_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CAVE_SPIDER.equals(this.getType())) {
            return CAVE_SPIDER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CHICKEN.equals(this.getType())) {
            return CHICKEN_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.SHEEP_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_ORANGE.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_MAGENTA.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_LIGHT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_YELLOW.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_LIME.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_PINK.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_LIGHT_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_PURPLE.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.SHEEP_RAINBOW.equals(this.getType())) {
            return SHEEP_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.PARROT_RED_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_GREY.equals(this.getType())) {
            return PARROT_AABBS.get(blockState.getValue(FACING));
        }
        return AABBS.get(blockState.getValue(FACING));
    }

    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos blockPos, @NotNull BlockState blockState) {
        return new EffectSkullBlockEntity(blockPos, blockState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, @NotNull BlockState blockState,
                                                                  @NotNull BlockEntityType<T> tBlockEntityType) {
        if (level.isClientSide) {
            boolean flag = blockState.is(ModBlocks.WITCH_WALL_HEAD.get()) || blockState.is(ModBlocks.GHAST_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get());
            if (flag) {
                return createTickerHelper(tBlockEntityType, ModBlockEntities.EFFECT_SKULL.get(),
                        EffectSkullBlockEntity::animation);
            }
        }
        return null;
    }
}
