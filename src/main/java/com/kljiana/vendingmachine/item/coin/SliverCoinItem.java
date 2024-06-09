package com.kljiana.vendingmachine.item.coin;

public class SliverCoinItem extends AbstractCoinItem {
    public SliverCoinItem() {
        super();
    }

    @Override
    public int money() {
        return 10;
    }
}