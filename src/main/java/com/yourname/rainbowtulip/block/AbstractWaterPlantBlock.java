package com.yourname.rainbowtulip.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * Common base for plants that sit above still water (lily-pad style).
 * Concrete blocks should still provide their own codec, BlockItem and BlockEntity.
 */
public abstract class AbstractWaterPlantBlock extends BaseEntityBlock implements BlockItemProvider {

    private static final VoxelShape SHAPE = box(1, 0, 1, 15, 3, 15);

    protected AbstractWaterPlantBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    @NotNull
    public VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level,
                               @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return SHAPE;
    }

    @Override
    @NotNull
    public RenderShape getRenderShape(@NotNull BlockState state) {
        return RenderShape.ENTITYBLOCK_ANIMATED;
    }

    /**
     * The block itself sits in the block space above water.
     * We require the block directly below to be a still water source.
     */
    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        FluidState fluid = level.getFluidState(pos.below());

        return fluid.getType() == Fluids.WATER && fluid.isSource();
    }

    @Override
    @NotNull
    public BlockState updateShape(@NotNull BlockState state, @NotNull Direction direction,
                                  @NotNull BlockState neighborState, @NotNull LevelAccessor level,
                                  @NotNull BlockPos pos, @NotNull BlockPos neighborPos) {
        if (!canSurvive(state, level, pos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(state, direction, neighborState, level, pos, neighborPos);
    }

    /** When the player right-clicks the top face of a water block, the placement position is the block above the water. */
    @Override
    @Nullable
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        return defaultBlockState();
    }

    @Override
    protected boolean canBeReplaced(@NotNull BlockState state, @NotNull BlockPlaceContext context) {
        return false;
    }
}

