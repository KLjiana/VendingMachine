package com.kljiana.vendingmachine.block;

import com.kljiana.vendingmachine.block.machine.MachineBlock;
import com.kljiana.vendingmachine.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import static com.kljiana.vendingmachine.VendingMachine.ModID;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ModID);

    public static final RegistryObject<MachineBlock> VENDING_MACHINE = registerWithItem("vending_machine", MachineBlock::new);

    public static <B extends Block> RegistryObject<B> registerWithItem(String id, Supplier<B> block) {
        return registerWithItem(id, block, new Item.Properties());
    }

    public static <B extends Block> RegistryObject<B> registerWithItem(String id, Supplier<B> block, Item.Properties properties) {
        RegistryObject<B> object = BLOCKS.register(id, block);
        ModItems.ITEMS.register(id, () -> new BlockItem(object.get(), properties));
        return object;
    }
}
