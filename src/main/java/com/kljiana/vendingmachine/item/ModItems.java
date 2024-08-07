package com.kljiana.vendingmachine.item;

import com.kljiana.vendingmachine.item.coin.CopperCoinItem;
import com.kljiana.vendingmachine.item.coin.GoldCoinItem;
import com.kljiana.vendingmachine.item.coin.SliverCoinItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static com.kljiana.vendingmachine.VendingMachine.ModID;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModID);

    public static final RegistryObject<Item> COPPER_COIN = ITEMS.register("copper_coin", CopperCoinItem::new);
    public static final RegistryObject<Item> SILVER_COIN = ITEMS.register("silver_coin", SliverCoinItem::new);
    public static final RegistryObject<Item> GOLD_COIN = ITEMS.register("gold_coin", GoldCoinItem::new);
}
