package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SomeMoreBullshitChunkItem extends Item {
	public SomeMoreBullshitChunkItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).fireResistant());
	}
}