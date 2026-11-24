package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SomeBullshitChunkItem extends Item {
	public SomeBullshitChunkItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC));
	}
}