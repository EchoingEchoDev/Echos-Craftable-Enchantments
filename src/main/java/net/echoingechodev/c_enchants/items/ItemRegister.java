package net.echoingechodev.c_enchants.items;

import net.echoingechodev.c_enchants.C_Enchants;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegister {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(C_Enchants.MODID);

    public static final DeferredItem<Item> ENCHANTED_PAGES = ITEMS.registerSimpleItem("enchanted_pages", new Item.Properties().stacksTo(16));

    public static final DeferredItem<Item> AQUA_AFFINITY_RUNE = ITEMS.registerSimpleItem("aqua_affinity_rune", new Item.Properties().rarity(Rarity.UNCOMMON).stacksTo(16));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
