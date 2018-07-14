package com.gildedrose;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    protected Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItem() {
        updateQualityBeforeSellIn();
        updateSellIn();
        updateQualityAfterSellIn();
    }

    abstract protected void updateQualityBeforeSellIn();

    abstract protected void updateSellIn();

    abstract protected void updateQualityAfterSellIn();

    protected void dropQuality() {
        quality = 0;
    }

    protected void decreaseSellIn() {
        sellIn = sellIn - 1;
    }

    protected void decreaseQualityIfAbove0() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }

    protected void increaseQualityIfBelow50() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
