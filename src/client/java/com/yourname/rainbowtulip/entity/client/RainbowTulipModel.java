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

public class RainbowTulipModel extends EntityModel<Entity> {

    public static final ModelLayerLocation LAYER_LOCATION =
            new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("rainbowtulip", "rainbow_tulip"), "main");

    // Tinted with biome grass color
    private final ModelPart Stems;
    private final ModelPart Tiny_leaves_tips;
    private final ModelPart LeafTips;

    // Untinted
    private final ModelPart Tulips;
    private final ModelPart LeafStarts;
    private final ModelPart TinyLeaves;
    private final ModelPart bb_main;

    public RainbowTulipModel(ModelPart root) {
        this.Stems           = root.getChild("Stems");
        this.Tulips          = root.getChild("Tulips");
        this.LeafStarts      = root.getChild("Leaf starts");
        this.TinyLeaves      = root.getChild("Tiny leaves");
        this.Tiny_leaves_tips = root.getChild("Tiny_leaves_tips");
        this.LeafTips        = root.getChild("Leaf tips");
        this.bb_main         = root.getChild("bb_main");
    }

    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition Stems = partdefinition.addOrReplaceChild("Stems", CubeListBuilder.create(), PartPose.offset(-2.4997F, 25.0345F, 1.442F));
        Stems.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(23, 1).addBox(-1.9846F, -14.9341F, -1.4109F, 4.0F, 11.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0125F, -1.2987F, 0.0638F));
        Stems.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(27, 0).addBox(-2.0F, -14.1F, -1.0F, 4.0F, 15.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.1614F, -6.7138F, 0.7112F, 0.0F, 0.5236F, 0.0F));

        PartDefinition Tulips = partdefinition.addOrReplaceChild("Tulips", CubeListBuilder.create(), PartPose.offset(-1.3535F, 13.5001F, -2.098F));

        PartDefinition bone5 = Tulips.addOrReplaceChild("bone5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 3.1291F, 1.2987F, -3.0778F));
        bone5.addOrReplaceChild("cube_r3",  CubeListBuilder.create().texOffs(20, 26).addBox(-1.704F,   -5.824F,   2.92F,   4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone5.addOrReplaceChild("cube_r4",  CubeListBuilder.create().texOffs(26, 16).addBox(-1.1356F,  -7.424F,   1.0824F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone5.addOrReplaceChild("cube_r5",  CubeListBuilder.create().texOffs(12, 24).addBox(-2.184F,   -10.9875F, 2.1924F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone5.addOrReplaceChild("cube_r6",  CubeListBuilder.create().texOffs(12, 24).addBox(-2.3799F,  -10.9876F, 0.041F,  3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone5.addOrReplaceChild("cube_r7",  CubeListBuilder.create().texOffs(22, 15).addBox(-4.1804F,  -4.6795F,  -2.5173F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0F, 1.1F, 0.0F, -0.6981F, 0.0F, 1.9635F));
        bone5.addOrReplaceChild("cube_r8",  CubeListBuilder.create().texOffs(20, 26).addBox(-1.8853F,  -0.3066F,  3.1169F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone5.addOrReplaceChild("cube_r9",  CubeListBuilder.create().texOffs(26, 16).addBox(-0.8458F,  -7.424F,   1.0376F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 26).addBox(-1.9691F,  -0.4771F,  3.3202F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone4 = Tulips.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5373F, -1.9108F, 6.458F, 0.0125F, -1.2987F, 0.0638F));
        bone4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(20, 26).addBox(-2.483F,   -2.4838F, 0.6137F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(26, 16).addBox(-0.5536F,  -3.3358F, 0.907F,  3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(12, 24).addBox(-1.0212F,  -7.4376F, 0.4235F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(12, 24).addBox(-0.436F,   -7.4376F, 0.879F,  3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(22, 15).addBox(-0.3962F,  -6.3832F, -3.9529F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.3F, 0.8F, -0.5F, -0.7418F, 0.0F, 1.9635F));
        bone4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(20, 26).addBox(-2.2054F,  -3.7705F, 0.8849F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(26, 16).addBox(-1.3814F,  -3.3358F, 0.7501F, 3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(20, 26).addBox(-2.233F,   -3.2569F, 0.2728F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone12 = Tulips.addOrReplaceChild("bone12", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.4427F, -6.7793F, 4.8621F, 3.1416F, -0.5236F, 3.1416F));
        bone12.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0379F, -2.2633F, 0.4844F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone12.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone12.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 0.7107F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone12.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 1.2893F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone12.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(22, 15).addBox(-0.1685F, -6.2539F, -3.2327F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6F, 0.8F, -1.1F, -0.7418F, 0.0F, 1.9635F));
        bone12.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone12.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone12.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition bone8 = Tulips.addOrReplaceChild("bone8", CubeListBuilder.create(), PartPose.offsetAndRotation(3.473F, -8.7793F, 1.9085F, 0.0F, 0.5236F, 0.0F));
        bone8.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0379F, -2.2633F, 0.4844F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.0F,  0.0F,  2.4435F, -1.5272F, -1.8326F));
        bone8.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1F, 0.1F, -1.4F, 0.0F, 1.309F, 0.0F));
        bone8.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 0.7107F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.2F, 0.7F, -0.4F, 0.0F, -0.6981F, 0.5236F));
        bone8.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(12, 24).addBox(-0.6553F, -7.2206F, 1.2893F, 3.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.2F, 0.0F, -1.7F, 0.0F, 0.6981F, 0.5236F));
        bone8.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(22, 15).addBox(-0.1685F, -6.2732F, -3.2097F, 0.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, 0.6F, -0.8F, -0.6545F, 0.0F, 1.9635F));
        bone8.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.6F, -0.2F, -1.4F, 2.4435F, -0.5236F, 0.0F));
        bone8.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(26, 16).addBox(-1.0F,    -3.1F,    1.0F,    3.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,  0.1F,  0.1F,  0.0F, -1.0472F, 0.0F));
        bone8.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(20, 26).addBox(-2.0F,    -3.6894F, 0.4215F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.1F, -0.2F, 1.0F, -0.6981F, -0.48F, 3.1416F));

        PartDefinition LeafStarts = partdefinition.addOrReplaceChild("Leaf starts", CubeListBuilder.create(), PartPose.offset(-1.6674F, 21.513F, -1.5612F));
        LeafStarts.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(8, 7).addBox(-2.797F,  -5.1672F, 1.2743F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,      0.0F,     0.0F,    0.6746F,  1.3012F,  1.0095F));
        LeafStarts.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(8, 7).addBox(-4.1962F, -4.9805F, 0.4526F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.9353F,  -0.2125F, 3.8181F, -0.7843F, -0.2859F, 0.3814F));
        LeafStarts.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(8, 7).addBox(-3.4086F, -4.614F,  0.9542F, 6.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3604F,  -2.4923F, 4.5047F, 2.7548F, -1.3566F,  3.0467F));

        PartDefinition TinyLeaves = partdefinition.addOrReplaceChild("Tiny leaves", CubeListBuilder.create(), PartPose.offset(-0.4383F, 19.6588F, 2.1751F));
        TinyLeaves.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(7, 20).addBox(-2.092F,  -2.2754F, -0.0259F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,     0.0F,    0.0F,    -1.3398F, -0.6208F, -1.1819F));
        TinyLeaves.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(7, 20).addBox(-0.8229F, -0.9018F, 0.1245F,  4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.7549F,  0.7233F, -0.8044F, -1.1514F, 0.9873F,   0.0305F));
        TinyLeaves.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(7, 20).addBox(-1.4324F, -3.2572F, -3.3835F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7969F, 4.3198F, -1.2208F, 1.7969F, -0.3849F,  -3.0729F));
        TinyLeaves.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(7, 20).addBox(0.308F,   -1.6943F, 2.4185F,  4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.1895F, 0.7122F, -2.8874F, -0.1776F, -0.6534F,  -1.6145F));
        TinyLeaves.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(7, 20).addBox(-2.0616F, -3.954F,  1.7569F,  4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0497F, 1.3366F, -3.1132F, -0.3976F, 0.6986F,   0.2124F));

        PartDefinition Tiny_leaves_tips = partdefinition.addOrReplaceChild("Tiny_leaves_tips", CubeListBuilder.create(), PartPose.offset(-0.4383F, 19.6588F, 16.1751F));
        Tiny_leaves_tips.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(7, 16).addBox(-1.8697F, -3.1242F, -0.0336F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.9797F, 1.1115F,  -12.4246F, -0.9035F, -0.6208F, -1.1819F));
        Tiny_leaves_tips.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(7, 16).addBox(-1.9581F, -3.0663F, -0.0381F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0776F,  0.5718F,  -15.2948F, -1.8059F, 0.9873F,  0.0305F));
        Tiny_leaves_tips.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(7, 16).addBox(-2.09F,   -2.9985F, -0.0789F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.0459F, 0.2735F,  -17.2305F, 2.2333F, -0.3849F, -3.0729F));
        Tiny_leaves_tips.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(7, 16).addBox(-2.4139F, -3.0162F, -0.0521F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.4254F, 0.2633F,  -13.0665F, 0.346F,  -0.6534F, -1.6145F));
        Tiny_leaves_tips.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(7, 16).addBox(-2.9155F, -2.782F,  -0.1952F, 4.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.2636F,  -1.2098F, -15.2237F, 0.3441F, 0.6986F,  0.2124F));

        PartDefinition LeafTips = partdefinition.addOrReplaceChild("Leaf tips", CubeListBuilder.create(), PartPose.offset(-5.0899F, 13.2207F, 1.3625F));
        LeafTips.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(9, 0).addBox(-1.8138F, -7.0693F, 2.3353F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F,    0.0F,    0.0F,    1.184F,  -1.3566F, 3.0467F));
        LeafTips.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(9, 0).addBox(-0.797F,  -7.2743F, 1.8328F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.5266F, 1.9053F, -3.068F,  -0.8962F, 1.3012F,  1.0095F));
        LeafTips.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(9, 0).addBox(-2.1962F, -6.4526F, 2.0195F, 6.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.7334F, 3.1884F, 6.0066F, -2.3551F, -0.2859F, 0.3814F));

        PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
        bb_main.addOrReplaceChild("Root stem_r1", CubeListBuilder.create().texOffs(2, 14).addBox(1.0F, -4.8F, -1.0F, 0.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8F, -0.2806F, 1.1134F, 0.0F, 0.3142F, 0.0F));

        return LayerDefinition.create(meshdefinition, 32, 32);
    }

    @Override
    public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount,
                          float ageInTicks, float netHeadYaw, float headPitch) {}

    @Override
    public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer,
                               int packedLight, int packedOverlay, int color) {
        Stems.render(poseStack, buffer, packedLight, packedOverlay, color);
        Tulips.render(poseStack, buffer, packedLight, packedOverlay, color);
        LeafStarts.render(poseStack, buffer, packedLight, packedOverlay, color);
        TinyLeaves.render(poseStack, buffer, packedLight, packedOverlay, color);
        Tiny_leaves_tips.render(poseStack, buffer, packedLight, packedOverlay, color);
        LeafTips.render(poseStack, buffer, packedLight, packedOverlay, color);
        bb_main.render(poseStack, buffer, packedLight, packedOverlay, color);
    }

    public void renderWithBiomeTint(PoseStack poseStack, VertexConsumer buffer,
                                    int packedLight, int packedOverlay, int biomeColor) {
        int tint = 0xFF000000 | (biomeColor & 0xFFFFFF);

        // Tinted: Stems, Tiny_leaves_tips, Leaf tips
        Stems.render(poseStack, buffer, packedLight, packedOverlay, tint);
        Tiny_leaves_tips.render(poseStack, buffer, packedLight, packedOverlay, tint);
        LeafTips.render(poseStack, buffer, packedLight, packedOverlay, tint);

        // Untinted: Tulips, Leaf starts, Tiny leaves, bb_main
        Tulips.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        LeafStarts.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        TinyLeaves.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
        bb_main.render(poseStack, buffer, packedLight, packedOverlay, 0xFFFFFFFF);
    }
}