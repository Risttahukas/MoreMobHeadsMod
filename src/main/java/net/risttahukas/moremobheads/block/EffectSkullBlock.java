package net.risttahukas.moremobheads.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SkullBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.risttahukas.moremobheads.block.entity.EffectSkullBlockEntity;
import net.risttahukas.moremobheads.block.entity.ModBlockEntities;

public class EffectSkullBlock extends SkullBlock {
    protected static final VoxelShape ALLAY_SHAPE =
            Block.box(5.5D, 0.0D, 5.5D, 10.5D, 5.0D, 10.5D);
    protected static final VoxelShape AXOLOTL_SHAPE =
            Block.box(5.0D, 0.0D, 5.0D, 11.0D, 5.0D, 11.0D);
    protected static final VoxelShape BAT_SHAPE =
            Block.box(6.95D, 0.0D, 6.95D, 9.05D, 2.1D, 9.05D);
    protected static final VoxelShape CAMEL_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 14.0D, 11.5D);
    protected static final VoxelShape CAT_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 3.2D, 10.0D);
    protected static final VoxelShape CAVE_SPIDER_SHAPE =
            Block.box(5.2D, 0.0D, 5.2D, 10.8D, 5.6D, 10.8D);
    protected static final VoxelShape CHICKEN_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 6.0D, 10.0D);
    protected static final VoxelShape COD_SHAPE =
            Block.box(5.0D, 0.0D, 5.0D, 11.0D, 4.0D, 11.0D);
    protected static final VoxelShape DOLPHIN_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 7.0D, 12.0D);
    protected static final VoxelShape DONKEY_SHAPE =
            Block.box(4.955D, 0.0D, 4.955D, 11.045D, 9.57D, 11.045D);
    protected static final VoxelShape ELDER_GUARDIAN_SHAPE =
            Block.box(2.0D, 0.0D, 2.0D, 14.0D, 12.0D, 14.0D);
    protected static final VoxelShape ENDERMITE_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 3.0D, 10.0D);
    protected static final VoxelShape FROG_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 5.0D, 12.0D);
    protected static final VoxelShape HOGLIN_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 3.0D, 12.0D);
    protected static final VoxelShape HORSE_SHAPE =
            Block.box(4.15D, 0.0D, 4.15D, 11.85D, 12.1D, 11.85D);
    protected static final VoxelShape HUSK_SHAPE =
            Block.box(3.75D, 0.0D, 3.75D, 12.25D, 8.5D, 12.25D);
    protected static final VoxelShape IRON_GOLEM_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 10.0D, 12.0D);
    protected static final VoxelShape MULE_SHAPE =
            Block.box(4.78D, 0.0D, 4.78D, 11.22D, 10.12D, 11.22D);
    protected static final VoxelShape OCELOT_SHAPE =
            Block.box(5.5D, 0.0D, 5.5D, 10.5D, 4.0D, 10.5D);
    protected static final VoxelShape PANDA_SHAPE =
            Block.box(2.5D, 0.0D, 2.5D, 13.5D, 10.0D, 13.5D);
    protected static final VoxelShape PARROT_SHAPE =
            Block.box(7.0D, 0.0D, 7.0D, 9.0D, 4.0D, 9.0D);
    protected static final VoxelShape PHANTOM_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 3.0D, 11.5D);
    protected static final VoxelShape POLAR_BEAR_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 7.0D, 11.5D);
    protected static final VoxelShape RABBIT_SHAPE =
            Block.box(6.58333333D, 0.0D, 6.58333333D, 9.41666667D, 2.26666667D, 9.41666667D);
    protected static final VoxelShape RAVAGER_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 10.75D, 12.0D);
    protected static final VoxelShape SHEEP_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 6.0D, 12.0D);
    protected static final VoxelShape SNIFFER_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 7.5D, 12.0D);
    protected static final VoxelShape SQUID_SHAPE =
            Block.box(5.0D, 0.0D, 5.0D, 11.0D, 8.0D, 11.0D);
    protected static final VoxelShape STRIDER_SHAPE =
            Block.box(4.0D, 0.0D, 4.0D, 12.0D, 7.0D, 12.0D);
    protected static final VoxelShape TADPOLE_SHAPE =
            Block.box(6.5D, 0.0D, 6.5D, 9.5D, 2.0D, 9.5D);
    protected static final VoxelShape TROPICAL_FISH_SHAPE =
            Block.box(6.0D, 0.0D, 6.0D, 10.0D, 3.0D, 10.0D);
    protected static final VoxelShape UNDEAD_HORSE_SHAPE =
            Block.box(4.5D, 0.0D, 4.5D, 11.5D, 11.0D, 11.5D);
    protected static final VoxelShape VILLAGER_SHAPE =
            Block.box(4.25D, 0.0D, 4.25D, 11.75D, 9.375D, 11.75D);
    protected static final VoxelShape WITHER_SHAPE =
            Block.box(3.0D, 0.0D, 3.0D, 13.0D, 11.0D, 13.0D);
    protected static final VoxelShape WOLF_SHAPE =
            Block.box(5.0D, 0.0D, 5.0D, 11.0D, 6.0D, 11.0D);


    public EffectSkullBlock(Type type, Properties properties) {
        super(type, properties);
    }

    @Override
    public VoxelShape getShape(BlockState blockState, BlockGetter blockGetter,
                                        BlockPos blockPos, CollisionContext collisionContext) {
        if (Types.ALLAY.equals(this.getType()) || Types.VEX.equals(this.getType())) {
            return ALLAY_SHAPE;
        } if (Types.AXOLOTL_LUCY.equals(this.getType()) || Types.AXOLOTL_WILD.equals(this.getType()) ||
                Types.AXOLOTL_GOLD.equals(this.getType()) || Types.AXOLOTL_CYAN.equals(this.getType()) ||
                Types.AXOLOTL_BLUE.equals(this.getType()) || Types.TURTLE.equals(this.getType()) ||
                Types.SALMON.equals(this.getType())) {
            return AXOLOTL_SHAPE;
        } if (Types.BAT.equals(this.getType())) {
            return BAT_SHAPE;
        } if (Types.CAMEL.equals(this.getType())) {
            return CAMEL_SHAPE;
        } if (Types.CAT_TABBY.equals(this.getType()) || Types.CAT_BLACK.equals(this.getType()) ||
                Types.CAT_RED.equals(this.getType()) || Types.CAT_SIAMESE.equals(this.getType()) ||
                Types.CAT_BRITISH_SHORTHAIR.equals(this.getType()) || Types.CAT_CALICO.equals(this.getType()) ||
                Types.CAT_PERSIAN.equals(this.getType()) || Types.CAT_RAGDOLL.equals(this.getType()) ||
                Types.CAT_WHITE.equals(this.getType()) || Types.CAT_JELLIE.equals(this.getType()) ||
                Types.CAT_ALL_BLACK.equals(this.getType())) {
            return CAT_SHAPE;
        } if (Types.CAVE_SPIDER.equals(this.getType())) {
            return CAVE_SPIDER_SHAPE;
        } if (Types.CHICKEN.equals(this.getType())) {
            return CHICKEN_SHAPE;
        } if (Types.COD.equals(this.getType())) {
            return COD_SHAPE;
        } if (Types.DOLPHIN.equals(this.getType()) || Types.BEE.equals(this.getType()) ||
                Types.BEE_ANGRY.equals(this.getType()) || Types.BEE_POLLEN.equals(this.getType()) ||
                Types.BEE_ANGRY_POLLEN.equals(this.getType()) || Types.GOAT.equals(this.getType()) ||
                Types.GOAT_SCREAMING.equals(this.getType())) {
            return DOLPHIN_SHAPE;
        } if (Types.DONKEY.equals(this.getType())) {
            return DONKEY_SHAPE;
        } if (Types.GUARDIAN_ELDER.equals(this.getType())) {
            return ELDER_GUARDIAN_SHAPE;
        } if (Types.ENDERMITE.equals(this.getType())) {
            return ENDERMITE_SHAPE;
        } if (Types.FROG_TEMPERATE.equals(this.getType()) || Types.FROG_WARM.equals(this.getType()) ||
                Types.FROG_COLD.equals(this.getType())) {
            return FROG_SHAPE;
        } if (Types.HOGLIN.equals(this.getType()) || Types.ZOGLIN.equals(this.getType())) {
            return HOGLIN_SHAPE;
        } if (Types.HORSE_WHITE.equals(this.getType()) || Types.HORSE_CREAMY.equals(this.getType()) ||
                Types.HORSE_CHESTNUT.equals(this.getType()) || Types.HORSE_BROWN.equals(this.getType()) ||
                Types.HORSE_BLACK.equals(this.getType()) || Types.HORSE_GRAY.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE.equals(this.getType()) || Types.HORSE_CREAMY_WHITE.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE.equals(this.getType()) || Types.HORSE_BROWN_WHITE.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE.equals(this.getType()) || Types.HORSE_GRAY_WHITE.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE_FIELD.equals(this.getType()) || Types.HORSE_CREAMY_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE_FIELD.equals(this.getType()) || Types.HORSE_BROWN_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE_FIELD.equals(this.getType()) || Types.HORSE_GRAY_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE_FIELD.equals(this.getType()) ||
                Types.HORSE_WHITE_WHITE_DOTS.equals(this.getType()) || Types.HORSE_CREAMY_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_WHITE_DOTS.equals(this.getType()) || Types.HORSE_BROWN_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_BLACK_WHITE_DOTS.equals(this.getType()) || Types.HORSE_GRAY_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_WHITE_DOTS.equals(this.getType()) ||
                Types.HORSE_WHITE_BLACK_DOTS.equals(this.getType()) || Types.HORSE_CREAMY_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_CHESTNUT_BLACK_DOTS.equals(this.getType()) || Types.HORSE_BROWN_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_BLACK_BLACK_DOTS.equals(this.getType()) || Types.HORSE_GRAY_BLACK_DOTS.equals(this.getType()) ||
                Types.HORSE_DARK_BROWN_BLACK_DOTS.equals(this.getType())) {
            return HORSE_SHAPE;
        } if (Types.HORSE_ZOMBIE.equals(this.getType()) || Types.HORSE_SKELETON.equals(this.getType())) {
            return UNDEAD_HORSE_SHAPE;
        } if (Types.HUSK.equals(this.getType())) {
            return HUSK_SHAPE;
        } if (Types.IRON_GOLEM.equals(this.getType()) ||
                Types.LLAMA_CREAMY.equals(this.getType()) || Types.LLAMA_WHITE.equals(this.getType()) ||
                Types.LLAMA_BROWN.equals(this.getType()) || Types.LLAMA_GRAY.equals(this.getType()) ||
                Types.LLAMA_CREAMY_WHITE.equals(this.getType()) || Types.LLAMA_WHITE_WHITE.equals(this.getType()) ||
                Types.LLAMA_BROWN_WHITE.equals(this.getType()) || Types.LLAMA_GRAY_WHITE.equals(this.getType()) ||
                Types.LLAMA_CREAMY_ORANGE.equals(this.getType()) || Types.LLAMA_WHITE_ORANGE.equals(this.getType()) ||
                Types.LLAMA_BROWN_ORANGE.equals(this.getType()) || Types.LLAMA_GRAY_ORANGE.equals(this.getType()) ||
                Types.LLAMA_CREAMY_MAGENTA.equals(this.getType()) || Types.LLAMA_WHITE_MAGENTA.equals(this.getType()) ||
                Types.LLAMA_BROWN_MAGENTA.equals(this.getType()) || Types.LLAMA_GRAY_MAGENTA.equals(this.getType()) ||
                Types.LLAMA_CREAMY_LIGHT_BLUE.equals(this.getType()) || Types.LLAMA_WHITE_LIGHT_BLUE.equals(this.getType()) ||
                Types.LLAMA_BROWN_LIGHT_BLUE.equals(this.getType()) || Types.LLAMA_GRAY_LIGHT_BLUE.equals(this.getType()) ||
                Types.LLAMA_CREAMY_YELLOW.equals(this.getType()) || Types.LLAMA_WHITE_YELLOW.equals(this.getType()) ||
                Types.LLAMA_BROWN_YELLOW.equals(this.getType()) || Types.LLAMA_GRAY_YELLOW.equals(this.getType()) ||
                Types.LLAMA_CREAMY_LIME.equals(this.getType()) || Types.LLAMA_WHITE_LIME.equals(this.getType()) ||
                Types.LLAMA_BROWN_LIME.equals(this.getType()) || Types.LLAMA_GRAY_LIME.equals(this.getType()) ||
                Types.LLAMA_CREAMY_PINK.equals(this.getType()) || Types.LLAMA_WHITE_PINK.equals(this.getType()) ||
                Types.LLAMA_BROWN_PINK.equals(this.getType()) || Types.LLAMA_GRAY_PINK.equals(this.getType()) ||
                Types.LLAMA_CREAMY_GRAY.equals(this.getType()) || Types.LLAMA_WHITE_GRAY.equals(this.getType()) ||
                Types.LLAMA_BROWN_GRAY.equals(this.getType()) || Types.LLAMA_GRAY_GRAY.equals(this.getType()) ||
                Types.LLAMA_CREAMY_LIGHT_GRAY.equals(this.getType()) || Types.LLAMA_WHITE_LIGHT_GRAY.equals(this.getType()) ||
                Types.LLAMA_BROWN_LIGHT_GRAY.equals(this.getType()) || Types.LLAMA_GRAY_LIGHT_GRAY.equals(this.getType()) ||
                Types.LLAMA_CREAMY_CYAN.equals(this.getType()) || Types.LLAMA_WHITE_CYAN.equals(this.getType()) ||
                Types.LLAMA_BROWN_CYAN.equals(this.getType()) || Types.LLAMA_GRAY_CYAN.equals(this.getType()) ||
                Types.LLAMA_CREAMY_PURPLE.equals(this.getType()) || Types.LLAMA_WHITE_PURPLE.equals(this.getType()) ||
                Types.LLAMA_BROWN_PURPLE.equals(this.getType()) || Types.LLAMA_GRAY_PURPLE.equals(this.getType()) ||
                Types.LLAMA_CREAMY_BLUE.equals(this.getType()) || Types.LLAMA_WHITE_BLUE.equals(this.getType()) ||
                Types.LLAMA_BROWN_BLUE.equals(this.getType()) || Types.LLAMA_GRAY_BLUE.equals(this.getType()) ||
                Types.LLAMA_CREAMY_BROWN.equals(this.getType()) || Types.LLAMA_WHITE_BROWN.equals(this.getType()) ||
                Types.LLAMA_BROWN_BROWN.equals(this.getType()) || Types.LLAMA_GRAY_BROWN.equals(this.getType()) ||
                Types.LLAMA_CREAMY_GREEN.equals(this.getType()) || Types.LLAMA_WHITE_GREEN.equals(this.getType()) ||
                Types.LLAMA_BROWN_GREEN.equals(this.getType()) || Types.LLAMA_GRAY_GREEN.equals(this.getType()) ||
                Types.LLAMA_CREAMY_RED.equals(this.getType()) || Types.LLAMA_WHITE_RED.equals(this.getType()) ||
                Types.LLAMA_BROWN_RED.equals(this.getType()) || Types.LLAMA_GRAY_RED.equals(this.getType()) ||
                Types.LLAMA_CREAMY_BLACK.equals(this.getType()) || Types.LLAMA_WHITE_BLACK.equals(this.getType()) ||
                Types.LLAMA_BROWN_BLACK.equals(this.getType()) || Types.LLAMA_GRAY_BLACK.equals(this.getType()) ||
                Types.TRADER_LLAMA_CREAMY.equals(this.getType()) || Types.TRADER_LLAMA_WHITE.equals(this.getType()) ||
                Types.TRADER_LLAMA_BROWN.equals(this.getType()) || Types.TRADER_LLAMA_GRAY.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_DESERT_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_DESERT_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_JUNGLE_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_JUNGLE_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_PLAINS_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_PLAINS_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SAVANNA_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SAVANNA_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SNOW_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SNOW_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_SWAMP_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_SWAMP_NITWIT.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_ARMORER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_BUTCHER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_CARTOGRAPHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_CLERIC.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_FARMER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_FISHERMAN.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_FLETCHER.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_LEATHERWORKER.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_LIBRARIAN.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_MASON.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_SHEPHERD.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_TOOLSMITH.equals(this.getType()) || Types.ZOMBIE_VILLAGER_TAIGA_WEAPONSMITH.equals(this.getType()) ||
                Types.ZOMBIE_VILLAGER_TAIGA_NITWIT.equals(this.getType())) {
            return IRON_GOLEM_SHAPE;
        } if (Types.MULE.equals(this.getType())) {
            return MULE_SHAPE;
        } if (Types.OCELOT.equals(this.getType())) {
            return OCELOT_SHAPE;
        } if (Types.PANDA.equals(this.getType()) || Types.PANDA_AGGRESSIVE.equals(this.getType()) ||
                Types.PANDA_LAZY.equals(this.getType()) || Types.PANDA_WORRIED.equals(this.getType()) ||
                Types.PANDA_PLAYFUL.equals(this.getType()) || Types.PANDA_WEAK.equals(this.getType()) ||
                Types.PANDA_BROWN.equals(this.getType())) {
            return PANDA_SHAPE;
        } if (Types.PARROT_RED_BLUE.equals(this.getType()) || Types.PARROT_BLUE.equals(this.getType()) ||
                Types.PARROT_GREEN.equals(this.getType()) || Types.PARROT_YELLOW_BLUE.equals(this.getType()) ||
                Types.PARROT_GRAY.equals(this.getType())) {
            return PARROT_SHAPE;
        } if (Types.PHANTOM.equals(this.getType())) {
            return PHANTOM_SHAPE;
        } if (Types.PIGLIN_BRUTE.equals(this.getType()) || Types.ZOMBIFIED_PIGLIN.equals(this.getType()) ) {
            return PIGLIN_SHAPE;
        } if (Types.POLAR_BEAR.equals(this.getType()) || Types.SNOW_GOLEM.equals(this.getType()) ) {
            return POLAR_BEAR_SHAPE;
        } if (Types.RABBIT_BROWN.equals(this.getType()) || Types.RABBIT_WHITE.equals(this.getType()) ||
                Types.RABBIT_BLACK.equals(this.getType()) || Types.RABBIT_WHITE_SPLOTCHED.equals(this.getType()) ||
                Types.RABBIT_GOLD.equals(this.getType()) || Types.RABBIT_SALT.equals(this.getType()) ||
                Types.RABBIT_CAERBANNOG.equals(this.getType()) || Types.RABBIT_TOAST.equals(this.getType())) {
            return RABBIT_SHAPE;
        } if (Types.RAVAGER.equals(this.getType())) {
            return RAVAGER_SHAPE;
        } if (Types.SHEEP_WHITE.equals(this.getType()) || Types.SHEEP_ORANGE.equals(this.getType()) ||
                Types.SHEEP_MAGENTA.equals(this.getType()) || Types.SHEEP_LIGHT_BLUE.equals(this.getType()) ||
                Types.SHEEP_YELLOW.equals(this.getType()) || Types.SHEEP_LIME.equals(this.getType()) ||
                Types.SHEEP_PINK.equals(this.getType()) || Types.SHEEP_GRAY.equals(this.getType()) ||
                Types.SHEEP_LIGHT_GRAY.equals(this.getType()) || Types.SHEEP_CYAN.equals(this.getType()) ||
                Types.SHEEP_PURPLE.equals(this.getType()) || Types.SHEEP_BLUE.equals(this.getType()) ||
                Types.SHEEP_BROWN.equals(this.getType()) || Types.SHEEP_GREEN.equals(this.getType()) ||
                Types.SHEEP_RED.equals(this.getType()) || Types.SHEEP_BLACK.equals(this.getType()) ||
                Types.SHEEP_RAINBOW.equals(this.getType()) || Types.FOX_RED.equals(this.getType()) ||
                Types.FOX_SNOW.equals(this.getType())) {
            return SHEEP_SHAPE;
        } if (Types.SNIFFER.equals(this.getType())) {
            return SNIFFER_SHAPE;
        } if (Types.SQUID.equals(this.getType()) || Types.GLOW_SQUID.equals(this.getType())) {
            return SQUID_SHAPE;
        } if (Types.STRIDER.equals(this.getType()) || Types.STRIDER_COLD.equals(this.getType())) {
            return STRIDER_SHAPE;
        } if (Types.TADPOLE.equals(this.getType())) {
            return TADPOLE_SHAPE;
        } if (Types.TROPICAL_FISH.equals(this.getType()) || Types.SILVERFISH.equals(this.getType())) {
            return TROPICAL_FISH_SHAPE;
        } if (Types.WANDERING_TRADER.equals(this.getType()) || Types.WITCH.equals(this.getType()) ||
                Types.EVOKER.equals(this.getType()) || Types.ILLUSIONER.equals(this.getType()) ||
                Types.PILLAGER.equals(this.getType()) || Types.VINDICATOR.equals(this.getType()) ||
                Types.VILLAGER_DESERT.equals(this.getType()) || Types.VILLAGER_DESERT_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_DESERT_BUTCHER.equals(this.getType()) || Types.VILLAGER_DESERT_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_DESERT_CLERIC.equals(this.getType()) || Types.VILLAGER_DESERT_FARMER.equals(this.getType()) ||
                Types.VILLAGER_DESERT_FISHERMAN.equals(this.getType()) || Types.VILLAGER_DESERT_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_DESERT_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_DESERT_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_DESERT_MASON.equals(this.getType()) || Types.VILLAGER_DESERT_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_DESERT_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_DESERT_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_DESERT_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE.equals(this.getType()) || Types.VILLAGER_JUNGLE_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_BUTCHER.equals(this.getType()) || Types.VILLAGER_JUNGLE_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_CLERIC.equals(this.getType()) || Types.VILLAGER_JUNGLE_FARMER.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_FISHERMAN.equals(this.getType()) || Types.VILLAGER_JUNGLE_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_JUNGLE_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_MASON.equals(this.getType()) || Types.VILLAGER_JUNGLE_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_JUNGLE_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_JUNGLE_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_PLAINS.equals(this.getType()) || Types.VILLAGER_PLAINS_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_BUTCHER.equals(this.getType()) || Types.VILLAGER_PLAINS_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_CLERIC.equals(this.getType()) || Types.VILLAGER_PLAINS_FARMER.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_FISHERMAN.equals(this.getType()) || Types.VILLAGER_PLAINS_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_PLAINS_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_MASON.equals(this.getType()) || Types.VILLAGER_PLAINS_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_PLAINS_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_PLAINS_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA.equals(this.getType()) || Types.VILLAGER_SAVANNA_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_BUTCHER.equals(this.getType()) || Types.VILLAGER_SAVANNA_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_CLERIC.equals(this.getType()) || Types.VILLAGER_SAVANNA_FARMER.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_FISHERMAN.equals(this.getType()) || Types.VILLAGER_SAVANNA_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_SAVANNA_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_MASON.equals(this.getType()) || Types.VILLAGER_SAVANNA_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_SAVANNA_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_SAVANNA_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_SNOW.equals(this.getType()) || Types.VILLAGER_SNOW_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_SNOW_BUTCHER.equals(this.getType()) || Types.VILLAGER_SNOW_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_SNOW_CLERIC.equals(this.getType()) || Types.VILLAGER_SNOW_FARMER.equals(this.getType()) ||
                Types.VILLAGER_SNOW_FISHERMAN.equals(this.getType()) || Types.VILLAGER_SNOW_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_SNOW_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_SNOW_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_SNOW_MASON.equals(this.getType()) || Types.VILLAGER_SNOW_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_SNOW_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_SNOW_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_SNOW_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_SWAMP.equals(this.getType()) || Types.VILLAGER_SWAMP_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_BUTCHER.equals(this.getType()) || Types.VILLAGER_SWAMP_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_CLERIC.equals(this.getType()) || Types.VILLAGER_SWAMP_FARMER.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_FISHERMAN.equals(this.getType()) || Types.VILLAGER_SWAMP_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_SWAMP_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_MASON.equals(this.getType()) || Types.VILLAGER_SWAMP_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_SWAMP_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_SWAMP_NITWIT.equals(this.getType()) ||
                Types.VILLAGER_TAIGA.equals(this.getType()) || Types.VILLAGER_TAIGA_ARMORER.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_BUTCHER.equals(this.getType()) || Types.VILLAGER_TAIGA_CARTOGRAPHER.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_CLERIC.equals(this.getType()) || Types.VILLAGER_TAIGA_FARMER.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_FISHERMAN.equals(this.getType()) || Types.VILLAGER_TAIGA_FLETCHER.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_LEATHERWORKER.equals(this.getType()) || Types.VILLAGER_TAIGA_LIBRARIAN.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_MASON.equals(this.getType()) || Types.VILLAGER_TAIGA_SHEPHERD.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_TOOLSMITH.equals(this.getType()) || Types.VILLAGER_TAIGA_WEAPONSMITH.equals(this.getType()) ||
                Types.VILLAGER_TAIGA_NITWIT.equals(this.getType())) {
            return VILLAGER_SHAPE;
        } if (Types.WITHER.equals(this.getType()) || Types.WITHER_INVULNERABLE.equals(this.getType()) ||
                Types.WITHER_SHIELD.equals(this.getType()) || Types.WITHER_INVULNERABLE_SHIELD.equals(this.getType())) {
            return WITHER_SHAPE;
        } if (Types.WOLF.equals(this.getType()) || Types.WOLF_TAME.equals(this.getType()) ||
                Types.WOLF_ANGRY.equals(this.getType())) {
            return WOLF_SHAPE;
        }
        return SHAPE;
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos blockPos, BlockState blockState) {
        return new EffectSkullBlockEntity(blockPos, blockState);
    }

    @Override
    public <T extends BlockEntity> BlockEntityTicker<T> getTicker(Level level, BlockState blockState,
                                                                  BlockEntityType<T> tBlockEntityType) {
        if (level.isClientSide) {
            boolean flag = blockState.is(ModBlocks.WITCH_HEAD.get()) || blockState.is(ModBlocks.GHAST_HEAD.get()) ||
                    blockState.is(ModBlocks.SHEEP_HEAD_RAINBOW.get()) || blockState.is(ModBlocks.CAMEL_HEAD.get()) ||
                    blockState.is(ModBlocks.CREEPER_HEAD_CHARGED.get()) || blockState.is(ModBlocks.PUFFERFISH_HEAD.get()) ||
                    blockState.is(ModBlocks.ENDERMAN_HEAD.get()) || blockState.is(ModBlocks.WARDEN_HEAD.get()) ||
                    blockState.is(ModBlocks.STRIDER_HEAD.get()) || blockState.is(ModBlocks.STRIDER_HEAD_COLD.get()) ||
                    blockState.is(ModBlocks.PIGLIN_BRUTE_HEAD.get()) || blockState.is(ModBlocks.ZOMBIFIED_PIGLIN_HEAD.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD.get()) || blockState.is(ModBlocks.SHULKER_HEAD_WHITE.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_ORANGE.get()) || blockState.is(ModBlocks.SHULKER_HEAD_MAGENTA.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_LIGHT_BLUE.get()) || blockState.is(ModBlocks.SHULKER_HEAD_YELLOW.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_LIME.get()) || blockState.is(ModBlocks.SHULKER_HEAD_PINK.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_GRAY.get()) || blockState.is(ModBlocks.SHULKER_HEAD_LIGHT_GRAY.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_CYAN.get()) || blockState.is(ModBlocks.SHULKER_HEAD_PURPLE.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_BLUE.get()) || blockState.is(ModBlocks.SHULKER_HEAD_BROWN.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_GREEN.get()) || blockState.is(ModBlocks.SHULKER_HEAD_RED.get()) ||
                    blockState.is(ModBlocks.SHULKER_HEAD_BLACK.get()) || blockState.is(ModBlocks.SNIFFER_HEAD.get()) ||
                    blockState.is(ModBlocks.BEE_HEAD.get()) || blockState.is(ModBlocks.BEE_HEAD_ANGRY.get()) ||
                    blockState.is(ModBlocks.BEE_HEAD_POLLEN.get()) || blockState.is(ModBlocks.BEE_HEAD_ANGRY_POLLEN.get()) ||
                    blockState.is(ModBlocks.TADPOLE_HEAD.get()) || blockState.is(ModBlocks.FROG_HEAD_TEMPERATE.get()) ||
                    blockState.is(ModBlocks.FROG_HEAD_WARM.get()) || blockState.is(ModBlocks.FROG_HEAD_COLD.get()) ||
                    blockState.is(ModBlocks.GUARDIAN_HEAD.get()) || blockState.is(ModBlocks.GUARDIAN_ELDER_HEAD.get()) ||
                    blockState.is(ModBlocks.WITHER_HEAD_SHIELD.get()) || blockState.is(ModBlocks.WITHER_HEAD_INVULNERABLE_SHIELD.get());
            if (flag) {
                return createTickerHelper(tBlockEntityType, ModBlockEntities.EFFECT_SKULL.get(),
                        EffectSkullBlockEntity::animation);
            }
        }
        return null;
    }

    @SuppressWarnings("unused")
    public enum Types implements SkullBlock.Type {
        ALLAY,
        AXOLOTL_LUCY,
        AXOLOTL_WILD,
        AXOLOTL_GOLD,
        AXOLOTL_CYAN,
        AXOLOTL_BLUE,
        BAT,
        BEE,
        BEE_ANGRY,
        BEE_POLLEN,
        BEE_ANGRY_POLLEN,
        BLAZE,
        CAMEL,
        CAT_TABBY,
        CAT_BLACK,
        CAT_RED,
        CAT_SIAMESE,
        CAT_BRITISH_SHORTHAIR,
        CAT_CALICO,
        CAT_PERSIAN,
        CAT_RAGDOLL,
        CAT_WHITE,
        CAT_JELLIE,
        CAT_ALL_BLACK,
        CAVE_SPIDER,
        CHICKEN,
        COD,
        COW,
        CREEPER_CHARGED,
        DOLPHIN,
        DONKEY,
        DROWNED,
        ENDERMAN,
        ENDERMITE,
        EVOKER,
        FOX_RED,
        FOX_SNOW,
        FROG_TEMPERATE,
        FROG_WARM,
        FROG_COLD,
        GHAST,
        GOAT,
        GOAT_SCREAMING,
        GLOW_SQUID,
        GUARDIAN,
        GUARDIAN_ELDER,
        HOGLIN,
        HORSE_WHITE,
        HORSE_CREAMY,
        HORSE_CHESTNUT,
        HORSE_BROWN,
        HORSE_BLACK,
        HORSE_GRAY,
        HORSE_DARK_BROWN,
        HORSE_WHITE_WHITE,
        HORSE_CREAMY_WHITE,
        HORSE_CHESTNUT_WHITE,
        HORSE_BROWN_WHITE,
        HORSE_BLACK_WHITE,
        HORSE_GRAY_WHITE,
        HORSE_DARK_BROWN_WHITE,
        HORSE_WHITE_WHITE_FIELD,
        HORSE_CREAMY_WHITE_FIELD,
        HORSE_CHESTNUT_WHITE_FIELD,
        HORSE_BROWN_WHITE_FIELD,
        HORSE_BLACK_WHITE_FIELD,
        HORSE_GRAY_WHITE_FIELD,
        HORSE_DARK_BROWN_WHITE_FIELD,
        HORSE_WHITE_WHITE_DOTS,
        HORSE_CREAMY_WHITE_DOTS,
        HORSE_CHESTNUT_WHITE_DOTS,
        HORSE_BROWN_WHITE_DOTS,
        HORSE_BLACK_WHITE_DOTS,
        HORSE_GRAY_WHITE_DOTS,
        HORSE_DARK_BROWN_WHITE_DOTS,
        HORSE_WHITE_BLACK_DOTS,
        HORSE_CREAMY_BLACK_DOTS,
        HORSE_CHESTNUT_BLACK_DOTS,
        HORSE_BROWN_BLACK_DOTS,
        HORSE_BLACK_BLACK_DOTS,
        HORSE_GRAY_BLACK_DOTS,
        HORSE_DARK_BROWN_BLACK_DOTS,
        HORSE_ZOMBIE,
        HORSE_SKELETON,
        HUSK,
        ILLUSIONER,
        IRON_GOLEM,
        LLAMA_CREAMY,
        LLAMA_WHITE,
        LLAMA_BROWN,
        LLAMA_GRAY,
        LLAMA_CREAMY_WHITE,
        LLAMA_WHITE_WHITE,
        LLAMA_BROWN_WHITE,
        LLAMA_GRAY_WHITE,
        LLAMA_CREAMY_ORANGE,
        LLAMA_WHITE_ORANGE,
        LLAMA_BROWN_ORANGE,
        LLAMA_GRAY_ORANGE,
        LLAMA_CREAMY_MAGENTA,
        LLAMA_WHITE_MAGENTA,
        LLAMA_BROWN_MAGENTA,
        LLAMA_GRAY_MAGENTA,
        LLAMA_CREAMY_LIGHT_BLUE,
        LLAMA_WHITE_LIGHT_BLUE,
        LLAMA_BROWN_LIGHT_BLUE,
        LLAMA_GRAY_LIGHT_BLUE,
        LLAMA_CREAMY_YELLOW,
        LLAMA_WHITE_YELLOW,
        LLAMA_BROWN_YELLOW,
        LLAMA_GRAY_YELLOW,
        LLAMA_CREAMY_LIME,
        LLAMA_WHITE_LIME,
        LLAMA_BROWN_LIME,
        LLAMA_GRAY_LIME,
        LLAMA_CREAMY_PINK,
        LLAMA_WHITE_PINK,
        LLAMA_BROWN_PINK,
        LLAMA_GRAY_PINK,
        LLAMA_CREAMY_GRAY,
        LLAMA_WHITE_GRAY,
        LLAMA_BROWN_GRAY,
        LLAMA_GRAY_GRAY,
        LLAMA_CREAMY_LIGHT_GRAY,
        LLAMA_WHITE_LIGHT_GRAY,
        LLAMA_BROWN_LIGHT_GRAY,
        LLAMA_GRAY_LIGHT_GRAY,
        LLAMA_CREAMY_CYAN,
        LLAMA_WHITE_CYAN,
        LLAMA_BROWN_CYAN,
        LLAMA_GRAY_CYAN,
        LLAMA_CREAMY_PURPLE,
        LLAMA_WHITE_PURPLE,
        LLAMA_BROWN_PURPLE,
        LLAMA_GRAY_PURPLE,
        LLAMA_CREAMY_BLUE,
        LLAMA_WHITE_BLUE,
        LLAMA_BROWN_BLUE,
        LLAMA_GRAY_BLUE,
        LLAMA_CREAMY_BROWN,
        LLAMA_WHITE_BROWN,
        LLAMA_BROWN_BROWN,
        LLAMA_GRAY_BROWN,
        LLAMA_CREAMY_GREEN,
        LLAMA_WHITE_GREEN,
        LLAMA_BROWN_GREEN,
        LLAMA_GRAY_GREEN,
        LLAMA_CREAMY_RED,
        LLAMA_WHITE_RED,
        LLAMA_BROWN_RED,
        LLAMA_GRAY_RED,
        LLAMA_CREAMY_BLACK,
        LLAMA_WHITE_BLACK,
        LLAMA_BROWN_BLACK,
        LLAMA_GRAY_BLACK,
        MAGMA_CUBE,
        MOOSHROOM_RED,
        MOOSHROOM_BROWN,
        MULE,
        OCELOT,
        PANDA,
        PANDA_AGGRESSIVE,
        PANDA_LAZY,
        PANDA_WORRIED,
        PANDA_PLAYFUL,
        PANDA_WEAK,
        PANDA_BROWN,
        PARROT_RED_BLUE,
        PARROT_BLUE,
        PARROT_GREEN,
        PARROT_YELLOW_BLUE,
        PARROT_GRAY,
        PHANTOM,
        PIG,
        PIGLIN_BRUTE,
        PILLAGER,
        POLAR_BEAR,
        PUFFERFISH,
        RABBIT_BROWN,
        RABBIT_WHITE,
        RABBIT_BLACK,
        RABBIT_WHITE_SPLOTCHED,
        RABBIT_GOLD,
        RABBIT_SALT,
        RABBIT_CAERBANNOG,
        RABBIT_TOAST,
        RAVAGER,
        SALMON,
        SHEEP_WHITE,
        SHEEP_ORANGE,
        SHEEP_MAGENTA,
        SHEEP_LIGHT_BLUE,
        SHEEP_YELLOW,
        SHEEP_LIME,
        SHEEP_PINK,
        SHEEP_GRAY,
        SHEEP_LIGHT_GRAY,
        SHEEP_CYAN,
        SHEEP_PURPLE,
        SHEEP_BLUE,
        SHEEP_BROWN,
        SHEEP_GREEN,
        SHEEP_RED,
        SHEEP_BLACK,
        SHEEP_RAINBOW,
        SHULKER,
        SHULKER_WHITE,
        SHULKER_ORANGE,
        SHULKER_MAGENTA,
        SHULKER_LIGHT_BLUE,
        SHULKER_YELLOW,
        SHULKER_LIME,
        SHULKER_PINK,
        SHULKER_GRAY,
        SHULKER_LIGHT_GRAY,
        SHULKER_CYAN,
        SHULKER_PURPLE,
        SHULKER_BLUE,
        SHULKER_BROWN,
        SHULKER_GREEN,
        SHULKER_RED,
        SHULKER_BLACK,
        SILVERFISH,
        SLIME,
        SNIFFER,
        SNOW_GOLEM,
        SPIDER,
        SQUID,
        STRAY,
        STRIDER,
        STRIDER_COLD,
        TADPOLE,
        TRADER_LLAMA_CREAMY,
        TRADER_LLAMA_WHITE,
        TRADER_LLAMA_BROWN,
        TRADER_LLAMA_GRAY,
        TROPICAL_FISH,
        TURTLE,
        VEX,
        VILLAGER_DESERT,
        VILLAGER_DESERT_ARMORER,
        VILLAGER_DESERT_BUTCHER,
        VILLAGER_DESERT_CARTOGRAPHER,
        VILLAGER_DESERT_CLERIC,
        VILLAGER_DESERT_FARMER,
        VILLAGER_DESERT_FISHERMAN,
        VILLAGER_DESERT_FLETCHER,
        VILLAGER_DESERT_LEATHERWORKER,
        VILLAGER_DESERT_LIBRARIAN,
        VILLAGER_DESERT_MASON,
        VILLAGER_DESERT_SHEPHERD,
        VILLAGER_DESERT_TOOLSMITH,
        VILLAGER_DESERT_WEAPONSMITH,
        VILLAGER_DESERT_NITWIT,
        VILLAGER_JUNGLE,
        VILLAGER_JUNGLE_ARMORER,
        VILLAGER_JUNGLE_BUTCHER,
        VILLAGER_JUNGLE_CARTOGRAPHER,
        VILLAGER_JUNGLE_CLERIC,
        VILLAGER_JUNGLE_FARMER,
        VILLAGER_JUNGLE_FISHERMAN,
        VILLAGER_JUNGLE_FLETCHER,
        VILLAGER_JUNGLE_LEATHERWORKER,
        VILLAGER_JUNGLE_LIBRARIAN,
        VILLAGER_JUNGLE_MASON,
        VILLAGER_JUNGLE_SHEPHERD,
        VILLAGER_JUNGLE_TOOLSMITH,
        VILLAGER_JUNGLE_WEAPONSMITH,
        VILLAGER_JUNGLE_NITWIT,
        VILLAGER_PLAINS,
        VILLAGER_PLAINS_ARMORER,
        VILLAGER_PLAINS_BUTCHER,
        VILLAGER_PLAINS_CARTOGRAPHER,
        VILLAGER_PLAINS_CLERIC,
        VILLAGER_PLAINS_FARMER,
        VILLAGER_PLAINS_FISHERMAN,
        VILLAGER_PLAINS_FLETCHER,
        VILLAGER_PLAINS_LEATHERWORKER,
        VILLAGER_PLAINS_LIBRARIAN,
        VILLAGER_PLAINS_MASON,
        VILLAGER_PLAINS_SHEPHERD,
        VILLAGER_PLAINS_TOOLSMITH,
        VILLAGER_PLAINS_WEAPONSMITH,
        VILLAGER_PLAINS_NITWIT,
        VILLAGER_SAVANNA,
        VILLAGER_SAVANNA_ARMORER,
        VILLAGER_SAVANNA_BUTCHER,
        VILLAGER_SAVANNA_CARTOGRAPHER,
        VILLAGER_SAVANNA_CLERIC,
        VILLAGER_SAVANNA_FARMER,
        VILLAGER_SAVANNA_FISHERMAN,
        VILLAGER_SAVANNA_FLETCHER,
        VILLAGER_SAVANNA_LEATHERWORKER,
        VILLAGER_SAVANNA_LIBRARIAN,
        VILLAGER_SAVANNA_MASON,
        VILLAGER_SAVANNA_SHEPHERD,
        VILLAGER_SAVANNA_TOOLSMITH,
        VILLAGER_SAVANNA_WEAPONSMITH,
        VILLAGER_SAVANNA_NITWIT,
        VILLAGER_SNOW,
        VILLAGER_SNOW_ARMORER,
        VILLAGER_SNOW_BUTCHER,
        VILLAGER_SNOW_CARTOGRAPHER,
        VILLAGER_SNOW_CLERIC,
        VILLAGER_SNOW_FARMER,
        VILLAGER_SNOW_FISHERMAN,
        VILLAGER_SNOW_FLETCHER,
        VILLAGER_SNOW_LEATHERWORKER,
        VILLAGER_SNOW_LIBRARIAN,
        VILLAGER_SNOW_MASON,
        VILLAGER_SNOW_SHEPHERD,
        VILLAGER_SNOW_TOOLSMITH,
        VILLAGER_SNOW_WEAPONSMITH,
        VILLAGER_SNOW_NITWIT,
        VILLAGER_SWAMP,
        VILLAGER_SWAMP_ARMORER,
        VILLAGER_SWAMP_BUTCHER,
        VILLAGER_SWAMP_CARTOGRAPHER,
        VILLAGER_SWAMP_CLERIC,
        VILLAGER_SWAMP_FARMER,
        VILLAGER_SWAMP_FISHERMAN,
        VILLAGER_SWAMP_FLETCHER,
        VILLAGER_SWAMP_LEATHERWORKER,
        VILLAGER_SWAMP_LIBRARIAN,
        VILLAGER_SWAMP_MASON,
        VILLAGER_SWAMP_SHEPHERD,
        VILLAGER_SWAMP_TOOLSMITH,
        VILLAGER_SWAMP_WEAPONSMITH,
        VILLAGER_SWAMP_NITWIT,
        VILLAGER_TAIGA,
        VILLAGER_TAIGA_ARMORER,
        VILLAGER_TAIGA_BUTCHER,
        VILLAGER_TAIGA_CARTOGRAPHER,
        VILLAGER_TAIGA_CLERIC,
        VILLAGER_TAIGA_FARMER,
        VILLAGER_TAIGA_FISHERMAN,
        VILLAGER_TAIGA_FLETCHER,
        VILLAGER_TAIGA_LEATHERWORKER,
        VILLAGER_TAIGA_LIBRARIAN,
        VILLAGER_TAIGA_MASON,
        VILLAGER_TAIGA_SHEPHERD,
        VILLAGER_TAIGA_TOOLSMITH,
        VILLAGER_TAIGA_WEAPONSMITH,
        VILLAGER_TAIGA_NITWIT,
        VINDICATOR,
        WANDERING_TRADER,
        WARDEN,
        WITCH,
        WITHER,
        WITHER_INVULNERABLE,
        WITHER_SHIELD,
        WITHER_INVULNERABLE_SHIELD,
        WOLF,
        WOLF_TAME,
        WOLF_ANGRY,
        ZOGLIN,
        ZOMBIE_VILLAGER_DESERT,
        ZOMBIE_VILLAGER_DESERT_ARMORER,
        ZOMBIE_VILLAGER_DESERT_BUTCHER,
        ZOMBIE_VILLAGER_DESERT_CARTOGRAPHER,
        ZOMBIE_VILLAGER_DESERT_CLERIC,
        ZOMBIE_VILLAGER_DESERT_FARMER,
        ZOMBIE_VILLAGER_DESERT_FISHERMAN,
        ZOMBIE_VILLAGER_DESERT_FLETCHER,
        ZOMBIE_VILLAGER_DESERT_LEATHERWORKER,
        ZOMBIE_VILLAGER_DESERT_LIBRARIAN,
        ZOMBIE_VILLAGER_DESERT_MASON,
        ZOMBIE_VILLAGER_DESERT_SHEPHERD,
        ZOMBIE_VILLAGER_DESERT_TOOLSMITH,
        ZOMBIE_VILLAGER_DESERT_WEAPONSMITH,
        ZOMBIE_VILLAGER_DESERT_NITWIT,
        ZOMBIE_VILLAGER_JUNGLE,
        ZOMBIE_VILLAGER_JUNGLE_ARMORER,
        ZOMBIE_VILLAGER_JUNGLE_BUTCHER,
        ZOMBIE_VILLAGER_JUNGLE_CARTOGRAPHER,
        ZOMBIE_VILLAGER_JUNGLE_CLERIC,
        ZOMBIE_VILLAGER_JUNGLE_FARMER,
        ZOMBIE_VILLAGER_JUNGLE_FISHERMAN,
        ZOMBIE_VILLAGER_JUNGLE_FLETCHER,
        ZOMBIE_VILLAGER_JUNGLE_LEATHERWORKER,
        ZOMBIE_VILLAGER_JUNGLE_LIBRARIAN,
        ZOMBIE_VILLAGER_JUNGLE_MASON,
        ZOMBIE_VILLAGER_JUNGLE_SHEPHERD,
        ZOMBIE_VILLAGER_JUNGLE_TOOLSMITH,
        ZOMBIE_VILLAGER_JUNGLE_WEAPONSMITH,
        ZOMBIE_VILLAGER_JUNGLE_NITWIT,
        ZOMBIE_VILLAGER_PLAINS,
        ZOMBIE_VILLAGER_PLAINS_ARMORER,
        ZOMBIE_VILLAGER_PLAINS_BUTCHER,
        ZOMBIE_VILLAGER_PLAINS_CARTOGRAPHER,
        ZOMBIE_VILLAGER_PLAINS_CLERIC,
        ZOMBIE_VILLAGER_PLAINS_FARMER,
        ZOMBIE_VILLAGER_PLAINS_FISHERMAN,
        ZOMBIE_VILLAGER_PLAINS_FLETCHER,
        ZOMBIE_VILLAGER_PLAINS_LEATHERWORKER,
        ZOMBIE_VILLAGER_PLAINS_LIBRARIAN,
        ZOMBIE_VILLAGER_PLAINS_MASON,
        ZOMBIE_VILLAGER_PLAINS_SHEPHERD,
        ZOMBIE_VILLAGER_PLAINS_TOOLSMITH,
        ZOMBIE_VILLAGER_PLAINS_WEAPONSMITH,
        ZOMBIE_VILLAGER_PLAINS_NITWIT,
        ZOMBIE_VILLAGER_SAVANNA,
        ZOMBIE_VILLAGER_SAVANNA_ARMORER,
        ZOMBIE_VILLAGER_SAVANNA_BUTCHER,
        ZOMBIE_VILLAGER_SAVANNA_CARTOGRAPHER,
        ZOMBIE_VILLAGER_SAVANNA_CLERIC,
        ZOMBIE_VILLAGER_SAVANNA_FARMER,
        ZOMBIE_VILLAGER_SAVANNA_FISHERMAN,
        ZOMBIE_VILLAGER_SAVANNA_FLETCHER,
        ZOMBIE_VILLAGER_SAVANNA_LEATHERWORKER,
        ZOMBIE_VILLAGER_SAVANNA_LIBRARIAN,
        ZOMBIE_VILLAGER_SAVANNA_MASON,
        ZOMBIE_VILLAGER_SAVANNA_SHEPHERD,
        ZOMBIE_VILLAGER_SAVANNA_TOOLSMITH,
        ZOMBIE_VILLAGER_SAVANNA_WEAPONSMITH,
        ZOMBIE_VILLAGER_SAVANNA_NITWIT,
        ZOMBIE_VILLAGER_SNOW,
        ZOMBIE_VILLAGER_SNOW_ARMORER,
        ZOMBIE_VILLAGER_SNOW_BUTCHER,
        ZOMBIE_VILLAGER_SNOW_CARTOGRAPHER,
        ZOMBIE_VILLAGER_SNOW_CLERIC,
        ZOMBIE_VILLAGER_SNOW_FARMER,
        ZOMBIE_VILLAGER_SNOW_FISHERMAN,
        ZOMBIE_VILLAGER_SNOW_FLETCHER,
        ZOMBIE_VILLAGER_SNOW_LEATHERWORKER,
        ZOMBIE_VILLAGER_SNOW_LIBRARIAN,
        ZOMBIE_VILLAGER_SNOW_MASON,
        ZOMBIE_VILLAGER_SNOW_SHEPHERD,
        ZOMBIE_VILLAGER_SNOW_TOOLSMITH,
        ZOMBIE_VILLAGER_SNOW_WEAPONSMITH,
        ZOMBIE_VILLAGER_SNOW_NITWIT,
        ZOMBIE_VILLAGER_SWAMP,
        ZOMBIE_VILLAGER_SWAMP_ARMORER,
        ZOMBIE_VILLAGER_SWAMP_BUTCHER,
        ZOMBIE_VILLAGER_SWAMP_CARTOGRAPHER,
        ZOMBIE_VILLAGER_SWAMP_CLERIC,
        ZOMBIE_VILLAGER_SWAMP_FARMER,
        ZOMBIE_VILLAGER_SWAMP_FISHERMAN,
        ZOMBIE_VILLAGER_SWAMP_FLETCHER,
        ZOMBIE_VILLAGER_SWAMP_LEATHERWORKER,
        ZOMBIE_VILLAGER_SWAMP_LIBRARIAN,
        ZOMBIE_VILLAGER_SWAMP_MASON,
        ZOMBIE_VILLAGER_SWAMP_SHEPHERD,
        ZOMBIE_VILLAGER_SWAMP_TOOLSMITH,
        ZOMBIE_VILLAGER_SWAMP_WEAPONSMITH,
        ZOMBIE_VILLAGER_SWAMP_NITWIT,
        ZOMBIE_VILLAGER_TAIGA,
        ZOMBIE_VILLAGER_TAIGA_ARMORER,
        ZOMBIE_VILLAGER_TAIGA_BUTCHER,
        ZOMBIE_VILLAGER_TAIGA_CARTOGRAPHER,
        ZOMBIE_VILLAGER_TAIGA_CLERIC,
        ZOMBIE_VILLAGER_TAIGA_FARMER,
        ZOMBIE_VILLAGER_TAIGA_FISHERMAN,
        ZOMBIE_VILLAGER_TAIGA_FLETCHER,
        ZOMBIE_VILLAGER_TAIGA_LEATHERWORKER,
        ZOMBIE_VILLAGER_TAIGA_LIBRARIAN,
        ZOMBIE_VILLAGER_TAIGA_MASON,
        ZOMBIE_VILLAGER_TAIGA_SHEPHERD,
        ZOMBIE_VILLAGER_TAIGA_TOOLSMITH,
        ZOMBIE_VILLAGER_TAIGA_WEAPONSMITH,
        ZOMBIE_VILLAGER_TAIGA_NITWIT,
        ZOMBIFIED_PIGLIN
    }
}
