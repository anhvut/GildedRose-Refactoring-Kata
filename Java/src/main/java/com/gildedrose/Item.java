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
            if (quality < 50) {
                quality = quality + 1;
            }
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            if (quality < 50) {
                quality = quality + 1;
            }

            if (sellIn < 11) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }

            if (sellIn < 6) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            }
        } else {
            if (quality > 0) {
                if ("Sulfuras, Hand of Ragnaros".equals(name)) {
                } else {
                    quality = quality - 1;
                }
            }
        }

        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
        } else {
            sellIn = sellIn - 1;
        }

        if (sellIn < 0) {
            if ("Aged Brie".equals(name)) {
                if (quality < 50) {
                    quality = quality + 1;
                }
            } else {
                if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
                    quality = quality - quality;
                } else {
                    if (quality > 0) {
                        if ("Sulfuras, Hand of Ragnaros".equals(name)) {
                            return;
                        }
                        quality = quality - 1;
                    }
                }
            }
        }
    }
}
