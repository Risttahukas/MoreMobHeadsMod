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
import net.risttahukas.moremobheads.item.heads.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreMobHeadsMod.MOD_ID);

    public static final RegistryObject<Item> ALLAY_HEAD = ITEMS.register("allay_head", () ->
            new AllayHeadItem(ModBlocks.ALLAY_HEAD.get(), ModBlocks.ALLAY_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_LUCY = ITEMS.register("axolotl_head_lucy", () ->
            new AxolotlHeadItem(ModBlocks.AXOLOTL_HEAD_LUCY.get(), ModBlocks.AXOLOTL_WALL_HEAD_LUCY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_WILD = ITEMS.register("axolotl_head_wild", () ->
            new AxolotlHeadItem(ModBlocks.AXOLOTL_HEAD_WILD.get(), ModBlocks.AXOLOTL_WALL_HEAD_WILD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_GOLD = ITEMS.register("axolotl_head_gold", () ->
            new AxolotlHeadItem(ModBlocks.AXOLOTL_HEAD_GOLD.get(), ModBlocks.AXOLOTL_WALL_HEAD_GOLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_CYAN = ITEMS.register("axolotl_head_cyan", () ->
            new AxolotlHeadItem(ModBlocks.AXOLOTL_HEAD_CYAN.get(), ModBlocks.AXOLOTL_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> AXOLOTL_HEAD_BLUE = ITEMS.register("axolotl_head_blue", () ->
            new AxolotlHeadItem(ModBlocks.AXOLOTL_HEAD_BLUE.get(), ModBlocks.AXOLOTL_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> BAT_HEAD = ITEMS.register("bat_head", () ->
            new BatHeadItem(ModBlocks.BAT_HEAD.get(), ModBlocks.BAT_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BEE_HEAD = ITEMS.register("bee_head", () ->
            new BeeHeadItem(ModBlocks.BEE_HEAD.get(), ModBlocks.BEE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BEE_HEAD_ANGRY = ITEMS.register("bee_head_angry", () ->
            new BeeAngryHeadItem(ModBlocks.BEE_HEAD_ANGRY.get(), ModBlocks.BEE_WALL_HEAD_ANGRY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BEE_HEAD_POLLEN = ITEMS.register("bee_head_pollen", () ->
            new BeePollenHeadItem(ModBlocks.BEE_HEAD_POLLEN.get(), ModBlocks.BEE_WALL_HEAD_POLLEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BEE_HEAD_ANGRY_POLLEN = ITEMS.register("bee_head_angry_pollen", () ->
            new BeeAngryHeadItem(ModBlocks.BEE_HEAD_ANGRY_POLLEN.get(), ModBlocks.BEE_WALL_HEAD_ANGRY_POLLEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> BLAZE_HEAD = ITEMS.register("blaze_head", () ->
            new BlazeHeadItem(ModBlocks.BLAZE_HEAD.get(), ModBlocks.BLAZE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAMEL_HEAD = ITEMS.register("camel_head", () ->
            new CamelHeadItem(ModBlocks.CAMEL_HEAD.get(), ModBlocks.CAMEL_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_TABBY = ITEMS.register("cat_head_tabby", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_TABBY.get(), ModBlocks.CAT_WALL_HEAD_TABBY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_BLACK = ITEMS.register("cat_head_black", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_BLACK.get(), ModBlocks.CAT_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_RED = ITEMS.register("cat_head_red", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_RED.get(), ModBlocks.CAT_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_SIAMESE = ITEMS.register("cat_head_siamese", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_SIAMESE.get(), ModBlocks.CAT_WALL_HEAD_SIAMESE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_BRITISH_SHORTHAIR = ITEMS.register("cat_head_british_shorthair", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_BRITISH_SHORTHAIR.get(), ModBlocks.CAT_WALL_HEAD_BRITISH_SHORTHAIR.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_CALICO = ITEMS.register("cat_head_calico", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_CALICO.get(), ModBlocks.CAT_WALL_HEAD_CALICO.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_PERSIAN = ITEMS.register("cat_head_persian", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_PERSIAN.get(), ModBlocks.CAT_WALL_HEAD_PERSIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_RAGDOLL = ITEMS.register("cat_head_ragdoll", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_RAGDOLL.get(), ModBlocks.CAT_WALL_HEAD_RAGDOLL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_WHITE = ITEMS.register("cat_head_white", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_WHITE.get(), ModBlocks.CAT_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_JELLIE = ITEMS.register("cat_head_jellie", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_JELLIE.get(), ModBlocks.CAT_WALL_HEAD_JELLIE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAT_HEAD_ALL_BLACK = ITEMS.register("cat_head_all_black", () ->
            new CatHeadItem(ModBlocks.CAT_HEAD_ALL_BLACK.get(), ModBlocks.CAT_WALL_HEAD_ALL_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CAVE_SPIDER_HEAD = ITEMS.register("cave_spider_head", () ->
            new CaveSpiderHeadItem(ModBlocks.CAVE_SPIDER_HEAD.get(), ModBlocks.CAVE_SPIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CHICKEN_HEAD = ITEMS.register("chicken_head", () ->
            new ChickenHeadItem(ModBlocks.CHICKEN_HEAD.get(), ModBlocks.CHICKEN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> COD_HEAD = ITEMS.register("cod_head", () ->
            new CodHeadItem(ModBlocks.COD_HEAD.get(), ModBlocks.COD_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> COW_HEAD = ITEMS.register("cow_head", () ->
            new CowHeadItem(ModBlocks.COW_HEAD.get(), ModBlocks.COW_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> CREEPER_HEAD_CHARGED = ITEMS.register("creeper_head_charged", () ->
            new ChargedCreeperHeadItem(ModBlocks.CREEPER_HEAD_CHARGED.get(), ModBlocks.CREEPER_WALL_HEAD_CHARGED.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> DOLPHIN_HEAD = ITEMS.register("dolphin_head", () ->
            new DolphinHeadItem(ModBlocks.DOLPHIN_HEAD.get(), ModBlocks.DOLPHIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> DONKEY_HEAD = ITEMS.register("donkey_head", () ->
            new DonkeyHeadItem(ModBlocks.DONKEY_HEAD.get(), ModBlocks.DONKEY_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> DROWNED_HEAD = ITEMS.register("drowned_head", () ->
            new DrownedHeadItem(ModBlocks.DROWNED_HEAD.get(), ModBlocks.DROWNED_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ENDERMAN_HEAD = ITEMS.register("enderman_head", () ->
            new EndermanHeadItem(ModBlocks.ENDERMAN_HEAD.get(), ModBlocks.ENDERMAN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ENDERMITE_HEAD = ITEMS.register("endermite_head", () ->
            new EndermiteHeadItem(ModBlocks.ENDERMITE_HEAD.get(), ModBlocks.ENDERMITE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> EVOKER_HEAD = ITEMS.register("evoker_head", () ->
            new EvokerHeadItem(ModBlocks.EVOKER_HEAD.get(), ModBlocks.EVOKER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FOX_HEAD_RED = ITEMS.register("fox_head_red", () ->
            new FoxHeadItem(ModBlocks.FOX_HEAD_RED.get(), ModBlocks.FOX_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FOX_HEAD_SNOW = ITEMS.register("fox_head_snow", () ->
            new FoxHeadItem(ModBlocks.FOX_HEAD_SNOW.get(), ModBlocks.FOX_WALL_HEAD_SNOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FROG_HEAD_TEMPERATE = ITEMS.register("frog_head_temperate", () ->
            new FrogHeadItem(ModBlocks.FROG_HEAD_TEMPERATE.get(), ModBlocks.FROG_WALL_HEAD_TEMPERATE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FROG_HEAD_WARM = ITEMS.register("frog_head_warm", () ->
            new FrogHeadItem(ModBlocks.FROG_HEAD_WARM.get(), ModBlocks.FROG_WALL_HEAD_WARM.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> FROG_HEAD_COLD = ITEMS.register("frog_head_cold", () ->
            new FrogHeadItem(ModBlocks.FROG_HEAD_COLD.get(), ModBlocks.FROG_WALL_HEAD_COLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GHAST_HEAD = ITEMS.register("ghast_head", () ->
            new GhastHeadItem(ModBlocks.GHAST_HEAD.get(), ModBlocks.GHAST_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GLOW_SQUID_HEAD = ITEMS.register("glow_squid_head", () ->
            new GlowSquidHeadItem(ModBlocks.GLOW_SQUID_HEAD.get(), ModBlocks.GLOW_SQUID_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GOAT_HEAD = ITEMS.register("goat_head", () ->
            new GoatHeadItem(ModBlocks.GOAT_HEAD.get(), ModBlocks.GOAT_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GOAT_HEAD_SCREAMING = ITEMS.register("goat_head_screaming", () ->
            new ScreamingGoatHeadItem(ModBlocks.GOAT_HEAD_SCREAMING.get(), ModBlocks.GOAT_WALL_HEAD_SCREAMING.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> GUARDIAN_HEAD = ITEMS.register("guardian_head", () ->
            new GuardianHeadItem(ModBlocks.GUARDIAN_HEAD.get(), ModBlocks.GUARDIAN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GUARDIAN_ELDER_HEAD = ITEMS.register("guardian_elder_head", () ->
            new ElderGuardianHeadItem(ModBlocks.GUARDIAN_ELDER_HEAD.get(), ModBlocks.GUARDIAN_ELDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> HOGLIN_HEAD = ITEMS.register("hoglin_head", () ->
            new HoglinHeadItem(ModBlocks.HOGLIN_HEAD.get(), ModBlocks.HOGLIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE = ITEMS.register("horse_head_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY = ITEMS.register("horse_head_creamy", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CREAMY.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT = ITEMS.register("horse_head_chestnut", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CHESTNUT.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN = ITEMS.register("horse_head_brown", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK = ITEMS.register("horse_head_black", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BLACK.get(), ModBlocks.HORSE_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY = ITEMS.register("horse_head_gray", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_GRAY.get(), ModBlocks.HORSE_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN = ITEMS.register("horse_head_dark_brown", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_DARK_BROWN.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE = ITEMS.register("horse_head_white_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_WHITE_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE = ITEMS.register("horse_head_creamy_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE = ITEMS.register("horse_head_chestnut_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE = ITEMS.register("horse_head_brown_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE = ITEMS.register("horse_head_black_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BLACK_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE = ITEMS.register("horse_head_gray_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_GRAY_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE = ITEMS.register("horse_head_dark_brown_white", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE_FIELD = ITEMS.register("horse_head_white_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_WHITE_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE_FIELD = ITEMS.register("horse_head_creamy_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE_FIELD = ITEMS.register("horse_head_chestnut_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE_FIELD = ITEMS.register("horse_head_brown_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE_FIELD = ITEMS.register("horse_head_black_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BLACK_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE_FIELD = ITEMS.register("horse_head_gray_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_GRAY_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE_FIELD = ITEMS.register("horse_head_dark_brown_white_field", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_FIELD.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_FIELD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_WHITE_DOTS = ITEMS.register("horse_head_white_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_WHITE_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_WHITE_DOTS = ITEMS.register("horse_head_creamy_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CREAMY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_WHITE_DOTS = ITEMS.register("horse_head_chestnut_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CHESTNUT_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_WHITE_DOTS = ITEMS.register("horse_head_brown_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_WHITE_DOTS = ITEMS.register("horse_head_black_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BLACK_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_WHITE_DOTS = ITEMS.register("horse_head_gray_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_GRAY_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_WHITE_DOTS = ITEMS.register("horse_head_dark_brown_white_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_DARK_BROWN_WHITE_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_WHITE_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_WHITE_BLACK_DOTS = ITEMS.register("horse_head_white_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_WHITE_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_WHITE_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CREAMY_BLACK_DOTS = ITEMS.register("horse_head_creamy_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CREAMY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CREAMY_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_CHESTNUT_BLACK_DOTS = ITEMS.register("horse_head_chestnut_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_CHESTNUT_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_CHESTNUT_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BROWN_BLACK_DOTS = ITEMS.register("horse_head_brown_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BROWN_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_BLACK_BLACK_DOTS = ITEMS.register("horse_head_black_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_BLACK_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_BLACK_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_GRAY_BLACK_DOTS = ITEMS.register("horse_head_gray_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_GRAY_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_GRAY_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_DARK_BROWN_BLACK_DOTS = ITEMS.register("horse_head_dark_brown_black_dots", () ->
            new HorseHeadItem(ModBlocks.HORSE_HEAD_DARK_BROWN_BLACK_DOTS.get(), ModBlocks.HORSE_WALL_HEAD_DARK_BROWN_BLACK_DOTS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_HEAD_ZOMBIE = ITEMS.register("horse_head_zombie", () ->
            new ZombieHorseHeadItem(ModBlocks.HORSE_HEAD_ZOMBIE.get(), ModBlocks.HORSE_WALL_HEAD_ZOMBIE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HORSE_SKULL_SKELETON = ITEMS.register("horse_skull_skeleton", () ->
            new SkeletonHorseSkullItem(ModBlocks.HORSE_SKULL_SKELETON.get(), ModBlocks.HORSE_WALL_SKULL_SKELETON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> HUSK_HEAD = ITEMS.register("husk_head", () ->
            new HuskHeadItem(ModBlocks.HUSK_HEAD.get(), ModBlocks.HUSK_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ILLUSIONER_HEAD = ITEMS.register("illusioner_head", () ->
            new IllusionerHeadItem(ModBlocks.ILLUSIONER_HEAD.get(), ModBlocks.ILLUSIONER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> IRON_GOLEM_HEAD = ITEMS.register("iron_golem_head", () ->
            new IronGolemHeadItem(ModBlocks.IRON_GOLEM_HEAD.get(), ModBlocks.IRON_GOLEM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY = ITEMS.register("llama_head_creamy", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE = ITEMS.register("llama_head_white", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN = ITEMS.register("llama_head_brown", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY = ITEMS.register("llama_head_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_WHITE = ITEMS.register("llama_head_creamy_white", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_WHITE = ITEMS.register("llama_head_white_white", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_WHITE = ITEMS.register("llama_head_brown_white", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_WHITE = ITEMS.register("llama_head_gray_white", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_WHITE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_ORANGE = ITEMS.register("llama_head_creamy_orange", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_ORANGE = ITEMS.register("llama_head_white_orange", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_ORANGE = ITEMS.register("llama_head_brown_orange", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_ORANGE = ITEMS.register("llama_head_gray_orange", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_ORANGE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_MAGENTA = ITEMS.register("llama_head_creamy_magenta", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_MAGENTA = ITEMS.register("llama_head_white_magenta", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_MAGENTA = ITEMS.register("llama_head_brown_magenta", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_MAGENTA = ITEMS.register("llama_head_gray_magenta", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_MAGENTA.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIGHT_BLUE = ITEMS.register("llama_head_creamy_light_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIGHT_BLUE = ITEMS.register("llama_head_white_light_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIGHT_BLUE = ITEMS.register("llama_head_brown_light_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIGHT_BLUE = ITEMS.register("llama_head_gray_light_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_LIGHT_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_YELLOW = ITEMS.register("llama_head_creamy_yellow", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_YELLOW = ITEMS.register("llama_head_white_yellow", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_YELLOW = ITEMS.register("llama_head_brown_yellow", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_YELLOW = ITEMS.register("llama_head_gray_yellow", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_YELLOW.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIME = ITEMS.register("llama_head_creamy_lime", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIME = ITEMS.register("llama_head_white_lime", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIME = ITEMS.register("llama_head_brown_lime", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIME = ITEMS.register("llama_head_gray_lime", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_LIME.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_PINK = ITEMS.register("llama_head_creamy_pink", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_PINK = ITEMS.register("llama_head_white_pink", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_PINK = ITEMS.register("llama_head_brown_pink", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_PINK = ITEMS.register("llama_head_gray_pink", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_PINK.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_GRAY = ITEMS.register("llama_head_creamy_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_GRAY = ITEMS.register("llama_head_white_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_GRAY = ITEMS.register("llama_head_brown_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_GRAY = ITEMS.register("llama_head_gray_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_LIGHT_GRAY = ITEMS.register("llama_head_creamy_light_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_LIGHT_GRAY = ITEMS.register("llama_head_white_light_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_LIGHT_GRAY = ITEMS.register("llama_head_brown_light_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_LIGHT_GRAY = ITEMS.register("llama_head_gray_light_gray", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_LIGHT_GRAY.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_CYAN = ITEMS.register("llama_head_creamy_cyan", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_CYAN = ITEMS.register("llama_head_white_cyan", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_CYAN = ITEMS.register("llama_head_brown_cyan", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_CYAN = ITEMS.register("llama_head_gray_cyan", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_CYAN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_PURPLE = ITEMS.register("llama_head_creamy_purple", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_PURPLE = ITEMS.register("llama_head_white_purple", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_PURPLE = ITEMS.register("llama_head_brown_purple", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_PURPLE = ITEMS.register("llama_head_gray_purple", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_PURPLE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BLUE = ITEMS.register("llama_head_creamy_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BLUE = ITEMS.register("llama_head_white_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BLUE = ITEMS.register("llama_head_brown_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BLUE = ITEMS.register("llama_head_gray_blue", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_BLUE.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BROWN = ITEMS.register("llama_head_creamy_brown", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BROWN = ITEMS.register("llama_head_white_brown", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BROWN = ITEMS.register("llama_head_brown_brown", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BROWN = ITEMS.register("llama_head_gray_brown", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_BROWN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_GREEN = ITEMS.register("llama_head_creamy_green", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_GREEN = ITEMS.register("llama_head_white_green", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_GREEN = ITEMS.register("llama_head_brown_green", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_GREEN = ITEMS.register("llama_head_gray_green", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_GREEN.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_RED = ITEMS.register("llama_head_creamy_red", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_RED.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_RED = ITEMS.register("llama_head_white_red", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_RED.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_RED = ITEMS.register("llama_head_brown_red", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_RED.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_RED = ITEMS.register("llama_head_gray_red", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_RED.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_CREAMY_BLACK = ITEMS.register("llama_head_creamy_black", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_CREAMY_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_CREAMY_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_WHITE_BLACK = ITEMS.register("llama_head_white_black", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_WHITE_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_WHITE_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_BROWN_BLACK = ITEMS.register("llama_head_brown_black", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_BROWN_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_BROWN_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> LLAMA_HEAD_GRAY_BLACK = ITEMS.register("llama_head_gray_black", () ->
            new LlamaHeadItem(ModBlocks.LLAMA_HEAD_GRAY_BLACK.get(), ModBlocks.LLAMA_WALL_HEAD_GRAY_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MAGMA_CUBE_HEAD = ITEMS.register("magma_cube_head", () ->
            new MagmaCubeHeadItem(ModBlocks.MAGMA_CUBE_HEAD.get(), ModBlocks.MAGMA_CUBE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_RED = ITEMS.register("mooshroom_head_red", () ->
            new MooshroomHeadItem(ModBlocks.MOOSHROOM_HEAD_RED.get(), ModBlocks.MOOSHROOM_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_BROWN = ITEMS.register("mooshroom_head_brown", () ->
            new MooshroomHeadItem(ModBlocks.MOOSHROOM_HEAD_BROWN.get(), ModBlocks.MOOSHROOM_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> MULE_HEAD = ITEMS.register("mule_head", () ->
            new MuleHeadItem(ModBlocks.MULE_HEAD.get(), ModBlocks.MULE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> OCELOT_HEAD = ITEMS.register("ocelot_head", () ->
            new OcelotHeadItem(ModBlocks.OCELOT_HEAD.get(), ModBlocks.OCELOT_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD = ITEMS.register("panda_head", () ->
            new PandaHeadItem(ModBlocks.PANDA_HEAD.get(), ModBlocks.PANDA_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_AGGRESSIVE = ITEMS.register("panda_head_aggressive", () ->
            new AggressivePandaHeadItem(ModBlocks.PANDA_HEAD_AGGRESSIVE.get(), ModBlocks.PANDA_WALL_HEAD_AGGRESSIVE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_LAZY = ITEMS.register("panda_head_lazy", () ->
            new PandaHeadItem(ModBlocks.PANDA_HEAD_LAZY.get(), ModBlocks.PANDA_WALL_HEAD_LAZY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_WORRIED = ITEMS.register("panda_head_worried", () ->
            new WorriedPandaHeadItem(ModBlocks.PANDA_HEAD_WORRIED.get(), ModBlocks.PANDA_WALL_HEAD_WORRIED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_PLAYFUL = ITEMS.register("panda_head_playful", () ->
            new PandaHeadItem(ModBlocks.PANDA_HEAD_PLAYFUL.get(), ModBlocks.PANDA_WALL_HEAD_PLAYFUL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_WEAK = ITEMS.register("panda_head_weak", () ->
            new PandaHeadItem(ModBlocks.PANDA_HEAD_WEAK.get(), ModBlocks.PANDA_WALL_HEAD_WEAK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PANDA_HEAD_BROWN = ITEMS.register("panda_head_brown", () ->
            new PandaHeadItem(ModBlocks.PANDA_HEAD_BROWN.get(), ModBlocks.PANDA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_RED_BLUE = ITEMS.register("parrot_head_red_blue", () ->
            new ParrotHeadItem(ModBlocks.PARROT_HEAD_RED_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_RED_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_BLUE = ITEMS.register("parrot_head_blue", () ->
            new ParrotHeadItem(ModBlocks.PARROT_HEAD_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_GREEN = ITEMS.register("parrot_head_green", () ->
            new ParrotHeadItem(ModBlocks.PARROT_HEAD_GREEN.get(), ModBlocks.PARROT_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_YELLOW_BLUE = ITEMS.register("parrot_head_yellow_blue", () ->
            new ParrotHeadItem(ModBlocks.PARROT_HEAD_YELLOW_BLUE.get(), ModBlocks.PARROT_WALL_HEAD_YELLOW_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PARROT_HEAD_GRAY = ITEMS.register("parrot_head_gray", () ->
            new ParrotHeadItem(ModBlocks.PARROT_HEAD_GRAY.get(), ModBlocks.PARROT_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PHANTOM_HEAD = ITEMS.register("phantom_head", () ->
            new PhantomHeadItem(ModBlocks.PHANTOM_HEAD.get(), ModBlocks.PHANTOM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PIG_HEAD = ITEMS.register("pig_head", () ->
            new PigHeadItem(ModBlocks.PIG_HEAD.get(), ModBlocks.PIG_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PIGLIN_BRUTE_HEAD = ITEMS.register("piglin_brute_head", () ->
            new PiglinBruteHeadItem(ModBlocks.PIGLIN_BRUTE_HEAD.get(), ModBlocks.PIGLIN_BRUTE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PILLAGER_HEAD = ITEMS.register("pillager_head", () ->
            new PillagerHeadItem(ModBlocks.PILLAGER_HEAD.get(), ModBlocks.PILLAGER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> POLAR_BEAR_HEAD = ITEMS.register("polar_bear_head", () ->
            new PolarBearHeadItem(ModBlocks.POLAR_BEAR_HEAD.get(), ModBlocks.POLAR_BEAR_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> PUFFERFISH_HEAD = ITEMS.register("pufferfish_head", () ->
            new PufferfishHeadItem(ModBlocks.PUFFERFISH_HEAD.get(), ModBlocks.PUFFERFISH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_BROWN = ITEMS.register("rabbit_head_brown", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_BROWN.get(), ModBlocks.RABBIT_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_WHITE = ITEMS.register("rabbit_head_white", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_WHITE.get(), ModBlocks.RABBIT_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_BLACK = ITEMS.register("rabbit_head_black", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_BLACK.get(), ModBlocks.RABBIT_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_WHITE_SPLOTCHED = ITEMS.register("rabbit_head_white_splotched", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_WHITE_SPLOTCHED.get(), ModBlocks.RABBIT_WALL_HEAD_WHITE_SPLOTCHED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_GOLD = ITEMS.register("rabbit_head_gold", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_GOLD.get(), ModBlocks.RABBIT_WALL_HEAD_GOLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_SALT = ITEMS.register("rabbit_head_salt", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_SALT.get(), ModBlocks.RABBIT_WALL_HEAD_SALT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_CAERBANNOG = ITEMS.register("rabbit_head_caerbannog", () ->
            new KillerRabbitHeadItem(ModBlocks.RABBIT_HEAD_CAERBANNOG.get(), ModBlocks.RABBIT_WALL_HEAD_CAERBANNOG.get(),
                    (new Item.Properties()).rarity(Rarity.EPIC), Direction.DOWN));

    public static final RegistryObject<Item> RABBIT_HEAD_TOAST = ITEMS.register("rabbit_head_toast", () ->
            new RabbitHeadItem(ModBlocks.RABBIT_HEAD_TOAST.get(), ModBlocks.RABBIT_WALL_HEAD_TOAST.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> RAVAGER_HEAD = ITEMS.register("ravager_head", () ->
            new RavagerHeadItem(ModBlocks.RAVAGER_HEAD.get(), ModBlocks.RAVAGER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> SALMON_HEAD = ITEMS.register("salmon_head", () ->
            new SalmonHeadItem(ModBlocks.SALMON_HEAD.get(), ModBlocks.SALMON_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_WHITE = ITEMS.register("sheep_head_white", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_WHITE.get(), ModBlocks.SHEEP_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_ORANGE = ITEMS.register("sheep_head_orange", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_ORANGE.get(), ModBlocks.SHEEP_WALL_HEAD_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_MAGENTA = ITEMS.register("sheep_head_magenta", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_MAGENTA.get(), ModBlocks.SHEEP_WALL_HEAD_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIGHT_BLUE = ITEMS.register("sheep_head_light_blue", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_LIGHT_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_YELLOW = ITEMS.register("sheep_head_yellow", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_YELLOW.get(), ModBlocks.SHEEP_WALL_HEAD_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIME = ITEMS.register("sheep_head_lime", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_LIME.get(), ModBlocks.SHEEP_WALL_HEAD_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_PINK = ITEMS.register("sheep_head_pink", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_PINK.get(), ModBlocks.SHEEP_WALL_HEAD_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_GRAY = ITEMS.register("sheep_head_gray", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_LIGHT_GRAY = ITEMS.register("sheep_head_light_gray", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_LIGHT_GRAY.get(), ModBlocks.SHEEP_WALL_HEAD_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_CYAN = ITEMS.register("sheep_head_cyan", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_CYAN.get(), ModBlocks.SHEEP_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_PURPLE = ITEMS.register("sheep_head_purple", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_PURPLE.get(), ModBlocks.SHEEP_WALL_HEAD_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BLUE = ITEMS.register("sheep_head_blue", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_BLUE.get(), ModBlocks.SHEEP_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BROWN = ITEMS.register("sheep_head_brown", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_BROWN.get(), ModBlocks.SHEEP_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_GREEN = ITEMS.register("sheep_head_green", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_GREEN.get(), ModBlocks.SHEEP_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_RED = ITEMS.register("sheep_head_red", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_RED.get(), ModBlocks.SHEEP_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_BLACK = ITEMS.register("sheep_head_black", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_BLACK.get(), ModBlocks.SHEEP_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHEEP_HEAD_RAINBOW = ITEMS.register("sheep_head_rainbow", () ->
            new SheepHeadItem(ModBlocks.SHEEP_HEAD_RAINBOW.get(), ModBlocks.SHEEP_WALL_HEAD_RAINBOW.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD = ITEMS.register("shulker_head", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD.get(), ModBlocks.SHULKER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_WHITE = ITEMS.register("shulker_head_white", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_WHITE.get(), ModBlocks.SHULKER_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_ORANGE = ITEMS.register("shulker_head_orange", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_ORANGE.get(), ModBlocks.SHULKER_WALL_HEAD_ORANGE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_MAGENTA = ITEMS.register("shulker_head_magenta", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_MAGENTA.get(), ModBlocks.SHULKER_WALL_HEAD_MAGENTA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIGHT_BLUE = ITEMS.register("shulker_head_light_blue", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_LIGHT_BLUE.get(), ModBlocks.SHULKER_WALL_HEAD_LIGHT_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_YELLOW = ITEMS.register("shulker_head_yellow", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_YELLOW.get(), ModBlocks.SHULKER_WALL_HEAD_YELLOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIME = ITEMS.register("shulker_head_lime", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_LIME.get(), ModBlocks.SHULKER_WALL_HEAD_LIME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_PINK = ITEMS.register("shulker_head_pink", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_PINK.get(), ModBlocks.SHULKER_WALL_HEAD_PINK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_GRAY = ITEMS.register("shulker_head_gray", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_GRAY.get(), ModBlocks.SHULKER_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_LIGHT_GRAY = ITEMS.register("shulker_head_light_gray", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_LIGHT_GRAY.get(), ModBlocks.SHULKER_WALL_HEAD_LIGHT_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_CYAN = ITEMS.register("shulker_head_cyan", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_CYAN.get(), ModBlocks.SHULKER_WALL_HEAD_CYAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_PURPLE = ITEMS.register("shulker_head_purple", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_PURPLE.get(), ModBlocks.SHULKER_WALL_HEAD_PURPLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BLUE = ITEMS.register("shulker_head_blue", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_BLUE.get(), ModBlocks.SHULKER_WALL_HEAD_BLUE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BROWN = ITEMS.register("shulker_head_brown", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_BROWN.get(), ModBlocks.SHULKER_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_GREEN = ITEMS.register("shulker_head_green", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_GREEN.get(), ModBlocks.SHULKER_WALL_HEAD_GREEN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_RED = ITEMS.register("shulker_head_red", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_RED.get(), ModBlocks.SHULKER_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SHULKER_HEAD_BLACK = ITEMS.register("shulker_head_black", () ->
            new ShulkerHeadItem(ModBlocks.SHULKER_HEAD_BLACK.get(), ModBlocks.SHULKER_WALL_HEAD_BLACK.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SILVERFISH_HEAD = ITEMS.register("silverfish_head", () ->
            new SilverfishHeadItem(ModBlocks.SILVERFISH_HEAD.get(), ModBlocks.SILVERFISH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SLIME_HEAD = ITEMS.register("slime_head", () ->
            new SlimeHeadItem(ModBlocks.SLIME_HEAD.get(), ModBlocks.SLIME_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SNIFFER_HEAD = ITEMS.register("sniffer_head", () ->
            new SnifferHeadItem(ModBlocks.SNIFFER_HEAD.get(), ModBlocks.SNIFFER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SNOW_GOLEM_HEAD = ITEMS.register("snow_golem_head", () ->
            new SnowGolemHeadItem(ModBlocks.SNOW_GOLEM_HEAD.get(), ModBlocks.SNOW_GOLEM_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SPIDER_HEAD = ITEMS.register("spider_head", () ->
            new SpiderHeadItem(ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> SQUID_HEAD = ITEMS.register("squid_head", () ->
            new SquidHeadItem(ModBlocks.SQUID_HEAD.get(), ModBlocks.SQUID_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRAY_SKULL = ITEMS.register("stray_skull", () ->
            new StraySkullItem(ModBlocks.STRAY_SKULL.get(), ModBlocks.STRAY_WALL_SKULL.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRIDER_HEAD = ITEMS.register("strider_head", () ->
            new StriderHeadItem(ModBlocks.STRIDER_HEAD.get(), ModBlocks.STRIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> STRIDER_HEAD_COLD = ITEMS.register("strider_head_cold", () ->
            new StriderHeadItem(ModBlocks.STRIDER_HEAD_COLD.get(), ModBlocks.STRIDER_WALL_HEAD_COLD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TADPOLE_HEAD = ITEMS.register("tadpole_head", () ->
            new TadpoleHeadItem(ModBlocks.TADPOLE_HEAD.get(), ModBlocks.TADPOLE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_CREAMY = ITEMS.register("trader_llama_head_creamy", () ->
            new TraderLlamaHeadItem(ModBlocks.TRADER_LLAMA_HEAD_CREAMY.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_CREAMY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_WHITE = ITEMS.register("trader_llama_head_white", () ->
            new TraderLlamaHeadItem(ModBlocks.TRADER_LLAMA_HEAD_WHITE.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_WHITE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_BROWN = ITEMS.register("trader_llama_head_brown", () ->
            new TraderLlamaHeadItem(ModBlocks.TRADER_LLAMA_HEAD_BROWN.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TRADER_LLAMA_HEAD_GRAY = ITEMS.register("trader_llama_head_gray", () ->
            new TraderLlamaHeadItem(ModBlocks.TRADER_LLAMA_HEAD_GRAY.get(), ModBlocks.TRADER_LLAMA_WALL_HEAD_GRAY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TROPICAL_FISH_HEAD = ITEMS.register("tropical_fish_head", () ->
            new TropicalFishHeadItem(ModBlocks.TROPICAL_FISH_HEAD.get(), ModBlocks.TROPICAL_FISH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> TURTLE_HEAD = ITEMS.register("turtle_head", () ->
            new TurtleHeadItem(ModBlocks.TURTLE_HEAD.get(), ModBlocks.TURTLE_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VEX_HEAD = ITEMS.register("vex_head", () ->
            new VexHeadItem(ModBlocks.VEX_HEAD.get(), ModBlocks.VEX_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VEX_HEAD_CHARGING = ITEMS.register("vex_head_charging", () ->
            new ChargingVexHeadItem(ModBlocks.VEX_HEAD_CHARGING.get(), ModBlocks.VEX_WALL_HEAD_CHARGING.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT = ITEMS.register("villager_head_desert", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_ARMORER = ITEMS.register("villager_head_desert_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_BUTCHER = ITEMS.register("villager_head_desert_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_CARTOGRAPHER = ITEMS.register("villager_head_desert_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_CLERIC = ITEMS.register("villager_head_desert_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_FARMER = ITEMS.register("villager_head_desert_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_FISHERMAN = ITEMS.register("villager_head_desert_fisherman", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_FLETCHER = ITEMS.register("villager_head_desert_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_LEATHERWORKER = ITEMS.register("villager_head_desert_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_LIBRARIAN = ITEMS.register("villager_head_desert_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_MASON = ITEMS.register("villager_head_desert_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_SHEPHERD = ITEMS.register("villager_head_desert_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_TOOLSMITH = ITEMS.register("villager_head_desert_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_WEAPONSMITH = ITEMS.register("villager_head_desert_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_DESERT_NITWIT = ITEMS.register("villager_head_desert_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_DESERT_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_DESERT_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE = ITEMS.register("villager_head_jungle", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_ARMORER = ITEMS.register("villager_head_jungle_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_BUTCHER = ITEMS.register("villager_head_jungle_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_CARTOGRAPHER = ITEMS.register("villager_head_jungle_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_CLERIC = ITEMS.register("villager_head_jungle_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_FARMER = ITEMS.register("villager_head_jungle_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_FISHERMAN = ITEMS.register("villager_head_jungle_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_FLETCHER = ITEMS.register("villager_head_jungle_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_LEATHERWORKER = ITEMS.register("villager_head_jungle_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_LIBRARIAN = ITEMS.register("villager_head_jungle_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_MASON = ITEMS.register("villager_head_jungle_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_SHEPHERD = ITEMS.register("villager_head_jungle_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_TOOLSMITH = ITEMS.register("villager_head_jungle_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_WEAPONSMITH = ITEMS.register("villager_head_jungle_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_JUNGLE_NITWIT = ITEMS.register("villager_head_jungle_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_JUNGLE_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_JUNGLE_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS = ITEMS.register("villager_head_plains", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_ARMORER = ITEMS.register("villager_head_plains_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_BUTCHER = ITEMS.register("villager_head_plains_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_CARTOGRAPHER = ITEMS.register("villager_head_plains_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_CLERIC = ITEMS.register("villager_head_plains_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_FARMER = ITEMS.register("villager_head_plains_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_FISHERMAN = ITEMS.register("villager_head_plains_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_FLETCHER = ITEMS.register("villager_head_plains_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_LEATHERWORKER = ITEMS.register("villager_head_plains_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_LIBRARIAN = ITEMS.register("villager_head_plains_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_MASON = ITEMS.register("villager_head_plains_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_SHEPHERD = ITEMS.register("villager_head_plains_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_TOOLSMITH = ITEMS.register("villager_head_plains_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_WEAPONSMITH = ITEMS.register("villager_head_plains_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_PLAINS_NITWIT = ITEMS.register("villager_head_plains_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_PLAINS_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_PLAINS_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA = ITEMS.register("villager_head_savanna", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_ARMORER = ITEMS.register("villager_head_savanna_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_BUTCHER = ITEMS.register("villager_head_savanna_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_CARTOGRAPHER = ITEMS.register("villager_head_savanna_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_CLERIC = ITEMS.register("villager_head_savanna_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_FARMER = ITEMS.register("villager_head_savanna_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_FISHERMAN = ITEMS.register("villager_head_savanna_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_FLETCHER = ITEMS.register("villager_head_savanna_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_LEATHERWORKER = ITEMS.register("villager_head_savanna_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_LIBRARIAN = ITEMS.register("villager_head_savanna_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_MASON = ITEMS.register("villager_head_savanna_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_SHEPHERD = ITEMS.register("villager_head_savanna_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_TOOLSMITH = ITEMS.register("villager_head_savanna_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_WEAPONSMITH = ITEMS.register("villager_head_savanna_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SAVANNA_NITWIT = ITEMS.register("villager_head_savanna_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SAVANNA_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_SAVANNA_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW = ITEMS.register("villager_head_snow", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_ARMORER = ITEMS.register("villager_head_snow_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_BUTCHER = ITEMS.register("villager_head_snow_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_CARTOGRAPHER = ITEMS.register("villager_head_snow_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_CLERIC = ITEMS.register("villager_head_snow_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_FARMER = ITEMS.register("villager_head_snow_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_FISHERMAN = ITEMS.register("villager_head_snow_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_FLETCHER = ITEMS.register("villager_head_snow_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_LEATHERWORKER = ITEMS.register("villager_head_snow_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_LIBRARIAN = ITEMS.register("villager_head_snow_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_MASON = ITEMS.register("villager_head_snow_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_SHEPHERD = ITEMS.register("villager_head_snow_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_TOOLSMITH = ITEMS.register("villager_head_snow_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_WEAPONSMITH = ITEMS.register("villager_head_snow_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SNOW_NITWIT = ITEMS.register("villager_head_snow_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SNOW_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_SNOW_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP = ITEMS.register("villager_head_swamp", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_ARMORER = ITEMS.register("villager_head_swamp_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_BUTCHER = ITEMS.register("villager_head_swamp_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_CARTOGRAPHER = ITEMS.register("villager_head_swamp_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_CLERIC = ITEMS.register("villager_head_swamp_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_FARMER = ITEMS.register("villager_head_swamp_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_FISHERMAN = ITEMS.register("villager_head_swamp_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_FLETCHER = ITEMS.register("villager_head_swamp_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_LEATHERWORKER = ITEMS.register("villager_head_swamp_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_LIBRARIAN = ITEMS.register("villager_head_swamp_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_MASON = ITEMS.register("villager_head_swamp_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_SHEPHERD = ITEMS.register("villager_head_swamp_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_TOOLSMITH = ITEMS.register("villager_head_swamp_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_WEAPONSMITH = ITEMS.register("villager_head_swamp_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_SWAMP_NITWIT = ITEMS.register("villager_head_swamp_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_SWAMP_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_SWAMP_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA = ITEMS.register("villager_head_taiga", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_ARMORER = ITEMS.register("villager_head_taiga_armorer", () ->
            new VillagerArmorerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_ARMORER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_BUTCHER = ITEMS.register("villager_head_taiga_butcher", () ->
            new VillagerButcherHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_BUTCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_CARTOGRAPHER = ITEMS.register("villager_head_taiga_cartographer", () ->
            new VillagerCartographerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_CARTOGRAPHER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_CLERIC = ITEMS.register("villager_head_taiga_cleric", () ->
            new VillagerClericHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_CLERIC.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_FARMER = ITEMS.register("villager_head_taiga_farmer", () ->
            new VillagerFarmerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_FARMER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_FISHERMAN = ITEMS.register("villager_head_taiga_fisherman", () ->
            new VillagerFishermanHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_FISHERMAN.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_FLETCHER = ITEMS.register("villager_head_taiga_fletcher", () ->
            new VillagerFletcherHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_FLETCHER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_LEATHERWORKER = ITEMS.register("villager_head_taiga_leatherworker", () ->
            new VillagerLeatherworkerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_LEATHERWORKER.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_LIBRARIAN = ITEMS.register("villager_head_taiga_librarian", () ->
            new VillagerLibrarianHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_LIBRARIAN.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_MASON = ITEMS.register("villager_head_taiga_mason", () ->
            new VillagerMasonHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_MASON.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_SHEPHERD = ITEMS.register("villager_head_taiga_shepherd", () ->
            new VillagerShepherdHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_SHEPHERD.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_TOOLSMITH = ITEMS.register("villager_head_taiga_toolsmith", () ->
            new VillagerToolsmithHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_TOOLSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_WEAPONSMITH = ITEMS.register("villager_head_taiga_weaponsmith", () ->
            new VillagerWeaponsmithHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_WEAPONSMITH.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VILLAGER_HEAD_TAIGA_NITWIT = ITEMS.register("villager_head_taiga_nitwit", () ->
            new VillagerHeadItem(ModBlocks.VILLAGER_HEAD_TAIGA_NITWIT.get(), ModBlocks.VILLAGER_WALL_HEAD_TAIGA_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VINDICATOR_HEAD = ITEMS.register("vindicator_head", () ->
            new VindicatorHeadItem(ModBlocks.VINDICATOR_HEAD.get(), ModBlocks.VINDICATOR_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WANDERING_TRADER_HEAD = ITEMS.register("wandering_trader_head", () ->
            new WanderingTraderHeadItem(ModBlocks.WANDERING_TRADER_HEAD.get(), ModBlocks.WANDERING_TRADER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WARDEN_HEAD = ITEMS.register("warden_head", () ->
            new WardenHeadItem(ModBlocks.WARDEN_HEAD.get(), ModBlocks.WARDEN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.EPIC), Direction.DOWN));

    public static final RegistryObject<Item> WITCH_HEAD = ITEMS.register("witch_head", () ->
            new WitchHeadItem(ModBlocks.WITCH_HEAD.get(), ModBlocks.WITCH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WITHER_HEAD = ITEMS.register("wither_head", () ->
            new WitherHeadItem(ModBlocks.WITHER_HEAD.get(), ModBlocks.WITHER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> WITHER_HEAD_INVULNERABLE = ITEMS.register("wither_head_invulnerable", () ->
            new WitherHeadItem(ModBlocks.WITHER_HEAD_INVULNERABLE.get(), ModBlocks.WITHER_WALL_HEAD_INVULNERABLE.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> WITHER_HEAD_SHIELD = ITEMS.register("wither_head_shield", () ->
            new WitherHeadItem(ModBlocks.WITHER_HEAD_SHIELD.get(), ModBlocks.WITHER_WALL_HEAD_SHIELD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> WITHER_HEAD_INVULNERABLE_SHIELD = ITEMS.register("wither_head_invulnerable_shield", () ->
            new WitherHeadItem(ModBlocks.WITHER_HEAD_INVULNERABLE_SHIELD.get(), ModBlocks.WITHER_WALL_HEAD_INVULNERABLE_SHIELD.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> WOLF_HEAD = ITEMS.register("wolf_head", () ->
            new WolfHeadItem(ModBlocks.WOLF_HEAD.get(), ModBlocks.WOLF_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WOLF_HEAD_TAME = ITEMS.register("wolf_head_tame", () ->
            new TameWolfHeadItem(ModBlocks.WOLF_HEAD_TAME.get(), ModBlocks.WOLF_WALL_HEAD_TAME.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WOLF_HEAD_ANGRY = ITEMS.register("wolf_head_angry", () ->
            new AngryWolfHeadItem(ModBlocks.WOLF_HEAD_ANGRY.get(), ModBlocks.WOLF_WALL_HEAD_ANGRY.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOGLIN_HEAD = ITEMS.register("zoglin_head", () ->
            new ZoglinHeadItem(ModBlocks.ZOGLIN_HEAD.get(), ModBlocks.ZOGLIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT = ITEMS.register("zombie_villager_head_desert", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_ARMORER = ITEMS.register("zombie_villager_head_desert_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_BUTCHER = ITEMS.register("zombie_villager_head_desert_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_CARTOGRAPHER = ITEMS.register("zombie_villager_head_desert_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_CLERIC = ITEMS.register("zombie_villager_head_desert_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_FARMER = ITEMS.register("zombie_villager_head_desert_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_FISHERMAN = ITEMS.register("zombie_villager_head_desert_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_FLETCHER = ITEMS.register("zombie_villager_head_desert_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_LEATHERWORKER = ITEMS.register("zombie_villager_head_desert_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_LIBRARIAN = ITEMS.register("zombie_villager_head_desert_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_MASON = ITEMS.register("zombie_villager_head_desert_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_SHEPHERD = ITEMS.register("zombie_villager_head_desert_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_TOOLSMITH = ITEMS.register("zombie_villager_head_desert_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_WEAPONSMITH = ITEMS.register("zombie_villager_head_desert_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_DESERT_NITWIT = ITEMS.register("zombie_villager_head_desert_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_DESERT_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_DESERT_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE = ITEMS.register("zombie_villager_head_jungle", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_ARMORER = ITEMS.register("zombie_villager_head_jungle_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_BUTCHER = ITEMS.register("zombie_villager_head_jungle_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_CARTOGRAPHER = ITEMS.register("zombie_villager_head_jungle_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_CLERIC = ITEMS.register("zombie_villager_head_jungle_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_FARMER = ITEMS.register("zombie_villager_head_jungle_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_FISHERMAN = ITEMS.register("zombie_villager_head_jungle_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_FLETCHER = ITEMS.register("zombie_villager_head_jungle_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_LEATHERWORKER = ITEMS.register("zombie_villager_head_jungle_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_LIBRARIAN = ITEMS.register("zombie_villager_head_jungle_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_MASON = ITEMS.register("zombie_villager_head_jungle_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_SHEPHERD = ITEMS.register("zombie_villager_head_jungle_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_TOOLSMITH = ITEMS.register("zombie_villager_head_jungle_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_WEAPONSMITH = ITEMS.register("zombie_villager_head_jungle_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_JUNGLE_NITWIT = ITEMS.register("zombie_villager_head_jungle_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_JUNGLE_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_JUNGLE_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS = ITEMS.register("zombie_villager_head_plains", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_ARMORER = ITEMS.register("zombie_villager_head_plains_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_BUTCHER = ITEMS.register("zombie_villager_head_plains_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_CARTOGRAPHER = ITEMS.register("zombie_villager_head_plains_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_CLERIC = ITEMS.register("zombie_villager_head_plains_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_FARMER = ITEMS.register("zombie_villager_head_plains_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_FISHERMAN = ITEMS.register("zombie_villager_head_plains_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_FLETCHER = ITEMS.register("zombie_villager_head_plains_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_LEATHERWORKER = ITEMS.register("zombie_villager_head_plains_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_LIBRARIAN = ITEMS.register("zombie_villager_head_plains_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_MASON = ITEMS.register("zombie_villager_head_plains_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_SHEPHERD = ITEMS.register("zombie_villager_head_plains_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_TOOLSMITH = ITEMS.register("zombie_villager_head_plains_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_WEAPONSMITH = ITEMS.register("zombie_villager_head_plains_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_PLAINS_NITWIT = ITEMS.register("zombie_villager_head_plains_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_PLAINS_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_PLAINS_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA = ITEMS.register("zombie_villager_head_savanna", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_ARMORER = ITEMS.register("zombie_villager_head_savanna_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_BUTCHER = ITEMS.register("zombie_villager_head_savanna_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_CARTOGRAPHER = ITEMS.register("zombie_villager_head_savanna_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_CLERIC = ITEMS.register("zombie_villager_head_savanna_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_FARMER = ITEMS.register("zombie_villager_head_savanna_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_FISHERMAN = ITEMS.register("zombie_villager_head_savanna_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_FLETCHER = ITEMS.register("zombie_villager_head_savanna_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_LEATHERWORKER = ITEMS.register("zombie_villager_head_savanna_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_LIBRARIAN = ITEMS.register("zombie_villager_head_savanna_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_MASON = ITEMS.register("zombie_villager_head_savanna_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_SHEPHERD = ITEMS.register("zombie_villager_head_savanna_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_TOOLSMITH = ITEMS.register("zombie_villager_head_savanna_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_WEAPONSMITH = ITEMS.register("zombie_villager_head_savanna_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SAVANNA_NITWIT = ITEMS.register("zombie_villager_head_savanna_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SAVANNA_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SAVANNA_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW = ITEMS.register("zombie_villager_head_snow", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_ARMORER = ITEMS.register("zombie_villager_head_snow_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_BUTCHER = ITEMS.register("zombie_villager_head_snow_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_CARTOGRAPHER = ITEMS.register("zombie_villager_head_snow_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_CLERIC = ITEMS.register("zombie_villager_head_snow_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_FARMER = ITEMS.register("zombie_villager_head_snow_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_FISHERMAN = ITEMS.register("zombie_villager_head_snow_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_FLETCHER = ITEMS.register("zombie_villager_head_snow_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_LEATHERWORKER = ITEMS.register("zombie_villager_head_snow_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_LIBRARIAN = ITEMS.register("zombie_villager_head_snow_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_MASON = ITEMS.register("zombie_villager_head_snow_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_SHEPHERD = ITEMS.register("zombie_villager_head_snow_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_TOOLSMITH = ITEMS.register("zombie_villager_head_snow_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_WEAPONSMITH = ITEMS.register("zombie_villager_head_snow_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SNOW_NITWIT = ITEMS.register("zombie_villager_head_snow_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SNOW_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SNOW_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP = ITEMS.register("zombie_villager_head_swamp", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_ARMORER = ITEMS.register("zombie_villager_head_swamp_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_BUTCHER = ITEMS.register("zombie_villager_head_swamp_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_CARTOGRAPHER = ITEMS.register("zombie_villager_head_swamp_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_CLERIC = ITEMS.register("zombie_villager_head_swamp_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_FARMER = ITEMS.register("zombie_villager_head_swamp_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_FISHERMAN = ITEMS.register("zombie_villager_head_swamp_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_FLETCHER = ITEMS.register("zombie_villager_head_swamp_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_LEATHERWORKER = ITEMS.register("zombie_villager_head_swamp_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_LIBRARIAN = ITEMS.register("zombie_villager_head_swamp_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_MASON = ITEMS.register("zombie_villager_head_swamp_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_SHEPHERD = ITEMS.register("zombie_villager_head_swamp_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_TOOLSMITH = ITEMS.register("zombie_villager_head_swamp_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_WEAPONSMITH = ITEMS.register("zombie_villager_head_swamp_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_SWAMP_NITWIT = ITEMS.register("zombie_villager_head_swamp_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_SWAMP_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_SWAMP_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA = ITEMS.register("zombie_villager_head_taiga", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_ARMORER = ITEMS.register("zombie_villager_head_taiga_armorer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_ARMORER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_ARMORER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_BUTCHER = ITEMS.register("zombie_villager_head_taiga_butcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_BUTCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_BUTCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_CARTOGRAPHER = ITEMS.register("zombie_villager_head_taiga_cartographer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_CARTOGRAPHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_CARTOGRAPHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_CLERIC = ITEMS.register("zombie_villager_head_taiga_cleric", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_CLERIC.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_CLERIC.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_FARMER = ITEMS.register("zombie_villager_head_taiga_farmer", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_FARMER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_FARMER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_FISHERMAN = ITEMS.register("zombie_villager_head_taiga_fisherman", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_FISHERMAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_FISHERMAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_FLETCHER = ITEMS.register("zombie_villager_head_taiga_fletcher", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_FLETCHER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_FLETCHER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_LEATHERWORKER = ITEMS.register("zombie_villager_head_taiga_leatherworker", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_LEATHERWORKER.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_LEATHERWORKER.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_LIBRARIAN = ITEMS.register("zombie_villager_head_taiga_librarian", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_LIBRARIAN.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_LIBRARIAN.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_MASON = ITEMS.register("zombie_villager_head_taiga_mason", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_MASON.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_MASON.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_SHEPHERD = ITEMS.register("zombie_villager_head_taiga_shepherd", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_SHEPHERD.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_SHEPHERD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_TOOLSMITH = ITEMS.register("zombie_villager_head_taiga_toolsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_TOOLSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_TOOLSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_WEAPONSMITH = ITEMS.register("zombie_villager_head_taiga_weaponsmith", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_WEAPONSMITH.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_WEAPONSMITH.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIE_VILLAGER_HEAD_TAIGA_NITWIT = ITEMS.register("zombie_villager_head_taiga_nitwit", () ->
            new ZombieVillagerHeadItem(ModBlocks.ZOMBIE_VILLAGER_HEAD_TAIGA_NITWIT.get(), ModBlocks.ZOMBIE_VILLAGER_WALL_HEAD_TAIGA_NITWIT.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> ZOMBIFIED_PIGLIN_HEAD = ITEMS.register("zombified_piglin_head", () ->
            new ZombifiedPiglinHeadItem(ModBlocks.ZOMBIFIED_PIGLIN_HEAD.get(), ModBlocks.ZOMBIFIED_PIGLIN_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
