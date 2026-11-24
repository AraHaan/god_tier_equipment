/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vexamoonlight.god_tier_equipment.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import java.util.function.Function;

import com.vexamoonlight.god_tier_equipment.item.*;
import com.vexamoonlight.god_tier_equipment.block.GoldenApplePlantBlock;
import com.vexamoonlight.god_tier_equipment.block.GlassBottlePlantBlock;
import com.vexamoonlight.god_tier_equipment.block.ApplePlantBlock;
import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public class GodTierEquipmentModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(GodTierEquipmentMod.MODID);
	public static final DeferredItem<Item> SCARLETITE_SWORD;
	public static final DeferredItem<Item> SCARLETITE_BLOCK;
	public static final DeferredItem<Item> SCARLETITE_SWORD_HILT;
	public static final DeferredItem<Item> SCARLETITE_SWORD_BLADE;
	public static final DeferredItem<Item> SCARLETITE_INGOT;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_PICK;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_6;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_5;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_1;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_2;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_3;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_4;
	public static final DeferredItem<Item> SCARLETITE_SWORD_TIER_7;
	public static final DeferredItem<Item> SCARLETITE_BOOTS_PATTERN;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_1_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_1_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_1_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_1_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_2_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_2_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_2_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_2_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_3_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_3_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_3_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_3_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_7_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_7_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_7_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_7_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_6_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_6_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_6_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_6_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_5_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_5_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_5_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_5_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_4_HELMET;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_4_CHESTPLATE;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_4_LEGGINGS;
	public static final DeferredItem<Item> SCARLETITE_ARMOR_TIER_4_BOOTS;
	public static final DeferredItem<Item> SCARLETITE_CHESTPLATE_PATTERN;
	public static final DeferredItem<Item> SCARLETITE_LEGGINGS_PATTERN;
	public static final DeferredItem<Item> SCARLETITE_HELMET_PATTERN;
	public static final DeferredItem<Item> SOME_BULLSHIT_CHUNK;
	public static final DeferredItem<Item> SOME_BULLSHIT_BLOCK;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_1;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_2;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_3;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_4;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_5;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_6;
	public static final DeferredItem<Item> SCARLETITE_PICKAXE_TIER_7;
	public static final DeferredItem<Item> APPLE_PLANT;
	public static final DeferredItem<Item> GLASS_BOTTLE_PLANT;
	public static final DeferredItem<Item> GOLDEN_APPLE_PLANT;
	public static final DeferredItem<Item> SOME_MORE_BULLSHIT_BLOCK;
	public static final DeferredItem<Item> SOME_MORE_BULLSHIT_CHUNK;
	public static final DeferredItem<Item> EVEN_MORE_BULLSHIT_CHUNK;
	public static final DeferredItem<Item> EVEN_MORE_BULLSHIT_BLOCK;
	static {
		SCARLETITE_SWORD = register("scarletite_sword", ScarletiteSwordItem::new);
		SCARLETITE_BLOCK = block(GodTierEquipmentModBlocks.SCARLETITE_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		SCARLETITE_SWORD_HILT = register("scarletite_sword_hilt", ScarletiteSwordHiltItem::new);
		SCARLETITE_SWORD_BLADE = register("scarletite_sword_blade", ScarletiteSwordBladeItem::new);
		SCARLETITE_INGOT = register("scarletite_ingot", ScarletiteIngotItem::new);
		SCARLETITE_ARMOR_HELMET = register("scarletite_armor_helmet", ScarletiteArmorItem.Helmet::new);
		SCARLETITE_ARMOR_CHESTPLATE = register("scarletite_armor_chestplate", ScarletiteArmorItem.Chestplate::new);
		SCARLETITE_ARMOR_LEGGINGS = register("scarletite_armor_leggings", ScarletiteArmorItem.Leggings::new);
		SCARLETITE_ARMOR_BOOTS = register("scarletite_armor_boots", ScarletiteArmorItem.Boots::new);
		SCARLETITE_PICKAXE = register("scarletite_pickaxe", ScarletitePickaxeItem::new);
		SCARLETITE_PICKAXE_PICK = register("scarletite_pickaxe_pick", ScarletitePickaxePickItem::new);
		SCARLETITE_SWORD_TIER_6 = register("scarletite_sword_tier_6", ScarletiteSwordTier6Item::new);
		SCARLETITE_SWORD_TIER_5 = register("scarletite_sword_tier_5", ScarletiteSwordTier5Item::new);
		SCARLETITE_SWORD_TIER_1 = register("scarletite_sword_tier_1", ScarletiteSwordTier1Item::new);
		SCARLETITE_SWORD_TIER_2 = register("scarletite_sword_tier_2", ScarletiteSwordTier2Item::new);
		SCARLETITE_SWORD_TIER_3 = register("scarletite_sword_tier_3", ScarletiteSwordTier3Item::new);
		SCARLETITE_SWORD_TIER_4 = register("scarletite_sword_tier_4", ScarletiteSwordTier4Item::new);
		SCARLETITE_SWORD_TIER_7 = register("scarletite_sword_tier_7", ScarletiteSwordTier7Item::new);
		SCARLETITE_BOOTS_PATTERN = register("scarletite_boots_pattern", ScarletiteBootsPatternItem::new);
		SCARLETITE_ARMOR_TIER_1_HELMET = register("scarletite_armor_tier_1_helmet", ScarletiteArmorTier1Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_1_CHESTPLATE = register("scarletite_armor_tier_1_chestplate", ScarletiteArmorTier1Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_1_LEGGINGS = register("scarletite_armor_tier_1_leggings", ScarletiteArmorTier1Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_1_BOOTS = register("scarletite_armor_tier_1_boots", ScarletiteArmorTier1Item.Boots::new);
		SCARLETITE_ARMOR_TIER_2_HELMET = register("scarletite_armor_tier_2_helmet", ScarletiteArmorTier2Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_2_CHESTPLATE = register("scarletite_armor_tier_2_chestplate", ScarletiteArmorTier2Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_2_LEGGINGS = register("scarletite_armor_tier_2_leggings", ScarletiteArmorTier2Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_2_BOOTS = register("scarletite_armor_tier_2_boots", ScarletiteArmorTier2Item.Boots::new);
		SCARLETITE_ARMOR_TIER_3_HELMET = register("scarletite_armor_tier_3_helmet", ScarletiteArmorTier3Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_3_CHESTPLATE = register("scarletite_armor_tier_3_chestplate", ScarletiteArmorTier3Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_3_LEGGINGS = register("scarletite_armor_tier_3_leggings", ScarletiteArmorTier3Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_3_BOOTS = register("scarletite_armor_tier_3_boots", ScarletiteArmorTier3Item.Boots::new);
		SCARLETITE_ARMOR_TIER_7_HELMET = register("scarletite_armor_tier_7_helmet", ScarletiteArmorTier7Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_7_CHESTPLATE = register("scarletite_armor_tier_7_chestplate", ScarletiteArmorTier7Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_7_LEGGINGS = register("scarletite_armor_tier_7_leggings", ScarletiteArmorTier7Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_7_BOOTS = register("scarletite_armor_tier_7_boots", ScarletiteArmorTier7Item.Boots::new);
		SCARLETITE_ARMOR_TIER_6_HELMET = register("scarletite_armor_tier_6_helmet", ScarletiteArmorTier6Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_6_CHESTPLATE = register("scarletite_armor_tier_6_chestplate", ScarletiteArmorTier6Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_6_LEGGINGS = register("scarletite_armor_tier_6_leggings", ScarletiteArmorTier6Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_6_BOOTS = register("scarletite_armor_tier_6_boots", ScarletiteArmorTier6Item.Boots::new);
		SCARLETITE_ARMOR_TIER_5_HELMET = register("scarletite_armor_tier_5_helmet", ScarletiteArmorTier5Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_5_CHESTPLATE = register("scarletite_armor_tier_5_chestplate", ScarletiteArmorTier5Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_5_LEGGINGS = register("scarletite_armor_tier_5_leggings", ScarletiteArmorTier5Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_5_BOOTS = register("scarletite_armor_tier_5_boots", ScarletiteArmorTier5Item.Boots::new);
		SCARLETITE_ARMOR_TIER_4_HELMET = register("scarletite_armor_tier_4_helmet", ScarletiteArmorTier4Item.Helmet::new);
		SCARLETITE_ARMOR_TIER_4_CHESTPLATE = register("scarletite_armor_tier_4_chestplate", ScarletiteArmorTier4Item.Chestplate::new);
		SCARLETITE_ARMOR_TIER_4_LEGGINGS = register("scarletite_armor_tier_4_leggings", ScarletiteArmorTier4Item.Leggings::new);
		SCARLETITE_ARMOR_TIER_4_BOOTS = register("scarletite_armor_tier_4_boots", ScarletiteArmorTier4Item.Boots::new);
		SCARLETITE_CHESTPLATE_PATTERN = register("scarletite_chestplate_pattern", ScarletiteChestplatePatternItem::new);
		SCARLETITE_LEGGINGS_PATTERN = register("scarletite_leggings_pattern", ScarletiteLeggingsPatternItem::new);
		SCARLETITE_HELMET_PATTERN = register("scarletite_helmet_pattern", ScarletiteHelmetPatternItem::new);
		SOME_BULLSHIT_CHUNK = register("some_bullshit_chunk", SomeBullshitChunkItem::new);
		SOME_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.SOME_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC));
		SCARLETITE_PICKAXE_TIER_1 = register("scarletite_pickaxe_tier_1", ScarletitePickaxeTier1Item::new);
		SCARLETITE_PICKAXE_TIER_2 = register("scarletite_pickaxe_tier_2", ScarletitePickaxeTier2Item::new);
		SCARLETITE_PICKAXE_TIER_3 = register("scarletite_pickaxe_tier_3", ScarletitePickaxeTier3Item::new);
		SCARLETITE_PICKAXE_TIER_4 = register("scarletite_pickaxe_tier_4", ScarletitePickaxeTier4Item::new);
		SCARLETITE_PICKAXE_TIER_5 = register("scarletite_pickaxe_tier_5", ScarletitePickaxeTier5Item::new);
		SCARLETITE_PICKAXE_TIER_6 = register("scarletite_pickaxe_tier_6", ScarletitePickaxeTier6Item::new);
		SCARLETITE_PICKAXE_TIER_7 = register("scarletite_pickaxe_tier_7", ScarletitePickaxeTier7Item::new);
		APPLE_PLANT = register("apple_plant", ApplePlantBlock.Item::new);
		GLASS_BOTTLE_PLANT = register("glass_bottle_plant", GlassBottlePlantBlock.Item::new);
		GOLDEN_APPLE_PLANT = register("golden_apple_plant", GoldenApplePlantBlock.Item::new);
		SOME_MORE_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.SOME_MORE_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
		SOME_MORE_BULLSHIT_CHUNK = register("some_more_bullshit_chunk", SomeMoreBullshitChunkItem::new);
		EVEN_MORE_BULLSHIT_CHUNK = register("even_more_bullshit_chunk", EvenMoreBullshitChunkItem::new);
		EVEN_MORE_BULLSHIT_BLOCK = block(GodTierEquipmentModBlocks.EVEN_MORE_BULLSHIT_BLOCK, new Item.Properties().rarity(Rarity.EPIC).fireResistant());
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, Item.Properties::new);
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.registerItem(block.getId().getPath(), prop -> new BlockItem(block.get(), prop), () -> properties);
	}
}