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
    private final ModelPart leavesAndStems;

    public WaterSnowflakesModel(ModelPart root) {
        ModelPart waterSnowflakes = root.getChild("WaterSnowflakes");
        ModelPart plant = waterSnowflakes.getChild("Plant");
        this.flowers = plant.getChild("Flowers");
        this.leavesAndStems = plant.getChild("LeavesAndStems");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition WaterSnowflakes = partdefinition.addOrReplaceChild("WaterSnowflakes", CubeListBuilder.create(), PartPose.offset(3.0837F, 24.5F, 2.6679F));

        PartDefinition Plant = WaterSnowflakes.addOrReplaceChild("Plant", CubeListBuilder.create(), PartPose.offset(-0.8433F, 1.1F, -7.7101F));

        PartDefinition Flowers = Plant.addOrReplaceChild("Flowers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        Flowers.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(3, 12).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.1F, 2.4179F, 1.2062F, 2.4986F));
        Flowers.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.8727F, 0.1696F, -1.1503F, 0.2765F));
        Flowers.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.7727F, 0.9121F, 0.8361F, 0.7534F));
        Flowers.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.6727F, -3.0877F, -0.0024F, 2.9594F));
        Flowers.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.5727F, 0.5699F, -0.2515F, 0.5174F));
        Flowers.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.4727F, -2.4351F, -0.8571F, 2.7455F));
        Flowers.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.4113F, -4.5717F, -0.3727F, 2.6515F, 0.786F, 2.2083F));
        Flowers.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 4.5587F, -2.8196F, 0.5429F, 2.7774F));
        Flowers.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 4.6587F, -1.1945F, -1.1217F, 1.2902F));
        Flowers.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 4.7587F, 0.2145F, 0.5982F, 0.0246F));
        Flowers.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 4.8587F, -2.2957F, -0.2993F, 2.4099F));
        Flowers.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 4.9587F, 1.759F, 1.281F, 1.1493F));
        Flowers.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5031F, -7.0107F, 5.0587F, 0.0478F, -0.3596F, 0.4226F));
        Flowers.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.2791F, 0.5108F, 0.6631F, 0.1419F));
        Flowers.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.3791F, -2.9887F, 0.284F, 2.6435F));
        Flowers.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.4791F, -0.5366F, -1.2511F, 0.6144F));
        Flowers.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.5791F, 2.2279F, 1.0706F, 1.5237F));
        Flowers.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.6791F, 0.2902F, -0.3982F, 0.2776F));
        Flowers.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(12, 15).addBox(-3.0F, 0.0F, 0.0F, 3.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3072F, -6.6996F, 2.7791F, -2.3417F, -0.6303F, 2.362F));

        // Note: The bone3, bone2, and bone elements from Blockbench were empty containers
        // and were causing z-fighting. They've been removed.
        // Their geometry (if any) was already included in the main cube definitions above.

        PartDefinition LeavesAndStems = Plant.addOrReplaceChild("LeavesAndStems", CubeListBuilder.create(), PartPose.offset(6.656F, -6.3F, 4.7053F));

        LeavesAndStems.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(12, 4).addBox(-3.9F, 0.0F, -8.4F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.7F, 0.0F, 0.0F, 1.1781F, 0.0F));
        LeavesAndStems.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(3, 12).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6609F, 6.1F, -3.3752F, 0.0445F, 0.2355F, 0.0047F));
        LeavesAndStems.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 4).addBox(-4.5F, 0.0F, -7.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.4792F, 3.7297F, -0.3415F, -0.686F, -1.3053F, 0.3852F));
        LeavesAndStems.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(3, 12).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9923F, 7.9F, 0.0262F, -2.8473F, -0.8192F, 2.67F));
        LeavesAndStems.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(12, 4).addBox(-3.9F, 0.0F, -8.1F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9658F, 2.7546F, -8.7042F, 2.8798F, 0.3491F, -3.1416F));
        LeavesAndStems.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(21, 19).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1455F, 14.2761F, -6.0605F, 2.94F, 0.0511F, -3.0674F));
        LeavesAndStems.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(21, 19).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9302F, 11.8187F, 1.6292F, -0.2188F, 0.5632F, -0.2862F));
        LeavesAndStems.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(21, 19).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.876F, 12.1482F, -4.4549F, 0.1281F, -1.3478F, -0.3413F));

        PartDefinition LeavesAndStems2 = LeavesAndStems.addOrReplaceChild("LeavesAndStems2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 1.0F, 0.0F, 0.0F, 1.1345F, 0.0F));

        LeavesAndStems2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(12, 4).addBox(-3.9F, 0.7F, -8.4F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.1781F, 0.0F));
        LeavesAndStems2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(3, 12).addBox(-2.9968F, -5.3007F, -0.0304F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6609F, 5.4F, -3.3752F, 0.0445F, 0.2355F, 0.0047F));
        LeavesAndStems2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 4).addBox(-4.431F, 0.6627F, -7.2855F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.6791F, 3.0297F, -0.3415F, -0.686F, -1.3053F, 0.3852F));
        LeavesAndStems2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(3, 12).addBox(-2.7828F, -5.3358F, 0.0415F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9923F, 7.2F, 0.0262F, -2.8473F, -0.8192F, 2.67F));
        LeavesAndStems2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(12, 4).addBox(-3.9F, 0.6761F, -7.9188F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9658F, 2.0546F, -8.7042F, 2.8798F, 0.3491F, -3.1416F));
        LeavesAndStems2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(21, 19).addBox(2.9482F, -11.3166F, -5.8576F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1455F, 13.5761F, -6.0605F, 2.94F, 0.0511F, -3.0674F));

        PartDefinition LeavesAndStems3 = LeavesAndStems.addOrReplaceChild("LeavesAndStems3", CubeListBuilder.create(), PartPose.offsetAndRotation(-15.0F, 2.7F, 4.0F, -2.9926F, -0.6351F, 2.8194F));

        LeavesAndStems3.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(12, 4).addBox(-3.8608F, 0.6762F, -8.2231F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.1781F, 0.0F));
        LeavesAndStems3.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(3, 12).addBox(-2.8308F, -5.3221F, 0.0429F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6609F, 5.4F, -3.3752F, 0.0445F, 0.2355F, 0.0047F));
        LeavesAndStems3.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(12, 4).addBox(-4.3596F, 0.6841F, -7.4523F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-12.4791F, 3.0297F, -0.3415F, -0.686F, -1.3053F, 0.3852F));
        LeavesAndStems3.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(3, 12).addBox(-2.8758F, -5.3208F, -0.1151F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9923F, 7.2F, 0.0262F, -2.8473F, -0.8192F, 2.67F));
        LeavesAndStems3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(12, 4).addBox(-4.0784F, 0.645F, -7.8946F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.9658F, 2.0546F, -8.7042F, 2.8798F, 0.3491F, -3.1416F));
        LeavesAndStems3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(21, 19).addBox(2.7706F, -11.3484F, -5.887F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1455F, 13.5761F, -6.0605F, 2.94F, 0.0511F, -3.0674F));

        return LayerDefinition.create(meshdefinition, 94, 94);
    }

    /**
     * Renders flowers without tint (white) and leaves/stems with biome tint.
     * biomeColor is an RGB int from BiomeColors (no alpha).
     */
    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                     int packedLight, int packedOverlay, int biomeColor) {
        int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);
        flowers.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        leavesAndStems.render(poseStack, buffer, packedLight, packedOverlay, tint);
    }

    @Override
    public void setupAnim(T entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay, int color) {
        flowers.render(poseStack, vertexConsumer, packedLight, packedOverlay);
        leavesAndStems.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
    }


}