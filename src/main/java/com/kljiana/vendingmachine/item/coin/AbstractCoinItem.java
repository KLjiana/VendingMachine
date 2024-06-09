package com.kljiana.vendingmachine.item.coin;

import net.minecraft.world.item.Item;

public abstract class AbstractCoin extends Item {
    public AbstractCoin(Properties pProperties) {
        super(pProperties);
    }

    public abstract int money();
}
