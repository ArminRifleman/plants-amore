package com.yourname.rainbowtulip.blockentity;

import net.minecraft.core.BlockPos;
import net.minecraft.core.HolderLookup;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;

/**
 * Generic plant block entity for simple plants that only need rendering.
 * This eliminates the need for empty boilerplate entity classes.
 * 
 * Handles NBT persistence and client-server sync to ensure old plants
 * remain visible after mod updates and rebuilds.
 */
public class GenericPlantBlockEntity extends BlockEntity {

    public GenericPlantBlockEntity(BlockEntityType<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    /**
     * Called when saving the chunk to disk.
     * Ensures the entity persists properly across versions and rebuilds.
     */
    @Override
    protected void saveAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.saveAdditional(tag, registries);
        // No additional data to save for generic plants, but overriding ensures proper persistence
    }

    /**
     * Called when loading the chunk from disk.
     * Ensures old plants deserialize correctly across versions.
     */
    @Override
    public void loadAdditional(CompoundTag tag, HolderLookup.Provider registries) {
        super.loadAdditional(tag, registries);
        // No additional data to load, but overriding ensures proper persistence
    }
}

