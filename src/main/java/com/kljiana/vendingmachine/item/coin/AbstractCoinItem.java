package com.kljiana.vendingmachine.item.coin;

import net.minecraft.world.item.Item;

public abstract class AbstractCoinItem extends Item {
    public AbstractCoinItem(Properties pProperties) {
        super(pProperties);
    }

    public AbstractCoinItem() {
        this(new Properties());
    }

    public abstract int money();
}
