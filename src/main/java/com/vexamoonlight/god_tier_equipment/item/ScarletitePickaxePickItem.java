package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ScarletitePickaxePickItem extends DamageableOnCraftItem {
	public ScarletitePickaxePickItem() {
		super(new Item.Properties().durability(128).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}