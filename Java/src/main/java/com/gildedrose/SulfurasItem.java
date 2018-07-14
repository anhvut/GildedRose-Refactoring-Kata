package com.gildedrose;

public class SulfurasItem extends Item {

    public SulfurasItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    protected void updateQualityBeforeSellIn() {
        // do nothing
    }

    @Override
    protected void updateSellIn() {
        // do nothing
    }

    @Override
    protected void updateQualityAfterSellIn() {
        // do nothing
    }
}
