package com.vexamoonlight.god_tier_equipment.item;

import com.vexamoonlight.god_tier_equipment.item.helpers.ArmorDamageableOnCraftItem;
import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public abstract class ScarletiteArmorTier2Item extends ArmorDamageableOnCraftItem {
	public ScarletiteArmorTier2Item(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 12;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{2, 5, 6, 2}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 12;
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
				return "scarletite_armor_tier_2";
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

	public static class Helmet extends ScarletiteArmorTier2Item {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/stone_layer_1.png";
		}
	}

	public static class Chestplate extends ScarletiteArmorTier2Item {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/stone_layer_1.png";
		}
	}

	public static class Leggings extends ScarletiteArmorTier2Item {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/stone_layer_2.png";
		}
	}

	public static class Boots extends ScarletiteArmorTier2Item {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().rarity(Rarity.EPIC));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "god_tier_equipment:textures/models/armor/stone_layer_1.png";
		}
	}
}