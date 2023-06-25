package net.risttahukas.moremobheads.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.AbstractSkullBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.block.ModBlocks;

import java.util.Iterator;

public class ModBlockStateProvider extends BlockStateProvider {
    private static final ResourceLocation skullModelLocation = new ResourceLocation("minecraft", "block/skull");
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreMobHeadsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        Iterator<RegistryObject<Block>> iterator = ModBlocks.BLOCKS.getEntries().stream().iterator();
        while (iterator.hasNext()) {
            RegistryObject<Block> block = iterator.next();
            if (block.get() instanceof AbstractSkullBlock) {
                skull(block);
            }
        }
    }

    public void skull(RegistryObject<Block> block) {
        simpleBlock(block.get(), models().getExistingFile(skullModelLocation));
    }
}
