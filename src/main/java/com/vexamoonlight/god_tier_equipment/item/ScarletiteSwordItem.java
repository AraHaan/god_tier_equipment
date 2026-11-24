package com.vexamoonlight.god_tier_equipment.item;

import net.neoforged.neoforge.event.ModifyDefaultComponentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.component.ItemAttributeModifiers;
import net.minecraft.world.item.*;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.EquipmentSlotGroup;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

import java.util.List;

import com.vexamoonlight.god_tier_equipment.init.GodTierEquipmentModItems;
import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

@EventBusSubscriber
public class ScarletiteSwordItem extends PickaxeItem {
	private static final Tier TOOL_TIER = new Tier() {
		@Override
		public int getUses() {
			return 0;
		}

		@Override
		public float getSpeed() {
			return 30f;
		}

		@Override
		public float getAttackDamageBonus() {
			return 0;
		}

		@Override
		public TagKey<Block> getIncorrectBlocksForDrops() {
			return BlockTags.INCORRECT_FOR_NETHERITE_TOOL;
		}

		@Override
		public int getEnchantmentValue() {
			return 99999;
		}

		@Override
		public Ingredient getRepairIngredient() {
			return Ingredient.of();
		}
	};

	public ScarletiteSwordItem() {
		super(TOOL_TIER,
				new Item.Properties().attributes(ItemAttributeModifiers.builder().add(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_ID, 127999, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_ID, -2.4, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ENTITY_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_sword_0"), 3, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.ATTACK_DAMAGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_sword_1"), 1024, AttributeModifier.Operation.ADD_MULTIPLIED_BASE), EquipmentSlotGroup.MAINHAND)
						.add(Attributes.BLOCK_INTERACTION_RANGE, new AttributeModifier(ResourceLocation.fromNamespaceAndPath(GodTierEquipmentMod.MODID, "scarletite_sword_2"), 20, AttributeModifier.Operation.ADD_VALUE), EquipmentSlotGroup.MAINHAND)
						.build()).rarity(Rarity.EPIC).fireResistant());
	}

	@SubscribeEvent
	public static void handleToolDamage(ModifyDefaultComponentsEvent event) {
		event.modify(GodTierEquipmentModItems.SCARLETITE_SWORD.get(), builder -> builder.remove(DataComponents.MAX_DAMAGE));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, list, flag);
		list.add(Component.translatable("item.god_tier_equipment.scarletite_sword.description_0"));
		list.add(Component.translatable("item.god_tier_equipment.scarletite_sword.description_1"));
	}
}