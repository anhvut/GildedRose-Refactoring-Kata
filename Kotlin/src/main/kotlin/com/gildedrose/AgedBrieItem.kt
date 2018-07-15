package com.gildedrose

class AgedBrieItem(override val name: String, override var sellIn: Int, override var quality: Int) : Item(name, sellIn, quality) {

    override fun updateQuality() {
        increaseQuality()
    }

    override fun updateSellIn() {
        decreaseSellIn()
    }

    override fun updateQualityWhenExpired() {
        increaseQuality()
    }
}