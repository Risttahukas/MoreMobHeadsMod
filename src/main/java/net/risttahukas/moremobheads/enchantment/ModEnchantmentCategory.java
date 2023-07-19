package net.risttahukas.moremobheads.enchantment;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class ModEnchantmentCategory {
    public static final EnchantmentCategory AXE = EnchantmentCategory.create("axe", (item) -> item instanceof AxeItem);
}
