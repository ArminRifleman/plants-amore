package com.yourname.rainbowtulip.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

/**
 * Interface for blocks that need custom BlockItem implementations.
 * Allows cleaner registration without instanceof checks.
 */
public interface BlockItemProvider {
    /**
     * Create a custom BlockItem for this block.
     */
    BlockItem createBlockItem(Block block, Item.Properties properties);
}

