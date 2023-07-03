package net.risttahukas.moremobheads.item;

import net.minecraft.core.Direction;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.ModBlocks;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMobHeadsMod.MOD_ID);

    public static final RegistryObject<Item> ALLAY_HEAD = ITEMS.register("allay_head", () ->
            new EffectSkullItem(ModBlocks.ALLAY_HEAD.get(), ModBlocks.ALLAY_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_LUCY = ITEMS.register("axolotl_head_lucy", () ->
            new EffectSkullItem(ModBlocks.AXOLOTL_HEAD_LUCY.get(), ModBlocks.AXOLOTL_WALL_HEAD_LUCY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_WILD = ITEMS.register("axolotl_head_wild", () ->
            new EffectSkullItem(ModBlocks.AXOLOTL_HEAD_WILD.get(), ModBlocks.AXOLOTL_WALL_HEAD_WILD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_GOLD = ITEMS.register("axolotl_head_gold", () ->
            new EffectSkullItem(ModBlocks.AXOLOTL_HEAD_GOLD.get(), ModBlocks.AXOLOTL_WALL_HEAD_GOLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_CYAN = ITEMS.register("axolotl_head_cyan", () ->
            new EffectSkullItem(ModBlocks.AXOLOTL_HEAD_CYAN.get(), ModBlocks.AXOLOTL_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_BLUE = ITEMS.register("axolotl_head_blue", () ->
            new EffectSkullItem(ModBlocks.AXOLOTL_HEAD_BLUE.get(), ModBlocks.AXOLOTL_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> BAT_HEAD = ITEMS.register("bat_head", () ->
            new EffectSkullItem(ModBlocks.BAT_HEAD.get(), ModBlocks.BAT_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BLAZE_HEAD = ITEMS.register("blaze_head", () ->
            new EffectSkullItem(ModBlocks.BLAZE_HEAD.get(), ModBlocks.BLAZE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAMEL_HEAD = ITEMS.register("camel_head", () ->
            new EffectSkullItem(ModBlocks.CAMEL_HEAD.get(), ModBlocks.CAMEL_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_TABBY = ITEMS.register("cat_head_tabby", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_TABBY.get(), ModBlocks.CAT_WALL_HEAD_TABBY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_BLACK = ITEMS.register("cat_head_black", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_BLACK.get(), ModBlocks.CAT_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_RED = ITEMS.register("cat_head_red", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_RED.get(), ModBlocks.CAT_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_SIAMESE = ITEMS.register("cat_head_siamese", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_SIAMESE.get(), ModBlocks.CAT_WALL_HEAD_SIAMESE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_BRITISH_SHORTHAIR = ITEMS.register("cat_head_british_shorthair", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_BRITISH_SHORTHAIR.get(), ModBlocks.CAT_WALL_HEAD_BRITISH_SHORTHAIR.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_CALICO = ITEMS.register("cat_head_calico", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_CALICO.get(), ModBlocks.CAT_WALL_HEAD_CALICO.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_PERSIAN = ITEMS.register("cat_head_persian", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_PERSIAN.get(), ModBlocks.CAT_WALL_HEAD_PERSIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_RAGDOLL = ITEMS.register("cat_head_ragdoll", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_RAGDOLL.get(), ModBlocks.CAT_WALL_HEAD_RAGDOLL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_WHITE = ITEMS.register("cat_head_white", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_WHITE.get(), ModBlocks.CAT_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_JELLIE = ITEMS.register("cat_head_jellie", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_JELLIE.get(), ModBlocks.CAT_WALL_HEAD_JELLIE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_ALL_BLACK = ITEMS.register("cat_head_all_black", () ->
            new EffectSkullItem(ModBlocks.CAT_HEAD_ALL_BLACK.get(), ModBlocks.CAT_WALL_HEAD_ALL_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAVE_SPIDER_HEAD = ITEMS.register("cave_spider_head", () ->
            new EffectSkullItem(ModBlocks.CAVE_SPIDER_HEAD.get(), ModBlocks.CAVE_SPIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CHICKEN_HEAD = ITEMS.register("chicken_head", () ->
            new EffectSkullItem(ModBlocks.CHICKEN_HEAD.get(), ModBlocks.CHICKEN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> COD_HEAD = ITEMS.register("cod_head", () ->
            new EffectSkullItem(ModBlocks.COD_HEAD.get(), ModBlocks.COD_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> COW_HEAD = ITEMS.register("cow_head", () ->
            new EffectSkullItem(ModBlocks.COW_HEAD.get(), ModBlocks.COW_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CREEPER_HEAD_CHARGED = ITEMS.register("creeper_head_charged", () ->
            new EffectSkullItem(ModBlocks.CREEPER_HEAD_CHARGED.get(), ModBlocks.CREEPER_WALL_HEAD_CHARGED.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> DOLPHIN_HEAD = ITEMS.register("dolphin_head", () ->
            new EffectSkullItem(ModBlocks.DOLPHIN_HEAD.get(), ModBlocks.DOLPHIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> DONKEY_HEAD = ITEMS.register("donkey_head", () ->
            new EffectSkullItem(ModBlocks.DONKEY_HEAD.get(), ModBlocks.DONKEY_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> DROWNED_HEAD = ITEMS.register("drowned_head", () ->
            new EffectSkullItem(ModBlocks.DROWNED_HEAD.get(), ModBlocks.DROWNED_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ENDERMAN_HEAD = ITEMS.register("enderman_head", () ->
            new EffectSkullItem(ModBlocks.ENDERMAN_HEAD.get(), ModBlocks.ENDERMAN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> EVOKER_HEAD = ITEMS.register("evoker_head", () ->
            new EffectSkullItem(ModBlocks.EVOKER_HEAD.get(), ModBlocks.EVOKER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FOX_HEAD_RED = ITEMS.register("fox_head_red", () ->
            new EffectSkullItem(ModBlocks.FOX_HEAD_RED.get(), ModBlocks.FOX_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FOX_HEAD_SNOW = ITEMS.register("fox_head_snow", () ->
            new EffectSkullItem(ModBlocks.FOX_HEAD_SNOW.get(), ModBlocks.FOX_WALL_HEAD_SNOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GHAST_HEAD = ITEMS.register("ghast_head", () ->
            new EffectSkullItem(ModBlocks.GHAST_HEAD.get(), ModBlocks.GHAST_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GLOW_SQUID_HEAD = ITEMS.register("glow_squid_head", () ->
            new EffectSkullItem(ModBlocks.GLOW_SQUID_HEAD.get(), ModBlocks.GLOW_SQUID_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE = ITEMS.register("horse_head_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY = ITEMS.register("horse_head_creamy", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CREAMY.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT = ITEMS.register("horse_head_chestnut", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CHESTNUT.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN = ITEMS.register("horse_head_brown", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK = ITEMS.register("horse_head_black", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BLACK.get(), ModBlocks.HORSE_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY = ITEMS.register("horse_head_gray", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_GRAY.get(), ModBlocks.HORSE_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN = ITEMS.register("horse_head_dark_brown", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_DARK_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE = ITEMS.register("horse_head_white_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_WHITE_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE = ITEMS.register("horse_head_creamy_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE = ITEMS.register("horse_head_chestnut_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE = ITEMS.register("horse_head_brown_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE = ITEMS.register("horse_head_black_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BLACK_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE = ITEMS.register("horse_head_gray_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_GRAY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE = ITEMS.register("horse_head_dark_brown_white", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE_FIELD = ITEMS.register("horse_head_white_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_WHITE_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE_FIELD = ITEMS.register("horse_head_creamy_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE_FIELD = ITEMS.register("horse_head_chestnut_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE_FIELD = ITEMS.register("horse_head_brown_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE_FIELD = ITEMS.register("horse_head_black_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BLACK_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE_FIELD = ITEMS.register("horse_head_gray_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_GRAY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE_FIELD = ITEMS.register("horse_head_dark_brown_white_field", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE_DOTS = ITEMS.register("horse_head_white_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_WHITE_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE_DOTS = ITEMS.register("horse_head_creamy_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE_DOTS = ITEMS.register("horse_head_chestnut_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE_DOTS = ITEMS.register("horse_head_brown_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE_DOTS = ITEMS.register("horse_head_black_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BLACK_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE_DOTS = ITEMS.register("horse_head_gray_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_GRAY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE_DOTS = ITEMS.register("horse_head_dark_brown_white_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_BLACK_DOTS = ITEMS.register("horse_head_white_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_WHITE_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_BLACK_DOTS = ITEMS.register("horse_head_creamy_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CREAMY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_BLACK_DOTS = ITEMS.register("horse_head_chestnut_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_CHESTNUT_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_BLACK_DOTS = ITEMS.register("horse_head_brown_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_BLACK_DOTS = ITEMS.register("horse_head_black_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_BLACK_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_BLACK_DOTS = ITEMS.register("horse_head_gray_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_GRAY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_BLACK_DOTS = ITEMS.register("horse_head_dark_brown_black_dots", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_DARK_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_ZOMBIE = ITEMS.register("horse_head_zombie", () ->
            new EffectSkullItem(ModBlocks.HORSE_HEAD_ZOMBIE.get(), ModBlocks.HORSE_WALL_HEAD_ZOMBIE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_SKULL_SKELETON = ITEMS.register("horse_skull_skeleton", () ->
            new EffectSkullItem(ModBlocks.HORSE_SKULL_SKELETON.get(), ModBlocks.HORSE_WALL_SKULL_SKELETON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HUSK_HEAD = ITEMS.register("husk_head", () ->
            new EffectSkullItem(ModBlocks.HUSK_HEAD.get(), ModBlocks.HUSK_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ILLUSIONER_HEAD = ITEMS.register("illusioner_head", () ->
            new EffectSkullItem(ModBlocks.ILLUSIONER_HEAD.get(), ModBlocks.ILLUSIONER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> IRON_GOLEM_HEAD = ITEMS.register("iron_golem_head", () ->
            new EffectSkullItem(ModBlocks.IRON_GOLEM_HEAD.get(), ModBlocks.IRON_GOLEM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY = ITEMS.register("llama_head_creamy", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE = ITEMS.register("llama_head_white", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN = ITEMS.register("llama_head_brown", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY = ITEMS.register("llama_head_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_WHITE = ITEMS.register("llama_head_creamy_white", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_WHITE = ITEMS.register("llama_head_white_white", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_WHITE = ITEMS.register("llama_head_brown_white", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_WHITE = ITEMS.register("llama_head_gray_white", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_ORANGE = ITEMS.register("llama_head_creamy_orange", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_ORANGE = ITEMS.register("llama_head_white_orange", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_ORANGE = ITEMS.register("llama_head_brown_orange", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_ORANGE = ITEMS.register("llama_head_gray_orange", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_MAGENTA = ITEMS.register("llama_head_creamy_magenta", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_MAGENTA = ITEMS.register("llama_head_white_magenta", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_MAGENTA = ITEMS.register("llama_head_brown_magenta", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_MAGENTA = ITEMS.register("llama_head_gray_magenta", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIGHT_BLUE = ITEMS.register("llama_head_creamy_light_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIGHT_BLUE = ITEMS.register("llama_head_white_light_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIGHT_BLUE = ITEMS.register("llama_head_brown_light_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIGHT_BLUE = ITEMS.register("llama_head_gray_light_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_YELLOW = ITEMS.register("llama_head_creamy_yellow", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_YELLOW = ITEMS.register("llama_head_white_yellow", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_YELLOW = ITEMS.register("llama_head_brown_yellow", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_YELLOW = ITEMS.register("llama_head_gray_yellow", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIME = ITEMS.register("llama_head_creamy_lime", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIME = ITEMS.register("llama_head_white_lime", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIME = ITEMS.register("llama_head_brown_lime", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIME = ITEMS.register("llama_head_gray_lime", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_PINK = ITEMS.register("llama_head_creamy_pink", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_PINK = ITEMS.register("llama_head_white_pink", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_PINK = ITEMS.register("llama_head_brown_pink", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_PINK = ITEMS.register("llama_head_gray_pink", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_GRAY = ITEMS.register("llama_head_creamy_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_GRAY = ITEMS.register("llama_head_white_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_GRAY = ITEMS.register("llama_head_brown_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_GRAY = ITEMS.register("llama_head_gray_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIGHT_GRAY = ITEMS.register("llama_head_creamy_light_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIGHT_GRAY = ITEMS.register("llama_head_white_light_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIGHT_GRAY = ITEMS.register("llama_head_brown_light_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIGHT_GRAY = ITEMS.register("llama_head_gray_light_gray", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_CYAN = ITEMS.register("llama_head_creamy_cyan", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_CYAN = ITEMS.register("llama_head_white_cyan", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_CYAN = ITEMS.register("llama_head_brown_cyan", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_CYAN = ITEMS.register("llama_head_gray_cyan", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_PURPLE = ITEMS.register("llama_head_creamy_purple", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_PURPLE = ITEMS.register("llama_head_white_purple", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_PURPLE = ITEMS.register("llama_head_brown_purple", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_PURPLE = ITEMS.register("llama_head_gray_purple", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BLUE = ITEMS.register("llama_head_creamy_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BLUE = ITEMS.register("llama_head_white_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BLUE = ITEMS.register("llama_head_brown_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BLUE = ITEMS.register("llama_head_gray_blue", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BROWN = ITEMS.register("llama_head_creamy_brown", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BROWN = ITEMS.register("llama_head_white_brown", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BROWN = ITEMS.register("llama_head_brown_brown", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BROWN = ITEMS.register("llama_head_gray_brown", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_GREEN = ITEMS.register("llama_head_creamy_green", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_GREEN = ITEMS.register("llama_head_white_green", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_GREEN = ITEMS.register("llama_head_brown_green", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_GREEN = ITEMS.register("llama_head_gray_green", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_RED = ITEMS.register("llama_head_creamy_red", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_RED.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_RED = ITEMS.register("llama_head_white_red", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_RED.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_RED = ITEMS.register("llama_head_brown_red", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_RED.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_RED = ITEMS.register("llama_head_gray_red", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_RED.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BLACK = ITEMS.register("llama_head_creamy_black", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_CREAMY_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BLACK = ITEMS.register("llama_head_white_black", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_WHITE_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BLACK = ITEMS.register("llama_head_brown_black", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_BROWN_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BLACK = ITEMS.register("llama_head_gray_black", () ->
            new EffectSkullItem(ModBlocks.LLAMA_HEAD_GRAY_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MAGMA_CUBE_HEAD = ITEMS.register("magma_cube_head", () ->
            new EffectSkullItem(ModBlocks.MAGMA_CUBE_HEAD.get(), ModBlocks.MAGMA_CUBE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_RED = ITEMS.register("mooshroom_head_red", () ->
            new EffectSkullItem(ModBlocks.MOOSHROOM_HEAD_RED.get(), ModBlocks.MOOSHROOM_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_BROWN = ITEMS.register("mooshroom_head_brown", () ->
            new EffectSkullItem(ModBlocks.MOOSHROOM_HEAD_BROWN.get(), ModBlocks.MOOSHROOM_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> MULE_HEAD = ITEMS.register("mule_head", () ->
            new EffectSkullItem(ModBlocks.MULE_HEAD.get(), ModBlocks.MULE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> OCELOT_HEAD = ITEMS.register("ocelot_head", () ->
            new EffectSkullItem(ModBlocks.OCELOT_HEAD.get(), ModBlocks.OCELOT_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD = ITEMS.register("panda_head", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD.get(), ModBlocks.PANDA_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_AGGRESSIVE = ITEMS.register("panda_head_aggressive", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_AGGRESSIVE.get(), ModBlocks.PANDA_WALL_HEAD_AGGRESSIVE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_LAZY = ITEMS.register("panda_head_lazy", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_LAZY.get(), ModBlocks.PANDA_WALL_HEAD_LAZY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_WORRIED = ITEMS.register("panda_head_worried", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_WORRIED.get(), ModBlocks.PANDA_WALL_HEAD_WORRIED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_PLAYFUL = ITEMS.register("panda_head_playful", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_PLAYFUL.get(), ModBlocks.PANDA_WALL_HEAD_PLAYFUL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_WEAK = ITEMS.register("panda_head_weak", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_WEAK.get(), ModBlocks.PANDA_WALL_HEAD_WEAK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_BROWN = ITEMS.register("panda_head_brown", () ->
            new EffectSkullItem(ModBlocks.PANDA_HEAD_BROWN.get(), ModBlocks.PANDA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_RED_BLUE = ITEMS.register("parrot_head_red_blue", () ->
            new EffectSkullItem(ModBlocks.PARROT_HEAD_RED_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_RED_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_BLUE = ITEMS.register("parrot_head_blue", () ->
            new EffectSkullItem(ModBlocks.PARROT_HEAD_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_GREEN = ITEMS.register("parrot_head_green", () ->
            new EffectSkullItem(ModBlocks.PARROT_HEAD_GREEN.get(), ModBlocks.PARROT_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_YELLOW_BLUE = ITEMS.register("parrot_head_yellow_blue", () ->
            new EffectSkullItem(ModBlocks.PARROT_HEAD_YELLOW_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_YELLOW_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_GREY = ITEMS.register("parrot_head_grey", () ->
            new EffectSkullItem(ModBlocks.PARROT_HEAD_GREY.get(), ModBlocks.PARROT_WALL_HEAD_GREY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PHANTOM_HEAD = ITEMS.register("phantom_head", () ->
            new EffectSkullItem(ModBlocks.PHANTOM_HEAD.get(), ModBlocks.PHANTOM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PIG_HEAD = ITEMS.register("pig_head", () ->
            new EffectSkullItem(ModBlocks.PIG_HEAD.get(), ModBlocks.PIG_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PIGLIN_BRUTE_HEAD = ITEMS.register("piglin_brute_head", () ->
            new EffectSkullItem(ModBlocks.PIGLIN_BRUTE_HEAD.get(), ModBlocks.PIGLIN_BRUTE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PILLAGER_HEAD = ITEMS.register("pillager_head", () ->
            new EffectSkullItem(ModBlocks.PILLAGER_HEAD.get(), ModBlocks.PILLAGER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> POLAR_BEAR_HEAD = ITEMS.register("polar_bear_head", () ->
            new EffectSkullItem(ModBlocks.POLAR_BEAR_HEAD.get(), ModBlocks.POLAR_BEAR_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PUFFERFISH_HEAD = ITEMS.register("pufferfish_head", () ->
            new EffectSkullItem(ModBlocks.PUFFERFISH_HEAD.get(), ModBlocks.PUFFERFISH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_BROWN = ITEMS.register("rabbit_head_brown", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_BROWN.get(), ModBlocks.RABBIT_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_WHITE = ITEMS.register("rabbit_head_white", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_WHITE.get(), ModBlocks.RABBIT_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_BLACK = ITEMS.register("rabbit_head_black", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_BLACK.get(), ModBlocks.RABBIT_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_WHITE_SPLOTCHED = ITEMS.register("rabbit_head_white_splotched", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_WHITE_SPLOTCHED.get(), ModBlocks.RABBIT_WALL_HEAD_WHITE_SPLOTCHED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_GOLD = ITEMS.register("rabbit_head_gold", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_GOLD.get(), ModBlocks.RABBIT_WALL_HEAD_GOLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_SALT = ITEMS.register("rabbit_head_salt", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_SALT.get(), ModBlocks.RABBIT_WALL_HEAD_SALT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_CAERBANNOG = ITEMS.register("rabbit_head_caerbannog", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_CAERBANNOG.get(), ModBlocks.RABBIT_WALL_HEAD_CAERBANNOG.get(),
                    (new Item.Properties()).rarity(Rarity.EPIC), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_TOAST = ITEMS.register("rabbit_head_toast", () ->
            new EffectSkullItem(ModBlocks.RABBIT_HEAD_TOAST.get(), ModBlocks.RABBIT_WALL_HEAD_TOAST.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RAVAGER_HEAD = ITEMS.register("ravager_head", () ->
            new EffectSkullItem(ModBlocks.RAVAGER_HEAD.get(), ModBlocks.RAVAGER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> SALMON_HEAD = ITEMS.register("salmon_head", () ->
            new EffectSkullItem(ModBlocks.SALMON_HEAD.get(), ModBlocks.SALMON_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_WHITE = ITEMS.register("sheep_head_white", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_WHITE.get(), ModBlocks.SHEEP_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_ORANGE = ITEMS.register("sheep_head_orange", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_ORANGE.get(), ModBlocks.SHEEP_WALL_HEAD_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_MAGENTA = ITEMS.register("sheep_head_magenta", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_MAGENTA.get(), ModBlocks.SHEEP_WALL_HEAD_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIGHT_BLUE = ITEMS.register("sheep_head_light_blue", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_LIGHT_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_YELLOW = ITEMS.register("sheep_head_yellow", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_YELLOW.get(), ModBlocks.SHEEP_WALL_HEAD_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIME = ITEMS.register("sheep_head_lime", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_LIME.get(), ModBlocks.SHEEP_WALL_HEAD_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_PINK = ITEMS.register("sheep_head_pink", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_PINK.get(), ModBlocks.SHEEP_WALL_HEAD_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_GRAY = ITEMS.register("sheep_head_gray", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIGHT_GRAY = ITEMS.register("sheep_head_light_gray", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_LIGHT_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_CYAN = ITEMS.register("sheep_head_cyan", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_CYAN.get(), ModBlocks.SHEEP_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_PURPLE = ITEMS.register("sheep_head_purple", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_PURPLE.get(), ModBlocks.SHEEP_WALL_HEAD_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BLUE = ITEMS.register("sheep_head_blue", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BROWN = ITEMS.register("sheep_head_brown", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_BROWN.get(), ModBlocks.SHEEP_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_GREEN = ITEMS.register("sheep_head_green", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_GREEN.get(), ModBlocks.SHEEP_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_RED = ITEMS.register("sheep_head_red", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_RED.get(), ModBlocks.SHEEP_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BLACK = ITEMS.register("sheep_head_black", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_BLACK.get(), ModBlocks.SHEEP_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_RAINBOW = ITEMS.register("sheep_head_rainbow", () ->
            new EffectSkullItem(ModBlocks.SHEEP_HEAD_RAINBOW.get(), ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD = ITEMS.register("shulker_head", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD.get(), ModBlocks.SHULKER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_WHITE = ITEMS.register("shulker_head_white", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_WHITE.get(), ModBlocks.SHULKER_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_ORANGE = ITEMS.register("shulker_head_orange", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_ORANGE.get(), ModBlocks.SHULKER_WALL_HEAD_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_MAGENTA = ITEMS.register("shulker_head_magenta", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_MAGENTA.get(), ModBlocks.SHULKER_WALL_HEAD_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIGHT_BLUE = ITEMS.register("shulker_head_light_blue", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_LIGHT_BLUE.get(), ModBlocks.SHULKER_WALL_HEAD_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_YELLOW = ITEMS.register("shulker_head_yellow", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_YELLOW.get(), ModBlocks.SHULKER_WALL_HEAD_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIME = ITEMS.register("shulker_head_lime", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_LIME.get(), ModBlocks.SHULKER_WALL_HEAD_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_PINK = ITEMS.register("shulker_head_pink", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_PINK.get(), ModBlocks.SHULKER_WALL_HEAD_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_GRAY = ITEMS.register("shulker_head_gray", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_GRAY.get(), ModBlocks.SHULKER_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIGHT_GRAY = ITEMS.register("shulker_head_light_gray", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_LIGHT_GRAY.get(), ModBlocks.SHULKER_WALL_HEAD_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_CYAN = ITEMS.register("shulker_head_cyan", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_CYAN.get(), ModBlocks.SHULKER_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_PURPLE = ITEMS.register("shulker_head_purple", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_PURPLE.get(), ModBlocks.SHULKER_WALL_HEAD_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BLUE = ITEMS.register("shulker_head_blue", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_BLUE.get(), ModBlocks.SHULKER_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BROWN = ITEMS.register("shulker_head_brown", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_BROWN.get(), ModBlocks.SHULKER_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_GREEN = ITEMS.register("shulker_head_green", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_GREEN.get(), ModBlocks.SHULKER_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_RED = ITEMS.register("shulker_head_red", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_RED.get(), ModBlocks.SHULKER_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BLACK = ITEMS.register("shulker_head_black", () ->
            new EffectSkullItem(ModBlocks.SHULKER_HEAD_BLACK.get(), ModBlocks.SHULKER_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SLIME_HEAD = ITEMS.register("slime_head", () ->
            new EffectSkullItem(ModBlocks.SLIME_HEAD.get(), ModBlocks.SLIME_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SNIFFER_HEAD = ITEMS.register("sniffer_head", () ->
            new EffectSkullItem(ModBlocks.SNIFFER_HEAD.get(), ModBlocks.SNIFFER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SNOW_GOLEM_HEAD = ITEMS.register("snow_golem_head", () ->
            new EffectSkullItem(ModBlocks.SNOW_GOLEM_HEAD.get(), ModBlocks.SNOW_GOLEM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SPIDER_HEAD = ITEMS.register("spider_head", () ->
            new EffectSkullItem(ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SQUID_HEAD = ITEMS.register("squid_head", () ->
            new EffectSkullItem(ModBlocks.SQUID_HEAD.get(), ModBlocks.SQUID_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRAY_SKULL = ITEMS.register("stray_skull", () ->
            new EffectSkullItem(ModBlocks.STRAY_SKULL.get(), ModBlocks.STRAY_WALL_SKULL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRIDER_HEAD = ITEMS.register("strider_head", () ->
            new EffectSkullItem(ModBlocks.STRIDER_HEAD.get(), ModBlocks.STRIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRIDER_HEAD_COLD = ITEMS.register("strider_head_cold", () ->
            new EffectSkullItem(ModBlocks.STRIDER_HEAD_COLD.get(), ModBlocks.STRIDER_WALL_HEAD_COLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_CREAMY = ITEMS.register("trader_llama_head_creamy", () ->
            new EffectSkullItem(ModBlocks.TRADER_LLAMA_HEAD_CREAMY.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_WHITE = ITEMS.register("trader_llama_head_white", () ->
            new EffectSkullItem(ModBlocks.TRADER_LLAMA_HEAD_WHITE.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_BROWN = ITEMS.register("trader_llama_head_brown", () ->
            new EffectSkullItem(ModBlocks.TRADER_LLAMA_HEAD_BROWN.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_GRAY = ITEMS.register("trader_llama_head_gray", () ->
            new EffectSkullItem(ModBlocks.TRADER_LLAMA_HEAD_GRAY.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TROPICAL_FISH_HEAD = ITEMS.register("tropical_fish_head", () ->
            new EffectSkullItem(ModBlocks.TROPICAL_FISH_HEAD.get(), ModBlocks.TROPICAL_FISH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TURTLE_HEAD = ITEMS.register("turtle_head", () ->
            new EffectSkullItem(ModBlocks.TURTLE_HEAD.get(), ModBlocks.TURTLE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VEX_HEAD = ITEMS.register("vex_head", () ->
            new EffectSkullItem(ModBlocks.VEX_HEAD.get(), ModBlocks.VEX_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VINDICATOR_HEAD = ITEMS.register("vindicator_head", () ->
            new EffectSkullItem(ModBlocks.VINDICATOR_HEAD.get(), ModBlocks.VINDICATOR_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WANDERING_TRADER_HEAD = ITEMS.register("wandering_trader_head", () ->
            new EffectSkullItem(ModBlocks.WANDERING_TRADER_HEAD.get(), ModBlocks.WANDERING_TRADER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WARDEN_HEAD = ITEMS.register("warden_head", () ->
            new EffectSkullItem(ModBlocks.WARDEN_HEAD.get(), ModBlocks.WARDEN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.EPIC), Direction.DOWN));

    public static final RegistryObject<Item> WITCH_HEAD = ITEMS.register("witch_head", () ->
            new EffectSkullItem(ModBlocks.WITCH_HEAD.get(), ModBlocks.WITCH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WOLF_HEAD = ITEMS.register("wolf_head", () ->
            new EffectSkullItem(ModBlocks.WOLF_HEAD.get(), ModBlocks.WOLF_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WOLF_HEAD_TAME = ITEMS.register("wolf_head_tame", () ->
            new EffectSkullItem(ModBlocks.WOLF_HEAD_TAME.get(), ModBlocks.WOLF_WALL_HEAD_TAME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIFIED_PIGLIN_HEAD = ITEMS.register("zombified_piglin_head", () ->
            new EffectSkullItem(ModBlocks.ZOMBIFIED_PIGLIN_HEAD.get(), ModBlocks.ZOMBIFIED_PIGLIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
