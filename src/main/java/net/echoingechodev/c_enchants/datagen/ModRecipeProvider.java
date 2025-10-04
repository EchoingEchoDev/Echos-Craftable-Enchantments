package net.echoingechodev.c_enchants.datagen;

import com.mojang.datafixers.util.Either;
import net.echoingechodev.c_enchants.items.ItemRegister;
import net.echoingechodev.c_enchants.util.EnchantmentHolder;
import net.minecraft.advancements.critereon.ItemEnchantmentsPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderOwner;
import net.minecraft.core.component.DataComponents;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.inventory.AnvilMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.level.block.AnvilBlock;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.awt.image.ComponentSampleModel;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Stream;

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

        baseBookRecipeBuilder(ItemRegister.AQUA_AFFINITY_RUNE.get(), Enchantments.AQUA_AFFINITY, "aqua_affinity", recipeOutput);

    }

    private void baseBookRecipeBuilder(Item rune, ResourceKey<Enchantment> enchantment, String id, RecipeOutput recipeOutput) {
        ItemStack resultItem = new ItemStack(Items.ENCHANTED_BOOK);
        // TODO: fix this or make every recipe by hand in the future
        resultItem.enchant((Holder<Enchantment>)enchantment, 1);

        CustomSmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.BOOK),
                Ingredient.of(ItemRegister.ENCHANTED_PAGES.get()),
                Ingredient.of(rune),
                RecipeCategory.MISC, resultItem).save(recipeOutput, "pages_to_" + id);
    }
}

