package com.yourname.rainbowtulip.block;

import com.mojang.serialization.MapCodec;
import com.yourname.rainbowtulip.blockentity.GenericPlantBlockEntity;
import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class WaterPoppiesBlock extends AbstractWaterPlantBlock implements BlockItemProvider {

    public static final MapCodec<WaterPoppiesBlock> CODEC = simpleCodec(WaterPoppiesBlock::new);

    public WaterPoppiesBlock(BlockBehaviour.Properties properties) {
        super(properties);
    }

    @Override
    @NotNull
    protected MapCodec<? extends com.yourname.rainbowtulip.block.AbstractWaterPlantBlock> codec() {
        return CODEC;
    }

    // common water-plant behavior (shape, survival, placement) moved to AbstractWaterPlantBlock

    @Override
    public BlockItem createBlockItem(net.minecraft.world.level.block.Block block, Item.Properties properties) {
        return new com.yourname.rainbowtulip.item.WaterPoppiesBlockItem(block, properties);
    }

    @Override
    @Nullable
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new GenericPlantBlockEntity(ModBlockEntities.WATER_POPPIES_BE, pos, state);
    }
}