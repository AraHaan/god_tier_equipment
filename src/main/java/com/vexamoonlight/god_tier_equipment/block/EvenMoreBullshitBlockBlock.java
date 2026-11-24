package com.vexamoonlight.god_tier_equipment.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EvenMoreBullshitBlockBlock extends Block {
	public EvenMoreBullshitBlockBlock() {
		super(BlockBehaviour.Properties.of().sound(SoundType.COPPER).strength(0.2f, 10f));
	}
}