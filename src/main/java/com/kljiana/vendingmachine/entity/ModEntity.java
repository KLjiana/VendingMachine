package com.kljiana.vendingmachine.entity;

import com.kljiana.vendingmachine.block.ModBlocks;
import com.kljiana.vendingmachine.block.machine.MachineBlock;
import com.kljiana.vendingmachine.entity.block.VendingMachine;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.kljiana.vendingmachine.VendingMachine.ModID;

public class ModEntity {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, ModID);

    public static final RegistryObject<BlockEntityType<VendingMachine>> VENDING_MACHINE_BLOCK_ENTITY = BLOCK_ENTITIES.register("my_block_entity",
            () -> BlockEntityType.Builder.of(VendingMachine::new, ModBlocks.VENDING_MACHINE.get()).build(null)
    );

    public static void register(IEventBus bus) {
        BLOCK_ENTITIES.register(bus);
    }
}
