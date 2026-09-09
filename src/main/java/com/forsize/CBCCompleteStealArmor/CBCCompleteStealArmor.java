package com.forsize.CBCCompleteStealArmor;

import com.forsize.CBCCompleteStealArmor.block.ModBlocks;
import com.forsize.CBCCompleteStealArmor.item.ModCreativeTabs;
import com.forsize.CBCCompleteStealArmor.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CBCCompleteStealArmor.MOD_ID)
public class CBCCompleteStealArmor {
    public static final String MOD_ID = "cbccompletestealarmor";

    public CBCCompleteStealArmor(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}