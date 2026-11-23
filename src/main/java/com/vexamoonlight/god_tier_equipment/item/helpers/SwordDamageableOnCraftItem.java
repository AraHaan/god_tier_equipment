package com.vexamoonlight.god_tier_equipment.item.helpers;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;

public class SwordDamageableOnCraftItem extends SwordItem
{
    public SwordDamageableOnCraftItem(Tier tier, int p_43270_, float p_43271_, Item.Properties properties) {
        super(tier, p_43270_, p_43271_, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        // Copy the original stack, preserving its components.
        ItemStack retval = itemstack.copy();

        // Crafting consumes one item, so return one remainder.
        retval.setCount(1);

        // Damage the copied item.
        retval.setDamageValue(itemstack.getDamageValue() + 1);

        // Do not return an item that has broken.
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return ItemStack.EMPTY;
        }

        return retval;
    }

    @Override
    public boolean isRepairable(ItemStack itemstack) {
        return false;
    }
}
