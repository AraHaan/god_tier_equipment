package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.component.DataComponents;

import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public class ScarletiteSwordTier5Item extends DamageableOnCraftItem {
	private static final ToolMaterial TOOL_MATERIAL = new ToolMaterial(BlockTags.INCORRECT_FOR_DIAMOND_TOOL, 1561, 4f, 0, 10, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_sword_tier_5_repair_items")));

	public ScarletiteSwordTier5Item(Item.Properties properties) {
		super(properties.sword(TOOL_MATERIAL, 99998f, -2.4f).rarity(Rarity.EPIC).fireResistant().setNoCombineRepair()
				.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 99998, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_sword_tier_5_0"), 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.build()));
	}
}