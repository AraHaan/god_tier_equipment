/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vexamoonlight.god_tier_equipment.init;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;

import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.core.registries.Registries;

import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GodTierEquipmentModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, GodTierEquipmentMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_6.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_5.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_1.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_2.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_3.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_4.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_TIER_7.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_1_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_1_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_1_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_1_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_2_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_2_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_2_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_2_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_3_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_3_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_3_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_3_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_6_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_6_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_6_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_6_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_5_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_5_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_5_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_5_BOOTS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_4_HELMET.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_4_CHESTPLATE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_4_LEGGINGS.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_4_BOOTS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_1.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_2.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_3.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_4.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_5.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_6.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_7.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(GodTierEquipmentModBlocks.SCARLETITE_BLOCK.get().asItem());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_HILT.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_SWORD_BLADE.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_INGOT.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_PICK.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_BOOTS_PATTERN.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_CHESTPLATE_PATTERN.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_LEGGINGS_PATTERN.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_HELMET_PATTERN.get());
			tabData.accept(GodTierEquipmentModItems.SOME_BULLSHIT_CHUNK.get());
			tabData.accept(GodTierEquipmentModBlocks.SOME_BULLSHIT_BLOCK.get().asItem());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_1.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_2.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_3.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_4.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_5.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_6.get());
			tabData.accept(GodTierEquipmentModItems.SCARLETITE_PICKAXE_TIER_7.get());
			tabData.accept(GodTierEquipmentModBlocks.SOME_MORE_BULLSHIT_BLOCK.get().asItem());
			tabData.accept(GodTierEquipmentModItems.SOME_MORE_BULLSHIT_CHUNK.get());
			tabData.accept(GodTierEquipmentModItems.EVEN_MORE_BULLSHIT_CHUNK.get());
			tabData.accept(GodTierEquipmentModBlocks.EVEN_MORE_BULLSHIT_BLOCK.get().asItem());
		} else if (tabData.getTabKey() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(GodTierEquipmentModBlocks.APPLE_PLANT.get().asItem());
			tabData.accept(GodTierEquipmentModBlocks.GLASS_BOTTLE_PLANT.get().asItem());
			tabData.accept(GodTierEquipmentModBlocks.GOLDEN_APPLE_PLANT.get().asItem());
		}
	}
}