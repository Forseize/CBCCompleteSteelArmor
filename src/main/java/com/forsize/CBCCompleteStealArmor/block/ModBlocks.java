package com.forsize.CBCCompleteStealArmor.block;

import com.forsize.CBCCompleteStealArmor.CBCCompleteStealArmor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.world.level.block.SoundType;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(CBCCompleteStealArmor.MOD_ID);

    private static DeferredBlock<Block> registerArmorBlock(
            String id,
            float hardness,
            float blastResistance
    ) {
        return BLOCKS.registerBlock(
                id,
                properties -> new Block(
                        BlockBehaviour.Properties.ofFullCopy(Blocks.IRON_BLOCK)
                                .strength(hardness, blastResistance)
                                .sound(SoundType.NETHERITE_BLOCK)
                )
        );
    }

    // SA — Steel Armor: hardness 1.0, resistance 20.0
    public static final DeferredBlock<Block> SA_BLACK = registerArmorBlock("sa_black", 3.0F, 19.0F);
    public static final DeferredBlock<Block> SA_GRAY = registerArmorBlock("sa_gray", 3.0F, 19.0F);
    public static final DeferredBlock<Block> SA_GREEN = registerArmorBlock("sa_green", 3.0F, 19.0F);
    public static final DeferredBlock<Block> SA_SAND = registerArmorBlock("sa_sand", 3.0F, 19.0F);
    public static final DeferredBlock<Block> SA_STEEL = registerArmorBlock("sa_steel", 3.0F, 19.0F);

    // CA — Composite Armor: hardness 1.5, resistance 28.0
    public static final DeferredBlock<Block> CA_BLACK = registerArmorBlock("ca_black", 2.8F, 22.0F);
    public static final DeferredBlock<Block> CA_GRAY = registerArmorBlock("ca_gray", 2.8F, 22.0F);
    public static final DeferredBlock<Block> CA_GREEN = registerArmorBlock("ca_green", 2.8F, 22.0F);
    public static final DeferredBlock<Block> CA_SAND = registerArmorBlock("ca_sand", 2.8F, 22.0F);
    public static final DeferredBlock<Block> CA_STEEL = registerArmorBlock("ca_steel", 2.8F, 22.0F);

    // CSA — Composite-Steel Armor: hardness 2.0, resistance 34.0
    public static final DeferredBlock<Block> CSA_BLACK = registerArmorBlock("csa_black", 2.4F, 26.0F);
    public static final DeferredBlock<Block> CSA_GRAY = registerArmorBlock("csa_gray", 2.4F, 26.0F);
    public static final DeferredBlock<Block> CSA_GREEN = registerArmorBlock("csa_green", 2.4F, 26.0F);
    public static final DeferredBlock<Block> CSA_SAND = registerArmorBlock("csa_sand", 2.4F, 26.0F);
    public static final DeferredBlock<Block> CSA_STEEL = registerArmorBlock("csa_steel", 2.4F, 26.0F);

    // NSA — Nether-Steel Armor: hardness 3.0, resistance 42.0
    public static final DeferredBlock<Block> NSA_BLACK = registerArmorBlock("nsa_black", 1.8F, 30.0F);
    public static final DeferredBlock<Block> NSA_GRAY = registerArmorBlock("nsa_gray", 1.8F, 30.0F);
    public static final DeferredBlock<Block> NSA_GREEN = registerArmorBlock("nsa_green", 1.8F, 30.0F);
    public static final DeferredBlock<Block> NSA_SAND = registerArmorBlock("nsa_sand", 1.8F, 30.0F);
    public static final DeferredBlock<Block> NSA_STEEL = registerArmorBlock("nsa_steel", 1.8F, 30.0F);

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}