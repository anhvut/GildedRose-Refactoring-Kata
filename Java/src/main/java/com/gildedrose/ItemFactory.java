package com.gildedrose;

public class ItemFactory {

    public static Item createItem(String name, int sellIn, int quality) {
        if ("Aged Brie".equals(name)) {
            return new AgedBrieItem(name, sellIn, quality);
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(name)) {
            return new BackstageItem(name, sellIn, quality);
        } else if ("Sulfuras, Hand of Ragnaros".equals(name)) {
            return new SulfurasItem(name, sellIn, quality);
        }
        return new DefaultItem(name, sellIn, quality);
    }
}
