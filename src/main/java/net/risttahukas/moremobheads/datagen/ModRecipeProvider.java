package net.risttahukas.moremobheads.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.risttahukas.moremobheads.item.ModItems;
import net.risttahukas.moremobheads.util.ModTags;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> finishedRecipeConsumer) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_WHITE.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_ORANGE.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_MAGENTA.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.MAGENTA_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_LIGHT_BLUE.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_YELLOW.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_LIME.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_PINK.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_GRAY.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.GRAY_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_LIGHT_GRAY.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_CYAN.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.CYAN_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_PURPLE.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_BLUE.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_BROWN.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.BROWN_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_GREEN.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_RED.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.RED_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHULKER_HEAD_BLACK.get())
                .requires(ModTags.Items.SHULKER_HEAD)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_shulker_head", has(ModTags.Items.SHULKER_HEAD))
                .save(finishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_WHITE.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.WHITE_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_ORANGE.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.ORANGE_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_MAGENTA.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.MAGENTA_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_LIGHT_BLUE.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.LIGHT_BLUE_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_YELLOW.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_LIME.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.LIME_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_PINK.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.PINK_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_GRAY.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.GRAY_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_LIGHT_GRAY.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.LIGHT_GRAY_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_CYAN.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.CYAN_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_PURPLE.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.PURPLE_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_BLUE.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.BLUE_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_BROWN.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.BROWN_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_GREEN.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.GREEN_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_RED.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.RED_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.SHEEP_HEAD_BLACK.get())
                .requires(ModTags.Items.COLORED_SHEEP_HEAD)
                .requires(Items.BLACK_DYE)
                .unlockedBy("has_colored_sheep_head", has(ModTags.Items.COLORED_SHEEP_HEAD))
                .save(finishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_WHITE.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.WHITE_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_ORANGE.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.ORANGE_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_MAGENTA.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.MAGENTA_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_LIGHT_BLUE.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.LIGHT_BLUE_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_YELLOW.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.YELLOW_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_LIME.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.LIME_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_PINK.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.PINK_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_GRAY.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.GRAY_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_LIGHT_GRAY.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.LIGHT_GRAY_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_CYAN.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.CYAN_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_PURPLE.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.PURPLE_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_BLUE.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.BLUE_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_BROWN.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.BROWN_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_GREEN.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.GREEN_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_RED.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.RED_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_CREAMY_BLACK.get())
                .requires(ModTags.Items.CREAMY_LLAMA_HEAD)
                .requires(Items.BLACK_CARPET)
                .unlockedBy("has_creamy_llama_head", has(ModTags.Items.CREAMY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_WHITE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.WHITE_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_ORANGE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.ORANGE_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_MAGENTA.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.MAGENTA_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_LIGHT_BLUE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.LIGHT_BLUE_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_YELLOW.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.YELLOW_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_LIME.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.LIME_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_PINK.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.PINK_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_GRAY.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.GRAY_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_LIGHT_GRAY.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.LIGHT_GRAY_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_CYAN.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.CYAN_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_PURPLE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.PURPLE_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_BLUE.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.BLUE_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_BROWN.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.BROWN_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_GREEN.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.GREEN_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_RED.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.RED_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_WHITE_BLACK.get())
                .requires(ModTags.Items.WHITE_LLAMA_HEAD)
                .requires(Items.BLACK_CARPET)
                .unlockedBy("has_white_llama_head", has(ModTags.Items.WHITE_LLAMA_HEAD))
                .save(finishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_WHITE.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.WHITE_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_ORANGE.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.ORANGE_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_MAGENTA.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.MAGENTA_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_LIGHT_BLUE.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.LIGHT_BLUE_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_YELLOW.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.YELLOW_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_LIME.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.LIME_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_PINK.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.PINK_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_GRAY.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.GRAY_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_LIGHT_GRAY.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.LIGHT_GRAY_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_CYAN.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.CYAN_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_PURPLE.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.PURPLE_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_BLUE.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.BLUE_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_BROWN.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.BROWN_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_GREEN.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.GREEN_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_RED.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.RED_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_BROWN_BLACK.get())
                .requires(ModTags.Items.BROWN_LLAMA_HEAD)
                .requires(Items.BLACK_CARPET)
                .unlockedBy("has_brown_llama_head", has(ModTags.Items.BROWN_LLAMA_HEAD))
                .save(finishedRecipeConsumer);



        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_WHITE.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.WHITE_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_ORANGE.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.ORANGE_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_MAGENTA.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.MAGENTA_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_LIGHT_BLUE.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.LIGHT_BLUE_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_YELLOW.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.YELLOW_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_LIME.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.LIME_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_PINK.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.PINK_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_GRAY.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.GRAY_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_LIGHT_GRAY.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.LIGHT_GRAY_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_CYAN.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.CYAN_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_PURPLE.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.PURPLE_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_BLUE.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.BLUE_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_BROWN.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.BROWN_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_GREEN.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.GREEN_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_RED.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.RED_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.DECORATIONS, ModItems.LLAMA_HEAD_GRAY_BLACK.get())
                .requires(ModTags.Items.GRAY_LLAMA_HEAD)
                .requires(Items.BLACK_CARPET)
                .unlockedBy("has_gray_llama_head", has(ModTags.Items.GRAY_LLAMA_HEAD))
                .save(finishedRecipeConsumer);


        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WITHER_HEAD_SHIELD.get())
                .define('W', ModItems.WITHER_HEAD.get())
                .define('N', Items.NETHER_STAR)
                .pattern("NNN")
                .pattern("NWN")
                .pattern("NNN")
                .unlockedBy("has_wither_head", has(ModItems.WITHER_HEAD.get()))
                .save(finishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, ModItems.WITHER_HEAD_INVULNERABLE_SHIELD.get())
                .define('W', ModItems.WITHER_HEAD_INVULNERABLE.get())
                .define('N', Items.NETHER_STAR)
                .pattern("NNN")
                .pattern("NWN")
                .pattern("NNN")
                .unlockedBy("has_invulnerable_wither_head", has(ModItems.WITHER_HEAD_INVULNERABLE.get()))
                .save(finishedRecipeConsumer);
    }
}
