package com.forsize.CBCCompleteStealArmor.item;

import com.forsize.CBCCompleteStealArmor.CBCCompleteStealArmor;
import com.forsize.CBCCompleteStealArmor.block.ModBlocks;
import net.minecraft.world.item.BlockItem;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS =
            DeferredRegister.createItems(CBCCompleteStealArmor.MOD_ID);

    private static DeferredItem<BlockItem> registerBlockItem(String id, net.neoforged.neoforge.registries.DeferredBlock<?> block) {
        return ITEMS.registerSimpleBlockItem(id, block);
    }

    public static final DeferredItem<BlockItem> SA_BLACK = registerBlockItem("sa_black", ModBlocks.SA_BLACK);
    public static final DeferredItem<BlockItem> SA_GRAY = registerBlockItem("sa_gray", ModBlocks.SA_GRAY);
    public static final DeferredItem<BlockItem> SA_GREEN = registerBlockItem("sa_green", ModBlocks.SA_GREEN);
    public static final DeferredItem<BlockItem> SA_SAND = registerBlockItem("sa_sand", ModBlocks.SA_SAND);
    public static final DeferredItem<BlockItem> SA_STEEL = registerBlockItem("sa_steel", ModBlocks.SA_STEEL);

    public static final DeferredItem<BlockItem> CA_BLACK = registerBlockItem("ca_black", ModBlocks.CA_BLACK);
    public static final DeferredItem<BlockItem> CA_GRAY = registerBlockItem("ca_gray", ModBlocks.CA_GRAY);
    public static final DeferredItem<BlockItem> CA_GREEN = registerBlockItem("ca_green", ModBlocks.CA_GREEN);
    public static final DeferredItem<BlockItem> CA_SAND = registerBlockItem("ca_sand", ModBlocks.CA_SAND);
    public static final DeferredItem<BlockItem> CA_STEEL = registerBlockItem("ca_steel", ModBlocks.CA_STEEL);

    public static final DeferredItem<BlockItem> CSA_BLACK = registerBlockItem("csa_black", ModBlocks.CSA_BLACK);
    public static final DeferredItem<BlockItem> CSA_GRAY = registerBlockItem("csa_gray", ModBlocks.CSA_GRAY);
    public static final DeferredItem<BlockItem> CSA_GREEN = registerBlockItem("csa_green", ModBlocks.CSA_GREEN);
    public static final DeferredItem<BlockItem> CSA_SAND = registerBlockItem("csa_sand", ModBlocks.CSA_SAND);
    public static final DeferredItem<BlockItem> CSA_STEEL = registerBlockItem("csa_steel", ModBlocks.CSA_STEEL);

    public static final DeferredItem<BlockItem> NSA_BLACK = registerBlockItem("nsa_black", ModBlocks.NSA_BLACK);
    public static final DeferredItem<BlockItem> NSA_GRAY = registerBlockItem("nsa_gray", ModBlocks.NSA_GRAY);
    public static final DeferredItem<BlockItem> NSA_GREEN = registerBlockItem("nsa_green", ModBlocks.NSA_GREEN);
    public static final DeferredItem<BlockItem> NSA_SAND = registerBlockItem("nsa_sand", ModBlocks.NSA_SAND);
    public static final DeferredItem<BlockItem> NSA_STEEL = registerBlockItem("nsa_steel", ModBlocks.NSA_STEEL);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}