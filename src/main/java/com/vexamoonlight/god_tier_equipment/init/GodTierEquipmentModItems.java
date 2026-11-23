/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vexamoonlight.god_tier_equipment.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import com.vexamoonlight.god_tier_equipment.item.*;
import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public class GodTierEquipmentModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, GodTierEquipmentMod.MODID);
	public static final RegistryObject<Item> SCARLETITE_SWORD;
	public static final RegistryObject<Item> SCARLETITE_BLOCK;
	public static final RegistryObject<Item> SCARLETITE_SWORD_HILT;
	public static final RegistryObject<Item> SCARLETITE_SWORD_BLADE;
	public static final RegistryObject<Item> SCARLETITE_INGOT;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_PICK;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_6;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_5;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_1;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_2;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_3;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_4;
	public static final RegistryObject<Item> SCARLETITE_SWORD_TIER_7;
	public static final RegistryObject<Item> SCARLETITE_BOOTS_PATTERN;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_1_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_1_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_1_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_1_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_2_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_2_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_2_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_2_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_3_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_3_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_3_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_3_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_7_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_7_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_7_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_7_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_6_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_6_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_6_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_6_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_5_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_5_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_5_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_5_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_4_HELMET;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_4_CHESTPLATE;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_4_LEGGINGS;
	public static final RegistryObject<Item> SCARLETITE_ARMOR_TIER_4_BOOTS;
	public static final RegistryObject<Item> SCARLETITE_CHESTPLATE_PATTERN;
	public static final RegistryObject<Item> SCARLETITE_LEGGINGS_PATTERN;
	public static final RegistryObject<Item> SCARLETITE_HELMET_PATTERN;
	public static final RegistryObject<Item> SOME_BULLSHIT_CHUNK;
	public static final RegistryObject<Item> SOME_BULLSHIT_BLOCK;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_1;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_2;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_3;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_4;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_5;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_6;
	public static final RegistryObject<Item> SCARLETITE_PICKAXE_TIER_7;
	public static final RegistryObject<Item> APPLE_PLANT;
	public static final RegistryObject<Item> GLASS_BOTTLE_PLANT;
	public static final RegistryObject<Item> GOLDEN_APPLE_PLANT;
	public static final RegistryObject<Item> SOME_MORE_BULLSHIT_BLOCK;
	public static final RegistryObject<Item> SOME_MORE_BULLSHIT_CHUNK;
	public static final RegistryObject<Item> EVEN_MORE_BULLSHIT_CHUNK;
	public static final RegistryObject<Item> EVEN_MORE_BULLSHIT_BLOCK;
	static {
		SCARLETITE_SWORD = REGISTRY.register("scarletite_sword", ScarletiteSwordItem::new);
		SCARLETITE_BLOCK = block(GodTierEquipmentModBlocks.SCARLETITE_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		SCARLETITE_SWORD_HILT = REGISTRY.register("scarletite_sword_hilt", ScarletiteSwordHiltItem::new);
		SCARLETITE_SWORD_BLADE = REGISTRY.register("scarletite_sword_blade", ScarletiteSwordBladeItem::new);
		SCARLETITE_INGOT = REGISTRY.register("scarletite_ingot", ScarletiteIngotItem::new);
		SCARLETITE_ARMOR_HELMET = REGISTRY.register("scarletite_armor_helmet", ScarletiteArmorItem.Helmet::new);
		SCARLETITE_ARMOR_CHESTPLATE = REGISTRY.register("scarletite_armor_chestplate", ScarletiteArmorItem.Chestplate::new);
		SCARLETITE_ARMOR_LEGGINGS = REGISTRY.register("scarletite_armor_leggings", ScarletiteArmorItem.Leggings::new);
		SCARLETITE_ARMOR_BOOTS = REGISTRY.register("scarletite_armor_boots", ScarletiteArmorItem.Boots::new);
		SCARLETITE_PICKAXE = REGISTRY.register("scarletite_pickaxe", ScarletitePickaxeItem::new);
		SCARLETITE_PICKAXE_PICK = REGISTRY.register("scarletite_pickaxe_pick", ScarletitePickaxePickItem::new);
		SCARLETITE_SWORD_TIER_6 = REGISTRY.register("scarletite_sword_tier_6", ScarletiteSwordTier6Item::new);
		SCARLETITE_SWORD_TIER_5 = REGISTRY.register("scarletite_sword_tier_5", ScarletiteSwordTier5Item::new);
		SCARLETITE_SWORD_TIER_1 = REGISTRY.register("scarletite_sword_tier_1", ScarletiteSwordTier1Item::new);
		SCARLETITE_SWORD_TIER_2 = REGISTRY.register("scarletite_sword_tier_2", ScarletiteSwordTier2Item::new);
		SCARLETITE_SWORD_TIER_3 = REGISTRY.register("scarletite_sword_tier_3", ScarletiteSwordTier3Item::new);
		SCARLETITE_SWORD_TIER_4 = REGISTRY.register("scarletite_sword_tier_4", ScarletiteSwordTier4Item::new);
		SCARLETITE_SWORD_TIER_7 = REGISTRY.register("scarletite_sword_tier_7", ScarletiteSwordTier7Item::new);
		SCARLETITE_BOOTS_PATTERN = REGISTRY.register("scarletite_boots_pattern", ScarletiteBootsPatternItem::new);
		SCARLETITE_ARMOR_TIER_1_HELMET = REGISTRY.register("scarletite_armor_tier_1_helmet", ScarletiteArmorTier1Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_1_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_1_chestplate", ScarletiteArmorTier1Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_1_LEGGINGS = REGISTRY.register("scarletite_armor_tier_1_leggings", ScarletiteArmorTier1Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_1_BOOTS = REGISTRY.register("scarletite_armor_tier_1_boots", ScarletiteArmorTier1Item.Boots::new);
		SCARLETITE_ARMOR_TIER_2_HELMET = REGISTRY.register("scarletite_armor_tier_2_helmet", ScarletiteArmorTier2Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_2_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_2_chestplate", ScarletiteArmorTier2Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_2_LEGGINGS = REGISTRY.register("scarletite_armor_tier_2_leggings", ScarletiteArmorTier2Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_2_BOOTS = REGISTRY.register("scarletite_armor_tier_2_boots", ScarletiteArmorTier2Item.Boots::new);
		SCARLETITE_ARMOR_TIER_3_HELMET = REGISTRY.register("scarletite_armor_tier_3_helmet", ScarletiteArmorTier3Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_3_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_3_chestplate", ScarletiteArmorTier3Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_3_LEGGINGS = REGISTRY.register("scarletite_armor_tier_3_leggings", ScarletiteArmorTier3Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_3_BOOTS = REGISTRY.register("scarletite_armor_tier_3_boots", ScarletiteArmorTier3Item.Boots::new);
		SCARLETITE_ARMOR_TIER_7_HELMET = REGISTRY.register("scarletite_armor_tier_7_helmet", ScarletiteArmorTier7Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_7_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_7_chestplate", ScarletiteArmorTier7Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_7_LEGGINGS = REGISTRY.register("scarletite_armor_tier_7_leggings", ScarletiteArmorTier7Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_7_BOOTS = REGISTRY.register("scarletite_armor_tier_7_boots", ScarletiteArmorTier7Item.Boots::new);
		SCARLETITE_ARMOR_TIER_6_HELMET = REGISTRY.register("scarletite_armor_tier_6_helmet", ScarletiteArmorTier6Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_6_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_6_chestplate", ScarletiteArmorTier6Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_6_LEGGINGS = REGISTRY.register("scarletite_armor_tier_6_leggings", ScarletiteArmorTier6Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_6_BOOTS = REGISTRY.register("scarletite_armor_tier_6_boots", ScarletiteArmorTier6Item.Boots::new);
		SCARLETITE_ARMOR_TIER_5_HELMET = REGISTRY.register("scarletite_armor_tier_5_helmet", ScarletiteArmorTier5Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_5_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_5_chestplate", ScarletiteArmorTier5Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_5_LEGGINGS = REGISTRY.register("scarletite_armor_tier_5_leggings", ScarletiteArmorTier5Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_5_BOOTS = REGISTRY.register("scarletite_armor_tier_5_boots", ScarletiteArmorTier5Item.Boots::new);
		SCARLETITE_ARMOR_TIER_4_HELMET = REGISTRY.register("scarletite_armor_tier_4_helmet", ScarletiteArmorTier4Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_4_CHESTPLATE = REGISTRY.register("scarletite_armor_tier_4_chestplate", ScarletiteArmorTier4Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_4_LEGGINGS = REGISTRY.register("scarletite_armor_tier_4_leggings", ScarletiteArmorTier4Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_4_BOOTS = REGISTRY.register("scarletite_armor_tier_4_boots", ScarletiteArmorTier4Item.Boots::new);
		SCARLETITE_CHESTPLATE_PATTERN = REGISTRY.register("scarletite_chestplate_pattern", ScarletiteChestplatePatternItem::new);
		SCARLETITE_LEGGINGS_PATTERN = REGISTRY.register("scarletite_leggings_pattern", ScarletiteLeggingsPatternItem::new);
		SCARLETITE_HELMET_PATTERN = REGISTRY.register("scarletite_helmet_pattern", ScarletiteHelmetPatternItem::new);
		SOME_BULLSHIT_CHUNK = REGISTRY.register("some_bullshit_chunk", SomeBullshitChunkItem::new);
		SOME_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.SOME_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC));
		SCARLETITE_PICKAXE_TIER_1 = REGISTRY.register("scarletite_pickaxe_tier_1", ScarletitePickaxeTier1Item::new);
		SCARLETITE_PICKAXE_TIER_2 = REGISTRY.register("scarletite_pickaxe_tier_2", ScarletitePickaxeTier2Item::new);
		SCARLETITE_PICKAXE_TIER_3 = REGISTRY.register("scarletite_pickaxe_tier_3", ScarletitePickaxeTier3Item::new);
		SCARLETITE_PICKAXE_TIER_4 = REGISTRY.register("scarletite_pickaxe_tier_4", ScarletitePickaxeTier4Item::new);
		SCARLETITE_PICKAXE_TIER_5 = REGISTRY.register("scarletite_pickaxe_tier_5", ScarletitePickaxeTier5Item::new);
		SCARLETITE_PICKAXE_TIER_6 = REGISTRY.register("scarletite_pickaxe_tier_6", ScarletitePickaxeTier6Item::new);
		SCARLETITE_PICKAXE_TIER_7 = REGISTRY.register("scarletite_pickaxe_tier_7", ScarletitePickaxeTier7Item::new);
		APPLE_PLANT = block(GodTierEquipmentModBlocks.APPLE_PLANT);
		GLASS_BOTTLE_PLANT = block(GodTierEquipmentModBlocks.GLASS_BOTTLE_PLANT);
		GOLDEN_APPLE_PLANT = block(GodTierEquipmentModBlocks.GOLDEN_APPLE_PLANT);
		SOME_MORE_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.SOME_MORE_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		SOME_MORE_BULLSHIT_CHUNK = REGISTRY.register("some_more_bullshit_chunk", SomeMoreBullshitChunkItem::new);
		EVEN_MORE_BULLSHIT_CHUNK = REGISTRY.register("even_more_bullshit_chunk", EvenMoreBullshitChunkItem::new);
		EVEN_MORE_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.EVEN_MORE_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return block(block, new Item.Properties());
	}

	private static RegistryObject<Item> block(RegistryObject<Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}