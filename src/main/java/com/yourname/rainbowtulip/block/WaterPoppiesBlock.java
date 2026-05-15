package com.yourname.rainbowtulip.block;

import com.mojang.serialization.MapCodec;
import com.yourname.rainbowtulip.blockentity.WaterPoppiesBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.BaseEntityBlock;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WaterPoppiesBlock extends BaseEntityBlock {

    public static final MapCodec<WaterPoppiesBlock> CODEC = simpleCodec(WaterPoppiesBlock::new);

    // Flat lily-pad style hitbox sitting on the water surface
    private static final VoxelShape SHAPE = box(1, 0, 1, 15, 6, 15);

    public WaterPoppiesBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    @NotNull
    protected MapCodec<? extends BaseEntityBlock> codec() {
        return CODEC;
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
     * Must be placed on top of a water source block.
     */
    @Override
    public boolean canSurvive(@NotNull BlockState state, @NotNull LevelReader level, @NotNull BlockPos pos) {
        BlockPos below = pos.below();
        FluidState fluid = level.getFluidState(below);
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

    @Override
    @Nullable
    public BlockState getStateForPlacement(@NotNull BlockPlaceContext context) {
        // getClickedPos() is the face that was clicked. When clicking on top of a water
        // block, the hit face is UP, so getClickedPos() already gives us the block above
        // the water — which is exactly where we want to place. But if the player clicks
        // the water block itself (fluid has no solid face), vanilla's BlockItem never
        // calls getStateForPlacement at all, so we also need the item to use fluid pick.
        //
        // Here we just validate the target pos is survivable.
        BlockPos pos = context.getClickedPos();
        if (!canSurvive(defaultBlockState(), context.getLevel(), pos)) {
            return null;
        }
        return defaultBlockState();
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new WaterPoppiesBlockEntity(pos, state);
    }
}