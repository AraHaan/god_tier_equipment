/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.vexamoonlight.god_tier_equipment.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

import java.util.function.Function;

import com.vexamoonlight.god_tier_equipment.block.*;
import com.vexamoonlight.god_tier_equipment.GodTierEquipmentMod;

public class GodTierEquipmentModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(GodTierEquipmentMod.MODID);
	public static final DeferredBlock<Block> SCARLETITE_BLOCK;
	public static final DeferredBlock<Block> SOME_BULLSHIT_BLOCK;
	public static final DeferredBlock<Block> APPLE_PLANT;
	public static final DeferredBlock<Block> GLASS_BOTTLE_PLANT;
	public static final DeferredBlock<Block> GOLDEN_APPLE_PLANT;
	public static final DeferredBlock<Block> SOME_MORE_BULLSHIT_BLOCK;
	public static final DeferredBlock<Block> EVEN_MORE_BULLSHIT_BLOCK;
	static {
		SCARLETITE_BLOCK = register("scarletite_block", ScarletiteBlockBlock::new);
		SOME_BULLSHIT_BLOCK = register("some_bullshit_block", SomeBullshitBlockBlock::new);
		APPLE_PLANT = register("apple_plant", ApplePlantBlock::new);
		GLASS_BOTTLE_PLANT = register("glass_bottle_plant", GlassBottlePlantBlock::new);
		GOLDEN_APPLE_PLANT = register("golden_apple_plant", GoldenApplePlantBlock::new);
		SOME_MORE_BULLSHIT_BLOCK = register("some_more_bullshit_block", SomeMoreBullshitBlockBlock::new);
		EVEN_MORE_BULLSHIT_BLOCK = register("even_more_bullshit_block", EvenMoreBullshitBlockBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	private static <B extends Block> DeferredBlock<B> register(String name, Function<BlockBehaviour.Properties, ? extends B> supplier) {
		return REGISTRY.registerBlock(name, supplier);
	}
}