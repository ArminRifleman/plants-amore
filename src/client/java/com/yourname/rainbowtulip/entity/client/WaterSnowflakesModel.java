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

        PartDefinition WaterSnowflakes = partdefinition.addOrReplaceChild("WaterSnowflakes", CubeListBuilder.create(), PartPose.offset(3.0837F, 25.5F, 2.6679F));

        PartDefinition Plant = WaterSnowflakes.addOrReplaceChild("Plant", CubeListBuilder.create(), PartPose.offset(-0.8433F, 1.1F, -7.7101F));

        PartDefinition Flowers = Plant.addOrReplaceChild("Flowers", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition cube_r1 = Flowers.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.7717F, -0.9727F, 0.1696F, -1.1503F, 0.2765F));

        PartDefinition cube_r2 = Flowers.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.7717F, -0.9727F, 0.9121F, 0.8361F, 0.7534F));

        PartDefinition cube_r3 = Flowers.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.7717F, -0.9727F, -3.0877F, -0.0024F, 2.9594F));

        PartDefinition cube_r4 = Flowers.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.8717F, -0.9727F, 0.5699F, -0.2515F, 0.5174F));

        PartDefinition cube_r5 = Flowers.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.8717F, -0.9727F, -2.4351F, -0.8571F, 2.7455F));

        PartDefinition cube_r6 = Flowers.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7887F, -4.8717F, -0.9727F, 2.6515F, 0.786F, 2.2083F));

        PartDefinition cube_r7 = Flowers.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.1107F, 4.2587F, -2.8196F, 0.5429F, 2.7774F));

        PartDefinition cube_r8 = Flowers.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.1107F, 4.2587F, -1.1945F, -1.1217F, 1.2902F));

        PartDefinition cube_r9 = Flowers.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.1107F, 4.2587F, 0.2145F, 0.5982F, 0.0246F));

        PartDefinition cube_r10 = Flowers.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.2107F, 4.2587F, -2.2957F, -0.2993F, 2.4099F));

        PartDefinition cube_r11 = Flowers.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.2107F, 4.2587F, 1.759F, 1.281F, 1.1493F));

        PartDefinition cube_r12 = Flowers.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0969F, -6.2107F, 4.2587F, 0.0478F, -0.3596F, 0.4226F));

        PartDefinition cube_r13 = Flowers.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.8996F, 2.1791F, 0.5108F, 0.6631F, 0.1419F));

        PartDefinition cube_r14 = Flowers.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.8996F, 2.1791F, -2.9887F, 0.284F, 2.6435F));

        PartDefinition cube_r15 = Flowers.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(7, 9).addBox(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.8996F, 2.1791F, -0.5366F, -1.2511F, 0.6144F));

        PartDefinition cube_r16 = Flowers.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.9996F, 2.1791F, 2.2279F, 1.0706F, 1.5237F));

        PartDefinition cube_r17 = Flowers.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.9996F, 2.1791F, 0.2902F, -0.3982F, 0.2776F));

        PartDefinition cube_r18 = Flowers.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(7, 9).addBox(-2.1F, 0.0F, 0.1F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5072F, -6.9996F, 2.1791F, -2.3417F, -0.6303F, 2.362F));

        // Use exact child name expected by the constructor: "LeavesAndStems"
        PartDefinition LeavesAndStems = Plant.addOrReplaceChild("LeavesAndStems", CubeListBuilder.create(), PartPose.offset(6.656F, -6.3F, 4.7053F));

        PartDefinition cube_r19 = LeavesAndStems.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(13, 11).addBox(0.391F, -12.1611F, -7.8888F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8238F, 14.7394F, 5.3361F, -0.3969F, 0.572F, -0.4003F));

        PartDefinition cube_r20 = LeavesAndStems.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(6, 2).addBox(-6.9586F, -0.0877F, -9.1185F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9562F, 2.5179F, 6.5512F, -0.3868F, 0.2892F, -0.2692F));

        PartDefinition cube_r21 = LeavesAndStems.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1, 7).addBox(-3.179F, -5.7993F, -3.2646F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0236F, 7.8736F, -1.0296F, 1.2396F, 1.3683F, 1.0803F));

        PartDefinition cube_r22 = LeavesAndStems.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(6, 2).addBox(-2.0345F, 0.0481F, -9.5782F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5694F, 2.4303F, -3.4937F, 2.9026F, 0.689F, 2.8787F));

        PartDefinition cube_r23 = LeavesAndStems.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(1, 7).addBox(-0.9088F, -5.9586F, 2.5209F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.295F, 7.131F, 3.6669F, -2.9071F, -0.8666F, 2.7589F));

        PartDefinition cube_r24 = LeavesAndStems.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(6, 2).addBox(-4.7267F, -0.3483F, -5.3024F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.6035F, 2.7449F, 3.2039F, -0.4563F, -1.2961F, 0.2081F));

        PartDefinition cube_r25 = LeavesAndStems.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(13, 11).addBox(4.4655F, -12.0774F, -3.1284F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.4221F, 14.5761F, 0.2895F, 2.7975F, -1.078F, -2.9845F));

        PartDefinition cube_r26 = LeavesAndStems.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(6, 2).addBox(-1.6373F, -0.1993F, -5.8108F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.7421F, 3.0546F, -0.9906F, 2.8798F, -0.7854F, -3.1416F));

        PartDefinition cube_r27 = LeavesAndStems.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1, 7).addBox(-4.0791F, -5.0941F, 2.9572F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5313F, 8.2F, 6.3482F, -0.6448F, -1.0354F, 0.6535F));

        PartDefinition cube_r28 = LeavesAndStems.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(6, 2).addBox(-7.588F, 0.4878F, -6.7085F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8453F, 4.0297F, 10.4406F, -0.332F, -0.1886F, 0.1005F));

        PartDefinition cube_r29 = LeavesAndStems.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(1, 7).addBox(-3.6351F, -5.4338F, -3.1632F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.7835F, 6.4F, 0.9852F, 0.0658F, 1.3699F, 0.0229F));

        PartDefinition cube_r30 = LeavesAndStems.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(6, 2).addBox(-1.7381F, 0.4F, -10.7593F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.6F, 1.0F, 0.0F, -3.1416F, 0.829F, 3.1416F));

        PartDefinition cube_r31 = LeavesAndStems.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(6, 2).addBox(-3.6496F, 0.0F, -3.0918F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2F, 0.4F, -1.8F, 0.0F, -0.1309F, 0.0F));

        PartDefinition cube_r32 = LeavesAndStems.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1, 7).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.8609F, 6.1F, -3.3752F, 0.0445F, 0.2355F, 0.0047F));

        PartDefinition cube_r33 = LeavesAndStems.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(6, 2).addBox(-4.5F, 0.0F, -7.5F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.6791F, 3.4297F, -0.3415F, -0.686F, -1.3053F, 0.3852F));

        PartDefinition cube_r34 = LeavesAndStems.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(1, 7).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.1923F, 7.9F, 0.0262F, -2.8473F, -0.8192F, 2.67F));

        PartDefinition cube_r35 = LeavesAndStems.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(6, 2).addBox(-3.9F, 0.0F, -8.1F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.1658F, 2.4546F, -8.7042F, 2.8798F, 0.3491F, -3.1416F));

        PartDefinition cube_r36 = LeavesAndStems.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(13, 11).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.3455F, 13.9761F, -6.0605F, 2.94F, 0.0511F, -3.0674F));

        PartDefinition cube_r37 = LeavesAndStems.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(13, 11).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5302F, 12.6187F, 1.4292F, -0.2188F, 0.5632F, -0.2862F));

        // Removed duplicated addBox call which could corrupt the model definition
        PartDefinition cube_r38 = LeavesAndStems.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(13, 11).addBox(3.0F, -12.0F, -6.0F, 0.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.076F, 11.8482F, -4.4549F, 0.1281F, -1.3478F, -0.3413F));

        PartDefinition cube_r39 = LeavesAndStems.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(1, 7).addBox(-3.0F, -6.0F, 0.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.856F, 7.0F, -4.7053F, 2.4179F, 1.2062F, 2.4986F));

        return LayerDefinition.create(meshdefinition, 32, 32);
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