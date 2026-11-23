package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class ScarletiteIngotItem extends Item {
	public ScarletiteIngotItem() {
		super(new Item.Properties().fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public boolean isPiglinCurrency(ItemStack stack) {
		return true;
	}
}