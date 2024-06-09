package com.kljiana.vendingmachine.item.coin;

public class CopperCoin extends AbstractCoin{
    public CopperCoin(Properties pProperties) {
        super(pProperties.fireResistant());
    }

    @Override
    public int money() {
        return 10;
    }
}
