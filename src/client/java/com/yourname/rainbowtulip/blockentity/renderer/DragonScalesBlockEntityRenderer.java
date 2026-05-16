package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.yourname.rainbowtulip.blockentity.GenericPlantBlockEntity;
import com.yourname.rainbowtulip.entity.client.DragonScalesModel;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.resources.ResourceLocation;

public class DragonScalesBlockEntityRenderer extends AbstractPlantBlockEntityRenderer<GenericPlantBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/dragon_scales.png");

    private final DragonScalesModel<?> model;

    public DragonScalesBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        super(null, TEXTURE, -3.0f, -1.525f);
        this.model = new DragonScalesModel<>(ctx.bakeLayer(DragonScalesModel.LAYER_LOCATION));
    }

    @Override
    protected void renderPlant(PoseStack poseStack, VertexConsumer buffer,
                               int packedLight, int grassColor) {
        poseStack.scale(2.0F, 2.0F, 2.0F);
        model.renderWithBiomeTint(poseStack, buffer, packedLight, OverlayTexture.NO_OVERLAY, grassColor);
    }
}
