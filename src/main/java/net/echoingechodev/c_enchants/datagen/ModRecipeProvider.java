package net.echoingechodev.c_enchants.datagen;

import net.echoingechodev.c_enchants.items.ItemRegister;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ItemRegister.ENCHANTED_PAGES.get())
                .requires(Items.PAPER, 3)
                .requires(Items.GOLD_NUGGET, 2)
                .requires(Items.FEATHER, 1)
                .requires(Items.GLOW_INK_SAC, 1)
                .unlockedBy(getHasName(Items.GLOW_INK_SAC), has(Items.GLOW_INK_SAC))
                .save(recipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ItemRegister.AQUA_AFFINITY_RUNE.get())
                .pattern("CAC")
                .pattern("CDC")
                .define('C', Items.PRISMARINE_CRYSTALS)
                .define('A', Items.HEART_OF_THE_SEA)
                .define('D', Items.DEEPSLATE)
                .unlockedBy(getHasName(Items.HEART_OF_THE_SEA), has(Items.HEART_OF_THE_SEA))
                .save(recipeOutput);
    }
}
