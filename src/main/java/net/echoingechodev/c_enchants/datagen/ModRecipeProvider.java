package net.echoingechodev.c_enchants.datagen;

import net.echoingechodev.c_enchants.items.ItemRegister;
import net.minecraft.client.Minecraft;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.EnchantedBookItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.enchantment.*;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.EnchantingTableBlock;
import net.minecraft.world.level.block.entity.EnchantingTableBlockEntity;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
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

        // Item that all the rune crafting recipes share
        Item RUNE_BASE_ITEM = Items.DEEPSLATE;

        // AQUA AFFINITY
        Map<ItemLike, Integer> aqua_affinity_map = new HashMap<>();
        aqua_affinity_map.put(Items.PRISMARINE_CRYSTALS, 4);
        aqua_affinity_map.put(Items.HEART_OF_THE_SEA, 1);
        aqua_affinity_map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.AQUA_AFFINITY_RUNE.get(), aqua_affinity_map, RUNE_BASE_ITEM, recipeOutput);

        // BANE OF ARTHOPODS
        Map<ItemLike, Integer> map = new HashMap<>();
        map.put(Items.FERMENTED_SPIDER_EYE, 1);
        map.put(Items.SPIDER_EYE, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.BANE_OF_ARTHOPODS_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);

        // BLAST_PROTECTION_RUNE
        map = new HashMap<>();
        map.put(Items.OBSIDIAN, 1);
        map.put(Items.IRON_INGOT, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.BLAST_PROTECTION_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);

        // BREACH_RUNE
        map = new HashMap<>();
        map.put(Items.IRON_BLOCK, 1);
        map.put(Items.NETHERITE_SCRAP, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.BREACH_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // CHANNELING_RUNE
        map = new HashMap<>();
        map.put(Items.LIGHTNING_ROD, 1);
        map.put(Items.COPPER_BLOCK, 7);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.CHANNELING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // BINDING_CURSE_RUNE
        map = new HashMap<>();
        map.put(Items.CHAIN, 8);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.BINDING_CURSE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // VANISHING_CURSE_RUNE
        map = new HashMap<>();
        map.put(Items.PHANTOM_MEMBRANE, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.VANISHING_CURSE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // DENSITY_RUNE
        map = new HashMap<>();
        map.put(Items.IRON_BLOCK, 1);
        map.put(Items.ANVIL, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.DENSITY_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // DEPTH_STRIDER_RUNE
        map = new HashMap<>();
        map.put(Items.PRISMARINE_SHARD, 3);
        map.put(Items.SEAGRASS, 3);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.DEPTH_STRIDER_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // EFFICIENCY_RUNE
        map = new HashMap<>();
        map.put(Items.DIAMOND, 2);
        map.put(Items.ENDER_EYE, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.EFFICIENCY_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FEATHER_FALLING_RUNE
        map = new HashMap<>();
        map.put(Items.FEATHER, 6);
        map.put(Items.PHANTOM_MEMBRANE, 1);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FEATHER_FALLING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FIRE_ASPECT_RUNE
        map = new HashMap<>();
        map.put(Items.BLAZE_POWDER, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FIRE_ASPECT_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FIRE_PROTECTION_RUNE
        map = new HashMap<>();
        map.put(Items.OBSIDIAN, 1);
        map.put(Items.MAGMA_CREAM, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FIRE_PROTECTION_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FLAME_RUNE
        map = new HashMap<>();
        map.put(Items.BLAZE_POWDER, 8);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FLAME_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FORTUNE_RUNE
        map = new HashMap<>();
        map.put(Items.EMERALD, 3);
        map.put(Items.LAPIS_BLOCK, 3);
        map.put(Items.EXPERIENCE_BOTTLE, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FORTUNE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // FROST_WALKER_RUNE
        map = new HashMap<>();
        map.put(Items.BLUE_ICE, 3);
        map.put(Items.SNOWBALL, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.FROST_WALKER_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // IMPALING_RUNE
        map = new HashMap<>();
        map.put(Items.PRISMARINE_SHARD, 3);
        map.put(Items.PRISMARINE_CRYSTALS, 3);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.IMPALING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // INFINITY_RUNE
        map = new HashMap<>();
        map.put(Items.ECHO_SHARD, 1);
        map.put(Items.TORCHFLOWER_SEEDS, 3);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.INFINITY_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // KNOCKBACK_RUNE
        map = new HashMap<>();
        map.put(Items.WIND_CHARGE, 8);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.KNOCKBACK_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // LOOTING_RUNE
        map = new HashMap<>();
        map.put(Items.ECHO_SHARD, 1);
        map.put(Items.TORCHFLOWER_SEEDS, 1);
        map.put(Items.AMETHYST_SHARD, 6);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.LOOTING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // LOYALTY_RUNE
        map = new HashMap<>();
        map.put(Items.GHAST_TEAR, 1);
        map.put(Items.PRISMARINE_SHARD, 3);
        map.put(Items.STRING, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.LOYALTY_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // LUCK_OF_THE_SEA_RUNE
        map = new HashMap<>();
        map.put(Items.SWEET_BERRIES, 4);
        map.put(Items.AMETHYST_SHARD, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.LUCK_OF_THE_SEA_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // LURE_RUNE
        map = new HashMap<>();
        map.put(Items.SWEET_BERRIES, 2);
        map.put(Items.KELP, 2);
        map.put(Items.BEETROOT, 2);
        map.put(Items.HONEY_BOTTLE, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.LURE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // MENDING_RUNE
        map = new HashMap<>();
        map.put(Items.ECHO_SHARD, 1);
        map.put(Items.GLOW_INK_SAC, 2);
        map.put(Items.SCULK, 4);
        map.put(Items.END_CRYSTAL, 1);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.MENDING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // MULTISHOT_RUNE
        map = new HashMap<>();
        map.put(Items.AMETHYST_SHARD, 3);
        map.put(Items.FEATHER, 3);
        map.put(Items.ARMADILLO_SCUTE, 1);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.MULTISHOT_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // PIERCING_RUNE
        map = new HashMap<>();
        map.put(Items.ARMADILLO_SCUTE, 1);
        map.put(Items.FLINT, 7);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.PIERCING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // POWER_RUNE
        map = new HashMap<>();
        map.put(Items.ARMADILLO_SCUTE, 1);
        map.put(Items.IRON_INGOT, 7);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.POWER_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // PROJECTILE_PROTECTION_RUNE
        map = new HashMap<>();
        map.put(Items.OBSIDIAN, 1);
        map.put(Items.ARMADILLO_SCUTE, 7);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.PROJECTILE_PROTECTION_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // PROTECTION_RUNE
        map = new HashMap<>();
        map.put(Items.NETHERITE_SCRAP, 1);
        map.put(Items.ARMADILLO_SCUTE, 2);
        map.put(Items.MAGMA_CREAM, 2);
        map.put(Items.TURTLE_SCUTE, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.PROTECTION_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // PUNCH_RUNE
        map = new HashMap<>();
        map.put(Items.WIND_CHARGE, 7);
        map.put(Items.FLINT, 1);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.PUNCH_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // QUICK_CHARGE_RUNE
        map = new HashMap<>();
        map.put(Items.SUGAR, 6);
        map.put(Items.ARMADILLO_SCUTE, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.QUICK_CHARGE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // RESPIRATION_RUNE
        map = new HashMap<>();
        map.put(Items.NAUTILUS_SHELL, 2);
        map.put(Items.TURTLE_SCUTE, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.RESPIRATION_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // RIPTIDE_RUNE
        map = new HashMap<>();
        map.put(Items.WIND_CHARGE, 3);
        map.put(Items.NAUTILUS_SHELL, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.RIPTIDE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SHARPNESS_RUNE
        map = new HashMap<>();
        map.put(Items.QUARTZ_BLOCK, 4);
        map.put(Items.DIAMOND, 1);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SHARPNESS_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SILK_TOUCH_RUNE
        map = new HashMap<>();
        map.put(Items.SLIME_BALL, 4);
        map.put(Items.HONEYCOMB, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SILK_TOUCH_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SMITE_RUNE
        map = new HashMap<>();
        map.put(Items.GOLD_BLOCK, 1);
        map.put(Items.GLISTERING_MELON_SLICE, 3);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SMITE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SOUL_SPEED_RUNE
        map = new HashMap<>();
        map.put(Items.SOUL_LANTERN, 2);
        map.put(Items.GHAST_TEAR, 2);
        map.put(Items.PACKED_ICE, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SOUL_SPEED_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SWEEPING_EDGE_RUNE
        map = new HashMap<>();
        map.put(Items.BREEZE_ROD, 2);
        map.put(Items.COPPER_INGOT, 6);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SWEEPING_EDGE_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // SWIFT_SNEAK_RUNE
        map = new HashMap<>();
        map.put(Items.POPPED_CHORUS_FRUIT, 3);
        map.put(Items.BLUE_ICE, 3);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.SWIFT_SNEAK_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // THORNS_RUNE
        map = new HashMap<>();
        map.put(Items.BONE, 4);
        map.put(Items.IRON_INGOT, 4);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.THORNS_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // UNBREAKING_RUNE
        map = new HashMap<>();
        map.put(Items.GLOW_LICHEN, 2);
        map.put(Items.KELP, 2);
        map.put(Items.MOSS_BLOCK, 2);
        map.put(Items.LEATHER, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.UNBREAKING_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //
        // WIND_BURST_RUNE
        map = new HashMap<>();
        map.put(Items.BREEZE_ROD, 4);
        map.put(Items.ENDER_PEARL, 2);
        map.put(Items.PITCHER_POD, 2);
        map.put(RUNE_BASE_ITEM, 1);
        runeRecipeBuilder(ItemRegister.WIND_BURST_RUNE.get(), map, RUNE_BASE_ITEM, recipeOutput);
        //

    }

    private void runeRecipeBuilder(Item result, Map<ItemLike, Integer> ingredients, Item unlockedBy, RecipeOutput recipeOutput) {
        var builder = ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result);
        ingredients.forEach((item, integer) -> {builder.requires(item, integer);});
        builder.unlockedBy(getHasName(unlockedBy), has(unlockedBy)).save(recipeOutput);
    }

    private void baseBookRecipeBuilder(Item rune, ResourceKey<Enchantment> enchantment, String id, RecipeOutput recipeOutput) {
        // Cant figure out how to do the enchantment because you need the instance, which is null during Datagen
        // -> need to add these recipes manually
        ItemStack resultItem = EnchantedBookItem.createForEnchantment(new EnchantmentInstance(Minecraft.getInstance().level.registryAccess().registryOrThrow(Registries.ENCHANTMENT).getHolder(enchantment).get(), 1));

        CustomSmithingTransformRecipeBuilder.smithing(Ingredient.of(Items.BOOK),
                Ingredient.of(ItemRegister.ENCHANTED_PAGES.get()),
                Ingredient.of(rune),
                RecipeCategory.MISC, resultItem).save(recipeOutput, "pages_to_" + id);
    }
}

