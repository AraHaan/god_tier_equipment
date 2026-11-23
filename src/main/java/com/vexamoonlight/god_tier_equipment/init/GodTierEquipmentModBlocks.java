/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vexamoonlight.god_tier_equipment.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.vexamoonlight.god_tier_equipment.block.*;
import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public class GodTierEquipmentModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, GodTierEquipmentMod.MODID);
	public static final RegistryObject<Block> SCARLETITE_BLOCK;
	public static final RegistryObject<Block> SOME_BULLSHIT_BLOCK;
	public static final RegistryObject<Block> APPLE_PLANT;
	public static final RegistryObject<Block> GLASS_BOTTLE_PLANT;
	public static final RegistryObject<Block> GOLDEN_APPLE_PLANT;
	public static final RegistryObject<Block> SOME_MORE_BULLSHIT_BLOCK;
	public static final RegistryObject<Block> EVEN_MORE_BULLSHIT_BLOCK;
	static {
		SCARLETITE_BLOCK = REGISTRY.register("scarletite_block", ScarletiteBlockBlock::new);
		SOME_BULLSHIT_BLOCK = REGISTRY.register("some_bullshit_block", SomeBullshitBlockBlock::new);
		APPLE_PLANT = REGISTRY.register("apple_plant", ApplePlantBlock::new);
		GLASS_BOTTLE_PLANT = REGISTRY.register("glass_bottle_plant", GlassBottlePlantBlock::new);
		GOLDEN_APPLE_PLANT = REGISTRY.register("golden_apple_plant", GoldenApplePlantBlock::new);
		SOME_MORE_BULLSHIT_BLOCK = REGISTRY.register("some_more_bullshit_block", SomeMoreBullshitBlockBlock::new);
		EVEN_MORE_BULLSHIT_BLOCK = REGISTRY.register("even_more_bullshit_block", EvenMoreBullshitBlockBlock::new);
	}
	// Start of user code block custom blocks
	// End of user code block custom blocks
}