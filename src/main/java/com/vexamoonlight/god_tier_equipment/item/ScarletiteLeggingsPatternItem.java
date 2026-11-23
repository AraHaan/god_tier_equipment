package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScarletiteLeggingsPatternItem extends DamageableOnCraftItem {
	public ScarletiteLeggingsPatternItem() {
		super(new Item.Properties().durability(768).fireResistant().rarity(Rarity.EPIC).setNoRepair());
	}
}