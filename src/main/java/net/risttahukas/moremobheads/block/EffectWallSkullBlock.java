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
    private static final Map<Direction, VoxelShape> BAT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.95D, 4.0D, 13.9D, 9.05D, 6.1D, 16.0D),
            Direction.SOUTH, Block.box(6.95D, 4.0D, 0.0D, 9.05D, 6.1D, 2.1D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.95D, 2.1D, 6.1D, 9.05D),
            Direction.WEST, Block.box(13.9D, 4.0D, 6.95D, 16.0D, 6.1D, 9.05D)));
    private static final Map<Direction, VoxelShape> BEE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.5D, 4.0D, 6.0D, 11.5D, 11.0D, 16.0D),
            Direction.SOUTH, Block.box(4.5D, 4.0D, 0.0D, 11.5D, 11.0D, 10.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.5D, 10.0D, 11.0D, 11.5D),
            Direction.WEST, Block.box(6.0D, 4.0D, 4.5D, 16.0D, 11.0D, 11.5D)));
    private static final Map<Direction, VoxelShape> CAMEL_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.5D, 2.0D, 9.0D, 11.5D, 16.0D, 16.0D),
            Direction.SOUTH, Block.box(4.5D, 2.0D, 0.0D, 11.5D, 16.0D, 7.0D),
            Direction.EAST, Block.box(0.0D, 2.0D, 4.5D, 7.0D, 16.0D, 11.5D),
            Direction.WEST, Block.box(9.0D, 2.0D, 4.5D, 16.0D, 16.0D, 11.5D)));
    private static final Map<Direction, VoxelShape> CAT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.0D, 4.0D, 12.0D, 10.0D, 7.2D, 16.0D),
            Direction.SOUTH, Block.box(6.0D, 4.0D, 0.0D, 10.0D, 7.2D, 4.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.0D, 4.0D, 7.2D, 10.0D),
            Direction.WEST, Block.box(12.0D, 4.0D, 6.0D, 16.0D, 7.2D, 10.0D)));
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
    private static final Map<Direction, VoxelShape> COD_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(7.0D, 4.0D, 5.0D, 9.0D, 8.0D, 16.0D),
            Direction.SOUTH, Block.box(7.0D, 4.0D, 0.0D, 9.0D, 8.0D, 11.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 7.0D, 11.0D, 8.0D, 9.0D),
            Direction.WEST, Block.box(5.0D, 4.0D, 7.0D, 16.0D, 8.0D, 9.0D)));
    private static final Map<Direction, VoxelShape> COW_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 10.0D, 12.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 6.0D, 12.0D, 12.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> DOLPHIN_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 10.0D, 12.0D, 11.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 11.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 6.0D, 11.0D, 12.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 4.0D, 16.0D, 11.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> DONKEY_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.39D, 4.0D, 9.91D, 10.61D, 13.57D, 16.0D),
            Direction.SOUTH, Block.box(5.39D, 4.0D, 0.0D, 10.61D, 13.57D, 6.09D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.39D, 6.09D, 13.57D, 10.61D),
            Direction.WEST, Block.box(9.91D, 4.0D, 5.39D, 16.0D, 13.57D, 10.61D)));
    private static final Map<Direction, VoxelShape> FOX_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 10.0D, 12.0D, 10.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 10.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 6.0D, 10.0D, 12.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 4.0D, 16.0D, 10.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> FROG_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.5D, 4.0D, 7.0D, 11.5D, 9.0D, 16.0D),
            Direction.SOUTH, Block.box(4.5D, 4.0D, 0.0D, 11.5D, 9.0D, 9.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.5D, 9.0D, 9.0D, 11.5D),
            Direction.WEST, Block.box(7.0D, 4.0D, 4.5D, 16.0D, 9.0D, 11.5D)));
    private static final Map<Direction, VoxelShape> HORSE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.7D, 3.0D, 8.3D, 11.3D, 15.1D, 16.0D),
            Direction.SOUTH, Block.box(4.7D, 3.0D, 0.0D, 11.3D, 15.1D, 7.7D),
            Direction.EAST, Block.box(0.0D, 3.0D, 4.7D, 7.7D, 15.1D, 11.3D),
            Direction.WEST, Block.box(8.3D, 3.0D, 4.7D, 16.0D, 15.1D, 11.3D)));
    private static final Map<Direction, VoxelShape> HUSK_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(3.75D, 4.0D, 7.5D, 12.25D, 12.5D, 16.0D),
            Direction.SOUTH, Block.box(3.75D, 4.0D, 0.0D, 12.25D, 12.5D, 8.5D),
            Direction.EAST, Block.box(0.0D, 4.0D, 3.75D, 8.5D, 12.5D, 12.25D),
            Direction.WEST, Block.box(7.5D, 4.0D, 3.75D, 16.0D, 12.5D, 12.25D)));
    private static final Map<Direction, VoxelShape> IRON_GOLEM_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 14.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 14.0D, 12.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 14.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> LLAMA_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 10.0D, 12.0D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 14.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 6.0D, 14.0D, 12.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 4.0D, 16.0D, 14.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> MULE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.24D, 4.0D, 9.56D, 10.76D, 14.12D, 16.0D),
            Direction.SOUTH, Block.box(5.24D, 4.0D, 0.0D, 10.76D, 14.12D, 6.44D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.24D, 6.44D, 14.12D, 10.76D),
            Direction.WEST, Block.box(9.56D, 4.0D, 5.24D, 16.0D, 14.12D, 10.76D)));
    private static final Map<Direction, VoxelShape> OCELOT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.5D, 4.0D, 11.0D, 10.5D, 8.0D, 16.0D),
            Direction.SOUTH, Block.box(5.5D, 4.0D, 0.0D, 10.5D, 8.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.5D, 5.0D, 8.0D, 10.5D),
            Direction.WEST, Block.box(11.0D, 4.0D, 5.5D, 16.0D, 8.0D, 10.5D)));
    private static final Map<Direction, VoxelShape> PANDA_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(1.5D, 4.0D, 7.0D, 14.5D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(1.5D, 4.0D, 0.0D, 14.5D, 14.0D, 9.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 1.5D, 9.0D, 14.0D, 14.5D),
            Direction.WEST, Block.box(7.0D, 4.0D, 1.5D, 16.0D, 14.0D, 14.5D)));
    private static final Map<Direction, VoxelShape> PARROT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(7.0D, 4.0D, 12.0D, 9.0D, 8.0D, 16.0D),
            Direction.SOUTH, Block.box(7.0D, 4.0D, 0.0D, 9.0D, 8.0D, 4.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 7.0D, 4.0D, 8.0D, 9.0D),
            Direction.WEST, Block.box(12.0D, 4.0D, 7.0D, 16.0D, 8.0D, 9.0D)));
    private static final Map<Direction, VoxelShape> PHANTOM_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.5D, 4.0D, 11.0D, 11.5D, 7.0D, 16.0D),
            Direction.SOUTH, Block.box(4.5D, 4.0D, 0.0D, 11.5D, 7.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.5D, 5.0D, 7.0D, 11.5D),
            Direction.WEST, Block.box(11.0D, 4.0D, 4.5D, 16.0D, 7.0D, 11.5D)));
    private static final Map<Direction, VoxelShape> PIGLIN_AABBS = Maps.immutableEnumMap(Map.of(
            Direction.NORTH, Block.box(3.0D, 4.0D, 8.0D, 13.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(3.0D, 4.0D, 0.0D, 13.0D, 12.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 3.0D, 8.0D, 12.0D, 13.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 3.0D, 16.0D, 12.0D, 13.0D)));
    private static final Map<Direction, VoxelShape> POLAR_BEAR_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.5D, 4.0D, 9.0D, 11.5D, 11.0D, 16.0D),
            Direction.SOUTH, Block.box(4.5D, 4.0D, 0.0D, 11.5D, 11.0D, 7.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.5D, 7.0D, 11.0D, 11.5D),
            Direction.WEST, Block.box(9.0D, 4.0D, 4.5D, 16.0D, 11.0D, 11.5D)));
    private static final Map<Direction, VoxelShape> RABBIT_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.58333333D, 4.0D, 13.16666667D, 9.41666667D, 6.26666667D, 16.0D),
            Direction.SOUTH, Block.box(6.58333333D, 4.0D, 0.0D, 9.41666667D, 6.26666667D, 2.83333333D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.58333333D, 2.83333333D, 6.26666667D, 9.41666667D),
            Direction.WEST, Block.box(13.16666667D, 4.0D, 6.58333333D, 16.0D, 6.26666667D, 9.41666667D)));
    private static final Map<Direction, VoxelShape> RAVAGER_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 3.25D, 8.0D, 12.0D, 14.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 3.25D, 0.0D, 12.0D, 14.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 3.25D, 4.0D, 8.0D, 14.0D, 12.0D),
            Direction.WEST, Block.box(8.0D, 3.25D, 4.0D, 16.0D, 14.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> SALMON_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.5D, 4.0D, 5.0D, 9.5D, 9.0D, 16.0D),
            Direction.SOUTH, Block.box(6.5D, 4.0D, 0.0D, 9.5D, 9.0D, 11.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.5D, 11.0D, 9.0D, 9.5D),
            Direction.WEST, Block.box(5.0D, 4.0D, 6.5D, 16.0D, 9.0D, 9.5D)));
    private static final Map<Direction, VoxelShape> SHEEP_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 8.0D, 11.0D, 10.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 10.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 8.0D, 10.0D, 11.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 5.0D, 16.0D, 10.0D, 11.0D)));
    private static final Map<Direction, VoxelShape> SILVERFISH_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.0D, 4.0D, 12.0D, 10.0D, 7.0D, 16.0D),
            Direction.SOUTH, Block.box(6.0D, 4.0D, 0.0D, 10.0D, 7.0D, 4.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.0D, 4.0D, 7.0D, 10.0D),
            Direction.WEST, Block.box(12.0D, 4.0D, 6.0D, 16.0D, 7.0D, 10.0D)));
    private static final Map<Direction, VoxelShape> SNIFFER_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.75D, 4.0D, 6.0D, 11.25D, 11.5D, 16.0D),
            Direction.SOUTH, Block.box(4.75D, 4.0D, 0.0D, 11.25D, 11.5D, 10.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.75D, 10.0D, 11.5D, 11.25D),
            Direction.WEST, Block.box(6.0D, 4.0D, 4.75D, 16.0D, 11.5D, 11.25D)));
    private static final Map<Direction, VoxelShape> SQUID_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 10.0D, 11.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 12.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 6.0D, 12.0D, 11.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 5.0D, 16.0D, 12.0D, 11.0D)));
    private static final Map<Direction, VoxelShape> STRIDER_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 8.0D, 12.0D, 11.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 11.0D, 8.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 8.0D, 11.0D, 12.0D),
            Direction.WEST, Block.box(8.0D, 4.0D, 4.0D, 16.0D, 11.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> TADPOLE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(6.5D, 4.0D, 13.0D, 9.5D, 6.0D, 16.0D),
            Direction.SOUTH, Block.box(6.5D, 4.0D, 0.0D, 9.5D, 6.0D, 3.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 6.5D, 3.0D, 6.0D, 9.5D),
            Direction.WEST, Block.box(13.0D, 4.0D, 6.5D, 16.0D, 6.0D, 9.5D)));
    private static final Map<Direction, VoxelShape> TROPICAL_FISH_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(7.0D, 4.0D, 10.0D, 9.0D, 7.0D, 16.0D),
            Direction.SOUTH, Block.box(7.0D, 4.0D, 0.0D, 9.0D, 7.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 7.0D, 6.0D, 7.0D, 9.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 7.0D, 16.0D, 7.0D, 9.0D)));
    private static final Map<Direction, VoxelShape> TURTLE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 10.0D, 11.0D, 9.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 9.0D, 6.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 6.0D, 9.0D, 11.0D),
            Direction.WEST, Block.box(10.0D, 4.0D, 5.0D, 16.0D, 9.0D, 11.0D)));
    private static final Map<Direction, VoxelShape> UNDEAD_HORSE_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 9.0D, 11.0D, 15.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 15.0D, 7.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 7.0D, 15.0D, 11.0D),
            Direction.WEST, Block.box(9.0D, 4.0D, 5.0D, 16.0D, 15.0D, 11.0D)));
    private static final Map<Direction, VoxelShape> VILLAGER_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.25D, 4.0D, 8.5D, 11.75D, 13.375D, 16.0D),
            Direction.SOUTH, Block.box(4.25D, 4.0D, 0.0D, 11.75D, 13.375D, 7.5D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.25D, 7.5D, 13.375D, 11.75D),
            Direction.WEST, Block.box(8.5D, 4.0D, 4.25D, 16.0D, 13.375D, 11.75D)));
    private static final Map<Direction, VoxelShape> WARDEN_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(4.0D, 4.0D, 11.0D, 12.0D, 12.0D, 16.0D),
            Direction.SOUTH, Block.box(4.0D, 4.0D, 0.0D, 12.0D, 12.0D, 5.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 4.0D, 5.0D, 12.0D, 12.0D),
            Direction.WEST, Block.box(11.0D, 4.0D, 4.0D, 16.0D, 12.0D, 12.0D)));
    private static final Map<Direction, VoxelShape> WOLF_AABBS = Maps.newEnumMap(ImmutableMap.of(
            Direction.NORTH, Block.box(5.0D, 4.0D, 12.0D, 11.0D, 10.0D, 16.0D),
            Direction.SOUTH, Block.box(5.0D, 4.0D, 0.0D, 11.0D, 10.0D, 4.0D),
            Direction.EAST, Block.box(0.0D, 4.0D, 5.0D, 4.0D, 10.0D, 11.0D),
            Direction.WEST, Block.box(12.0D, 4.0D, 5.0D, 16.0D, 10.0D, 11.0D)));



    public EffectWallSkullBlock(SkullBlock.Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter,
                                        BlockPos blockPos, CollisionContext collisionContext) {
        if (EffectSkullBlock.Types.ALLAY.equals(this.getType()) || EffectSkullBlock.Types.VEX.equals(this.getType())) {
            return ALLAY_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.AXOLOTL_LUCY.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_WILD.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_GOLD.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.AXOLOTL_BLUE.equals(this.getType())) {
            return AXOLOTL_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.BAT.equals(this.getType())) {
            return BAT_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.BEE.equals(this.getType()) ||
                EffectSkullBlock.Types.BEE_ANGRY.equals(this.getType()) ||
                EffectSkullBlock.Types.BEE_POLLEN.equals(this.getType()) ||
                EffectSkullBlock.Types.BEE_ANGRY_POLLEN.equals(this.getType())) {
            return BEE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CAMEL.equals(this.getType())) {
            return CAMEL_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CAT_TABBY.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_SIAMESE.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_BRITISH_SHORTHAIR.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_CALICO.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_PERSIAN.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_RAGDOLL.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_JELLIE.equals(this.getType()) ||
                EffectSkullBlock.Types.CAT_ALL_BLACK.equals(this.getType())) {
            return CAT_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CAVE_SPIDER.equals(this.getType())) {
            return CAVE_SPIDER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.CHICKEN.equals(this.getType())) {
            return CHICKEN_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.COD.equals(this.getType())) {
            return COD_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.COW.equals(this.getType()) ||
                EffectSkullBlock.Types.MOOSHROOM_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.MOOSHROOM_BROWN.equals(this.getType())) {
            return COW_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.DOLPHIN.equals(this.getType())) {
            return DOLPHIN_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.DONKEY.equals(this.getType())) {
            return DONKEY_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.FOX_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.FOX_SNOW.equals(this.getType())) {
            return FOX_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.FROG_TEMPERATE.equals(this.getType()) ||
                EffectSkullBlock.Types.FROG_WARM.equals(this.getType()) ||
                EffectSkullBlock.Types.FROG_COLD.equals(this.getType())) {
            return FROG_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.HORSE_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CREAMY.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CHESTNUT.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_DARK_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_WHITE_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CREAMY_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BROWN_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BLACK_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_GRAY_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_WHITE_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CREAMY_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BROWN_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BLACK_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_GRAY_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_FIELD.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_WHITE_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CREAMY_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CHESTNUT_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BROWN_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BLACK_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_GRAY_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_DARK_BROWN_WHITE_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_WHITE_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CREAMY_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_CHESTNUT_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BROWN_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_BLACK_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_GRAY_BLACK_DOTS.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_DARK_BROWN_BLACK_DOTS.equals(this.getType())) {
            return HORSE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.HORSE_ZOMBIE.equals(this.getType()) ||
                EffectSkullBlock.Types.HORSE_SKELETON.equals(this.getType())) {
            return UNDEAD_HORSE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.HUSK.equals(this.getType())) {
            return HUSK_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.IRON_GOLEM.equals(this.getType())) {
            return IRON_GOLEM_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.LLAMA_CREAMY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_ORANGE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_ORANGE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_ORANGE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_ORANGE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_MAGENTA.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_MAGENTA.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_MAGENTA.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_MAGENTA.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_YELLOW.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_YELLOW.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_YELLOW.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_YELLOW.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_LIME.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_LIME.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_LIME.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_LIME.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_PINK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_PINK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_PINK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_PINK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_LIGHT_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_LIGHT_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_LIGHT_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_LIGHT_GRAY.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_CYAN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_PURPLE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_PURPLE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_PURPLE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_PURPLE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_RED.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_CREAMY_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_WHITE_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_BROWN_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.LLAMA_GRAY_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.TRADER_LLAMA_CREAMY.equals(this.getType()) ||
                EffectSkullBlock.Types.TRADER_LLAMA_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.TRADER_LLAMA_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.TRADER_LLAMA_GRAY.equals(this.getType())) {
            return LLAMA_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.MULE.equals(this.getType())) {
            return MULE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.OCELOT.equals(this.getType())) {
            return OCELOT_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.PANDA.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_AGGRESSIVE.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_LAZY.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_WORRIED.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_PLAYFUL.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_WEAK.equals(this.getType()) ||
                EffectSkullBlock.Types.PANDA_BROWN.equals(this.getType())) {
            return PANDA_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.PARROT_RED_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_GREEN.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                EffectSkullBlock.Types.PARROT_GREY.equals(this.getType())) {
            return PARROT_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.PHANTOM.equals(this.getType())) {
            return PHANTOM_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.PIGLIN_BRUTE.equals(this.getType()) ||
                EffectSkullBlock.Types.ZOMBIFIED_PIGLIN.equals(this.getType())) {
            return PIGLIN_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.POLAR_BEAR.equals(this.getType()) ||
                EffectSkullBlock.Types.SNOW_GOLEM.equals(this.getType())) {
            return POLAR_BEAR_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.RABBIT_BROWN.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_WHITE.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_BLACK.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_WHITE_SPLOTCHED.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_GOLD.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_SALT.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_CAERBANNOG.equals(this.getType()) ||
                EffectSkullBlock.Types.RABBIT_TOAST.equals(this.getType())) {
            return RABBIT_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.RAVAGER.equals(this.getType())) {
            return RAVAGER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.SALMON.equals(this.getType())) {
            return SALMON_AABBS.get(blockState.getValue(FACING));
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
        } if (EffectSkullBlock.Types.SILVERFISH.equals(this.getType())) {
            return SILVERFISH_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.SNIFFER.equals(this.getType())) {
            return SNIFFER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.SQUID.equals(this.getType()) ||
                EffectSkullBlock.Types.GLOW_SQUID.equals(this.getType())) {
            return SQUID_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.STRIDER.equals(this.getType()) ||
                EffectSkullBlock.Types.STRIDER_COLD.equals(this.getType())) {
            return STRIDER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.TADPOLE.equals(this.getType())) {
            return TADPOLE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.TROPICAL_FISH.equals(this.getType())) {
            return TROPICAL_FISH_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.TURTLE.equals(this.getType())) {
            return TURTLE_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.WANDERING_TRADER.equals(this.getType()) ||
                EffectSkullBlock.Types.WITCH.equals(this.getType()) ||
                EffectSkullBlock.Types.EVOKER.equals(this.getType()) ||
                EffectSkullBlock.Types.ILLUSIONER.equals(this.getType()) ||
                EffectSkullBlock.Types.PILLAGER.equals(this.getType()) ||
                EffectSkullBlock.Types.VINDICATOR.equals(this.getType())) {
            return VILLAGER_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.WARDEN.equals(this.getType())) {
            return WARDEN_AABBS.get(blockState.getValue(FACING));
        } if (EffectSkullBlock.Types.WOLF.equals(this.getType()) ||
                EffectSkullBlock.Types.WOLF_TAME.equals(this.getType()) ||
                EffectSkullBlock.Types.WOLF_ANGRY.equals(this.getType())) {
            return WOLF_AABBS.get(blockState.getValue(FACING));
        }
        return AABBS.get(blockState.getValue(FACING));
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new EffectSkullBlockEntity(blockPos, blockState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState,
                                                                  BlockEntityType<T> tBlockEntityType) {
        if (level.isClientSide) {
            boolean flag = blockState.is(ModBlocks.WITCH_WALL_HEAD.get()) || blockState.is(ModBlocks.GHAST_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get()) || blockState.is(ModBlocks.CAMEL_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.CREEPER_WALL_HEAD_CHARGED.get()) || blockState.is(ModBlocks.PUFFERFISH_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.ENDERMAN_WALL_HEAD.get()) || blockState.is(ModBlocks.WARDEN_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.STRIDER_WALL_HEAD.get()) || blockState.is(ModBlocks.STRIDER_WALL_HEAD_COLD.get()) ||
                    blockState.is(ModBlocks.PIGLIN_BRUTE_WALL_HEAD.get()) || blockState.is(ModBlocks.ZOMBIFIED_PIGLIN_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_WHITE.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_ORANGE.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_MAGENTA.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_LIGHT_BLUE.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_YELLOW.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_LIME.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_PINK.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_GRAY.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_LIGHT_GRAY.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_CYAN.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_PURPLE.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_BLUE.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_BROWN.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_GREEN.get()) || blockState.is(ModBlocks.SHULKER_WALL_HEAD_RED.get()) ||
                    blockState.is(ModBlocks.SHULKER_WALL_HEAD_BLACK.get()) || blockState.is(ModBlocks.SNIFFER_WALL_HEAD.get()) ||
                    blockState.is(ModBlocks.BEE_WALL_HEAD.get()) || blockState.is(ModBlocks.BEE_WALL_HEAD_ANGRY.get()) ||
                    blockState.is(ModBlocks.BEE_WALL_HEAD_POLLEN.get()) || blockState.is(ModBlocks.BEE_WALL_HEAD_ANGRY_POLLEN.get()) ||
                    blockState.is(ModBlocks.TADPOLE_WALL_HEAD.get()) || blockState.is(ModBlocks.FROG_WALL_HEAD_TEMPERATE.get()) ||
                    blockState.is(ModBlocks.FROG_WALL_HEAD_WARM.get()) || blockState.is(ModBlocks.FROG_WALL_HEAD_COLD.get());
            if (flag) {
                return createTickerHelper(tBlockEntityType, ModBlockEntities.EFFECT_SKULL.get(),
                        EffectSkullBlockEntity::animation);
            }
        }
        return null;
    }
}
