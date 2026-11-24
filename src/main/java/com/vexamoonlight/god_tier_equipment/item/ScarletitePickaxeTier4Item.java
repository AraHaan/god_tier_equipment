package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.PickaxeDamageableOnCraftItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.*;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;

public class ScarletitePickaxeTier4Item extends PickaxeDamageableOnCraftItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 32;
		}

		@Override
		public float getSpeed() {
			return 12f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_GOLD_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 22;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of();
		}
	};

	public ScarletitePickaxeTier4Item() {
		super(TOOL_TIER, new Item.Properties().attributes(DiggerItem.createAttributes(TOOL_TIER, 1f, -2.8f)).rarity(Rarity.EPIC));
	}
}