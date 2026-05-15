package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.yourname.rainbowtulip.blockentity.WaterPoppiesBlockEntity;
import com.yourname.rainbowtulip.entity.client.WaterPoppiesModel;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class WaterPoppiesBlockEntityRenderer implements BlockEntityRenderer<WaterPoppiesBlockEntity> {

    private static final ResourceLocation TEXTURE =
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "textures/entity/water_poppies.png");

    private static final float[] ROTATIONS = { 0f, 90f, 180f, 270f };

    private final WaterPoppiesModel model;

    public WaterPoppiesBlockEntityRenderer(BlockEntityRendererProvider.Context ctx) {
        this.model = new WaterPoppiesModel(ctx.bakeLayer(WaterPoppiesModel.LAYER_LOCATION));
    }

    @Override
    public void render(WaterPoppiesBlockEntity blockEntity, float partialTick,
                       PoseStack poseStack, MultiBufferSource bufferSource,
                       int packedLight, int packedOverlay) {

        BlockPos pos = blockEntity.getBlockPos();

        // Deterministic rotation based on position so every placed flower looks natural
        int hash = Mth.positiveModulo(pos.getX() * 73856093 ^ pos.getZ() * 19349663, 4);
        float yRot = ROTATIONS[hash];

        // Use grass color for the leaf biome tint (lily pads use grass color in vanilla too)
        int grassColor = BiomeColors.getAverageGrassColor(blockEntity.getLevel(), pos);

        poseStack.pushPose();
        poseStack.translate(0.5, 0.0, 0.5);
        poseStack.mulPose(Axis.YP.rotationDegrees(yRot));
        poseStack.scale(2.0F, -2.0F, 2.0F);
        poseStack.translate(0.0, -1.5, 0.0);

        var buffer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(TEXTURE));
        model.renderWithBiomeTint(poseStack, buffer, packedLight, OverlayTexture.NO_OVERLAY, grassColor);

        poseStack.popPose();
    }
}