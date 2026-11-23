package com.vexamoonlight.god_tier_equipment.item;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.network.chat.Component;

import java.util.UUID;
import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class ScarletiteSwordItem extends PickaxeItem {
	public ScarletiteSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 127998f;
			}

			public int getLevel() {
				return 4;
			}

			public int getEnchantmentValue() {
				return 99999;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}
		}, 1, -2.4f, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	}

	private static final UUID UUID_0 = UUID.fromString("2ac596f5-da22-3567-9d65-6c65567df27b");
	private static final UUID UUID_1 = UUID.fromString("038d18af-8112-3a58-9383-4f994cae5781");
	private static final UUID UUID_2 = UUID.fromString("7b2ee6fe-ab9b-396f-a483-5b9aaf3a31b5");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(ForgeMod.ENTITY_REACH.get(), new AttributeModifier(UUID_0, "Tool modifier", 3, AttributeModifier.Operation.ADDITION));
			builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(UUID_1, "Tool modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
			builder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(UUID_2, "Tool modifier", 20, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.god_tier_equipment.scarletite_sword.description_0"));
		list.add(Component.translatable("item.god_tier_equipment.scarletite_sword.description_1"));
	}
}