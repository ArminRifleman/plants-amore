package com.yourname.rainbowtulip;

import com.yourname.rainbowtulip.init.ModBlockEntities;
import com.yourname.rainbowtulip.init.ModBlocks;
import com.yourname.rainbowtulip.init.ModCreativeTab;
import net.fabricmc.api.ModInitializer;

public class RainbowTulipMod implements ModInitializer {

    public static final String MOD_ID = "rainbowtulip";

    @Override
    public void onInitialize() {
        ModBlocks.register();
        ModBlockEntities.register();
        ModCreativeTab.register();
    }
}