package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.*;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public class ScarletitePickaxeTier3Item extends DamageableOnCraftItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_IRON_TOOL, 250, 6f, 0, 14, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_pickaxe_tier_3_repair_items")));

	public ScarletitePickaxeTier3Item(Item.Properties properties) {
		super(properties.pickaxe(TOOL_MATERIAL, 3f, -2.8f).rarity(Rarity.EPIC).setNoCombineRepair());
	}
}