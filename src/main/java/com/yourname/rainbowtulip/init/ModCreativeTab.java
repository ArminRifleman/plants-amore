package com.yourname.rainbowtulip.init;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab {

    public static final CreativeModeTab PLANTS_AMORE_TAB = FabricItemGroup.builder()
        .title(Component.translatable("itemGroup.rainbowtulip.plants_amore"))
        .icon(() -> new ItemStack(ModBlocks.RAINBOW_TULIP.asItem()))
        .displayItems((params, output) -> {
            output.accept(ModBlocks.RAINBOW_TULIP.asItem());
        })
        .build();

    public static void register() {
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath("rainbowtulip", "plants_amore"),
            PLANTS_AMORE_TAB
        );
    }
}