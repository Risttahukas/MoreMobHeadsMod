package net.risttahukas.moremobheads.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
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
                .requires(ModTags.Items.COLORED_SHULKER_HEAD)
                .requires(Items.WATER_BUCKET)
                .unlockedBy("has_colored_shulker_head", has(ModTags.Items.COLORED_SHULKER_HEAD))
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
    }
}
