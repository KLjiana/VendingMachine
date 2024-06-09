package com.kljiana.vendingmachine.item;

import com.kljiana.vendingmachine.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static com.kljiana.vendingmachine.VendingMachine.ModID;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ModID);
    // 工具
    public static final RegistryObject<CreativeModeTab> VENDING_MACHINE = TABS.register("vending_machine",
            () -> CreativeModeTab
                    .builder()
                    .title(Component.translatable("creativetab.vending_machine.vending_machine"))
                    .icon(() -> new ItemStack(ModBlocks.VENDING_MACHINE.get()))
                    .displayItems((parameters, output)->{
                        output.accept(ModItems.COPPER_COIN.get());
                        output.accept(ModItems.SILVER_COIN.get());
                        output.accept(ModItems.GOLD_COIN.get());
                        output.accept(ModBlocks.VENDING_MACHINE.get());
                    })
                    .build()
    );
}
