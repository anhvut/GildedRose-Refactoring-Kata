package com.gildedrose

class SulfurasItem(override val name: String, override var sellIn: Int, override var quality: Int) : Item(name, sellIn, quality) {

    override fun updateQuality() {
    }

    override fun updateSellIn() {
    }

    override fun updateQualityWhenExpired() {
    }
}