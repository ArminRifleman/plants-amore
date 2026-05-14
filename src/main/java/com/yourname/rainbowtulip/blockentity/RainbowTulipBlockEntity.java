package com.yourname.rainbowtulip.blockentity;

import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class RainbowTulipBlockEntity extends BlockEntity {

    public RainbowTulipBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.RAINBOW_TULIP_BE, pos, state);
    }
}
