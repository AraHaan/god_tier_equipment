package com.vexamoonlight.god_tier_equipment.item;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import java.util.List;
import java.util.EnumMap;

import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

@EventBusSubscriber
public abstract class ScarletiteArmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 0);
				map.put(ArmorItem.Type.LEGGINGS, 0);
				map.put(ArmorItem.Type.CHESTPLATE, 0);
				map.put(ArmorItem.Type.HELMET, 0);
				map.put(ArmorItem.Type.BODY, 0);
			}), 99999, DeferredHolder.create(Registries.SOUND_EVENT, ResourceLocation.parse("item.armor.equip_generic")), () -> Ingredient.of(), List.of(new ArmorMaterial.Layer(ResourceLocation.parse("god_tier_equipment:scarletite"))), 0f, 0f);
			registerHelper.register(ResourceLocation.parse("god_tier_equipment:scarletite_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public ScarletiteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends ScarletiteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(0)).fireResistant().rarity(Rarity.EPIC).attributes(ItemAttributeModifiers.builder()
					.add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.withDefaultNamespace("armor.helmet"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
					.add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.helmet"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
					.add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.helmet"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.HEAD)
					.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.helmet"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD)
					.add(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_3.helmet"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.HEAD)
					.add(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_4.helmet"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.HEAD).build()));
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_helmet.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends ScarletiteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(0)).fireResistant().rarity(Rarity.EPIC).attributes(ItemAttributeModifiers.builder()
					.add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.withDefaultNamespace("armor.chestplate"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.chestplate"), 1.6, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.chestplate"), 0.06, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
							EquipmentSlotGroup.CHEST)
					.add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.chestplate"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST)
					.add(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_3.chestplate"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE),
							EquipmentSlotGroup.CHEST)
					.add(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_4.chestplate"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.CHEST).build()));
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_chestplate.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends ScarletiteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(0)).fireResistant().rarity(Rarity.EPIC)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.withDefaultNamespace("armor.leggings"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.LUCK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.leggings"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.add(Attributes.LUCK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.leggings"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.LEGS)
							.add(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.leggings"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.LEGS)
							.build()));
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_leggings.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends ScarletiteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(0)).fireResistant().rarity(Rarity.EPIC)
					.attributes(ItemAttributeModifiers.builder().add(Attributes.ARMOR, new AttributeModifier(ResourceLocation.withDefaultNamespace("armor.boots"), 0, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.LUCK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_0.boots"), 1024, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.add(Attributes.LUCK, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_1.boots"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.FEET)
							.add(Attributes.MAX_HEALTH, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_armor_2.boots"), 150, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.FEET)
							.build()));
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_boots.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}
}