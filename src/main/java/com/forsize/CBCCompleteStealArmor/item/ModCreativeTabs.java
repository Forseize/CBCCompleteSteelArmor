package com.forsize.CBCCompleteStealArmor.item;

import com.forsize.CBCCompleteStealArmor.CBCCompleteStealArmor;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CBCCompleteStealArmor.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MAIN_TAB =
            CREATIVE_MODE_TABS.register(
                    "main",
                    () -> CreativeModeTab.builder()
                            .title(Component.translatable("creativetab.cbccompletestealarmor.main"))
                            .icon(() -> new ItemStack(ModItems.NSA_STEEL.get()))
                            .displayItems((parameters, output) -> {
                                output.accept(ModItems.SA_BLACK);
                                output.accept(ModItems.SA_GRAY);
                                output.accept(ModItems.SA_GREEN);
                                output.accept(ModItems.SA_SAND);
                                output.accept(ModItems.SA_STEEL);

                                output.accept(ModItems.CA_BLACK);
                                output.accept(ModItems.CA_GRAY);
                                output.accept(ModItems.CA_GREEN);
                                output.accept(ModItems.CA_SAND);
                                output.accept(ModItems.CA_STEEL);

                                output.accept(ModItems.CSA_BLACK);
                                output.accept(ModItems.CSA_GRAY);
                                output.accept(ModItems.CSA_GREEN);
                                output.accept(ModItems.CSA_SAND);
                                output.accept(ModItems.CSA_STEEL);

                                output.accept(ModItems.NSA_BLACK);
                                output.accept(ModItems.NSA_GRAY);
                                output.accept(ModItems.NSA_GREEN);
                                output.accept(ModItems.NSA_SAND);
                                output.accept(ModItems.NSA_STEEL);
                            })
                            .build()
            );

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}