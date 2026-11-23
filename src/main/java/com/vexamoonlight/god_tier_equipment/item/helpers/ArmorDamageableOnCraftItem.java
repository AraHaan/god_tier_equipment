package com.vexamoonlight.god_tier_equipment.item.helpers;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ArmorDamageableOnCraftItem extends ArmorItem
{
    public ArmorDamageableOnCraftItem(ArmorMaterial material, Type type, Item.Properties properties) {
        super(material, type, properties);
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
