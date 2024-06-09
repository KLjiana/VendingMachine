package com.kljiana.vendingmachine;

import com.kljiana.vendingmachine.block.ModBlocks;
import com.kljiana.vendingmachine.item.ModItems;
import com.kljiana.vendingmachine.item.ModTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(VendingMachine.ModID)
public class VendingMachine {
    public static final String ModID = "vending_machine";
    private static final Logger LOGGER = LoggerFactory.getLogger("Vending Machine");

    public VendingMachine() {
        IEventBus bus =FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModTabs.TABS.register(bus);
    }
}
