package com.gildedrose;

public class Item {

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void updateItem() {
        if ("Aged Brie".equals(name)) {
            increaseQualityIfBelow50();
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            increaseQualityIfBelow50();

            if (sellIn < 11) {
                increaseQualityIfBelow50();
            }

            if (sellIn < 6) {
                increaseQualityIfBelow50();
            }
        } else if ("Sulfuras, Hand of Ragnaros".equals(name)) {
        } else {
            if (quality > 0) {
                quality = quality - 1;
            }
        }

        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
        } else {
            sellIn = sellIn - 1;
        }

        if ("Aged Brie".equals(name)) {
            if (sellIn < 0) {
                increaseQualityIfBelow50();
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            if (sellIn < 0) {
                quality = quality - quality;
            }
        } else if ("Sulfuras, Hand of Ragnaros".equals(name)) {
        } else {
            if (sellIn < 0) {
                if (quality > 0) {
                    quality = quality - 1;
                }
            }
        }
    }

    private void increaseQualityIfBelow50() {
        if (quality < 50) {
            quality = quality + 1;
        }
    }
}
