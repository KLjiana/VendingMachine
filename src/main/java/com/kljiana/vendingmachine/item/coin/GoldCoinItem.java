package com.kljiana.vendingmachine.item.coin;

public class GoldCoinItem extends AbstractCoinItem {
    public GoldCoinItem() {
        super();
    }

    @Override
    public int money() {
        return 100;
    }
}
