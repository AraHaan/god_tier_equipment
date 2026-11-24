package com.vexamoonlight.god_tier_equipment.item.helpers;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;

public class DamageableOnCraftItem extends Item
{
    public DamageableOnCraftItem(Properties properties) {
        super(properties);
    }

    @Override
    public ItemStackTemplate getCraftingRemainder(ItemInstance itemInstance) {
        // Create a copy of the original stack, preserving its data components.
        ItemStack retval;
        if (itemInstance instanceof ItemStack stack) {
            retval = stack.copy();
        } else if (itemInstance instanceof ItemStackTemplate template) {
            retval = template.create();
        } else {
            return null;
        }

        // Crafting consumes one item, so return one remainder.
        retval.setCount(1);

        // Damage the copied item.
        retval.setDamageValue(itemInstance.getOrDefault(DataComponents.DAMAGE, 0) + 1);

        // Do not return an item that has broken.
        if (retval.getDamageValue() >= retval.getMaxDamage()) {
            return null;
        }

        return ItemStackTemplate.fromNonEmptyStack(retval);
    }
}
