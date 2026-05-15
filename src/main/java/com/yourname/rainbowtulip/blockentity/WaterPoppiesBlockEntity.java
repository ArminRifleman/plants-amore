package com.yourname.rainbowtulip.blockentity;

import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class WaterPoppiesBlockEntity extends BlockEntity {

    public WaterPoppiesBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.WATER_POPPIES_BE, pos, state);
    }
}