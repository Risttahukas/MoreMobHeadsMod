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

    public static final RegistryObject<Item> COW_HEAD = ITEMS.register("cow_head", () ->
            new EffectSkullItem(ModBlocks.COW_HEAD.get(), ModBlocks.COW_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> GHAST_HEAD = ITEMS.register("ghast_head", () ->
            new EffectSkullItem(ModBlocks.GHAST_HEAD.get(), ModBlocks.GHAST_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_RED = ITEMS.register("mooshroom_head_red", () ->
            new EffectSkullItem(ModBlocks.MOOSHROOM_HEAD_RED.get(), ModBlocks.MOOSHROOM_WALL_HEAD_RED.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> MOOSHROOM_HEAD_BROWN = ITEMS.register("mooshroom_head_brown", () ->
            new EffectSkullItem(ModBlocks.MOOSHROOM_HEAD_BROWN.get(), ModBlocks.MOOSHROOM_WALL_HEAD_BROWN.get(),
                    (new Item.Properties()).rarity(Rarity.RARE), Direction.DOWN));

    public static final RegistryObject<Item> OCELOT_HEAD = ITEMS.register("ocelot_head", () ->
            new EffectSkullItem(ModBlocks.OCELOT_HEAD.get(), ModBlocks.OCELOT_WALL_HEAD.get(),
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

    public static final RegistryObject<Item> SPIDER_HEAD = ITEMS.register("spider_head", () ->
            new EffectSkullItem(ModBlocks.SPIDER_HEAD.get(), ModBlocks.SPIDER_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> VEX_HEAD = ITEMS.register("vex_head", () ->
            new EffectSkullItem(ModBlocks.VEX_HEAD.get(), ModBlocks.VEX_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static final RegistryObject<Item> WITCH_HEAD = ITEMS.register("witch_head", () ->
            new EffectSkullItem(ModBlocks.WITCH_HEAD.get(), ModBlocks.WITCH_WALL_HEAD.get(),
                    (new Item.Properties()).rarity(Rarity.UNCOMMON), Direction.DOWN));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
