package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class ScarletiteSwordBladeItem extends DamageableOnCraftItem {
	public ScarletiteSwordBladeItem() {
		super(new Item.Properties().durability(127).fireResistant().rarity(Rarity.EPIC));
	}
}