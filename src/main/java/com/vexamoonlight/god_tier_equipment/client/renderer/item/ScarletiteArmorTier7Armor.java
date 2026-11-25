package com.vexamoonlight.god_tier_equipment.client.renderer.item;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientItemExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.EquipmentClientInfo;

import com.vexamoonlight.god_tier_equipment.init.GodTierEquipmentModItems;

@EventBusSubscriber(Dist.CLIENT)
public class ScarletiteArmorTier7Armor {
	@SubscribeEvent
	public static void registerItemExtensions(RegisterClientExtensionsEvent event) {
		event.registerItem(new IClientItemExtensions() {
			private final Identifier armorTexture = Identifier.parse("minecraft:textures/models/armor/netherite_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		}, GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_HELMET.get());
		event.registerItem(new IClientItemExtensions() {
			private final Identifier armorTexture = Identifier.parse("minecraft:textures/models/armor/netherite_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		}, GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_CHESTPLATE.get());
		event.registerItem(new IClientItemExtensions() {
			private final Identifier armorTexture = Identifier.parse("minecraft:textures/models/armor/netherite_layer_2.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		}, GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_LEGGINGS.get());
		event.registerItem(new IClientItemExtensions() {
			private final Identifier armorTexture = Identifier.parse("minecraft:textures/models/armor/netherite_layer_1.png");

			@Override
			public Identifier getArmorTexture(ItemStack stack, EquipmentClientInfo.LayerType type, EquipmentClientInfo.Layer layer, Identifier original) {
				return armorTexture;
			}
		}, GodTierEquipmentModItems.SCARLETITE_ARMOR_TIER_7_BOOTS.get());
	}
}