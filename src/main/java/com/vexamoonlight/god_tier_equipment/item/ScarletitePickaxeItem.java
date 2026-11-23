package com.vexamoonlight.god_tier_equipment.item;

import net.minecraftforge.common.ForgeMod;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.network.chat.Component;

import java.util.UUID;
import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public class ScarletitePickaxeItem extends PickaxeItem {
	public ScarletitePickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 30f;
			}

			public float getAttackDamageBonus() {
				return 9997f;
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
		}, 1, -2.8f, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	}

	private static final UUID UUID_0 = UUID.fromString("cdef19a3-395f-3514-ba68-c9e9c0c5cf5d");

	@Override
	public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
		if (equipmentSlot == EquipmentSlot.MAINHAND) {
			ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
			builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
			builder.put(ForgeMod.BLOCK_REACH.get(), new AttributeModifier(UUID_0, "Tool modifier", 10, AttributeModifier.Operation.ADDITION));
			return builder.build();
		}
		return super.getAttributeModifiers(equipmentSlot, stack);
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, level, list, flag);
		list.add(Component.translatable("item.god_tier_equipment.scarletite_pickaxe.description_0"));
		list.add(Component.translatable("item.god_tier_equipment.scarletite_pickaxe.description_1"));
	}
}