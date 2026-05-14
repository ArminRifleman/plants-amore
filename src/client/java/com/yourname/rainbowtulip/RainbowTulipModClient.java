package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.blockentity.renderer.RainbowTulipBlockEntityRenderer;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import com.yourname.rainbowtulip.init.ModBlockEntities;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;

public class RainbowTulipModClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(
            RainbowTulipModel.LAYER_LOCATION,
            RainbowTulipModel::createBodyLayer
        );

        BlockEntityRendererRegistry.register(
            ModBlockEntities.RAINBOW_TULIP_BE,
            RainbowTulipBlockEntityRenderer::new
        );
    }
}
