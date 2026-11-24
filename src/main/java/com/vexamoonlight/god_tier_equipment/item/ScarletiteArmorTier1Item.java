package com.vexamoonlight.god_tier_equipment.item;

import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.equipment.EquipmentAssets;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import java.util.Map;
import com.vexamoonlight.god_tier_equipment.item.helpers.DamageableOnCraftItem;

public abstract class ScarletiteArmorTier1Item extends DamageableOnCraftItem {
	public static ArmorMaterial ARMOR_MATERIAL = new ArmorMaterial(9, Map.of(ArmorType.BOOTS, 2, ArmorType.LEGGINGS, 5, ArmorType.CHESTPLATE, 6, ArmorType.HELMET, 2, ArmorType.BODY, 6), 15,
			DeferredHolder.create(Registries.SOUND_EVENT, Identifier.parse("item.armor.equip_generic")), 0f, 0f, TagKey.create(Registries.ITEM, Identifier.parse("god_tier_equipment:scarletite_armor_tier_1_repair_items")),
			ResourceKey.create(EquipmentAssets.ROOT_ID, Identifier.parse("god_tier_equipment:scarletite_armor_tier_1")));

	private ScarletiteArmorTier1Item(Item.Properties properties) {
		super(properties);
	}

	public static class Helmet extends ScarletiteArmorTier1Item {
		public Helmet(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.HELMET));
		}
	}

	public static class Chestplate extends ScarletiteArmorTier1Item {
		public Chestplate(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.CHESTPLATE));
		}
	}

	public static class Leggings extends ScarletiteArmorTier1Item {
		public Leggings(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.LEGGINGS));
		}
	}

	public static class Boots extends ScarletiteArmorTier1Item {
		public Boots(Item.Properties properties) {
			super(properties.rarity(Rarity.EPIC).humanoidArmor(ARMOR_MATERIAL, ArmorType.BOOTS));
		}
	}
}