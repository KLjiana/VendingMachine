package com.kljiana.vendingmachine.item.coin;

public class CopperCoinItem extends AbstractCoinItem {
    public CopperCoinItem() {
        super();
    }

    @Override
    public int money() {
        return 1;
    }
}
