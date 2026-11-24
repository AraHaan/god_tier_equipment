package com.vexamoonlight.god_tier_equipment.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class SomeMoreBullshitBlockBlock extends Block {
	public SomeMoreBullshitBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.COPPER).strength(0.2f, 10f));
	}
}