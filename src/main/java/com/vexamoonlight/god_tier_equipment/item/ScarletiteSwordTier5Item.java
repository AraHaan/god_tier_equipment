package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.SwordDamageableOnCraftItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;

import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public class ScarletiteSwordTier5Item extends SwordDamageableOnCraftItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 1561;
		}

		@Override
		public float getSpeed() {
			return 4f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_DIAMOND_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 10;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of();
		}
	};

	public ScarletiteSwordTier5Item() {
		super(TOOL_TIER,
				new Item.Properties()
						.attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 99998, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
								.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND).add(Attributes.ENTITY_INTERACTION_RANGE,
										new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_sword_tier_5_0"), 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
								.build())
						.rarity(Rarity.EPIC).fireResistant());
	}
}