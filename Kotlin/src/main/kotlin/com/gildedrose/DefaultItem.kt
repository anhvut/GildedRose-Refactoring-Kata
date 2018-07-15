package com.gildedrose

class DefaultItem(override val name: String, override var sellIn: Int, override var quality: Int) : Item(name, sellIn, quality) {

    override fun updateQuality() {
        decreaseQuality()
    }

    override fun updateSellIn() {
        decreaseSellIn()
    }

    override fun updateQualityWhenExpired() {
        decreaseQuality()
    }
}