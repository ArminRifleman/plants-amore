package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.blockentity.GenericPlantBlockEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class ModBlockEntities {

    public static final BlockEntityType<GenericPlantBlockEntity> RAINBOW_TULIP_BE =
            registerRainbowTulip("rainbow_tulip", ModBlocks.RAINBOW_TULIP);

    public static final BlockEntityType<GenericPlantBlockEntity> WATER_POPPIES_BE =
            registerWaterPoppies("water_poppies", ModBlocks.WATER_POPPIES);

    public static final BlockEntityType<GenericPlantBlockEntity> WATER_SNOWFLAKES_BE =
            registerWaterSnowflakes("water_snowflakes", ModBlocks.WATER_SNOWFLAKES);

    private static BlockEntityType<GenericPlantBlockEntity> registerRainbowTulip(String name, net.minecraft.world.level.block.Block block) {
        return Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                BlockEntityType.Builder.of((pos, state) -> new GenericPlantBlockEntity(
                        null, pos, state), block).build(null)
        );
    }

    private static BlockEntityType<GenericPlantBlockEntity> registerWaterPoppies(String name, net.minecraft.world.level.block.Block block) {
        return Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                BlockEntityType.Builder.of((pos, state) -> new GenericPlantBlockEntity(
                        null, pos, state), block).build(null)
        );
    }

    private static BlockEntityType<GenericPlantBlockEntity> registerWaterSnowflakes(String name, net.minecraft.world.level.block.Block block) {
        return Registry.register(
                BuiltInRegistries.BLOCK_ENTITY_TYPE,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                BlockEntityType.Builder.of((pos, state) -> new GenericPlantBlockEntity(
                        null, pos, state), block).build(null)
        );
    }

    public static void register() {} // triggers class loading
}