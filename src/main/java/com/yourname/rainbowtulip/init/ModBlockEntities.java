package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.blockentity.RainbowTulipBlockEntity;
import com.yourname.rainbowtulip.blockentity.WaterPoppiesBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {

    public static final BlockEntityType<RainbowTulipBlockEntity> RAINBOW_TULIP_BE =
            register("rainbow_tulip", RainbowTulipBlockEntity::new, ModBlocks.RAINBOW_TULIP);

    public static final BlockEntityType<WaterPoppiesBlockEntity> WATER_POPPIES_BE =
            register("water_poppies", WaterPoppiesBlockEntity::new, ModBlocks.WATER_POPPIES);

    private static <T extends net.minecraft.world.level.block.entity.BlockEntity>
    BlockEntityType<T> register(String name,
                                BlockEntityType.BlockEntitySupplier<T> factory,
                                net.minecraft.world.level.block.Block... blocks) {
        return Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                BlockEntityType.Builder.of(factory, blocks).build(null)
        );
    }

    public static void register() {} // triggers class loading
}