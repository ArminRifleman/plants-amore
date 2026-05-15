package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.blockentity.renderer.RainbowTulipBlockEntityRenderer;
import com.yourname.rainbowtulip.blockentity.renderer.WaterPoppiesBlockEntityRenderer;
import com.yourname.rainbowtulip.blockentity.renderer.WaterSnowflakesBlockEntityRenderer;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import com.yourname.rainbowtulip.entity.client.WaterPoppiesModel;
import com.yourname.rainbowtulip.entity.client.WaterSnowflakesModel;
import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class RainbowTulipModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        // Register model layers
        EntityModelLayerRegistry.registerModelLayer(
                RainbowTulipModel.LAYER_LOCATION,
                RainbowTulipModel::createBodyLayer
        );
        EntityModelLayerRegistry.registerModelLayer(
                WaterPoppiesModel.LAYER_LOCATION,
                WaterPoppiesModel::createBodyLayer
        );
        EntityModelLayerRegistry.registerModelLayer(
                WaterSnowflakesModel.LAYER_LOCATION,
                WaterSnowflakesModel::createBodyLayer
        );

        // Register block entity renderers
        BlockEntityRendererRegistry.register(
                ModBlockEntities.RAINBOW_TULIP_BE,
                RainbowTulipBlockEntityRenderer::new
        );
        BlockEntityRendererRegistry.register(
                ModBlockEntities.WATER_POPPIES_BE,
                WaterPoppiesBlockEntityRenderer::new
        );
        BlockEntityRendererRegistry.register(
                ModBlockEntities.WATER_SNOWFLAKES_BE,
                WaterSnowflakesBlockEntityRenderer::new
        );
    }
}