package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class ModBlockEntities {

    public static final BlockEntityType<RainbowTulipBlockEntity> RAINBOW_TULIP_BE =
            register("rainbow_tulip", RainbowTulipBlockEntity::new, ModBlocks.RAINBOW_TULIP);

    private static <T extends BlockEntity> BlockEntityType<T> register(
            String name, BlockEntityType.BlockEntitySupplier<T> factory, Block... blocks) {
        return Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                BlockEntityType.Builder.of(factory, blocks).build(null));
    }

    public static void register() {}
}