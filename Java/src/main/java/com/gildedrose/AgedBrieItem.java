package com.gildedrose;

public class AgedBrieItem extends Item {

    public AgedBrieItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQualityBeforeSellIn() {
        increaseQualityIfBelow50();
    }

    @Override
    protected void updateSellIn() {
        decreaseSellIn();
    }

    @Override
    protected void updateQualityAfterSellIn() {
        if (sellIn < 0) {
            increaseQualityIfBelow50();
        }
    }
}
