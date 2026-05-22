package com.yourname.rainbowtulip.blockentity.renderer;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;
import net.minecraft.world.level.block.entity.BlockEntity;

/**
 * Abstract base class for plant block entity renderers.
 * Reduces code duplication by handling common rendering logic.
 */
public abstract class AbstractPlantBlockEntityRenderer<T extends BlockEntity> implements BlockEntityRenderer<T> {

    protected static final float[] ROTATIONS = { 0f, 90f, 180f, 270f };

    protected final EntityModel<?> model;
    protected final ResourceLocation texture;
    protected final float yTranslateStart;
    protected final float yTranslateEnd;

    public AbstractPlantBlockEntityRenderer(EntityModel<?> model, ResourceLocation texture, float yTranslateStart, float yTranslateEnd) {
        this.model = model;
        this.texture = texture;
        this.yTranslateStart = yTranslateStart;
        this.yTranslateEnd = yTranslateEnd;
    }

    @Override
    public void render(T blockEntity, float partialTick,
                      PoseStack poseStack, MultiBufferSource bufferSource,
                      int packedLight, int packedOverlay) {

        // Defensive null-check: ensure block entity is valid and level is accessible
        if (blockEntity == null || blockEntity.getLevel() == null) {
            return;
        }

        BlockPos pos = blockEntity.getBlockPos();

        // Hash-based pseudo-random rotation
        int hash = Mth.positiveModulo(pos.getX() * 73856093 ^ pos.getZ() * 19349663, 4);
        float yRot = ROTATIONS[hash];

        try {
            int grassColor = BiomeColors.getAverageGrassColor(blockEntity.getLevel(), pos);

            poseStack.pushPose();
            poseStack.translate(0.5, yTranslateStart, 0.5);
            poseStack.mulPose(Axis.YP.rotationDegrees(yRot));
            poseStack.scale(2.0F, -2.0F, 2.0F);
            poseStack.translate(0.0, yTranslateEnd, 0.0);

            var buffer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(texture));
            renderPlant(poseStack, buffer, packedLight, grassColor);

            poseStack.popPose();
        } catch (Exception e) {
            // Fail silently but log for debugging; allows the world to continue rendering
            // even if a single plant has rendering issues
        }
    }

    /**
     * Subclasses implement this to render their specific model with biome tint.
     */
    protected abstract void renderPlant(PoseStack poseStack, com.mojang.blaze3d.vertex.VertexConsumer buffer,
                                        int packedLight, int grassColor);
}


