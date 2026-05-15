package com.yourname.rainbowtulip.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;

public class WaterSnowflakesModel<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip", "water_snowflakes"), "main");

    // Top-level groups for split rendering
    private final ModelPart flowers;
    private final ModelPart leavesGroup;

    public WaterSnowflakesModel(ModelPart root) {
        ModelPart poppies = root.getChild("Poppies");
        this.flowers = poppies.getChild("Flowers");
        this.leavesGroup = poppies.getChild("Leaves_group");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Poppies = partdefinition.addOrReplaceChild("Poppies", CubeListBuilder.create(), PartPose.offset(-2.05F, 24.4F, 1.95F));

        PartDefinition Flowers = Poppies.addOrReplaceChild("Flowers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition Flower2 = Flowers.addOrReplaceChild("Flower2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2121F, -2.45F, -0.495F, -3.1416F, 0.7854F, 3.1416F));
        Flower2.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.45F, 0.4F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Petal3 = Flower2.addOrReplaceChild("Petal3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));
        Petal3.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));

        PartDefinition Flower = Flowers.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offset(3.25F, -2.05F, -2.8F));
        Flower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.45F, 0.4F, 0.0371F, -0.9426F, 0.0078F));

        PartDefinition Leaves_group = Poppies.addOrReplaceChild("Leaves_group", CubeListBuilder.create(), PartPose.offset(4.15F, 0.4F, -5.2F));
        PartDefinition Leafline = Leaves_group.addOrReplaceChild("Leafline", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaves = Leafline.addOrReplaceChild("Leaves", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaf5 = Leaves.addOrReplaceChild("Leaf5", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    /**
     * Renders leaves with biome tint and flowers without tint.
     * grassColor is an RGB int from BiomeColors (no alpha).
     */
    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                    int packedLight, int packedOverlay, int grassColor) {
        int tint = 0xFF000000 | (grassColor & 0xFFFFFF);
        leavesGroup.render(poseStack, buffer, packedLight, packedOverlay, tint);
        flowers.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay, int color) {
        leavesGroup.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        flowers.render(poseStack, vertexConsumer, packedLight, packedOverlay, 0xFFFFFFFF);
    }
}
