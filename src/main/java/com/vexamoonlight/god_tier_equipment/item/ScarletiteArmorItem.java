package com.vexamoonlight.god_tier_equipment.item;

import net.minecraft.Util;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import java.util.EnumMap;
import java.util.UUID;
import java.util.List;

import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap;

public abstract class ScarletiteArmorItem extends ArmorItem {
	private static final EnumMap<Type, UUID> ARMOR_MODIFIER_UUID_PER_TYPE = Util.make(new EnumMap<>(Type.class), (typeUUIDEnumMap) -> {
		typeUUIDEnumMap.put(Type.BOOTS, UUID.fromString("845DB27C-C624-495F-8C9F-6020A9A58B6B"));
		typeUUIDEnumMap.put(Type.LEGGINGS, UUID.fromString("D8499B04-0E66-4726-AB29-64469D734E0D"));
		typeUUIDEnumMap.put(Type.CHESTPLATE, UUID.fromString("9F3D476D-C118-4544-8365-64846904B48E"));
		typeUUIDEnumMap.put(Type.HELMET, UUID.fromString("2AD3F246-FEE1-4E67-B886-69FD380BB150"));
    });

    public ScarletiteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 0;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{0, 0, 0, 0}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 99999;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_generic"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "scarletite_armor";
			}

			@Override
			public float getToughness() {
				return 0f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0f;
			}
		}, type, properties);
	}

	public static class Helmet extends ScarletiteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		private static final UUID UUID_0 = UUID.fromString("cb88e5ae-d0a9-303d-9f3c-85ea34ae7fe3");
		private static final UUID UUID_1 = UUID.fromString("cb2f16cb-1591-3b0a-9347-369d520182b3");
		private static final UUID UUID_2 = UUID.fromString("f5f7d6b8-c00a-322f-9b18-1edc1a2803d9");
		private static final UUID UUID_3 = UUID.fromString("d9a84133-49ff-3bf2-9a33-681521d5345e");
		private static final UUID UUID_4 = UUID.fromString("1f038447-9e1d-3538-b0d7-e0b1e7e30c79");

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
			if (equipmentSlot == EquipmentSlot.HEAD) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
				builder.put(Attributes.ARMOR, new AttributeModifier(ARMOR_MODIFIER_UUID_PER_TYPE.get(ArmorItem.Type.HELMET), "Armor modifier", 0, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ARMOR, new AttributeModifier(UUID_0, "Armor modifier", 1024, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ARMOR, new AttributeModifier(UUID_1, "Armor modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(UUID_2, "Armor modifier", 1024, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ARMOR_TOUGHNESS, new AttributeModifier(UUID_3, "Armor modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.MAX_HEALTH, new AttributeModifier(UUID_4, "Armor modifier", 150, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot, stack);
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/scarletite_layer_1.png";
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_helmet.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Chestplate extends ScarletiteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		private static final UUID UUID_0 = UUID.fromString("6f2c8976-3463-3c7d-90d0-0bb998bab4be");
		private static final UUID UUID_1 = UUID.fromString("dfa43556-4a57-38e8-89f3-a39871e6f49e");
		private static final UUID UUID_2 = UUID.fromString("43848461-ef08-3f13-b9c6-2e5a04440bc3");
		private static final UUID UUID_3 = UUID.fromString("79f51f4b-f00a-3f3b-b197-1707b4c359f1");
		private static final UUID UUID_4 = UUID.fromString("53048dd8-2f1e-3556-8d7a-dca96cd6765a");

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
			if (equipmentSlot == EquipmentSlot.CHEST) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
				builder.put(Attributes.ARMOR, new AttributeModifier(ARMOR_MODIFIER_UUID_PER_TYPE.get(ArmorItem.Type.CHESTPLATE), "Armor modifier", 0, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(UUID_0, "Armor modifier", 1.6, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.ATTACK_KNOCKBACK, new AttributeModifier(UUID_1, "Armor modifier", 0.06, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(UUID_2, "Armor modifier", 1024, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.KNOCKBACK_RESISTANCE, new AttributeModifier(UUID_3, "Armor modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.MAX_HEALTH, new AttributeModifier(UUID_4, "Armor modifier", 150, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot, stack);
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/scarletite_layer_1.png";
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_chestplate.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Leggings extends ScarletiteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		private static final UUID UUID_0 = UUID.fromString("e05b51a2-b30c-3c00-99e8-e16257d1b337");
		private static final UUID UUID_1 = UUID.fromString("a56500d3-8d95-3269-8ade-4949293a3f5a");
		private static final UUID UUID_2 = UUID.fromString("0682f503-8b23-31bf-860d-d6a94e05bb80");

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
			if (equipmentSlot == EquipmentSlot.LEGS) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
				builder.put(Attributes.ARMOR, new AttributeModifier(ARMOR_MODIFIER_UUID_PER_TYPE.get(ArmorItem.Type.LEGGINGS), "Armor modifier", 0, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.LUCK, new AttributeModifier(UUID_0, "Armor modifier", 1024, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.LUCK, new AttributeModifier(UUID_1, "Armor modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.MAX_HEALTH, new AttributeModifier(UUID_2, "Armor modifier", 150, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot, stack);
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/scarletite_layer_2.png";
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_leggings.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}

	public static class Boots extends ScarletiteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant().rarity(Rarity.EPIC));
		}

		private static final UUID UUID_0 = UUID.fromString("15d03405-f98d-306c-9f77-2d0535dc4a23");
		private static final UUID UUID_1 = UUID.fromString("1a49b3ae-2c59-3cb8-b2d2-2d17d9e20de4");
		private static final UUID UUID_2 = UUID.fromString("42ddfc96-1873-303c-b148-7bffa752f9d7");

		@Override
		public Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot equipmentSlot, ItemStack stack) {
			if (equipmentSlot == EquipmentSlot.FEET) {
				ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
				builder.putAll(super.getAttributeModifiers(equipmentSlot, stack));
				builder.put(Attributes.ARMOR, new AttributeModifier(ARMOR_MODIFIER_UUID_PER_TYPE.get(ArmorItem.Type.BOOTS), "Armor modifier", 0, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.LUCK, new AttributeModifier(UUID_0, "Armor modifier", 1024, AttributeModifier.Operation.ADDITION));
				builder.put(Attributes.LUCK, new AttributeModifier(UUID_1, "Armor modifier", 1024, AttributeModifier.Operation.MULTIPLY_BASE));
				builder.put(Attributes.MAX_HEALTH, new AttributeModifier(UUID_2, "Armor modifier", 150, AttributeModifier.Operation.ADDITION));
				return builder.build();
			}
			return super.getAttributeModifiers(equipmentSlot, stack);
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/scarletite_layer_1.png";
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Level level, List<Component> list, TooltipFlag flag) {
			super.appendHoverText(itemstack, level, list, flag);
			list.add(Component.translatable("item.god_tier_equipment.scarletite_armor_boots.description_0"));
		}

		@Override
		public boolean makesPiglinsNeutral(ItemStack itemstack, LivingEntity entity) {
			return true;
		}
	}
}