package net.echoingechodev.c_enchants.datagen;

import net.echoingechodev.c_enchants.C_Enchants;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockstateProvider extends BlockStateProvider {
    public ModBlockstateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, C_Enchants.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        //blockWithItem(ModBlocks.TEST_EXPLOSIVE);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
