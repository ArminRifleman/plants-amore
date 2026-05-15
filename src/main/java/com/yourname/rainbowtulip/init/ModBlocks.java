package com.yourname.rainbowtulip.init;

import com.yourname.rainbowtulip.block.RainbowTulipBlock;
import com.yourname.rainbowtulip.block.WaterPoppiesBlock;
import com.yourname.rainbowtulip.item.WaterPoppiesBlockItem;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {

    public static final List<Block> ALL_BLOCKS = new ArrayList<>();

    public static final Block RAINBOW_TULIP = register(
            "rainbow_tulip",
            new RainbowTulipBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.PLANT)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.GRASS)
                            .noOcclusion()
                            .isValidSpawn((s, g, p, t) -> false)
            )
    );

    public static final Block WATER_POPPIES = register(
            "water_poppies",
            new WaterPoppiesBlock(
                    BlockBehaviour.Properties.of()
                            .mapColor(MapColor.WATER)
                            .noCollission()
                            .instabreak()
                            .sound(SoundType.LILY_PAD)
                            .noOcclusion()
                            .isValidSpawn((s, g, p, t) -> false)
            )
    );

    private static Block register(String name, Block block) {
        Registry.register(BuiltInRegistries.BLOCK,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name), block);
        
        // Use custom WaterPoppiesBlockItem for water poppies
        BlockItem item;
        if (block instanceof com.yourname.rainbowtulip.block.WaterPoppiesBlock) {
            item = new WaterPoppiesBlockItem(block, new Item.Properties());
        } else {
            item = new BlockItem(block, new Item.Properties());
        }
        
        Registry.register(BuiltInRegistries.ITEM,
                ResourceLocation.fromNamespaceAndPath("rainbowtulip", name),
                item);
        ALL_BLOCKS.add(block);
        return block;
    }

    public static void register() {} // triggers class loading
}