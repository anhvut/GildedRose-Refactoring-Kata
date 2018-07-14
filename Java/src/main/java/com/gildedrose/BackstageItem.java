package com.gildedrose;

public class BackstageItem extends Item {

    public BackstageItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQualityBeforeSellIn() {
        increaseQualityIfBelow50();

        if (sellIn < 11) {
            increaseQualityIfBelow50();
        }

        if (sellIn < 6) {
            increaseQualityIfBelow50();
        }
    }

    protected void updateSellIn() {
        decreaseSellIn();
    }

    protected void updateQualityAfterSellIn() {
        if (sellIn < 0) {
            dropQuality();
        }
    }
}
