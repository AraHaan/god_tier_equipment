package com.vexamoonlight.god_tier_equipment.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import java.util.function.Consumer;
import java.util.Map;

import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public abstract class ScarletiteArmorItem extends Item {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(0, Map.of(ArmorType.BOOTS, 0, ArmorType.LEGGINGS, 0, ArmorType.CHESTPLATE, 0, ArmorType.HELMET, 0, ArmorType.BODY, 0), 99999,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_generic")), 0f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_armor_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("god_tier_equipment:scarletite_armor")));

	private ScarletiteArmorItem(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends ScarletiteArmorItem {
		public Helmet(Item.Properties properties) {
			super(properties.fireResistant().rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.helmet"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
							.add(Attributes.ARMOR, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.helmet"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
							.add(Attributes.ARMOR, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.helmet"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.HEAD)
							.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.helmet"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
							.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_3.helmet"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
									EquipmentSlotGroup.HEAD)
							.add(Attributes.MAX_HEALTH, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_4.helmet"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.god_tier_equipment.scarletite_armor_helmet.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends ScarletiteArmorItem {
		public Chestplate(Item.Properties properties) {
			super(properties.fireResistant().rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE).attributes(ItemAttributeModifiers.builder()
					.add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.chestplate"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.chestplate"), 1.6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.chestplate"), 0.06, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.CHEST)
					.add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.chestplate"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_3.chestplate"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
							EquipmentSlotGroup.CHEST)
					.add(Attributes.MAX_HEALTH, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_4.chestplate"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST).build()));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.god_tier_equipment.scarletite_armor_chestplate.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends ScarletiteArmorItem {
		public Leggings(Item.Properties properties) {
			super(properties.fireResistant().rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.leggings"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.LUCK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.leggings"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.LUCK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.leggings"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.LEGS)
							.add(Attributes.MAX_HEALTH, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.leggings"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS).build()));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.god_tier_equipment.scarletite_armor_leggings.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends ScarletiteArmorItem {
		public Boots(Item.Properties properties) {
			super(properties.fireResistant().rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(Identifier.withDefaultNamespace("armor.boots"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.LUCK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.boots"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.LUCK, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.boots"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.FEET)
							.add(Attributes.MAX_HEALTH, new AttributeModifier(Identifier.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.boots"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET).build()));
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("item.god_tier_equipment.scarletite_armor_boots.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}
}