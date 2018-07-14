package com.gildedrose;

public class DefaultItem extends Item {

    public DefaultItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQualityBeforeSellIn() {
        decreaseQualityIfAbove0();
    }

    @Override
    protected void updateSellIn() {
        decreaseSellIn();
    }

    @Override
    protected void updateQualityAfterSellIn() {
        if (sellIn < 0) {
            decreaseQualityIfAbove0();
        }
    }
}
