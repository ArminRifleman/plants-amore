package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.block.RainbowTulipBlock;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

public class ModBlocks {

    public static final Block RAINBOW_TULIP = register("rainbow_tulip",
            new RainbowTulipBlock(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.PLANT)
                    .noCollission()
                    .instabreak()
                    .sound(SoundType.GRASS)
                    .noOcclusion()
                    .isValidSpawn((s, g, p, t) -> false)
            )
    );

    private static Block register(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name), block);
        Registry.register(BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                new BlockItem(block, new Item.Properties()));
        return block;
    }

    public static void register() {} // just triggers class loading
}