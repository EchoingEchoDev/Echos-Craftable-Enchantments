package net.echoingechodev.c_enchants.datagen;

import net.echoingechodev.c_enchants.C_Enchants;
import net.echoingechodev.c_enchants.items.ItemRegister;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, C_Enchants.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(ItemRegister.ENCHANTED_PAGES.get());
        basicItem(ItemRegister.AQUA_AFFINITY_RUNE.get());
    }
}
