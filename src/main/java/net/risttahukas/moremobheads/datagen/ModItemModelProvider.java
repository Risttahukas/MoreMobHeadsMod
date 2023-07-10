package net.risttahukas.moremobheads.datagen;

import net.minecraft.data.PackOutput;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;
import net.risttahukas.moremobheads.MoreMobHeadsMod;
import net.risttahukas.moremobheads.item.EffectSkullItem;
import net.risttahukas.moremobheads.item.ModItems;

import java.util.Iterator;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MoreMobHeadsMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        Iterator<RegistryObject<Item>> iterator = ModItems.ITEMS.getEntries().stream().iterator();
        while (iterator.hasNext()) {
            RegistryObject<Item> item = iterator.next();
            if (item.get() instanceof EffectSkullItem) {
                skull(item);
            }
        }
    }

    public ItemModelBuilder skull(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(), "item/template_skull");
    }
}
