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
    private final ModelPart dragonScale;
    private final ModelPart greens;
    private final ModelPart flower;

    public DragonScalesModel(ModelPart root) {
        this.dragonScale = root.getChild("DragonScale");
        this.greens = this.dragonScale.getChild("Greens");
        this.flower = this.dragonScale.getChild("Flower");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition DragonScale = partdefinition.addOrReplaceChild("DragonScale", CubeListBuilder.create(), PartPose.offset(0.0F, 24.25F, -1.0F));

        PartDefinition Greens = DragonScale.addOrReplaceChild("Greens", CubeListBuilder.create(), PartPose.offset(3.0009F, -9.5175F, -1.1881F));

        Greens.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(9, 16).addBox(-4.6208F, -1.7337F, 0.4478F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -2.9F, 4.6F, 2.6409F, 0.1753F, 0.5441F));

        Greens.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(15, 16).addBox(-4.6208F, 1.3311F, -1.1978F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.8F, -2.9F, 4.6F, -0.0207F, 0.1753F, 0.5441F));

        Greens.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(15, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.48F, 0.0F, 0.3054F));

        Greens.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 3).addBox(-9.9726F, -0.6581F, 0.8145F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.356F, 8.1289F, 3.7524F, 3.1011F, 0.0408F, 0.7903F));

        Greens.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 3).addBox(-5.383F, -7.6793F, -1.2643F, 2.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.356F, 8.1289F, 3.7524F, -0.1231F, -0.0447F, -0.3463F));

        Greens.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1416F, 0.0F, 0.3054F));

        Greens.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 3).addBox(-1.0F, -10.0F, 1.0F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, 0.2182F, 0.0F, 0.3054F));

        Greens.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.9032F, 8.5658F, 3.5609F, 2.444F, -0.2431F, -2.1216F));

        Greens.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(17, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0273F, 4.7894F, -1.1035F, -2.8977F, -0.5077F, -2.5022F));

        Greens.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0273F, 4.7894F, -1.1035F, -0.4106F, -0.5077F, -2.5022F));

        Greens.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9525F, 8.963F, 1.0975F, -0.7913F, 0.2498F, -0.5676F));

        Greens.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(17, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5213F, 4.6465F, 6.1307F, 0.1486F, 0.5467F, -0.2121F));

        Greens.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.5213F, 4.6465F, 6.1307F, 2.6357F, 0.5467F, -0.2121F));

        Greens.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5009F, 8.6175F, 1.6881F, -0.3303F, -0.1552F, -0.8504F));

        Greens.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(17, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8954F, 4.6718F, 4.7554F, 0.4363F, 0.0F, -0.4363F));

        Greens.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(11, 6).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.8954F, 4.6718F, 4.7554F, 2.9234F, 0.0F, -0.4363F));

        Greens.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.2009F, 9.5175F, 3.5881F, 2.7019F, -0.3125F, -2.944F));

        Greens.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.429F, 4.2521F, 0.5553F, 3.1208F, -0.8352F, -1.0877F));

        Greens.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(15, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.429F, 4.2521F, 0.5553F, 0.4592F, -0.8352F, -1.0877F));

        Greens.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, -0.4136F, 0.1841F, -0.1912F));

        Greens.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 3.5521F, 5.2998F, -0.941F, 0.9208F, 2.7092F));

        Greens.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(15, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.9F, 3.5521F, 5.2998F, 2.6805F, 0.9208F, 2.7092F));

        Greens.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(0, 7).addBox(-1.1775F, -6.5829F, 0.7512F, 2.0F, 10.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0009F, 9.5175F, 1.1881F, -0.7772F, 0.2709F, 0.0126F));

        Greens.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.068F, 5.8595F, 6.7473F, -0.3874F, 0.8265F, -2.8578F));

        Greens.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(15, 16).addBox(-4.0F, 0.0F, 0.0F, 6.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.068F, 5.8595F, 6.7473F, -3.049F, 0.8265F, -2.8578F));

        PartDefinition Flower = DragonScale.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offsetAndRotation(2.7F, -10.3528F, 1.5353F, -3.1416F, -0.3927F, -3.0107F));

        Flower.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(15, 4).addBox(6.2668F, 10.0663F, -9.328F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5943F, 11.3249F, 1.629F, -2.3507F, 0.1733F, -0.5647F));

        Flower.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(15, 4).addBox(8.9F, 6.0266F, -8.776F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9943F, 10.9249F, 1.529F, -2.0785F, 0.0827F, -0.8247F));

        Flower.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(14, 0).addBox(-2.3805F, -1.0028F, 15.5891F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7943F, 11.1249F, 1.529F, 2.2626F, 1.1054F, 0.551F));

        Flower.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(14, 0).addBox(-6.1793F, -15.5158F, 5.4828F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7943F, 11.1249F, 1.529F, -2.7113F, -0.5423F, 2.7135F));

        Flower.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(15, 2).addBox(9.3027F, -14.217F, 1.8848F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7943F, 11.1249F, 1.529F, 0.451F, -0.1192F, -0.779F));

        Flower.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(14, 0).addBox(1.053F, -16.9543F, 4.702F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7943F, 11.1249F, 1.529F, 2.8803F, -1.0921F, -2.682F));

        Flower.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(14, 0).addBox(8.457F, -12.2725F, 7.7539F, 1.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.7943F, 11.1249F, 1.529F, 1.5376F, -0.656F, -1.0999F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                    int packedLight, int packedOverlay, int biomeColor) {
        int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);
        flower.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        greens.render(poseStack, buffer, packedLight, packedOverlay, tint);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {

    }

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer,
                               int packedLight, int packedOverlay, int color) {
        greens.render(poseStack, vertexConsumer, packedLight, packedOverlay, color);
        flower.render(poseStack, vertexConsumer, packedLight, packedOverlay, 0xFFFFFFFF);
    }
}
