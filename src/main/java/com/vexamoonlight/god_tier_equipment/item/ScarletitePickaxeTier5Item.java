package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.*;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public class ScarletitePickaxeTier5Item extends DamageableOnCraftItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 8f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_pickaxe_tier_5_repair_items")));

	public ScarletitePickaxeTier5Item(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 4f, -2.8f).rarity(Rarity.EPIC).setNoCombineRepair());
	}
}