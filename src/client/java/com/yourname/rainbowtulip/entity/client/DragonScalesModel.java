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

public class DragonScalesModel<T extends Entity> extends EntityModel<T> {
    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip", "dragon_scales"), "main");
    private final ModelPart DragonScale;
    private final ModelPart Greens;
    private final ModelPart Flower;

    public DragonScalesModel(ModelPart root) {
        this.DragonScale = root.getChild("DragonScale");
        this.Greens = this.DragonScale.getChild("Greens");
        this.Flower = this.DragonScale.getChild("Flower");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition DragonScale = partdefinition.addOrReplaceChild("DragonScale", CubeListBuilder.create(), PartPose.offset(0.0F, 24.25F, -1.0F));

        PartDefinition Greens = DragonScale.addOrReplaceChild("Greens", CubeListBuilder.create(), PartPose.offset(3.0009F, -9.5175F, -1.1881F));

        PartDefinition cube_r1 = Greens.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.3054F));

        PartDefinition cube_r2 = Greens.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.3054F));

        PartDefinition cube_r3 = Greens.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -10.0F, 1.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, 0.2182F, 0.0F, 0.3054F));

        PartDefinition cube_r4 = Greens.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9032F, 8.5658F, 3.5609F, 2.444F, -0.2431F, -2.1216F));

        PartDefinition cube_r5 = Greens.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0273F, 4.7894F, -1.1035F, -2.8977F, -0.5077F, -2.5022F));

        PartDefinition cube_r6 = Greens.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0273F, 4.7894F, -1.1035F, -0.4106F, -0.5077F, -2.5022F));

        PartDefinition cube_r7 = Greens.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9525F, 8.963F, 1.0975F, -0.7913F, 0.2498F, -0.5676F));

        PartDefinition cube_r8 = Greens.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5213F, 4.6465F, 6.1307F, 0.1486F, 0.5467F, -0.2121F));

        PartDefinition cube_r9 = Greens.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5213F, 4.6465F, 6.1307F, 2.6357F, 0.5467F, -0.2121F));

        PartDefinition cube_r10 = Greens.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5009F, 8.6175F, 1.6881F, -0.3303F, -0.1552F, -0.8504F));

        PartDefinition cube_r11 = Greens.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8954F, 4.6718F, 4.7554F, 0.4363F, 0.0F, -0.4363F));

        PartDefinition cube_r12 = Greens.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8954F, 4.6718F, 4.7554F, 2.9234F, 0.0F, -0.4363F));

        PartDefinition cube_r13 = Greens.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2009F, 9.5175F, 3.5881F, 2.7019F, -0.3125F, -2.944F));

        PartDefinition cube_r14 = Greens.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.429F, 4.2522F, 0.5552F, 3.1208F, -0.8352F, -1.0877F));

        PartDefinition cube_r15 = Greens.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.429F, 4.2522F, 0.5552F, 0.4592F, -0.8352F, -1.0877F));

        PartDefinition cube_r16 = Greens.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, -0.4136F, 0.1841F, -0.1912F));

        PartDefinition cube_r17 = Greens.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 3.5522F, 5.2998F, -0.941F, 0.9208F, 2.7092F));

        PartDefinition cube_r18 = Greens.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 3.5522F, 5.2998F, 2.6805F, 0.9208F, 2.7092F));

        PartDefinition cube_r19 = Greens.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, -0.7772F, 0.2709F, 0.0126F));

        PartDefinition cube_r20 = Greens.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.068F, 5.8595F, 6.7473F, -0.3874F, 0.8265F, -2.8578F));

        PartDefinition cube_r21 = Greens.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-3, 0).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.068F, 5.8595F, 6.7473F, -3.049F, 0.8265F, -2.8578F));

        PartDefinition cube_r22 = Greens.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(6, 3).addBox(0.0F, -14.0261F, 1.2989F, 2.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.0009F, 9.18F, 1.1832F, -0.0873F, 0.0F, 0.0F));

        PartDefinition Flower = DragonScale.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offset(-2.4F, -13.3528F, 1.5353F));

        PartDefinition cube_r23 = Flower.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(15, 4).addBox(5.2561F, 2.8636F, -5.7444F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -2.4411F, 0.0918F, -0.6264F));

        PartDefinition cube_r24 = Flower.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(15, 4).addBox(6.1114F, 1.2697F, -5.6991F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 1.2602F, -0.5118F, -2.1447F, -0.0187F, -0.8766F));

        PartDefinition cube_r25 = Flower.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(14, 0).addBox(-1.4494F, 0.664F, 7.6035F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.0109F, -0.7727F, 0.8193F, 1.9928F, 1.1372F, 0.258F));

        PartDefinition cube_r26 = Flower.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(14, 0).addBox(-4.5789F, -8.9588F, 0.7994F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.814F, -0.6812F, 0.7058F, -2.5987F, -0.4716F, 2.609F));

        PartDefinition cube_r27 = Flower.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 2).addBox(6.817F, -6.6196F, -0.0006F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0733F, -0.4254F, 1.4922F, 0.3785F, -0.217F, -0.8166F));

        PartDefinition cube_r28 = Flower.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(14, 0).addBox(0.2862F, -10.1146F, 0.2166F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.814F, -0.6812F, 0.7058F, -3.1379F, -1.1134F, -2.9685F));

        PartDefinition cube_r29 = Flower.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 0).addBox(5.4894F, -7.111F, 2.0933F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.814F, -0.6812F, 0.7058F, 1.4871F, -0.771F, -1.1166F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                    int packedLight, int packedOverlay, int biomeColor) {
        int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);
        Flower.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        Greens.render(poseStack, buffer, packedLight, packedOverlay, tint);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay, int color) {
        Greens.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        Flower.render(poseStack, vertexConsumer, packedLight, packedOverlay, 0xFFFFFFFF);
    }
}
