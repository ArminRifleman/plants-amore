package com.yourname.rainbowtulip.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Generic plant block entity for simple plants that only need rendering.
 * This eliminates the need for empty boilerplate entity classes.
 */
public class GenericPlantBlockEntity extends BlockEntity {

    public GenericPlantBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}

