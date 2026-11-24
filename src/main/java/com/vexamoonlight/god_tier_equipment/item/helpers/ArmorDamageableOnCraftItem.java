package com.vexamoonlight.god_tier_equipment.item.helpers;

import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ArmorDamageableOnCraftItem extends ArmorItem
{
    public ArmorDamageableOnCraftItem(Holder<ArmorMaterial> material, Type type, Item.Properties properties) {
        super(material, type, properties);
    }

    @Override
    public boolean hasCraftingRemainingItem(ItemStack stack) {
        return true;
    }

    @Override
    public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
        // we got to copy the item to ensure any enchantments,
        // etc. remain on it.
        ItemStack retval = itemstack.copy();
        retval.setDamageValue(itemstack.getDamageValue() + 1);
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
