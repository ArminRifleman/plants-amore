package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.yourname.rainbowtulip.blockentity.GenericPlantBlockEntity;
import com.yourname.rainbowtulip.entity.client.RainbowTulipModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class RainbowTulipBlockEntityRenderer extends AbstractPlantBlockEntityRenderer<GenericPlantBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/rainbow_tulip.png");

    private final RainbowTulipModel model;

    public RainbowTulipBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        super(null, TEXTURE, 0.0f, -1.5f);
        this.model = new RainbowTulipModel(ctx.bakeLayer(RainbowTulipModel.LAYER_LOCATION));
    }

    @Override
    protected void renderPlant(PoseStack poseStack, VertexConsumer buffer,
                              int packedLight, int grassColor) {
        model.renderWithBiomeTint(poseStack, buffer, packedLight, OverlayTexture.NO_OVERLAY, grassColor);
    }
}