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

public class WaterPoppiesModel<T extends Entity> extends EntityModel<T> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip", "water_poppies"), "main");

    // Top-level groups for split rendering
    private final ModelPart flowers;
    private final ModelPart leavesGroup;

    public WaterPoppiesModel(ModelPart root) {
        ModelPart poppies = root.getChild("Poppies");
        this.flowers    = poppies.getChild("Flowers");
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
        Petal3.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal5 = Flower2.addOrReplaceChild("Petal5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.0F, -2.1817F, 0.0F));
        Petal5.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));
        Petal5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal6 = Flower2.addOrReplaceChild("Petal6", CubeListBuilder.create(), PartPose.offset(0.7F, 0.05F, 0.85F));
        Petal6.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8901F, 0.0F));
        Petal6.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4F, 1.0F, 0.2151F, -0.0283F, 0.2164F));

        PartDefinition Flower = Flowers.addOrReplaceChild("Flower", CubeListBuilder.create(), PartPose.offset(3.25F, -2.05F, -2.8F));
        Flower.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.45F, 0.4F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Petal4 = Flower.addOrReplaceChild("Petal4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));
        Petal4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));
        Petal4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal2 = Flower.addOrReplaceChild("Petal2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.0F, -2.1817F, 0.0F));
        Petal2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));
        Petal2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal = Flower.addOrReplaceChild("Petal", CubeListBuilder.create(), PartPose.offset(0.7F, 0.05F, 0.85F));
        Petal.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8901F, 0.0F));
        Petal.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4F, 1.0F, 0.2151F, -0.0283F, 0.2164F));

        PartDefinition Flower3 = Flowers.addOrReplaceChild("Flower3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4111F, -1.7991F, -5.5346F, 1.4027F, 1.2928F, 1.1112F));
        Flower3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 0).addBox(-1.0F, -3.0F, 0.0F, 0.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2F, 2.45F, 0.4F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Petal7 = Flower3.addOrReplaceChild("Petal7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.9635F, 0.0F));
        Petal7.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));
        Petal7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal8 = Flower3.addOrReplaceChild("Petal8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.1F, 0.0F, -2.1817F, 0.0F));
        Petal8.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.6F, 0.05F, 0.75F, 0.0F, -0.8901F, 0.0F));
        Petal8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.2F, -0.35F, 1.75F, 0.2151F, -0.0283F, 0.2164F));
        PartDefinition Petal9 = Flower3.addOrReplaceChild("Petal9", CubeListBuilder.create(), PartPose.offset(0.7F, 0.05F, 0.85F));
        Petal9.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(1, 12).addBox(-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.8901F, 0.0F));
        Petal9.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(-1, 8).addBox(-2.0F, 0.0F, -2.0F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -0.4F, 1.0F, 0.2151F, -0.0283F, 0.2164F));

        PartDefinition Leaves_group = Poppies.addOrReplaceChild("Leaves_group", CubeListBuilder.create(), PartPose.offset(4.15F, 0.4F, -5.2F));
        PartDefinition Leafline = Leaves_group.addOrReplaceChild("Leafline", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaves = Leafline.addOrReplaceChild("Leaves", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaf5 = Leaves.addOrReplaceChild("Leaf5", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf5.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf4 = Leaves.addOrReplaceChild("Leaf4", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf4.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf3 = Leaves.addOrReplaceChild("Leaf3", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf3.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves2 = Leafline.addOrReplaceChild("Leaves2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, 4.0F, 0.0F, -2.6616F, 0.0F));
        PartDefinition Leaf6 = Leaves2.addOrReplaceChild("Leaf6", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf6.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf7 = Leaves2.addOrReplaceChild("Leaf7", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf7.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf8 = Leaves2.addOrReplaceChild("Leaf8", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves3 = Leafline.addOrReplaceChild("Leaves3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.75F, 1.0F, 0.0F, 2.3562F, 0.0F));
        PartDefinition Leaf9 = Leaves3.addOrReplaceChild("Leaf9", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf9.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf10 = Leaves3.addOrReplaceChild("Leaf10", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf10.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf11 = Leaves3.addOrReplaceChild("Leaf11", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf11.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leafline2 = Leaves_group.addOrReplaceChild("Leafline2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, -1.1345F, -0.0873F));
        PartDefinition Leaves4 = Leafline2.addOrReplaceChild("Leaves4", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaf12 = Leaves4.addOrReplaceChild("Leaf12", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf12.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf13 = Leaves4.addOrReplaceChild("Leaf13", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.2F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf13.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf14 = Leaves4.addOrReplaceChild("Leaf14", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf14.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves5 = Leafline2.addOrReplaceChild("Leaves5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, 4.0F, 0.0F, -2.6616F, 0.0F));
        PartDefinition Leaf15 = Leaves5.addOrReplaceChild("Leaf15", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf15.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf16 = Leaves5.addOrReplaceChild("Leaf16", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf16.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf17 = Leaves5.addOrReplaceChild("Leaf17", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf17.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves6 = Leafline2.addOrReplaceChild("Leaves6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.75F, 1.0F, 0.0F, 2.3562F, 0.0F));
        PartDefinition Leaf18 = Leaves6.addOrReplaceChild("Leaf18", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf18.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf19 = Leaves6.addOrReplaceChild("Leaf19", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf19.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf20 = Leaves6.addOrReplaceChild("Leaf20", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf20.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leafline3 = Leaves_group.addOrReplaceChild("Leafline3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.5F, 0.2F, 6.0F, 0.0F, 1.2654F, 0.0F));
        PartDefinition Leaves7 = Leafline3.addOrReplaceChild("Leaves7", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
        PartDefinition Leaf21 = Leaves7.addOrReplaceChild("Leaf21", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf21.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf22 = Leaves7.addOrReplaceChild("Leaf22", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf22.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf23 = Leaves7.addOrReplaceChild("Leaf23", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf23.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves8 = Leafline3.addOrReplaceChild("Leaves8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, 4.0F, 0.0F, -2.6616F, 0.0F));
        PartDefinition Leaf24 = Leaves8.addOrReplaceChild("Leaf24", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf24.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf25 = Leaves8.addOrReplaceChild("Leaf25", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf25.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf26 = Leaves8.addOrReplaceChild("Leaf26", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf26.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaves9 = Leafline3.addOrReplaceChild("Leaves9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.75F, 1.0F, 0.0F, 2.3562F, 0.0F));
        PartDefinition Leaf27 = Leaves9.addOrReplaceChild("Leaf27", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf27.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf28 = Leaves9.addOrReplaceChild("Leaf28", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.6F, -0.9F, 2.9017F, -0.6359F, 3.0187F));
        Leaf28.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf29 = Leaves9.addOrReplaceChild("Leaf29", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, 0.3F, -1.4F, 2.8798F, 1.5272F, 3.1416F));
        Leaf29.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf = Leaves_group.addOrReplaceChild("Leaf", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
        Leaf.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf2 = Leaves_group.addOrReplaceChild("Leaf2", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.15F, -0.4F, 5.2F, -0.1569F, 0.2037F, -0.1875F));
        Leaf2.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));
        PartDefinition Leaf30 = Leaves_group.addOrReplaceChild("Leaf30", CubeListBuilder.create().texOffs(-1, 0).addBox(-2.7F, -1.8F, -0.75F, 2.0F, 0.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.15F, 0.0F, 0.8F, 0.3232F, -0.5295F, -0.6793F));
        Leaf30.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(1, 4).addBox(-1.0F, -2.0F, 0.0F, 0.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0371F, -0.9426F, 0.0078F));

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