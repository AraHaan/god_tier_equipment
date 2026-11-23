package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.SwordDamageableOnCraftItem;
import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;

import java.util.UUID;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class ScarletiteSwordTier6Item extends SwordDamageableOnCraftItem {
	public ScarletiteSwordTier6Item() {
		super(new Tier() {
			public int getUses() {
				return 2031;
			}

			public float getSpeed() {
				return 9f;
			}

			public float getAttackDamageBonus() {
				return 109995f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 15;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 3, -2.4f, new Item.Properties().rarity(Rarity.EPIC).fireResistant().setNoRepair());
	}

	private static final UUID UUID_0 = UUID.fromString("a89766d7-2bae-3501-a2b9-f1ea455e15bd");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(UUID_0, "Tool modifier", 3, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}
}