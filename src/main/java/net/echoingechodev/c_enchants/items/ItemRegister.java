package net.echoingechodev.c_enchants.items;

import net.echoingechodev.c_enchants.C_Enchants;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.enchantment.Enchantments;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(C_Enchants.MODID);

    public static final DeferredItem<Item> ENCHANTED_PAGES = ITEMS.registerSimpleItem("enchanted_pages", new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> AQUA_AFFINITY_RUNE = ITEMS.registerSimpleItem("aqua_affinity_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> BANE_OF_ARTHOPODS_RUNE = ITEMS.registerSimpleItem("bane_of_arthropods_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> BLAST_PROTECTION_RUNE = ITEMS.registerSimpleItem("blast_protection_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> BREACH_RUNE = ITEMS.registerSimpleItem("breach_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> CHANNELING_RUNE = ITEMS.registerSimpleItem("channeling_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> BINDING_CURSE_RUNE = ITEMS.registerSimpleItem("binding_curse_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> VANISHING_CURSE_RUNE = ITEMS.registerSimpleItem("vanishing_curse_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> DENSITY_RUNE = ITEMS.registerSimpleItem("density_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> DEPTH_STRIDER_RUNE = ITEMS.registerSimpleItem("depth_strider_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> EFFICIENCY_RUNE = ITEMS.registerSimpleItem("efficiency_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FEATHER_FALLING_RUNE = ITEMS.registerSimpleItem("feather_falling_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FIRE_ASPECT_RUNE = ITEMS.registerSimpleItem("fire_aspect_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FIRE_PROTECTION_RUNE = ITEMS.registerSimpleItem("fire_protection_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FLAME_RUNE = ITEMS.registerSimpleItem("flame_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FORTUNE_RUNE = ITEMS.registerSimpleItem("fortune_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> FROST_WALKER_RUNE = ITEMS.registerSimpleItem("frost_walker_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> IMPALING_RUNE = ITEMS.registerSimpleItem("impaling_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> INFINITY_RUNE = ITEMS.registerSimpleItem("infinity_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> KNOCKBACK_RUNE = ITEMS.registerSimpleItem("knockback_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> LOOTING_RUNE = ITEMS.registerSimpleItem("looting_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> LOYALTY_RUNE = ITEMS.registerSimpleItem("loyalty_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> LUCK_OF_THE_SEA_RUNE = ITEMS.registerSimpleItem("luck_of_the_sea_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> LURE_RUNE = ITEMS.registerSimpleItem("lure_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> MENDING_RUNE = ITEMS.registerSimpleItem("mending_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> MULTISHOT_RUNE = ITEMS.registerSimpleItem("multishot_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> PIERCING_RUNE = ITEMS.registerSimpleItem("piercing_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> POWER_RUNE = ITEMS.registerSimpleItem("power_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> PROJECTILE_PROTECTION_RUNE = ITEMS.registerSimpleItem("projectile_protection_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> PROTECTION_RUNE = ITEMS.registerSimpleItem("protection_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> PUNCH_RUNE = ITEMS.registerSimpleItem("punch_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> QUICK_CHARGE_RUNE = ITEMS.registerSimpleItem("quick_charge_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> RESPIRATION_RUNE = ITEMS.registerSimpleItem("respiration_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> RIPTIDE_RUNE = ITEMS.registerSimpleItem("riptide_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SHARPNESS_RUNE = ITEMS.registerSimpleItem("sharpness_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SILK_TOUCH_RUNE = ITEMS.registerSimpleItem("silk_touch_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SMITE_RUNE = ITEMS.registerSimpleItem("smite_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SOUL_SPEED_RUNE = ITEMS.registerSimpleItem("soul_speed_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SWEEPING_EDGE_RUNE = ITEMS.registerSimpleItem("sweeping_edge_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> SWIFT_SNEAK_RUNE = ITEMS.registerSimpleItem("swift_sneak_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> THORNS_RUNE = ITEMS.registerSimpleItem("thorns_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> UNBREAKING_RUNE = ITEMS.registerSimpleItem("unbreaking_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));
    public static final DeferredItem<Item> WIND_BURST_RUNE = ITEMS.registerSimpleItem("wind_burst_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
