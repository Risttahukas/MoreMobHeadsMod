package net.risttahukas.moremobheads.enchantment;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.enchantment.EnchantmentHelper;

public class ModEnchantmentHelper {
    public static int getMobBeheading(LivingEntity livingEntity) {
        return EnchantmentHelper.getEnchantmentLevel(ModEnchantments.BEHEADING.get(), livingEntity);
    }
}
