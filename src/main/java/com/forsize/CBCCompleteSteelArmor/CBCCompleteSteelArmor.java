package com.forsize.CBCCompleteSteelArmor;

import com.forsize.CBCCompleteSteelArmor.block.ModBlocks;
import com.forsize.CBCCompleteSteelArmor.item.ModCreativeTabs;
import com.forsize.CBCCompleteSteelArmor.item.ModItems;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(CBCCompleteSteelArmor.MOD_ID)
public class CBCCompleteSteelArmor {
    public static final String MOD_ID = "cbccompletesteelarmor";

    public CBCCompleteSteelArmor(IEventBus modEventBus, ModContainer modContainer) {
        ModBlocks.register(modEventBus);
        ModItems.register(modEventBus);
        ModCreativeTabs.register(modEventBus);
    }
}