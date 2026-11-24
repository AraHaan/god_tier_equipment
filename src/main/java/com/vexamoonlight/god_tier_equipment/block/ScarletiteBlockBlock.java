package com.vexamoonlight.god_tier_equipment.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ScarletiteBlockBlock extends Block {
	public ScarletiteBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHERITE_BLOCK).strength(1f, 10f));
	}
}