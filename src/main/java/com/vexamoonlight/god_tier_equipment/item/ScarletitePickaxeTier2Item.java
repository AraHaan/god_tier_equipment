package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.*;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public class ScarletitePickaxeTier2Item extends DamageableOnCraftItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_STONE_TOOL, 131, 4f, 0, 5, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_pickaxe_tier_2_repair_items")));

	public ScarletitePickaxeTier2Item(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 2f, -2.8f).rarity(Rarity.EPIC).setNoCombineRepair());
	}
}