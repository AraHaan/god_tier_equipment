package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStackTemplate;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemInstance;
import net.minecraft.world.item.Item;
import net.minecraft.core.component.DataComponents;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public class ScarletiteSwordBladeItem extends DamageableOnCraftItem {
	public ScarletiteSwordBladeItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).durability(127).fireResistant().setNoCombineRepair());
	}
}