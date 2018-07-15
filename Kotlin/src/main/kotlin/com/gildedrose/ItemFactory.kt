package com.gildedrose

fun createItem(name: String, sellIn: Int, quality: Int): Item {
    return when (name) {
        "Aged Brie" -> AgedBrieItem(name, sellIn, quality)
        "Backstage passes to a TAFKAL80ETC concert" -> BackstageItem(name, sellIn, quality)
        "Sulfuras, Hand of Ragnaros" -> SulfurasItem(name, sellIn, quality)
        else -> DefaultItem(name, sellIn, quality)
    }
}