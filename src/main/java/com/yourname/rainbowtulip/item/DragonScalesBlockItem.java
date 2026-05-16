package com.yourname.rainbowtulip.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;

public class DragonScalesBlockItem extends BlockItem {

    public DragonScalesBlockItem(Block block, Properties properties) {
        super(block, properties);
    }


    /**
     * Called when the player right-clicks in the air / on a fluid surface.
     * We re-do the ray trace with pickReach and fluids=true so that open water
     * registers as a valid hit, then delegate to the normal BlockItem placement.
     */
    @Override
    public net.minecraft.world.InteractionResultHolder<ItemStack> use(
            Level level, Player player, net.minecraft.world.InteractionHand hand) {

        ItemStack stack = player.getItemInHand(hand);

        // Ray-trace including fluids
        HitResult rawHit = player.pick(player.getAttributeValue(net.minecraft.world.entity.ai.attributes.Attributes.BLOCK_INTERACTION_RANGE), 0f, true);
        if (!(rawHit instanceof BlockHitResult hit)) return net.minecraft.world.InteractionResultHolder.pass(stack);

        BlockPos hitPos = hit.getBlockPos();
        Direction face  = hit.getDirection();

        // We only care about the TOP face of a water source block
        if (face == Direction.UP) {
            FluidState fluid = level.getFluidState(hitPos);
            if (fluid.getType() == Fluids.WATER && fluid.isSource()) {
                // The block should go one position above the water block
                BlockPos placePos = hitPos.above();

                // Only place if that space is empty
                if (level.getBlockState(placePos).isAir()) {
                    BlockPlaceContext ctx = new BlockPlaceContext(
                            level, player, hand, stack,
                            new BlockHitResult(hit.getLocation(), Direction.UP, placePos, false));

                    InteractionResult result = this.place(ctx);
                    if (result.consumesAction()) {
                        return net.minecraft.world.InteractionResultHolder.success(
                                player.getItemInHand(hand));
                    }
                }
            }
        }

        return net.minecraft.world.InteractionResultHolder.pass(stack);
    }
}
